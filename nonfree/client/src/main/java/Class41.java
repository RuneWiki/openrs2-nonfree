import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!u")
public final class Class41 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "B")
	private byte aByte50 = 22;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "I")
	private int anInt960 = 404;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "[Lclient!v;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(BI)V")
	public Class41(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt961 = arg1;
			this.aClass1Array1 = new Class1[arg1];
			for (@Pc(25) int local25 = 0; local25 < arg1; local25++) {
				@Pc(35) Class1 local35 = this.aClass1Array1[local25] = new Class1();
				local35.aClass1_41 = local35;
				local35.aClass1_42 = local35;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("59240, " + arg0 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(J)Lclient!v;")
	public Class1 method612(@OriginalArg(0) long arg0) {
		@Pc(13) Class1 local13 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt961 - 1))];
		for (@Pc(16) Class1 local16 = local13.aClass1_41; local16 != local13; local16 = local16.aClass1_41) {
			if (local16.aLong30 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!v;J)V")
	public void method613(@OriginalArg(1) Class1 arg0, @OriginalArg(2) long arg1) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method635();
			}
			@Pc(16) Class1 local16 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt961 - 1))];
			arg0.aClass1_42 = local16.aClass1_42;
			arg0.aClass1_41 = local16;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
			arg0.aLong30 = arg1;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("51967, " + -928 + ", " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}
}

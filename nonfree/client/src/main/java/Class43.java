import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class43 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "[Lclient!u;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt961 = arg1;
			this.aClass1Array1 = new Class1[arg1];
			for (@Pc(20) int local20 = 0; local20 < arg1; local20++) {
				@Pc(30) Class1 local30 = this.aClass1Array1[local20] = new Class1();
				local30.aClass1_41 = local30;
				local30.aClass1_42 = local30;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("99380, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!u;")
	public Class1 method632(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt961 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong33 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(JILclient!u;)V")
	public void method633(@OriginalArg(0) long arg0, @OriginalArg(2) Class1 arg1) {
		try {
			if (arg1.aClass1_42 != null) {
				arg1.method673();
			}
			@Pc(16) Class1 local16 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt961 - 1))];
			arg1.aClass1_42 = local16.aClass1_42;
			arg1.aClass1_41 = local16;
			arg1.aClass1_42.aClass1_41 = arg1;
			arg1.aClass1_41.aClass1_42 = arg1;
			arg1.aLong33 = arg0;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("47206, " + arg0 + ", " + 7 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class43 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Z")
	private boolean aBoolean228 = true;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "[Lclient!u;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(BI)V")
	public Class43(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt939 = arg1;
			this.aClass1Array1 = new Class1[arg1];
			for (@Pc(20) int local20 = 0; local20 < arg1; local20++) {
				@Pc(30) Class1 local30 = this.aClass1Array1[local20] = new Class1();
				local30.aClass1_41 = local30;
				local30.aClass1_42 = local30;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("44278, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!u;")
	public Class1 method632(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt939 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong33 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!u;JI)V")
	public void method633(@OriginalArg(0) Class1 arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method673();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt939 - 1))];
			arg0.aClass1_42 = local18.aClass1_42;
			arg0.aClass1_41 = local18;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
			arg0.aLong33 = arg1;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("91044, " + arg0 + ", " + arg1 + ", " + 32735 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!u")
public final class Class41 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Z")
	private boolean aBoolean185 = false;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "I")
	private int anInt958 = 7;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Z")
	private boolean aBoolean186 = true;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "[Lclient!v;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(II)V")
	public Class41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt959 = arg0;
			this.aClass1Array1 = new Class1[arg0];
			for (@Pc(19) int local19 = 0; local19 < arg0; local19++) {
				@Pc(29) Class1 local29 = this.aClass1Array1[local19] = new Class1();
				local29.aClass1_41 = local29;
				local29.aClass1_42 = local29;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("39996, " + arg0 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(J)Lclient!v;")
	public Class1 method611(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt959 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong29 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IJLclient!v;)V")
	public void method612(@OriginalArg(1) long arg0, @OriginalArg(2) Class1 arg1) {
		try {
			if (arg1.aClass1_42 != null) {
				arg1.method630();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt959 - 1))];
			arg1.aClass1_42 = local18.aClass1_42;
			arg1.aClass1_41 = local18;
			arg1.aClass1_42.aClass1_41 = arg1;
			arg1.aClass1_41.aClass1_42 = arg1;
			arg1.aLong29 = arg0;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("45730, " + -12119 + ", " + arg0 + ", " + arg1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class110 {

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "Lclient!kh;")
	private Class1_Sub3 aClass1_Sub3_42;

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "J")
	private long aLong136;

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "[Lclient!kh;")
	private Class1_Sub3[] aClass1_Sub3Array1;

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
	private int anInt3890;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(I)V")
	public Class110(@OriginalArg(0) int arg0) {
		this.aClass1_Sub3Array1 = new Class1_Sub3[arg0];
		this.anInt3890 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(26) Class1_Sub3 local26 = this.aClass1_Sub3Array1[local10] = new Class1_Sub3();
			local26.aClass1_Sub3_74 = local26;
			local26.aClass1_Sub3_75 = local26;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IJ)Lclient!kh;")
	public Class1_Sub3 method2814(@OriginalArg(1) long arg0) {
		this.aLong136 = arg0;
		@Pc(25) Class1_Sub3 local25 = this.aClass1_Sub3Array1[(int) (arg0 & (long) (this.anInt3890 - 1))];
		for (this.aClass1_Sub3_42 = local25.aClass1_Sub3_74; this.aClass1_Sub3_42 != local25; this.aClass1_Sub3_42 = this.aClass1_Sub3_42.aClass1_Sub3_74) {
			if (this.aClass1_Sub3_42.aLong237 == arg0) {
				@Pc(47) Class1_Sub3 local47 = this.aClass1_Sub3_42;
				this.aClass1_Sub3_42 = this.aClass1_Sub3_42.aClass1_Sub3_74;
				return local47;
			}
		}
		this.aClass1_Sub3_42 = null;
		return null;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(JILclient!kh;)V")
	public void method2817(@OriginalArg(0) long arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg1.aClass1_Sub3_75 != null) {
			arg1.method4652();
		}
		@Pc(22) Class1_Sub3 local22 = this.aClass1_Sub3Array1[(int) (arg0 & (long) (this.anInt3890 - 1))];
		arg1.aLong237 = arg0;
		arg1.aClass1_Sub3_75 = local22.aClass1_Sub3_75;
		arg1.aClass1_Sub3_74 = local22;
		arg1.aClass1_Sub3_75.aClass1_Sub3_74 = arg1;
		arg1.aClass1_Sub3_74.aClass1_Sub3_75 = arg1;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)Lclient!kh;")
	public Class1_Sub3 method2822() {
		if (this.aClass1_Sub3_42 == null) {
			return null;
		}
		@Pc(31) Class1_Sub3 local31 = this.aClass1_Sub3Array1[(int) ((long) (this.anInt3890 - 1) & this.aLong136)];
		while (this.aClass1_Sub3_42 != local31) {
			if (this.aLong136 == this.aClass1_Sub3_42.aLong237) {
				@Pc(49) Class1_Sub3 local49 = this.aClass1_Sub3_42;
				this.aClass1_Sub3_42 = this.aClass1_Sub3_42.aClass1_Sub3_74;
				return local49;
			}
			this.aClass1_Sub3_42 = this.aClass1_Sub3_42.aClass1_Sub3_74;
		}
		this.aClass1_Sub3_42 = null;
		return null;
	}
}

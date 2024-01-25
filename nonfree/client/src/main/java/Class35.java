import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class35 {

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "Lclient!cm;")
	private Class3_Sub3 aClass3_Sub3_17;

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "J")
	private long aLong39;

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
	private final int anInt1069;

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "[Lclient!cm;")
	private final Class3_Sub3[] aClass3_Sub3Array1;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V")
	public Class35(@OriginalArg(0) int arg0) {
		this.anInt1069 = arg0;
		this.aClass3_Sub3Array1 = new Class3_Sub3[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class3_Sub3 local20 = this.aClass3_Sub3Array1[local10] = new Class3_Sub3();
			local20.aClass3_Sub3_62 = local20;
			local20.aClass3_Sub3_61 = local20;
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BJ)Lclient!cm;")
	public Class3_Sub3 method824(@OriginalArg(1) long arg0) {
		this.aLong39 = arg0;
		@Pc(25) Class3_Sub3 local25 = this.aClass3_Sub3Array1[(int) ((long) (this.anInt1069 - 1) & arg0)];
		for (this.aClass3_Sub3_17 = local25.aClass3_Sub3_61; this.aClass3_Sub3_17 != local25; this.aClass3_Sub3_17 = this.aClass3_Sub3_17.aClass3_Sub3_61) {
			if (this.aClass3_Sub3_17.aLong265 == arg0) {
				@Pc(44) Class3_Sub3 local44 = this.aClass3_Sub3_17;
				this.aClass3_Sub3_17 = this.aClass3_Sub3_17.aClass3_Sub3_61;
				return local44;
			}
		}
		this.aClass3_Sub3_17 = null;
		return null;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)Lclient!cm;")
	public Class3_Sub3 method827() {
		if (this.aClass3_Sub3_17 == null) {
			return null;
		}
		@Pc(29) Class3_Sub3 local29 = this.aClass3_Sub3Array1[(int) ((long) (this.anInt1069 - 1) & this.aLong39)];
		while (local29 != this.aClass3_Sub3_17) {
			if (this.aLong39 == this.aClass3_Sub3_17.aLong265) {
				@Pc(41) Class3_Sub3 local41 = this.aClass3_Sub3_17;
				this.aClass3_Sub3_17 = this.aClass3_Sub3_17.aClass3_Sub3_61;
				return local41;
			}
			this.aClass3_Sub3_17 = this.aClass3_Sub3_17.aClass3_Sub3_61;
		}
		this.aClass3_Sub3_17 = null;
		return null;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IJLclient!cm;)V")
	public void method829(@OriginalArg(1) long arg0, @OriginalArg(2) Class3_Sub3 arg1) {
		if (arg1.aClass3_Sub3_62 != null) {
			arg1.method7720();
		}
		@Pc(26) Class3_Sub3 local26 = this.aClass3_Sub3Array1[(int) ((long) (this.anInt1069 - 1) & arg0)];
		arg1.aClass3_Sub3_61 = local26;
		arg1.aClass3_Sub3_62 = local26.aClass3_Sub3_62;
		arg1.aClass3_Sub3_62.aClass3_Sub3_61 = arg1;
		arg1.aClass3_Sub3_61.aClass3_Sub3_62 = arg1;
		arg1.aLong265 = arg0;
	}
}

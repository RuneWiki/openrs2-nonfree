import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class247 {

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "Lclient!gj;")
	private Class3_Sub5 aClass3_Sub5_48;

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "J")
	private long aLong182;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "[Lclient!gj;")
	private final Class3_Sub5[] aClass3_Sub5Array1;

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
	private final int anInt6561;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(I)V")
	public Class247(@OriginalArg(0) int arg0) {
		this.aClass3_Sub5Array1 = new Class3_Sub5[arg0];
		this.anInt6561 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class3_Sub5 local20 = this.aClass3_Sub5Array1[local10] = new Class3_Sub5();
			local20.aClass3_Sub5_66 = local20;
			local20.aClass3_Sub5_67 = local20;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)Lclient!gj;")
	public Class3_Sub5 method5508() {
		if (this.aClass3_Sub5_48 == null) {
			return null;
		}
		@Pc(28) Class3_Sub5 local28 = this.aClass3_Sub5Array1[(int) ((long) (this.anInt6561 - 1) & this.aLong182)];
		while (local28 != this.aClass3_Sub5_48) {
			if (this.aClass3_Sub5_48.aLong312 == this.aLong182) {
				@Pc(40) Class3_Sub5 local40 = this.aClass3_Sub5_48;
				this.aClass3_Sub5_48 = this.aClass3_Sub5_48.aClass3_Sub5_66;
				return local40;
			}
			this.aClass3_Sub5_48 = this.aClass3_Sub5_48.aClass3_Sub5_66;
		}
		this.aClass3_Sub5_48 = null;
		return null;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BJ)Lclient!gj;")
	public Class3_Sub5 method5510(@OriginalArg(1) long arg0) {
		this.aLong182 = arg0;
		@Pc(26) Class3_Sub5 local26 = this.aClass3_Sub5Array1[(int) (arg0 & (long) (this.anInt6561 - 1))];
		for (this.aClass3_Sub5_48 = local26.aClass3_Sub5_66; this.aClass3_Sub5_48 != local26; this.aClass3_Sub5_48 = this.aClass3_Sub5_48.aClass3_Sub5_66) {
			if (arg0 == this.aClass3_Sub5_48.aLong312) {
				@Pc(45) Class3_Sub5 local45 = this.aClass3_Sub5_48;
				this.aClass3_Sub5_48 = this.aClass3_Sub5_48.aClass3_Sub5_66;
				return local45;
			}
		}
		this.aClass3_Sub5_48 = null;
		return null;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(JILclient!gj;)V")
	public void method5512(@OriginalArg(0) long arg0, @OriginalArg(2) Class3_Sub5 arg1) {
		if (arg1.aClass3_Sub5_67 != null) {
			arg1.method9014();
		}
		@Pc(21) Class3_Sub5 local21 = this.aClass3_Sub5Array1[(int) (arg0 & (long) (this.anInt6561 - 1))];
		arg1.aClass3_Sub5_66 = local21;
		arg1.aClass3_Sub5_67 = local21.aClass3_Sub5_67;
		arg1.aClass3_Sub5_67.aClass3_Sub5_66 = arg1;
		arg1.aClass3_Sub5_66.aClass3_Sub5_67 = arg1;
		arg1.aLong312 = arg0;
	}
}

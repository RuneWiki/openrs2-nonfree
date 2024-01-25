import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class2_Sub3_Sub3 extends Class2_Sub3 implements Interface22 {

	@OriginalMember(owner = "client!ua", name = "F", descriptor = "Lclient!cd;")
	private Class44 aClass44_8;

	@OriginalMember(owner = "client!ua", name = "x", descriptor = "Lclient!mda;")
	public final Class210 aClass210_4;

	@OriginalMember(owner = "client!ua", name = "D", descriptor = "Z")
	private final boolean aBoolean792;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!oa;Lclient!sa;IIIIIZIIIIII)V")
	public Class2_Sub3_Sub3(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static594.method8381(arg12, arg11));
		this.aClass210_4 = new Class210(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean792 = arg1.anInt8778 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		@Pc(16) Class21 local16 = this.aClass210_4.method5524(arg2, super.anInt9486, false, 131072, false, super.anInt9494);
		if (local16 == null) {
			return false;
		} else {
			@Pc(31) Class255 local31 = arg2.method5343();
			local31.GA(super.anInt9494 + super.anInt9489, super.anInt9487, super.anInt9497 + super.anInt9486);
			return local16.method7148(arg1, arg0, local31, false);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!oa;B)Lclient!pl;")
	@Override
	public Class55_Sub6 method8382(@OriginalArg(0) Class15 arg0) {
		@Pc(18) Class21 local18 = this.aClass210_4.method5524(arg0, super.anInt9486, true, 2048, false, super.anInt9494);
		if (local18 == null) {
			return null;
		}
		@Pc(33) Class255 local33 = arg0.method5343();
		local33.GA(super.anInt9494 + super.anInt9489, super.anInt9487, super.anInt9497 + super.anInt9486);
		@Pc(49) Class55_Sub6 local49 = null;
		if (this.aBoolean792) {
			local49 = Static232.method3979(1);
		}
		@Pc(61) int local61 = super.anInt9494 >> 9;
		@Pc(66) int local66 = super.anInt9486 >> 9;
		this.aClass210_4.method5518(local66, arg0, local61, local33, local66, true, local18, local61);
		if (this.aClass210_4.aClass55_Sub8_4 == null) {
			local18.method7145(local33, local49 == null ? null : local49.aClass55_Sub3Array1[0], 0);
		} else {
			@Pc(101) Class274 local101 = this.aClass210_4.aClass55_Sub8_4.method7127();
			arg0.method5309(local18, local101, local33, local49 == null ? null : local49.aClass55_Sub3Array1[0], 0);
		}
		if (this.aClass44_8 == null) {
			this.aClass44_8 = Static5.method275(super.anInt9487, local18, super.anInt9494, super.anInt9486);
		} else {
			Static516.method3267(super.anInt9486, this.aClass44_8, super.anInt9494, local18, super.anInt9487);
		}
		return local49;
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)I")
	@Override
	public int method7700() {
		return this.aClass210_4.method5526();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8396(@OriginalArg(0) Class15 arg0) {
		this.aClass210_4.method5522(arg0);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	@Override
	public void method8395() {
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)I")
	@Override
	public int method8402() {
		return this.aClass210_4.anInt6583;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8384(@OriginalArg(0) Class15 arg0) {
		@Pc(16) Class21 local16 = this.aClass210_4.method5524(arg0, super.anInt9486, true, 262144, false, super.anInt9494);
		if (local16 == null) {
			return;
		}
		@Pc(30) int local30 = super.anInt9494 >> 9;
		@Pc(35) int local35 = super.anInt9486 >> 9;
		@Pc(38) Class255 local38 = arg0.method5343();
		local38.GA(super.anInt9494, super.anInt9487, super.anInt9486);
		this.aClass210_4.method5518(local35, arg0, local30, local38, local35, false, local16, local30);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8401() {
		return this.aClass210_4.method5517();
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8397(@OriginalArg(0) Class15 arg0) {
		this.aClass210_4.method5527(arg0);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!oa;II)Lclient!ba;")
	@Override
	public Class21 method8400(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		return this.aClass210_4.method5524(arg0, 0, false, arg1, false, 0);
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(Lclient!oa;I)Lclient!cd;")
	@Override
	public Class44 method8385(@OriginalArg(0) Class15 arg0) {
		return this.aClass44_8;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)I")
	@Override
	public int method8399() {
		return this.aClass210_4.anInt6595;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)I")
	@Override
	public int method8398() {
		return this.aClass210_4.anInt6581;
	}
}

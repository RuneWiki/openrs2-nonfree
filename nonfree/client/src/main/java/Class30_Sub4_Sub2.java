import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class30_Sub4_Sub2 extends Class30_Sub4 implements Interface19 {

	@OriginalMember(owner = "client!rca", name = "A", descriptor = "Lclient!nk;")
	private Class218 aClass218_4;

	@OriginalMember(owner = "client!rca", name = "B", descriptor = "Lclient!wc;")
	public final Class311 aClass311_3;

	@OriginalMember(owner = "client!rca", name = "C", descriptor = "Z")
	private final boolean aBoolean547;

	static {
		new Class88("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	}

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lclient!qa;Lclient!ss;IIIIIZIIIIII)V")
	public Class30_Sub4_Sub2(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static467.method7014(arg11, arg12));
		this.aClass311_3 = new Class311(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean547 = arg1.anInt8276 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)I")
	@Override
	public int method7919() {
		return this.aClass311_3.anInt9488;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ZLclient!qa;)Lclient!nk;")
	@Override
	public Class218 method7906(@OriginalArg(1) Class42 arg0) {
		return this.aClass218_4;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Z)I")
	@Override
	public int method7915() {
		return this.aClass311_3.anInt9484;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7916(@OriginalArg(1) Class42 arg0) {
		this.aClass311_3.method7861(arg0);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7921(@OriginalArg(1) Class42 arg0) {
		this.aClass311_3.method7851(arg0);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method7907(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(21) Class26 local21 = this.aClass311_3.method7859(super.anInt9546, 131072, false, arg0, super.anInt9550, false);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class91 local28 = arg0.method5847();
			local28.oa(super.anInt9545 + super.anInt9546, super.anInt9553, super.anInt9551 + super.anInt9550);
			return local21.method8005(arg1, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7920() {
		return this.aClass311_3.method7860();
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V")
	@Override
	public void method7914() {
	}

	@OriginalMember(owner = "client!rca", name = "g", descriptor = "(I)I")
	@Override
	public int method7910() {
		return this.aClass311_3.method7856();
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(ZLclient!qa;)Lclient!vw;")
	@Override
	public Class7_Sub8 method7908(@OriginalArg(1) Class42 arg0) {
		@Pc(18) Class26 local18 = this.aClass311_3.method7859(super.anInt9546, 2048, true, arg0, super.anInt9550, false);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class91 local25 = arg0.method5847();
		local25.oa(super.anInt9546 + super.anInt9545, super.anInt9553, super.anInt9551 + super.anInt9550);
		@Pc(41) Class7_Sub8 local41 = null;
		if (this.aBoolean547) {
			local41 = Static196.method3703(1);
		}
		if (this.aClass311_3.aClass7_Sub3_7 == null) {
			local18.method8003(local25, local41 == null ? null : local41.aClass7_Sub4Array1[0], 0);
		} else {
			@Pc(57) Class136 local57 = this.aClass311_3.aClass7_Sub3_7.method4202();
			arg0.method5864(local18, local57, local25, local41 == null ? null : local41.aClass7_Sub4Array1[0]);
		}
		if (this.aClass218_4 == null) {
			this.aClass218_4 = Static368.method5722(super.anInt9553, local18, super.anInt9546, super.anInt9550);
		} else {
			Static261.method4419(local18, super.anInt9550, this.aClass218_4, super.anInt9546, super.anInt9553);
		}
		@Pc(117) int local117 = super.anInt9546 >> 7;
		@Pc(122) int local122 = super.anInt9550 >> 7;
		this.aClass311_3.method7850(local117, local122, local18, arg0, local122, true, local117);
		return local41;
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(Z)I")
	@Override
	public int method7918() {
		return this.aClass311_3.anInt9474;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7903(@OriginalArg(0) Class42 arg0) {
		@Pc(21) Class26 local21 = this.aClass311_3.method7859(super.anInt9546, 262144, true, arg0, super.anInt9550, false);
		if (local21 != null) {
			@Pc(28) int local28 = super.anInt9546 >> 7;
			@Pc(33) int local33 = super.anInt9550 >> 7;
			this.aClass311_3.method7850(local28, local33, local21, arg0, local33, false, local28);
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(BLclient!qa;I)Lclient!r;")
	@Override
	public Class26 method7917(@OriginalArg(1) Class42 arg0, @OriginalArg(2) int arg1) {
		return this.aClass311_3.method7859(0, arg1, false, arg0, 0, false);
	}
}

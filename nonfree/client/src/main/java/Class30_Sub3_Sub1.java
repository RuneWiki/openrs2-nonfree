import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class30_Sub3_Sub1 extends Class30_Sub3 implements Interface19 {

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Lclient!nk;")
	private Class218 aClass218_2;

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "Lclient!wc;")
	public final Class311 aClass311_1;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "Z")
	private final boolean aBoolean243;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!qa;Lclient!ss;IIIIIZII)V")
	public Class30_Sub3_Sub1(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt8278, arg1.aBoolean590, arg1.aBoolean582);
		this.aClass311_1 = new Class311(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean243 = arg1.anInt8276 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7920() {
		return this.aClass311_1.method7860();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7903(@OriginalArg(0) Class42 arg0) {
		@Pc(22) Class26 local22 = this.aClass311_1.method7859(super.anInt8893, 262144, true, arg0, super.anInt8892, true);
		if (local22 != null) {
			@Pc(29) int local29 = super.anInt8893 >> 7;
			@Pc(34) int local34 = super.anInt8892 >> 7;
			this.aClass311_1.method7850(local29, local34, local22, arg0, local34, false, local29);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7916(@OriginalArg(1) Class42 arg0) {
		this.aClass311_1.method7861(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	@Override
	public void method7914() {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7921(@OriginalArg(1) Class42 arg0) {
		this.aClass311_1.method7851(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)I")
	@Override
	public int method7918() {
		return this.aClass311_1.anInt9474;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(ZLclient!qa;)Lclient!vw;")
	@Override
	public Class7_Sub8 method7908(@OriginalArg(1) Class42 arg0) {
		@Pc(18) Class26 local18 = this.aClass311_1.method7859(super.anInt8893, 2048, true, arg0, super.anInt8892, false);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class91 local25 = arg0.method5847();
		local25.oa(super.anInt8893, super.anInt8895, super.anInt8892);
		@Pc(35) Class7_Sub8 local35 = null;
		if (this.aBoolean243) {
			local35 = Static196.method3703(1);
		}
		if (this.aClass311_1.aClass7_Sub3_7 == null) {
			local18.method8003(local25, local35 == null ? null : local35.aClass7_Sub4Array1[0], 0);
		} else {
			@Pc(65) Class136 local65 = this.aClass311_1.aClass7_Sub3_7.method4202();
			arg0.method5864(local18, local65, local25, local35 == null ? null : local35.aClass7_Sub4Array1[0]);
		}
		if (this.aClass218_2 == null) {
			this.aClass218_2 = Static368.method5722(super.anInt8895, local18, super.anInt8893, super.anInt8892);
		} else {
			Static261.method4419(local18, super.anInt8892, this.aClass218_2, super.anInt8893, super.anInt8895);
		}
		@Pc(111) int local111 = super.anInt8893 >> 7;
		@Pc(116) int local116 = super.anInt8892 >> 7;
		this.aClass311_1.method7850(local111, local116, local18, arg0, local116, true, local111);
		return local35;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLclient!qa;)Lclient!nk;")
	@Override
	public Class218 method7906(@OriginalArg(1) Class42 arg0) {
		return this.aClass218_2;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)I")
	@Override
	public int method7915() {
		return this.aClass311_1.anInt9484;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZIILclient!jt;ILclient!qa;)V")
	@Override
	public void method7904(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class30 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class42 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!qa;I)Lclient!r;")
	@Override
	public Class26 method7917(@OriginalArg(1) Class42 arg0, @OriginalArg(2) int arg1) {
		return this.aClass311_1.method7859(0, arg1, false, arg0, 0, false);
	}

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V")
	@Override
	public void method7909() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)I")
	@Override
	public int method7919() {
		return this.aClass311_1.anInt9488;
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7901() {
		return false;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method7907(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(25) Class26 local25 = this.aClass311_1.method7859(super.anInt8893, 131072, false, arg0, super.anInt8892, false);
		if (local25 == null) {
			return false;
		} else {
			@Pc(32) Class91 local32 = arg0.method5847();
			local32.oa(super.anInt8893, super.anInt8895, super.anInt8892);
			return local25.method8005(arg1, arg2, local32, false);
		}
	}
}

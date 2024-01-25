import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class29_Sub5_Sub3 extends Class29_Sub5 implements Interface6 {

	@OriginalMember(owner = "client!qm", name = "J", descriptor = "Lclient!vg;")
	private Class330 aClass330_6;

	@OriginalMember(owner = "client!qm", name = "B", descriptor = "Z")
	private final boolean aBoolean511;

	@OriginalMember(owner = "client!qm", name = "N", descriptor = "Z")
	private final boolean aBoolean513;

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "B")
	private final byte aByte76;

	@OriginalMember(owner = "client!qm", name = "r", descriptor = "B")
	private final byte aByte77;

	@OriginalMember(owner = "client!qm", name = "L", descriptor = "B")
	private final byte aByte78;

	@OriginalMember(owner = "client!qm", name = "K", descriptor = "Z")
	private boolean aBoolean512;

	@OriginalMember(owner = "client!qm", name = "x", descriptor = "S")
	private final short aShort97;

	@OriginalMember(owner = "client!qm", name = "O", descriptor = "Z")
	private final boolean aBoolean514;

	@OriginalMember(owner = "client!qm", name = "y", descriptor = "Lclient!ba;")
	public Class22 aClass22_5;

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "Lclient!w;")
	private Class6_Sub1_Sub12 aClass6_Sub1_Sub12_4;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!oa;Lclient!uca;IIIIZIIZ)V")
	public Class29_Sub5_Sub3(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class313 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static180.method7548(arg8, arg7));
		this.aBoolean511 = arg1.lb != 0 && !arg6;
		this.aBoolean513 = arg6;
		super.anInt7421 = arg5;
		this.aByte76 = (byte) arg2;
		this.aByte77 = (byte) arg7;
		this.aByte78 = (byte) arg8;
		this.aBoolean512 = arg9;
		super.anInt7423 = arg3;
		this.aShort97 = (short) arg1.anInt8480;
		this.aBoolean514 = arg0.method7126() && arg1.aBoolean582 && !this.aBoolean513 && Static480.aClass6_Sub37_Sub1_1.method5149(Static567.anInt9503) != 0;
		@Pc(74) int local74 = 2048;
		if (this.aBoolean512) {
			local74 |= 0x10000;
		}
		@Pc(89) Class300 local89 = this.method6167(local74, arg0, this.aBoolean514);
		if (local89 != null) {
			this.aClass22_5 = local89.aClass22_7;
			this.aClass6_Sub1_Sub12_4 = local89.aClass6_Sub1_Sub12_6;
			if (this.aBoolean512) {
				this.aClass22_5 = this.aClass22_5.method4699((byte) 0, local74, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)I")
	@Override
	public int method7555() {
		return this.aShort97 & 0xFFFF;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7544(@OriginalArg(1) Class121 arg0) {
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)I")
	@Override
	public int method7553() {
		return this.aByte78;
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7540() {
		return this.aBoolean512;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)I")
	@Override
	public int method7551() {
		return this.aByte77;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7556(@OriginalArg(1) Class121 arg0) {
		@Pc(37) Class6_Sub1_Sub12 local37;
		if (this.aClass6_Sub1_Sub12_4 == null && this.aBoolean514) {
			@Pc(30) Class300 local30 = this.method6167(262144, arg0, true);
			local37 = local30 == null ? null : local30.aClass6_Sub1_Sub12_6;
		} else {
			local37 = this.aClass6_Sub1_Sub12_4;
			this.aClass6_Sub1_Sub12_4 = null;
		}
		if (local37 != null) {
			Static128.method1938(local37, this.aByte76, super.anInt7423, super.anInt7421, null);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class22 method7557(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1) {
		return this.method6166(arg0, arg1);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!oa;B)Lclient!ba;")
	private Class22 method6166(@OriginalArg(0) int arg0, @OriginalArg(1) Class121 arg1) {
		if (this.aClass22_5 != null && arg1.method7150(this.aClass22_5.h(), arg0) == 0) {
			return this.aClass22_5;
		} else {
			@Pc(29) Class300 local29 = this.method6167(arg0, arg1, false);
			return local29 == null ? null : local29.aClass22_7;
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZLclient!oa;Z)Lclient!taa;")
	private Class300 method6167(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(20) Class313 local20 = Static260.aClass100_1.method2008(this.aShort97 & 0xFFFF);
		@Pc(32) Class60 local32;
		@Pc(27) Class60 local27;
		if (this.aBoolean513) {
			local27 = Static34.aClass60Array10[0];
			local32 = Static127.aClass60Array7[this.aByte76];
		} else {
			if (this.aByte76 >= 3) {
				local27 = null;
			} else {
				local27 = Static34.aClass60Array10[this.aByte76 + 1];
			}
			local32 = Static34.aClass60Array10[this.aByte76];
		}
		return local20.method6963(local32, this.aByte77, super.anInt7423, this.aByte78, arg1, super.anInt7421, arg2, super.anInt7422, local27, arg0);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIILclient!oa;)Z")
	@Override
	public boolean method7542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(14) Class22 local14 = this.method6166(131072, arg2);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class34 local19 = arg2.method7096();
			local19.GA(super.anInt7423, super.anInt7422, super.anInt7421);
			return local14.method4698(arg0, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(Z)V")
	@Override
	public void method7554() {
		if (this.aClass22_5 != null) {
			this.aClass22_5.method4706();
		}
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
	@Override
	public void method7537() {
		this.aBoolean512 = false;
		if (this.aClass22_5 != null) {
			this.aClass22_5.ia(this.aClass22_5.h() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!bo;ILclient!oa;IIIZ)V")
	@Override
	public void method7543(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg0 instanceof Class29_Sub5_Sub3) {
			@Pc(28) Class29_Sub5_Sub3 local28 = (Class29_Sub5_Sub3) arg0;
			if (this.aClass22_5 != null && local28.aClass22_5 != null) {
				this.aClass22_5.method4693(local28.aClass22_5, arg3, arg1, arg4, arg5);
			}
		} else if (arg0 instanceof Class29_Sub2_Sub3) {
			@Pc(8) Class29_Sub2_Sub3 local8 = (Class29_Sub2_Sub3) arg0;
			if (this.aClass22_5 != null && local8.aClass22_6 != null) {
				this.aClass22_5.method4693(local8.aClass22_6, arg3, arg1, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7550() {
		return this.aBoolean514;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!oa;B)Lclient!lt;")
	@Override
	public Class102_Sub2 method7545(@OriginalArg(0) Class121 arg0) {
		if (this.aClass22_5 == null) {
			return null;
		}
		@Pc(11) Class34 local11 = arg0.method7096();
		local11.GA(super.anInt7423, super.anInt7422, super.anInt7421);
		@Pc(21) Class102_Sub2 local21 = null;
		if (this.aBoolean511) {
			local21 = Static228.method3369(1);
		}
		this.aClass22_5.method4689(local11, local21 == null ? null : local21.aClass102_Sub5Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLclient!oa;)Lclient!vg;")
	@Override
	public Class330 method7539(@OriginalArg(1) Class121 arg0) {
		if (this.aClass330_6 == null) {
			this.aClass330_6 = Static9.method170(this.method6166(0, arg0), super.anInt7423, super.anInt7422, super.anInt7421);
		}
		return this.aClass330_6;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7552(@OriginalArg(1) Class121 arg0) {
		@Pc(18) Class6_Sub1_Sub12 local18;
		if (this.aClass6_Sub1_Sub12_4 == null && this.aBoolean514) {
			@Pc(29) Class300 local29 = this.method6167(262144, arg0, true);
			local18 = local29 == null ? null : local29.aClass6_Sub1_Sub12_6;
		} else {
			local18 = this.aClass6_Sub1_Sub12_4;
			this.aClass6_Sub1_Sub12_4 = null;
		}
		if (local18 != null) {
			Static287.method7856(local18, this.aByte76, super.anInt7423, super.anInt7421, null);
		}
	}
}

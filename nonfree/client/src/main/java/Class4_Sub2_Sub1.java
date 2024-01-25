import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class4_Sub2_Sub1 extends Class4_Sub2 implements Interface9 {

	@OriginalMember(owner = "client!fv", name = "F", descriptor = "Z")
	private final boolean aBoolean210;

	@OriginalMember(owner = "client!fv", name = "E", descriptor = "B")
	private final byte aByte22;

	@OriginalMember(owner = "client!fv", name = "eb", descriptor = "Z")
	private boolean aBoolean213;

	@OriginalMember(owner = "client!fv", name = "J", descriptor = "B")
	private final byte aByte23;

	@OriginalMember(owner = "client!fv", name = "T", descriptor = "Z")
	private final boolean aBoolean212;

	@OriginalMember(owner = "client!fv", name = "K", descriptor = "S")
	private final short aShort26;

	@OriginalMember(owner = "client!fv", name = "gb", descriptor = "B")
	private final byte aByte24;

	@OriginalMember(owner = "client!fv", name = "O", descriptor = "Z")
	private final boolean aBoolean211;

	@OriginalMember(owner = "client!fv", name = "Z", descriptor = "Lclient!j;")
	private Class2_Sub2_Sub9 aClass2_Sub2_Sub9_3;

	@OriginalMember(owner = "client!fv", name = "D", descriptor = "Lclient!c;")
	public Class32 aClass32_3;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!qa;Lclient!us;IIIIIZIIIIIIZ)V")
	public Class4_Sub2_Sub1(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt7142 == 1, Static105.method1629(arg12, arg13));
		this.aBoolean210 = arg7;
		this.aByte22 = (byte) arg12;
		this.aBoolean213 = arg14;
		this.aByte23 = (byte) arg3;
		this.aBoolean212 = arg1.anInt7186 != 0 && !arg7;
		this.aShort26 = (short) arg1.anInt7160;
		this.aByte24 = (byte) arg13;
		this.aBoolean211 = arg0.method2273() && arg1.aBoolean617 && !this.aBoolean210 && Static399.aClass167_Sub1_1.method4517(Static281.anInt5126) != 0;
		@Pc(82) int local82 = 2048;
		if (this.aBoolean213) {
			local82 |= 0x10000;
		}
		@Pc(97) Class69 local97 = this.method1842(this.aBoolean211, arg0, local82);
		if (local97 != null) {
			this.aClass2_Sub2_Sub9_3 = local97.aClass2_Sub2_Sub9_2;
			this.aClass32_3 = local97.aClass32_2;
			if (this.aBoolean213) {
				this.aClass32_3 = this.aClass32_3.method5678((byte) 0, local82, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)V")
	@Override
	public void method5889() {
		this.aBoolean213 = false;
		if (this.aClass32_3 != null) {
			this.aClass32_3.u(this.aClass32_3.n() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IILclient!qa;Lclient!eq;IIZ)V")
	@Override
	public void method5892(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg2 instanceof Class4_Sub4_Sub2) {
			@Pc(28) Class4_Sub4_Sub2 local28 = (Class4_Sub4_Sub2) arg2;
			if (this.aClass32_3 != null && local28.aClass32_6 != null) {
				this.aClass32_3.method5672(local28.aClass32_6, arg3, arg0, arg4, arg5);
			}
		} else if (arg2 instanceof Class4_Sub2_Sub1) {
			@Pc(8) Class4_Sub2_Sub1 local8 = (Class4_Sub2_Sub1) arg2;
			if (this.aClass32_3 != null && local8.aClass32_3 != null) {
				this.aClass32_3.method5672(local8.aClass32_3, arg3, arg0, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "(I)I")
	public int method1841() {
		return this.aClass32_3 == null ? 15 : this.aClass32_3.ra() / 4;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
	@Override
	public void method5899() {
		if (this.aClass32_3 != null) {
			this.aClass32_3.method5666();
		}
	}

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5905() {
		return this.aBoolean211;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZLclient!qa;II)Lclient!en;")
	private Class69 method1842(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class250 local13 = Static406.aClass150_3.method3508(this.aShort26 & 0xFFFF);
		@Pc(26) Class106 local26;
		@Pc(30) Class106 local30;
		if (this.aBoolean210) {
			local26 = Static77.aClass106Array12[this.aByte23];
			local30 = Static72.aClass106Array4[0];
		} else {
			if (this.aByte23 < 3) {
				local30 = Static72.aClass106Array4[this.aByte23 + 1];
			} else {
				local30 = null;
			}
			local26 = Static72.aClass106Array4[this.aByte23];
		}
		return local13.method5593(arg0, this.aByte22 == 11 ? 10 : this.aByte22, arg1, super.anInt7111, local26, arg2, local30, super.anInt7117, this.aByte22 == 11 ? this.aByte24 + 4 : this.aByte24, super.anInt7109);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method5893(@OriginalArg(0) Class26 arg0) {
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!qa;II)Lclient!c;")
	private Class32 method1843(@OriginalArg(0) Class26 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass32_3 != null && arg0.method2259(this.aClass32_3.n(), arg1) == 0) {
			return this.aClass32_3;
		} else {
			@Pc(26) Class69 local26 = this.method1842(false, arg0, arg1);
			return local26 == null ? null : local26.aClass32_2;
		}
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)I")
	@Override
	public int method5902() {
		return this.aByte24;
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "(B)I")
	@Override
	public int method5562() {
		return this.aClass32_3 == null ? 0 : this.aClass32_3.b();
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BLclient!qa;I)Lclient!c;")
	@Override
	public Class32 method5906(@OriginalArg(1) Class26 arg0, @OriginalArg(2) int arg1) {
		return this.method1843(arg0, arg1);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5900(@OriginalArg(0) Class26 arg0) {
		@Pc(25) Class2_Sub2_Sub9 local25;
		if (this.aClass2_Sub2_Sub9_3 == null && this.aBoolean211) {
			@Pc(18) Class69 local18 = this.method1842(true, arg0, 262144);
			local25 = local18 == null ? null : local18.aClass2_Sub2_Sub9_2;
		} else {
			local25 = this.aClass2_Sub2_Sub9_3;
			this.aClass2_Sub2_Sub9_3 = null;
		}
		if (local25 != null) {
			Static450.method6081(local25, this.aByte23, super.anInt7117, super.anInt7111, null);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)I")
	@Override
	public int method5901() {
		return this.aShort26 & 0xFFFF;
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)I")
	@Override
	public int method5904() {
		return this.aByte22;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5903(@OriginalArg(1) Class26 arg0) {
		@Pc(31) Class2_Sub2_Sub9 local31;
		if (this.aClass2_Sub2_Sub9_3 == null && this.aBoolean211) {
			@Pc(24) Class69 local24 = this.method1842(true, arg0, 262144);
			local31 = local24 == null ? null : local24.aClass2_Sub2_Sub9_2;
		} else {
			local31 = this.aClass2_Sub2_Sub9_3;
			this.aClass2_Sub2_Sub9_3 = null;
		}
		if (local31 != null) {
			Static95.method1600(local31, this.aByte23, super.anInt7117, super.anInt7111, null);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method5894(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class32 local11 = this.method1843(arg1, 131072);
		if (local11 == null) {
			return false;
		} else {
			@Pc(22) Class102 local22 = arg1.method2223();
			local22.R(super.anInt7117, super.anInt7109, super.anInt7111);
			return local11.method5671(arg2, arg0, local22, false);
		}
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5891() {
		return this.aBoolean213;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(ILclient!qa;)Lclient!fm;")
	@Override
	public Class38_Sub3 method5896(@OriginalArg(1) Class26 arg0) {
		if (this.aClass32_3 == null) {
			return null;
		}
		@Pc(11) Class102 local11 = arg0.method2223();
		local11.R(super.anInt7117, super.anInt7109, super.anInt7111);
		@Pc(21) Class38_Sub3 local21 = null;
		if (this.aBoolean212) {
			local21 = Static313.method4433(1);
		}
		this.aClass32_3.method5675(local11, local21 == null ? null : local21.aClass38_Sub4Array1[0], 0);
		return local21;
	}
}

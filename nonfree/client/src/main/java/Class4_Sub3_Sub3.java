import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class4_Sub3_Sub3 extends Class4_Sub3 implements Interface9 {

	@OriginalMember(owner = "client!lc", name = "C", descriptor = "B")
	private final byte aByte48;

	@OriginalMember(owner = "client!lc", name = "N", descriptor = "Z")
	private final boolean aBoolean347;

	@OriginalMember(owner = "client!lc", name = "Q", descriptor = "Z")
	private final boolean aBoolean348;

	@OriginalMember(owner = "client!lc", name = "I", descriptor = "B")
	private final byte aByte49;

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "Z")
	private boolean aBoolean345;

	@OriginalMember(owner = "client!lc", name = "L", descriptor = "S")
	private final short aShort52;

	@OriginalMember(owner = "client!lc", name = "K", descriptor = "Z")
	private final boolean aBoolean346;

	@OriginalMember(owner = "client!lc", name = "H", descriptor = "Lclient!j;")
	private Class2_Sub2_Sub9 aClass2_Sub2_Sub9_5;

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "Lclient!c;")
	private Class32 aClass32_5;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!qa;Lclient!us;IIIIZIZ)V")
	public Class4_Sub3_Sub3(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean608, arg1.aBoolean605);
		super.anInt4182 = arg5;
		this.aByte48 = (byte) arg7;
		this.aBoolean347 = arg1.anInt7186 != 0 && !arg6;
		super.anInt4181 = arg3;
		this.aBoolean348 = arg6;
		this.aByte49 = (byte) arg2;
		this.aBoolean345 = arg8;
		this.aShort52 = (short) arg1.anInt7160;
		this.aBoolean346 = arg0.method2273() && arg1.aBoolean617 && !this.aBoolean348 && Static399.aClass167_Sub1_1.method4517(Static281.anInt5126) != 0;
		@Pc(70) int local70 = 2048;
		if (this.aBoolean345) {
			local70 |= 0x10000;
		}
		@Pc(85) Class69 local85 = this.method3382(arg0, this.aBoolean346, local70);
		if (local85 != null) {
			this.aClass2_Sub2_Sub9_5 = local85.aClass2_Sub2_Sub9_2;
			this.aClass32_5 = local85.aClass32_2;
			if (this.aBoolean345) {
				this.aClass32_5 = this.aClass32_5.method5678((byte) 0, local70, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5891() {
		return this.aBoolean345;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)I")
	@Override
	public int method5901() {
		return this.aShort52 & 0xFFFF;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method5894(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class32 local9 = this.method3381(131072, arg1);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class102 local14 = arg1.method2223();
			local14.R(super.anInt4181, super.anInt4183, super.anInt4182);
			return local9.method5671(arg2, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)I")
	@Override
	public int method5902() {
		return this.aByte48;
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5905() {
		return this.aBoolean346;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)I")
	@Override
	public int method5904() {
		return 22;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5900(@OriginalArg(0) Class26 arg0) {
		@Pc(14) Class2_Sub2_Sub9 local14;
		if (this.aClass2_Sub2_Sub9_5 == null && this.aBoolean346) {
			@Pc(27) Class69 local27 = this.method3382(arg0, true, 262144);
			local14 = local27 == null ? null : local27.aClass2_Sub2_Sub9_2;
		} else {
			local14 = this.aClass2_Sub2_Sub9_5;
			this.aClass2_Sub2_Sub9_5 = null;
		}
		if (local14 != null) {
			Static450.method6081(local14, this.aByte49, super.anInt4181, super.anInt4182, null);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILclient!qa;Lclient!eq;IIZ)V")
	@Override
	public void method5892(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg2 instanceof Class4_Sub3_Sub3) {
			@Pc(10) Class4_Sub3_Sub3 local10 = (Class4_Sub3_Sub3) arg2;
			if (this.aClass32_5 != null && local10.aClass32_5 != null) {
				this.aClass32_5.method5672(local10.aClass32_5, arg3, arg0, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	private Class32 method3381(@OriginalArg(0) int arg0, @OriginalArg(2) Class26 arg1) {
		if (this.aClass32_5 != null && arg1.method2259(this.aClass32_5.n(), arg0) == 0) {
			return this.aClass32_5;
		} else {
			@Pc(33) Class69 local33 = this.method3382(arg1, false, arg0);
			return local33 == null ? null : local33.aClass32_2;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!qa;IZI)Lclient!en;")
	private Class69 method3382(@OriginalArg(0) Class26 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class250 local21 = Static406.aClass150_3.method3508(this.aShort52 & 0xFFFF);
		@Pc(29) Class106 local29;
		@Pc(33) Class106 local33;
		if (this.aBoolean348) {
			local29 = Static77.aClass106Array12[this.aByte49];
			local33 = Static72.aClass106Array4[0];
		} else {
			if (this.aByte49 < 3) {
				local33 = Static72.aClass106Array4[this.aByte49 + 1];
			} else {
				local33 = null;
			}
			local29 = Static72.aClass106Array4[this.aByte49];
		}
		return local21.method5593(arg1, 22, arg0, super.anInt4182, local29, arg2, local33, super.anInt4181, this.aByte48, super.anInt4183);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLclient!qa;I)Lclient!c;")
	@Override
	public Class32 method5906(@OriginalArg(1) Class26 arg0, @OriginalArg(2) int arg1) {
		return this.method3381(arg1, arg0);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
	@Override
	public void method5889() {
		this.aBoolean345 = false;
		if (this.aClass32_5 != null) {
			this.aClass32_5.u(this.aClass32_5.n() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5903(@OriginalArg(1) Class26 arg0) {
		@Pc(25) Class2_Sub2_Sub9 local25;
		if (this.aClass2_Sub2_Sub9_5 == null && this.aBoolean346) {
			@Pc(18) Class69 local18 = this.method3382(arg0, true, 262144);
			local25 = local18 == null ? null : local18.aClass2_Sub2_Sub9_2;
		} else {
			local25 = this.aClass2_Sub2_Sub9_5;
			this.aClass2_Sub2_Sub9_5 = null;
		}
		if (local25 != null) {
			Static95.method1600(local25, this.aByte49, super.anInt4181, super.anInt4182, null);
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(ILclient!qa;)Lclient!fm;")
	@Override
	public Class38_Sub3 method5896(@OriginalArg(1) Class26 arg0) {
		if (this.aClass32_5 == null) {
			return null;
		}
		@Pc(11) Class102 local11 = arg0.method2223();
		local11.R(super.anInt4181, super.anInt4183, super.anInt4182);
		@Pc(21) Class38_Sub3 local21 = null;
		if (this.aBoolean347) {
			local21 = Static313.method4433(1);
		}
		this.aClass32_5.method5675(local11, local21 == null ? null : local21.aClass38_Sub4Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method5893(@OriginalArg(0) Class26 arg0) {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	@Override
	public void method5899() {
		if (this.aClass32_5 != null) {
			this.aClass32_5.method5666();
		}
	}
}

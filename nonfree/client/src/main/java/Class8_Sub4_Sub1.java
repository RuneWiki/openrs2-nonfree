import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class8_Sub4_Sub1 extends Class8_Sub4 implements Interface7 {

	@OriginalMember(owner = "client!kk", name = "L", descriptor = "S")
	private final short aShort58;

	@OriginalMember(owner = "client!kk", name = "y", descriptor = "B")
	private final byte aByte43;

	@OriginalMember(owner = "client!kk", name = "K", descriptor = "Z")
	private boolean aBoolean284;

	@OriginalMember(owner = "client!kk", name = "N", descriptor = "B")
	private final byte aByte45;

	@OriginalMember(owner = "client!kk", name = "z", descriptor = "Z")
	private final boolean aBoolean283;

	@OriginalMember(owner = "client!kk", name = "db", descriptor = "Z")
	private final boolean aBoolean286;

	@OriginalMember(owner = "client!kk", name = "F", descriptor = "B")
	private final byte aByte44;

	@OriginalMember(owner = "client!kk", name = "hb", descriptor = "Z")
	private final boolean aBoolean287;

	@OriginalMember(owner = "client!kk", name = "M", descriptor = "Lclient!ni;")
	public Class38 aClass38_3;

	@OriginalMember(owner = "client!kk", name = "eb", descriptor = "Lclient!o;")
	private Class4_Sub4_Sub4 aClass4_Sub4_Sub4_2;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!vq;Lclient!bi;IIIIZIIZ)V")
	public Class8_Sub4_Sub1(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static142.method2957(arg8, arg7));
		super.anInt6662 = (short) arg5;
		this.aShort58 = (short) arg1.anInt534;
		super.anInt6654 = (short) arg3;
		this.aByte43 = (byte) arg2;
		this.aBoolean284 = arg9;
		this.aByte45 = (byte) arg7;
		this.aBoolean283 = arg6;
		this.aBoolean286 = arg1.anInt503 != 0 && !arg6;
		this.aByte44 = (byte) arg8;
		this.aBoolean287 = arg0.method2740() && arg1.aBoolean52 && !this.aBoolean283 && Static9.anInt216 != 0;
		@Pc(67) int local67 = 1024;
		if (this.aBoolean284) {
			local67 |= 0x8000;
		}
		@Pc(82) Class184 local82 = this.method3252(this.aBoolean287, arg0, local67);
		if (local82 != null) {
			this.aClass38_3 = local82.aClass38_5;
			this.aClass4_Sub4_Sub4_2 = local82.aClass4_Sub4_Sub4_4;
			if (this.aBoolean284) {
				this.aClass38_3 = this.aClass38_3.method1915((byte) 0, local67, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!vq;IIB)Z")
	@Override
	public boolean method5623(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(17) Class38 local17 = this.method3249(65536, arg0);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class57 local22 = arg0.method2706();
			local22.method4189(super.anInt6654, super.anInt6656, super.anInt6662);
			return local17.method1905(arg1, arg2, local22, false);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILclient!vq;B)Lclient!ni;")
	private Class38 method3249(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
		if (this.aClass38_3 != null && arg1.method2695(this.aClass38_3.method1898(), arg0) == 0) {
			return this.aClass38_3;
		} else {
			@Pc(31) Class184 local31 = this.method3252(false, arg1, arg0);
			return local31 == null ? null : local31.aClass38_5;
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)I")
	@Override
	public int method5594() {
		return this.aShort58 & 0xFFFF;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
	@Override
	public void method5587() {
		if (this.aClass38_3 != null) {
			this.aClass38_3.method1924();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)I")
	@Override
	public int method5589() {
		return this.aByte45;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)I")
	@Override
	public int method5590() {
		return this.aByte44;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!vq;I)V")
	@Override
	public void method5593(@OriginalArg(0) Class47 arg0) {
		@Pc(22) Class4_Sub4_Sub4 local22;
		if (this.aClass4_Sub4_Sub4_2 == null && this.aBoolean287) {
			@Pc(33) Class184 local33 = this.method3252(true, arg0, 131072);
			local22 = local33 == null ? null : local33.aClass4_Sub4_Sub4_4;
		} else {
			local22 = this.aClass4_Sub4_Sub4_2;
			this.aClass4_Sub4_Sub4_2 = null;
		}
		if (local22 != null) {
			Static66.method1584(local22, this.aByte43, super.anInt6654, super.anInt6662, null);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!vq;B)V")
	@Override
	public void method5627(@OriginalArg(0) Class47 arg0) {
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILclient!vq;)V")
	@Override
	public void method5591(@OriginalArg(1) Class47 arg0) {
		@Pc(25) Class4_Sub4_Sub4 local25;
		if (this.aClass4_Sub4_Sub4_2 == null && this.aBoolean287) {
			@Pc(18) Class184 local18 = this.method3252(true, arg0, 131072);
			local25 = local18 == null ? null : local18.aClass4_Sub4_Sub4_4;
		} else {
			local25 = this.aClass4_Sub4_Sub4_2;
			this.aClass4_Sub4_Sub4_2 = null;
		}
		if (local25 != null) {
			Static70.method1652(local25, this.aByte43, super.anInt6654, super.anInt6662, null);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZLclient!vq;IB)Lclient!sl;")
	private Class184 method3252(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2) {
		@Pc(17) Class18 local17 = Static113.method2380(this.aShort58 & 0xFFFF);
		@Pc(25) Class60 local25;
		@Pc(29) Class60 local29;
		if (this.aBoolean283) {
			local25 = Static77.aClass60Array1[this.aByte43];
			local29 = Static304.aClass60Array3[0];
		} else {
			if (this.aByte43 < 3) {
				local29 = Static304.aClass60Array3[this.aByte43 + 1];
			} else {
				local29 = null;
			}
			local25 = Static304.aClass60Array3[this.aByte43];
		}
		return local17.method410(arg2, super.anInt6662, local25, this.aByte44, this.aByte45, super.anInt6654, arg1, arg0, local29, super.anInt6656);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5592() {
		return this.aBoolean287;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLclient!vq;)Lclient!bf;")
	@Override
	public Class2_Sub2 method5624(@OriginalArg(1) Class47 arg0) {
		if (this.aClass38_3 == null) {
			return null;
		}
		@Pc(11) Class57 local11 = arg0.method2706();
		local11.method4189(super.anInt6654, super.anInt6656, super.anInt6662);
		@Pc(29) Class2_Sub2 local29 = null;
		if (this.aBoolean286) {
			local29 = Static248.method4393(1);
		}
		this.aClass38_3.method1925(local11, local29 == null ? null : local29.aClass2_Sub5Array1[0], 0);
		return local29;
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5622() {
		return this.aBoolean284;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!vq;ZLclient!km;IIBI)V")
	@Override
	public void method5621(@OriginalArg(0) Class47 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class8_Sub4_Sub1) {
			@Pc(39) Class8_Sub4_Sub1 local39 = (Class8_Sub4_Sub1) arg2;
			if (this.aClass38_3 == null || local39.aClass38_3 == null) {
				return;
			}
			this.aClass38_3.method1900(local39.aClass38_3, arg4, arg5, arg3, arg1);
		} else if (arg2 instanceof Class8_Sub1_Sub3) {
			@Pc(20) Class8_Sub1_Sub3 local20 = (Class8_Sub1_Sub3) arg2;
			if (this.aClass38_3 != null && local20.aClass38_2 != null) {
				this.aClass38_3.method1900(local20.aClass38_2, arg4, arg5, arg3, arg1);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(B)V")
	@Override
	public void method5625() {
		this.aBoolean284 = false;
		if (this.aClass38_3 != null) {
			this.aClass38_3.method1890(this.aClass38_3.method1898() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILclient!vq;)Lclient!ni;")
	@Override
	public Class38 method5588(@OriginalArg(1) int arg0, @OriginalArg(2) Class47 arg1) {
		return this.method3249(arg0, arg1);
	}
}

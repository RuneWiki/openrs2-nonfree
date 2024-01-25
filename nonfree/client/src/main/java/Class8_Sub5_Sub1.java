import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class8_Sub5_Sub1 extends Class8_Sub5 implements Interface7 {

	@OriginalMember(owner = "client!sa", name = "E", descriptor = "Z")
	private final boolean aBoolean414;

	@OriginalMember(owner = "client!sa", name = "T", descriptor = "B")
	private final byte aByte64;

	@OriginalMember(owner = "client!sa", name = "G", descriptor = "Z")
	private boolean aBoolean415;

	@OriginalMember(owner = "client!sa", name = "P", descriptor = "B")
	private final byte aByte63;

	@OriginalMember(owner = "client!sa", name = "Q", descriptor = "Z")
	private final boolean aBoolean416;

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "S")
	private final short aShort86;

	@OriginalMember(owner = "client!sa", name = "U", descriptor = "Z")
	private final boolean aBoolean417;

	@OriginalMember(owner = "client!sa", name = "N", descriptor = "Lclient!ni;")
	private Class38 aClass38_4;

	@OriginalMember(owner = "client!sa", name = "V", descriptor = "Lclient!o;")
	private Class4_Sub4_Sub4 aClass4_Sub4_Sub4_3;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!vq;Lclient!bi;IIIIZIZ)V")
	public Class8_Sub5_Sub1(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean45, arg1.aBoolean39);
		this.aBoolean414 = arg1.anInt503 != 0 && !arg6;
		super.anInt6321 = (short) arg5;
		this.aByte64 = (byte) arg2;
		this.aBoolean415 = arg8;
		this.aByte63 = (byte) arg7;
		this.aBoolean416 = arg6;
		super.anInt6322 = (short) arg3;
		this.aShort86 = (short) arg1.anInt534;
		this.aBoolean417 = arg0.method2740() && arg1.aBoolean52 && !this.aBoolean416 && Static9.anInt216 != 0;
		@Pc(66) int local66 = 1024;
		if (this.aBoolean415) {
			local66 |= 0x8000;
		}
		@Pc(81) Class184 local81 = this.method4820(arg0, local66, this.aBoolean417);
		if (local81 != null) {
			this.aClass38_4 = local81.aClass38_5;
			this.aClass4_Sub4_Sub4_3 = local81.aClass4_Sub4_Sub4_4;
			if (this.aBoolean415) {
				this.aClass38_4 = this.aClass38_4.method1915((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!vq;I)V")
	@Override
	public void method5593(@OriginalArg(0) Class47 arg0) {
		@Pc(33) Class4_Sub4_Sub4 local33;
		if (this.aClass4_Sub4_Sub4_3 == null && this.aBoolean417) {
			@Pc(26) Class184 local26 = this.method4820(arg0, 131072, true);
			local33 = local26 == null ? null : local26.aClass4_Sub4_Sub4_4;
		} else {
			local33 = this.aClass4_Sub4_Sub4_3;
			this.aClass4_Sub4_Sub4_3 = null;
		}
		if (local33 != null) {
			Static66.method1584(local33, this.aByte64, super.anInt6322, super.anInt6321, null);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!vq;ZLclient!km;IIBI)V")
	@Override
	public void method5621(@OriginalArg(0) Class47 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class8_Sub5_Sub1) {
			@Pc(5) Class8_Sub5_Sub1 local5 = (Class8_Sub5_Sub1) arg2;
			if (this.aClass38_4 != null && local5.aClass38_4 != null) {
				this.aClass38_4.method1900(local5.aClass38_4, arg4, arg5, arg3, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILclient!vq;)Lclient!ni;")
	@Override
	public Class38 method5588(@OriginalArg(1) int arg0, @OriginalArg(2) Class47 arg1) {
		return this.method4823(arg1, arg0);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)I")
	@Override
	public int method5589() {
		return 22;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5592() {
		return this.aBoolean417;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
	@Override
	public void method5625() {
		this.aBoolean415 = false;
		if (this.aClass38_4 != null) {
			this.aClass38_4.method1890(this.aClass38_4.method1898() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)I")
	@Override
	public int method5594() {
		return this.aShort86 & 0xFFFF;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!vq;IIZ)Lclient!sl;")
	private Class184 method4820(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(17) Class18 local17 = Static113.method2380(this.aShort86 & 0xFFFF);
		@Pc(25) Class60 local25;
		@Pc(29) Class60 local29;
		if (this.aBoolean416) {
			local25 = Static77.aClass60Array1[this.aByte64];
			local29 = Static304.aClass60Array3[0];
		} else {
			local25 = Static304.aClass60Array3[this.aByte64];
			if (this.aByte64 >= 3) {
				local29 = null;
			} else {
				local29 = Static304.aClass60Array3[this.aByte64 + 1];
			}
		}
		return local17.method410(arg1, super.anInt6321, local25, this.aByte63, 22, super.anInt6322, arg0, arg2, local29, super.anInt6324);
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)I")
	@Override
	public int method5590() {
		return this.aByte63;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!vq;)V")
	@Override
	public void method5591(@OriginalArg(1) Class47 arg0) {
		@Pc(29) Class4_Sub4_Sub4 local29;
		if (this.aClass4_Sub4_Sub4_3 == null && this.aBoolean417) {
			@Pc(22) Class184 local22 = this.method4820(arg0, 131072, true);
			local29 = local22 == null ? null : local22.aClass4_Sub4_Sub4_4;
		} else {
			local29 = this.aClass4_Sub4_Sub4_3;
			this.aClass4_Sub4_Sub4_3 = null;
		}
		if (local29 != null) {
			Static70.method1652(local29, this.aByte64, super.anInt6322, super.anInt6321, null);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!vq;B)V")
	@Override
	public void method5627(@OriginalArg(0) Class47 arg0) {
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLclient!vq;)Lclient!bf;")
	@Override
	public Class2_Sub2 method5624(@OriginalArg(1) Class47 arg0) {
		if (this.aClass38_4 == null) {
			return null;
		}
		@Pc(11) Class57 local11 = arg0.method2706();
		local11.method4189(super.anInt6322, super.anInt6324, super.anInt6321);
		@Pc(21) Class2_Sub2 local21 = null;
		if (this.aBoolean414) {
			local21 = Static248.method4393(1);
		}
		this.aClass38_4.method1925(local11, local21 == null ? null : local21.aClass2_Sub5Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5622() {
		return this.aBoolean415;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!vq;IZ)Lclient!ni;")
	private Class38 method4823(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass38_4 != null && arg0.method2695(this.aClass38_4.method1898(), arg1) == 0) {
			return this.aClass38_4;
		} else {
			@Pc(23) Class184 local23 = this.method4820(arg0, arg1, false);
			return local23 == null ? null : local23.aClass38_5;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	@Override
	public void method5587() {
		if (this.aClass38_4 != null) {
			this.aClass38_4.method1924();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!vq;IIB)Z")
	@Override
	public boolean method5623(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class38 local9 = this.method4823(arg0, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class57 local14 = arg0.method2706();
			local14.method4189(super.anInt6322, super.anInt6324, super.anInt6321);
			return local9.method1905(arg1, arg2, local14, false);
		}
	}
}

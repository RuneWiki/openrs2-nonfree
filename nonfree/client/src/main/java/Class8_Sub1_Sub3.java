import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class8_Sub1_Sub3 extends Class8_Sub1 implements Interface7 {

	@OriginalMember(owner = "client!fi", name = "fb", descriptor = "Z")
	private final boolean aBoolean178;

	@OriginalMember(owner = "client!fi", name = "T", descriptor = "Z")
	private final boolean aBoolean175;

	@OriginalMember(owner = "client!fi", name = "C", descriptor = "B")
	private final byte aByte29;

	@OriginalMember(owner = "client!fi", name = "N", descriptor = "S")
	private final short aShort45;

	@OriginalMember(owner = "client!fi", name = "K", descriptor = "B")
	private final byte aByte30;

	@OriginalMember(owner = "client!fi", name = "U", descriptor = "Z")
	private boolean aBoolean176;

	@OriginalMember(owner = "client!fi", name = "W", descriptor = "B")
	private final byte aByte31;

	@OriginalMember(owner = "client!fi", name = "bb", descriptor = "Z")
	private final boolean aBoolean177;

	@OriginalMember(owner = "client!fi", name = "V", descriptor = "Lclient!o;")
	private Class4_Sub4_Sub4 aClass4_Sub4_Sub4_1;

	@OriginalMember(owner = "client!fi", name = "R", descriptor = "Lclient!ni;")
	public Class38 aClass38_2;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!vq;Lclient!bi;IIIIIZIIIIIIZ)V")
	public Class8_Sub1_Sub3(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt542 == 1, Static114.method2391(arg13, arg12));
		this.aBoolean178 = arg1.anInt503 != 0 && !arg7;
		this.aBoolean175 = arg7;
		this.aByte29 = (byte) arg12;
		this.aShort45 = (short) arg1.anInt534;
		this.aByte30 = (byte) arg3;
		this.aBoolean176 = arg14;
		this.aByte31 = (byte) arg13;
		this.aBoolean177 = arg0.method2740() && arg1.aBoolean52 && !this.aBoolean175 && Static9.anInt216 != 0;
		@Pc(76) int local76 = 1024;
		if (this.aBoolean176) {
			local76 |= 0x8000;
		}
		@Pc(91) Class184 local91 = this.method2158(local76, arg0, this.aBoolean177);
		if (local91 != null) {
			this.aClass4_Sub4_Sub4_1 = local91.aClass4_Sub4_Sub4_4;
			this.aClass38_2 = local91.aClass38_5;
			if (this.aBoolean176) {
				this.aClass38_2 = this.aClass38_2.method1915((byte) 0, local76, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)I")
	@Override
	public int method5590() {
		return this.aByte31;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!vq;)V")
	@Override
	public void method5591(@OriginalArg(1) Class47 arg0) {
		@Pc(21) Class4_Sub4_Sub4 local21;
		if (this.aClass4_Sub4_Sub4_1 == null && this.aBoolean177) {
			@Pc(32) Class184 local32 = this.method2158(131072, arg0, true);
			local21 = local32 == null ? null : local32.aClass4_Sub4_Sub4_4;
		} else {
			local21 = this.aClass4_Sub4_Sub4_1;
			this.aClass4_Sub4_Sub4_1 = null;
		}
		if (local21 != null) {
			Static70.method1652(local21, this.aByte30, super.anInt6701, super.anInt6702, null);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILclient!vq;)Lclient!ni;")
	@Override
	public Class38 method5588(@OriginalArg(1) int arg0, @OriginalArg(2) Class47 arg1) {
		return this.method2157(arg1, arg0);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!vq;I)V")
	@Override
	public void method5593(@OriginalArg(0) Class47 arg0) {
		@Pc(33) Class4_Sub4_Sub4 local33;
		if (this.aClass4_Sub4_Sub4_1 == null && this.aBoolean177) {
			@Pc(26) Class184 local26 = this.method2158(131072, arg0, true);
			local33 = local26 == null ? null : local26.aClass4_Sub4_Sub4_4;
		} else {
			local33 = this.aClass4_Sub4_Sub4_1;
			this.aClass4_Sub4_Sub4_1 = null;
		}
		if (local33 != null) {
			Static66.method1584(local33, this.aByte30, super.anInt6701, super.anInt6702, null);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
	@Override
	public void method5587() {
		if (this.aClass38_2 != null) {
			this.aClass38_2.method1924();
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!vq;IIB)Z")
	@Override
	public boolean method5623(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(17) Class38 local17 = this.method2157(arg0, 65536);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class57 local22 = arg0.method2706();
			local22.method4189(super.anInt6701, super.anInt6697, super.anInt6702);
			return local17.method1905(arg1, arg2, local22, false);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!vq;IB)Lclient!ni;")
	private Class38 method2157(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass38_2 != null && arg0.method2695(this.aClass38_2.method1898(), arg1) == 0) {
			return this.aClass38_2;
		} else {
			@Pc(30) Class184 local30 = this.method2158(arg1, arg0, false);
			return local30 == null ? null : local30.aClass38_5;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!vq;ZLclient!km;IIBI)V")
	@Override
	public void method5621(@OriginalArg(0) Class47 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class8_Sub4_Sub1) {
			@Pc(5) Class8_Sub4_Sub1 local5 = (Class8_Sub4_Sub1) arg2;
			if (this.aClass38_2 != null && local5.aClass38_3 != null) {
				this.aClass38_2.method1900(local5.aClass38_3, arg4, arg5, arg3, arg1);
			}
		} else if (arg2 instanceof Class8_Sub1_Sub3) {
			@Pc(28) Class8_Sub1_Sub3 local28 = (Class8_Sub1_Sub3) arg2;
			if (this.aClass38_2 != null && local28.aClass38_2 != null) {
				this.aClass38_2.method1900(local28.aClass38_2, arg4, arg5, arg3, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILclient!vq;Z)Lclient!sl;")
	private Class184 method2158(@OriginalArg(0) int arg0, @OriginalArg(2) Class47 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) Class18 local12 = Static113.method2380(this.aShort45 & 0xFFFF);
		@Pc(35) Class60 local35;
		@Pc(21) Class60 local21;
		if (this.aBoolean175) {
			local35 = Static77.aClass60Array1[this.aByte30];
			local21 = Static304.aClass60Array3[0];
		} else {
			if (this.aByte30 >= 3) {
				local21 = null;
			} else {
				local21 = Static304.aClass60Array3[this.aByte30 + 1];
			}
			local35 = Static304.aClass60Array3[this.aByte30];
		}
		return local12.method410(arg0, super.anInt6702, local35, this.aByte29 == 11 ? this.aByte31 + 4 : this.aByte31, this.aByte29 == 11 ? 10 : this.aByte29, super.anInt6701, arg1, arg2, local21, super.anInt6697);
	}

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)I")
	public int method2160() {
		return this.aClass38_2 == null ? 15 : this.aClass38_2.method1894() / 4;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)V")
	@Override
	public void method5625() {
		this.aBoolean176 = false;
		if (this.aClass38_2 != null) {
			this.aClass38_2.method1890(this.aClass38_2.method1898() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLclient!vq;)Lclient!bf;")
	@Override
	public Class2_Sub2 method5624(@OriginalArg(1) Class47 arg0) {
		if (this.aClass38_2 == null) {
			return null;
		}
		@Pc(11) Class57 local11 = arg0.method2706();
		local11.method4189(super.anInt6701, super.anInt6697, super.anInt6702);
		@Pc(29) Class2_Sub2 local29 = null;
		if (this.aBoolean178) {
			local29 = Static248.method4393(1);
		}
		this.aClass38_2.method1925(local11, local29 == null ? null : local29.aClass2_Sub5Array1[0], 0);
		return local29;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5592() {
		return this.aBoolean177;
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5622() {
		return this.aBoolean176;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)I")
	@Override
	public int method5589() {
		return this.aByte29;
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)I")
	@Override
	public int method5629() {
		return this.aClass38_2 == null ? 0 : this.aClass38_2.method1921();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!vq;B)V")
	@Override
	public void method5627(@OriginalArg(0) Class47 arg0) {
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)I")
	@Override
	public int method5594() {
		return this.aShort45 & 0xFFFF;
	}
}

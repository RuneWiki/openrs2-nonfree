import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class25_Sub1_Sub3 extends Class25_Sub1 {

	@OriginalMember(owner = "client!dr", name = "C", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!dr", name = "D", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!dr", name = "I", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!dr", name = "N", descriptor = "I")
	private int anInt1493;

	@OriginalMember(owner = "client!dr", name = "T", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!dr", name = "V", descriptor = "I")
	private int anInt1499;

	@OriginalMember(owner = "client!dr", name = "W", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!dr", name = "X", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!dr", name = "lb", descriptor = "D")
	private double lb;

	@OriginalMember(owner = "client!dr", name = "pb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!dr", name = "qb", descriptor = "Lclient!pl;")
	private Class63_Sub5 aClass63_Sub5_2;

	@OriginalMember(owner = "client!dr", name = "Q", descriptor = "I")
	private int anInt1495 = -1;

	@OriginalMember(owner = "client!dr", name = "bb", descriptor = "I")
	private int anInt1502 = -32768;

	@OriginalMember(owner = "client!dr", name = "ab", descriptor = "Z")
	private boolean aBoolean99 = false;

	@OriginalMember(owner = "client!dr", name = "fb", descriptor = "I")
	private int anInt1504 = 0;

	@OriginalMember(owner = "client!dr", name = "jb", descriptor = "I")
	private int anInt1508 = 0;

	@OriginalMember(owner = "client!dr", name = "S", descriptor = "I")
	public final int anInt1497;

	@OriginalMember(owner = "client!dr", name = "mb", descriptor = "I")
	public final int anInt1510;

	@OriginalMember(owner = "client!dr", name = "ib", descriptor = "I")
	public final int anInt1507;

	@OriginalMember(owner = "client!dr", name = "nb", descriptor = "I")
	private final int anInt1511;

	@OriginalMember(owner = "client!dr", name = "H", descriptor = "I")
	private final int anInt1488;

	@OriginalMember(owner = "client!dr", name = "kb", descriptor = "I")
	private final int anInt1509;

	@OriginalMember(owner = "client!dr", name = "K", descriptor = "I")
	public final int anInt1490;

	@OriginalMember(owner = "client!dr", name = "cb", descriptor = "Lclient!bb;")
	private final Class17 aClass17_1;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class25_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt1497 = arg10;
		this.anInt1510 = arg9;
		this.anInt1507 = arg6;
		this.anInt1511 = arg8;
		this.anInt1488 = arg0;
		this.aBoolean99 = false;
		this.anInt1509 = arg7;
		this.anInt1490 = arg5;
		@Pc(64) int local64 = Static136.method2578(this.anInt1488).anInt3759;
		if (local64 == -1) {
			this.aClass17_1 = null;
		} else {
			this.aClass17_1 = Static261.method4492(local64);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!en;I)V")
	@Override
	public void method5583(@OriginalArg(0) Class59 arg0) {
		@Pc(11) Class101 local11 = this.method1315(0, arg0);
		if (local11 == null) {
			return;
		}
		@Pc(17) Class112 local17 = arg0.method4798();
		local17.method3593(this.anInt1499);
		local17.method3597(this.anInt1493);
		local17.method3584((int) this.aDouble1, (int) this.lb, (int) this.aDouble7);
		this.anInt1502 = local11.method5147();
		this.method1318(arg0, local11);
	}

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "(I)V")
	@Override
	public void method5588() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5585() {
		return false;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILclient!en;)Lclient!mj;")
	private Class101 method1315(@OriginalArg(1) int arg0, @OriginalArg(2) Class59 arg1) {
		@Pc(13) Class128 local13 = Static136.method2578(this.anInt1488);
		return local13.method3470(arg0, arg1, this.anInt1504, this.anInt1495, this.anInt1508);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIII)V")
	public void method1316(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean99) {
			local9 = arg2 - super.anInt5769;
			@Pc(16) double local16 = (double) (arg0 - super.anInt5773);
			@Pc(25) double local25 = Math.sqrt(local9 * local9 + local16 * local16);
			this.aDouble1 = (double) super.anInt5769 + local9 * (double) this.anInt1511 / local25;
			this.aDouble7 = (double) super.anInt5773 + (double) this.anInt1511 * local16 / local25;
			this.lb = super.anInt5772;
		}
		local9 = this.anInt1507 + 1 - arg3;
		this.aDouble2 = ((double) arg0 - this.aDouble7) / local9;
		this.aDouble5 = ((double) arg2 - this.aDouble1) / local9;
		this.aDouble4 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble2 * this.aDouble2);
		if (this.anInt1509 == -1) {
			this.aDouble6 = ((double) arg1 - this.lb) / local9;
		} else {
			if (!this.aBoolean99) {
				this.aDouble6 = -this.aDouble4 * Math.tan((double) this.anInt1509 * 0.02454369D);
			}
			this.aDouble3 = ((double) arg1 - local9 * this.aDouble6 - this.lb) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "(I)I")
	@Override
	public int method5096() {
		return this.anInt1502;
	}

	@OriginalMember(owner = "client!dr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass63_Sub5_2 != null) {
			this.aClass63_Sub5_2.method4124();
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!en;ILclient!mj;)V")
	private void method1318(@OriginalArg(0) Class59 arg0, @OriginalArg(2) Class101 arg1) {
		@Pc(11) Class140[] local11 = arg1.method5164();
		@Pc(14) Class151[] local14 = arg1.method5161();
		if ((this.aClass63_Sub5_2 == null || this.aClass63_Sub5_2.aBoolean343) && (local11 != null || local14 != null)) {
			this.aClass63_Sub5_2 = new Class63_Sub5(Static180.anInt3606);
		}
		if (this.aClass63_Sub5_2 != null) {
			this.aClass63_Sub5_2.method4118(arg0, (long) Static180.anInt3606, local11, local14);
			this.aClass63_Sub5_2.method4116(super.aByte62, super.aShort76, super.aShort73, super.aShort75, super.aShort74);
		}
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(II)V")
	public void method1321(@OriginalArg(0) int arg0) {
		this.aDouble1 += (double) arg0 * this.aDouble5;
		this.aBoolean99 = true;
		this.aDouble7 += (double) arg0 * this.aDouble2;
		if (this.anInt1509 == -1) {
			this.lb += (double) arg0 * this.aDouble6;
		} else {
			this.lb += (double) arg0 * 0.5D * this.aDouble3 * (double) arg0 + (double) arg0 * this.aDouble6;
			this.aDouble6 += (double) arg0 * this.aDouble3;
		}
		this.anInt1493 = (int) (Math.atan2(this.aDouble5, this.aDouble2) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt1499 = (int) (Math.atan2(this.aDouble6, this.aDouble4) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass17_1 == null) {
			return;
		}
		this.anInt1504 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass17_1.anIntArray26[this.anInt1508] >= this.anInt1504) {
						return;
					}
					this.anInt1504 -= this.aClass17_1.anIntArray26[this.anInt1508];
					this.anInt1508++;
					if (this.aClass17_1.anIntArray24.length <= this.anInt1508) {
						this.anInt1508 -= this.aClass17_1.anInt520;
						if (this.anInt1508 < 0 || this.aClass17_1.anIntArray24.length <= this.anInt1508) {
							this.anInt1508 = 0;
						}
					}
					this.anInt1495 = this.anInt1508 + 1;
				} while (this.aClass17_1.anIntArray24.length > this.anInt1495);
				this.anInt1495 -= this.aClass17_1.anInt520;
			} while (this.anInt1495 >= 0 && this.aClass17_1.anIntArray24.length > this.anInt1495);
			this.anInt1495 = -1;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!en;)Lclient!ir;")
	@Override
	public Class63_Sub3 method5590(@OriginalArg(1) Class59 arg0) {
		@Pc(15) Class101 local15 = this.method1315(1024, arg0);
		if (local15 == null) {
			return null;
		}
		@Pc(22) Class112 local22 = arg0.method4798();
		local22.method3593(this.anInt1499);
		local22.method3597(this.anInt1493);
		local22.method3584((int) this.aDouble1, (int) this.lb, (int) this.aDouble7);
		if (this.aClass63_Sub5_2 == null) {
			local15.method5172(local22, null, 0);
		} else {
			@Pc(48) Class21 local48 = this.aClass63_Sub5_2.method4125();
			arg0.method4811(local15, local48, local22, null);
		}
		this.anInt1502 = local15.method5147();
		this.method1318(arg0, local15);
		return null;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIZLclient!en;)Z")
	@Override
	public boolean method5586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class59 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!en;IBLclient!fs;IZ)V")
	@Override
	public void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class25 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
	public void method1322() {
		if (this.aClass63_Sub5_2 != null) {
			this.aClass63_Sub5_2.method4124();
		}
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(B)V")
	@Override
	public void method5095() {
		super.aShort75 = super.aShort74 = (short) (this.aDouble7 / 128.0D);
		super.aShort76 = super.aShort73 = (short) (this.aDouble1 / 128.0D);
	}
}

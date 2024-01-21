import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class4_Sub3_Sub1_Sub3 extends Class4_Sub3_Sub1 {

	@OriginalMember(owner = "client!d", name = "U", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
	private int anInt665;

	@OriginalMember(owner = "client!d", name = "ab", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!d", name = "cb", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!d", name = "gb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!d", name = "pb", descriptor = "I")
	public int anInt674;

	@OriginalMember(owner = "client!d", name = "ub", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!d", name = "yb", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!d", name = "zb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!d", name = "Eb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!d", name = "nb", descriptor = "I")
	private int anInt672 = 0;

	@OriginalMember(owner = "client!d", name = "mb", descriptor = "Z")
	private boolean aBoolean25 = false;

	@OriginalMember(owner = "client!d", name = "fb", descriptor = "I")
	private int anInt667 = 0;

	@OriginalMember(owner = "client!d", name = "ob", descriptor = "I")
	private final int anInt673;

	@OriginalMember(owner = "client!d", name = "tb", descriptor = "I")
	private final int anInt678;

	@OriginalMember(owner = "client!d", name = "X", descriptor = "I")
	private final int anInt664;

	@OriginalMember(owner = "client!d", name = "vb", descriptor = "I")
	public final int anInt679;

	@OriginalMember(owner = "client!d", name = "qb", descriptor = "I")
	public final int anInt675;

	@OriginalMember(owner = "client!d", name = "jb", descriptor = "I")
	private final int anInt670;

	@OriginalMember(owner = "client!d", name = "db", descriptor = "I")
	private final int anInt666;

	@OriginalMember(owner = "client!d", name = "sb", descriptor = "I")
	public final int anInt677;

	@OriginalMember(owner = "client!d", name = "Bb", descriptor = "I")
	public final int anInt681;

	@OriginalMember(owner = "client!d", name = "kb", descriptor = "I")
	public final int anInt671;

	@OriginalMember(owner = "client!d", name = "Cb", descriptor = "I")
	private final int anInt682;

	@OriginalMember(owner = "client!d", name = "Ab", descriptor = "Lclient!ne;")
	private final Class4_Sub3_Sub10 aClass4_Sub3_Sub10_1;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class4_Sub3_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt673 = arg8;
		this.anInt678 = arg0;
		this.anInt664 = arg7;
		this.anInt679 = arg1;
		this.anInt675 = arg6;
		this.anInt670 = arg3;
		this.anInt666 = arg2;
		this.aBoolean25 = false;
		this.anInt677 = arg10;
		this.anInt681 = arg5;
		this.anInt671 = arg9;
		this.anInt682 = arg4;
		@Pc(52) int local52 = Static46.method642(this.anInt678).anInt795;
		if (local52 == -1) {
			this.aClass4_Sub3_Sub10_1 = null;
		} else {
			this.aClass4_Sub3_Sub10_1 = Static7.method63(local52);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V")
	public void method370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(20) double local20;
		if (!this.aBoolean25) {
			@Pc(13) double local13 = (double) (arg1 - this.anInt670);
			local20 = arg0 - this.anInt666;
			@Pc(29) double local29 = Math.sqrt(local13 * local13 + local20 * local20);
			this.aDouble3 = (double) this.anInt670 + (double) this.anInt673 * local13 / local29;
			this.aDouble1 = (double) this.anInt666 + (double) this.anInt673 * local20 / local29;
			this.aDouble6 = this.anInt682;
		}
		local20 = this.anInt675 + 1 - arg3;
		this.aDouble2 = ((double) arg1 - this.aDouble3) / local20;
		this.aDouble4 = ((double) arg0 - this.aDouble1) / local20;
		this.aDouble8 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble4 * this.aDouble4);
		if (!this.aBoolean25) {
			this.aDouble5 = -this.aDouble8 * Math.tan((double) this.anInt664 * 0.02454369D);
		}
		this.aDouble7 = ((double) arg2 - this.aDouble6 - local20 * this.aDouble5) * 2.0D / (local20 * local20);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZ)V")
	public void method371(@OriginalArg(0) int arg0) {
		this.aDouble3 += (double) arg0 * this.aDouble2;
		this.aDouble1 += (double) arg0 * this.aDouble4;
		this.aDouble6 += (double) arg0 * this.aDouble5 + (double) arg0 * this.aDouble7 * 0.5D * (double) arg0;
		this.aDouble5 += (double) arg0 * this.aDouble7;
		this.aBoolean25 = true;
		this.anInt674 = (int) (Math.atan2(this.aDouble4, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
		this.anInt665 = (int) (Math.atan2(this.aDouble5, this.aDouble8) * 325.949D) & 0x7FF;
		if (this.aClass4_Sub3_Sub10_1 == null) {
			return;
		}
		this.anInt667 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass4_Sub3_Sub10_1.anIntArray218[this.anInt672] >= this.anInt667) {
						return;
					}
					this.anInt667 -= this.aClass4_Sub3_Sub10_1.anIntArray218[this.anInt672];
					this.anInt672++;
				} while (this.anInt672 < this.aClass4_Sub3_Sub10_1.anIntArray216.length);
				this.anInt672 -= this.aClass4_Sub3_Sub10_1.anInt1873;
			} while (this.anInt672 >= 0 && this.anInt672 < this.aClass4_Sub3_Sub10_1.anIntArray216.length);
			this.anInt672 = 0;
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(B)Lclient!qb;")
	@Override
	public Class4_Sub3_Sub1_Sub7 method1484() {
		@Pc(8) Class4_Sub3_Sub4 local8 = Static46.method642(this.anInt678);
		@Pc(14) Class4_Sub3_Sub1_Sub7 local14 = local8.method417(this.anInt672);
		if (local14 == null) {
			return null;
		} else {
			local14.method1499(this.anInt665);
			return local14;
		}
	}
}

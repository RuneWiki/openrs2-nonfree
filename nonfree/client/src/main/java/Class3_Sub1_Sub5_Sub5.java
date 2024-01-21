import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class3_Sub1_Sub5_Sub5 extends Class3_Sub1_Sub5 {

	@OriginalMember(owner = "client!ka", name = "Lb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!ka", name = "Ob", descriptor = "I")
	public int anInt1793;

	@OriginalMember(owner = "client!ka", name = "Qb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!ka", name = "Rb", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!ka", name = "Tb", descriptor = "I")
	private int anInt1795;

	@OriginalMember(owner = "client!ka", name = "Wb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ka", name = "Zb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!ka", name = "ac", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!ka", name = "cc", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!ka", name = "fc", descriptor = "D")
	public double aDouble9;

	@OriginalMember(owner = "client!ka", name = "tb", descriptor = "I")
	private int anInt1777 = 0;

	@OriginalMember(owner = "client!ka", name = "zb", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "client!ka", name = "Nb", descriptor = "I")
	private int anInt1792 = 0;

	@OriginalMember(owner = "client!ka", name = "Fb", descriptor = "I")
	private final int anInt1786;

	@OriginalMember(owner = "client!ka", name = "Vb", descriptor = "I")
	private final int anInt1797;

	@OriginalMember(owner = "client!ka", name = "hc", descriptor = "I")
	private final int anInt1802;

	@OriginalMember(owner = "client!ka", name = "gc", descriptor = "I")
	public final int anInt1801;

	@OriginalMember(owner = "client!ka", name = "Kb", descriptor = "I")
	private final int anInt1791;

	@OriginalMember(owner = "client!ka", name = "sb", descriptor = "I")
	private final int anInt1776;

	@OriginalMember(owner = "client!ka", name = "wb", descriptor = "I")
	public final int anInt1780;

	@OriginalMember(owner = "client!ka", name = "Ib", descriptor = "I")
	public final int anInt1789;

	@OriginalMember(owner = "client!ka", name = "vb", descriptor = "I")
	public final int anInt1779;

	@OriginalMember(owner = "client!ka", name = "xb", descriptor = "I")
	public final int anInt1781;

	@OriginalMember(owner = "client!ka", name = "Eb", descriptor = "I")
	private final int anInt1785;

	@OriginalMember(owner = "client!ka", name = "pb", descriptor = "Lclient!uc;")
	private final Class3_Sub1_Sub17 aClass3_Sub1_Sub17_2;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class3_Sub1_Sub5_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1786 = arg7;
		this.anInt1797 = arg8;
		this.anInt1802 = arg4;
		this.anInt1801 = arg6;
		this.anInt1791 = arg2;
		this.anInt1776 = arg0;
		this.anInt1780 = arg5;
		this.anInt1789 = arg9;
		this.aBoolean94 = false;
		this.anInt1779 = arg10;
		this.anInt1781 = arg1;
		this.anInt1785 = arg3;
		@Pc(52) int local52 = Static90.method1658(this.anInt1776).anInt1307;
		if (local52 == -1) {
			this.aClass3_Sub1_Sub17_2 = null;
		} else {
			this.aClass3_Sub1_Sub17_2 = Static111.method2009(local52);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII)V")
	public void method1181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) double local8;
		if (!this.aBoolean94) {
			local8 = arg0 - this.anInt1791;
			@Pc(15) double local15 = (double) (arg3 - this.anInt1785);
			@Pc(24) double local24 = Math.sqrt(local15 * local15 + local8 * local8);
			this.aDouble4 = this.anInt1802;
			this.aDouble9 = (double) this.anInt1791 + local8 * (double) this.anInt1797 / local24;
			this.aDouble7 = (double) this.anInt1785 + local15 * (double) this.anInt1797 / local24;
		}
		local8 = this.anInt1801 + 1 - arg2;
		this.aDouble3 = ((double) arg3 - this.aDouble7) / local8;
		this.aDouble2 = ((double) arg0 - this.aDouble9) / local8;
		this.aDouble6 = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble2 * this.aDouble2);
		if (!this.aBoolean94) {
			this.aDouble5 = -this.aDouble6 * Math.tan((double) this.anInt1786 * 0.02454369D);
		}
		this.aDouble8 = ((double) arg1 - local8 * this.aDouble5 - this.aDouble4) * 2.0D / (local8 * local8);
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(Z)Lclient!oa;")
	@Override
	public Class3_Sub1_Sub5_Sub7 method1874() {
		@Pc(8) Class3_Sub1_Sub8 local8 = Static90.method1658(this.anInt1776);
		@Pc(14) Class3_Sub1_Sub5_Sub7 local14 = local8.method814(this.anInt1777);
		if (local14 == null) {
			return null;
		} else {
			local14.method1484(this.anInt1795);
			return local14;
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
	public void method1187(@OriginalArg(0) int arg0) {
		this.aDouble9 += this.aDouble2 * (double) arg0;
		this.aDouble7 += this.aDouble3 * (double) arg0;
		this.aBoolean94 = true;
		this.aDouble4 += this.aDouble5 * (double) arg0 + (double) arg0 * this.aDouble8 * 0.5D * (double) arg0;
		this.aDouble5 += this.aDouble8 * (double) arg0;
		this.anInt1793 = (int) (Math.atan2(this.aDouble2, this.aDouble3) * 325.949D) + 1024 & 0x7FF;
		this.anInt1795 = (int) (Math.atan2(this.aDouble5, this.aDouble6) * 325.949D) & 0x7FF;
		if (this.aClass3_Sub1_Sub17_2 == null) {
			return;
		}
		this.anInt1792 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass3_Sub1_Sub17_2.anIntArray374[this.anInt1777] >= this.anInt1792) {
						return;
					}
					this.anInt1792 -= this.aClass3_Sub1_Sub17_2.anIntArray374[this.anInt1777];
					this.anInt1777++;
				} while (this.aClass3_Sub1_Sub17_2.anIntArray377.length > this.anInt1777);
				this.anInt1777 -= this.aClass3_Sub1_Sub17_2.anInt3109;
			} while (this.anInt1777 >= 0 && this.aClass3_Sub1_Sub17_2.anIntArray377.length > this.anInt1777);
			this.anInt1777 = 0;
		}
	}
}

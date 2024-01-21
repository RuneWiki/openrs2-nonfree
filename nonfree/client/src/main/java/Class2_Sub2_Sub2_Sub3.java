import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class2_Sub2_Sub2_Sub3 extends Class2_Sub2_Sub2 {

	@OriginalMember(owner = "client!i", name = "mb", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!i", name = "Bb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!i", name = "Eb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!i", name = "Lb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!i", name = "Mb", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!i", name = "Nb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!i", name = "Pb", descriptor = "I")
	public int anInt1150;

	@OriginalMember(owner = "client!i", name = "Sb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!i", name = "gc", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!i", name = "hc", descriptor = "I")
	private int anInt1161;

	@OriginalMember(owner = "client!i", name = "pb", descriptor = "I")
	private int anInt1136 = 0;

	@OriginalMember(owner = "client!i", name = "Ub", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!i", name = "Vb", descriptor = "I")
	private int anInt1152 = 0;

	@OriginalMember(owner = "client!i", name = "Gb", descriptor = "I")
	private final int anInt1146;

	@OriginalMember(owner = "client!i", name = "vb", descriptor = "I")
	public final int anInt1141;

	@OriginalMember(owner = "client!i", name = "yb", descriptor = "I")
	private final int anInt1143;

	@OriginalMember(owner = "client!i", name = "Tb", descriptor = "I")
	private final int anInt1151;

	@OriginalMember(owner = "client!i", name = "cc", descriptor = "I")
	private final int anInt1158;

	@OriginalMember(owner = "client!i", name = "ac", descriptor = "I")
	private final int anInt1156;

	@OriginalMember(owner = "client!i", name = "Ab", descriptor = "I")
	public final int anInt1144;

	@OriginalMember(owner = "client!i", name = "qb", descriptor = "I")
	public final int anInt1137;

	@OriginalMember(owner = "client!i", name = "nb", descriptor = "I")
	public final int anInt1134;

	@OriginalMember(owner = "client!i", name = "Jb", descriptor = "I")
	private final int anInt1149;

	@OriginalMember(owner = "client!i", name = "sb", descriptor = "I")
	public final int anInt1139;

	@OriginalMember(owner = "client!i", name = "Wb", descriptor = "Lclient!ma;")
	private final Class2_Sub2_Sub11 aClass2_Sub2_Sub11_2;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class2_Sub2_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1146 = arg7;
		this.anInt1141 = arg10;
		this.anInt1143 = arg0;
		this.anInt1151 = arg4;
		this.anInt1158 = arg8;
		this.anInt1156 = arg3;
		this.aBoolean48 = false;
		this.anInt1144 = arg9;
		this.anInt1137 = arg1;
		this.anInt1134 = arg5;
		this.anInt1149 = arg2;
		this.anInt1139 = arg6;
		@Pc(52) int local52 = Static38.method653(this.anInt1143).anInt417;
		if (local52 == -1) {
			this.aClass2_Sub2_Sub11_2 = null;
		} else {
			this.aClass2_Sub2_Sub11_2 = Static12.method270(local52);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIIII)V")
	public void method790(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) double local14;
		if (!this.aBoolean48) {
			local14 = arg3 - this.anInt1149;
			@Pc(21) double local21 = (double) (arg0 - this.anInt1156);
			@Pc(30) double local30 = Math.sqrt(local14 * local14 + local21 * local21);
			this.aDouble8 = this.anInt1151;
			this.aDouble1 = (double) this.anInt1149 + local14 * (double) this.anInt1158 / local30;
			this.aDouble5 = (double) this.anInt1156 + (double) this.anInt1158 * local21 / local30;
		}
		local14 = this.anInt1139 + 1 - arg1;
		this.aDouble3 = ((double) arg3 - this.aDouble1) / local14;
		this.aDouble2 = ((double) arg0 - this.aDouble5) / local14;
		this.aDouble4 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble3 * this.aDouble3);
		if (!this.aBoolean48) {
			this.aDouble6 = -this.aDouble4 * Math.tan((double) this.anInt1146 * 0.02454369D);
		}
		this.aDouble7 = ((double) arg2 - this.aDouble8 - this.aDouble6 * local14) * 2.0D / (local14 * local14);
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(B)Lclient!na;")
	@Override
	public Class2_Sub2_Sub2_Sub5 method1855() {
		@Pc(8) Class2_Sub2_Sub4 local8 = Static38.method653(this.anInt1143);
		@Pc(14) Class2_Sub2_Sub2_Sub5 local14 = local8.method341(this.anInt1136);
		if (local14 == null) {
			return null;
		} else {
			local14.method1139(this.anInt1161);
			return local14;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)V")
	public void method796(@OriginalArg(0) int arg0) {
		this.aDouble5 += this.aDouble2 * (double) arg0;
		this.aDouble1 += this.aDouble3 * (double) arg0;
		this.aDouble8 += this.aDouble6 * (double) arg0 + (double) arg0 * 0.5D * this.aDouble7 * (double) arg0;
		this.aBoolean48 = true;
		this.aDouble6 += (double) arg0 * this.aDouble7;
		this.anInt1150 = (int) (Math.atan2(this.aDouble3, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
		this.anInt1161 = (int) (Math.atan2(this.aDouble6, this.aDouble4) * 325.949D) & 0x7FF;
		if (this.aClass2_Sub2_Sub11_2 == null) {
			return;
		}
		this.anInt1152 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass2_Sub2_Sub11_2.anIntArray191[this.anInt1136] >= this.anInt1152) {
						return;
					}
					this.anInt1152 -= this.aClass2_Sub2_Sub11_2.anIntArray191[this.anInt1136];
					this.anInt1136++;
				} while (this.anInt1136 < this.aClass2_Sub2_Sub11_2.anIntArray192.length);
				this.anInt1136 -= this.aClass2_Sub2_Sub11_2.anInt1511;
			} while (this.anInt1136 >= 0 && this.aClass2_Sub2_Sub11_2.anIntArray192.length > this.anInt1136);
			this.anInt1136 = 0;
		}
	}
}

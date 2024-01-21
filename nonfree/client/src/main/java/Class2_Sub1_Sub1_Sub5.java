import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class2_Sub1_Sub1_Sub5 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!hf", name = "lb", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!hf", name = "yb", descriptor = "I")
	public int anInt1181;

	@OriginalMember(owner = "client!hf", name = "Eb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!hf", name = "Hb", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!hf", name = "Ib", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!hf", name = "Jb", descriptor = "I")
	private int anInt1186;

	@OriginalMember(owner = "client!hf", name = "Sb", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!hf", name = "Wb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!hf", name = "dc", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!hf", name = "fc", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!hf", name = "rb", descriptor = "I")
	private int anInt1174 = 0;

	@OriginalMember(owner = "client!hf", name = "Qb", descriptor = "I")
	private int anInt1190 = 0;

	@OriginalMember(owner = "client!hf", name = "Lb", descriptor = "Z")
	private boolean aBoolean84 = false;

	@OriginalMember(owner = "client!hf", name = "Kb", descriptor = "I")
	public final int anInt1187;

	@OriginalMember(owner = "client!hf", name = "qb", descriptor = "I")
	public final int anInt1173;

	@OriginalMember(owner = "client!hf", name = "tb", descriptor = "I")
	private final int anInt1176;

	@OriginalMember(owner = "client!hf", name = "Zb", descriptor = "I")
	public final int anInt1192;

	@OriginalMember(owner = "client!hf", name = "Nb", descriptor = "I")
	private final int anInt1189;

	@OriginalMember(owner = "client!hf", name = "ec", descriptor = "I")
	private final int anInt1193;

	@OriginalMember(owner = "client!hf", name = "kb", descriptor = "I")
	private final int anInt1170;

	@OriginalMember(owner = "client!hf", name = "pb", descriptor = "I")
	public final int anInt1172;

	@OriginalMember(owner = "client!hf", name = "gc", descriptor = "I")
	public final int anInt1194;

	@OriginalMember(owner = "client!hf", name = "Mb", descriptor = "I")
	private final int anInt1188;

	@OriginalMember(owner = "client!hf", name = "nb", descriptor = "I")
	private final int anInt1171;

	@OriginalMember(owner = "client!hf", name = "Db", descriptor = "Lclient!nc;")
	private final Class2_Sub1_Sub7 aClass2_Sub1_Sub7_2;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class2_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.aBoolean84 = false;
		this.anInt1187 = arg5;
		this.anInt1173 = arg1;
		this.anInt1176 = arg8;
		this.anInt1192 = arg6;
		this.anInt1189 = arg0;
		this.anInt1193 = arg2;
		this.anInt1170 = arg3;
		this.anInt1172 = arg9;
		this.anInt1194 = arg10;
		this.anInt1188 = arg4;
		this.anInt1171 = arg7;
		@Pc(52) int local52 = Static63.method291(this.anInt1189).anInt2810;
		if (local52 == -1) {
			this.aClass2_Sub1_Sub7_2 = null;
		} else {
			this.aClass2_Sub1_Sub7_2 = Static40.method724(local52);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
	public void method810(@OriginalArg(1) int arg0) {
		this.aDouble3 += this.aDouble6 * (double) arg0;
		this.aDouble5 += (double) arg0 * this.aDouble1;
		this.aDouble7 += (double) arg0 * this.aDouble8 * 0.5D * (double) arg0 + (double) arg0 * this.aDouble2;
		this.aBoolean84 = true;
		this.aDouble2 += this.aDouble8 * (double) arg0;
		this.anInt1181 = (int) (Math.atan2(this.aDouble6, this.aDouble1) * 325.949D) + 1024 & 0x7FF;
		this.anInt1186 = (int) (Math.atan2(this.aDouble2, this.aDouble4) * 325.949D) & 0x7FF;
		if (this.aClass2_Sub1_Sub7_2 == null) {
			return;
		}
		this.anInt1174 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt1174 <= this.aClass2_Sub1_Sub7_2.anIntArray210[this.anInt1190]) {
						return;
					}
					this.anInt1174 -= this.aClass2_Sub1_Sub7_2.anIntArray210[this.anInt1190];
					this.anInt1190++;
				} while (this.anInt1190 < this.aClass2_Sub1_Sub7_2.anIntArray212.length);
				this.anInt1190 -= this.aClass2_Sub1_Sub7_2.anInt1974;
			} while (this.anInt1190 >= 0 && this.anInt1190 < this.aClass2_Sub1_Sub7_2.anIntArray212.length);
			this.anInt1190 = 0;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIZ)V")
	public void method811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) double local12;
		if (!this.aBoolean84) {
			local12 = arg2 - this.anInt1193;
			@Pc(19) double local19 = (double) (arg1 - this.anInt1170);
			@Pc(28) double local28 = Math.sqrt(local19 * local19 + local12 * local12);
			this.aDouble7 = this.anInt1188;
			this.aDouble3 = (double) this.anInt1176 * local12 / local28 + (double) this.anInt1193;
			this.aDouble5 = (double) this.anInt1176 * local19 / local28 + (double) this.anInt1170;
		}
		local12 = this.anInt1192 + 1 - arg3;
		this.aDouble1 = ((double) arg1 - this.aDouble5) / local12;
		this.aDouble6 = ((double) arg2 - this.aDouble3) / local12;
		this.aDouble4 = Math.sqrt(this.aDouble6 * this.aDouble6 + this.aDouble1 * this.aDouble1);
		if (!this.aBoolean84) {
			this.aDouble2 = -this.aDouble4 * Math.tan((double) this.anInt1171 * 0.02454369D);
		}
		this.aDouble8 = ((double) arg0 - this.aDouble2 * local12 - this.aDouble7) * 2.0D / (local12 * local12);
	}

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)Lclient!ad;")
	@Override
	public Class2_Sub1_Sub1_Sub2 method2168() {
		@Pc(8) Class2_Sub1_Sub14 local8 = Static63.method291(this.anInt1189);
		@Pc(14) Class2_Sub1_Sub1_Sub2 local14 = local8.method2026(this.anInt1190);
		if (local14 == null) {
			return null;
		} else {
			local14.method107(this.anInt1186);
			return local14;
		}
	}
}

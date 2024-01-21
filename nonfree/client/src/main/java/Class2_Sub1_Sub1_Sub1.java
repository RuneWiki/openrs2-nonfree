import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class2_Sub1_Sub1_Sub1 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "xb", descriptor = "I")
	private final int anInt99;

	@OriginalMember(owner = "client!ab", name = "yb", descriptor = "I")
	private final int anInt100;

	@OriginalMember(owner = "client!ab", name = "kb", descriptor = "I")
	private final int anInt88;

	@OriginalMember(owner = "client!ab", name = "rb", descriptor = "I")
	private final int anInt95;

	@OriginalMember(owner = "client!ab", name = "qb", descriptor = "I")
	private final int anInt94;

	@OriginalMember(owner = "client!ab", name = "ub", descriptor = "I")
	private final int anInt97;

	@OriginalMember(owner = "client!ab", name = "vb", descriptor = "Lclient!nc;")
	private Class2_Sub1_Sub7 aClass2_Sub1_Sub7_1;

	@OriginalMember(owner = "client!ab", name = "pb", descriptor = "I")
	private int anInt93;

	@OriginalMember(owner = "client!ab", name = "mb", descriptor = "I")
	private int anInt90;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIIIIIZLclient!pa;)V")
	public Class2_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class2_Sub1_Sub1 arg8) {
		this.anInt99 = arg0;
		this.anInt100 = arg5;
		this.anInt88 = arg1;
		this.anInt95 = arg3;
		this.anInt94 = arg4;
		this.anInt97 = arg2;
		if (arg6 != -1) {
			this.aClass2_Sub1_Sub7_1 = Static40.method724(arg6);
			this.anInt93 = 0;
			this.anInt90 = Static28.anInt704 - 1;
			if (this.aClass2_Sub1_Sub7_1.anInt1972 == 0 && arg8 != null && arg8 instanceof Class2_Sub1_Sub1_Sub1) {
				@Pc(50) Class2_Sub1_Sub1_Sub1 local50 = (Class2_Sub1_Sub1_Sub1) arg8;
				if (local50.aClass2_Sub1_Sub7_1 == this.aClass2_Sub1_Sub7_1) {
					this.anInt93 = local50.anInt93;
					this.anInt90 = local50.anInt90;
					return;
				}
			}
			if (arg7 && this.aClass2_Sub1_Sub7_1.anInt1974 != -1) {
				this.anInt93 = (int) (Math.random() * (double) this.aClass2_Sub1_Sub7_1.anIntArray212.length);
				this.anInt90 -= (int) (Math.random() * (double) this.aClass2_Sub1_Sub7_1.anIntArray210[this.anInt93]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)Lclient!ad;")
	@Override
	public Class2_Sub1_Sub1_Sub2 method2168() {
		if (this.aClass2_Sub1_Sub7_1 != null) {
			@Pc(17) int local17 = Static28.anInt704 - this.anInt90;
			if (local17 > 100 && this.aClass2_Sub1_Sub7_1.anInt1974 > 0) {
				local17 = 100;
			}
			label46: {
				do {
					do {
						if (local17 <= this.aClass2_Sub1_Sub7_1.anIntArray210[this.anInt93]) {
							break label46;
						}
						local17 -= this.aClass2_Sub1_Sub7_1.anIntArray210[this.anInt93];
						this.anInt93++;
					} while (this.anInt93 < this.aClass2_Sub1_Sub7_1.anIntArray212.length);
					this.anInt93 -= this.aClass2_Sub1_Sub7_1.anInt1974;
				} while (this.anInt93 >= 0 && this.anInt93 < this.aClass2_Sub1_Sub7_1.anIntArray212.length);
				this.aClass2_Sub1_Sub7_1 = null;
			}
			this.anInt90 = Static28.anInt704 - local17;
		}
		@Pc(104) Class2_Sub1_Sub4 local104 = Static107.method1839(this.anInt99);
		if (local104.anIntArray103 != null) {
			local104 = local104.method705();
		}
		if (local104 == null) {
			return null;
		}
		@Pc(131) int local131;
		@Pc(128) int local128;
		if (this.anInt97 == 1 || this.anInt97 == 3) {
			local128 = local104.anInt1036;
			local131 = local104.anInt1066;
		} else {
			local128 = local104.anInt1066;
			local131 = local104.anInt1036;
		}
		@Pc(146) int local146 = this.anInt94 + (local131 >> 1);
		@Pc(153) int local153 = this.anInt100 + (local128 >> 1);
		@Pc(158) int[][] local158 = Static118.anIntArrayArrayArray6[this.anInt95];
		@Pc(167) int local167 = (local131 << 6) + (this.anInt94 << 7);
		@Pc(176) int local176 = (local131 + 1 >> 1) + this.anInt94;
		@Pc(185) int local185 = (local128 + 1 >> 1) + this.anInt100;
		@Pc(212) int local212 = local158[local176][local185] + local158[local176][local153] + local158[local146][local153] + local158[local146][local185] >> 2;
		@Pc(222) int local222 = (this.anInt100 << 7) + (local128 << 6);
		return local104.method699(this.aClass2_Sub1_Sub7_1, local222, local167, local158, this.anInt88, local212, this.anInt93, this.anInt97);
	}
}

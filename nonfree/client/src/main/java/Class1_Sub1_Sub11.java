import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
	private int anInt2071;

	@OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
	private int anInt2075;

	@OriginalMember(owner = "client!gi", name = "Z", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
	private int anInt2067 = -1;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub11() {
		super(0, false);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method4714(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass45_41.method1139(arg0);
		if (this.aClass45_41.aBoolean95 && this.method1532()) {
			@Pc(48) int local48 = this.anInt2075 * (this.anInt2071 == Static265.anInt5306 ? arg0 : this.anInt2071 * arg0 / Static265.anInt5306);
			@Pc(52) int[] local52 = local18[1];
			@Pc(56) int[] local56 = local18[0];
			@Pc(60) int[] local60 = local18[2];
			@Pc(66) int local66;
			@Pc(75) int local75;
			if (this.anInt2075 == Static62.anInt1350) {
				for (local66 = 0; local66 < Static62.anInt1350; local66++) {
					local75 = this.anIntArray206[local48++];
					local60[local66] = (local75 & 0xFF) << 4;
					local52[local66] = local75 >> 4 & 0xFF0;
					local56[local66] = local75 >> 12 & 0xFF0;
				}
			} else {
				for (local66 = 0; local66 < Static62.anInt1350; local66++) {
					local75 = local66 * this.anInt2075 / Static62.anInt1350;
					@Pc(123) int local123 = this.anIntArray206[local48 + local75];
					local60[local66] = (local123 & 0xFF) << 4;
					local52[local66] = local123 >> 4 & 0xFF0;
					local56[local66] = local123 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(B)Z")
	private boolean method1532() {
		if (this.anIntArray206 != null) {
			return true;
		} else if (this.anInt2067 < 0) {
			return false;
		} else {
			@Pc(22) int local22 = Static265.anInt5306;
			@Pc(24) int local24 = Static62.anInt1350;
			@Pc(35) int local35 = Static252.anInterface3_1.method4585(this.anInt2067).aBoolean169 ? 64 : 128;
			this.anIntArray206 = Static252.anInterface3_1.method4586(this.anInt2067, local35, local35, 1.0F);
			this.anInt2071 = local35;
			this.anInt2075 = local35;
			Static269.method4050(local24, local22);
			return this.anIntArray206 != null;
		}
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
	@Override
	public void method4726() {
		super.method4726();
		this.anIntArray206 = null;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2067 = arg0.method2244();
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)I")
	@Override
	public int method4723() {
		return this.anInt2067;
	}
}

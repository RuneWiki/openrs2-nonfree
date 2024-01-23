import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class1_Sub2_Sub12 extends Class1_Sub2 {

	@OriginalMember(owner = "client!im", name = "N", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!im", name = "S", descriptor = "I")
	private int anInt2406;

	@OriginalMember(owner = "client!im", name = "U", descriptor = "I")
	private int anInt2408;

	@OriginalMember(owner = "client!im", name = "X", descriptor = "I")
	private int anInt2411 = -1;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub12() {
		super(0, false);
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V")
	@Override
	public void method4580() {
		super.method4580();
		this.anIntArray197 = null;
	}

	@OriginalMember(owner = "client!im", name = "e", descriptor = "(I)I")
	@Override
	public int method4576() {
		return this.anInt2411;
	}

	@OriginalMember(owner = "client!im", name = "g", descriptor = "(I)Z")
	private boolean method1923() {
		if (this.anIntArray197 != null) {
			return true;
		} else if (this.anInt2411 < 0) {
			return false;
		} else {
			@Pc(23) int local23 = Static299.anInt5670;
			@Pc(25) int local25 = Static202.anInt4038;
			@Pc(36) int local36 = Static283.anInterface5_1.method1620(this.anInt2411).aBoolean275 ? 64 : 128;
			this.anIntArray197 = Static283.anInterface5_1.method1618(1.0F, this.anInt2411, local36, local36);
			this.anInt2406 = local36;
			this.anInt2408 = local36;
			Static68.method1140(local23, local25);
			return this.anIntArray197 != null;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2411 = arg0.method2593();
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4572(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = this.aClass151_41.method3758(arg0);
		if (this.aClass151_41.aBoolean344 && this.method1923()) {
			@Pc(28) int[] local28 = local13[0];
			@Pc(44) int local44 = (this.anInt2406 == Static202.anInt4038 ? arg0 : arg0 * this.anInt2406 / Static202.anInt4038) * this.anInt2408;
			@Pc(48) int[] local48 = local13[1];
			@Pc(52) int[] local52 = local13[2];
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (this.anInt2408 == Static299.anInt5670) {
				for (local62 = 0; local62 < Static299.anInt5670; local62++) {
					local71 = this.anIntArray197[local44++];
					local52[local62] = (local71 & 0xFF) << 4;
					local48[local62] = local71 >> 4 & 0xFF0;
					local28[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static299.anInt5670; local62++) {
					local71 = local62 * this.anInt2408 / Static299.anInt5670;
					@Pc(119) int local119 = this.anIntArray197[local71 + local44];
					local52[local62] = (local119 & 0xFF) << 4;
					local48[local62] = local119 >> 4 & 0xFF0;
					local28[local62] = local119 >> 12 & 0xFF0;
				}
			}
		}
		return local13;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class2_Sub1_Sub33 extends Class2_Sub1 {

	@OriginalMember(owner = "client!s", name = "R", descriptor = "I")
	private int anInt4076;

	@OriginalMember(owner = "client!s", name = "S", descriptor = "I")
	private int anInt4077;

	@OriginalMember(owner = "client!s", name = "jb", descriptor = "[I")
	private int[] anIntArray426;

	@OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
	private int anInt4082 = -1;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub33() {
		super(0, false);
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3211(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass99_41.method3152(arg0);
		if (super.aClass99_41.aBoolean280 && this.method2813()) {
			@Pc(40) int local40 = this.anInt4077 * (Static25.anInt4767 == this.anInt4076 ? arg0 : arg0 * this.anInt4076 / Static25.anInt4767);
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (Static62.anInt1675 == this.anInt4077) {
				for (local62 = 0; local62 < Static62.anInt1675; local62++) {
					local71 = this.anIntArray426[local40++];
					local52[local62] = (local71 & 0xFF) << 4;
					local48[local62] = local71 >> 4 & 0xFF0;
					local44[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static62.anInt1675; local62++) {
					local71 = this.anInt4077 * local62 / Static62.anInt1675;
					@Pc(78) int local78 = this.anIntArray426[local71 + local40];
					local52[local62] = (local78 & 0xFF) << 4;
					local48[local62] = local78 >> 4 & 0xFF0;
					local44[local62] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4082 = arg0.method163();
		}
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(I)I")
	@Override
	public int method3214() {
		return this.anInt4082;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
	@Override
	public void method3212() {
		super.method3212();
		this.anIntArray426 = null;
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(I)Z")
	private boolean method2813() {
		if (this.anIntArray426 != null) {
			return true;
		} else if (this.anInt4082 >= 0) {
			@Pc(13) int local13 = Static62.anInt1675;
			@Pc(15) int local15 = Static25.anInt4767;
			@Pc(25) int local25 = Static216.anInterface1_2.method1134(this.anInt4082) ? 64 : 128;
			this.anIntArray426 = Static216.anInterface1_2.method1137(this.anInt4082);
			this.anInt4076 = local25;
			this.anInt4077 = local25;
			Static104.method1778(local13, local15);
			return this.anIntArray426 != null;
		} else {
			return false;
		}
	}
}

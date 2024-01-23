import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public class Class2_Sub1_Sub9 extends Class2_Sub1 {

	@OriginalMember(owner = "client!mi", name = "Q", descriptor = "I")
	protected int anInt1519;

	@OriginalMember(owner = "client!mi", name = "R", descriptor = "[I")
	protected int[] anIntArray155;

	@OriginalMember(owner = "client!mi", name = "V", descriptor = "I")
	protected int anInt1523;

	@OriginalMember(owner = "client!mi", name = "U", descriptor = "I")
	private int anInt1522 = -1;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub9() {
		super(0, false);
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)I")
	@Override
	public final int method3208() {
		return this.anInt1522;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3211(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass99_41.method3152(arg0);
		if (super.aClass99_41.aBoolean280 && this.method1051()) {
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			@Pc(48) int local48 = this.anInt1523 * (this.anInt1519 == Static25.anInt4767 ? arg0 : this.anInt1519 * arg0 / Static25.anInt4767);
			@Pc(52) int[] local52 = local16[0];
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (this.anInt1523 == Static62.anInt1675) {
				for (local62 = 0; local62 < Static62.anInt1675; local62++) {
					local71 = this.anIntArray155[local48++];
					local32[local62] = (local71 & 0xFF) << 4;
					local28[local62] = local71 >> 4 & 0xFF0;
					local52[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static62.anInt1675; local62++) {
					local71 = local62 * this.anInt1523 / Static62.anInt1675;
					@Pc(78) int local78 = this.anIntArray155[local71 + local48];
					local32[local62] = (local78 & 0xFF) << 4;
					local28[local62] = local78 >> 4 & 0xFF0;
					local52[local62] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)Z")
	protected final boolean method1051() {
		if (this.anIntArray155 != null) {
			return true;
		} else if (this.anInt1522 >= 0) {
			@Pc(20) Class2_Sub2_Sub16_Sub1 local20 = Static35.method684(Static36.aClass15_9, this.anInt1522);
			local20.method2425();
			this.anInt1523 = local20.anInt3493;
			this.anInt1519 = local20.anInt3491;
			this.anIntArray155 = local20.anIntArray354;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public final void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1522 = arg0.method163();
		}
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
	@Override
	public final void method3212() {
		super.method3212();
		this.anIntArray155 = null;
	}
}

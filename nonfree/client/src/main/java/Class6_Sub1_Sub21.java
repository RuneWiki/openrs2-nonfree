import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public class Class6_Sub1_Sub21 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ko", name = "Q", descriptor = "I")
	protected int anInt6085;

	@OriginalMember(owner = "client!ko", name = "T", descriptor = "I")
	protected int anInt6088;

	@OriginalMember(owner = "client!ko", name = "V", descriptor = "[I")
	protected int[] anIntArray694;

	@OriginalMember(owner = "client!ko", name = "W", descriptor = "I")
	private int anInt6090 = -1;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub21() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public final void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6090 = arg0.method4021();
		}
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)V")
	@Override
	public final void method5613() {
		super.method5613();
		this.anIntArray694 = null;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5608(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass220_41.method5816(arg0);
		if (super.aClass220_41.aBoolean429 && this.method5487()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(52) int local52 = this.anInt6088 * (this.anInt6085 == Static273.anInt6145 ? arg0 : arg0 * this.anInt6085 / Static273.anInt6145);
			@Pc(58) int local58;
			@Pc(66) int local66;
			if (this.anInt6088 == Static299.anInt5659) {
				for (local58 = 0; local58 < Static299.anInt5659; local58++) {
					local66 = this.anIntArray694[local52++];
					local36[local58] = (local66 & 0xFF) << 4;
					local32[local58] = local66 >> 4 & 0xFF0;
					local28[local58] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static299.anInt5659; local58++) {
					local66 = local58 * this.anInt6088 / Static299.anInt5659;
					@Pc(119) int local119 = this.anIntArray694[local52 + local66];
					local36[local58] = (local119 & 0xFF) << 4;
					local32[local58] = local119 >> 4 & 0xFF0;
					local28[local58] = local119 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ko", name = "j", descriptor = "(I)Z")
	protected final boolean method5487() {
		if (this.anIntArray694 != null) {
			return true;
		} else if (this.anInt6090 >= 0) {
			@Pc(30) Class88 local30 = Static256.anInt4740 < 0 ? Static363.method2253(Static39.aClass53_29, this.anInt6090) : Static363.method2255(Static39.aClass53_29, Static256.anInt4740, this.anInt6090);
			local30.method2251();
			this.anIntArray694 = local30.method2257();
			this.anInt6085 = local30.anInt2081;
			this.anInt6088 = local30.anInt2079;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)I")
	@Override
	public final int method5610() {
		return this.anInt6090;
	}
}

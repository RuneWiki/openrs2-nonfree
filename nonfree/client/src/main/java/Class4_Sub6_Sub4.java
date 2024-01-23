import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public class Class4_Sub6_Sub4 extends Class4_Sub6 {

	@OriginalMember(owner = "client!bo", name = "H", descriptor = "I")
	protected int anInt1297;

	@OriginalMember(owner = "client!bo", name = "Y", descriptor = "[I")
	protected int[] anIntArray140;

	@OriginalMember(owner = "client!bo", name = "ab", descriptor = "I")
	protected int anInt1311;

	@OriginalMember(owner = "client!bo", name = "T", descriptor = "I")
	private int anInt1306 = -1;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub4() {
		super(0, false);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4379(@OriginalArg(0) int arg0) {
		@Pc(14) int[][] local14 = this.aClass84_41.method2153(arg0);
		if (this.aClass84_41.aBoolean183 && this.method1072()) {
			@Pc(31) int[] local31 = local14[0];
			@Pc(47) int local47 = (this.anInt1297 == Static16.anInt308 ? arg0 : arg0 * this.anInt1297 / Static16.anInt308) * this.anInt1311;
			@Pc(51) int[] local51 = local14[1];
			@Pc(55) int[] local55 = local14[2];
			@Pc(61) int local61;
			@Pc(74) int local74;
			if (this.anInt1311 == Static2.anInt19) {
				for (local61 = 0; local61 < Static2.anInt19; local61++) {
					local74 = this.anIntArray140[local47++];
					local55[local61] = (local74 & 0xFF) << 4;
					local51[local61] = local74 >> 4 & 0xFF0;
					local31[local61] = local74 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static2.anInt19; local61++) {
					local74 = this.anInt1311 * local61 / Static2.anInt19;
					@Pc(122) int local122 = this.anIntArray140[local74 + local47];
					local55[local61] = (local122 & 0xFF) << 4;
					local51[local61] = local122 >> 4 & 0xFF0;
					local31[local61] = local122 >> 12 & 0xFF0;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
	@Override
	public final void method4373() {
		super.method4373();
		this.anIntArray140 = null;
	}

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "(I)Z")
	protected final boolean method1072() {
		if (this.anIntArray140 != null) {
			return true;
		} else if (this.anInt1306 >= 0) {
			@Pc(37) Class4_Sub2_Sub1_Sub1 local37 = Static258.anInt4864 >= 0 ? Static165.method2603(Static258.anInt4864, this.anInt1306, Static211.aClass98_127) : Static145.method2347(this.anInt1306, Static211.aClass98_127);
			local37.method3470();
			this.anInt1297 = local37.anInt4308;
			this.anIntArray140 = local37.anIntArray387;
			this.anInt1311 = local37.anInt4301;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public final void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1306 = arg0.method1837();
		}
	}

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)I")
	@Override
	public final int method4384() {
		return this.anInt1306;
	}
}

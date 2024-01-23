import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
	protected int anInt5934;

	@OriginalMember(owner = "client!aa", name = "cb", descriptor = "[I")
	protected int[] anIntArray511;

	@OriginalMember(owner = "client!aa", name = "eb", descriptor = "I")
	protected int anInt5944;

	@OriginalMember(owner = "client!aa", name = "bb", descriptor = "I")
	private int anInt5942 = -1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub1() {
		super(0, false);
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
	@Override
	public final void method4936() {
		super.method4936();
		this.anIntArray511 = null;
	}

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)I")
	@Override
	public final int method4945() {
		return this.anInt5942;
	}

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)Z")
	protected final boolean method4759() {
		if (this.anIntArray511 != null) {
			return true;
		} else if (this.anInt5942 >= 0) {
			@Pc(28) Class2_Sub3_Sub1_Sub1 local28 = Static149.anInt3178 < 0 ? Static257.method4286(this.anInt5942, Static260.aClass84_112) : Static104.method1942(Static149.anInt3178, this.anInt5942, Static260.aClass84_112);
			local28.method4381();
			this.anInt5934 = local28.anInt5462;
			this.anIntArray511 = local28.anIntArray479;
			this.anInt5944 = local28.anInt5453;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public final void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5942 = arg0.method4242();
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4941(@OriginalArg(0) int arg0) {
		@Pc(9) int[][] local9 = this.aClass150_41.method3894(arg0);
		if (this.aClass150_41.aBoolean405 && this.method4759()) {
			@Pc(27) int[] local27 = local9[0];
			@Pc(31) int[] local31 = local9[1];
			@Pc(35) int[] local35 = local9[2];
			@Pc(55) int local55 = (Static199.anInt4143 == this.anInt5934 ? arg0 : arg0 * this.anInt5934 / Static199.anInt4143) * this.anInt5944;
			@Pc(61) int local61;
			@Pc(74) int local74;
			if (Static114.anInt1359 == this.anInt5944) {
				for (local61 = 0; local61 < Static114.anInt1359; local61++) {
					local74 = this.anIntArray511[local55++];
					local35[local61] = (local74 & 0xFF) << 4;
					local31[local61] = local74 >> 4 & 0xFF0;
					local27[local61] = local74 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static114.anInt1359; local61++) {
					local74 = this.anInt5944 * local61 / Static114.anInt1359;
					@Pc(126) int local126 = this.anIntArray511[local55 + local74];
					local35[local61] = (local126 & 0xFF) << 4;
					local31[local61] = local126 >> 4 & 0xFF0;
					local27[local61] = local126 >> 12 & 0xFF0;
				}
			}
		}
		return local9;
	}
}

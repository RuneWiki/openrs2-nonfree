import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public class Class1_Sub4_Sub8 extends Class1_Sub4 {

	@OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
	protected int anInt1288;

	@OriginalMember(owner = "client!hg", name = "W", descriptor = "[I")
	protected int[] anIntArray114;

	@OriginalMember(owner = "client!hg", name = "Y", descriptor = "I")
	protected int anInt1298;

	@OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
	private int anInt1286 = -1;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub8() {
		super(0, false);
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V")
	@Override
	public final void method4751() {
		super.method4751();
		this.anIntArray114 = null;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public final void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1286 = arg0.method1386();
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4756(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = this.aClass85_41.method2339(arg0);
		if (this.aClass85_41.aBoolean171 && this.method1207()) {
			@Pc(32) int[] local32 = local17[0];
			@Pc(36) int[] local36 = local17[1];
			@Pc(40) int[] local40 = local17[2];
			@Pc(56) int local56 = (this.anInt1288 == Static117.anInt2472 ? arg0 : this.anInt1288 * arg0 / Static117.anInt2472) * this.anInt1298;
			@Pc(62) int local62;
			@Pc(72) int local72;
			if (this.anInt1298 == Static182.anInt3492) {
				for (local62 = 0; local62 < Static182.anInt3492; local62++) {
					local72 = this.anIntArray114[local56++];
					local40[local62] = (local72 & 0xFF) << 4;
					local36[local62] = local72 >> 4 & 0xFF0;
					local32[local62] = local72 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static182.anInt3492; local62++) {
					local72 = local62 * this.anInt1298 / Static182.anInt3492;
					@Pc(79) int local79 = this.anIntArray114[local56 + local72];
					local40[local62] = (local79 & 0xFF) << 4;
					local36[local62] = local79 >> 4 & 0xFF0;
					local32[local62] = local79 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)Z")
	protected final boolean method1207() {
		if (this.anIntArray114 != null) {
			return true;
		} else if (this.anInt1286 >= 0) {
			@Pc(36) Class1_Sub2_Sub1_Sub2 local36 = Static201.anInt3861 < 0 ? Static307.method4636(this.anInt1286, Static70.aClass121_40) : Static69.method4283(this.anInt1286, Static70.aClass121_40, Static201.anInt3861);
			local36.method3854();
			this.anInt1288 = local36.anInt4454;
			this.anIntArray114 = local36.anIntArray391;
			this.anInt1298 = local36.anInt4444;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)I")
	@Override
	public final int method4753() {
		return this.anInt1286;
	}
}

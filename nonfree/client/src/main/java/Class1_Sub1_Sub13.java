import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ih", name = "V", descriptor = "I")
	protected int anInt2601;

	@OriginalMember(owner = "client!ih", name = "cb", descriptor = "I")
	protected int anInt2606;

	@OriginalMember(owner = "client!ih", name = "db", descriptor = "[I")
	protected int[] anIntArray234;

	@OriginalMember(owner = "client!ih", name = "X", descriptor = "I")
	private int anInt2603 = -1;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub13() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)I")
	@Override
	public final int method3717() {
		return this.anInt2603;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3704(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass71_41.method2050(arg0);
		if (super.aClass71_41.aBoolean221 && this.method2041()) {
			@Pc(31) int[] local31 = local19[0];
			@Pc(35) int[] local35 = local19[1];
			@Pc(39) int[] local39 = local19[2];
			@Pc(55) int local55 = this.anInt2601 * (this.anInt2606 == Static116.anInt2571 ? arg0 : arg0 * this.anInt2606 / Static116.anInt2571);
			@Pc(61) int local61;
			@Pc(69) int local69;
			if (Static11.anInt294 == this.anInt2601) {
				for (local61 = 0; local61 < Static11.anInt294; local61++) {
					local69 = this.anIntArray234[local55++];
					local39[local61] = (local69 & 0xFF) << 4;
					local35[local61] = local69 >> 4 & 0xFF0;
					local31[local61] = local69 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static11.anInt294; local61++) {
					local69 = local61 * this.anInt2601 / Static11.anInt294;
					@Pc(117) int local117 = this.anIntArray234[local69 + local55];
					local39[local61] = (local117 & 0xFF) << 4;
					local35[local61] = local117 >> 4 & 0xFF0;
					local31[local61] = local117 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V")
	@Override
	public final void method3709() {
		super.method3709();
		this.anIntArray234 = null;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public final void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2603 = arg0.method2964();
		}
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)Z")
	protected final boolean method2041() {
		if (this.anIntArray234 != null) {
			return true;
		} else if (this.anInt2603 >= 0) {
			@Pc(28) Class1_Sub2_Sub2_Sub1 local28 = Static139.method2343(Static189.aClass28_64, this.anInt2603);
			local28.method198();
			this.anInt2606 = local28.anInt208;
			this.anInt2601 = local28.anInt209;
			this.anIntArray234 = local28.anIntArray13;
			return true;
		} else {
			return false;
		}
	}
}

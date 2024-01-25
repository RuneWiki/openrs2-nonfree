import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public class Class3_Sub4_Sub14 extends Class3_Sub4 {

	@OriginalMember(owner = "client!op", name = "Q", descriptor = "[I")
	protected int[] anIntArray260;

	@OriginalMember(owner = "client!op", name = "S", descriptor = "I")
	protected int anInt3440;

	@OriginalMember(owner = "client!op", name = "T", descriptor = "I")
	protected int anInt3441;

	@OriginalMember(owner = "client!op", name = "L", descriptor = "I")
	private int anInt3434 = -1;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub14() {
		super(0, false);
	}

	@OriginalMember(owner = "client!op", name = "e", descriptor = "(B)Z")
	protected final boolean method2804() {
		if (this.anIntArray260 != null) {
			return true;
		} else if (this.anInt3434 >= 0) {
			@Pc(35) Class166 local35 = Static179.anInt3653 < 0 ? Static460.method3988(Static226.aClass56_57, this.anInt3434) : Static460.method3975(Static226.aClass56_57, Static179.anInt3653, this.anInt3434);
			local35.method3981();
			this.anIntArray260 = local35.method3986();
			this.anInt3440 = local35.anInt4973;
			this.anInt3441 = local35.anInt4969;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)I")
	@Override
	public final int method5956() {
		return this.anInt3434;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public final void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt3434 = arg1.method6004();
		}
	}

	@OriginalMember(owner = "client!op", name = "d", descriptor = "(I)V")
	@Override
	public final void method5957() {
		super.method5957();
		this.anIntArray260 = null;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5955(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5177(arg0);
		if (super.aClass214_41.aBoolean455 && this.method2804()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(47) int local47 = (Static340.anInt6286 == this.anInt3441 ? arg0 : arg0 * this.anInt3441 / Static340.anInt6286) * this.anInt3440;
			@Pc(53) int local53;
			@Pc(61) int local61;
			if (this.anInt3440 == Static106.anInt2356) {
				for (local53 = 0; local53 < Static106.anInt2356; local53++) {
					local61 = this.anIntArray260[local47++];
					local31[local53] = (local61 & 0xFF) << 4;
					local27[local53] = local61 >> 4 & 0xFF0;
					local23[local53] = local61 >> 12 & 0xFF0;
				}
			} else {
				for (local53 = 0; local53 < Static106.anInt2356; local53++) {
					local61 = this.anInt3440 * local53 / Static106.anInt2356;
					@Pc(109) int local109 = this.anIntArray260[local61 + local47];
					local31[local53] = (local109 & 0xFF) << 4;
					local27[local53] = local109 >> 4 & 0xFF0;
					local23[local53] = local109 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}

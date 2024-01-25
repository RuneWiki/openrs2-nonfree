import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public class Class1_Sub2_Sub27 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ue", name = "I", descriptor = "I")
	protected int anInt4345;

	@OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
	protected int anInt4347;

	@OriginalMember(owner = "client!ue", name = "N", descriptor = "[I")
	protected int[] anIntArray530;

	@OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
	private int anInt4344 = -1;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub27() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "(I)Z")
	protected final boolean method3868() {
		if (this.anIntArray530 != null) {
			return true;
		} else if (this.anInt4344 >= 0) {
			@Pc(29) Class80 local29 = Static182.anInt3224 < 0 ? Static397.method1430(Static46.aClass230_15, this.anInt4344) : Static397.method1423(Static46.aClass230_15, Static182.anInt3224, this.anInt4344);
			local29.method1425();
			this.anIntArray530 = local29.method1434();
			this.anInt4347 = local29.anInt1753;
			this.anInt4345 = local29.anInt1751;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "(I)V")
	@Override
	public final void method5513() {
		super.method5513();
		this.anIntArray530 = null;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public final void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt4344 = arg1.method5177();
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5504(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass228_41.method4874(arg0);
		if (super.aClass228_41.aBoolean523 && this.method3868()) {
			@Pc(29) int[] local29 = local11[0];
			@Pc(33) int[] local33 = local11[1];
			@Pc(37) int[] local37 = local11[2];
			@Pc(53) int local53 = (Static91.anInt1665 == this.anInt4345 ? arg0 : this.anInt4345 * arg0 / Static91.anInt1665) * this.anInt4347;
			@Pc(63) int local63;
			@Pc(72) int local72;
			if (this.anInt4347 == Static158.anInt2658) {
				for (local63 = 0; local63 < Static158.anInt2658; local63++) {
					local72 = this.anIntArray530[local53++];
					local37[local63] = (local72 & 0xFF) << 4;
					local33[local63] = local72 >> 4 & 0xFF0;
					local29[local63] = local72 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static158.anInt2658; local63++) {
					local72 = this.anInt4347 * local63 / Static158.anInt2658;
					@Pc(80) int local80 = this.anIntArray530[local53 + local72];
					local37[local63] = (local80 & 0xFF) << 4;
					local33[local63] = local80 >> 4 & 0xFF0;
					local29[local63] = local80 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)I")
	@Override
	public final int method5511() {
		return this.anInt4344;
	}
}

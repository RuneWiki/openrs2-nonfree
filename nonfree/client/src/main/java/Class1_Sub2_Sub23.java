import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public class Class1_Sub2_Sub23 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wi", name = "I", descriptor = "I")
	protected int anInt3744;

	@OriginalMember(owner = "client!wi", name = "L", descriptor = "[I")
	protected int[] anIntArray438;

	@OriginalMember(owner = "client!wi", name = "O", descriptor = "I")
	protected int anInt3748;

	@OriginalMember(owner = "client!wi", name = "S", descriptor = "I")
	private int anInt3751 = -1;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub23() {
		super(0, false);
	}

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "(B)Z")
	protected final boolean method3534() {
		if (this.anIntArray438 != null) {
			return true;
		} else if (this.anInt3751 >= 0) {
			@Pc(32) Class138 local32 = Static166.anInt3475 < 0 ? Static363.method3784(Static20.aClass165_6, this.anInt3751) : Static363.method3785(Static20.aClass165_6, Static166.anInt3475, this.anInt3751);
			local32.method3776();
			this.anIntArray438 = local32.method3779();
			this.anInt3744 = local32.anInt4100;
			this.anInt3748 = local32.anInt4097;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public final void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt3751 = arg1.method3115();
		}
	}

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "(I)I")
	@Override
	public final int method5663() {
		return this.anInt3751;
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V")
	@Override
	public final void method5655() {
		super.method5655();
		this.anIntArray438 = null;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5664(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass129_41.method3671(arg0);
		if (super.aClass129_41.aBoolean338 && this.method3534()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(47) int local47 = this.anInt3744 * (Static81.anInt1606 == this.anInt3748 ? arg0 : arg0 * this.anInt3748 / Static81.anInt1606);
			@Pc(53) int local53;
			@Pc(62) int local62;
			if (Static251.anInt6509 == this.anInt3744) {
				for (local53 = 0; local53 < Static251.anInt6509; local53++) {
					local62 = this.anIntArray438[local47++];
					local31[local53] = (local62 & 0xFF) << 4;
					local27[local53] = local62 >> 4 & 0xFF0;
					local23[local53] = local62 >> 12 & 0xFF0;
				}
			} else {
				for (local53 = 0; local53 < Static251.anInt6509; local53++) {
					local62 = this.anInt3744 * local53 / Static251.anInt6509;
					@Pc(69) int local69 = this.anIntArray438[local62 + local47];
					local31[local53] = (local69 & 0xFF) << 4;
					local27[local53] = local69 >> 4 & 0xFF0;
					local23[local53] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public class Class5_Sub2_Sub6 extends Class5_Sub2 {

	@OriginalMember(owner = "client!cs", name = "I", descriptor = "I")
	protected int anInt8959;

	@OriginalMember(owner = "client!cs", name = "J", descriptor = "[I")
	protected int[] anIntArray495;

	@OriginalMember(owner = "client!cs", name = "K", descriptor = "I")
	protected int anInt8960;

	@OriginalMember(owner = "client!cs", name = "G", descriptor = "I")
	private int anInt8958 = -1;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub6() {
		super(0, false);
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8943(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass180_41.method4548(arg0);
		if (super.aClass180_41.aBoolean464 && this.method7612()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(47) int local47 = (this.anInt8959 == Static195.anInt3756 ? arg0 : this.anInt8959 * arg0 / Static195.anInt3756) * this.anInt8960;
			@Pc(53) int local53;
			@Pc(61) int local61;
			if (this.anInt8960 == Static195.anInt3759) {
				for (local53 = 0; local53 < Static195.anInt3759; local53++) {
					local61 = this.anIntArray495[local47++];
					local31[local53] = (local61 & 0xFF) << 4;
					local27[local53] = local61 >> 4 & 0xFF0;
					local23[local53] = local61 >> 12 & 0xFF0;
				}
			} else {
				for (local53 = 0; local53 < Static195.anInt3759; local53++) {
					local61 = this.anInt8960 * local53 / Static195.anInt3759;
					@Pc(113) int local113 = this.anIntArray495[local47 + local61];
					local31[local53] = (local113 & 0xFF) << 4;
					local27[local53] = local113 >> 4 & 0xFF0;
					local23[local53] = local113 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "(B)Z")
	protected final boolean method7612() {
		if (this.anIntArray495 != null) {
			return true;
		} else if (this.anInt8958 >= 0) {
			@Pc(37) Class369 local37 = Static445.anInt7653 >= 0 ? Static689.method8541(Static69.aClass390_125, Static445.anInt7653, this.anInt8958) : Static689.method8548(Static69.aClass390_125, this.anInt8958);
			local37.method8540();
			this.anIntArray495 = local37.method8542();
			this.anInt8960 = local37.anInt10309;
			this.anInt8959 = local37.anInt10307;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
	@Override
	public final void method8947() {
		super.method8947();
		this.anIntArray495 = null;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)I")
	@Override
	public final int method8946() {
		return this.anInt8958;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public final void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8958 = arg0.method7860();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public class Class6_Sub1_Sub5 extends Class6_Sub1 {

	@OriginalMember(owner = "client!cp", name = "F", descriptor = "[I")
	protected int[] anIntArray88;

	@OriginalMember(owner = "client!cp", name = "P", descriptor = "I")
	protected int anInt2678;

	@OriginalMember(owner = "client!cp", name = "Q", descriptor = "I")
	protected int anInt2679;

	@OriginalMember(owner = "client!cp", name = "G", descriptor = "I")
	private int anInt2671 = -1;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub5() {
		super(0, false);
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8728(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass239_41.method6263(arg0);
		if (super.aClass239_41.aBoolean585 && this.method2283()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(47) int local47 = this.anInt2679 * (Static123.anInt3099 == this.anInt2678 ? arg0 : arg0 * this.anInt2678 / Static123.anInt3099);
			@Pc(57) int local57;
			@Pc(65) int local65;
			if (this.anInt2679 == Static53.anInt1787) {
				for (local57 = 0; local57 < Static53.anInt1787; local57++) {
					local65 = this.anIntArray88[local47++];
					local31[local57] = (local65 & 0xFF) << 4;
					local27[local57] = local65 >> 4 & 0xFF0;
					local23[local57] = local65 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static53.anInt1787; local57++) {
					local65 = local57 * this.anInt2679 / Static53.anInt1787;
					@Pc(113) int local113 = this.anIntArray88[local47 + local65];
					local31[local57] = (local113 & 0xFF) << 4;
					local27[local57] = local113 >> 4 & 0xFF0;
					local23[local57] = local113 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)I")
	@Override
	public final int method8727() {
		return this.anInt2671;
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)V")
	@Override
	public final void method8724() {
		super.method8724();
		this.anIntArray88 = null;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public final void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2671 = arg1.method8220();
		}
	}

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)Z")
	protected final boolean method2283() {
		if (this.anIntArray88 != null) {
			return true;
		} else if (this.anInt2671 >= 0) {
			@Pc(27) Class331 local27 = Static410.anInt7633 >= 0 ? Static655.method7892(Static244.aClass223_59, Static410.anInt7633, this.anInt2671) : Static655.method7890(Static244.aClass223_59, this.anInt2671);
			local27.method7899();
			this.anIntArray88 = local27.method7893();
			this.anInt2678 = local27.anInt9648;
			this.anInt2679 = local27.anInt9650;
			return true;
		} else {
			return false;
		}
	}
}

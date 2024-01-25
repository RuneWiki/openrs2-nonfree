import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public class Class5_Sub2_Sub18 extends Class5_Sub2 {

	@OriginalMember(owner = "client!qj", name = "L", descriptor = "I")
	protected int anInt3204;

	@OriginalMember(owner = "client!qj", name = "O", descriptor = "[I")
	protected int[] anIntArray220;

	@OriginalMember(owner = "client!qj", name = "R", descriptor = "I")
	protected int anInt3209;

	@OriginalMember(owner = "client!qj", name = "P", descriptor = "I")
	private int anInt3207 = -1;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub18() {
		super(0, false);
	}

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "(I)Z")
	protected final boolean method2972() {
		if (this.anIntArray220 != null) {
			return true;
		} else if (this.anInt3207 >= 0) {
			@Pc(30) Class37 local30 = Static133.anInt6597 < 0 ? Static360.method915(Static277.aClass170_92, this.anInt3207) : Static360.method907(Static277.aClass170_92, Static133.anInt6597, this.anInt3207);
			local30.method909();
			this.anIntArray220 = local30.method914();
			this.anInt3204 = local30.anInt1012;
			this.anInt3209 = local30.anInt1008;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public final void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3207 = arg0.method1845();
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
	@Override
	public final void method5807() {
		super.method5807();
		this.anIntArray220 = null;
	}

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)I")
	@Override
	public final int method5815() {
		return this.anInt3207;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5806(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass154_41.method4027(arg0);
		if (super.aClass154_41.aBoolean336 && this.method2972()) {
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(55) int local55 = (Static88.anInt1584 == this.anInt3209 ? arg0 : arg0 * this.anInt3209 / Static88.anInt1584) * this.anInt3204;
			@Pc(61) int local61;
			@Pc(70) int local70;
			if (this.anInt3204 == Static15.anInt493) {
				for (local61 = 0; local61 < Static15.anInt493; local61++) {
					local70 = this.anIntArray220[local55++];
					local39[local61] = (local70 & 0xFF) << 4;
					local35[local61] = local70 >> 4 & 0xFF0;
					local31[local61] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static15.anInt493; local61++) {
					local70 = local61 * this.anInt3204 / Static15.anInt493;
					@Pc(77) int local77 = this.anIntArray220[local70 + local55];
					local39[local61] = (local77 & 0xFF) << 4;
					local35[local61] = local77 >> 4 & 0xFF0;
					local31[local61] = local77 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}

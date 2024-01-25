import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public class Class5_Sub3_Sub11 extends Class5_Sub3 {

	@OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
	protected int anInt7582;

	@OriginalMember(owner = "client!fa", name = "N", descriptor = "[I")
	protected int[] anIntArray448;

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
	protected int anInt7584;

	@OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
	private int anInt7580 = -1;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub11() {
		super(0, false);
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9206(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass343_41.method7661(arg0);
		if (super.aClass343_41.aBoolean592 && this.method6603()) {
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			@Pc(54) int local54 = (this.anInt7582 == Static122.anInt2020 ? arg0 : this.anInt7582 * arg0 / Static122.anInt2020) * this.anInt7584;
			@Pc(64) int local64;
			@Pc(73) int local73;
			if (this.anInt7584 == Static7.anInt102) {
				for (local64 = 0; local64 < Static7.anInt102; local64++) {
					local73 = this.anIntArray448[local54++];
					local33[local64] = (local73 & 0xFF) << 4;
					local29[local64] = local73 >> 4 & 0xFF0;
					local25[local64] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local64 = 0; local64 < Static7.anInt102; local64++) {
					local73 = this.anInt7584 * local64 / Static7.anInt102;
					@Pc(80) int local80 = this.anIntArray448[local73 + local54];
					local33[local64] = (local80 & 0xFF) << 4;
					local29[local64] = local80 >> 4 & 0xFF0;
					local25[local64] = local80 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)Z")
	protected final boolean method6603() {
		if (this.anIntArray448 != null) {
			return true;
		} else if (this.anInt7580 >= 0) {
			@Pc(28) Class362 local28 = Static681.anInt10916 < 0 ? Static692.method8276(Static5.aClass126_303, this.anInt7580) : Static692.method8275(Static5.aClass126_303, Static681.anInt10916, this.anInt7580);
			local28.method8271();
			this.anIntArray448 = local28.method8272();
			this.anInt7582 = local28.anInt9728;
			this.anInt7584 = local28.anInt9727;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public final void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7580 = arg0.method7333();
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
	@Override
	public final int method9212() {
		return this.anInt7580;
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
	@Override
	public final void method9209() {
		super.method9209();
		this.anIntArray448 = null;
	}
}

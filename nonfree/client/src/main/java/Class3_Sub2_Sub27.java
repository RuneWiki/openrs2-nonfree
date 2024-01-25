import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public class Class3_Sub2_Sub27 extends Class3_Sub2 {

	@OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
	protected int anInt10415;

	@OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
	protected int anInt10416;

	@OriginalMember(owner = "client!qe", name = "M", descriptor = "[I")
	protected int[] anIntArray587;

	@OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
	private int anInt10414 = -1;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub27() {
		super(0, false);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public final void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt10414 = arg1.method5272();
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9203(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass36_41.method731(arg0);
		if (super.aClass36_41.aBoolean75 && this.method8714()) {
			@Pc(31) int[] local31 = local17[0];
			@Pc(35) int[] local35 = local17[1];
			@Pc(39) int[] local39 = local17[2];
			@Pc(56) int local56 = (Static443.anInt7682 == this.anInt10416 ? arg0 : this.anInt10416 * arg0 / Static443.anInt7682) * this.anInt10415;
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (this.anInt10415 == Static636.anInt10302) {
				for (local62 = 0; local62 < Static636.anInt10302; local62++) {
					local71 = this.anIntArray587[local56++];
					local39[local62] = (local71 & 0xFF) << 4;
					local35[local62] = local71 >> 4 & 0xFF0;
					local31[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static636.anInt10302; local62++) {
					local71 = this.anInt10415 * local62 / Static636.anInt10302;
					@Pc(78) int local78 = this.anIntArray587[local56 + local71];
					local39[local62] = (local78 & 0xFF) << 4;
					local35[local62] = local78 >> 4 & 0xFF0;
					local31[local62] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)I")
	@Override
	public final int method9213() {
		return this.anInt10414;
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)Z")
	protected final boolean method8714() {
		if (this.anIntArray587 != null) {
			return true;
		} else if (this.anInt10414 >= 0) {
			@Pc(39) Class194 local39 = Static492.anInt8481 >= 0 ? Static728.method4757(Static111.aClass221_22, Static492.anInt8481, this.anInt10414) : Static728.method4751(Static111.aClass221_22, this.anInt10414);
			local39.method4764();
			this.anIntArray587 = local39.method4761();
			this.anInt10415 = local39.anInt5596;
			this.anInt10416 = local39.anInt5595;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
	@Override
	public final void method9206() {
		super.method9206();
		this.anIntArray587 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public class Class2_Sub3_Sub12 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ft", name = "L", descriptor = "[I")
	protected int[] anIntArray281;

	@OriginalMember(owner = "client!ft", name = "M", descriptor = "I")
	protected int anInt3721;

	@OriginalMember(owner = "client!ft", name = "Q", descriptor = "I")
	protected int anInt3724;

	@OriginalMember(owner = "client!ft", name = "H", descriptor = "I")
	private int anInt3717 = -1;

	static {
		new Class144(64);
		new Class140("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub12() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)V")
	@Override
	public final void method5705() {
		super.method5705();
		this.anIntArray281 = null;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public final void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt3717 = arg1.method3104();
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5702(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass90_41.method2391(arg0);
		if (super.aClass90_41.aBoolean257 && this.method3240()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(56) int local56 = (Static363.anInt6995 == this.anInt3721 ? arg0 : arg0 * this.anInt3721 / Static363.anInt6995) * this.anInt3724;
			@Pc(66) int local66;
			@Pc(75) int local75;
			if (Static263.anInt5504 == this.anInt3724) {
				for (local66 = 0; local66 < Static263.anInt5504; local66++) {
					local75 = this.anIntArray281[local56++];
					local36[local66] = (local75 & 0xFF) << 4;
					local32[local66] = local75 >> 4 & 0xFF0;
					local28[local66] = local75 >> 12 & 0xFF0;
				}
			} else {
				for (local66 = 0; local66 < Static263.anInt5504; local66++) {
					local75 = this.anInt3724 * local66 / Static263.anInt5504;
					@Pc(82) int local82 = this.anIntArray281[local75 + local56];
					local36[local66] = (local82 & 0xFF) << 4;
					local32[local66] = local82 >> 4 & 0xFF0;
					local28[local66] = local82 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "(I)Z")
	protected final boolean method3240() {
		if (this.anIntArray281 != null) {
			return true;
		} else if (this.anInt3717 >= 0) {
			@Pc(37) Class40 local37 = Static244.anInt5186 >= 0 ? Static368.method843(Static16.aClass104_11, Static244.anInt5186, this.anInt3717) : Static368.method834(Static16.aClass104_11, this.anInt3717);
			local37.method844();
			this.anIntArray281 = local37.method845();
			this.anInt3724 = local37.anInt694;
			this.anInt3721 = local37.anInt691;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)I")
	@Override
	public final int method5701() {
		return this.anInt3717;
	}
}

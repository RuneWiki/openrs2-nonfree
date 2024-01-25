import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class2_Sub3_Sub6 extends Class2_Sub3 {

	@OriginalMember(owner = "client!dq", name = "I", descriptor = "I")
	private int anInt1171 = 4096;

	@OriginalMember(owner = "client!dq", name = "M", descriptor = "I")
	private int anInt1175 = 4096;

	@OriginalMember(owner = "client!dq", name = "N", descriptor = "I")
	private int anInt1176 = 4096;

	static {
		new Class140("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5702(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass90_41.method2391(arg0);
		if (super.aClass90_41.aBoolean257) {
			@Pc(32) int[][] local32 = this.method5707(arg0, 0);
			@Pc(36) int[] local36 = local32[0];
			@Pc(40) int[] local40 = local32[1];
			@Pc(44) int[] local44 = local32[2];
			@Pc(48) int[] local48 = local15[0];
			@Pc(52) int[] local52 = local15[1];
			@Pc(56) int[] local56 = local15[2];
			for (@Pc(58) int local58 = 0; local58 < Static263.anInt5504; local58++) {
				@Pc(64) int local64 = local36[local58];
				@Pc(68) int local68 = local44[local58];
				@Pc(72) int local72 = local40[local58];
				if (local68 == local64 && local68 == local72) {
					local48[local58] = this.anInt1175 * local64 >> 12;
					local52[local58] = local68 * this.anInt1171 >> 12;
					local56[local58] = this.anInt1176 * local72 >> 12;
				} else {
					local48[local58] = this.anInt1175;
					local52[local58] = this.anInt1171;
					local56[local58] = this.anInt1176;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt1175 = arg1.method3104();
		} else if (arg0 == 1) {
			this.anInt1171 = arg1.method3104();
		} else if (arg0 == 2) {
			this.anInt1176 = arg1.method3104();
		}
	}
}

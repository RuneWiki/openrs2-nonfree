import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class2_Sub3_Sub22 extends Class2_Sub3 {

	@OriginalMember(owner = "client!na", name = "S", descriptor = "I")
	public static int anInt4011 = 0;

	@OriginalMember(owner = "client!na", name = "X", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_89 = new Class79("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!na", name = "Z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35;

	@OriginalMember(owner = "client!na", name = "P", descriptor = "I")
	private int anInt4008 = 4096;

	@OriginalMember(owner = "client!na", name = "N", descriptor = "I")
	private int anInt4006 = 4096;

	@OriginalMember(owner = "client!na", name = "W", descriptor = "I")
	private int anInt4014 = 4096;

	static {
		new Class79("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
		aStringArray35 = new String[100];
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V", line = 170)
	public Class2_Sub3_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!bt;I)V", line = 3)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt4014 = arg1.method4830();
		} else if (arg0 == 1) {
			this.anInt4006 = arg1.method4830();
		} else if (arg0 == 2) {
			this.anInt4008 = arg1.method4830();
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IB)[[I", line = 100)
	@Override
	public int[][] method6480(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass243_41.method6278(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(27) int[][] local27 = this.method6484(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static211.anInt4031; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local39[local53];
				@Pc(67) int local67 = local35[local53];
				if (local63 == local59 && local67 == local63) {
					local43[local53] = local59 * this.anInt4014 >> 12;
					local47[local53] = this.anInt4006 * local63 >> 12;
					local51[local53] = this.anInt4008 * local67 >> 12;
				} else {
					local43[local53] = this.anInt4014;
					local47[local53] = this.anInt4006;
					local51[local53] = this.anInt4008;
				}
			}
		}
		return local17;
	}
}

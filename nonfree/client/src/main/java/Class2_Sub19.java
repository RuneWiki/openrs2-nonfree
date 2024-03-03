import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!jc", name = "C", descriptor = "[[I")
	public static final int[][] anIntArrayArray22 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
	public static final int anInt2892 = 1;

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "Lclient!cc;")
	public static Class32 aClass32_7;

	@OriginalMember(owner = "client!jc", name = "T", descriptor = "Lclient!ij;")
	public static final Class105 aClass105_1;

	@OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
	public static int anInt2908;

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "Lclient!nh;")
	public Class11_Sub5_Sub2_Sub1 aClass11_Sub5_Sub2_Sub1_2;

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
	public int anInt2891;

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
	public int anInt2893;

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
	public int anInt2894;

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "Lclient!qn;")
	public Class2_Sub12_Sub4 aClass2_Sub12_Sub4_2;

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "Z")
	public boolean aBoolean204;

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
	public int anInt2896;

	@OriginalMember(owner = "client!jc", name = "B", descriptor = "Lclient!oe;")
	public Class11_Sub5_Sub2_Sub2 aClass11_Sub5_Sub2_Sub2_1;

	@OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
	public int anInt2898;

	@OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
	public int anInt2900;

	@OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
	public int anInt2901;

	@OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
	public int anInt2902;

	@OriginalMember(owner = "client!jc", name = "K", descriptor = "Lclient!qn;")
	public Class2_Sub12_Sub4 aClass2_Sub12_Sub4_3;

	@OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
	public int anInt2903;

	@OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
	public int anInt2904;

	@OriginalMember(owner = "client!jc", name = "O", descriptor = "Lclient!ct;")
	public Class41 aClass41_1;

	@OriginalMember(owner = "client!jc", name = "P", descriptor = "[I")
	public int[] anIntArray181;

	@OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
	public int anInt2907;

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
	public int anInt2897 = 0;

	static {
		new Class79("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
		aClass32_7 = null;
		new Class79("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
		aClass105_1 = new Class105();
		anInt2908 = -1;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V", line = 102)
	public void method2942() {
		@Pc(8) int local8 = this.anInt2891;
		if (this.aClass41_1 != null) {
			@Pc(88) Class41 local88 = this.aClass41_1.method1535(Static199.aClass226_1);
			if (local88 == null) {
				this.anInt2891 = -1;
				this.anInt2900 = 0;
				this.anInt2903 = 0;
				this.anIntArray181 = null;
				this.anInt2898 = 0;
				this.anInt2894 = 0;
			} else {
				this.anInt2900 = local88.anInt1333;
				this.anInt2894 = local88.anInt1314;
				this.anInt2903 = local88.anInt1319;
				this.anInt2898 = local88.anInt1306 * 128;
				this.anInt2891 = local88.anInt1324;
				this.anIntArray181 = local88.anIntArray93;
			}
		} else if (this.aClass11_Sub5_Sub2_Sub2_1 != null) {
			@Pc(42) int local42 = Static317.method5765(this.aClass11_Sub5_Sub2_Sub2_1);
			if (local42 != local8) {
				this.anInt2891 = local42;
				@Pc(52) Class71 local52 = this.aClass11_Sub5_Sub2_Sub2_1.aClass71_1;
				if (local52.anIntArray129 != null) {
					local52 = local52.method2095(Static199.aClass226_1);
				}
				if (local52 == null) {
					this.anInt2903 = this.anInt2898 = 0;
				} else {
					this.anInt2898 = local52.anInt2020 * 128;
					this.anInt2903 = local52.anInt2048;
				}
			}
		} else if (this.aClass11_Sub5_Sub2_Sub1_2 != null) {
			this.anInt2891 = Static358.method6416(this.aClass11_Sub5_Sub2_Sub1_2);
			this.anInt2898 = this.aClass11_Sub5_Sub2_Sub1_2.anInt4176 * 128;
			this.anInt2903 = this.aClass11_Sub5_Sub2_Sub1_2.anInt4195;
		}
		if (this.anInt2891 != local8 && this.aClass2_Sub12_Sub4_3 != null) {
			Static211.aClass2_Sub12_Sub2_2.method2083(this.aClass2_Sub12_Sub4_3);
			this.aClass2_Sub12_Sub4_3 = null;
		}
	}
}

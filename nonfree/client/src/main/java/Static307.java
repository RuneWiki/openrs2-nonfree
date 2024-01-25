import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!pm", name = "N", descriptor = "I")
	public static int anInt5523;

	@OriginalMember(owner = "client!pm", name = "O", descriptor = "I")
	public static int anInt5524;

	@OriginalMember(owner = "client!pm", name = "D", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!pm", name = "F", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_72 = new Class84("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!pm", name = "Q", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_94 = new Class237(56, -2);

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)I")
	public static int method4409(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZLclient!ir;)V")
	public static void method4416(@OriginalArg(1) Class26_Sub2_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static403.anInt6978 == arg0.anInt7103 || arg0.anInt7073 == -1 || arg0.anInt7120 != 0) {
			local5 = true;
		} else {
			@Pc(29) Class191 local29 = Static191.aClass28_1.method567(arg0.anInt7073);
			if (local29.aBoolean374 || local29.anIntArray454[arg0.anInt7075] < arg0.anInt7127 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(57) int local57 = arg0.anInt7103 - arg0.anInt7088;
			@Pc(63) int local63 = Static403.anInt6978 - arg0.anInt7088;
			@Pc(74) int local74 = arg0.anInt7137 * 128 + arg0.method5535() * 64;
			@Pc(86) int local86 = arg0.anInt7142 * 128 + arg0.method5535() * 64;
			@Pc(98) int local98 = arg0.anInt7094 * 128 + arg0.method5535() * 64;
			@Pc(110) int local110 = arg0.anInt7143 * 128 + arg0.method5535() * 64;
			arg0.anInt7068 = ((local57 - local63) * local74 + local98 * local63) / local57;
			arg0.anInt7065 = (local110 * local63 + (local57 - local63) * local86) / local57;
		}
		arg0.anInt7150 = 0;
		if (arg0.anInt7093 == 0) {
			arg0.method5537(8192);
		}
		if (arg0.anInt7093 == 1) {
			arg0.method5537(12288);
		}
		if (arg0.anInt7093 == 2) {
			arg0.method5537(0);
		}
		if (arg0.anInt7093 == 3) {
			arg0.method5537(4096);
		}
	}
}

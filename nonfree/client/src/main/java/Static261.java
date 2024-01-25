import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!ql", name = "L", descriptor = "I")
	public static int anInt5266;

	@OriginalMember(owner = "client!ql", name = "N", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!ql", name = "Y", descriptor = "Lclient!ng;")
	public static Class35 aClass35_2;

	@OriginalMember(owner = "client!ql", name = "ab", descriptor = "I")
	public static int anInt5279;

	@OriginalMember(owner = "client!ql", name = "cb", descriptor = "[Lclient!uh;")
	public static Class60[] aClass60Array2;

	@OriginalMember(owner = "client!ql", name = "Q", descriptor = "I")
	public static int anInt5270 = 0;

	@OriginalMember(owner = "client!ql", name = "bb", descriptor = "I")
	public static int anInt5280 = 0;

	@OriginalMember(owner = "client!ql", name = "ib", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_274 = new Class159("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(Z)V")
	public static void method4550() {
		@Pc(5) Class198 local5 = Static170.aClass198_129;
		synchronized (Static170.aClass198_129) {
			Static170.aClass198_129.method5213();
		}
		local5 = Static245.aClass198_178;
		synchronized (Static245.aClass198_178) {
			Static245.aClass198_178.method5213();
		}
		local5 = Static142.aClass198_109;
		synchronized (Static142.aClass198_109) {
			Static142.aClass198_109.method5213();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZZBLclient!ml;Ljava/lang/String;)V")
	public static void method4551(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class134 arg2, @OriginalArg(4) String arg3) {
		if (!arg0) {
			Static248.method4394(arg2, 3, arg3);
			return;
		}
		@Pc(21) String local21;
		if (Static200.aString41.startsWith("win") && Static200.anInt4144 != 3) {
			local21 = null;
			if (arg2.anApplet1 != null) {
				local21 = arg2.anApplet1.getParameter("haveie6");
			}
			if (local21 == null || !local21.equals("1")) {
				@Pc(41) Class185 local41 = Static248.method4394(arg2, 0, arg3);
				Static356.aClass185_9 = local41;
				Static92.aString7 = arg3;
				Static180.aClass134_3 = arg2;
				return;
			}
		}
		if (Static200.aString41.startsWith("mac")) {
			local21 = null;
			if (arg2.anApplet1 != null) {
				local21 = arg2.anApplet1.getParameter("havefirefox");
			}
			if (local21 != null && local21.equals("1") && arg1) {
				Static248.method4394(arg2, 1, arg3);
				return;
			}
		}
		Static248.method4394(arg2, 2, arg3);
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)Z")
	public static boolean method4552() {
		return Static5.aBoolean212;
	}
}

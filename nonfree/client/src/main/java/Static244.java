import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!pn", name = "A", descriptor = "Lclient!is;")
	public static Class14 aClass14_2;

	@OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
	public static int anInt4743;

	@OriginalMember(owner = "client!pn", name = "E", descriptor = "Lclient!ra;")
	public static Class170 aClass170_84;

	@OriginalMember(owner = "client!pn", name = "G", descriptor = "Lclient!ra;")
	public static Class170 aClass170_85;

	@OriginalMember(owner = "client!pn", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[100];

	@OriginalMember(owner = "client!pn", name = "u", descriptor = "I")
	public static int anInt4736 = 0;

	@OriginalMember(owner = "client!pn", name = "z", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_84 = new Class66(500);

	@OriginalMember(owner = "client!pn", name = "C", descriptor = "I")
	public static int anInt4742 = 0;

	@OriginalMember(owner = "client!pn", name = "F", descriptor = "I")
	public static int anInt4744 = 0;

	@OriginalMember(owner = "client!pn", name = "H", descriptor = "[I")
	public static final int[] anIntArray372 = new int[13];

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!am;BILjava/awt/Component;I)Lclient!is;")
	public static Class14 method4158(@OriginalArg(0) Class10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3) {
		if (Static344.anInt1063 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(41) Class14 local41 = (Class14) Class.forName("Class14_Sub1").getDeclaredConstructor().newInstance();
			local41.anInt6173 = arg1;
			local41.anIntArray530 = new int[(Static250.aBoolean374 ? 2 : 1) * 256];
			local41.method5475(arg2);
			local41.anInt6174 = (arg1 & 0xFFFFFC00) + 1024;
			if (local41.anInt6174 > 16384) {
				local41.anInt6174 = 16384;
			}
			local41.method5484(local41.anInt6174);
			if (Static98.anInt2184 > 0 && Static104.aClass192_1 == null) {
				Static104.aClass192_1 = new Class192();
				Static104.aClass192_1.aClass10_5 = arg0;
				arg0.method316(Static98.anInt2184, Static104.aClass192_1);
			}
			if (Static104.aClass192_1 != null) {
				if (Static104.aClass192_1.aClass14Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static104.aClass192_1.aClass14Array1[arg3] = local41;
			}
			return local41;
		} catch (@Pc(114) Throwable local114) {
			try {
				@Pc(120) Class14_Sub2 local120 = new Class14_Sub2(arg0, arg3);
				local120.anInt6173 = arg1;
				local120.anIntArray530 = new int[(Static250.aBoolean374 ? 2 : 1) * 256];
				local120.method5475(arg2);
				local120.anInt6174 = 16384;
				local120.method5484(local120.anInt6174);
				if (Static98.anInt2184 > 0 && Static104.aClass192_1 == null) {
					Static104.aClass192_1 = new Class192();
					Static104.aClass192_1.aClass10_5 = arg0;
					arg0.method316(Static98.anInt2184, Static104.aClass192_1);
				}
				if (Static104.aClass192_1 != null) {
					if (Static104.aClass192_1.aClass14Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static104.aClass192_1.aClass14Array1[arg3] = local120;
				}
				return local120;
			} catch (@Pc(182) Throwable local182) {
				return new Class14();
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!ra;Lclient!ra;I)V")
	public static void method4159(@OriginalArg(0) Class170 arg0, @OriginalArg(1) Class170 arg1) {
		Static277.aClass170_93 = arg1;
		Static176.aClass170_35 = arg0;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method4160(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString229 + " | ";
		} else {
			local10 = "";
		}
		@Pc(39) StringWriter local39 = new StringWriter();
		@Pc(44) PrintWriter local44 = new PrintWriter(local39);
		arg0.printStackTrace(local44);
		local44.close();
		@Pc(52) String local52 = local39.toString();
		@Pc(60) BufferedReader local60 = new BufferedReader(new StringReader(local52));
		@Pc(63) String local63 = local60.readLine();
		while (true) {
			@Pc(66) String local66 = local60.readLine();
			if (local66 == null) {
				return local10 + "| " + local63;
			}
			@Pc(72) int local72 = local66.indexOf(40);
			@Pc(79) int local79 = local66.indexOf(41, local72 + 1);
			@Pc(88) String local88;
			if (local72 == -1) {
				local88 = local66;
			} else {
				local88 = local66.substring(0, local72);
			}
			local88 = local88.trim();
			local88 = local88.substring(local88.lastIndexOf(32) + 1);
			local88 = local88.substring(local88.lastIndexOf(9) + 1);
			local10 = local10 + local88;
			if (local72 != -1 && local79 != -1) {
				@Pc(132) int local132 = local66.indexOf(".java:", local72);
				if (local132 >= 0) {
					local10 = local10 + local66.substring(local132 + 5, local79);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)I")
	public static int method4161(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static310.method5283(arg0);
	}
}

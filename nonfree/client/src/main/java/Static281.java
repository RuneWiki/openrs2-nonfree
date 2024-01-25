import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
	public static int anInt5878;

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "Z")
	public static boolean aBoolean507 = false;

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "[Lclient!vr;")
	public static final Interface23[] anInterface23Array4 = new Interface23[75];

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/awt/Frame;Lclient!ufa;B)V")
	public static void method4845(@OriginalArg(0) Frame arg0, @OriginalArg(1) Class326 arg1) {
		while (true) {
			@Pc(8) Class66 local8 = arg1.method7785(arg0);
			while (local8.anInt2308 == 0) {
				Static1.method125(10L);
			}
			if (local8.anInt2308 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static1.method125(100L);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BII)V")
	public static void method4846(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub4_Sub6 local8 = Static367.method6025(15, 0);
		local8.method1898();
		local8.anInt1945 = arg1;
		local8.anInt1946 = arg0;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)Lclient!cw;")
	public static Class55_Sub1 method4847() {
		@Pc(8) Class55_Sub1 local8 = (Class55_Sub1) Static107.aClass134_3.method3234();
		if (local8 == null) {
			return new Class55_Sub1();
		} else {
			Static405.anInt7968--;
			return local8;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!oa;I)V")
	public static void method4852(@OriginalArg(0) Class15 arg0) {
		if (Static256.aBoolean474) {
			Static357.method5928(arg0);
		} else {
			Static359.method5947(arg0);
		}
	}
}

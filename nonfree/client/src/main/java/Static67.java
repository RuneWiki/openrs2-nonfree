import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "Lclient!g;")
	public static Class2_Sub1_Sub10 aClass2_Sub1_Sub10_1;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_506 = Static158.method3034("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "Lclient!ob;")
	public static Class60 aClass60_507 = aClass60_506;

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_508 = Static158.method3034(":assistreq:");

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "Z")
	public static final boolean aBoolean87 = false;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)Z")
	public static boolean method1569(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!pe;ZLclient!pe;)I")
	public static int method1571(@OriginalArg(0) Class13 arg0, @OriginalArg(2) Class13 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method535(Static158.anInt4006)) {
			local5++;
		}
		if (arg0.method535(Static168.anInt4119)) {
			local5++;
		}
		if (arg0.method535(Static53.anInt1666)) {
			local5++;
		}
		if (arg0.method535(Static44.anInt1376)) {
			local5++;
		}
		if (arg0.method535(Static152.anInt2811)) {
			local5++;
		}
		if (arg0.method535(Static182.anInt4404)) {
			local5++;
		}
		arg0.method535(Static53.anInt1659);
		arg0.method535(Static128.anInt3500);
		arg0.method535(Static191.anInt4558);
		arg0.method535(Static115.anInt3213);
		arg0.method535(Static115.anInt3212);
		return local5;
	}
}

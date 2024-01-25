import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
	public static int anInt6114;

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "[B")
	public static final byte[] aByteArray118 = new byte[2048];

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray31 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
	public static int anInt6115 = -1;

	@OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
	public static int anInt6116 = 765;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V")
	public static void method4903() {
		for (@Pc(14) Class2_Sub5_Sub11 local14 = (Class2_Sub5_Sub11) Static31.aClass14_1.method309(); local14 != null; local14 = (Class2_Sub5_Sub11) Static31.aClass14_1.method311()) {
			@Pc(19) Class3_Sub2_Sub2 local19 = local14.aClass3_Sub2_Sub2_1;
			if (local19.aBoolean303) {
				local14.method5866();
				local19.method3366();
			} else if (local19.anInt4140 <= Static131.anInt2821) {
				local19.method3364(Static377.anInt6400);
				if (local19.aBoolean303) {
					local14.method5866();
				} else {
					Static313.method4402(local19, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V")
	public static void method4904(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static381.method4982(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static312.method4393(local7);
			local7 = Static435.method5673("%3a", local7, ":");
			local7 = Static435.method5673("%40", local7, "@");
			local7 = Static435.method5673("%26", local7, "&");
			local7 = Static435.method5673("%23", local7, "#");
			if (Static325.aClass59_7.anApplet1 != null) {
				@Pc(104) Class138 local104 = Static325.aClass59_7.method1368(new URL(Static325.aClass59_7.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static64.anInt1456 + "&u=" + Static3.aLong6 + "&v1=" + Static73.aString14 + "&v2=" + Static73.aString16 + "&e=" + local7));
				while (local104.anInt3723 == 0) {
					Static81.method1477(1L);
				}
				if (local104.anInt3723 == 1) {
					@Pc(125) DataInputStream local125 = (DataInputStream) local104.anObject7;
					local125.read();
					local125.close();
				}
			}
		} catch (@Pc(132) Exception local132) {
		}
	}
}

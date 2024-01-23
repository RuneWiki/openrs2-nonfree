import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
	public static int anInt1776;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "[I")
	public static int[] anIntArray178 = new int[128];

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "Lclient!jd;")
	public static Class61 aClass61_27 = new Class61(64);

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "Lclient!sc;")
	public static Class107 aClass107_515 = Static231.method3737("T");

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method1382(@OriginalArg(0) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static176.anInt3813 > 0) {
			local18 = Static18.aByteArrayArray1[--Static176.anInt3813];
			Static18.aByteArrayArray1[Static176.anInt3813] = null;
			return local18;
		} else if (arg0 == 5000 && Static221.anInt4835 > 0) {
			local18 = Static54.aByteArrayArray2[--Static221.anInt4835];
			Static54.aByteArrayArray2[Static221.anInt4835] = null;
			return local18;
		} else if (arg0 == 30000 && Static169.anInt3654 > 0) {
			local18 = Static122.aByteArrayArray4[--Static169.anInt3654];
			Static122.aByteArrayArray4[Static169.anInt3654] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)V")
	public static void method1383() {
		@Pc(12) int local12 = Static85.aByteArrayArray3.length;
		@Pc(14) byte[][] local14 = Static172.aByteArrayArray9;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(22) byte[] local22 = local14[local16];
			if (local22 != null) {
				@Pc(35) int local35 = (Static182.anIntArray343[local16] >> 8) * 64 - Static36.anInt764;
				@Pc(46) int local46 = (Static182.anIntArray343[local16] & 0xFF) * 64 - Static152.anInt3377;
				Static30.method587();
				Static233.method3744(local22, Static107.aClass60Array1, local46, local35);
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void method1384(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(12) String local12 = "";
			if (arg0 != null) {
				local12 = Static181.method3180(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local12 = local12 + " | ";
				}
				local12 = local12 + arg1;
			}
			System.out.println("Error: " + local12);
			local12 = local12.replace(':', '.');
			local12 = local12.replace('@', '_');
			local12 = local12.replace('&', '_');
			local12 = local12.replace('#', '_');
			if (Static192.aClass34_4.anApplet1 != null) {
				@Pc(106) Class84 local106 = Static192.aClass34_4.method1062(new URL(Static192.aClass34_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static146.anInt3165 + "&u=" + Static189.aLong149 + "&v1=" + Static53.aString2 + "&v2=" + Static53.aString4 + "&e=" + local12));
				while (local106.anInt3171 == 0) {
					Static148.method2431(1L);
				}
				if (local106.anInt3171 == 1) {
					@Pc(125) DataInputStream local125 = (DataInputStream) local106.anObject4;
					local125.read();
					local125.close();
				}
			}
		} catch (@Pc(132) Exception local132) {
		}
	}
}

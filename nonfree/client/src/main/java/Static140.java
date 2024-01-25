import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!et", name = "x", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!et", name = "s", descriptor = "Lclient!mba;")
	public static final Class216 aClass216_22 = new Class216();

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II)[B")
	public static byte[] method2400(@OriginalArg(1) int arg0) {
		@Pc(18) Class3_Sub7_Sub8 local18 = (Class3_Sub7_Sub8) Static268.aClass282_4.method6855((long) arg0);
		if (local18 == null) {
			@Pc(23) byte[] local23 = new byte[512];
			@Pc(29) Random local29 = new Random((long) arg0);
			for (@Pc(31) int local31 = 0; local31 < 255; local31++) {
				local23[local31] = (byte) local31;
			}
			for (@Pc(46) int local46 = 0; local46 < 255; local46++) {
				@Pc(53) int local53 = 255 - local46;
				@Pc(58) int local58 = Static512.method7419(local53, local29);
				@Pc(62) byte local62 = local23[local58];
				local23[local58] = local23[local53];
				local23[local53] = local23[511 - local46] = local62;
			}
			local18 = new Class3_Sub7_Sub8(local23);
			Static268.aClass282_4.method6850(local18, (long) arg0);
		}
		return local18.aByteArray26;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2402(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(22) String local22 = Static353.method5667(arg0);
		if (local22 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < Static606.anInt9791; local31++) {
			@Pc(37) String local37 = Static233.aStringArray32[local31];
			if (local37.startsWith("*")) {
				local37 = local37.substring(1);
			}
			local37 = Static353.method5667(local37);
			if (local37 != null && local37.equals(local22)) {
				Static606.anInt9791--;
				for (@Pc(61) int local61 = local31; local61 < Static606.anInt9791; local61++) {
					Static233.aStringArray32[local61] = Static233.aStringArray32[local61 + 1];
					Static633.aStringArray14[local61] = Static633.aStringArray14[local61 + 1];
					Static112.anIntArray152[local61] = Static112.anIntArray152[local61 + 1];
					Static1.aStringArray75[local61] = Static1.aStringArray75[local61 + 1];
					Static33.anIntArray38[local61] = Static33.anIntArray38[local61 + 1];
					Static211.aBooleanArray13[local61] = Static211.aBooleanArray13[local61 + 1];
				}
				Static492.anInt8360 = Static303.anInt8405;
				@Pc(126) Class3_Sub27 local126 = Static59.method1040(Static325.aClass20_2, Static96.aClass314_36);
				local126.aClass3_Sub9_Sub2_2.method5572(Static300.method8285(arg0));
				local126.aClass3_Sub9_Sub2_2.method5638(arg0);
				Static148.method2572(local126);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ZBIIIIIF)[I")
	public static int[] method2403(@OriginalArg(7) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class3_Sub2_Sub25 local10 = new Class3_Sub2_Sub25();
		local10.anInt6677 = 4;
		local10.anInt6675 = 35;
		local10.anInt6676 = 8;
		local10.aBoolean483 = true;
		local10.anInt6678 = (int) (arg0 * 4096.0F);
		local10.anInt6682 = 8;
		local10.method8673();
		Static432.method6572(2048, 1);
		local10.method5810(local6, 0);
		return local6;
	}
}

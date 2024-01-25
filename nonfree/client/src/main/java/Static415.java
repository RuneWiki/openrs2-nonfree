import jaggl.OpenGL;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
	public static int anInt7174;

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
	public static int anInt7175;

	@OriginalMember(owner = "client!pp", name = "A", descriptor = "Lclient!bi;")
	public static Class31 aClass31_92;

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method5942(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static41.anInt810 = 9;
		Static514.anInt8839 = 0x1 << Static41.anInt810;
		Static436.anInt7494 = Static514.anInt8839 >> 1;
		Static34.anInt9208 = (int) Math.sqrt((double) (Static436.anInt7494 * Static436.anInt7494 + Static436.anInt7494 * Static436.anInt7494));
		Static214.anInt5682 = Static514.anInt8839 >> 2;
		Static168.anInt3649 = Static514.anInt8839;
		Static173.anInt3719 = arg0;
		Static357.anInt6212 = arg1;
		anInt7175 = arg2;
		Static306.aClass100ArrayArrayArray1 = new Class100[4][Static173.anInt3719][Static357.anInt6212];
		Static45.aClass16Array1 = new Class16[4];
		if (arg3) {
			Static577.anIntArrayArray78 = new int[Static173.anInt3719][Static357.anInt6212];
			Static68.aByteArrayArray6 = new byte[Static173.anInt3719][Static357.anInt6212];
			Static310.aShortArrayArray23 = new short[Static173.anInt3719][Static357.anInt6212];
			Static391.aClass100ArrayArrayArray3 = new Class100[1][Static173.anInt3719][Static357.anInt6212];
			Static109.aClass16Array2 = new Class16[1];
		} else {
			Static577.anIntArrayArray78 = null;
			Static68.aByteArrayArray6 = null;
			Static310.aShortArrayArray23 = null;
			Static391.aClass100ArrayArrayArray3 = null;
			Static109.aClass16Array2 = null;
		}
		if (arg4) {
			Static348.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static22.aClass32Array1 = new Class32[65535];
			Static396.aBooleanArray28 = new boolean[65535];
			Static413.anInt7145 = 0;
		} else {
			Static348.aLongArrayArrayArray1 = null;
			Static22.aClass32Array1 = null;
			Static396.aBooleanArray28 = null;
			Static413.anInt7145 = 0;
		}
		Static58.method855(false);
		Static465.aClass125Array2 = new Class125[1000];
		Static115.anInt2689 = 0;
		Static215.aClass125Array1 = new Class125[1000];
		Static512.anInt8808 = 0;
		Static327.anIntArrayArrayArray21 = new int[4][Static173.anInt3719 + 1][Static357.anInt6212 + 1];
		Static463.aClass10_Sub1Array3 = new Class10_Sub1[5000];
		Static593.anInt9755 = 0;
		Static56.aBooleanArrayArray1 = new boolean[anInt7175 + anInt7175 + 1][anInt7175 + anInt7175 + 1];
		Static575.aBooleanArrayArray6 = new boolean[anInt7175 + anInt7175 + 2][anInt7175 + anInt7175 + 2];
		Static146.aClass40_1 = null;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IILclient!no;Ljava/lang/String;)Lclient!m;")
	public static Class216 method5943(@OriginalArg(2) Class66_Sub3 arg0, @OriginalArg(3) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static384.anIntArray544, 0);
		if (Static384.anIntArray544[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class216(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZIIII)V")
	public static void method5944(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 - arg0 >= Static68.anInt1306 && arg1 + arg0 <= Static589.anInt9684 && arg2 - arg0 >= Static252.anInt4971 && arg0 + arg2 <= Static359.anInt6232) {
			Static122.method6909(arg0, arg3, arg1, arg2);
		} else {
			Static424.method6075(arg1, arg2, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BI)I")
	public static int method5946(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}
}

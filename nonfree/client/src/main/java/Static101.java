import java.awt.Rectangle;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
	public static int anInt1980;

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "Lclient!la;")
	public static Class207 aClass207_23;

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "Lclient!cl;")
	public static Class57 aClass57_3;

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_22 = new Class46(14, 4);

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!ha;ZIIIIII)V")
	public static void method1627(@OriginalArg(0) Class133 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		Static9.aClass133_1 = arg0;
		Static10.aClass113_1 = Static9.aClass133_1.method7275();
		Static633.aClass113_9 = Static9.aClass133_1.method7275();
		Static182.aClass113_3 = Static9.aClass133_1.method7275();
		Static483.anInt8236 = 1;
		Static614.anInt10281 = 2;
		Static110.anInt2062 = 0;
		Static252.anInt4593 = arg3;
		Static444.anInt7581 = 0;
		Static408.anInt7120 = arg1;
		Static477.anInterface16_1 = null;
		Static283.anInt5005 = 2;
		Static137.method2017(arg4, arg2);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZII)Lclient!wj;")
	public static Class5_Sub5_Sub21 method1629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class5_Sub5_Sub21 local15 = (Class5_Sub5_Sub21) Static529.aClass273_41.method6581((long) arg1 | (long) arg0 << 32);
		if (local15 == null) {
			local15 = new Class5_Sub5_Sub21(arg0, arg1);
			Static529.aClass273_41.method6585(local15.aLong278, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/io/File;[BII)V")
	public static void method1630(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local14.readFully(arg1, 0, arg2);
		} catch (@Pc(21) EOFException local21) {
		}
		local14.close();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method1631(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local10 += 3;
			}
		}
		@Pc(47) StringBuffer local47 = new StringBuffer(local10 + local8);
		for (@Pc(49) int local49 = 0; local49 < local8; local49++) {
			@Pc(55) char local55 = arg0.charAt(local49);
			if (local55 == '<') {
				local47.append("<lt>");
			} else if (local55 == '>') {
				local47.append("<gt>");
			} else {
				local47.append(local55);
			}
		}
		return local47.toString();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIFIIZIII)[[I")
	public static int[][] method1632(@OriginalArg(2) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class5_Sub2_Sub30 local13 = new Class5_Sub2_Sub30();
		local13.aBoolean654 = false;
		local13.anInt8908 = (int) (arg0 * 4096.0F);
		local13.anInt8915 = 4;
		local13.anInt8911 = 4;
		local13.anInt8913 = 3;
		local13.method9044();
		Static53.method914(64, 256);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local13.method7677(local45, local9[local45]);
		}
		return local9;
	}
}

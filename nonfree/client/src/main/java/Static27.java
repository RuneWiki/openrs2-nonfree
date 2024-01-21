import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!e", name = "j", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Lclient!dd;")
	public static Class14 aClass14_7;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Lclient!ic;")
	private static Class34 aClass34_382 = Static56.method816("Loading fonts )2 ");

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Lclient!ic;")
	public static Class34 aClass34_383 = aClass34_382;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!ic;")
	public static Class34 aClass34_384 = Static56.method816("(U");

	@OriginalMember(owner = "client!e", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray7 = new int[5][5000];

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Lclient!ic;")
	public static Class34 aClass34_385 = Static56.method816("Fallen lassen");

	@OriginalMember(owner = "client!e", name = "m", descriptor = "I")
	public static int anInt796 = 0;

	@OriginalMember(owner = "client!e", name = "n", descriptor = "Z")
	public static boolean aBoolean39 = false;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static void method494() {
		for (@Pc(12) int local12 = 0; local12 < Static95.anInt2240; local12++) {
			@Pc(18) int local18 = Static3.anIntArray4[local12];
			@Pc(22) Class8_Sub1_Sub1_Sub4_Sub1 local22 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local18];
			@Pc(26) int local26 = Static10.aClass8_Sub20_Sub1_1.method1872();
			if ((local26 & 0x20) != 0) {
				local26 += Static10.aClass8_Sub20_Sub1_1.method1872() << 8;
			}
			Static48.method1953(local18, local26, local22);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method495(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(14) RuntimeException_Sub1 local14 = (RuntimeException_Sub1) arg0;
			local24 = local14.aString5 + " | ";
			arg0 = local14.aThrowable1;
		} else {
			local24 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local34.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			while (true) {
				@Pc(61) String local61 = local55.readLine();
				if (local61 == null) {
					return local24 + "| " + local58;
				}
				@Pc(67) int local67 = local61.indexOf(40);
				@Pc(74) int local74 = local61.indexOf(41, local67 + 1);
				if (local67 >= 0 && local74 >= 0) {
					@Pc(91) String local91 = local61.substring(local67 + 1, local74);
					@Pc(95) int local95 = local91.indexOf(".java:");
					if (local95 >= 0) {
						local91 = local91.substring(0, local95) + local91.substring(local95 + 5);
						local24 = local24 + local91 + ' ';
						continue;
					}
					local61 = local61.substring(0, local67);
				}
				local61 = local61.trim();
				local61 = local61.substring(local61.lastIndexOf(32) + 1);
				local61 = local61.substring(local61.lastIndexOf(9) + 1);
				local24 = local24 + local61 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!wf;I)V")
	public static void method496(@OriginalArg(0) Class8_Sub24 arg0) {
		@Pc(11) int local11 = arg0.anInt3143;
		if (local11 == 324) {
			if (Static86.anInt2178 == -1) {
				Static129.anInt3030 = arg0.anInt3163;
				Static86.anInt2178 = arg0.anInt3138;
			}
			if (Static134.aClass52_2.aBoolean75) {
				arg0.anInt3138 = Static86.anInt2178;
			} else {
				arg0.anInt3138 = Static129.anInt3030;
			}
		} else if (local11 == 325) {
			if (Static86.anInt2178 == -1) {
				Static129.anInt3030 = arg0.anInt3163;
				Static86.anInt2178 = arg0.anInt3138;
			}
			if (Static134.aClass52_2.aBoolean75) {
				arg0.anInt3138 = Static129.anInt3030;
			} else {
				arg0.anInt3138 = Static86.anInt2178;
			}
		} else if (local11 == 327) {
			arg0.anInt3101 = 150;
			arg0.anInt3160 = (int) (Math.sin((double) Static21.anInt655 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3133 = 0;
			arg0.anInt3116 = 5;
		} else if (local11 == 328) {
			arg0.anInt3101 = 150;
			arg0.anInt3160 = (int) (Math.sin((double) Static21.anInt655 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3116 = 5;
			arg0.anInt3133 = 1;
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)J")
	public static synchronized long method497() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (Static29.aLong29 > local10) {
			Static6.aLong2 += Static29.aLong29 - local10;
		}
		Static29.aLong29 = local10;
		return local10 + Static6.aLong2;
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	public static void method498() {
		aClass34_382 = null;
		aClass14_7 = null;
		aClass34_385 = null;
		anIntArrayArray7 = null;
		aClass34_383 = null;
		aShortArrayArray1 = null;
		aClass34_384 = null;
	}
}

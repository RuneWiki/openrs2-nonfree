import java.awt.Container;
import java.awt.Insets;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!ola", name = "J", descriptor = "J")
	public static long aLong245;

	@OriginalMember(owner = "client!ola", name = "G", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_114 = new Class397(113, 3);

	@OriginalMember(owner = "client!ola", name = "D", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_115 = new Class397(137, 1);

	@OriginalMember(owner = "client!ola", name = "b", descriptor = "(B)V")
	public static void method6408() {
		Static469.aBoolean496 = true;
	}

	@OriginalMember(owner = "client!ola", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method6410(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(23) String local23;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local23 = local11.aString18 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local23 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local34.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(65) String local65 = local55.readLine();
		while (true) {
			@Pc(68) String local68 = local55.readLine();
			if (local68 == null) {
				return local23 + "| " + local65;
			}
			@Pc(74) int local74 = local68.indexOf(40);
			@Pc(81) int local81 = local68.indexOf(41, local74 + 1);
			@Pc(91) String local91;
			if (local74 == -1) {
				local91 = local68;
			} else {
				local91 = local68.substring(0, local74);
			}
			local91 = local91.trim();
			local91 = local91.substring(local91.lastIndexOf(32) + 1);
			local91 = local91.substring(local91.lastIndexOf(9) + 1);
			local23 = local23 + local91;
			if (local74 != -1 && local81 != -1) {
				@Pc(142) int local142 = local68.indexOf(".java:", local74);
				if (local142 >= 0) {
					local23 = local23 + local68.substring(local142 + 5, local81);
				}
			}
			local23 = local23 + ' ';
		}
	}

	@OriginalMember(owner = "client!ola", name = "a", descriptor = "(IZBIII)V")
	public static void method6411(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static702.aFrame3 != null && (arg3 != 3 || arg4 != Static109.anInt2314 || arg2 != Static508.anInt8074)) {
			Static392.method5317(Static122.aClass47_1, Static702.aFrame3);
			Static702.aFrame3 = null;
		}
		if (arg3 == 3 && Static702.aFrame3 == null) {
			Static702.aFrame3 = Static663.method8645(0, arg2, Static122.aClass47_1, arg4);
			if (Static702.aFrame3 != null) {
				Static109.anInt2314 = arg4;
				Static508.anInt8074 = arg2;
				Static124.method2284();
			}
		}
		if (arg3 == 3 && Static702.aFrame3 == null) {
			method6411(arg0, true, -1, Static580.aClass3_Sub22_24.aClass21_Sub29_1.method8657(), -1);
			return;
		}
		@Pc(101) Container local101;
		@Pc(134) Insets local134;
		if (Static702.aFrame3 != null) {
			local101 = Static702.aFrame3;
			Static342.anInt5491 = arg2;
			Static91.anInt2083 = arg4;
		} else if (Static628.aFrame2 == null) {
			if (Static41.anApplet1 == null) {
				local101 = Static229.anApplet_Sub1_1;
			} else {
				local101 = Static41.anApplet1;
			}
			Static91.anInt2083 = local101.getSize().width;
			Static342.anInt5491 = local101.getSize().height;
		} else {
			local134 = Static628.aFrame2.getInsets();
			@Pc(140) int local140 = -local134.left;
			Static91.anInt2083 = Static628.aFrame2.getSize().width + local140 - local134.right;
			Static342.anInt5491 = Static628.aFrame2.getSize().height - local134.bottom - local134.top;
			local101 = Static628.aFrame2;
		}
		if (arg3 == 1) {
			Static76.anInt1720 = Static700.anInt10927;
			Static388.anInt5985 = 0;
			Static681.anInt10652 = Static221.anInt3616;
			Static251.anInt3914 = (Static91.anInt2083 - Static221.anInt3616) / 2;
		} else {
			Static401.method5417();
		}
		if (Static416.aClass379_6 != Static286.aClass379_8) {
			@Pc(198) boolean local198;
			if (Static681.anInt10652 < 1024 && Static76.anInt1720 < 768) {
				local198 = true;
			} else {
				local198 = false;
			}
		}
		if (arg1) {
			Static317.method4648();
		} else {
			Static508.aCanvas8.setSize(Static681.anInt10652, Static76.anInt1720);
			if (Static347.aBoolean360) {
				Static308.method4569(Static508.aCanvas8);
			} else {
				Static153.aClass22_4.method9401(Static508.aCanvas8, Static681.anInt10652, Static76.anInt1720);
			}
			if (local101 == Static628.aFrame2) {
				local134 = Static628.aFrame2.getInsets();
				Static508.aCanvas8.setLocation(Static251.anInt3914 + local134.left, local134.top - -Static388.anInt5985);
			} else {
				Static508.aCanvas8.setLocation(Static251.anInt3914, Static388.anInt5985);
			}
		}
		if (arg3 >= 2) {
			Static283.aBoolean287 = true;
		} else {
			Static283.aBoolean287 = false;
		}
		if (Static589.anInt8959 != -1) {
			Static614.method7866(true);
		}
		if (Static95.aClass292_2.aClass118_2 != null && Static472.method6431(Static98.anInt2140)) {
			Static353.method4960();
		}
		for (@Pc(293) int local293 = 0; local293 < 100; local293++) {
			Static572.aBooleanArray23[local293] = true;
		}
		Static43.aBoolean88 = true;
	}
}

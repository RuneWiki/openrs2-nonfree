import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "F")
	public static float aFloat50;

	@OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
	public static int anInt3615;

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "[I")
	public static int[] anIntArray295 = new int[2];

	@OriginalMember(owner = "client!lg", name = "p", descriptor = "[I")
	public static int[] anIntArray296 = new int[2];

	@OriginalMember(owner = "client!lg", name = "t", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_72 = new Class93("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!lg", name = "x", descriptor = "Z")
	public static boolean aBoolean319 = false;

	@OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
	public static int anInt3622 = 0;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)I")
	public static int method3309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = arg1 & 0x1 | local12 << 1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local12;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)Lclient!of;")
	public static Class144 method3316(@OriginalArg(0) int arg0) {
		@Pc(5) Class119 local5 = Static32.aClass119_18;
		@Pc(14) Class144 local14;
		synchronized (Static32.aClass119_18) {
			local14 = (Class144) Static32.aClass119_18.method3311((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static166.aClass191_103.method5459(16, arg0);
		local14 = new Class144();
		if (local30 != null) {
			local14.method3976(new Class2_Sub10(local30));
		}
		@Pc(45) Class119 local45 = Static32.aClass119_18;
		synchronized (Static32.aClass119_18) {
			Static32.aClass119_18.method3308(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "(B)V")
	public static void method3318() {
		if (Static335.aFrame1 != null) {
			return;
		}
		@Pc(8) int local8 = Static197.anInt3869;
		@Pc(10) int local10 = Static168.anInt3423;
		@Pc(18) int local18 = Static33.anInt591 - local8 - Static136.anInt2829;
		@Pc(30) int local30 = Static1.anInt16 - local10 - Static198.anInt3876;
		if (local8 <= 0 && local18 <= 0 && local10 <= 0 && local30 <= 0) {
			return;
		}
		try {
			@Pc(49) Container local49;
			if (Static348.aFrame2 == null) {
				local49 = Static177.aClass168_2.anApplet1;
			} else {
				local49 = Static348.aFrame2;
			}
			@Pc(55) int local55 = 0;
			@Pc(57) int local57 = 0;
			if (Static348.aFrame2 == local49) {
				@Pc(63) Insets local63 = Static348.aFrame2.getInsets();
				local57 = local63.top;
				local55 = local63.left;
			}
			@Pc(72) Graphics local72 = local49.getGraphics();
			local72.setColor(Color.black);
			if (local8 > 0) {
				local72.fillRect(local55, local57, local8, Static1.anInt16);
			}
			if (local10 > 0) {
				local72.fillRect(local55, local57, Static33.anInt591, local10);
			}
			if (local18 > 0) {
				local72.fillRect(local55 + Static33.anInt591 - local18, local57, local18, Static1.anInt16);
			}
			if (local30 > 0) {
				local72.fillRect(local55, local57 + Static1.anInt16 - local30, Static33.anInt591, local30);
				return;
			}
		} catch (@Pc(128) Exception local128) {
			return;
		}
	}
}

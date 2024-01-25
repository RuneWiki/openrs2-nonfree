import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cr", name = "J", descriptor = "Lclient!ws;")
	public static Class2_Sub46 aClass2_Sub46_1;

	@OriginalMember(owner = "client!cr", name = "K", descriptor = "Lclient!mk;")
	public static Class159 aClass159_1;

	@OriginalMember(owner = "client!cr", name = "L", descriptor = "B")
	public static byte aByte7;

	@OriginalMember(owner = "client!cr", name = "M", descriptor = "[Lclient!o;")
	public static Class13[] aClass13Array2;

	@OriginalMember(owner = "client!cr", name = "N", descriptor = "I")
	public static int anInt1129;

	@OriginalMember(owner = "client!cr", name = "I", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_34 = new Class211(70, 0);

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z[B)Z")
	public static boolean method900(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class2_Sub13 local8 = new Class2_Sub13(arg0);
		@Pc(12) int local12 = local8.method3580();
		if (local12 != 2) {
			return false;
		}
		@Pc(30) boolean local30 = local8.method3580() == 1;
		if (local30) {
			Static253.method3203(local8);
		}
		Static219.method4781(local8);
		return true;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!sv;I)Lclient!kj;")
	public static Class57_Sub2 method902(@OriginalArg(0) Class2_Sub13 arg0) {
		return new Class57_Sub2(arg0.method3558(), arg0.method3558(), arg0.method3558(), arg0.method3558(), arg0.method3563(), arg0.method3580());
	}

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "(I)V")
	public static void method903() {
		if (Static300.aFrame4 != null) {
			return;
		}
		@Pc(12) int local12 = Static7.anInt125;
		@Pc(14) int local14 = Static287.anInt4720;
		@Pc(21) int local21 = Static155.anInt2673 - local12 - Static141.anInt2513;
		@Pc(29) int local29 = Static324.anInt5540 - local14 - Static314.anInt5426;
		if (local12 <= 0 && local21 <= 0 && local14 <= 0 && local29 <= 0) {
			return;
		}
		try {
			@Pc(48) Container local48;
			if (Static261.aFrame3 == null) {
				local48 = Static79.aClass183_2.anApplet1;
			} else {
				local48 = Static261.aFrame3;
			}
			@Pc(54) int local54 = 0;
			@Pc(56) int local56 = 0;
			if (local48 == Static261.aFrame3) {
				@Pc(62) Insets local62 = Static261.aFrame3.getInsets();
				local54 = local62.left;
				local56 = local62.top;
			}
			@Pc(71) Graphics local71 = local48.getGraphics();
			local71.setColor(Color.black);
			if (local12 > 0) {
				local71.fillRect(local54, local56, local12, Static324.anInt5540);
			}
			if (local14 > 0) {
				local71.fillRect(local54, local56, Static155.anInt2673, local14);
			}
			if (local21 > 0) {
				local71.fillRect(Static155.anInt2673 + local54 - local21, local56, local21, Static324.anInt5540);
			}
			if (local29 > 0) {
				local71.fillRect(local54, local56 + Static324.anInt5540 - local29, Static155.anInt2673, local29);
				return;
			}
		} catch (@Pc(125) Exception local125) {
			return;
		}
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(IBI)I")
	public static int method904(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = local7 << 1 | arg1 & 0x1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(ZII)Z")
	public static boolean method905(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 | Static360.method4753(arg1, arg0) || Static261.method1844(arg0, arg1);
	}
}

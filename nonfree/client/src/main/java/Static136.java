import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "Lclient!eb;")
	public static final Class42 aClass42_40 = new Class42();

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray54 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "Z")
	public static boolean aBoolean381 = false;

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V")
	public static void method4750() {
		if (Static31.aFrame1 != null) {
			return;
		}
		@Pc(13) int local13 = Static87.anInt1924;
		@Pc(15) int local15 = Static100.anInt2305;
		@Pc(23) int local23 = Static210.anInt4185 - local13 - Static213.anInt4274;
		@Pc(29) int local29 = Static281.anInt5472 - Static130.anInt2825 - local15;
		if (local13 <= 0 && local23 <= 0 && local15 <= 0 && local29 <= 0) {
			return;
		}
		try {
			@Pc(45) Container local45;
			if (Static39.aFrame2 == null) {
				local45 = Static227.aClass75_5.anApplet1;
			} else {
				local45 = Static39.aFrame2;
			}
			@Pc(51) int local51 = 0;
			@Pc(53) int local53 = 0;
			if (Static39.aFrame2 == local45) {
				@Pc(59) Insets local59 = Static39.aFrame2.getInsets();
				local53 = local59.top;
				local51 = local59.left;
			}
			@Pc(68) Graphics local68 = local45.getGraphics();
			local68.setColor(Color.black);
			if (local13 > 0) {
				local68.fillRect(local51, local53, local13, Static281.anInt5472);
			}
			if (local15 > 0) {
				local68.fillRect(local51, local53, Static210.anInt4185, local15);
			}
			if (local23 > 0) {
				local68.fillRect(Static210.anInt4185 + local51 - local23, local53, local23, Static281.anInt5472);
			}
			if (local29 > 0) {
				local68.fillRect(local51, Static281.anInt5472 + local53 - local29, Static210.anInt4185, local29);
				return;
			}
		} catch (@Pc(123) Exception local123) {
			return;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
	public static void method4751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class155 local7 = Static105.aClass155ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass11_Sub4_1 != null) {
			local7.aClass11_Sub4_1 = null;
		}
		if (local7.aClass11_Sub4_2 != null) {
			local7.aClass11_Sub4_2 = null;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[B)Lclient!hg;")
	public static Class1_Sub4_Sub12 method4752(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class1_Sub4_Sub12 local9 = new Class1_Sub4_Sub12();
		@Pc(22) Class1_Sub7 local22 = new Class1_Sub7(arg0);
		local22.anInt2219 = local22.aByteArray41.length - 2;
		@Pc(33) int local33 = local22.method2161();
		@Pc(43) int local43 = local22.aByteArray41.length - local33 - 12 - 2;
		local22.anInt2219 = local43;
		@Pc(50) int local50 = local22.method2140();
		local9.anInt2583 = local22.method2161();
		local9.anInt2585 = local22.method2161();
		local9.anInt2584 = local22.method2161();
		local9.anInt2587 = local22.method2161();
		@Pc(74) int local74 = local22.method2132();
		@Pc(85) int local85;
		@Pc(91) int local91;
		if (local74 > 0) {
			local9.aClass38Array1 = new Class38[local74];
			for (local85 = 0; local85 < local74; local85++) {
				local91 = local22.method2161();
				@Pc(98) Class38 local98 = new Class38(Static73.method1617(local91));
				local9.aClass38Array1[local85] = local98;
				while (local91-- > 0) {
					@Pc(109) int local109 = local22.method2140();
					@Pc(113) int local113 = local22.method2140();
					local98.method1472(new Class1_Sub9(local113), (long) local109);
				}
			}
		}
		local22.anInt2219 = 0;
		local9.aString19 = local22.method2120();
		local9.anIntArray192 = new int[local50];
		local9.anIntArray191 = new int[local50];
		local9.aStringArray9 = new String[local50];
		local85 = 0;
		while (local43 > local22.anInt2219) {
			local91 = local22.method2161();
			if (local91 == 3) {
				local9.aStringArray9[local85] = local22.method2109().intern();
			} else if (local91 >= 100 || local91 == 21 || local91 == 38 || local91 == 39) {
				local9.anIntArray192[local85] = local22.method2132();
			} else {
				local9.anIntArray192[local85] = local22.method2140();
			}
			local9.anIntArray191[local85++] = local91;
		}
		return local9;
	}
}

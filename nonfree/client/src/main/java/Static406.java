import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!mga", name = "E", descriptor = "I")
	public static int anInt10703;

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IILclient!ima;II)V")
	public static void method9098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub30 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg1 << 14 | arg3 << 28 | arg0);
		@Pc(22) Class3_Sub28 local22 = (Class3_Sub28) Static113.aClass313_9.method7104(local16);
		if (local22 == null) {
			local22 = new Class3_Sub28();
			Static113.aClass313_9.method7107(local16, local22);
			local22.aClass342_37.method7654(arg2);
			return;
		}
		@Pc(54) Class275 local54 = Static606.aClass62_2.method1887(arg2.anInt4371);
		@Pc(57) int local57 = local54.anInt7279;
		if (local54.anInt7250 == 1) {
			local57 *= arg2.anInt4369 + 1;
		}
		for (@Pc(76) Class3_Sub30 local76 = (Class3_Sub30) local22.aClass342_37.method7644(); local76 != null; local76 = (Class3_Sub30) local22.aClass342_37.method7650()) {
			local54 = Static606.aClass62_2.method1887(local76.anInt4371);
			@Pc(87) int local87 = local54.anInt7279;
			if (local54.anInt7250 == 1) {
				local87 *= local76.anInt4369 + 1;
			}
			if (local57 > local87) {
				Static650.method8555(arg2, local76);
				return;
			}
		}
		local22.aClass342_37.method7654(arg2);
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IIIII)V")
	public static void method9099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static723.anIntArrayArray72 != null) {
			Static723.anIntArrayArray72[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static329.aShortArrayArray2 != null) {
			Static329.aShortArrayArray2[arg0][arg1] = (short) arg3;
		}
		if (Static393.aByteArrayArray8 != null) {
			Static393.aByteArrayArray8[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(BI)V")
	public static void method9100(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub7_Sub21 local14 = Static136.method2378((long) arg0, 5);
		local14.method9260();
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "()V")
	public static void method9101() {
		if (Static478.anInt5834 == 0 || Static187.aClass57_4 == null) {
			return;
		}
		Static404.aClass22_6.K(Static105.anIntArray127);
		for (@Pc(14) int local14 = 0; local14 < Static124.anIntArray148.length; local14++) {
			Static404.aClass22_6.method9330(Static124.anIntArray148[local14] + Static583.anIntArray646[local14], Static105.anIntArray127[3] - Static105.anIntArray127[1], -256, Static105.anIntArray127[1]);
		}
		for (@Pc(43) int local43 = 0; local43 < Static525.anInt8215; local43++) {
			@Pc(48) Class108 local48 = Static79.aClass108Array3[local43];
			Static404.aClass22_6.H(local48.anIntArray194[0], local48.anIntArray196[0], local48.anIntArray195[0], Static149.anIntArray173);
			Static404.aClass22_6.H(local48.anIntArray194[1], local48.anIntArray196[1], local48.anIntArray195[1], Static185.anIntArray212);
			Static404.aClass22_6.H(local48.anIntArray194[2], local48.anIntArray196[2], local48.anIntArray195[2], Static80.anIntArray294);
			Static404.aClass22_6.H(local48.anIntArray194[3], local48.anIntArray196[3], local48.anIntArray195[3], Static486.anIntArray564);
			if (Static149.anIntArray173[2] != -1 && Static185.anIntArray212[2] != -1 && Static80.anIntArray294[2] != -1 && Static486.anIntArray564[2] != -1) {
				@Pc(136) int local136 = -65536;
				if (local48.aByte57 == 4) {
					local136 = -16776961;
				}
				Static404.aClass22_6.method9327(local136, Static185.anIntArray212[1], Static149.anIntArray173[1], Static185.anIntArray212[0], Static149.anIntArray173[0]);
				Static404.aClass22_6.method9327(local136, Static80.anIntArray294[1], Static185.anIntArray212[1], Static80.anIntArray294[0], Static185.anIntArray212[0]);
				Static404.aClass22_6.method9327(local136, Static486.anIntArray564[1], Static80.anIntArray294[1], Static486.anIntArray564[0], Static80.anIntArray294[0]);
				Static404.aClass22_6.method9327(local136, Static149.anIntArray173[1], Static486.anIntArray564[1], Static149.anIntArray173[0], Static486.anIntArray564[0]);
				Static404.aClass22_6.method9327(local136, Static80.anIntArray294[1], Static149.anIntArray173[1], Static80.anIntArray294[0], Static149.anIntArray173[0]);
			}
		}
		Static187.aClass57_4.method9131(-16777216, 75, -256, 10, "Dynamic: " + Static101.anInt2152 + "/" + 5000);
		Static187.aClass57_4.method9131(-16777216, 90, -256, 10, "Total Opaque Onscreen: " + Static493.anInt7806 + "/" + 10000);
		Static187.aClass57_4.method9131(-16777216, 105, -256, 10, "Total Trans Onscreen: " + Static607.anInt9203 + "/" + 5000);
		Static187.aClass57_4.method9131(-16777216, 120, -256, 10, "Occluders: " + (Static328.anInt8407 + Static86.anInt2031) + " Active: " + Static525.anInt8215);
		Static187.aClass57_4.method9131(-16777216, 135, -256, 10, "Occluded: Ground:" + Static65.anInt8656 + " Walls: " + Static62.anInt1503 + " CPs: " + Static456.anInt7106 + " Pixels: " + Static532.anInt8283);
		Static187.aClass57_4.method9131(-16777216, 150, -256, 10, "Occlude Calc Took: " + Static691.aLong331 / 1000L + "us");
		if (Static478.anInt5834 != 2 || Static628.anIntArray700 == null) {
			return;
		}
		for (@Pc(389) int local389 = 0; local389 < Static628.anIntArray700.length; local389++) {
			@Pc(395) float local395 = (float) Static628.anIntArray700[local389];
			local395 /= 4194304.0F;
			if (local395 > 1.0F) {
				local395 = 1.0F;
			}
			local395 *= 255.0F;
			local395 = 255.0F - local395;
			@Pc(416) int local416 = (int) local395;
			Static628.anIntArray700[local389] = local416 | local416 << 8 | local416 << 16 | 0xFF000000;
		}
		@Pc(444) Class178 local444 = Static404.aClass22_6.method9367(Static628.anIntArray700, Static587.anInt8944, Static391.anInt6094, Static587.anInt8944);
		local444.method7616(10, 170, 1, 0, 0);
	}
}

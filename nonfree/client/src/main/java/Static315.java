import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "Lclient!lg;")
	public static Class60 aClass60_7;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "Lclient!ar;")
	public static final Class15 aClass15_3 = new Class15(16);

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
	public static int anInt1641 = 0;

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "Lclient!um;")
	public static final Class204 aClass204_4 = new Class204();

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
	public static int anInt1642 = 0;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method1381() {
		if (Static56.anIntArray139 != null) {
			return;
		}
		Static56.anIntArray139 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < 512; local23++) {
			@Pc(36) float local36 = ((float) (local23 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(45) float local45 = (float) (local23 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(47) int local47 = 0; local47 < 128; local47++) {
				@Pc(54) float local54 = (float) local47 / 128.0F;
				@Pc(56) float local56 = 0.0F;
				@Pc(58) float local58 = 0.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(64) float local64 = local36 / 60.0F;
				@Pc(67) int local67 = (int) local64;
				@Pc(71) int local71 = local67 % 6;
				@Pc(77) float local77 = (float) -local67 + local64;
				@Pc(83) float local83 = local54 * (1.0F - local45);
				@Pc(92) float local92 = (1.0F - local45 * local77) * local54;
				@Pc(104) float local104 = local54 * (1.0F - local45 * (1.0F - local77));
				if (local71 == 0) {
					local56 = local54;
					local60 = local83;
					local58 = local104;
				} else if (local71 == 1) {
					local56 = local92;
					local58 = local54;
					local60 = local83;
				} else if (local71 == 2) {
					local60 = local104;
					local58 = local54;
					local56 = local83;
				} else if (local71 == 3) {
					local58 = local92;
					local60 = local54;
					local56 = local83;
				} else if (local71 == 4) {
					local58 = local83;
					local60 = local54;
					local56 = local104;
				} else if (local71 == 5) {
					local60 = local92;
					local58 = local83;
					local56 = local54;
				}
				local56 = (float) Math.pow((double) local56, local19);
				local58 = (float) Math.pow((double) local58, local19);
				local60 = (float) Math.pow((double) local60, local19);
				@Pc(201) int local201 = (int) (local56 * 256.0F);
				@Pc(206) int local206 = (int) (local58 * 256.0F);
				@Pc(211) int local211 = (int) (local60 * 256.0F);
				@Pc(223) int local223 = local211 + (local206 << 8) + (local201 << 16) - 16777216;
				Static56.anIntArray139[local21++] = local223;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
	public static void method1382() {
		Static320.aClass4_Sub7_Sub1_3.method1237(106);
		Static320.aClass4_Sub7_Sub1_3.method2376(Static191.anInt4118);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lclient!nf;")
	public static Class4_Sub1_Sub14 method1383(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub1_Sub14 local10 = (Class4_Sub1_Sub14) Static256.aClass154_80.method4222((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static110.aClass11_49.method288(arg0, 26);
		local10 = new Class4_Sub1_Sub14();
		if (local20 != null) {
			local10.method3632(new Class4_Sub7(local20));
		}
		Static256.aClass154_80.method4221((long) arg0, local10);
		return local10;
	}
}

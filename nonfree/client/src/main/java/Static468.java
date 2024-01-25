import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "Lclient!aj;")
	public static Class15 aClass15_118;

	@OriginalMember(owner = "client!pr", name = "y", descriptor = "Lclient!rq;")
	public static Class306 aClass306_5;

	@OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
	public static int anInt7689 = -1;

	@OriginalMember(owner = "client!pr", name = "r", descriptor = "Lclient!mt;")
	public static final Class228 aClass228_13 = new Class228(14, 0, 4, 1);

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(Z)V")
	public static void method6791() {
		if (Static211.anIntArray738 != null) {
			return;
		}
		Static211.anIntArray738 = new int[65536];
		@Pc(17) double local17 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < 512; local26++) {
			@Pc(39) float local39 = ((float) (local26 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(48) float local48 = (float) (local26 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(50) int local50 = 0; local50 < 128; local50++) {
				@Pc(56) float local56 = (float) local50 / 128.0F;
				@Pc(58) float local58 = 0.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(66) float local66 = local39 / 60.0F;
				@Pc(69) int local69 = (int) local66;
				@Pc(73) int local73 = local69 % 6;
				@Pc(78) float local78 = local66 - (float) local69;
				@Pc(85) float local85 = (1.0F - local48) * local56;
				@Pc(93) float local93 = (1.0F - local78 * local48) * local56;
				@Pc(104) float local104 = (1.0F - (1.0F - local78) * local48) * local56;
				if (local73 == 0) {
					local60 = local104;
					local58 = local56;
					local62 = local85;
				} else if (local73 == 1) {
					local62 = local85;
					local60 = local56;
					local58 = local93;
				} else if (local73 == 2) {
					local62 = local104;
					local60 = local56;
					local58 = local85;
				} else if (local73 == 3) {
					local62 = local56;
					local58 = local85;
					local60 = local93;
				} else if (local73 == 4) {
					local60 = local85;
					local62 = local56;
					local58 = local104;
				} else if (local73 == 5) {
					local62 = local93;
					local58 = local56;
					local60 = local85;
				}
				local58 = (float) Math.pow((double) local58, local17);
				local60 = (float) Math.pow((double) local60, local17);
				local62 = (float) Math.pow((double) local62, local17);
				@Pc(191) int local191 = (int) (local58 * 256.0F);
				@Pc(196) int local196 = (int) (local60 * 256.0F);
				@Pc(201) int local201 = (int) (local62 * 256.0F);
				@Pc(214) int local214 = (local196 << 8) + (local191 << 16) + local201 - 16777216;
				Static211.anIntArray738[local24++] = local214;
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BLclient!bba;)V")
	public static void method6792(@OriginalArg(1) Class28_Sub1_Sub1_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt10755 == Static588.anInt9467 || arg0.anInt10773 == -1 || arg0.anInt10775 != 0) {
			local5 = true;
		} else {
			@Pc(33) Class372 local33 = Static243.aClass343_3.method8356(arg0.anInt10773);
			if (local33.aBoolean774 || arg0.anInt10758 + 1 > local33.anIntArray900[arg0.anInt10750]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(64) int local64 = arg0.anInt10755 - arg0.anInt10780;
			@Pc(69) int local69 = Static588.anInt9467 - arg0.anInt10780;
			@Pc(81) int local81 = arg0.anInt10764 * 512 + arg0.method9314() * 256;
			@Pc(92) int local92 = arg0.anInt10784 * 512 + arg0.method9314() * 256;
			@Pc(104) int local104 = arg0.anInt10746 * 512 + arg0.method9314() * 256;
			@Pc(116) int local116 = arg0.anInt10808 * 512 + arg0.method9314() * 256;
			arg0.anInt10731 = (local69 * local116 + local92 * (local64 - local69)) / local64;
			arg0.anInt10729 = (local69 * local104 + (local64 - local69) * local81) / local64;
		}
		arg0.anInt10811 = 0;
		if (arg0.anInt10776 == 0) {
			arg0.method9324(false, 8192);
		}
		if (arg0.anInt10776 == 1) {
			arg0.method9324(false, 12288);
		}
		if (arg0.anInt10776 == 2) {
			arg0.method9324(false, 0);
		}
		if (arg0.anInt10776 == 3) {
			arg0.method9324(false, 4096);
		}
	}
}

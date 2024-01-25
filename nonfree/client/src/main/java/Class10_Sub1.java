import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "[I")
	private final int[] anIntArray39 = new int[512];

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(I)V")
	public Class10_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray39[local15] = this.anIntArray39[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray39[local42];
			this.anIntArray39[local42] = this.anIntArray39[local42 + 256] = this.anIntArray39[local35];
			this.anIntArray39[local35] = this.anIntArray39[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(FIIFIFIIIF[F)V")
	@Override
	public void method128(@OriginalArg(0) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3, @OriginalArg(7) int arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float[] arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg1 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg0 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg3 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg2 * arg3;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(58) float local58 = local46 - (float) local49;
		@Pc(62) float local62 = 1.0F - local58;
		@Pc(66) float local66 = Static28.method407(local58);
		@Pc(70) int local70 = local49 & local41;
		@Pc(74) int local74 = local53 & local41;
		@Pc(79) int local79 = this.anIntArray39[local70];
		@Pc(84) int local84 = this.anIntArray39[local74];
		for (@Pc(86) int local86 = 0; local86 < 128; local86++) {
			@Pc(101) float local101 = (float) local86 * arg0;
			@Pc(104) int local104 = (int) local101;
			@Pc(108) int local108 = local104 + 1;
			@Pc(113) float local113 = local101 - (float) local104;
			@Pc(117) float local117 = 1.0F - local113;
			@Pc(121) int local121 = local104 & local29;
			@Pc(125) float local125 = Static28.method407(local113);
			@Pc(129) int local129 = local108 & local29;
			@Pc(136) int local136 = this.anIntArray39[local121 + local79];
			@Pc(143) int local143 = this.anIntArray39[local79 + local129];
			@Pc(150) int local150 = this.anIntArray39[local84 + local121];
			@Pc(157) int local157 = this.anIntArray39[local84 + local129];
			for (@Pc(159) int local159 = 0; local159 < 128; local159++) {
				@Pc(166) float local166 = (float) local159 * arg1;
				@Pc(169) int local169 = (int) local166;
				@Pc(173) int local173 = local169 + 1;
				@Pc(179) float local179 = (float) -local169 + local166;
				@Pc(183) float local183 = 1.0F - local179;
				@Pc(187) float local187 = Static28.method407(local179);
				@Pc(191) int local191 = local169 & local17;
				@Pc(195) int local195 = local173 & local17;
				arg6[arg4++] = arg5 * Static205.method2977(Static205.method2977(Static205.method2977(Static10.method4094(local62, this.anIntArray39[local136 + local191] & 0x7, local183, local117), Static10.method4094(local62, this.anIntArray39[local195 + local136] & 0x7, local179, local117), local187), Static205.method2977(Static10.method4094(local62, this.anIntArray39[local191 + local143] & 0x7, local183, local113), Static10.method4094(local62, this.anIntArray39[local195 + local143] & 0x7, local179, local113), local187), local125), Static205.method2977(Static205.method2977(Static10.method4094(local58, this.anIntArray39[local191 + local150] & 0x7, local183, local117), Static10.method4094(local58, this.anIntArray39[local150 + local195] & 0x7, local179, local117), local187), Static205.method2977(Static10.method4094(local58, this.anIntArray39[local157 + local191] & 0x7, local183, local113), Static10.method4094(local58, this.anIntArray39[local157 + local195] & 0x7, local179, local113), local187), local125), local66);
			}
		}
	}
}

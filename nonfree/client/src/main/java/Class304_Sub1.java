import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class304_Sub1 extends Class304 {

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "[I")
	private final int[] anIntArray685 = new int[512];

	static {
		new Class40(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
	public Class304_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray685[local15] = this.anIntArray685[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray685[local44];
			this.anIntArray685[local44] = this.anIntArray685[local44 + 256] = this.anIntArray685[local37];
			this.anIntArray685[local37] = this.anIntArray685[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BIFFIIIIF[FF)V")
	@Override
	public void method7266(@OriginalArg(2) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float[] arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg4 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg0 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg1 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg1 * (float) arg3;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(59) float local59 = (float) -local49 + local46;
		@Pc(64) float local64 = 1.0F - local59;
		@Pc(68) int local68 = local53 & local41;
		@Pc(76) int local76 = local49 & local41;
		@Pc(80) float local80 = Static61.method1168(local59);
		@Pc(85) int local85 = this.anIntArray685[local76];
		@Pc(90) int local90 = this.anIntArray685[local68];
		for (@Pc(92) int local92 = 0; local92 < 128; local92++) {
			@Pc(99) float local99 = arg0 * (float) local92;
			@Pc(102) int local102 = (int) local99;
			@Pc(106) int local106 = local102 + 1;
			@Pc(112) float local112 = (float) -local102 + local99;
			@Pc(117) float local117 = 1.0F - local112;
			@Pc(121) float local121 = Static61.method1168(local112);
			@Pc(125) int local125 = local106 & local29;
			@Pc(129) int local129 = local102 & local29;
			@Pc(137) int local137 = this.anIntArray685[local129 + local85];
			@Pc(145) int local145 = this.anIntArray685[local125 + local85];
			@Pc(153) int local153 = this.anIntArray685[local129 + local90];
			@Pc(161) int local161 = this.anIntArray685[local125 + local90];
			for (@Pc(163) int local163 = 0; local163 < 128; local163++) {
				@Pc(170) float local170 = arg4 * (float) local163;
				@Pc(173) int local173 = (int) local170;
				@Pc(177) int local177 = local173 + 1;
				@Pc(182) float local182 = local170 - (float) local173;
				@Pc(187) float local187 = 1.0F - local182;
				@Pc(191) int local191 = local173 & local17;
				@Pc(195) float local195 = Static61.method1168(local182);
				@Pc(199) int local199 = local177 & local17;
				arg5[arg2++] = Static181.method3085(local80, Static181.method3085(local121, Static181.method3085(local195, Static115.method2244(this.anIntArray685[local161 + local199] & 0x7, local59, local182, local112), Static115.method2244(this.anIntArray685[local191 + local161] & 0x7, local59, local187, local112)), Static181.method3085(local195, Static115.method2244(this.anIntArray685[local199 + local153] & 0x7, local59, local182, local117), Static115.method2244(this.anIntArray685[local153 + local191] & 0x7, local59, local187, local117))), Static181.method3085(local121, Static181.method3085(local195, Static115.method2244(this.anIntArray685[local145 + local199] & 0x7, local64, local182, local112), Static115.method2244(this.anIntArray685[local145 + local191] & 0x7, local64, local187, local112)), Static181.method3085(local195, Static115.method2244(this.anIntArray685[local199 + local137] & 0x7, local64, local182, local117), Static115.method2244(this.anIntArray685[local191 + local137] & 0x7, local64, local187, local117)))) * arg6;
			}
		}
	}
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class175_Sub1 extends Class175 {

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "[I")
	private final int[] anIntArray492 = new int[512];

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(I)V")
	public Class175_Sub1(@OriginalArg(0) int arg0) {
		@Pc(11) Random local11 = new Random((long) arg0);
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			this.anIntArray492[local13] = this.anIntArray492[local13 + 256] = local13;
		}
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			@Pc(38) int local38 = local11.nextInt() & 0xFF;
			@Pc(43) int local43 = this.anIntArray492[local38];
			this.anIntArray492[local38] = this.anIntArray492[local38 + 256] = this.anIntArray492[local32];
			this.anIntArray492[local32] = this.anIntArray492[local32 + 256] = local43;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IF[FIBIIIFFF)V")
	@Override
	public void method6586(@OriginalArg(1) float arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) (arg5 * (float) 128 - 1.0F);
		@Pc(33) int local33 = local13 & 0xFF;
		@Pc(41) int local41 = (int) ((float) 128 * arg4 - 1.0F);
		@Pc(45) int local45 = local41 & 0xFF;
		@Pc(53) int local53 = (int) (arg0 * (float) 16 - 1.0F);
		@Pc(57) int local57 = local53 & 0xFF;
		@Pc(62) float local62 = arg0 * (float) arg3;
		@Pc(65) int local65 = (int) local62;
		@Pc(69) int local69 = local65 + 1;
		@Pc(75) float local75 = (float) -local65 + local62;
		@Pc(80) float local80 = 1.0F - local75;
		@Pc(84) int local84 = local65 & local57;
		@Pc(88) float local88 = Static192.method7242(local75);
		@Pc(92) int local92 = local69 & local57;
		@Pc(97) int local97 = this.anIntArray492[local84];
		@Pc(102) int local102 = this.anIntArray492[local92];
		for (@Pc(104) int local104 = 0; local104 < 128; local104++) {
			@Pc(111) float local111 = (float) local104 * arg4;
			@Pc(114) int local114 = (int) local111;
			@Pc(118) int local118 = local114 + 1;
			@Pc(123) float local123 = local111 - (float) local114;
			@Pc(127) float local127 = 1.0F - local123;
			@Pc(131) int local131 = local118 & local45;
			@Pc(135) float local135 = Static192.method7242(local123);
			@Pc(139) int local139 = local114 & local45;
			@Pc(146) int local146 = this.anIntArray492[local139 + local97];
			@Pc(153) int local153 = this.anIntArray492[local131 + local97];
			@Pc(160) int local160 = this.anIntArray492[local102 + local139];
			@Pc(167) int local167 = this.anIntArray492[local102 + local131];
			for (@Pc(169) int local169 = 0; local169 < 128; local169++) {
				@Pc(176) float local176 = (float) local169 * arg5;
				@Pc(179) int local179 = (int) local176;
				@Pc(183) int local183 = local179 + 1;
				@Pc(188) float local188 = local176 - (float) local179;
				@Pc(192) float local192 = 1.0F - local188;
				@Pc(196) int local196 = local179 & local33;
				@Pc(200) float local200 = Static192.method7242(local188);
				@Pc(204) int local204 = local183 & local33;
				arg1[arg2++] = arg6 * Static51.method1274(Static51.method1274(Static51.method1274(Static155.method2987(local123, local75, local188, this.anIntArray492[local167 + local204] & 0x7), local200, Static155.method2987(local123, local75, local192, this.anIntArray492[local167 + local196] & 0x7)), local135, Static51.method1274(Static155.method2987(local127, local75, local188, this.anIntArray492[local204 + local160] & 0x7), local200, Static155.method2987(local127, local75, local192, this.anIntArray492[local196 + local160] & 0x7))), local88, Static51.method1274(Static51.method1274(Static155.method2987(local123, local80, local188, this.anIntArray492[local153 + local204] & 0x7), local200, Static155.method2987(local123, local80, local192, this.anIntArray492[local153 + local196] & 0x7)), local135, Static51.method1274(Static155.method2987(local127, local80, local188, this.anIntArray492[local146 + local204] & 0x7), local200, Static155.method2987(local127, local80, local192, this.anIntArray492[local146 + local196] & 0x7))));
			}
		}
	}
}

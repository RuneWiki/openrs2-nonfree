import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class5_Sub53 extends Class5 {

	@OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
	private int anInt9214;

	@OriginalMember(owner = "client!ti", name = "I", descriptor = "Lclient!rd;")
	private final Class109_Sub3 aClass109_Sub3_3;

	@OriginalMember(owner = "client!ti", name = "v", descriptor = "Lclient!gu;")
	private final Class5_Sub18 aClass5_Sub18_3;

	@OriginalMember(owner = "client!ti", name = "K", descriptor = "Lclient!gd;")
	private final Class65_Sub2 aClass65_Sub2_19;

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
	private final int anInt9209;

	@OriginalMember(owner = "client!ti", name = "F", descriptor = "I")
	private final int anInt9217;

	@OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
	private final int anInt9211;

	@OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
	private final int anInt9213;

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!ti", name = "J", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
	private int anInt9218;

	@OriginalMember(owner = "client!ti", name = "C", descriptor = "Lclient!jj;")
	private final Interface12 anInterface12_8;

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "Lclient!cq;")
	private final Interface3 anInterface3_18;

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "Lclient!rda;")
	private Class300 aClass300_42;

	@OriginalMember(owner = "client!ti", name = "B", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!gd;Lclient!rd;Lclient!gu;[I)V")
	public Class5_Sub53(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) Class109_Sub3 arg1, @OriginalArg(2) Class5_Sub18 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass109_Sub3_3 = arg1;
		this.aClass5_Sub18_3 = arg2;
		this.aClass65_Sub2_19 = arg0;
		@Pc(22) int local22 = this.aClass5_Sub18_3.method8056() - (arg1.anInt9063 >> 1);
		this.anInt9209 = this.aClass5_Sub18_3.method8055() - local22 >> arg1.anInt9066;
		this.anInt9217 = this.aClass5_Sub18_3.method8055() + local22 >> arg1.anInt9066;
		this.anInt9211 = this.aClass5_Sub18_3.method8057() - local22 >> arg1.anInt9066;
		this.anInt9213 = local22 + this.aClass5_Sub18_3.method8057() >> arg1.anInt9066;
		@Pc(77) int local77 = this.anInt9217 + 1 - this.anInt9209;
		@Pc(86) int local86 = this.anInt9213 + 1 - this.anInt9211;
		this.aFloatArrayArray13 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray15 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray14 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(133) int local133;
		@Pc(140) int local140;
		@Pc(166) int local166;
		@Pc(183) int local183;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = this.anInt9211 + local115;
			if (local122 > 0 && this.aClass109_Sub3_3.anInt9065 - 1 > local122) {
				for (local133 = 0; local133 <= local77; local133++) {
					local140 = this.anInt9209 + local133;
					if (local140 > 0 && this.aClass109_Sub3_3.anInt9061 - 1 > local140) {
						local166 = arg1.method7695(local122, local140 + 1) - arg1.method7695(local122, local140 - 1);
						local183 = arg1.method7695(local122 + 1, local140) - arg1.method7695(local122 - 1, local140);
						@Pc(199) float local199 = (float) (1.0D / Math.sqrt((double) (local166 * local166 + local183 * local183 + 65536)));
						this.aFloatArrayArray13[local133][local115] = (float) local166 * local199;
						this.aFloatArrayArray15[local133][local115] = local199 * -256.0F;
						this.aFloatArrayArray14[local133][local115] = (float) local183 * local199;
					}
				}
			}
		}
		local122 = 0;
		@Pc(308) int local308;
		for (local133 = this.anInt9211; local133 <= this.anInt9213; local133++) {
			if (local133 >= 0 && arg1.anInt9065 > local133) {
				for (local140 = this.anInt9209; local140 <= this.anInt9217; local140++) {
					if (local140 >= 0 && arg1.anInt9061 > local140) {
						local166 = arg3[local122];
						@Pc(289) int[] local289 = arg1.anIntArrayArrayArray44[local140][local133];
						if (local289 != null && local166 != 0) {
							if (local166 == 1) {
								local308 = 0;
								while (local308 < local289.length) {
									if (local289[local308++] != -1 && local289[local308++] != -1 && local289[local308++] != -1) {
										this.anInt9218 += 3;
									}
								}
							} else {
								this.anInt9218 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt9217 - this.anInt9209;
			}
		}
		if (this.anInt9218 <= 0) {
			this.anInterface12_8 = null;
			this.anInterface3_18 = null;
		} else {
			this.aClass300_42 = new Class300(Static67.method917(this.anInt9218));
			this.anInterface12_8 = this.aClass65_Sub2_19.method4364(false);
			this.anInterface12_8.method8239(this.anInt9218);
			@Pc(406) NativeHeapBuffer local406 = this.aClass65_Sub2_19.method4481(false, this.anInt9218 * 16);
			this.aStream6 = new Stream(local406);
			while (true) {
				@Pc(418) Buffer local418;
				do {
					local418 = this.anInterface12_8.method900();
				} while (local418 == null);
				this.aStream5 = new Stream(local418);
				local122 = 0;
				local183 = 0;
				for (local308 = this.anInt9211; local308 <= this.anInt9213; local308++) {
					if (local308 >= 0 && arg1.anInt9065 > local308) {
						@Pc(447) int local447 = 0;
						for (@Pc(450) int local450 = this.anInt9209; local450 <= this.anInt9217; local450++) {
							if (local450 >= 0 && local450 < arg1.anInt9061) {
								@Pc(462) int local462 = arg3[local122];
								@Pc(469) int[] local469 = arg1.anIntArrayArrayArray44[local450][local308];
								if (local469 != null && local462 != 0) {
									if (local462 == 1) {
										@Pc(485) int[] local485 = arg1.anIntArrayArrayArray42[local450][local308];
										@Pc(492) int[] local492 = arg1.anIntArrayArrayArray45[local450][local308];
										@Pc(494) int local494 = 0;
										label119: while (true) {
											while (true) {
												if (local494 >= local469.length) {
													break label119;
												}
												if (local469[local494] == -1 || local469[local494 + 1] == -1 || local469[local494 + 2] == -1) {
													local494 += 3;
												} else {
													this.method7789(local450, local485[local494], local183, local308, local492[local494], local447);
													local494++;
													this.method7789(local450, local485[local494], local183, local308, local492[local494], local447);
													local494++;
													this.method7789(local450, local485[local494], local183, local308, local492[local494], local447);
													local494++;
												}
											}
										}
									} else if (local462 == 3) {
										this.method7789(local450, 0, local183, local308, 0, local447);
										this.method7789(local450, arg1.anInt9063, local183, local308, 0, local447);
										this.method7789(local450, 0, local183, local308, arg1.anInt9063, local447);
									} else if (local462 == 2) {
										this.method7789(local450, arg1.anInt9063, local183, local308, 0, local447);
										this.method7789(local450, arg1.anInt9063, local183, local308, arg1.anInt9063, local447);
										this.method7789(local450, 0, local183, local308, 0, local447);
									} else if (local462 == 5) {
										this.method7789(local450, arg1.anInt9063, local183, local308, arg1.anInt9063, local447);
										this.method7789(local450, 0, local183, local308, arg1.anInt9063, local447);
										this.method7789(local450, arg1.anInt9063, local183, local308, 0, local447);
									} else if (local462 == 4) {
										this.method7789(local450, 0, local183, local308, arg1.anInt9063, local447);
										this.method7789(local450, 0, local183, local308, 0, local447);
										this.method7789(local450, arg1.anInt9063, local183, local308, arg1.anInt9063, local447);
									}
								}
							}
							local122++;
							local447++;
						}
					} else {
						local122 += this.anInt9217 - this.anInt9209;
					}
					local183++;
				}
				this.aStream5.a();
				if (this.anInterface12_8.method903()) {
					this.aStream6.a();
					this.anInterface3_18 = this.aClass65_Sub2_19.method4374(false);
					this.anInterface3_18.method8246(this.anInt9214 * 16, 16, local406);
					break;
				}
				this.aStream6.d(0);
				this.aClass300_42.method7189();
			}
		}
		this.aClass300_42 = null;
		this.aStream5 = null;
		this.aStream6 = null;
		this.aFloatArrayArray13 = this.aFloatArrayArray15 = this.aFloatArrayArray14 = null;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II[[ZBI)V")
	public void method7787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface12_8 == null || (this.anInt9209 > arg3 + arg1 || (this.anInt9217 < arg3 - arg1 || (this.anInt9211 > arg1 + arg0 || this.anInt9213 < arg0 - arg1)))) {
			return;
		}
		for (@Pc(52) int local52 = this.anInt9211; local52 <= this.anInt9213; local52++) {
			for (@Pc(57) int local57 = this.anInt9209; local57 <= this.anInt9217; local57++) {
				@Pc(64) int local64 = local57 - arg3;
				@Pc(69) int local69 = local52 - arg0;
				if (local64 > -arg1 && local64 < arg1 && -arg1 < local69 && local69 < arg1 && arg2[arg1 + local64][arg1 + local69]) {
					this.aClass65_Sub2_19.method4451((byte) (int) (this.aClass5_Sub18_3.method8054() * 255.0F));
					this.aClass65_Sub2_19.method4427(0, this.anInterface3_18);
					this.aClass65_Sub2_19.method4447(this.aClass65_Sub2_19.aClass69_19);
					this.aClass65_Sub2_19.method4398(0, this.anInt9214, 0, Static72.aClass155_1, this.anInterface12_8, this.anInt9218 / 3);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(SI)V")
	private void method7788(@OriginalArg(0) short arg0) {
		if (Stream.c()) {
			this.aStream5.e(arg0);
		} else {
			this.aStream5.b(arg0);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIIZ)V")
	private void method7789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg1 + (arg0 << this.aClass109_Sub3_3.anInt9066);
		@Pc(24) int local24 = (arg3 << this.aClass109_Sub3_3.anInt9066) + arg4;
		@Pc(31) int local31 = this.aClass109_Sub3_3.method7702(local16, local24);
		if ((arg1 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
			local7 = (long) local16 & 0xFFFFL | 0xFFFFL << 16 & (long) local24 << 16;
			@Pc(62) Class5 local62 = this.aClass300_42.method7188(local7);
			if (local62 != null) {
				this.method7788(((Class5_Sub37) local62).aShort54);
				return;
			}
		}
		@Pc(80) short local80 = (short) this.anInt9214++;
		if (local7 != -1L) {
			this.aClass300_42.method7191(new Class5_Sub37(local80), local7);
		}
		@Pc(134) float local134;
		@Pc(125) float local125;
		@Pc(143) float local143;
		@Pc(241) float local241;
		@Pc(249) float local249;
		@Pc(256) float local256;
		@Pc(263) float local263;
		@Pc(270) float local270;
		@Pc(279) float local279;
		@Pc(288) float local288;
		@Pc(314) float local314;
		if (arg1 == 0 && arg4 == 0) {
			local134 = this.aFloatArrayArray13[arg5][arg2];
			local125 = this.aFloatArrayArray15[arg5][arg2];
			local143 = this.aFloatArrayArray14[arg5][arg2];
		} else if (arg1 == this.aClass109_Sub3_3.anInt9063 && arg4 == 0) {
			local125 = this.aFloatArrayArray15[arg5 + 1][arg2];
			local134 = this.aFloatArrayArray13[arg5 + 1][arg2];
			local143 = this.aFloatArrayArray14[arg5 + 1][arg2];
		} else if (this.aClass109_Sub3_3.anInt9063 == arg1 && this.aClass109_Sub3_3.anInt9063 == arg4) {
			local143 = this.aFloatArrayArray14[arg5 + 1][arg2 + 1];
			local134 = this.aFloatArrayArray13[arg5 + 1][arg2 + 1];
			local125 = this.aFloatArrayArray15[arg5 + 1][arg2 + 1];
		} else if (arg1 == 0 && arg4 == this.aClass109_Sub3_3.anInt9063) {
			local125 = this.aFloatArrayArray15[arg5][arg2 + 1];
			local143 = this.aFloatArrayArray14[arg5][arg2 + 1];
			local134 = this.aFloatArrayArray13[arg5][arg2 + 1];
		} else {
			local241 = (float) arg1 / (float) this.aClass109_Sub3_3.anInt9063;
			local249 = (float) arg4 / (float) this.aClass109_Sub3_3.anInt9063;
			local256 = this.aFloatArrayArray13[arg5][arg2];
			local263 = this.aFloatArrayArray15[arg5][arg2];
			local270 = this.aFloatArrayArray14[arg5][arg2];
			local279 = this.aFloatArrayArray13[arg5 + 1][arg2];
			local288 = this.aFloatArrayArray15[arg5 + 1][arg2];
			@Pc(305) float local305 = local288 + local241 * (this.aFloatArrayArray15[arg5 + 1][arg2 + 1] - local288);
			local314 = this.aFloatArrayArray14[arg5 + 1][arg2];
			@Pc(330) float local330 = local256 + local241 * (this.aFloatArrayArray13[arg5][arg2 + 1] - local256);
			@Pc(347) float local347 = local279 + local241 * (this.aFloatArrayArray13[arg5 + 1][arg2 + 1] - local279);
			@Pc(363) float local363 = local270 + local241 * (this.aFloatArrayArray14[arg5][arg2 + 1] - local270);
			@Pc(378) float local378 = local263 + local241 * (this.aFloatArrayArray15[arg5][arg2 + 1] - local263);
			@Pc(395) float local395 = local314 + (this.aFloatArrayArray14[arg5 + 1][arg2 + 1] - local314) * local241;
			local134 = local249 * (local347 - local330) + local330;
			local125 = local249 * (local305 - local378) + local378;
			local143 = local363 + local249 * (local395 - local363);
		}
		local241 = (float) (this.aClass5_Sub18_3.method8055() - local16);
		local249 = (float) (this.aClass5_Sub18_3.method8051() - local31);
		local256 = (float) (this.aClass5_Sub18_3.method8057() - local24);
		local263 = (float) Math.sqrt((double) (local256 * local256 + local241 * local241 + local249 * local249));
		local270 = 1.0F / local263;
		local241 *= local270;
		local249 *= local270;
		local256 *= local270;
		local279 = local263 / (float) this.aClass5_Sub18_3.method8056();
		local288 = 1.0F - local279 * local279;
		if (local288 < 0.0F) {
			local288 = 0.0F;
		}
		local314 = local125 * local249 + local241 * local134 + local256 * local143;
		if (local314 < 0.0F) {
			local314 = 0.0F;
		}
		@Pc(546) float local546 = local314 * 2.0F * local288;
		if (local546 > 1.0F) {
			local546 = 1.0F;
		}
		@Pc(557) int local557 = this.aClass5_Sub18_3.method8058();
		@Pc(567) int local567 = (int) (local546 * (float) (local557 >> 16 & 0xFF));
		if (local567 > 255) {
			local567 = 255;
		}
		@Pc(584) int local584 = (int) (local546 * (float) (local557 >> 8 & 0xFF));
		if (local584 > 255) {
			local584 = 255;
		}
		@Pc(599) int local599 = (int) (local546 * (float) (local557 & 0xFF));
		if (Stream.c()) {
			this.aStream6.a((float) local16);
			this.aStream6.a((float) local31);
			this.aStream6.a((float) local24);
		} else {
			this.aStream6.b((float) local16);
			this.aStream6.b((float) local31);
			this.aStream6.b((float) local24);
		}
		if (local599 > 255) {
			local599 = 255;
		}
		if (this.aClass65_Sub2_19.anInt5253 == 0) {
			this.aStream6.f(local599);
			this.aStream6.f(local584);
			this.aStream6.f(local567);
		} else {
			this.aStream6.f(local567);
			this.aStream6.f(local584);
			this.aStream6.f(local599);
		}
		this.aStream6.f(255);
		this.method7788(local80);
	}
}

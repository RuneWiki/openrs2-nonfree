import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class6_Sub35 extends Class6 {

	@OriginalMember(owner = "client!li", name = "l", descriptor = "Lclient!tea;")
	private Interface26 anInterface26_14;

	@OriginalMember(owner = "client!li", name = "r", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!li", name = "w", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!li", name = "G", descriptor = "I")
	public int anInt6380 = 0;

	@OriginalMember(owner = "client!li", name = "F", descriptor = "Lclient!si;")
	private final Class245_Sub2 aClass245_Sub2_3;

	@OriginalMember(owner = "client!li", name = "u", descriptor = "I")
	public final int anInt6374;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "I")
	public final int anInt6368;

	@OriginalMember(owner = "client!li", name = "t", descriptor = "I")
	public final int anInt6373;

	@OriginalMember(owner = "client!li", name = "p", descriptor = "Lclient!uv;")
	private final Class5_Sub2 aClass5_Sub2_14;

	@OriginalMember(owner = "client!li", name = "D", descriptor = "[I")
	private final int[] anIntArray294;

	@OriginalMember(owner = "client!li", name = "n", descriptor = "I")
	public final int anInt6370;

	@OriginalMember(owner = "client!li", name = "v", descriptor = "F")
	public final float aFloat130;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!si;IIIII)V")
	public Class6_Sub35(@OriginalArg(0) Class245_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass245_Sub2_3 = arg0;
		this.anInt6374 = arg3;
		this.anInt6368 = arg1;
		this.anInt6373 = arg4;
		this.aClass5_Sub2_14 = this.aClass245_Sub2_3.aClass5_Sub2_20;
		this.anIntArray294 = new int[this.aClass245_Sub2_3.anInt9290 * this.aClass245_Sub2_3.anInt9289];
		this.anInt6370 = arg5;
		this.aFloat130 = (float) arg2;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)V")
	public void method5335(@OriginalArg(0) int arg0) {
		this.aStream7.b(arg0 * 4 + 3);
		this.aStream7.e(-1);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)V")
	public void method5336(@OriginalArg(0) int arg0) {
		this.aStream7.c();
		this.anInterface26_14 = this.aClass5_Sub2_14.method4063(false);
		this.anInterface26_14.method8108(arg0 * 4, 4, this.aNativeHeapBuffer6);
		this.aNativeHeapBuffer6 = null;
		this.aStream7 = null;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([III)V")
	public void method5337(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Interface27 local14 = this.aClass5_Sub2_14.method3966(this.anInt6380 * 3);
		@Pc(19) Buffer local19 = local14.method7962();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass5_Sub2_14.method4046(local19);
		@Pc(30) int local30 = 0;
		@Pc(41) int local41 = 32767;
		@Pc(43) int local43 = -32768;
		@Pc(96) int local96;
		@Pc(64) short[] local64;
		@Pc(53) int local53;
		@Pc(58) int local58;
		@Pc(47) int local47;
		@Pc(73) int local73;
		@Pc(75) int local75;
		@Pc(87) int local87;
		if (Stream.a()) {
			label96: for (local47 = 0; local47 < arg1; local47++) {
				local53 = arg0[local47];
				local58 = this.anIntArray294[local53];
				local64 = this.aClass245_Sub2_3.aShortArrayArray29[local53];
				if (local58 != 0 && local64 != null) {
					local73 = 0;
					local75 = 0;
					while (true) {
						while (true) {
							if (local75 >= local64.length) {
								continue label96;
							}
							if ((local58 & 0x1 << local73++) == 0) {
								local75 += 3;
							} else {
								for (local87 = 0; local87 < 3; local87++) {
									local96 = local64[local75++] & 0xFFFF;
									local28.c(local96);
									if (local41 > local96) {
										local41 = local96;
									}
									if (local43 < local96) {
										local43 = local96;
									}
								}
								local30++;
							}
						}
					}
				}
			}
		} else {
			label121: for (local47 = 0; local47 < arg1; local47++) {
				local53 = arg0[local47];
				local58 = this.anIntArray294[local53];
				local64 = this.aClass245_Sub2_3.aShortArrayArray29[local53];
				if (local58 != 0 && local64 != null) {
					local73 = 0;
					local75 = 0;
					while (true) {
						while (true) {
							if (local75 >= local64.length) {
								continue label121;
							}
							if ((local58 & 0x1 << local73++) == 0) {
								local75 += 3;
							} else {
								local30++;
								for (local87 = 0; local87 < 3; local87++) {
									local96 = local64[local75++] & 0xFFFF;
									if (local96 > local43) {
										local43 = local96;
									}
									local28.d(local96);
									if (local96 < local41) {
										local41 = local96;
									}
								}
							}
						}
					}
				}
			}
		}
		local28.c();
		if (!local14.method7963() || local30 <= 0) {
			return;
		}
		this.aClass5_Sub2_14.method4042((this.aClass245_Sub2_3.anInt9157 & 0x8) != 0, this.anInt6368, (this.aClass245_Sub2_3.anInt9157 & 0x7) != 0);
		if (this.aClass5_Sub2_14.aBoolean379) {
			this.aClass5_Sub2_14.EA(Integer.MAX_VALUE, this.anInt6374, this.anInt6373, this.anInt6370);
		}
		@Pc(272) Class115_Sub3 local272 = this.aClass5_Sub2_14.method3960();
		local272.method6318(1.0F / this.aFloat130, 1.0F / this.aFloat130, 1.0F);
		this.aClass5_Sub2_14.method4011(Static557.aClass272_6);
		this.aClass5_Sub2_14.method3974(1, this.anInterface26_14);
		this.aClass5_Sub2_14.method4045(this.aClass245_Sub2_3.aClass270_23);
		this.aClass5_Sub2_14.method3976(Static574.aClass248_11, local43 + 1 - local41, 0, local14, local41, local30);
		this.aClass5_Sub2_14.method3988();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)V")
	public void method5338(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray294[arg2 * this.aClass245_Sub2_3.anInt9289 + arg1] |= 0x1 << arg0;
		this.anInt6380++;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)V")
	public void method5339(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer6 = this.aClass5_Sub2_14.method3950(arg0 * 4, true);
		this.aStream7 = new Stream(this.aNativeHeapBuffer6, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIF)V")
	public void method5340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(22) int local22;
		@Pc(37) int local37;
		if (this.anInt6368 != -1) {
			@Pc(17) Class254 local17 = this.aClass5_Sub2_14.anInterface7_10.method6931(this.anInt6368);
			local22 = local17.aByte98 & 0xFF;
			@Pc(66) int local66;
			if (local22 != 0 && local17.aByte95 != 4) {
				if (arg1 < 0) {
					local37 = 0;
				} else if (arg1 > 127) {
					local37 = 16777215;
				} else {
					local37 = arg1 * 131586;
				}
				if (local22 == 256) {
					arg2 = local37;
				} else {
					local66 = 256 - local22;
					arg2 = (local66 * (arg2 & 0xFF00FF) + (local37 & 0xFF00FF) * local22 & 0xFF00FF00) + ((local37 & 0xFF00) * local22 + (arg2 & 0xFF00) * local66 & 0xFF0000) >> 8;
				}
			}
			local37 = local17.aByte97 & 0xFF;
			if (local37 != 0) {
				local37 += 256;
				@Pc(115) int local115 = (arg2 >> 16 & 0xFF) * local37;
				if (local115 > 65535) {
					local115 = 65535;
				}
				local66 = (arg2 >> 8 & 0xFF) * local37;
				if (local66 > 65535) {
					local66 = 65535;
				}
				@Pc(143) int local143 = (arg2 & 0xFF) * local37;
				if (local143 > 65535) {
					local143 = 65535;
				}
				arg2 = (local143 >> 8) + (local66 & 0xFF00) + ((local115 & 0x7000FF00) << 8);
			}
		}
		this.aStream7.b(arg0 * 4);
		if (arg3 != 1.0F) {
			@Pc(180) int local180 = arg2 >> 16 & 0xFF;
			local22 = arg2 >> 8 & 0xFF;
			local180 = (int) ((float) local180 * arg3);
			local37 = arg2 & 0xFF;
			local22 = (int) ((float) local22 * arg3);
			if (local180 < 0) {
				local180 = 0;
			} else if (local180 > 255) {
				local180 = 255;
			}
			local37 = (int) ((float) local37 * arg3);
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			if (local37 < 0) {
				local37 = 0;
			} else if (local37 > 255) {
				local37 = 255;
			}
			arg2 = local180 << 16 | local22 << 8 | local37;
		}
		if (this.aClass5_Sub2_14.anInt4868 == 0) {
			this.aStream7.e((byte) arg2);
			this.aStream7.e((byte) (arg2 >> 8));
			this.aStream7.e((byte) (arg2 >> 16));
		} else {
			this.aStream7.e((byte) (arg2 >> 16));
			this.aStream7.e((byte) (arg2 >> 8));
			this.aStream7.e((byte) arg2);
		}
	}
}

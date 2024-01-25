import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class3_Sub38 extends Class3 {

	@OriginalMember(owner = "client!mv", name = "g", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!mv", name = "i", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!mv", name = "t", descriptor = "Lclient!fg;")
	private Interface11 anInterface11_16;

	@OriginalMember(owner = "client!mv", name = "x", descriptor = "I")
	public int anInt6878 = 0;

	@OriginalMember(owner = "client!mv", name = "w", descriptor = "Lclient!cj;")
	private final Class51_Sub1 aClass51_Sub1_3;

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
	public final int anInt6869;

	@OriginalMember(owner = "client!mv", name = "q", descriptor = "Lclient!ch;")
	private final Class5_Sub1 aClass5_Sub1_18;

	@OriginalMember(owner = "client!mv", name = "p", descriptor = "I")
	public final int anInt6874;

	@OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
	public final int anInt6870;

	@OriginalMember(owner = "client!mv", name = "o", descriptor = "F")
	public final float aFloat159;

	@OriginalMember(owner = "client!mv", name = "B", descriptor = "[I")
	private final int[] anIntArray411;

	@OriginalMember(owner = "client!mv", name = "A", descriptor = "I")
	public final int anInt6881;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!cj;IIIII)V")
	public Class3_Sub38(@OriginalArg(0) Class51_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass51_Sub1_3 = arg0;
		this.anInt6869 = arg4;
		this.aClass5_Sub1_18 = this.aClass51_Sub1_3.aClass5_Sub1_5;
		this.anInt6874 = arg3;
		this.anInt6870 = arg1;
		this.aFloat159 = arg2;
		this.anIntArray411 = new int[this.aClass51_Sub1_3.anInt9115 * this.aClass51_Sub1_3.anInt9121];
		this.anInt6881 = arg5;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "([III)V")
	public void method5902(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Interface19 local14 = this.aClass5_Sub1_18.method5669(this.anInt6878 * 3);
		@Pc(19) Buffer local19 = local14.method7984();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass5_Sub1_18.method5647(local19);
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 32767;
		@Pc(34) int local34 = -32768;
		@Pc(89) int local89;
		@Pc(55) short[] local55;
		@Pc(44) int local44;
		@Pc(49) int local49;
		@Pc(38) int local38;
		@Pc(64) int local64;
		@Pc(66) int local66;
		@Pc(80) int local80;
		if (Stream.a()) {
			label96: for (local38 = 0; local38 < arg1; local38++) {
				local44 = arg0[local38];
				local55 = this.aClass51_Sub1_3.aShortArrayArray1[local44];
				local49 = this.anIntArray411[local44];
				if (local49 != 0 && local55 != null) {
					local64 = 0;
					local66 = 0;
					while (true) {
						while (true) {
							if (local55.length <= local66) {
								continue label96;
							}
							if ((local49 & 0x1 << local64++) == 0) {
								local66 += 3;
							} else {
								for (local80 = 0; local80 < 3; local80++) {
									local89 = local55[local66++] & 0xFFFF;
									local28.e(local89);
									if (local32 > local89) {
										local32 = local89;
									}
									if (local34 < local89) {
										local34 = local89;
									}
								}
								local30++;
							}
						}
					}
				}
			}
		} else {
			label122: for (local38 = 0; local38 < arg1; local38++) {
				local44 = arg0[local38];
				local49 = this.anIntArray411[local44];
				local55 = this.aClass51_Sub1_3.aShortArrayArray1[local44];
				if (local49 != 0 && local55 != null) {
					local64 = 0;
					local66 = 0;
					while (true) {
						while (true) {
							if (local55.length <= local66) {
								continue label122;
							}
							if ((local49 & 0x1 << local64++) == 0) {
								local66 += 3;
							} else {
								for (local80 = 0; local80 < 3; local80++) {
									local89 = local55[local66++] & 0xFFFF;
									local28.d(local89);
									if (local89 > local34) {
										local34 = local89;
									}
									if (local32 > local89) {
										local32 = local89;
									}
								}
								local30++;
							}
						}
					}
				}
			}
		}
		local28.b();
		if (!local14.method7985() || local30 <= 0) {
			return;
		}
		this.aClass5_Sub1_18.method5579((this.aClass51_Sub1_3.anInt1753 & 0x8) != 0, (this.aClass51_Sub1_3.anInt1753 & 0x7) != 0, this.anInt6870);
		if (this.aClass5_Sub1_18.aBoolean466) {
			this.aClass5_Sub1_18.EA(Integer.MAX_VALUE, this.anInt6874, this.anInt6869, this.anInt6881);
		}
		@Pc(269) Class39_Sub1 local269 = this.aClass5_Sub1_18.method5678();
		local269.method1551(1.0F / this.aFloat159, 1.0F, 1.0F / this.aFloat159);
		this.aClass5_Sub1_18.method5589(Static190.aClass340_2);
		this.aClass5_Sub1_18.method5692(this.anInterface11_16, 1);
		this.aClass5_Sub1_18.method5610(this.aClass51_Sub1_3.aClass46_16);
		this.aClass5_Sub1_18.method5665(Static67.aClass292_2, local32, local34 + 1 - local32, local14, local30, 0);
		this.aClass5_Sub1_18.method5683();
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IB)V")
	public void method5903(@OriginalArg(0) int arg0) {
		this.aStream7.b();
		this.anInterface11_16 = this.aClass5_Sub1_18.method5649(false);
		this.anInterface11_16.method6376(arg0 * 4, this.aNativeHeapBuffer6, 4);
		this.aNativeHeapBuffer6 = null;
		this.aStream7 = null;
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(II)V")
	public void method5904(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer6 = this.aClass5_Sub1_18.method5663(true, arg0 * 4);
		this.aStream7 = new Stream(this.aNativeHeapBuffer6, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(IB)V")
	public void method5905(@OriginalArg(0) int arg0) {
		this.aStream7.b(arg0 * 4 + 3);
		this.aStream7.c(-1);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIIIF)V")
	public void method5908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(18) int local18;
		@Pc(31) int local31;
		if (this.anInt6870 != -1) {
			@Pc(13) Class195 local13 = this.aClass5_Sub1_18.anInterface7_15.method8118(this.anInt6870);
			local18 = local13.aByte79 & 0xFF;
			@Pc(57) int local57;
			if (local18 != 0 && local13.aByte83 != 4) {
				if (arg0 < 0) {
					local31 = 0;
				} else if (arg0 > 127) {
					local31 = 16777215;
				} else {
					local31 = arg0 * 131586;
				}
				if (local18 == 256) {
					arg1 = local31;
				} else {
					local57 = 256 - local18;
					arg1 = (local18 * (local31 & 0xFF00FF) + local57 * (arg1 & 0xFF00FF) & 0xFF00FF00) + (local57 * (arg1 & 0xFF00) + local18 * (local31 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local31 = local13.aByte84 & 0xFF;
			if (local31 != 0) {
				local31 += 256;
				@Pc(112) int local112 = (arg1 >> 16 & 0xFF) * local31;
				if (local112 > 65535) {
					local112 = 65535;
				}
				local57 = local31 * (arg1 >> 8 & 0xFF);
				if (local57 > 65535) {
					local57 = 65535;
				}
				@Pc(136) int local136 = (arg1 & 0xFF) * local31;
				if (local136 > 65535) {
					local136 = 65535;
				}
				arg1 = (local57 & 0xFF00) + (local112 << 8 & 0xFF009A) + (local136 >> 8);
			}
		}
		this.aStream7.b(arg2 * 4);
		if (arg3 != 1.0F) {
			@Pc(176) int local176 = arg1 >> 16 & 0xFF;
			local18 = arg1 >> 8 & 0xFF;
			local176 = (int) ((float) local176 * arg3);
			local31 = arg1 & 0xFF;
			local18 = (int) ((float) local18 * arg3);
			if (local176 < 0) {
				local176 = 0;
			} else if (local176 > 255) {
				local176 = 255;
			}
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			local31 = (int) ((float) local31 * arg3);
			if (local31 < 0) {
				local31 = 0;
			} else if (local31 > 255) {
				local31 = 255;
			}
			arg1 = local176 << 16 | local18 << 8 | local31;
		}
		if (this.aClass5_Sub1_18.anInt6532 == 0) {
			this.aStream7.c((byte) arg1);
			this.aStream7.c((byte) (arg1 >> 8));
			this.aStream7.c((byte) (arg1 >> 16));
		} else {
			this.aStream7.c((byte) (arg1 >> 16));
			this.aStream7.c((byte) (arg1 >> 8));
			this.aStream7.c((byte) arg1);
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIII)V")
	public void method5909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray411[arg2 * this.aClass51_Sub1_3.anInt9121 + arg0] |= 0x1 << arg1;
		this.anInt6878++;
	}
}

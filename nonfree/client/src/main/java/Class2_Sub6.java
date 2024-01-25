import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!bl", name = "s", descriptor = "Lclient!nba;")
	private Interface16 anInterface16_2;

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!bl", name = "E", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer1;

	@OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
	public int anInt1034 = 0;

	@OriginalMember(owner = "client!bl", name = "C", descriptor = "Lclient!daa;")
	private final Class67_Sub1 aClass67_Sub1_1;

	@OriginalMember(owner = "client!bl", name = "x", descriptor = "Lclient!en;")
	private final Class100_Sub1 aClass100_Sub1_3;

	@OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
	public final int anInt1037;

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
	public final int anInt1026;

	@OriginalMember(owner = "client!bl", name = "A", descriptor = "I")
	public final int anInt1035;

	@OriginalMember(owner = "client!bl", name = "F", descriptor = "F")
	public final float aFloat22;

	@OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
	public final int anInt1031;

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "[I")
	private final int[] anIntArray57;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!daa;IIIII)V")
	public Class2_Sub6(@OriginalArg(0) Class67_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass67_Sub1_1 = arg0;
		this.aClass100_Sub1_3 = this.aClass67_Sub1_1.aClass100_Sub1_5;
		this.anInt1037 = arg4;
		this.anInt1026 = arg1;
		this.anInt1035 = arg3;
		this.aFloat22 = arg2;
		this.anInt1031 = arg5;
		this.anIntArray57 = new int[this.aClass67_Sub1_1.anInt8110 * this.aClass67_Sub1_1.anInt8111];
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIZ)V")
	public void method706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray57[arg1 * this.aClass67_Sub1_1.anInt8111 + arg2] |= 0x1 << arg0;
		this.anInt1034++;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)V")
	public void method707(@OriginalArg(1) int arg0) {
		this.aStream1.b(arg0 * 4 + 3);
		this.aStream1.d(-1);
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)V")
	public void method709(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer1 = this.aClass100_Sub1_3.method4788(arg0 * 4, true);
		this.aStream1 = new Stream(this.aNativeHeapBuffer1, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIBFI)V")
	public void method710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19;
		@Pc(37) int local37;
		if (this.anInt1026 != -1) {
			@Pc(14) Class343 local14 = this.aClass100_Sub1_3.anInterface5_10.method917(this.anInt1026);
			local19 = local14.aByte119 & 0xFF;
			@Pc(60) int local60;
			if (local19 != 0 && local14.aByte117 != 4) {
				if (arg1 < 0) {
					local37 = 0;
				} else if (arg1 <= 127) {
					local37 = arg1 * 131586;
				} else {
					local37 = 16777215;
				}
				if (local19 == 256) {
					arg0 = local37;
				} else {
					local60 = 256 - local19;
					arg0 = ((arg0 & 0xFF00) * local60 + (local37 & 0xFF00) * local19 & 0xFF0000) + ((local37 & 0xFF00FF) * local19 + (arg0 & 0xFF00FF) * local60 & 0xFF00FF00) >> 8;
				}
			}
			local37 = local14.aByte115 & 0xFF;
			if (local37 != 0) {
				local37 += 256;
				@Pc(106) int local106 = (arg0 >> 16 & 0xFF) * local37;
				if (local106 > 65535) {
					local106 = 65535;
				}
				local60 = local37 * (arg0 >> 8 & 0xFF);
				if (local60 > 65535) {
					local60 = 65535;
				}
				@Pc(130) int local130 = local37 * (arg0 & 0xFF);
				if (local130 > 65535) {
					local130 = 65535;
				}
				arg0 = (local106 << 8 & 0xFF002D) - (-(local60 & 0xFF00) - (local130 >> 8));
			}
		}
		this.aStream1.b(arg3 * 4);
		if (arg2 != 1.0F) {
			@Pc(178) int local178 = arg0 >> 16 & 0xFF;
			local19 = arg0 >> 8 & 0xFF;
			local178 = (int) ((float) local178 * arg2);
			local37 = arg0 & 0xFF;
			if (local178 < 0) {
				local178 = 0;
			} else if (local178 > 255) {
				local178 = 255;
			}
			local19 = (int) ((float) local19 * arg2);
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			local37 = (int) ((float) local37 * arg2);
			if (local37 < 0) {
				local37 = 0;
			} else if (local37 > 255) {
				local37 = 255;
			}
			arg0 = local19 << 8 | local178 << 16 | local37;
		}
		if (this.aClass100_Sub1_3.anInt5791 == 0) {
			this.aStream1.d((byte) arg0);
			this.aStream1.d((byte) (arg0 >> 8));
			this.aStream1.d((byte) (arg0 >> 16));
		} else {
			this.aStream1.d((byte) (arg0 >> 16));
			this.aStream1.d((byte) (arg0 >> 8));
			this.aStream1.d((byte) arg0);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)V")
	public void method712(@OriginalArg(1) int arg0) {
		this.aStream1.c();
		this.anInterface16_2 = this.aClass100_Sub1_3.method4837(false);
		this.anInterface16_2.method5773(this.aNativeHeapBuffer1, 4, arg0 * 4);
		this.aNativeHeapBuffer1 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "([III)V")
	public void method713(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Interface11 local14 = this.aClass100_Sub1_3.method4795(this.anInt1034 * 3);
		@Pc(19) Buffer local19 = local14.method4114();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass100_Sub1_3.method4834(local19);
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 32767;
		@Pc(34) int local34 = -32768;
		@Pc(99) int local99;
		@Pc(60) short[] local60;
		@Pc(54) int local54;
		@Pc(65) int local65;
		@Pc(48) int local48;
		@Pc(74) int local74;
		@Pc(76) int local76;
		@Pc(90) int local90;
		if (Stream.a()) {
			label93: for (local48 = 0; local48 < arg1; local48++) {
				local54 = arg0[local48];
				local60 = this.aClass67_Sub1_1.aShortArrayArray1[local54];
				local65 = this.anIntArray57[local54];
				if (local65 != 0 && local60 != null) {
					local74 = 0;
					local76 = 0;
					while (true) {
						while (true) {
							if (local76 >= local60.length) {
								continue label93;
							}
							if ((local65 & 0x1 << local74++) == 0) {
								local76 += 3;
							} else {
								local30++;
								for (local90 = 0; local90 < 3; local90++) {
									local99 = local60[local76++] & 0xFFFF;
									if (local99 < local32) {
										local32 = local99;
									}
									local28.c(local99);
									if (local99 > local34) {
										local34 = local99;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label119: for (local48 = 0; local48 < arg1; local48++) {
				local54 = arg0[local48];
				local60 = this.aClass67_Sub1_1.aShortArrayArray1[local54];
				local65 = this.anIntArray57[local54];
				if (local65 != 0 && local60 != null) {
					local74 = 0;
					local76 = 0;
					while (true) {
						while (true) {
							if (local76 >= local60.length) {
								continue label119;
							}
							if ((local65 & 0x1 << local74++) == 0) {
								local76 += 3;
							} else {
								for (local90 = 0; local90 < 3; local90++) {
									local99 = local60[local76++] & 0xFFFF;
									if (local99 > local34) {
										local34 = local99;
									}
									local28.e(local99);
									if (local99 < local32) {
										local32 = local99;
									}
								}
								local30++;
							}
						}
					}
				}
			}
		}
		local28.c();
		if (!local14.method4118() || local30 <= 0) {
			return;
		}
		this.aClass100_Sub1_3.method4761(this.anInt1026, (this.aClass67_Sub1_1.anInt1720 & 0x7) != 0, (this.aClass67_Sub1_1.anInt1720 & 0x8) != 0);
		if (this.aClass100_Sub1_3.aBoolean449) {
			this.aClass100_Sub1_3.YA(Integer.MAX_VALUE, this.anInt1035, this.anInt1037, this.anInt1031);
		}
		@Pc(278) Class68_Sub2 local278 = this.aClass100_Sub1_3.method4818();
		local278.method5108(1.0F / this.aFloat22, 1.0F / this.aFloat22, 1.0F);
		this.aClass100_Sub1_3.method4758(Static21.aClass190_1);
		this.aClass100_Sub1_3.method4863(this.anInterface16_2, 1);
		this.aClass100_Sub1_3.method4757(this.aClass67_Sub1_1.aClass199_1);
		this.aClass100_Sub1_3.method4764(local34 + 1 - local32, Static341.aClass213_5, 0, local30, local32, local14);
		this.aClass100_Sub1_3.method4804();
	}
}

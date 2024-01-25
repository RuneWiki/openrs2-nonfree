import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class4_Sub47 extends Class4 {

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!sv", name = "A", descriptor = "Lclient!wf;")
	private Interface24 anInterface24_13;

	@OriginalMember(owner = "client!sv", name = "B", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!sv", name = "G", descriptor = "I")
	public int anInt9314 = 0;

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "Lclient!sq;")
	private final Class115_Sub2 aClass115_Sub2_2;

	@OriginalMember(owner = "client!sv", name = "C", descriptor = "I")
	public final int anInt9311;

	@OriginalMember(owner = "client!sv", name = "z", descriptor = "F")
	public final float aFloat196;

	@OriginalMember(owner = "client!sv", name = "w", descriptor = "I")
	public final int anInt9308;

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
	public final int anInt9304;

	@OriginalMember(owner = "client!sv", name = "K", descriptor = "I")
	public final int anInt9317;

	@OriginalMember(owner = "client!sv", name = "D", descriptor = "[I")
	private final int[] anIntArray533;

	@OriginalMember(owner = "client!sv", name = "J", descriptor = "Lclient!nh;")
	private final Class7_Sub1 aClass7_Sub1_17;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lclient!sq;IIIII)V")
	public Class4_Sub47(@OriginalArg(0) Class115_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass115_Sub2_2 = arg0;
		this.anInt9311 = arg1;
		this.aFloat196 = arg2;
		this.anInt9308 = arg5;
		this.anInt9304 = arg4;
		this.anInt9317 = arg3;
		this.anIntArray533 = new int[this.aClass115_Sub2_2.anInt10330 * this.aClass115_Sub2_2.anInt10327];
		this.aClass7_Sub1_17 = this.aClass115_Sub2_2.aClass7_Sub1_16;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIB)V")
	public void method7136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray533[this.aClass115_Sub2_2.anInt10330 * arg1 + arg0] |= 0x1 << arg2;
		this.anInt9314++;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II[I)V")
	public void method7137(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(14) Interface6 local14 = this.aClass7_Sub1_17.method5772(this.anInt9314 * 3);
		@Pc(19) Buffer local19 = local14.method7935();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass7_Sub1_17.method5675(local19);
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 32767;
		@Pc(34) int local34 = -32768;
		@Pc(84) int local84;
		@Pc(50) short[] local50;
		@Pc(44) int local44;
		@Pc(55) int local55;
		@Pc(38) int local38;
		@Pc(61) int local61;
		@Pc(63) int local63;
		@Pc(75) int local75;
		if (Stream.c()) {
			label121: for (local38 = 0; local38 < arg0; local38++) {
				local44 = arg1[local38];
				local50 = this.aClass115_Sub2_2.aShortArrayArray18[local44];
				local55 = this.anIntArray533[local44];
				if (local55 != 0 && local50 != null) {
					local61 = 0;
					local63 = 0;
					while (true) {
						while (true) {
							if (local63 >= local50.length) {
								continue label121;
							}
							if ((0x1 << local61++ & local55) == 0) {
								local63 += 3;
							} else {
								local30++;
								for (local75 = 0; local75 < 3; local75++) {
									local84 = local50[local63++] & 0xFFFF;
									local28.d(local84);
									if (local84 > local34) {
										local34 = local84;
									}
									if (local32 > local84) {
										local32 = local84;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label96: for (local38 = 0; local38 < arg0; local38++) {
				local44 = arg1[local38];
				local55 = this.anIntArray533[local44];
				local50 = this.aClass115_Sub2_2.aShortArrayArray18[local44];
				if (local55 != 0 && local50 != null) {
					local61 = 0;
					local63 = 0;
					while (true) {
						while (true) {
							if (local50.length <= local63) {
								continue label96;
							}
							if ((0x1 << local61++ & local55) == 0) {
								local63 += 3;
							} else {
								for (local75 = 0; local75 < 3; local75++) {
									local84 = local50[local63++] & 0xFFFF;
									if (local32 > local84) {
										local32 = local84;
									}
									if (local34 < local84) {
										local34 = local84;
									}
									local28.e(local84);
								}
								local30++;
							}
						}
					}
				}
			}
		}
		local28.a();
		if (!local14.method7936() || local30 <= 0) {
			return;
		}
		this.aClass7_Sub1_17.method5692(this.anInt9311, (this.aClass115_Sub2_2.anInt9264 & 0x8) != 0, (this.aClass115_Sub2_2.anInt9264 & 0x7) != 0);
		if (this.aClass7_Sub1_17.aBoolean528) {
			this.aClass7_Sub1_17.YA(Integer.MAX_VALUE, this.anInt9317, this.anInt9304, this.anInt9308);
		}
		@Pc(260) Class81_Sub1 local260 = this.aClass7_Sub1_17.method5727();
		local260.method1977(1.0F, 1.0F / this.aFloat196, 1.0F / this.aFloat196);
		this.aClass7_Sub1_17.method5737(Static85.aClass322_2);
		this.aClass7_Sub1_17.method5721(this.anInterface24_13, 1);
		this.aClass7_Sub1_17.method5754(this.aClass115_Sub2_2.aClass82_20);
		this.aClass7_Sub1_17.method5680(local30, 0, local34 + 1 - local32, local14, Static409.aClass119_6, local32);
		this.aClass7_Sub1_17.method5750();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IFBII)V")
	public void method7138(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(30) int local30;
		@Pc(48) int local48;
		if (this.anInt9311 != -1) {
			@Pc(25) Class69 local25 = this.aClass7_Sub1_17.anInterface7_12.method4460(this.anInt9311);
			local30 = local25.aByte43 & 0xFF;
			@Pc(72) int local72;
			if (local30 != 0 && local25.aByte40 != 4) {
				if (arg0 < 0) {
					local48 = 0;
				} else if (arg0 > 127) {
					local48 = 16777215;
				} else {
					local48 = arg0 * 131586;
				}
				if (local30 == 256) {
					arg2 = local48;
				} else {
					local72 = 256 - local30;
					arg2 = (local30 * (local48 & 0xFF00) + (arg2 & 0xFF00) * local72 & 0xFF0000) + ((arg2 & 0xFF00FF) * local72 + (local48 & 0xFF00FF) * local30 & 0xFF00FF00) >> 8;
				}
			}
			local48 = local25.aByte46 & 0xFF;
			if (local48 != 0) {
				local48 += 256;
				@Pc(119) int local119 = (arg2 >> 16 & 0xFF) * local48;
				if (local119 > 65535) {
					local119 = 65535;
				}
				local72 = local48 * (arg2 >> 8 & 0xFF);
				if (local72 > 65535) {
					local72 = 65535;
				}
				@Pc(143) int local143 = local48 * (arg2 & 0xFF);
				if (local143 > 65535) {
					local143 = 65535;
				}
				arg2 = (local143 >> 8) + ((local119 & 0xB300FF00) << 8) + (local72 & 0xFF00);
			}
		}
		this.aStream7.b(arg3 * 4);
		if (arg1 != 1.0F) {
			@Pc(180) int local180 = arg2 >> 16 & 0xFF;
			local30 = arg2 >> 8 & 0xFF;
			local48 = arg2 & 0xFF;
			local180 = (int) ((float) local180 * arg1);
			if (local180 < 0) {
				local180 = 0;
			} else if (local180 > 255) {
				local180 = 255;
			}
			local30 = (int) ((float) local30 * arg1);
			local48 = (int) ((float) local48 * arg1);
			if (local30 < 0) {
				local30 = 0;
			} else if (local30 > 255) {
				local30 = 255;
			}
			if (local48 < 0) {
				local48 = 0;
			} else if (local48 > 255) {
				local48 = 255;
			}
			arg2 = local48 | local180 << 16 | local30 << 8;
		}
		if (this.aClass7_Sub1_17.anInt7351 == 0) {
			this.aStream7.a((byte) arg2);
			this.aStream7.a((byte) (arg2 >> 8));
			this.aStream7.a((byte) (arg2 >> 16));
		} else {
			this.aStream7.a((byte) (arg2 >> 16));
			this.aStream7.a((byte) (arg2 >> 8));
			this.aStream7.a((byte) arg2);
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZI)V")
	public void method7141(@OriginalArg(1) int arg0) {
		this.aStream7.a();
		this.anInterface24_13 = this.aClass7_Sub1_17.method5704(false);
		this.anInterface24_13.method6548(4, this.aNativeHeapBuffer7, arg0 * 4);
		this.aNativeHeapBuffer7 = null;
		this.aStream7 = null;
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(IB)V")
	public void method7142(@OriginalArg(0) int arg0) {
		this.aStream7.b(arg0 * 4 + 3);
		this.aStream7.a(-1);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)V")
	public void method7143(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer7 = this.aClass7_Sub1_17.method5725(arg0 * 4, true);
		this.aStream7 = new Stream(this.aNativeHeapBuffer7, 0, arg0 * 4);
	}
}

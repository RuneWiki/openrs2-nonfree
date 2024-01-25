import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class5_Sub8 extends Class5 {

	@OriginalMember(owner = "client!bs", name = "r", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer1;

	@OriginalMember(owner = "client!bs", name = "q", descriptor = "Lclient!fk;")
	private Interface15 anInterface15_4;

	@OriginalMember(owner = "client!bs", name = "m", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!bs", name = "t", descriptor = "I")
	public int anInt873 = 0;

	@OriginalMember(owner = "client!bs", name = "B", descriptor = "Lclient!kb;")
	private final Class84_Sub2 aClass84_Sub2_2;

	@OriginalMember(owner = "client!bs", name = "v", descriptor = "I")
	public final int anInt875;

	@OriginalMember(owner = "client!bs", name = "w", descriptor = "I")
	public final int anInt877;

	@OriginalMember(owner = "client!bs", name = "u", descriptor = "I")
	public final int anInt876;

	@OriginalMember(owner = "client!bs", name = "A", descriptor = "[I")
	private final int[] anIntArray61;

	@OriginalMember(owner = "client!bs", name = "x", descriptor = "F")
	public final float aFloat30;

	@OriginalMember(owner = "client!bs", name = "y", descriptor = "Lclient!gca;")
	private final Class100_Sub1 aClass100_Sub1_3;

	@OriginalMember(owner = "client!bs", name = "p", descriptor = "I")
	public final int anInt869;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!kb;IIIII)V")
	public Class5_Sub8(@OriginalArg(0) Class84_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass84_Sub2_2 = arg0;
		this.anInt875 = arg3;
		this.anInt877 = arg5;
		this.anInt876 = arg4;
		this.anIntArray61 = new int[this.aClass84_Sub2_2.anInt8883 * this.aClass84_Sub2_2.anInt8878];
		this.aFloat30 = (float) arg2;
		this.aClass100_Sub1_3 = this.aClass84_Sub2_2.aClass100_Sub1_12;
		this.anInt869 = arg1;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I[II)V")
	public void method895(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Interface20 local14 = this.aClass100_Sub1_3.method7988(this.anInt873 * 3);
		@Pc(19) Buffer local19 = local14.method7347();
		if (local19 == null) {
			return;
		}
		@Pc(29) Stream local29 = this.aClass100_Sub1_3.method7910(local19);
		@Pc(31) int local31 = 0;
		@Pc(41) int local41 = 32767;
		@Pc(43) int local43 = -32768;
		@Pc(104) int local104;
		@Pc(64) short[] local64;
		@Pc(53) int local53;
		@Pc(58) int local58;
		@Pc(47) int local47;
		@Pc(75) int local75;
		@Pc(77) int local77;
		@Pc(95) int local95;
		if (Stream.c()) {
			label96: for (local47 = 0; local47 < arg1; local47++) {
				local53 = arg0[local47];
				local58 = this.anIntArray61[local53];
				local64 = this.aClass84_Sub2_2.aShortArrayArray16[local53];
				if (local58 != 0 && local64 != null) {
					local75 = 0;
					local77 = 0;
					while (true) {
						while (true) {
							if (local77 >= local64.length) {
								continue label96;
							}
							if ((local58 & 0x1 << local75++) == 0) {
								local77 += 3;
							} else {
								for (local95 = 0; local95 < 3; local95++) {
									local104 = local64[local77++] & 0xFFFF;
									local29.c(local104);
									if (local41 > local104) {
										local41 = local104;
									}
									if (local104 > local43) {
										local43 = local104;
									}
								}
								local31++;
							}
						}
					}
				}
			}
		} else {
			label122: for (local47 = 0; local47 < arg1; local47++) {
				local53 = arg0[local47];
				local58 = this.anIntArray61[local53];
				local64 = this.aClass84_Sub2_2.aShortArrayArray16[local53];
				if (local58 != 0 && local64 != null) {
					local75 = 0;
					local77 = 0;
					while (true) {
						while (true) {
							if (local77 >= local64.length) {
								continue label122;
							}
							if ((0x1 << local75++ & local58) == 0) {
								local77 += 3;
							} else {
								for (local95 = 0; local95 < 3; local95++) {
									local104 = local64[local77++] & 0xFFFF;
									if (local43 < local104) {
										local43 = local104;
									}
									local29.f(local104);
									if (local104 < local41) {
										local41 = local104;
									}
								}
								local31++;
							}
						}
					}
				}
			}
		}
		local29.b();
		if (!local14.method7349() || local31 <= 0) {
			return;
		}
		this.aClass100_Sub1_3.method7971((this.aClass84_Sub2_2.anInt5080 & 0x8) != 0, this.anInt869, (this.aClass84_Sub2_2.anInt5080 & 0x7) != 0);
		if (this.aClass100_Sub1_3.aBoolean617) {
			this.aClass100_Sub1_3.EA(Integer.MAX_VALUE, this.anInt875, this.anInt876, this.anInt877);
		}
		@Pc(320) Class10_Sub2 local320 = this.aClass100_Sub1_3.method7877();
		local320.method1706(1.0F / this.aFloat30, 1.0F / this.aFloat30, 1.0F);
		this.aClass100_Sub1_3.method7954(Static475.aClass16_46);
		this.aClass100_Sub1_3.method7868(this.anInterface15_4, 1);
		this.aClass100_Sub1_3.method7921(this.aClass84_Sub2_2.aClass124_16);
		this.aClass100_Sub1_3.method7948(local43 + 1 - local41, local41, 0, Static649.aClass187_6, local14, local31);
		this.aClass100_Sub1_3.method7930();
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BI)V")
	public void method896(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer1 = this.aClass100_Sub1_3.method7892(true, arg0 * 4);
		this.aStream3 = new Stream(this.aNativeHeapBuffer1, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(BI)V")
	public void method898(@OriginalArg(1) int arg0) {
		this.aStream3.b();
		this.anInterface15_4 = this.aClass100_Sub1_3.method7920(false);
		this.anInterface15_4.method5732(4, arg0 * 4, this.aNativeHeapBuffer1);
		this.aNativeHeapBuffer1 = null;
		this.aStream3 = null;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIFI)V")
	public void method900(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		@Pc(47) int local47;
		if (this.anInt869 != -1) {
			@Pc(13) Class44 local13 = this.aClass100_Sub1_3.anInterface7_12.method7423(this.anInt869);
			local18 = local13.aByte17 & 0xFF;
			@Pc(69) int local69;
			if (local18 != 0 && local13.aByte23 != 4) {
				if (arg3 < 0) {
					local47 = 0;
				} else if (arg3 <= 127) {
					local47 = arg3 * 131586;
				} else {
					local47 = 16777215;
				}
				if (local18 == 256) {
					arg0 = local47;
				} else {
					local69 = 256 - local18;
					arg0 = ((arg0 & 0xFF00FF) * local69 + local18 * (local47 & 0xFF00FF) & 0xFF00FF00) + ((local47 & 0xFF00) * local18 + (arg0 & 0xFF00) * local69 & 0xFF0000) >> 8;
				}
			}
			local47 = local13.aByte22 & 0xFF;
			if (local47 != 0) {
				local47 += 256;
				@Pc(115) int local115 = local47 * (arg0 >> 16 & 0xFF);
				if (local115 > 65535) {
					local115 = 65535;
				}
				local69 = (arg0 >> 8 & 0xFF) * local47;
				if (local69 > 65535) {
					local69 = 65535;
				}
				@Pc(139) int local139 = (arg0 & 0xFF) * local47;
				if (local139 > 65535) {
					local139 = 65535;
				}
				arg0 = (local115 << 8 & 0xFF00DA) + (local69 & 0xFF00) + (local139 >> 8);
			}
		}
		this.aStream3.d(arg1 * 4);
		if (arg2 != 1.0F) {
			@Pc(186) int local186 = arg0 >> 16 & 0xFF;
			local18 = arg0 >> 8 & 0xFF;
			local47 = arg0 & 0xFF;
			local186 = (int) ((float) local186 * arg2);
			if (local186 < 0) {
				local186 = 0;
			} else if (local186 > 255) {
				local186 = 255;
			}
			local18 = (int) ((float) local18 * arg2);
			local47 = (int) ((float) local47 * arg2);
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			if (local47 < 0) {
				local47 = 0;
			} else if (local47 > 255) {
				local47 = 255;
			}
			arg0 = local186 << 16 | local18 << 8 | local47;
		}
		if (this.aClass100_Sub1_3.anInt9227 == 0) {
			this.aStream3.e((byte) arg0);
			this.aStream3.e((byte) (arg0 >> 8));
			this.aStream3.e((byte) (arg0 >> 16));
		} else {
			this.aStream3.e((byte) (arg0 >> 16));
			this.aStream3.e((byte) (arg0 >> 8));
			this.aStream3.e((byte) arg0);
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IB)V")
	public void method902(@OriginalArg(0) int arg0) {
		this.aStream3.d(arg0 * 4 + 3);
		this.aStream3.e(-1);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIII)V")
	public void method903(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray61[arg0 + arg1 * this.aClass84_Sub2_2.anInt8883] |= 0x1 << arg2;
		this.anInt873++;
	}
}

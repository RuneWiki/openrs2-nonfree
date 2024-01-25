import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ria")
public final class Class3_Sub51 extends Class3 {

	@OriginalMember(owner = "client!ria", name = "n", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!ria", name = "q", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!ria", name = "y", descriptor = "Lclient!lq;")
	private Interface14 anInterface14_12;

	@OriginalMember(owner = "client!ria", name = "j", descriptor = "I")
	public int anInt8580 = 0;

	@OriginalMember(owner = "client!ria", name = "m", descriptor = "Lclient!ne;")
	private final Class259_Sub1 aClass259_Sub1_3;

	@OriginalMember(owner = "client!ria", name = "A", descriptor = "F")
	public final float aFloat133;

	@OriginalMember(owner = "client!ria", name = "k", descriptor = "I")
	public final int anInt8585;

	@OriginalMember(owner = "client!ria", name = "B", descriptor = "I")
	public final int anInt8584;

	@OriginalMember(owner = "client!ria", name = "v", descriptor = "[I")
	private final int[] anIntArray626;

	@OriginalMember(owner = "client!ria", name = "r", descriptor = "I")
	public final int anInt8590;

	@OriginalMember(owner = "client!ria", name = "w", descriptor = "I")
	public final int anInt8579;

	@OriginalMember(owner = "client!ria", name = "t", descriptor = "Lclient!jca;")
	private final Class22_Sub2 aClass22_Sub2_18;

	@OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(Lclient!ne;IIIII)V")
	public Class3_Sub51(@OriginalArg(0) Class259_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass259_Sub1_3 = arg0;
		this.aFloat133 = (float) arg2;
		this.anInt8585 = arg5;
		this.anInt8584 = arg1;
		this.anIntArray626 = new int[this.aClass259_Sub1_3.anInt10949 * this.aClass259_Sub1_3.anInt10946];
		this.anInt8590 = arg4;
		this.anInt8579 = arg3;
		this.aClass22_Sub2_18 = this.aClass259_Sub1_3.aClass22_Sub2_12;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IFBII)V")
	public void method7333(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(24) int local24;
		@Pc(41) int local41;
		if (this.anInt8584 != -1) {
			@Pc(19) Class406 local19 = this.aClass22_Sub2_18.anInterface4_14.method5761(this.anInt8584);
			local24 = local19.aByte144 & 0xFF;
			@Pc(68) int local68;
			if (local24 != 0 && local19.aByte149 != 4) {
				if (arg2 < 0) {
					local41 = 0;
				} else if (arg2 > 127) {
					local41 = 16777215;
				} else {
					local41 = arg2 * 131586;
				}
				if (local24 == 256) {
					arg0 = local41;
				} else {
					local68 = 256 - local24;
					arg0 = (local24 * (local41 & 0xFF00FF) + (arg0 & 0xFF00FF) * local68 & 0xFF00FF00) + ((local41 & 0xFF00) * local24 + ((arg0 & 0xFF00) * local68) & 0xFF0000) >> 8;
				}
			}
			local41 = local19.aByte146 & 0xFF;
			if (local41 != 0) {
				local41 += 256;
				@Pc(122) int local122 = local41 * (arg0 >> 16 & 0xFF);
				if (local122 > 65535) {
					local122 = 65535;
				}
				local68 = local41 * (arg0 >> 8 & 0xFF);
				if (local68 > 65535) {
					local68 = 65535;
				}
				@Pc(148) int local148 = (arg0 & 0xFF) * local41;
				if (local148 > 65535) {
					local148 = 65535;
				}
				arg0 = (local68 & 0xFF00) + (((local122 & 0x8600FF00) << 8) + (local148 >> 8));
			}
		}
		if (arg1 != 1.0F) {
			@Pc(178) int local178 = arg0 >> 16 & 0xFF;
			local24 = arg0 >> 8 & 0xFF;
			local41 = arg0 & 0xFF;
			local178 = (int) ((float) local178 * arg1);
			local24 = (int) ((float) local24 * arg1);
			if (local178 < 0) {
				local178 = 0;
			} else if (local178 > 255) {
				local178 = 255;
			}
			local41 = (int) ((float) local41 * arg1);
			if (local24 < 0) {
				local24 = 0;
			} else if (local24 > 255) {
				local24 = 255;
			}
			if (local41 < 0) {
				local41 = 0;
			} else if (local41 > 255) {
				local41 = 255;
			}
			arg0 = local24 << 8 | local178 << 16 | local41;
		}
		this.aStream4.b(arg3 * 4);
		if (this.aClass22_Sub2_18.anInt10482 == 0) {
			this.aStream4.f((byte) arg0);
			this.aStream4.f((byte) (arg0 >> 8));
			this.aStream4.f((byte) (arg0 >> 16));
		} else {
			this.aStream4.f((byte) (arg0 >> 16));
			this.aStream4.f((byte) (arg0 >> 8));
			this.aStream4.f((byte) arg0);
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IZ)V")
	public void method7335(@OriginalArg(0) int arg0) {
		this.aStream4.b(arg0 * 4 + 3);
		this.aStream4.f(-1);
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(II)V")
	public void method7337(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer5 = this.aClass22_Sub2_18.method8963(true, arg0 * 4);
		this.aStream4 = new Stream(this.aNativeHeapBuffer5, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(ZI)V")
	public void method7338(@OriginalArg(1) int arg0) {
		this.aStream4.b();
		this.anInterface14_12 = this.aClass22_Sub2_18.method8937(false);
		this.anInterface14_12.method6765(4, arg0 * 4, this.aNativeHeapBuffer5);
		this.aNativeHeapBuffer5 = null;
		this.aStream4 = null;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IBII)V")
	public void method7339(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray626[this.aClass259_Sub1_3.anInt10949 * arg0 + arg2] |= 0x1 << arg1;
		this.anInt8580++;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(I[II)V")
	public void method7340(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Interface11 local14 = this.aClass22_Sub2_18.method8971(this.anInt8580 * 3);
		@Pc(19) Buffer local19 = local14.method5367();
		if (local19 == null) {
			return;
		}
		@Pc(29) Stream local29 = this.aClass22_Sub2_18.method8918(local19);
		@Pc(31) int local31 = 0;
		@Pc(41) int local41 = 32767;
		@Pc(43) int local43 = -32768;
		@Pc(97) int local97;
		@Pc(59) short[] local59;
		@Pc(53) int local53;
		@Pc(64) int local64;
		@Pc(47) int local47;
		@Pc(72) int local72;
		@Pc(74) int local74;
		@Pc(88) int local88;
		if (Stream.c()) {
			label121: for (local47 = 0; local47 < arg1; local47++) {
				local53 = arg0[local47];
				local59 = this.aClass259_Sub1_3.aShortArrayArray3[local53];
				local64 = this.anIntArray626[local53];
				if (local64 != 0 && local59 != null) {
					local72 = 0;
					local74 = 0;
					while (true) {
						while (true) {
							if (local59.length <= local74) {
								continue label121;
							}
							if ((0x1 << local72++ & local64) == 0) {
								local74 += 3;
							} else {
								local31++;
								for (local88 = 0; local88 < 3; local88++) {
									local97 = local59[local74++] & 0xFFFF;
									if (local97 > local43) {
										local43 = local97;
									}
									local29.d(local97);
									if (local41 > local97) {
										local41 = local97;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label96: for (local47 = 0; local47 < arg1; local47++) {
				local53 = arg0[local47];
				local64 = this.anIntArray626[local53];
				local59 = this.aClass259_Sub1_3.aShortArrayArray3[local53];
				if (local64 != 0 && local59 != null) {
					local72 = 0;
					local74 = 0;
					while (true) {
						while (true) {
							if (local74 >= local59.length) {
								continue label96;
							}
							if ((local64 & 0x1 << local72++) == 0) {
								local74 += 3;
							} else {
								for (local88 = 0; local88 < 3; local88++) {
									local97 = local59[local74++] & 0xFFFF;
									if (local97 < local41) {
										local41 = local97;
									}
									local29.a(local97);
									if (local97 > local43) {
										local43 = local97;
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
		if (!local14.method5366() || local31 <= 0) {
			return;
		}
		this.aClass22_Sub2_18.method8979((this.aClass259_Sub1_3.anInt6613 & 0x8) != 0, (this.aClass259_Sub1_3.anInt6613 & 0x7) != 0, this.anInt8584);
		if (this.aClass22_Sub2_18.aBoolean697) {
			this.aClass22_Sub2_18.EA(Integer.MAX_VALUE, this.anInt8579, this.anInt8590, this.anInt8585);
		}
		@Pc(300) Class58_Sub2 local300 = this.aClass22_Sub2_18.method8922();
		local300.method6099(1.0F / this.aFloat133, 1.0F / this.aFloat133, 1.0F);
		this.aClass22_Sub2_18.method8924(Static606.aClass222_6);
		this.aClass22_Sub2_18.method8912(this.anInterface14_12, 1);
		this.aClass22_Sub2_18.method8894(this.aClass259_Sub1_3.aClass36_8);
		this.aClass22_Sub2_18.method8861(Static492.aClass234_6, local41, local31, local43 + 1 - local41, 0, local14);
		this.aClass22_Sub2_18.method8873();
	}
}

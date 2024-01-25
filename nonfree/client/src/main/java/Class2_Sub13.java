import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer1;

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "Lclient!uh;")
	private Interface24 anInterface24_2;

	@OriginalMember(owner = "client!cg", name = "E", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
	public int anInt1384 = 0;

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "Lclient!rj;")
	private final Class133_Sub3 aClass133_Sub3_2;

	@OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
	public final int anInt1381;

	@OriginalMember(owner = "client!cg", name = "y", descriptor = "[I")
	private final int[] anIntArray112;

	@OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
	public final int anInt1392;

	@OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
	public final int anInt1382;

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
	public final int anInt1386;

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "F")
	public final float aFloat4;

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "Lclient!lb;")
	private final Class145_Sub1 aClass145_Sub1_6;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!rj;IIIII)V")
	public Class2_Sub13(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass133_Sub3_2 = arg0;
		this.anInt1381 = arg5;
		this.anIntArray112 = new int[this.aClass133_Sub3_2.anInt9315 * this.aClass133_Sub3_2.anInt9318];
		this.anInt1392 = arg3;
		this.anInt1382 = arg4;
		this.anInt1386 = arg1;
		this.aFloat4 = (float) arg2;
		this.aClass145_Sub1_6 = this.aClass133_Sub3_2.aClass145_Sub1_20;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIB)V")
	public void method1213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray112[arg2 + this.aClass133_Sub3_2.anInt9318 * arg0] |= 0x1 << arg1;
		this.anInt1384++;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZI)V")
	public void method1214(@OriginalArg(1) int arg0) {
		this.aStream3.a();
		this.anInterface24_2 = this.aClass145_Sub1_6.method9825(false);
		this.anInterface24_2.method9229(4, this.aNativeHeapBuffer1, arg0 * 4);
		this.aStream3 = null;
		this.aNativeHeapBuffer1 = null;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II[I)V")
	public void method1215(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(14) Interface15 local14 = this.aClass145_Sub1_6.method9824(this.anInt1384 * 3);
		@Pc(19) Buffer local19 = local14.method4689();
		if (local19 == null) {
			return;
		}
		@Pc(29) Stream local29 = this.aClass145_Sub1_6.method9844(local19);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 32767;
		@Pc(43) int local43 = -32768;
		@Pc(105) int local105;
		@Pc(64) short[] local64;
		@Pc(53) int local53;
		@Pc(58) int local58;
		@Pc(47) int local47;
		@Pc(75) int local75;
		@Pc(77) int local77;
		@Pc(96) int local96;
		if (Stream.b()) {
			label95: for (local47 = 0; local47 < arg0; local47++) {
				local53 = arg1[local47];
				local58 = this.anIntArray112[local53];
				local64 = this.aClass133_Sub3_2.aShortArrayArray5[local53];
				if (local58 != 0 && local64 != null) {
					local75 = 0;
					local77 = 0;
					while (true) {
						while (true) {
							if (local64.length <= local77) {
								continue label95;
							}
							if ((0x1 << local75++ & local58) == 0) {
								local77 += 3;
							} else {
								for (local96 = 0; local96 < 3; local96++) {
									local105 = local64[local77++] & 0xFFFF;
									if (local41 > local105) {
										local41 = local105;
									}
									local29.d(local105);
									if (local105 > local43) {
										local43 = local105;
									}
								}
								local39++;
							}
						}
					}
				}
			}
		} else {
			label119: for (local47 = 0; local47 < arg0; local47++) {
				local53 = arg1[local47];
				local58 = this.anIntArray112[local53];
				local64 = this.aClass133_Sub3_2.aShortArrayArray5[local53];
				if (local58 != 0 && local64 != null) {
					local75 = 0;
					local77 = 0;
					while (true) {
						while (true) {
							if (local64.length <= local77) {
								continue label119;
							}
							if ((local58 & 0x1 << local75++) == 0) {
								local77 += 3;
							} else {
								local39++;
								for (local96 = 0; local96 < 3; local96++) {
									local105 = local64[local77++] & 0xFFFF;
									if (local105 > local43) {
										local43 = local105;
									}
									local29.b(local105);
									if (local105 < local41) {
										local41 = local105;
									}
								}
							}
						}
					}
				}
			}
		}
		local29.a();
		if (!local14.method4691() || local39 <= 0) {
			return;
		}
		this.aClass145_Sub1_6.method9724(this.anInt1386, (this.aClass133_Sub3_2.anInt8728 & 0x7) != 0, (this.aClass133_Sub3_2.anInt8728 & 0x8) != 0);
		if (this.aClass145_Sub1_6.aBoolean952) {
			this.aClass145_Sub1_6.EA(Integer.MAX_VALUE, this.anInt1392, this.anInt1382, this.anInt1381);
		}
		@Pc(307) Class86_Sub2 local307 = this.aClass145_Sub1_6.method9821();
		local307.method2718(1.0F / this.aFloat4, 1.0F / this.aFloat4, 1.0F);
		this.aClass145_Sub1_6.method9750(Static145.aClass146_2);
		this.aClass145_Sub1_6.method9800(1, this.anInterface24_2);
		this.aClass145_Sub1_6.method9766(this.aClass133_Sub3_2.aClass277_16);
		this.aClass145_Sub1_6.method9778(0, Static601.aClass317_8, local39, local41, local43 + 1 - local41, local14);
		this.aClass145_Sub1_6.method9837();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IB)V")
	public void method1216(@OriginalArg(0) int arg0) {
		this.aStream3.a(arg0 * 4 + 3);
		this.aStream3.c(-1);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(FIIII)V")
	public void method1217(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(23) int local23;
		@Pc(42) int local42;
		if (this.anInt1386 != -1) {
			@Pc(18) Class8 local18 = this.aClass145_Sub1_6.anInterface3_12.method2857(this.anInt1386);
			local23 = local18.aByte13 & 0xFF;
			@Pc(69) int local69;
			if (local23 != 0 && local18.aByte15 != 4) {
				if (arg2 < 0) {
					local42 = 0;
				} else if (arg2 <= 127) {
					local42 = arg2 * 131586;
				} else {
					local42 = 16777215;
				}
				if (local23 == 256) {
					arg1 = local42;
				} else {
					local69 = 256 - local23;
					arg1 = ((arg1 & 0xFF00) * local69 + (local42 & 0xFF00) * local23 & 0xFF0000) + (local69 * (arg1 & 0xFF00FF) + (local42 & 0xFF00FF) * local23 & 0xFF00FF00) >> 8;
				}
			}
			local42 = local18.aByte12 & 0xFF;
			if (local42 != 0) {
				local42 += 256;
				@Pc(122) int local122 = (arg1 >> 16 & 0xFF) * local42;
				if (local122 > 65535) {
					local122 = 65535;
				}
				local69 = local42 * (arg1 >> 8 & 0xFF);
				if (local69 > 65535) {
					local69 = 65535;
				}
				@Pc(148) int local148 = (arg1 & 0xFF) * local42;
				if (local148 > 65535) {
					local148 = 65535;
				}
				arg1 = ((local122 & 0x9400FF00) << 8) + (local69 & 0xFF00) + (local148 >> 8);
			}
		}
		if (arg0 != 1.0F) {
			@Pc(178) int local178 = arg1 >> 16 & 0xFF;
			local23 = arg1 >> 8 & 0xFF;
			local42 = arg1 & 0xFF;
			local178 = (int) ((float) local178 * arg0);
			if (local178 < 0) {
				local178 = 0;
			} else if (local178 > 255) {
				local178 = 255;
			}
			local23 = (int) ((float) local23 * arg0);
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			local42 = (int) ((float) local42 * arg0);
			if (local42 < 0) {
				local42 = 0;
			} else if (local42 > 255) {
				local42 = 255;
			}
			arg1 = local42 | local23 << 8 | local178 << 16;
		}
		this.aStream3.a(arg3 * 4);
		if (this.aClass145_Sub1_6.anInt11268 == 0) {
			this.aStream3.c((byte) arg1);
			this.aStream3.c((byte) (arg1 >> 8));
			this.aStream3.c((byte) (arg1 >> 16));
		} else {
			this.aStream3.c((byte) (arg1 >> 16));
			this.aStream3.c((byte) (arg1 >> 8));
			this.aStream3.c((byte) arg1);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZ)V")
	public void method1218(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer1 = this.aClass145_Sub1_6.method9733(arg0 * 4, true);
		this.aStream3 = new Stream(this.aNativeHeapBuffer1, 0, arg0 * 4);
	}
}

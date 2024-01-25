import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class3_Sub13 extends Class3 {

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer4;

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "Lclient!su;")
	private Interface19 anInterface19_4;

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
	public int anInt2008 = 0;

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "Lclient!bh;")
	private final Class34_Sub1 aClass34_Sub1_2;

	@OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
	public final int anInt2014;

	@OriginalMember(owner = "client!dn", name = "D", descriptor = "I")
	public final int anInt2015;

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "[I")
	private final int[] anIntArray91;

	@OriginalMember(owner = "client!dn", name = "B", descriptor = "Lclient!mj;")
	private final Class45_Sub2 aClass45_Sub2_7;

	@OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
	public final int anInt2011;

	@OriginalMember(owner = "client!dn", name = "t", descriptor = "F")
	public final float aFloat45;

	@OriginalMember(owner = "client!dn", name = "F", descriptor = "I")
	public final int anInt2016;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lclient!bh;IIIII)V")
	public Class3_Sub13(@OriginalArg(0) Class34_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass34_Sub1_2 = arg0;
		this.anInt2014 = arg5;
		this.anInt2015 = arg4;
		this.anIntArray91 = new int[this.aClass34_Sub1_2.anInt7852 * this.aClass34_Sub1_2.anInt7854];
		this.aClass45_Sub2_7 = this.aClass34_Sub1_2.aClass45_Sub2_2;
		this.anInt2011 = arg1;
		this.aFloat45 = arg2;
		this.anInt2016 = arg3;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B[II)V")
	public void method1821(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Interface13 local14 = this.aClass45_Sub2_7.method4914(this.anInt2008 * 3);
		@Pc(19) Buffer local19 = local14.method6437();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass45_Sub2_7.method4901(local19);
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 32767;
		@Pc(40) int local40 = -32768;
		@Pc(89) int local89;
		@Pc(56) short[] local56;
		@Pc(50) int local50;
		@Pc(61) int local61;
		@Pc(44) int local44;
		@Pc(67) int local67;
		@Pc(69) int local69;
		@Pc(80) int local80;
		if (Stream.c()) {
			label122: for (local44 = 0; local44 < arg1; local44++) {
				local50 = arg0[local44];
				local56 = this.aClass34_Sub1_2.aShortArrayArray1[local50];
				local61 = this.anIntArray91[local50];
				if (local61 != 0 && local56 != null) {
					local67 = 0;
					local69 = 0;
					while (true) {
						while (true) {
							if (local69 >= local56.length) {
								continue label122;
							}
							if ((0x1 << local67++ & local61) == 0) {
								local69 += 3;
							} else {
								for (local80 = 0; local80 < 3; local80++) {
									local89 = local56[local69++] & 0xFFFF;
									if (local40 < local89) {
										local40 = local89;
									}
									if (local32 > local89) {
										local32 = local89;
									}
									local28.b(local89);
								}
								local30++;
							}
						}
					}
				}
			}
		} else {
			label96: for (local44 = 0; local44 < arg1; local44++) {
				local50 = arg0[local44];
				local56 = this.aClass34_Sub1_2.aShortArrayArray1[local50];
				local61 = this.anIntArray91[local50];
				if (local61 != 0 && local56 != null) {
					local67 = 0;
					local69 = 0;
					while (true) {
						while (true) {
							if (local56.length <= local69) {
								continue label96;
							}
							if ((0x1 << local67++ & local61) == 0) {
								local69 += 3;
							} else {
								for (local80 = 0; local80 < 3; local80++) {
									local89 = local56[local69++] & 0xFFFF;
									local28.e(local89);
									if (local89 < local32) {
										local32 = local89;
									}
									if (local40 < local89) {
										local40 = local89;
									}
								}
								local30++;
							}
						}
					}
				}
			}
		}
		local28.a();
		if (!local14.method6433() || local30 <= 0) {
			return;
		}
		this.aClass45_Sub2_7.method4947((this.aClass34_Sub1_2.anInt791 & 0x8) != 0, this.anInt2011, (this.aClass34_Sub1_2.anInt791 & 0x7) != 0);
		if (this.aClass45_Sub2_7.aBoolean421) {
			this.aClass45_Sub2_7.YA(Integer.MAX_VALUE, this.anInt2016, this.anInt2015, this.anInt2014);
		}
		@Pc(279) Class11_Sub1 local279 = this.aClass45_Sub2_7.method5007();
		local279.method184(1.0F / this.aFloat45, 1.0F / this.aFloat45, 1.0F);
		this.aClass45_Sub2_7.method4932(Static3.aClass222_12);
		this.aClass45_Sub2_7.method4910(this.anInterface19_4, 1);
		this.aClass45_Sub2_7.method4957(this.aClass34_Sub1_2.aClass7_1);
		this.aClass45_Sub2_7.method4967(0, local30, local40 + 1 - local32, Static379.aClass40_9, local14, local32);
		this.aClass45_Sub2_7.method4950();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BI)V")
	public void method1822(@OriginalArg(1) int arg0) {
		this.aStream4.a();
		this.anInterface19_4 = this.aClass45_Sub2_7.method5009(false);
		this.anInterface19_4.method6254(4, this.aNativeHeapBuffer4, arg0 * 4);
		this.aNativeHeapBuffer4 = null;
		this.aStream4 = null;
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)V")
	public void method1823(@OriginalArg(0) int arg0) {
		this.aStream4.f(arg0 * 4 + 3);
		this.aStream4.d(-1);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IFIII)V")
	public void method1825(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) int local20;
		@Pc(38) int local38;
		if (this.anInt2011 != -1) {
			@Pc(15) Class55 local15 = this.aClass45_Sub2_7.anInterface3_12.method4776(this.anInt2011);
			local20 = local15.aByte17 & 0xFF;
			@Pc(61) int local61;
			if (local20 != 0 && local15.aByte16 != 4) {
				if (arg0 < 0) {
					local38 = 0;
				} else if (arg0 <= 127) {
					local38 = arg0 * 131586;
				} else {
					local38 = 16777215;
				}
				if (local20 == 256) {
					arg3 = local38;
				} else {
					local61 = 256 - local20;
					arg3 = (local61 * (arg3 & 0xFF00FF) + local20 * (local38 & 0xFF00FF) & 0xFF00FF00) + (local61 * (arg3 & 0xFF00) + local20 * (local38 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local38 = local15.aByte15 & 0xFF;
			if (local38 != 0) {
				local38 += 256;
				@Pc(114) int local114 = local38 * (arg3 >> 16 & 0xFF);
				if (local114 > 65535) {
					local114 = 65535;
				}
				local61 = (arg3 >> 8 & 0xFF) * local38;
				if (local61 > 65535) {
					local61 = 65535;
				}
				@Pc(140) int local140 = local38 * (arg3 & 0xFF);
				if (local140 > 65535) {
					local140 = 65535;
				}
				arg3 = (local140 >> 8) + (local61 & 0xFF00) + (local114 << 8 & 0xFF00F6);
			}
		}
		this.aStream4.f(arg2 * 4);
		if (arg1 != 1.0F) {
			@Pc(187) int local187 = arg3 >> 16 & 0xFF;
			local20 = arg3 >> 8 & 0xFF;
			local187 = (int) ((float) local187 * arg1);
			local38 = arg3 & 0xFF;
			local20 = (int) ((float) local20 * arg1);
			if (local187 < 0) {
				local187 = 0;
			} else if (local187 > 255) {
				local187 = 255;
			}
			local38 = (int) ((float) local38 * arg1);
			if (local20 < 0) {
				local20 = 0;
			} else if (local20 > 255) {
				local20 = 255;
			}
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			arg3 = local187 << 16 | local20 << 8 | local38;
		}
		if (this.aClass45_Sub2_7.anInt5834 == 0) {
			this.aStream4.d((byte) arg3);
			this.aStream4.d((byte) (arg3 >> 8));
			this.aStream4.d((byte) (arg3 >> 16));
		} else {
			this.aStream4.d((byte) (arg3 >> 16));
			this.aStream4.d((byte) (arg3 >> 8));
			this.aStream4.d((byte) arg3);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IBII)V")
	public void method1826(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray91[arg2 * this.aClass34_Sub1_2.anInt7854 + arg1] |= 0x1 << arg0;
		this.anInt2008++;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZI)V")
	public void method1827(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass45_Sub2_7.method4920(true, arg0 * 4);
		this.aStream4 = new Stream(this.aNativeHeapBuffer4, 0, arg0 * 4);
	}
}

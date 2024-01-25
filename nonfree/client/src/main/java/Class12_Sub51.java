import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class12_Sub51 extends Class12 {

	@OriginalMember(owner = "client!ws", name = "o", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!ws", name = "u", descriptor = "Lclient!lu;")
	private Interface10 anInterface10_13;

	@OriginalMember(owner = "client!ws", name = "v", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!ws", name = "D", descriptor = "I")
	public int anInt9633 = 0;

	@OriginalMember(owner = "client!ws", name = "I", descriptor = "Lclient!uw;")
	private final Class215_Sub3 aClass215_Sub3_3;

	@OriginalMember(owner = "client!ws", name = "x", descriptor = "[I")
	private final int[] anIntArray697;

	@OriginalMember(owner = "client!ws", name = "H", descriptor = "I")
	public final int anInt9636;

	@OriginalMember(owner = "client!ws", name = "z", descriptor = "Lclient!wr;")
	private final Class42_Sub1 aClass42_Sub1_20;

	@OriginalMember(owner = "client!ws", name = "n", descriptor = "I")
	public final int anInt9623;

	@OriginalMember(owner = "client!ws", name = "p", descriptor = "I")
	public final int anInt9624;

	@OriginalMember(owner = "client!ws", name = "B", descriptor = "I")
	public final int anInt9631;

	@OriginalMember(owner = "client!ws", name = "A", descriptor = "F")
	public final float aFloat198;

	static {
		new Class88("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!uw;IIIII)V")
	public Class12_Sub51(@OriginalArg(0) Class215_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass215_Sub3_3 = arg0;
		this.anIntArray697 = new int[this.aClass215_Sub3_3.anInt9450 * this.aClass215_Sub3_3.anInt9452];
		this.anInt9636 = arg1;
		this.aClass42_Sub1_20 = this.aClass215_Sub3_3.aClass42_Sub1_18;
		this.anInt9623 = arg3;
		this.anInt9624 = arg5;
		this.anInt9631 = arg4;
		this.aFloat198 = arg2;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II[I)V")
	public void method7974(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(14) Interface18 local14 = this.aClass42_Sub1_20.method5901(this.anInt9633 * 3);
		@Pc(19) Buffer local19 = local14.method7895();
		if (local19 == null) {
			return;
		}
		@Pc(36) Stream local36 = this.aClass42_Sub1_20.method5871(local19);
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 32767;
		@Pc(42) int local42 = -32768;
		@Pc(95) int local95;
		@Pc(63) short[] local63;
		@Pc(52) int local52;
		@Pc(57) int local57;
		@Pc(46) int local46;
		@Pc(69) int local69;
		@Pc(71) int local71;
		@Pc(86) int local86;
		if (Stream.c()) {
			label116: for (local46 = 0; local46 < arg0; local46++) {
				local52 = arg1[local46];
				local57 = this.anIntArray697[local52];
				local63 = this.aClass215_Sub3_3.aShortArrayArray12[local52];
				if (local57 != 0 && local63 != null) {
					local69 = 0;
					local71 = 0;
					while (true) {
						while (true) {
							if (local71 >= local63.length) {
								continue label116;
							}
							if ((local57 & 0x1 << local69++) == 0) {
								local71 += 3;
							} else {
								local38++;
								for (local86 = 0; local86 < 3; local86++) {
									local95 = local63[local71++] & 0xFFFF;
									if (local95 > local42) {
										local42 = local95;
									}
									local36.a(local95);
									if (local40 > local95) {
										local40 = local95;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label92: for (local46 = 0; local46 < arg0; local46++) {
				local52 = arg1[local46];
				local57 = this.anIntArray697[local52];
				local63 = this.aClass215_Sub3_3.aShortArrayArray12[local52];
				if (local57 != 0 && local63 != null) {
					local69 = 0;
					local71 = 0;
					while (true) {
						while (true) {
							if (local63.length <= local71) {
								continue label92;
							}
							if ((local57 & 0x1 << local69++) == 0) {
								local71 += 3;
							} else {
								local38++;
								for (local86 = 0; local86 < 3; local86++) {
									local95 = local63[local71++] & 0xFFFF;
									if (local95 > local42) {
										local42 = local95;
									}
									local36.d(local95);
									if (local40 > local95) {
										local40 = local95;
									}
								}
							}
						}
					}
				}
			}
		}
		local36.a();
		if (!local14.method7899() || local38 <= 0) {
			return;
		}
		this.aClass42_Sub1_20.method5997(this.anInt9636, (this.aClass215_Sub3_3.anInt9071 & 0x8) != 0, (this.aClass215_Sub3_3.anInt9071 & 0x7) != 0);
		if (this.aClass42_Sub1_20.aBoolean508) {
			this.aClass42_Sub1_20.JA(Integer.MAX_VALUE, this.anInt9623, this.anInt9631, this.anInt9624);
		}
		@Pc(267) Class91_Sub2 local267 = this.aClass42_Sub1_20.method5903();
		local267.method5504(1.0F, 1.0F / this.aFloat198, 1.0F / this.aFloat198);
		this.aClass42_Sub1_20.method5918(Static261.aClass299_2);
		this.aClass42_Sub1_20.method5999(this.aClass215_Sub3_3.aClass287_20);
		this.aClass42_Sub1_20.method5877(this.anInterface10_13, 1);
		this.aClass42_Sub1_20.method5986(local42 + 1 - local40, local14, local40, local38, 0, Static480.aClass147_8);
		this.aClass42_Sub1_20.method5966();
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIII)V")
	public void method7979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray697[arg1 * this.aClass215_Sub3_3.anInt9452 + arg2] |= 0x1 << arg0;
		this.anInt9633++;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)V")
	public void method7980(@OriginalArg(1) int arg0) {
		this.aStream7.e(arg0 * 4 + 3);
		this.aStream7.c(-1);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIIF)V")
	public void method7981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(19) int local19;
		@Pc(39) int local39;
		if (this.anInt9636 != -1) {
			@Pc(14) Class278 local14 = this.aClass42_Sub1_20.anInterface11_11.method6215(this.anInt9636);
			local19 = local14.aByte84 & 0xFF;
			@Pc(62) int local62;
			if (local19 != 0 && local14.aByte87 != 4) {
				if (arg1 < 0) {
					local39 = 0;
				} else if (arg1 <= 127) {
					local39 = arg1 * 131586;
				} else {
					local39 = 16777215;
				}
				if (local19 == 256) {
					arg0 = local39;
				} else {
					local62 = 256 - local19;
					arg0 = ((arg0 & 0xFF00FF) * local62 + (local39 & 0xFF00FF) * local19 & 0xFF00FF00) + (local19 * (local39 & 0xFF00) + ((arg0 & 0xFF00) * local62) & 0xFF0000) >> 8;
				}
			}
			local39 = local14.aByte85 & 0xFF;
			if (local39 != 0) {
				local39 += 256;
				@Pc(113) int local113 = (arg0 >> 16 & 0xFF) * local39;
				if (local113 > 65535) {
					local113 = 65535;
				}
				local62 = (arg0 >> 8 & 0xFF) * local39;
				if (local62 > 65535) {
					local62 = 65535;
				}
				@Pc(139) int local139 = (arg0 & 0xFF) * local39;
				if (local139 > 65535) {
					local139 = 65535;
				}
				arg0 = (local139 >> 8) + (((local113 & 0x6500FF00) << 8) + (local62 & 0xFF00));
			}
		}
		if (arg3 != 1.0F) {
			@Pc(183) int local183 = arg0 >> 16 & 0xFF;
			local19 = arg0 >> 8 & 0xFF;
			local39 = arg0 & 0xFF;
			local183 = (int) ((float) local183 * arg3);
			local19 = (int) ((float) local19 * arg3);
			if (local183 < 0) {
				local183 = 0;
			} else if (local183 > 255) {
				local183 = 255;
			}
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			local39 = (int) ((float) local39 * arg3);
			if (local39 < 0) {
				local39 = 0;
			} else if (local39 > 255) {
				local39 = 255;
			}
			arg0 = local39 | local19 << 8 | local183 << 16;
		}
		this.aStream7.e(arg2 * 4);
		if (this.aClass42_Sub1_20.anInt7114 == 0) {
			this.aStream7.c((byte) arg0);
			this.aStream7.c((byte) (arg0 >> 8));
			this.aStream7.c((byte) (arg0 >> 16));
		} else {
			this.aStream7.c((byte) (arg0 >> 16));
			this.aStream7.c((byte) (arg0 >> 8));
			this.aStream7.c((byte) arg0);
		}
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(IB)V")
	public void method7982(@OriginalArg(0) int arg0) {
		this.aStream7.a();
		this.anInterface10_13 = this.aClass42_Sub1_20.method5930(false);
		this.anInterface10_13.method7896(4, arg0 * 4, this.aNativeHeapBuffer8);
		this.aStream7 = null;
		this.aNativeHeapBuffer8 = null;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZI)V")
	public void method7983(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer8 = this.aClass42_Sub1_20.method5908(arg0 * 4, true);
		this.aStream7 = new Stream(this.aNativeHeapBuffer8, 0, arg0 * 4);
	}
}

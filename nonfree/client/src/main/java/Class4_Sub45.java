import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class4_Sub45 extends Class4 {

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "Lclient!og;")
	private Class190 aClass190_16;

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "Lclient!ul;")
	private final Class41_Sub2 aClass41_Sub2_3;

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "[I")
	private final int[] anIntArray554;

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
	public final int anInt7319;

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
	public final int anInt7324;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
	public final int anInt7322;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
	public final int anInt7323;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "F")
	public final float aFloat100;

	@OriginalMember(owner = "client!wd", name = "F", descriptor = "Lclient!ug;")
	private final Class135_Sub2 aClass135_Sub2_42;

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "Lclient!or;")
	private final Class62_Sub2 aClass62_Sub2_2;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!ul;IIIII)V")
	public Class4_Sub45(@OriginalArg(0) Class41_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass41_Sub2_3 = arg0;
		this.anIntArray554 = new int[this.aClass41_Sub2_3.anInt6908 * this.aClass41_Sub2_3.anInt6909];
		this.anInt7319 = arg3;
		this.anInt7324 = arg1;
		this.anInt7322 = arg5;
		this.anInt7323 = arg4;
		this.aFloat100 = arg2;
		this.aClass135_Sub2_42 = this.aClass41_Sub2_3.aClass135_Sub2_40;
		this.aClass62_Sub2_2 = new Class62_Sub2(this.aClass135_Sub2_42, 5123, null, 1);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)V")
	public void method5860(@OriginalArg(0) int arg0) {
		this.aNativeBuffer4 = this.aClass135_Sub2_42.aNativeHeap2.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer4);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II[I)V")
	public void method5863(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = 0;
		@Pc(16) Class4_Sub9_Sub1 local16 = this.aClass135_Sub2_42.aClass4_Sub9_Sub1_3;
		local16.anInt6207 = 0;
		@Pc(37) short[] local37;
		@Pc(31) int local31;
		@Pc(42) int local42;
		@Pc(25) int local25;
		@Pc(51) int local51;
		@Pc(53) int local53;
		if (this.aClass135_Sub2_42.aBoolean474) {
			for (local25 = 0; local25 < arg0; local25++) {
				local31 = arg1[local25];
				local37 = this.aClass41_Sub2_3.aShortArrayArray7[local31];
				local42 = this.anIntArray554[local31];
				if (local42 != 0 && local37 != null) {
					local51 = 0;
					local53 = 0;
					while (local53 < local37.length) {
						if ((0x1 << local51++ & local42) == 0) {
							local53 += 3;
						} else {
							local12++;
							local16.method5029(local37[local53++] & 0xFFFF);
							local16.method5029(local37[local53++] & 0xFFFF);
							local12++;
							local16.method5029(local37[local53++] & 0xFFFF);
							local12++;
						}
					}
				}
			}
		} else {
			for (local25 = 0; local25 < arg0; local25++) {
				local31 = arg1[local25];
				local37 = this.aClass41_Sub2_3.aShortArrayArray7[local31];
				local42 = this.anIntArray554[local31];
				if (local42 != 0 && local37 != null) {
					local51 = 0;
					local53 = 0;
					while (local53 < local37.length) {
						if ((local42 & 0x1 << local51++) == 0) {
							local53 += 3;
						} else {
							local16.method5060(local37[local53++] & 0xFFFF);
							local12++;
							local12++;
							local16.method5060(local37[local53++] & 0xFFFF);
							local16.method5060(local37[local53++] & 0xFFFF);
							local12++;
						}
					}
				}
			}
		}
		if (local12 <= 0) {
			return;
		}
		this.aClass62_Sub2_2.method3829(local16.anInt6207, local16.aByteArray81);
		this.aClass135_Sub2_42.method5431(this.aClass41_Sub2_3.aClass190_15, this.aClass41_Sub2_3.aClass190_13, this.aClass190_16, this.aClass41_Sub2_3.aClass190_14);
		this.aClass135_Sub2_42.method5472((this.aClass41_Sub2_3.anInt6910 & 0x8) != 0, (this.aClass41_Sub2_3.anInt6910 & 0x7) != 0, this.anInt7324);
		if (this.aClass135_Sub2_42.aBoolean462) {
			this.aClass135_Sub2_42.GA(Integer.MAX_VALUE, this.anInt7319, this.anInt7323, this.anInt7322);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat100, 1.0F / this.aFloat100, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass135_Sub2_42.method5431(this.aClass41_Sub2_3.aClass190_15, this.aClass41_Sub2_3.aClass190_13, this.aClass190_16, this.aClass41_Sub2_3.aClass190_14);
		this.aClass135_Sub2_42.method5479(this.aClass62_Sub2_2, 0, local12);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(IB)V")
	public void method5864(@OriginalArg(0) int arg0) {
		this.aNativeStream1.a();
		@Pc(26) Interface9 local26 = this.aClass135_Sub2_42.method5486(this.aNativeBuffer4, 4, arg0 * 4);
		this.aClass190_16 = new Class190(local26, 5121, 4, 0);
		this.aNativeBuffer4 = null;
		this.aNativeStream1 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIII)V")
	public void method5865(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray554[this.aClass41_Sub2_3.anInt6908 * arg0 + arg1] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBFII)V")
	public void method5866(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		@Pc(39) int local39;
		@Pc(110) int local110;
		if (this.anInt7324 != -1) {
			@Pc(13) Class112 local13 = this.aClass135_Sub2_42.anInterface5_7.method4079(this.anInt7324);
			local18 = local13.aByte51 & 0xFF;
			@Pc(63) int local63;
			if (local18 != 0 && local13.aByte57 != 4) {
				if (arg3 < 0) {
					local39 = 0;
				} else if (arg3 > 127) {
					local39 = 16777215;
				} else {
					local39 = arg3 * 131586;
				}
				if (local18 == 256) {
					arg0 = local39;
				} else {
					local63 = 256 - local18;
					arg0 = ((local39 & 0xFF00FF) * local18 + (arg0 & 0xFF00FF) * local63 & 0xFF00FF00) + (local18 * (local39 & 0xFF00) + (arg0 & 0xFF00) * local63 & 0xFF0000) >> 8;
				}
			}
			local39 = local13.aByte53 & 0xFF;
			if (local39 != 0) {
				local39 += 256;
				local110 = (arg0 >> 16 & 0xFF) * local39;
				if (local110 > 65535) {
					local110 = 65535;
				}
				local63 = (arg0 >> 8 & 0xFF) * local39;
				if (local63 > 65535) {
					local63 = 65535;
				}
				@Pc(134) int local134 = (arg0 & 0xFF) * local39;
				if (local134 > 65535) {
					local134 = 65535;
				}
				arg0 = (local63 & 0xFF00) + ((local110 & 0x4500FF00) << 8) + (local134 >> 8);
			}
		}
		if (arg1 != 1.0F) {
			local18 = arg0 >> 16 & 0xFF;
			local39 = arg0 >> 8 & 0xFF;
			local110 = arg0 & 0xFF;
			local18 = (int) ((float) local18 * arg1);
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			local39 = (int) ((float) local39 * arg1);
			if (local39 < 0) {
				local39 = 0;
			} else if (local39 > 255) {
				local39 = 255;
			}
			local110 = (int) ((float) local110 * arg1);
			if (local110 < 0) {
				local110 = 0;
			} else if (local110 > 255) {
				local110 = 255;
			}
			arg0 = local110 | local39 << 8 | local18 << 16;
		}
		this.aNativeStream1.a(arg2 * 4);
		this.aNativeStream1.b((byte) (arg0 >> 16));
		this.aNativeStream1.b((byte) (arg0 >> 8));
		this.aNativeStream1.b((byte) arg0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)V")
	public void method5867(@OriginalArg(0) int arg0) {
		this.aNativeStream1.a(arg0 * 4 + 3);
		this.aNativeStream1.b(-1);
	}
}

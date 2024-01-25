import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class2_Sub38 extends Class2 {

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "Lclient!af;")
	private Class11 aClass11_14;

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "Lclient!nba;")
	private final Class75_Sub3 aClass75_Sub3_1;

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
	public final int anInt6909;

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "F")
	public final float aFloat180;

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
	public final int anInt6913;

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "Lclient!os;")
	private final Class39_Sub3 aClass39_Sub3_30;

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
	public final int anInt6908;

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "[I")
	private final int[] anIntArray563;

	@OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
	public final int anInt6917;

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "Lclient!sw;")
	private final Class45_Sub2 aClass45_Sub2_2;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!nba;IIIII)V")
	public Class2_Sub38(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass75_Sub3_1 = arg0;
		this.anInt6909 = arg5;
		this.aFloat180 = arg2;
		this.anInt6913 = arg4;
		this.aClass39_Sub3_30 = this.aClass75_Sub3_1.aClass39_Sub3_27;
		this.anInt6908 = arg1;
		this.anIntArray563 = new int[this.aClass75_Sub3_1.anInt7998 * this.aClass75_Sub3_1.anInt7995];
		this.anInt6917 = arg3;
		this.aClass45_Sub2_2 = new Class45_Sub2(this.aClass39_Sub3_30, 5123, null, 1);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)V")
	public void method5879(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray563[arg2 + arg1 * this.aClass75_Sub3_1.anInt7998] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
	public void method5880(@OriginalArg(1) int arg0) {
		this.aStream6.c();
		@Pc(30) Interface10 local30 = this.aClass39_Sub3_30.method5738(4, this.aNativeHeapBuffer6, arg0 * 4);
		this.aClass11_14 = new Class11(local30, 5121, 4, 0);
		this.aNativeHeapBuffer6 = null;
		this.aStream6 = null;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)V")
	public void method5882(@OriginalArg(1) int arg0) {
		this.aStream6.a(arg0 * 4 + 3);
		this.aStream6.b(-1);
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(II)V")
	public void method5883(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer6 = this.aClass39_Sub3_30.aNativeHeap4.a(arg0 * 4, true);
		this.aStream6 = new Stream(this.aNativeHeapBuffer6);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(FIIII)V")
	public void method5884(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(22) int local22;
		@Pc(35) int local35;
		if (this.anInt6908 != -1) {
			@Pc(17) Class204 local17 = this.aClass39_Sub3_30.anInterface12_15.method2573(this.anInt6908);
			local22 = local17.aByte83 & 0xFF;
			@Pc(58) int local58;
			if (local22 != 0 && local17.aByte85 != 4) {
				if (arg3 < 0) {
					local35 = 0;
				} else if (arg3 <= 127) {
					local35 = arg3 * 131586;
				} else {
					local35 = 16777215;
				}
				if (local22 == 256) {
					arg1 = local35;
				} else {
					local58 = 256 - local22;
					arg1 = (local58 * (arg1 & 0xFF00) + (local35 & 0xFF00) * local22 & 0xFF0000) + (local22 * (local35 & 0xFF00FF) + (arg1 & 0xFF00FF) * local58 & 0xFF00FF00) >> 8;
				}
			}
			local35 = local17.aByte82 & 0xFF;
			if (local35 != 0) {
				local35 += 256;
				@Pc(108) int local108 = (arg1 >> 16 & 0xFF) * local35;
				if (local108 > 65535) {
					local108 = 65535;
				}
				local58 = (arg1 >> 8 & 0xFF) * local35;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(134) int local134 = (arg1 & 0xFF) * local35;
				if (local134 > 65535) {
					local134 = 65535;
				}
				arg1 = (local134 >> 8) + ((local108 & 0xC500FF00) << 8) + (local58 & 0xFF00);
			}
		}
		if (arg0 != 1.0F) {
			@Pc(165) int local165 = arg1 >> 16 & 0xFF;
			local22 = arg1 >> 8 & 0xFF;
			local165 = (int) ((float) local165 * arg0);
			local35 = arg1 & 0xFF;
			local22 = (int) ((float) local22 * arg0);
			if (local165 < 0) {
				local165 = 0;
			} else if (local165 > 255) {
				local165 = 255;
			}
			local35 = (int) ((float) local35 * arg0);
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			if (local35 < 0) {
				local35 = 0;
			} else if (local35 > 255) {
				local35 = 255;
			}
			arg1 = local35 | local22 << 8 | local165 << 16;
		}
		this.aStream6.a(arg2 * 4);
		this.aStream6.b((byte) (arg1 >> 16));
		this.aStream6.b((byte) (arg1 >> 8));
		this.aStream6.b((byte) arg1);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([III)V")
	public void method5885(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class2_Sub29_Sub1 local11 = this.aClass39_Sub3_30.aClass2_Sub29_Sub1_2;
		local11.anInt6132 = 0;
		@Pc(37) short[] local37;
		@Pc(26) int local26;
		@Pc(31) int local31;
		@Pc(20) int local20;
		@Pc(46) int local46;
		@Pc(48) int local48;
		if (this.aClass39_Sub3_30.aBoolean485) {
			for (local20 = 0; local20 < arg1; local20++) {
				local26 = arg0[local20];
				local37 = this.aClass75_Sub3_1.aShortArrayArray8[local26];
				local31 = this.anIntArray563[local26];
				if (local31 != 0 && local37 != null) {
					local46 = 0;
					local48 = 0;
					while (local37.length > local48) {
						if ((0x1 << local46++ & local31) == 0) {
							local48 += 3;
						} else {
							local7++;
							local11.method5217(local37[local48++] & 0xFFFF);
							local11.method5217(local37[local48++] & 0xFFFF);
							local7++;
							local7++;
							local11.method5217(local37[local48++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local20 = 0; local20 < arg1; local20++) {
				local26 = arg0[local20];
				local31 = this.anIntArray563[local26];
				local37 = this.aClass75_Sub3_1.aShortArrayArray8[local26];
				if (local31 != 0 && local37 != null) {
					local46 = 0;
					local48 = 0;
					while (local37.length > local48) {
						if ((local31 & 0x1 << local46++) == 0) {
							local48 += 3;
						} else {
							local7++;
							local11.method5199(local37[local48++] & 0xFFFF);
							local7++;
							local11.method5199(local37[local48++] & 0xFFFF);
							local7++;
							local11.method5199(local37[local48++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass45_Sub2_2.method6824(local11.anInt6132, local11.aByteArray96);
		this.aClass39_Sub3_30.method5754(this.aClass75_Sub3_1.aClass11_9, this.aClass11_14, this.aClass75_Sub3_1.aClass11_10, this.aClass75_Sub3_1.aClass11_11);
		this.aClass39_Sub3_30.method5682((this.aClass75_Sub3_1.anInt5692 & 0x8) != 0, this.anInt6908, (this.aClass75_Sub3_1.anInt5692 & 0x7) != 0);
		if (this.aClass39_Sub3_30.aBoolean509) {
			this.aClass39_Sub3_30.JA(Integer.MAX_VALUE, this.anInt6917, this.anInt6913, this.anInt6909);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat180, 1.0F / this.aFloat180, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass39_Sub3_30.method5754(this.aClass75_Sub3_1.aClass11_9, this.aClass11_14, this.aClass75_Sub3_1.aClass11_10, this.aClass75_Sub3_1.aClass11_11);
		this.aClass39_Sub3_30.method5755(this.aClass45_Sub2_2, local7, 0);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}

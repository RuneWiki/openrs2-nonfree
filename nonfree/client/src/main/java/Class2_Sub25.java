import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class2_Sub25 extends Class2 {

	@OriginalMember(owner = "client!ln", name = "r", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!ln", name = "t", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!ln", name = "B", descriptor = "Lclient!wc;")
	private Class260 aClass260_14;

	@OriginalMember(owner = "client!ln", name = "p", descriptor = "Lclient!eg;")
	private final Class64_Sub1 aClass64_Sub1_2;

	@OriginalMember(owner = "client!ln", name = "v", descriptor = "F")
	public final float aFloat64;

	@OriginalMember(owner = "client!ln", name = "C", descriptor = "I")
	public final int anInt4358;

	@OriginalMember(owner = "client!ln", name = "q", descriptor = "I")
	public final int anInt4353;

	@OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
	public final int anInt4351;

	@OriginalMember(owner = "client!ln", name = "s", descriptor = "Lclient!ef;")
	private final Class49_Sub2 aClass49_Sub2_25;

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "[I")
	private final int[] anIntArray370;

	@OriginalMember(owner = "client!ln", name = "u", descriptor = "I")
	public final int anInt4354;

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "Lclient!gu;")
	private final Class41_Sub2 aClass41_Sub2_2;

	static {
		new Class209("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!eg;IIIII)V")
	public Class2_Sub25(@OriginalArg(0) Class64_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass64_Sub1_2 = arg0;
		this.aFloat64 = arg2;
		this.anInt4358 = arg4;
		this.anInt4353 = arg1;
		this.anInt4351 = arg3;
		this.aClass49_Sub2_25 = this.aClass64_Sub1_2.aClass49_Sub2_11;
		this.anIntArray370 = new int[this.aClass64_Sub1_2.anInt2934 * this.aClass64_Sub1_2.anInt2928];
		this.anInt4354 = arg5;
		this.aClass41_Sub2_2 = new Class41_Sub2(this.aClass49_Sub2_25, 5123, null, 1);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZ)V")
	public void method3524(@OriginalArg(0) int arg0) {
		this.aNativeStream1.c();
		@Pc(18) Interface1 local18 = this.aClass49_Sub2_25.method1590(4, arg0 * 4, this.aNativeBuffer4);
		this.aClass260_14 = new Class260(local18, 5121, 4, 0);
		this.aNativeStream1 = null;
		this.aNativeBuffer4 = null;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IB)V")
	public void method3525(@OriginalArg(0) int arg0) {
		this.aNativeStream1.b(arg0 * 4 + 3);
		this.aNativeStream1.a(-1);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II[I)V")
	public void method3527(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(13) int local13 = 0;
		@Pc(15) Class2_Sub23 local15 = Static92.aClass2_Sub23_5;
		local15.anInt6952 = 0;
		@Pc(41) short[] local41;
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(24) int local24;
		@Pc(50) int local50;
		@Pc(52) int local52;
		if (this.aClass49_Sub2_25.aBoolean111) {
			for (local24 = 0; local24 < arg0; local24++) {
				local30 = arg1[local24];
				local35 = this.anIntArray370[local30];
				local41 = this.aClass64_Sub1_2.aShortArrayArray3[local30];
				if (local35 != 0 && local41 != null) {
					local50 = 0;
					local52 = 0;
					while (local41.length > local52) {
						if ((local35 & 0x1 << local50++) == 0) {
							local52 += 3;
						} else {
							local13++;
							local15.method5502(local41[local52++] & 0xFFFF);
							local15.method5502(local41[local52++] & 0xFFFF);
							local13++;
							local15.method5502(local41[local52++] & 0xFFFF);
							local13++;
						}
					}
				}
			}
		} else {
			for (local24 = 0; local24 < arg0; local24++) {
				local30 = arg1[local24];
				local35 = this.anIntArray370[local30];
				local41 = this.aClass64_Sub1_2.aShortArrayArray3[local30];
				if (local35 != 0 && local41 != null) {
					local50 = 0;
					local52 = 0;
					while (local52 < local41.length) {
						if ((0x1 << local50++ & local35) == 0) {
							local52 += 3;
						} else {
							local13++;
							local15.method5457(local41[local52++] & 0xFFFF);
							local13++;
							local15.method5457(local41[local52++] & 0xFFFF);
							local13++;
							local15.method5457(local41[local52++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local13 <= 0) {
			return;
		}
		this.aClass41_Sub2_2.method2312(local15.anInt6952, local15.aByteArray130);
		this.aClass49_Sub2_25.method1618(this.aClass64_Sub1_2.aClass260_7, this.aClass260_14, this.aClass64_Sub1_2.aClass260_6, this.aClass64_Sub1_2.aClass260_8);
		this.aClass49_Sub2_25.method1652((this.aClass64_Sub1_2.anInt2085 & 0x8) != 0, (this.aClass64_Sub1_2.anInt2085 & 0x7) != 0, this.anInt4353);
		if (this.aClass49_Sub2_25.aBoolean129) {
			this.aClass49_Sub2_25.GA(Integer.MAX_VALUE, this.anInt4351, this.anInt4358, this.anInt4354);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat64, 1.0F / this.aFloat64, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass49_Sub2_25.method1618(this.aClass64_Sub1_2.aClass260_7, this.aClass260_14, this.aClass64_Sub1_2.aClass260_6, this.aClass64_Sub1_2.aClass260_8);
		this.aClass49_Sub2_25.method1631(local13, 0, this.aClass41_Sub2_2);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(FIIIZ)V")
	public void method3528(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(23) int local23;
		@Pc(46) int local46;
		if (this.anInt4353 != -1) {
			@Pc(18) Class140 local18 = this.aClass49_Sub2_25.anInterface4_6.method3794(this.anInt4353);
			local23 = local18.aByte59 & 0xFF;
			@Pc(68) int local68;
			if (local23 != 0 && local18.aByte62 != 4) {
				if (arg1 < 0) {
					local46 = 0;
				} else if (arg1 <= 127) {
					local46 = arg1 * 131586;
				} else {
					local46 = 16777215;
				}
				if (local23 == 256) {
					arg3 = local46;
				} else {
					local68 = 256 - local23;
					arg3 = (local23 * (local46 & 0xFF00) + local68 * (arg3 & 0xFF00) & 0xFF0000) + (local23 * (local46 & 0xFF00FF) + (arg3 & 0xFF00FF) * local68 & 0xFF00FF00) >> 8;
				}
			}
			local46 = local18.aByte65 & 0xFF;
			if (local46 != 0) {
				local46 += 256;
				@Pc(117) int local117 = (arg3 >> 16 & 0xFF) * local46;
				if (local117 > 65535) {
					local117 = 65535;
				}
				local68 = (arg3 >> 8 & 0xFF) * local46;
				if (local68 > 65535) {
					local68 = 65535;
				}
				@Pc(145) int local145 = (arg3 & 0xFF) * local46;
				if (local145 > 65535) {
					local145 = 65535;
				}
				arg3 = ((local117 & 0x2600FF00) << 8) + (local68 & 0xFF00) + (local145 >> 8);
			}
		}
		if (arg0 != 1.0F) {
			@Pc(176) int local176 = arg3 >> 16 & 0xFF;
			local23 = arg3 >> 8 & 0xFF;
			local46 = arg3 & 0xFF;
			local176 = (int) ((float) local176 * arg0);
			local23 = (int) ((float) local23 * arg0);
			if (local176 < 0) {
				local176 = 0;
			} else if (local176 > 255) {
				local176 = 255;
			}
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			local46 = (int) ((float) local46 * arg0);
			if (local46 < 0) {
				local46 = 0;
			} else if (local46 > 255) {
				local46 = 255;
			}
			arg3 = local46 | local23 << 8 | local176 << 16;
		}
		this.aNativeStream1.b(arg2 * 4);
		this.aNativeStream1.a((byte) (arg3 >> 16));
		this.aNativeStream1.a((byte) (arg3 >> 8));
		this.aNativeStream1.a((byte) arg3);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIII)V")
	public void method3529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray370[arg0 + this.aClass64_Sub1_2.anInt2934 * arg1] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)V")
	public void method3530(@OriginalArg(0) int arg0) {
		this.aNativeBuffer4 = this.aClass49_Sub2_25.aNativeHeap1.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer4);
	}
}

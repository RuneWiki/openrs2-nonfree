import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class4_Sub9 extends Class4 {

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "Lclient!mba;")
	private Class209 aClass209_4;

	@OriginalMember(owner = "client!dd", name = "H", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer4;

	@OriginalMember(owner = "client!dd", name = "z", descriptor = "Lclient!fw;")
	private final Class115_Sub1 aClass115_Sub1_1;

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "Lclient!kfa;")
	private final Class7_Sub2 aClass7_Sub2_8;

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
	public final int anInt2282;

	@OriginalMember(owner = "client!dd", name = "M", descriptor = "F")
	public final float aFloat53;

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
	public final int anInt2276;

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "[I")
	private final int[] anIntArray109;

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
	public final int anInt2279;

	@OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
	public final int anInt2283;

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "Lclient!kca;")
	private final Class114_Sub2 aClass114_Sub2_1;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!fw;IIIII)V")
	public Class4_Sub9(@OriginalArg(0) Class115_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass115_Sub1_1 = arg0;
		this.aClass7_Sub2_8 = this.aClass115_Sub1_1.aClass7_Sub2_18;
		this.anInt2282 = arg3;
		this.aFloat53 = arg2;
		this.anInt2276 = arg1;
		this.anIntArray109 = new int[this.aClass115_Sub1_1.anInt10327 * this.aClass115_Sub1_1.anInt10330];
		this.anInt2279 = arg5;
		this.anInt2283 = arg4;
		this.aClass114_Sub2_1 = new Class114_Sub2(this.aClass7_Sub2_8, 5123, null, 1);
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(IB)V")
	public void method1803(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass7_Sub2_8.aNativeHeap4.a(arg0 * 4, true);
		this.aStream3 = new Stream(this.aNativeHeapBuffer4);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[IZ)V")
	public void method1804(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class4_Sub13_Sub1 local11 = this.aClass7_Sub2_8.aClass4_Sub13_Sub1_3;
		local11.anInt9170 = 0;
		@Pc(32) short[] local32;
		@Pc(26) int local26;
		@Pc(37) int local37;
		@Pc(20) int local20;
		@Pc(43) int local43;
		@Pc(45) int local45;
		if (this.aClass7_Sub2_8.aBoolean388) {
			for (local20 = 0; local20 < arg0; local20++) {
				local26 = arg1[local20];
				local37 = this.anIntArray109[local26];
				local32 = this.aClass115_Sub1_1.aShortArrayArray10[local26];
				if (local37 != 0 && local32 != null) {
					local43 = 0;
					local45 = 0;
					while (local45 < local32.length) {
						if ((0x1 << local43++ & local37) == 0) {
							local45 += 3;
						} else {
							local11.method7038(local32[local45++] & 0xFFFF);
							local7++;
							local7++;
							local11.method7038(local32[local45++] & 0xFFFF);
							local7++;
							local11.method7038(local32[local45++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local20 = 0; local20 < arg0; local20++) {
				local26 = arg1[local20];
				local32 = this.aClass115_Sub1_1.aShortArrayArray10[local26];
				local37 = this.anIntArray109[local26];
				if (local37 != 0 && local32 != null) {
					local43 = 0;
					local45 = 0;
					while (local45 < local32.length) {
						if ((local37 & 0x1 << local43++) == 0) {
							local45 += 3;
						} else {
							local7++;
							local11.method7041(local32[local45++] & 0xFFFF);
							local7++;
							local11.method7041(local32[local45++] & 0xFFFF);
							local7++;
							local11.method7041(local32[local45++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass114_Sub2_1.method4147(local11.aByteArray88, local11.anInt9170);
		this.aClass7_Sub2_8.method4354(this.aClass115_Sub1_1.aClass209_9, this.aClass115_Sub1_1.aClass209_7, this.aClass209_4, this.aClass115_Sub1_1.aClass209_10);
		this.aClass7_Sub2_8.method4319((this.aClass115_Sub1_1.anInt3301 & 0x7) != 0, (this.aClass115_Sub1_1.anInt3301 & 0x8) != 0, this.anInt2276);
		if (this.aClass7_Sub2_8.aBoolean379) {
			this.aClass7_Sub2_8.YA(Integer.MAX_VALUE, this.anInt2282, this.anInt2283, this.anInt2279);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat53, 1.0F / this.aFloat53, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass7_Sub2_8.method4354(this.aClass115_Sub1_1.aClass209_9, this.aClass115_Sub1_1.aClass209_7, this.aClass209_4, this.aClass115_Sub1_1.aClass209_10);
		this.aClass7_Sub2_8.method4338(0, local7, this.aClass114_Sub2_1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
	public void method1805(@OriginalArg(0) int arg0) {
		this.aStream3.a();
		@Pc(18) Interface16 local18 = this.aClass7_Sub2_8.method4312(4, arg0 * 4, this.aNativeHeapBuffer4);
		this.aClass209_4 = new Class209(local18, 5121, 4, 0);
		this.aNativeHeapBuffer4 = null;
		this.aStream3 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)V")
	public void method1807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray109[arg2 + arg0 * this.aClass115_Sub1_1.anInt10330] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIBFI)V")
	public void method1810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(23) int local23;
		@Pc(35) int local35;
		if (this.anInt2276 != -1) {
			@Pc(18) Class69 local18 = this.aClass7_Sub2_8.anInterface7_12.method4460(this.anInt2276);
			local23 = local18.aByte43 & 0xFF;
			@Pc(63) int local63;
			if (local23 != 0 && local18.aByte40 != 4) {
				if (arg3 < 0) {
					local35 = 0;
				} else if (arg3 <= 127) {
					local35 = arg3 * 131586;
				} else {
					local35 = 16777215;
				}
				if (local23 == 256) {
					arg0 = local35;
				} else {
					local63 = 256 - local23;
					arg0 = ((arg0 & 0xFF00FF) * local63 + local23 * (local35 & 0xFF00FF) & 0xFF00FF00) + (local23 * (local35 & 0xFF00) + (local63 * (arg0 & 0xFF00)) & 0xFF0000) >> 8;
				}
			}
			local35 = local18.aByte46 & 0xFF;
			if (local35 != 0) {
				local35 += 256;
				@Pc(111) int local111 = (arg0 >> 16 & 0xFF) * local35;
				if (local111 > 65535) {
					local111 = 65535;
				}
				local63 = local35 * (arg0 >> 8 & 0xFF);
				if (local63 > 65535) {
					local63 = 65535;
				}
				@Pc(137) int local137 = local35 * (arg0 & 0xFF);
				if (local137 > 65535) {
					local137 = 65535;
				}
				arg0 = (local63 & 0xFF00) + (local111 << 8 & 0xFF0091) + (local137 >> 8);
			}
		}
		this.aStream3.b(arg1 * 4);
		if (arg2 != 1.0F) {
			@Pc(174) int local174 = arg0 >> 16 & 0xFF;
			local23 = arg0 >> 8 & 0xFF;
			local174 = (int) ((float) local174 * arg2);
			local35 = arg0 & 0xFF;
			if (local174 < 0) {
				local174 = 0;
			} else if (local174 > 255) {
				local174 = 255;
			}
			local23 = (int) ((float) local23 * arg2);
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			local35 = (int) ((float) local35 * arg2);
			if (local35 < 0) {
				local35 = 0;
			} else if (local35 > 255) {
				local35 = 255;
			}
			arg0 = local174 << 16 | local23 << 8 | local35;
		}
		this.aStream3.a((byte) (arg0 >> 16));
		this.aStream3.a((byte) (arg0 >> 8));
		this.aStream3.a((byte) arg0);
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)V")
	public void method1811(@OriginalArg(0) int arg0) {
		this.aStream3.b(arg0 * 4 + 3);
		this.aStream3.a(-1);
	}
}

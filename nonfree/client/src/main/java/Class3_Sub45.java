import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class3_Sub45 extends Class3 {

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "Lclient!we;")
	private Class381 aClass381_14;

	@OriginalMember(owner = "client!pd", name = "A", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!pd", name = "G", descriptor = "Lclient!ct;")
	private final Class21_Sub2 aClass21_Sub2_1;

	@OriginalMember(owner = "client!pd", name = "I", descriptor = "[I")
	private final int[] anIntArray639;

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
	public final int anInt7457;

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
	public final int anInt7461;

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
	public final int anInt7460;

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
	public final int anInt7459;

	@OriginalMember(owner = "client!pd", name = "H", descriptor = "F")
	public final float aFloat155;

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "Lclient!dia;")
	private final Class13_Sub2 aClass13_Sub2_29;

	@OriginalMember(owner = "client!pd", name = "C", descriptor = "Lclient!hb;")
	private final Class17_Sub1 aClass17_Sub1_1;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!ct;IIIII)V")
	public Class3_Sub45(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass21_Sub2_1 = arg0;
		this.anIntArray639 = new int[this.aClass21_Sub2_1.anInt9128 * this.aClass21_Sub2_1.anInt9129];
		this.anInt7457 = arg4;
		this.anInt7461 = arg1;
		this.anInt7460 = arg5;
		this.anInt7459 = arg3;
		this.aFloat155 = (float) arg2;
		this.aClass13_Sub2_29 = this.aClass21_Sub2_1.aClass13_Sub2_6;
		this.aClass17_Sub1_1 = new Class17_Sub1(this.aClass13_Sub2_29, 5123, (byte[]) null, 1);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "([IIB)V")
	public void method6590(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = 0;
		@Pc(18) Class3_Sub25_Sub2 local18 = this.aClass13_Sub2_29.aClass3_Sub25_Sub2_1;
		local18.anInt9765 = 0;
		@Pc(39) short[] local39;
		@Pc(33) int local33;
		@Pc(44) int local44;
		@Pc(27) int local27;
		@Pc(53) int local53;
		@Pc(55) int local55;
		if (this.aClass13_Sub2_29.aBoolean166) {
			for (local27 = 0; local27 < arg1; local27++) {
				local33 = arg0[local27];
				local39 = this.aClass21_Sub2_1.aShortArrayArray3[local33];
				local44 = this.anIntArray639[local33];
				if (local44 != 0 && local39 != null) {
					local53 = 0;
					local55 = 0;
					while (local39.length > local55) {
						if ((0x1 << local53++ & local44) == 0) {
							local55 += 3;
						} else {
							local18.method8649(local39[local55++] & 0xFFFF);
							local14++;
							local14++;
							local18.method8649(local39[local55++] & 0xFFFF);
							local14++;
							local18.method8649(local39[local55++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local27 = 0; local27 < arg1; local27++) {
				local33 = arg0[local27];
				local39 = this.aClass21_Sub2_1.aShortArrayArray3[local33];
				local44 = this.anIntArray639[local33];
				if (local44 != 0 && local39 != null) {
					local53 = 0;
					local55 = 0;
					while (local39.length > local55) {
						if ((0x1 << local53++ & local44) == 0) {
							local55 += 3;
						} else {
							local14++;
							local18.method8602(local39[local55++] & 0xFFFF);
							local14++;
							local18.method8602(local39[local55++] & 0xFFFF);
							local18.method8602(local39[local55++] & 0xFFFF);
							local14++;
						}
					}
				}
			}
		}
		if (local14 <= 0) {
			return;
		}
		this.aClass17_Sub1_1.method6786(local18.anInt9765, local18.aByteArray106);
		this.aClass13_Sub2_29.method1971(this.aClass21_Sub2_1.aClass381_1, this.aClass381_14, this.aClass21_Sub2_1.aClass381_3, this.aClass21_Sub2_1.aClass381_4);
		this.aClass13_Sub2_29.method1951((this.aClass21_Sub2_1.anInt1716 & 0x8) != 0, (this.aClass21_Sub2_1.anInt1716 & 0x7) != 0, this.anInt7461);
		if (this.aClass13_Sub2_29.aBoolean163) {
			this.aClass13_Sub2_29.EA(Integer.MAX_VALUE, this.anInt7459, this.anInt7457, this.anInt7460);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat155, 1.0F / this.aFloat155, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass13_Sub2_29.method1971(this.aClass21_Sub2_1.aClass381_1, this.aClass381_14, this.aClass21_Sub2_1.aClass381_3, this.aClass21_Sub2_1.aClass381_4);
		this.aClass13_Sub2_29.method1957(this.aClass17_Sub1_1, local14, 0);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)V")
	public void method6591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray639[arg1 + this.aClass21_Sub2_1.anInt9129 * arg2] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)V")
	public void method6592(@OriginalArg(0) int arg0) {
		this.aStream6.e(arg0 * 4 + 3);
		this.aStream6.a(-1);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIF)V")
	public void method6594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(20) int local20;
		@Pc(40) int local40;
		if (this.anInt7461 != -1) {
			@Pc(15) Class119 local15 = this.aClass13_Sub2_29.anInterface4_14.method4673(this.anInt7461);
			local20 = local15.aByte55 & 0xFF;
			@Pc(58) int local58;
			if (local20 != 0 && local15.aByte54 != 4) {
				if (arg0 < 0) {
					local40 = 0;
				} else if (arg0 <= 127) {
					local40 = arg0 * 131586;
				} else {
					local40 = 16777215;
				}
				if (local20 == 256) {
					arg2 = local40;
				} else {
					local58 = 256 - local20;
					arg2 = (local20 * (local40 & 0xFF00FF) + local58 * (arg2 & 0xFF00FF) & 0xFF00FF00) + ((arg2 & 0xFF00) * local58 + local20 * (local40 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local40 = local15.aByte53 & 0xFF;
			if (local40 != 0) {
				local40 += 256;
				@Pc(109) int local109 = local40 * (arg2 >> 16 & 0xFF);
				if (local109 > 65535) {
					local109 = 65535;
				}
				local58 = (arg2 >> 8 & 0xFF) * local40;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(133) int local133 = local40 * (arg2 & 0xFF);
				if (local133 > 65535) {
					local133 = 65535;
				}
				arg2 = (local109 << 8 & 0xFF0019) + (local58 & 0xFF00) + (local133 >> 8);
			}
		}
		this.aStream6.e(arg1 * 4);
		if (arg3 != 1.0F) {
			@Pc(175) int local175 = arg2 >> 16 & 0xFF;
			local20 = arg2 >> 8 & 0xFF;
			local40 = arg2 & 0xFF;
			local175 = (int) ((float) local175 * arg3);
			local20 = (int) ((float) local20 * arg3);
			if (local175 < 0) {
				local175 = 0;
			} else if (local175 > 255) {
				local175 = 255;
			}
			if (local20 < 0) {
				local20 = 0;
			} else if (local20 > 255) {
				local20 = 255;
			}
			local40 = (int) ((float) local40 * arg3);
			if (local40 < 0) {
				local40 = 0;
			} else if (local40 > 255) {
				local40 = 255;
			}
			arg2 = local40 | local20 << 8 | local175 << 16;
		}
		this.aStream6.a((byte) (arg2 >> 16));
		this.aStream6.a((byte) (arg2 >> 8));
		this.aStream6.a((byte) arg2);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
	public void method6595(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer6 = this.aClass13_Sub2_29.aNativeHeap3.a(arg0 * 4, true);
		this.aStream6 = new Stream(this.aNativeHeapBuffer6);
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)V")
	public void method6596(@OriginalArg(1) int arg0) {
		this.aStream6.a();
		@Pc(20) Interface9 local20 = this.aClass13_Sub2_29.method2027(this.aNativeHeapBuffer6, arg0 * 4, 4);
		this.aClass381_14 = new Class381(local20, 5121, 4, 0);
		this.aStream6 = null;
		this.aNativeHeapBuffer6 = null;
	}
}

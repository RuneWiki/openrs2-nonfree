import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer4;

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "Lclient!gv;")
	private Class131 aClass131_3;

	@OriginalMember(owner = "client!ci", name = "A", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "Lclient!dga;")
	private final Class67_Sub2 aClass67_Sub2_2;

	@OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
	public final int anInt1467;

	@OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
	public final int anInt1469;

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "[I")
	private final int[] anIntArray76;

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "F")
	public final float aFloat26;

	@OriginalMember(owner = "client!ci", name = "D", descriptor = "I")
	public final int anInt1470;

	@OriginalMember(owner = "client!ci", name = "B", descriptor = "Lclient!qj;")
	private final Class100_Sub3 aClass100_Sub3_12;

	@OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
	public final int anInt1471;

	@OriginalMember(owner = "client!ci", name = "x", descriptor = "Lclient!wk;")
	private final Class44_Sub2 aClass44_Sub2_1;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!dga;IIIII)V")
	public Class2_Sub11(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass67_Sub2_2 = arg0;
		this.anInt1467 = arg5;
		this.anInt1469 = arg3;
		this.anIntArray76 = new int[this.aClass67_Sub2_2.anInt8110 * this.aClass67_Sub2_2.anInt8111];
		this.aFloat26 = arg2;
		this.anInt1470 = arg1;
		this.aClass100_Sub3_12 = this.aClass67_Sub2_2.aClass100_Sub3_13;
		this.anInt1471 = arg4;
		this.aClass44_Sub2_1 = new Class44_Sub2(this.aClass100_Sub3_12, 5123, null, 1);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)V")
	public void method1020(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass100_Sub3_12.aNativeHeap6.a(arg0 * 4, true);
		this.aStream2 = new Stream(this.aNativeHeapBuffer4);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIBIF)V")
	public void method1022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(18) int local18;
		@Pc(33) int local33;
		if (this.anInt1470 != -1) {
			@Pc(13) Class343 local13 = this.aClass100_Sub3_12.anInterface5_10.method917(this.anInt1470);
			local18 = local13.aByte119 & 0xFF;
			@Pc(58) int local58;
			if (local18 != 0 && local13.aByte117 != 4) {
				if (arg0 < 0) {
					local33 = 0;
				} else if (arg0 <= 127) {
					local33 = arg0 * 131586;
				} else {
					local33 = 16777215;
				}
				if (local18 == 256) {
					arg2 = local33;
				} else {
					local58 = 256 - local18;
					arg2 = (local58 * (arg2 & 0xFF00) + (local33 & 0xFF00) * local18 & 0xFF0000) + (local58 * (arg2 & 0xFF00FF) + (local33 & 0xFF00FF) * local18 & 0xFF00FF00) >> 8;
				}
			}
			local33 = local13.aByte115 & 0xFF;
			if (local33 != 0) {
				local33 += 256;
				@Pc(111) int local111 = local33 * (arg2 >> 16 & 0xFF);
				if (local111 > 65535) {
					local111 = 65535;
				}
				local58 = (arg2 >> 8 & 0xFF) * local33;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(137) int local137 = (arg2 & 0xFF) * local33;
				if (local137 > 65535) {
					local137 = 65535;
				}
				arg2 = (local137 >> 8) + (local58 & 0xFF00) + ((local111 & 0x9600FF00) << 8);
			}
		}
		this.aStream2.b(arg1 * 4);
		if (arg3 != 1.0F) {
			@Pc(178) int local178 = arg2 >> 16 & 0xFF;
			local18 = arg2 >> 8 & 0xFF;
			local33 = arg2 & 0xFF;
			local178 = (int) ((float) local178 * arg3);
			local18 = (int) ((float) local18 * arg3);
			if (local178 < 0) {
				local178 = 0;
			} else if (local178 > 255) {
				local178 = 255;
			}
			local33 = (int) ((float) local33 * arg3);
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 255) {
				local33 = 255;
			}
			arg2 = local18 << 8 | local178 << 16 | local33;
		}
		this.aStream2.d((byte) (arg2 >> 16));
		this.aStream2.d((byte) (arg2 >> 8));
		this.aStream2.d((byte) arg2);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II[I)V")
	public void method1023(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class2_Sub15_Sub1 local11 = this.aClass100_Sub3_12.aClass2_Sub15_Sub1_2;
		local11.anInt5241 = 0;
		@Pc(32) short[] local32;
		@Pc(26) int local26;
		@Pc(37) int local37;
		@Pc(20) int local20;
		@Pc(46) int local46;
		@Pc(48) int local48;
		if (this.aClass100_Sub3_12.aBoolean595) {
			for (local20 = 0; local20 < arg0; local20++) {
				local26 = arg1[local20];
				local32 = this.aClass67_Sub2_2.aShortArrayArray2[local26];
				local37 = this.anIntArray76[local26];
				if (local37 != 0 && local32 != null) {
					local46 = 0;
					local48 = 0;
					while (local48 < local32.length) {
						if ((0x1 << local46++ & local37) == 0) {
							local48 += 3;
						} else {
							local11.method4350(local32[local48++] & 0xFFFF);
							local7++;
							local7++;
							local11.method4350(local32[local48++] & 0xFFFF);
							local11.method4350(local32[local48++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local20 = 0; local20 < arg0; local20++) {
				local26 = arg1[local20];
				local32 = this.aClass67_Sub2_2.aShortArrayArray2[local26];
				local37 = this.anIntArray76[local26];
				if (local37 != 0 && local32 != null) {
					local46 = 0;
					local48 = 0;
					while (local32.length > local48) {
						if ((0x1 << local46++ & local37) == 0) {
							local48 += 3;
						} else {
							local7++;
							local11.method4308(local32[local48++] & 0xFFFF);
							local11.method4308(local32[local48++] & 0xFFFF);
							local7++;
							local11.method4308(local32[local48++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass44_Sub2_1.method7927(local11.anInt5241, local11.aByteArray62);
		this.aClass100_Sub3_12.method6302(this.aClass67_Sub2_2.aClass131_5, this.aClass131_3, this.aClass67_Sub2_2.aClass131_7, this.aClass67_Sub2_2.aClass131_6);
		this.aClass100_Sub3_12.method6296(this.anInt1470, (this.aClass67_Sub2_2.anInt1980 & 0x8) != 0, (this.aClass67_Sub2_2.anInt1980 & 0x7) != 0);
		if (this.aClass100_Sub3_12.aBoolean589) {
			this.aClass100_Sub3_12.YA(Integer.MAX_VALUE, this.anInt1469, this.anInt1471, this.anInt1467);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat26, 1.0F / this.aFloat26, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass100_Sub3_12.method6302(this.aClass67_Sub2_2.aClass131_5, this.aClass131_3, this.aClass67_Sub2_2.aClass131_7, this.aClass67_Sub2_2.aClass131_6);
		this.aClass100_Sub3_12.method6295(local7, 0, this.aClass44_Sub2_1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(BI)V")
	public void method1024(@OriginalArg(1) int arg0) {
		this.aStream2.c();
		@Pc(20) Interface18 local20 = this.aClass100_Sub3_12.method6292(4, arg0 * 4, this.aNativeHeapBuffer4);
		this.aClass131_3 = new Class131(local20, 5121, 4, 0);
		this.aNativeHeapBuffer4 = null;
		this.aStream2 = null;
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(BI)V")
	public void method1025(@OriginalArg(1) int arg0) {
		this.aStream2.b(arg0 * 4 + 3);
		this.aStream2.d(-1);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIZI)V")
	public void method1027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray76[arg2 * this.aClass67_Sub2_2.anInt8111 + arg0] |= 0x1 << arg1;
	}
}

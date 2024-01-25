import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class1_Sub42 extends Class1 {

	@OriginalMember(owner = "client!uv", name = "n", descriptor = "Lclient!ds;")
	private Class58 aClass58_16;

	@OriginalMember(owner = "client!uv", name = "p", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!uv", name = "I", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer3;

	@OriginalMember(owner = "client!uv", name = "o", descriptor = "Lclient!jt;")
	private final Class136_Sub1 aClass136_Sub1_3;

	@OriginalMember(owner = "client!uv", name = "r", descriptor = "I")
	public final int anInt7225;

	@OriginalMember(owner = "client!uv", name = "s", descriptor = "I")
	public final int anInt7226;

	@OriginalMember(owner = "client!uv", name = "t", descriptor = "I")
	public final int anInt7227;

	@OriginalMember(owner = "client!uv", name = "w", descriptor = "I")
	public final int anInt7230;

	@OriginalMember(owner = "client!uv", name = "y", descriptor = "[I")
	private final int[] anIntArray626;

	@OriginalMember(owner = "client!uv", name = "C", descriptor = "Lclient!ht;")
	private final Class109_Sub1 aClass109_Sub1_42;

	@OriginalMember(owner = "client!uv", name = "F", descriptor = "F")
	public final float aFloat92;

	@OriginalMember(owner = "client!uv", name = "E", descriptor = "Lclient!va;")
	private final Class59_Sub2 aClass59_Sub2_2;

	static {
		new Class84("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lclient!jt;IIIII)V")
	public Class1_Sub42(@OriginalArg(0) Class136_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass136_Sub1_3 = arg0;
		this.anInt7225 = arg5;
		this.anInt7226 = arg3;
		this.anInt7227 = arg4;
		this.anInt7230 = arg1;
		this.anIntArray626 = new int[this.aClass136_Sub1_3.anInt7664 * this.aClass136_Sub1_3.anInt7662];
		this.aClass109_Sub1_42 = this.aClass136_Sub1_3.aClass109_Sub1_24;
		this.aFloat92 = arg2;
		this.aClass59_Sub2_2 = new Class59_Sub2(this.aClass109_Sub1_42, 5123, null, 1);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BI)V")
	public void method5593(@OriginalArg(1) int arg0) {
		this.aNativeBuffer3 = this.aClass109_Sub1_42.aNativeHeap1.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer3);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)V")
	public void method5594(@OriginalArg(1) int arg0) {
		this.aNativeStream1.b(arg0 * 4 + 3);
		this.aNativeStream1.a(-1);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "([III)V")
	public void method5596(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) Class1_Sub1 local9 = Static406.aClass1_Sub1_7;
		local9.anInt5056 = 0;
		@Pc(35) short[] local35;
		@Pc(24) int local24;
		@Pc(29) int local29;
		@Pc(18) int local18;
		@Pc(41) int local41;
		@Pc(43) int local43;
		if (this.aClass109_Sub1_42.aBoolean163) {
			for (local18 = 0; local18 < arg1; local18++) {
				local24 = arg0[local18];
				local29 = this.anIntArray626[local24];
				local35 = this.aClass136_Sub1_3.aShortArrayArray5[local24];
				if (local29 != 0 && local35 != null) {
					local41 = 0;
					local43 = 0;
					while (local43 < local35.length) {
						if ((0x1 << local41++ & local29) == 0) {
							local43 += 3;
						} else {
							local7++;
							local9.method4101(local35[local43++] & 0xFFFF);
							local9.method4101(local35[local43++] & 0xFFFF);
							local7++;
							local7++;
							local9.method4101(local35[local43++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local18 = 0; local18 < arg1; local18++) {
				local24 = arg0[local18];
				local29 = this.anIntArray626[local24];
				local35 = this.aClass136_Sub1_3.aShortArrayArray5[local24];
				if (local29 != 0 && local35 != null) {
					local41 = 0;
					local43 = 0;
					while (local35.length > local43) {
						if ((0x1 << local41++ & local29) == 0) {
							local43 += 3;
						} else {
							local7++;
							local9.method4146(local35[local43++] & 0xFFFF);
							local9.method4146(local35[local43++] & 0xFFFF);
							local7++;
							local9.method4146(local35[local43++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass59_Sub2_2.method5609(local9.aByteArray66, local9.anInt5056);
		this.aClass109_Sub1_42.method2605(this.aClass136_Sub1_3.aClass58_3, this.aClass136_Sub1_3.aClass58_5, this.aClass58_16, this.aClass136_Sub1_3.aClass58_4);
		this.aClass109_Sub1_42.method2527(this.anInt7230, (this.aClass136_Sub1_3.anInt3660 & 0x7) != 0, (this.aClass136_Sub1_3.anInt3660 & 0x8) != 0);
		if (this.aClass109_Sub1_42.aBoolean154) {
			this.aClass109_Sub1_42.ba(Integer.MAX_VALUE, this.anInt7226, this.anInt7227, this.anInt7225);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat92, 1.0F / this.aFloat92, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass109_Sub1_42.method2605(this.aClass136_Sub1_3.aClass58_3, this.aClass136_Sub1_3.aClass58_5, this.aClass58_16, this.aClass136_Sub1_3.aClass58_4);
		this.aClass109_Sub1_42.method2586(0, local7, this.aClass59_Sub2_2);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(FIIBI)V")
	public void method5598(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19;
		@Pc(41) int local41;
		if (this.anInt7230 != -1) {
			@Pc(14) Class151 local14 = this.aClass109_Sub1_42.anInterface7_9.method4836(this.anInt7230);
			local19 = local14.aByte53 & 0xFF;
			@Pc(65) int local65;
			if (local19 != 0 && local14.aByte52 != 4) {
				if (arg2 < 0) {
					local41 = 0;
				} else if (arg2 <= 127) {
					local41 = arg2 * 131586;
				} else {
					local41 = 16777215;
				}
				if (local19 == 256) {
					arg3 = local41;
				} else {
					local65 = 256 - local19;
					arg3 = ((arg3 & 0xFF00) * local65 + (local41 & 0xFF00) * local19 & 0xFF0000) + (local19 * (local41 & 0xFF00FF) + (local65 * (arg3 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				}
			}
			local41 = local14.aByte51 & 0xFF;
			if (local41 != 0) {
				local41 += 256;
				@Pc(115) int local115 = (arg3 >> 16 & 0xFF) * local41;
				if (local115 > 65535) {
					local115 = 65535;
				}
				local65 = local41 * (arg3 >> 8 & 0xFF);
				if (local65 > 65535) {
					local65 = 65535;
				}
				@Pc(141) int local141 = local41 * (arg3 & 0xFF);
				if (local141 > 65535) {
					local141 = 65535;
				}
				arg3 = (local141 >> 8) + ((local115 & 0x7D00FF00) << 8) + (local65 & 0xFF00);
			}
		}
		if (arg0 != 1.0F) {
			@Pc(177) int local177 = arg3 >> 16 & 0xFF;
			local19 = arg3 >> 8 & 0xFF;
			local41 = arg3 & 0xFF;
			local177 = (int) ((float) local177 * arg0);
			if (local177 < 0) {
				local177 = 0;
			} else if (local177 > 255) {
				local177 = 255;
			}
			local19 = (int) ((float) local19 * arg0);
			local41 = (int) ((float) local41 * arg0);
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			if (local41 < 0) {
				local41 = 0;
			} else if (local41 > 255) {
				local41 = 255;
			}
			arg3 = local19 << 8 | local177 << 16 | local41;
		}
		this.aNativeStream1.b(arg1 * 4);
		this.aNativeStream1.a((byte) (arg3 >> 16));
		this.aNativeStream1.a((byte) (arg3 >> 8));
		this.aNativeStream1.a((byte) arg3);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BIII)V")
	public void method5600(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray626[arg0 + arg1 * this.aClass136_Sub1_3.anInt7662] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(II)V")
	public void method5601(@OriginalArg(0) int arg0) {
		this.aNativeStream1.c();
		@Pc(18) Interface1 local18 = this.aClass109_Sub1_42.method2534(4, this.aNativeBuffer3, arg0 * 4);
		this.aClass58_16 = new Class58(this.aClass109_Sub1_42, local18, 5121, 4, 0);
		this.aNativeStream1 = null;
		this.aNativeBuffer3 = null;
	}
}

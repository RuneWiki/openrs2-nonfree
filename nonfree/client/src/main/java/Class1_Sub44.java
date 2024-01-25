import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class1_Sub44 extends Class1 {

	@OriginalMember(owner = "client!wn", name = "x", descriptor = "Lclient!tp;")
	private Class238 aClass238_15;

	@OriginalMember(owner = "client!wn", name = "A", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!wn", name = "F", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!wn", name = "q", descriptor = "Lclient!sp;")
	private final Class157_Sub2 aClass157_Sub2_3;

	@OriginalMember(owner = "client!wn", name = "I", descriptor = "I")
	public final int anInt7447;

	@OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
	public final int anInt7443;

	@OriginalMember(owner = "client!wn", name = "E", descriptor = "F")
	public final float aFloat107;

	@OriginalMember(owner = "client!wn", name = "J", descriptor = "I")
	public final int anInt7448;

	@OriginalMember(owner = "client!wn", name = "C", descriptor = "Lclient!ur;")
	private final Class34_Sub2 aClass34_Sub2_42;

	@OriginalMember(owner = "client!wn", name = "v", descriptor = "I")
	public final int anInt7442;

	@OriginalMember(owner = "client!wn", name = "y", descriptor = "[I")
	private final int[] anIntArray511;

	@OriginalMember(owner = "client!wn", name = "B", descriptor = "Lclient!dj;")
	private final Class56_Sub1 aClass56_Sub1_2;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!sp;IIIII)V")
	public Class1_Sub44(@OriginalArg(0) Class157_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass157_Sub2_3 = arg0;
		this.anInt7447 = arg1;
		this.anInt7443 = arg5;
		this.aFloat107 = arg2;
		this.anInt7448 = arg3;
		this.aClass34_Sub2_42 = this.aClass157_Sub2_3.aClass34_Sub2_34;
		this.anInt7442 = arg4;
		this.anIntArray511 = new int[this.aClass157_Sub2_3.anInt6283 * this.aClass157_Sub2_3.anInt6286];
		this.aClass56_Sub1_2 = new Class56_Sub1(this.aClass34_Sub2_42, 5123, null, 1);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIII)V")
	public void method5881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray511[arg2 + this.aClass157_Sub2_3.anInt6283 * arg1] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)V")
	public void method5883(@OriginalArg(1) int arg0) {
		this.aNativeStream1.b();
		@Pc(18) Interface10 local18 = this.aClass34_Sub2_42.method5544(arg0 * 4, 4, this.aNativeBuffer4);
		this.aClass238_15 = new Class238(local18, 5121, 4, 0);
		this.aNativeStream1 = null;
		this.aNativeBuffer4 = null;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z[II)V")
	public void method5884(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class1_Sub28_Sub2 local11 = this.aClass34_Sub2_42.aClass1_Sub28_Sub2_3;
		local11.anInt6812 = 0;
		@Pc(32) short[] local32;
		@Pc(26) int local26;
		@Pc(37) int local37;
		@Pc(20) int local20;
		@Pc(43) int local43;
		@Pc(45) int local45;
		if (this.aClass34_Sub2_42.aBoolean751) {
			for (local20 = 0; local20 < arg1; local20++) {
				local26 = arg0[local20];
				local32 = this.aClass157_Sub2_3.aShortArrayArray10[local26];
				local37 = this.anIntArray511[local26];
				if (local37 != 0 && local32 != null) {
					local43 = 0;
					local45 = 0;
					while (local32.length > local45) {
						if ((0x1 << local43++ & local37) == 0) {
							local45 += 3;
						} else {
							local7++;
							local11.method5393(local32[local45++] & 0xFFFF);
							local7++;
							local11.method5393(local32[local45++] & 0xFFFF);
							local7++;
							local11.method5393(local32[local45++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local20 = 0; local20 < arg1; local20++) {
				local26 = arg0[local20];
				local37 = this.anIntArray511[local26];
				local32 = this.aClass157_Sub2_3.aShortArrayArray10[local26];
				if (local37 != 0 && local32 != null) {
					local43 = 0;
					local45 = 0;
					while (local32.length > local45) {
						if ((0x1 << local43++ & local37) == 0) {
							local45 += 3;
						} else {
							local11.method5383(local32[local45++] & 0xFFFF);
							local7++;
							local11.method5383(local32[local45++] & 0xFFFF);
							local7++;
							local11.method5383(local32[local45++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass56_Sub1_2.method3824(local11.anInt6812, local11.aByteArray86);
		this.aClass34_Sub2_42.method5550(this.aClass157_Sub2_3.aClass238_10, this.aClass157_Sub2_3.lb, this.aClass238_15, this.aClass157_Sub2_3.aClass238_12);
		this.aClass34_Sub2_42.method5560((this.aClass157_Sub2_3.anInt6296 & 0x7) != 0, this.anInt7447, (this.aClass157_Sub2_3.anInt6296 & 0x8) != 0);
		if (this.aClass34_Sub2_42.aBoolean756) {
			this.aClass34_Sub2_42.a(Integer.MAX_VALUE, this.anInt7448, this.anInt7442, this.anInt7443);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat107, 1.0F / this.aFloat107, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass34_Sub2_42.method5550(this.aClass157_Sub2_3.aClass238_10, this.aClass157_Sub2_3.lb, this.aClass238_15, this.aClass157_Sub2_3.aClass238_12);
		this.aClass34_Sub2_42.method5504(local7, 0, this.aClass56_Sub1_2);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BI)V")
	public void method5886(@OriginalArg(1) int arg0) {
		this.aNativeStream1.a(arg0 * 4 + 3);
		this.aNativeStream1.b(-1);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIFI)V")
	public void method5887(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		@Pc(34) int local34;
		if (this.anInt7447 != -1) {
			@Pc(13) Class114 local13 = this.aClass34_Sub2_42.anInterface6_8.method3937(this.anInt7447);
			local18 = local13.aByte29 & 0xFF;
			@Pc(59) int local59;
			if (local18 != 0 && local13.aByte30 != 4) {
				if (arg1 < 0) {
					local34 = 0;
				} else if (arg1 > 127) {
					local34 = 16777215;
				} else {
					local34 = arg1 * 131586;
				}
				if (local18 == 256) {
					arg0 = local34;
				} else {
					local59 = 256 - local18;
					arg0 = ((arg0 & 0xFF00FF) * local59 + (local34 & 0xFF00FF) * local18 & 0xFF00FF00) + (local18 * (local34 & 0xFF00) + (arg0 & 0xFF00) * local59 & 0xFF0000) >> 8;
				}
			}
			local34 = local13.aByte25 & 0xFF;
			if (local34 != 0) {
				local34 += 256;
				@Pc(113) int local113 = (arg0 >> 16 & 0xFF) * local34;
				if (local113 > 65535) {
					local113 = 65535;
				}
				local59 = local34 * (arg0 >> 8 & 0xFF);
				if (local59 > 65535) {
					local59 = 65535;
				}
				@Pc(139) int local139 = (arg0 & 0xFF) * local34;
				if (local139 > 65535) {
					local139 = 65535;
				}
				arg0 = (local139 >> 8) + (local59 & 0xFF00) + ((local113 & 0x1500FF00) << 8);
			}
		}
		if (arg2 != 1.0F) {
			@Pc(172) int local172 = arg0 >> 16 & 0xFF;
			local18 = arg0 >> 8 & 0xFF;
			local172 = (int) ((float) local172 * arg2);
			local34 = arg0 & 0xFF;
			if (local172 < 0) {
				local172 = 0;
			} else if (local172 > 255) {
				local172 = 255;
			}
			local18 = (int) ((float) local18 * arg2);
			local34 = (int) ((float) local34 * arg2);
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			arg0 = local172 << 16 | local18 << 8 | local34;
		}
		this.aNativeStream1.a(arg3 * 4);
		this.aNativeStream1.b((byte) (arg0 >> 16));
		this.aNativeStream1.b((byte) (arg0 >> 8));
		this.aNativeStream1.b((byte) arg0);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IB)V")
	public void method5888(@OriginalArg(0) int arg0) {
		this.aNativeBuffer4 = this.aClass34_Sub2_42.aNativeHeap2.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer4);
	}
}

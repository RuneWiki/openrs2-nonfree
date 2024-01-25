import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pga")
public final class Class3_Sub34 extends Class3 {

	@OriginalMember(owner = "client!pga", name = "k", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!pga", name = "n", descriptor = "Lclient!qe;")
	private Class270 aClass270_12;

	@OriginalMember(owner = "client!pga", name = "x", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!pga", name = "q", descriptor = "Lclient!qh;")
	private final Class274_Sub1 aClass274_Sub1_3;

	@OriginalMember(owner = "client!pga", name = "o", descriptor = "[I")
	private final int[] anIntArray487;

	@OriginalMember(owner = "client!pga", name = "p", descriptor = "I")
	public final int anInt7878;

	@OriginalMember(owner = "client!pga", name = "B", descriptor = "I")
	public final int anInt7887;

	@OriginalMember(owner = "client!pga", name = "s", descriptor = "I")
	public final int anInt7880;

	@OriginalMember(owner = "client!pga", name = "l", descriptor = "Lclient!eq;")
	private final Class33_Sub3 aClass33_Sub3_33;

	@OriginalMember(owner = "client!pga", name = "j", descriptor = "F")
	public final float aFloat217;

	@OriginalMember(owner = "client!pga", name = "t", descriptor = "I")
	public final int anInt7881;

	@OriginalMember(owner = "client!pga", name = "u", descriptor = "Lclient!dn;")
	private final Class66_Sub1 aClass66_Sub1_2;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lclient!qh;IIIII)V")
	public Class3_Sub34(@OriginalArg(0) Class274_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass274_Sub1_3 = arg0;
		this.anIntArray487 = new int[this.aClass274_Sub1_3.anInt9726 * this.aClass274_Sub1_3.anInt9723];
		this.anInt7878 = arg5;
		this.anInt7887 = arg3;
		this.anInt7880 = arg4;
		this.aClass33_Sub3_33 = this.aClass274_Sub1_3.aClass33_Sub3_34;
		this.aFloat217 = arg2;
		this.anInt7881 = arg1;
		this.aClass66_Sub1_2 = new Class66_Sub1(this.aClass33_Sub3_33, 5123, null, 1);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IZ)V")
	public void method6590(@OriginalArg(0) int arg0) {
		this.aStream7.f(arg0 * 4 + 3);
		this.aStream7.c(-1);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZIII)V")
	public void method6591(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray487[arg1 * this.aClass274_Sub1_3.anInt9726 + arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(FZIII)V")
	public void method6592(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(23) int local23;
		@Pc(44) int local44;
		if (this.anInt7881 != -1) {
			@Pc(18) Class156 local18 = this.aClass33_Sub3_33.anInterface5_11.method6869(this.anInt7881);
			local23 = local18.aByte71 & 0xFF;
			@Pc(68) int local68;
			if (local23 != 0 && local18.aByte69 != 4) {
				if (arg3 < 0) {
					local44 = 0;
				} else if (arg3 > 127) {
					local44 = 16777215;
				} else {
					local44 = arg3 * 131586;
				}
				if (local23 == 256) {
					arg1 = local44;
				} else {
					local68 = 256 - local23;
					arg1 = ((arg1 & 0xFF00) * local68 + (local44 & 0xFF00) * local23 & 0xFF0000) + ((local44 & 0xFF00FF) * local23 + (arg1 & 0xFF00FF) * local68 & 0xFF00FF00) >> 8;
				}
			}
			local44 = local18.aByte74 & 0xFF;
			if (local44 != 0) {
				local44 += 256;
				@Pc(114) int local114 = local44 * (arg1 >> 16 & 0xFF);
				if (local114 > 65535) {
					local114 = 65535;
				}
				local68 = local44 * (arg1 >> 8 & 0xFF);
				if (local68 > 65535) {
					local68 = 65535;
				}
				@Pc(138) int local138 = local44 * (arg1 & 0xFF);
				if (local138 > 65535) {
					local138 = 65535;
				}
				arg1 = (local138 >> 8) + ((local114 & 0xB800FF00) << 8) + (local68 & 0xFF00);
			}
		}
		if (arg0 != 1.0F) {
			@Pc(170) int local170 = arg1 >> 16 & 0xFF;
			local23 = arg1 >> 8 & 0xFF;
			local170 = (int) ((float) local170 * arg0);
			local44 = arg1 & 0xFF;
			if (local170 < 0) {
				local170 = 0;
			} else if (local170 > 255) {
				local170 = 255;
			}
			local23 = (int) ((float) local23 * arg0);
			local44 = (int) ((float) local44 * arg0);
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			if (local44 < 0) {
				local44 = 0;
			} else if (local44 > 255) {
				local44 = 255;
			}
			arg1 = local44 | local23 << 8 | local170 << 16;
		}
		this.aStream7.f(arg2 * 4);
		this.aStream7.c((byte) (arg1 >> 16));
		this.aStream7.c((byte) (arg1 >> 8));
		this.aStream7.c((byte) arg1);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(II)V")
	public void method6594(@OriginalArg(0) int arg0) {
		this.aStream7.a();
		@Pc(18) Interface27 local18 = this.aClass33_Sub3_33.method3036(4, arg0 * 4, this.aNativeHeapBuffer7);
		this.aClass270_12 = new Class270(local18, 5121, 4, 0);
		this.aStream7 = null;
		this.aNativeHeapBuffer7 = null;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(II[I)V")
	public void method6595(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class3_Sub15_Sub2 local11 = this.aClass33_Sub3_33.aClass3_Sub15_Sub2_2;
		local11.anInt10282 = 0;
		@Pc(37) short[] local37;
		@Pc(26) int local26;
		@Pc(31) int local31;
		@Pc(20) int local20;
		@Pc(46) int local46;
		@Pc(48) int local48;
		if (this.aClass33_Sub3_33.aBoolean264) {
			for (local20 = 0; local20 < arg0; local20++) {
				local26 = arg1[local20];
				local31 = this.anIntArray487[local26];
				local37 = this.aClass274_Sub1_3.aShortArrayArray19[local26];
				if (local31 != 0 && local37 != null) {
					local46 = 0;
					local48 = 0;
					while (local37.length > local48) {
						if ((0x1 << local46++ & local31) == 0) {
							local48 += 3;
						} else {
							local7++;
							local11.method8464(local37[local48++] & 0xFFFF);
							local11.method8464(local37[local48++] & 0xFFFF);
							local7++;
							local7++;
							local11.method8464(local37[local48++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local20 = 0; local20 < arg0; local20++) {
				local26 = arg1[local20];
				local37 = this.aClass274_Sub1_3.aShortArrayArray19[local26];
				local31 = this.anIntArray487[local26];
				if (local31 != 0 && local37 != null) {
					local46 = 0;
					local48 = 0;
					while (local48 < local37.length) {
						if ((local31 & 0x1 << local46++) == 0) {
							local48 += 3;
						} else {
							local7++;
							local11.method8405(local37[local48++] & 0xFFFF);
							local11.method8405(local37[local48++] & 0xFFFF);
							local7++;
							local7++;
							local11.method8405(local37[local48++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass66_Sub1_2.method3814(local11.aByteArray106, local11.anInt10282);
		this.aClass33_Sub3_33.method3073(this.aClass274_Sub1_3.aClass270_15, this.aClass274_Sub1_3.aClass270_14, this.aClass270_12, this.aClass274_Sub1_3.aClass270_13);
		this.aClass33_Sub3_33.method3029(this.anInt7881, (this.aClass274_Sub1_3.anInt8325 & 0x8) != 0, (this.aClass274_Sub1_3.anInt8325 & 0x7) != 0);
		if (this.aClass33_Sub3_33.aBoolean269) {
			this.aClass33_Sub3_33.EA(Integer.MAX_VALUE, this.anInt7887, this.anInt7880, this.anInt7878);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat217, 1.0F / this.aFloat217, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass33_Sub3_33.method3073(this.aClass274_Sub1_3.aClass270_15, this.aClass274_Sub1_3.aClass270_14, this.aClass270_12, this.aClass274_Sub1_3.aClass270_13);
		this.aClass33_Sub3_33.method3075(local7, 0, this.aClass66_Sub1_2);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(IZ)V")
	public void method6596(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer7 = this.aClass33_Sub3_33.aNativeHeap5.a(arg0 * 4, true);
		this.aStream7 = new Stream(this.aNativeHeapBuffer7);
	}
}

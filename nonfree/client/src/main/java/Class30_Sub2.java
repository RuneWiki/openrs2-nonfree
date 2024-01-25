import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.ica;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class30_Sub2 extends Class30 implements Interface6 {

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "Z")
	public boolean aBoolean216;

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "Z")
	public boolean aBoolean217;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
	private final int anInt3008;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
	private final int anInt3007;

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!tga;Lclient!nh;Lclient!jr;II)V")
	public Class30_Sub2(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) Class161 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass14_Sub2_Sub2_6.aBoolean627) {
			this.anInt3008 = arg3;
			this.anInt3007 = arg4;
		} else {
			this.anInt3008 = Static253.method4296(arg3);
			this.anInt3007 = Static253.method4296(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass14_Sub2_Sub2_6.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static506.method7048(this.aClass161_19, this.aClass219_13), 1);
	}

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!tga;IIZ[III)V")
	public Class30_Sub2(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static122.aClass219_7, Static239.aClass161_12, arg3 && arg0.aBoolean626, arg2 * arg1);
		if (this.aClass14_Sub2_Sub2_6.aBoolean627) {
			this.anInt3007 = arg2;
			this.anInt3008 = arg1;
		} else {
			this.anInt3008 = Static253.method4296(arg1);
			this.anInt3007 = Static253.method4296(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass14_Sub2_Sub2_6.anIDirect3DDevice1.a(this.anInt3008, this.anInt3007, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass14_Sub2_Sub2_6.anIDirect3DDevice1.a(this.anInt3008, this.anInt3007, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass14_Sub2_Sub2_6.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (ica.b(14528, local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(95) int local95 = local71.getRowPitch();
			if (local95 == arg1 * 4 && arg1 == arg6) {
				local71.b(arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(114) int local114 = 0; local114 < arg2; local114++) {
					local71.b(arg4, arg6 * local114 + arg5, local114 * local95, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!tga;Lclient!nh;IIZ[BII)V")
	public Class30_Sub2(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static239.aClass161_12, arg4 && arg0.aBoolean626, arg3 * arg2);
		if (this.aClass14_Sub2_Sub2_6.aBoolean627) {
			this.anInt3008 = arg2;
			this.anInt3007 = arg3;
		} else {
			this.anInt3008 = Static253.method4296(arg2);
			this.anInt3007 = Static253.method4296(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass14_Sub2_Sub2_6.anIDirect3DDevice1.a(this.anInt3008, this.anInt3007, 0, 1024, Static506.method7048(Static239.aClass161_12, this.aClass219_13), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass14_Sub2_Sub2_6.anIDirect3DDevice1.a(this.anInt3008, this.anInt3007, 1, 0, Static506.method7048(Static239.aClass161_12, this.aClass219_13), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass14_Sub2_Sub2_6.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (ica.b(14528, local90)) {
			@Pc(108) int local108 = arg2 * this.aClass219_13.anInt6139;
			@Pc(114) int local114 = arg2 * this.aClass219_13.anInt6139;
			@Pc(117) int local117 = local79.getRowPitch();
			if (local117 == local114 && local108 == local114) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local114);
			} else {
				for (@Pc(138) int local138 = 0; local138 < arg3; local138++) {
					local79.a(arg5, arg6 + local108 * local138, local117 * local138, local114);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6779() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIZIILclient!nh;I[B)V")
	@Override
	public void method7602(@OriginalArg(1) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) Class219 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) byte[] arg4) {
		if (this.aClass219_13 != arg2 || Static239.aClass161_12 != this.aClass161_19) {
			throw new RuntimeException();
		}
		@Pc(21) PixelBuffer local21 = this.aClass14_Sub2_Sub2_6.aPixelBuffer1;
		@Pc(32) int local32 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg0, arg1, 0, local21);
		if (!ica.b(14528, local32)) {
			return;
		}
		@Pc(43) int local43 = arg3 * this.aClass219_13.anInt6139;
		@Pc(49) int local49 = arg0 * this.aClass219_13.anInt6139;
		@Pc(52) int local52 = local21.getRowPitch();
		if (local49 == local52 && local49 == local43) {
			local21.a((byte[]) arg4, 0, 0, arg1 * local49);
		} else {
			for (@Pc(77) int local77 = 0; local77 < arg1; local77++) {
				local21.a(arg4, local43 * local77, local77 * local52, local49);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([IIIIIIII)V")
	@Override
	public void method7603(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (this.aClass219_13 != Static122.aClass219_7 || Static239.aClass161_12 != this.aClass161_19) {
			throw new RuntimeException();
		}
		@Pc(23) PixelBuffer local23 = this.aClass14_Sub2_Sub2_6.aPixelBuffer1;
		@Pc(34) int local34 = this.anIDirect3DTexture1.LockRect(0, arg5, arg3, arg2, arg1, 0, local23);
		if (!ica.b(14528, local34)) {
			return;
		}
		@Pc(41) int local41 = local23.getRowPitch();
		if (local41 == arg2 * 4 && arg4 == arg2) {
			local23.b(arg0, 0, 0, arg1 * arg2);
		} else {
			for (@Pc(55) int local55 = 0; local55 < arg1; local55++) {
				local23.b(arg0, arg4 * local55, local41 * local55, arg2);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)I")
	@Override
	public int method7599() {
		return this.anInt3007;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)I")
	@Override
	public int method7605() {
		return this.anInt3008;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7601() {
		return true;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(FI)F")
	@Override
	public float method7600(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt3007;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method7606(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean216 = arg0;
		this.aBoolean217 = arg1;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
	@Override
	public void method7586() {
		this.aClass14_Sub2_Sub2_6.method7044(this);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BF)F")
	@Override
	public float method7604(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt3008;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!ju;)V")
	@Override
	public void method7587(@OriginalArg(1) Class164 arg0) {
		super.method7587(arg0);
	}
}

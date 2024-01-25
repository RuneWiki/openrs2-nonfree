import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.sw;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class1_Sub1 extends Class1 implements Interface14 {

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Z")
	public boolean aBoolean6;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Z")
	public boolean aBoolean7;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	private final int anInt33;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
	private final int anInt32;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!mba;Lclient!pw;IIZ[BII)V")
	public Class1_Sub1(@OriginalArg(0) Class15_Sub2_Sub2 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static302.aClass200_11, arg4 && arg0.aBoolean566, arg2 * arg3);
		if (this.aClass15_Sub2_Sub2_8.aBoolean567) {
			this.anInt32 = arg3;
			this.anInt33 = arg2;
		} else {
			this.anInt33 = Static178.method3152(arg2);
			this.anInt32 = Static178.method3152(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass15_Sub2_Sub2_8.anIDirect3DDevice1.a(this.anInt33, this.anInt32, 0, 1024, Static315.method5502(this.aClass261_12, Static302.aClass200_11), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass15_Sub2_Sub2_8.anIDirect3DDevice1.a(this.anInt33, this.anInt32, 1, 0, Static315.method5502(this.aClass261_12, Static302.aClass200_11), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass15_Sub2_Sub2_8.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (sw.a((byte) -58, local90)) {
			@Pc(104) int local104 = arg2 * this.aClass261_12.anInt8160;
			@Pc(110) int local110 = arg2 * this.aClass261_12.anInt8160;
			@Pc(113) int local113 = local79.getRowPitch();
			if (local113 == local110 && local104 == local110) {
				local79.a((byte[]) arg5, arg6, 0, local110 * arg3);
			} else {
				for (@Pc(134) int local134 = 0; local134 < arg3; local134++) {
					local79.a(arg5, arg6 + local134 * local104, local113 * local134, local110);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!mba;IIZ[III)V")
	public Class1_Sub1(@OriginalArg(0) Class15_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static492.aClass261_14, Static302.aClass200_11, arg3 && arg0.aBoolean566, arg1 * arg2);
		if (this.aClass15_Sub2_Sub2_8.aBoolean567) {
			this.anInt33 = arg1;
			this.anInt32 = arg2;
		} else {
			this.anInt33 = Static178.method3152(arg1);
			this.anInt32 = Static178.method3152(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass15_Sub2_Sub2_8.anIDirect3DDevice1.a(this.anInt33, this.anInt32, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass15_Sub2_Sub2_8.anIDirect3DDevice1.a(this.anInt33, this.anInt32, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass15_Sub2_Sub2_8.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (sw.a((byte) -58, local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(98) int local98 = local71.getRowPitch();
			if (local98 == arg1 * 4 && arg1 == arg6) {
				local71.a((int[]) arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(121) int local121 = 0; local121 < arg2; local121++) {
					local71.a(arg4, arg5 + arg6 * local121, local98 * local121, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!mba;Lclient!pw;Lclient!lj;II)V")
	public Class1_Sub1(@OriginalArg(0) Class15_Sub2_Sub2 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) Class200 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass15_Sub2_Sub2_8.aBoolean567) {
			this.anInt33 = arg3;
			this.anInt32 = arg4;
		} else {
			this.anInt33 = Static178.method3152(arg3);
			this.anInt32 = Static178.method3152(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass15_Sub2_Sub2_8.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static315.method5502(this.aClass261_12, this.aClass200_18), 1);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!gv;I)V")
	@Override
	public void method8222(@OriginalArg(0) Class130 arg0) {
		super.method8222(arg0);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "([IIBIIIII)V")
	@Override
	public void method8237(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (Static492.aClass261_14 != this.aClass261_12 || this.aClass200_18 != Static302.aClass200_11) {
			throw new RuntimeException();
		}
		@Pc(23) PixelBuffer local23 = this.aClass15_Sub2_Sub2_8.aPixelBuffer1;
		@Pc(34) int local34 = this.anIDirect3DTexture1.LockRect(0, arg4, arg1, arg2, arg3, 0, local23);
		if (!sw.a((byte) -58, local34)) {
			return;
		}
		@Pc(41) int local41 = local23.getRowPitch();
		if (arg2 * 4 == local41 && arg5 == arg2) {
			local23.a((int[]) arg0, 0, 0, arg2 * arg3);
		} else {
			for (@Pc(68) int local68 = 0; local68 < arg3; local68++) {
				local23.a(arg0, arg5 * local68, local41 * local68, arg2);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(FB)F")
	@Override
	public float method8242(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt32;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IF)F")
	@Override
	public float method8239(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt33;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method8238(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean6 = arg1;
		this.aBoolean7 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)I")
	@Override
	public int method8235() {
		return this.anInt33;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)I")
	@Override
	public int method8236() {
		return this.anInt32;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8240() {
		return true;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	@Override
	public void method8223() {
		this.aClass15_Sub2_Sub2_8.method5494(this);
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6928() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!pw;I[BIIIII)V")
	@Override
	public void method8241(@OriginalArg(0) int arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(7) int arg4) {
		if (arg1 != this.aClass261_12 || this.aClass200_18 != Static302.aClass200_11) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass15_Sub2_Sub2_8.aPixelBuffer1;
		@Pc(30) int local30 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg0, 0, local15);
		if (!sw.a((byte) -58, local30)) {
			return;
		}
		@Pc(40) int local40 = arg2 * this.aClass261_12.anInt8160;
		@Pc(46) int local46 = arg4 * this.aClass261_12.anInt8160;
		@Pc(49) int local49 = local15.getRowPitch();
		if (local40 == local49 && local46 == local40) {
			local15.a((byte[]) arg3, 0, 0, local40 * arg0);
		} else {
			for (@Pc(61) int local61 = 0; local61 < arg0; local61++) {
				local15.a(arg3, local46 * local61, local49 * local61, local40);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}
}

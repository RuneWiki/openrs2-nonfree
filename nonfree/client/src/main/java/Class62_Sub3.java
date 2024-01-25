import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.hl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class62_Sub3 extends Class62 implements Interface6 {

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "Z")
	public boolean aBoolean695;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "Z")
	public boolean aBoolean696;

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
	private final int anInt9906;

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
	private final int anInt9907;

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!kaa;Lclient!fca;IIZ[BII)V")
	public Class62_Sub3(@OriginalArg(0) Class44_Sub2_Sub2 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static53.aClass42_4, arg4 && arg0.aBoolean361, arg3 * arg2);
		if (this.aClass44_Sub2_Sub2_9.aBoolean358) {
			this.anInt9907 = arg3;
			this.anInt9906 = arg2;
		} else {
			this.anInt9906 = Static341.method5553(arg2);
			this.anInt9907 = Static341.method5553(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass44_Sub2_Sub2_9.anIDirect3DDevice1.a(this.anInt9906, this.anInt9907, 0, 1024, Static259.method4385(this.aClass97_53, Static53.aClass42_4), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass44_Sub2_Sub2_9.anIDirect3DDevice1.a(this.anInt9906, this.anInt9907, 1, 0, Static259.method4385(this.aClass97_53, Static53.aClass42_4), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass44_Sub2_Sub2_9.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (hl.a((byte) 118, local90)) {
			@Pc(109) int local109 = arg2 * this.aClass97_53.anInt2836;
			@Pc(115) int local115 = arg2 * this.aClass97_53.anInt2836;
			@Pc(118) int local118 = local79.getRowPitch();
			if (local109 == local118 && local109 == local115) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local109);
			} else {
				for (@Pc(135) int local135 = 0; local135 < arg3; local135++) {
					local79.a(arg5, arg6 + local135 * local115, local135 * local118, local109);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!kaa;Lclient!fca;Lclient!bv;II)V")
	public Class62_Sub3(@OriginalArg(0) Class44_Sub2_Sub2 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass44_Sub2_Sub2_9.aBoolean358) {
			this.anInt9907 = arg4;
			this.anInt9906 = arg3;
		} else {
			this.anInt9906 = Static341.method5553(arg3);
			this.anInt9907 = Static341.method5553(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass44_Sub2_Sub2_9.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static259.method4385(this.aClass97_53, this.aClass42_19), 1);
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!kaa;IIZ[III)V")
	public Class62_Sub3(@OriginalArg(0) Class44_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static7.aClass97_5, Static53.aClass42_4, arg3 && arg0.aBoolean361, arg2 * arg1);
		if (this.aClass44_Sub2_Sub2_9.aBoolean358) {
			this.anInt9907 = arg2;
			this.anInt9906 = arg1;
		} else {
			this.anInt9906 = Static341.method5553(arg1);
			this.anInt9907 = Static341.method5553(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass44_Sub2_Sub2_9.anIDirect3DDevice1.a(this.anInt9906, this.anInt9907, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass44_Sub2_Sub2_9.anIDirect3DDevice1.a(this.anInt9906, this.anInt9907, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass44_Sub2_Sub2_9.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (hl.a((byte) 1, local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(96) int local96 = local71.getRowPitch();
			if (arg1 * 4 == local96 && arg6 == arg1) {
				local71.b(arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(119) int local119 = 0; local119 < arg2; local119++) {
					local71.b(arg4, arg5 + local119 * arg6, local96 * local119, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8283() {
		return true;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method8281(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean696 = arg1;
		this.aBoolean695 = arg0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIII[IIII)V")
	@Override
	public void method8287(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aClass97_53 != Static7.aClass97_5 || Static53.aClass42_4 != this.aClass42_19) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass44_Sub2_Sub2_9.aPixelBuffer1;
		@Pc(34) int local34 = this.anIDirect3DTexture1.LockRect(0, arg1, arg4, arg2, arg0, 0, local15);
		if (!hl.a((byte) 119, local34)) {
			return;
		}
		@Pc(41) int local41 = local15.getRowPitch();
		if (local41 == arg2 * 4 && arg2 == arg5) {
			local15.b(arg3, 0, 0, arg0 * arg2);
		} else {
			for (@Pc(55) int local55 = 0; local55 < arg0; local55++) {
				local15.b(arg3, local55 * arg5, local41 * local55, arg2);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	@Override
	public void method8267() {
		this.aClass44_Sub2_Sub2_9.method4378(this);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)I")
	@Override
	public int method8288() {
		return this.anInt9907;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZIIIIIILclient!fca;[B)V")
	@Override
	public void method8286(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(7) Class97 arg3, @OriginalArg(8) byte[] arg4) {
		if (this.aClass97_53 != arg3 || Static53.aClass42_4 != this.aClass42_19) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass44_Sub2_Sub2_9.aPixelBuffer1;
		@Pc(27) int local27 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg1, 0, local16);
		if (!hl.a((byte) 122, local27)) {
			return;
		}
		@Pc(37) int local37 = arg0 * this.aClass97_53.anInt2836;
		@Pc(43) int local43 = arg2 * this.aClass97_53.anInt2836;
		@Pc(46) int local46 = local16.getRowPitch();
		if (local43 == local46 && local43 == local37) {
			local16.a((byte[]) arg4, 0, 0, local43 * arg1);
		} else {
			for (@Pc(54) int local54 = 0; local54 < arg1; local54++) {
				local16.a(arg4, local54 * local37, local46 * local54, local43);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IF)F")
	@Override
	public float method8282(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt9906;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(FI)F")
	@Override
	public float method8285(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt9907;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!fw;)V")
	@Override
	public void method8268(@OriginalArg(1) Class110 arg0) {
		super.method8268(arg0);
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8082() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)I")
	@Override
	public int method8284() {
		return this.anInt9906;
	}
}

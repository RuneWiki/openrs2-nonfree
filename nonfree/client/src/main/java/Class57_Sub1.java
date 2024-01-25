import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.vba;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class57_Sub1 extends Class57 implements Interface7 {

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "Z")
	public boolean aBoolean87;

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "Z")
	public boolean aBoolean88;

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
	private final int anInt1196;

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
	private final int anInt1195;

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!vg;IIZ[III)V")
	public Class57_Sub1(@OriginalArg(0) Class90_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static493.aClass171_15, Static407.aClass254_14, arg3 && arg0.aBoolean653, arg1 * arg2);
		if (this.aClass90_Sub3_Sub2_6.aBoolean650) {
			this.anInt1196 = arg2;
			this.anInt1195 = arg1;
		} else {
			this.anInt1195 = Static14.method5936(arg1);
			this.anInt1196 = Static14.method5936(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass90_Sub3_Sub2_6.anIDirect3DDevice1.a(this.anInt1195, this.anInt1196, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass90_Sub3_Sub2_6.anIDirect3DDevice1.a(this.anInt1195, this.anInt1196, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass90_Sub3_Sub2_6.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (vba.a(-1, (int) local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(98) int local98 = local71.getRowPitch();
			if (arg1 * 4 == local98 && arg6 == arg1) {
				local71.a((int[]) arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(125) int local125 = 0; local125 < arg2; local125++) {
					local71.a(arg4, arg6 * local125 + arg5, local98 * local125, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!vg;Lclient!kf;IIZ[BII)V")
	public Class57_Sub1(@OriginalArg(0) Class90_Sub3_Sub2 arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static407.aClass254_14, arg4 && arg0.aBoolean653, arg3 * arg2);
		if (this.aClass90_Sub3_Sub2_6.aBoolean650) {
			this.anInt1196 = arg3;
			this.anInt1195 = arg2;
		} else {
			this.anInt1195 = Static14.method5936(arg2);
			this.anInt1196 = Static14.method5936(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass90_Sub3_Sub2_6.anIDirect3DDevice1.a(this.anInt1195, this.anInt1196, 0, 1024, Static549.method7672(Static407.aClass254_14, this.aClass171_13), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass90_Sub3_Sub2_6.anIDirect3DDevice1.a(this.anInt1195, this.anInt1196, 1, 0, Static549.method7672(Static407.aClass254_14, this.aClass171_13), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass90_Sub3_Sub2_6.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (vba.a(-1, (int) local90)) {
			@Pc(104) int local104 = arg2 * this.aClass171_13.anInt4736;
			@Pc(110) int local110 = arg2 * this.aClass171_13.anInt4736;
			@Pc(113) int local113 = local79.getRowPitch();
			if (local113 == local104 && local110 == local104) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local104);
			} else {
				for (@Pc(130) int local130 = 0; local130 < arg3; local130++) {
					local79.a(arg5, local130 * local110 + arg6, local113 * local130, local104);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!vg;Lclient!kf;Lclient!ps;II)V")
	public Class57_Sub1(@OriginalArg(0) Class90_Sub3_Sub2 arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass90_Sub3_Sub2_6.aBoolean650) {
			this.anInt1195 = arg3;
			this.anInt1196 = arg4;
		} else {
			this.anInt1195 = Static14.method5936(arg3);
			this.anInt1196 = Static14.method5936(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass90_Sub3_Sub2_6.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static549.method7672(this.aClass254_10, this.aClass171_13), 1);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIII[III)V")
	@Override
	public void method7048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		if (Static493.aClass171_15 != this.aClass171_13 || Static407.aClass254_14 != this.aClass254_10) {
			throw new RuntimeException();
		}
		@Pc(23) PixelBuffer local23 = this.aClass90_Sub3_Sub2_6.aPixelBuffer1;
		@Pc(34) int local34 = this.anIDirect3DTexture1.LockRect(0, arg0, arg2, arg1, arg5, 0, local23);
		if (!vba.a(-1, (int) local34)) {
			return;
		}
		@Pc(41) int local41 = local23.getRowPitch();
		if (local41 == arg1 * 4 && arg3 == arg1) {
			local23.a((int[]) arg4, 0, 0, arg1 * arg5);
		} else {
			for (@Pc(51) int local51 = 0; local51 < arg5; local51++) {
				local23.a(arg4, arg3 * local51, local51 * local41, arg1);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method5363() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLclient!qaa;)V")
	@Override
	public void method7034(@OriginalArg(1) Class257 arg0) {
		super.method7034(arg0);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(FB)F")
	@Override
	public float method7053(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1196;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "([BIIILclient!kf;ZIII)V")
	@Override
	public void method7050(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class171 arg3, @OriginalArg(8) int arg4) {
		if (this.aClass171_13 != arg3 || this.aClass254_10 != Static407.aClass254_14) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass90_Sub3_Sub2_6.aPixelBuffer1;
		@Pc(31) int local31 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local16);
		if (!vba.a(-1, (int) local31)) {
			return;
		}
		@Pc(41) int local41 = arg4 * this.aClass171_13.anInt4736;
		@Pc(47) int local47 = arg1 * this.aClass171_13.anInt4736;
		@Pc(50) int local50 = local16.getRowPitch();
		if (local47 == local50 && local41 == local47) {
			local16.a((byte[]) arg0, 0, 0, local47 * arg2);
		} else {
			for (@Pc(75) int local75 = 0; local75 < arg2; local75++) {
				local16.a(arg0, local75 * local41, local50 * local75, local47);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
	@Override
	public void method7033() {
		this.aClass90_Sub3_Sub2_6.method7664(this);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)I")
	@Override
	public int method7049() {
		return this.anInt1196;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7051() {
		return true;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method7047(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean88 = arg0;
		this.aBoolean87 = arg1;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(FI)F")
	@Override
	public float method7052(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1195;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)I")
	@Override
	public int method7046() {
		return this.anInt1195;
	}
}

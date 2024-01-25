import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.te;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class25_Sub3 extends Class25 implements Interface20 {

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "Z")
	public boolean aBoolean644;

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "Z")
	public boolean aBoolean645;

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
	private final int anInt9215;

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
	private final int anInt9214;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!ui;Lclient!nl;Lclient!eea;II)V")
	public Class25_Sub3(@OriginalArg(0) Class121_Sub2_Sub2 arg0, @OriginalArg(1) Class214 arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass121_Sub2_Sub2_8.aBoolean629) {
			this.anInt9215 = arg3;
			this.anInt9214 = arg4;
		} else {
			this.anInt9215 = Static516.method7313(arg3);
			this.anInt9214 = Static516.method7313(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass121_Sub2_Sub2_8.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static515.method7305(this.aClass82_20, this.aClass214_15), 1);
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!ui;IIZ[III)V")
	public Class25_Sub3(@OriginalArg(0) Class121_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static255.aClass214_8, Static108.aClass82_8, arg3 && arg0.aBoolean630, arg2 * arg1);
		if (this.aClass121_Sub2_Sub2_8.aBoolean629) {
			this.anInt9214 = arg2;
			this.anInt9215 = arg1;
		} else {
			this.anInt9215 = Static516.method7313(arg1);
			this.anInt9214 = Static516.method7313(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass121_Sub2_Sub2_8.anIDirect3DDevice1.a(this.anInt9215, this.anInt9214, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass121_Sub2_Sub2_8.anIDirect3DDevice1.a(this.anInt9215, this.anInt9214, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass121_Sub2_Sub2_8.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (te.a(2005530599, local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(97) int local97 = local71.getRowPitch();
			if (local97 == arg1 * 4 && arg1 == arg6) {
				local71.a((int[]) arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(120) int local120 = 0; local120 < arg2; local120++) {
					local71.a(arg4, local120 * arg6 + arg5, local120 * local97, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!ui;Lclient!nl;IIZ[BII)V")
	public Class25_Sub3(@OriginalArg(0) Class121_Sub2_Sub2 arg0, @OriginalArg(1) Class214 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static108.aClass82_8, arg4 && arg0.aBoolean630, arg2 * arg3);
		if (this.aClass121_Sub2_Sub2_8.aBoolean629) {
			this.anInt9215 = arg2;
			this.anInt9214 = arg3;
		} else {
			this.anInt9215 = Static516.method7313(arg2);
			this.anInt9214 = Static516.method7313(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass121_Sub2_Sub2_8.anIDirect3DDevice1.a(this.anInt9215, this.anInt9214, 0, 1024, Static515.method7305(Static108.aClass82_8, this.aClass214_15), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass121_Sub2_Sub2_8.anIDirect3DDevice1.a(this.anInt9215, this.anInt9214, 1, 0, Static515.method7305(Static108.aClass82_8, this.aClass214_15), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass121_Sub2_Sub2_8.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (te.a(2005530599, local90)) {
			@Pc(104) int local104 = arg2 * this.aClass214_15.anInt5985;
			@Pc(110) int local110 = arg2 * this.aClass214_15.anInt5985;
			@Pc(113) int local113 = local79.getRowPitch();
			if (local113 == local104 && local104 == local110) {
				local79.a((byte[]) arg5, arg6, 0, local104 * arg3);
			} else {
				for (@Pc(125) int local125 = 0; local125 < arg3; local125++) {
					local79.a(arg5, arg6 + local125 * local110, local125 * local113, local104);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	@Override
	public void method7528() {
		this.aClass121_Sub2_Sub2_8.method7308(this);
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)I")
	@Override
	public int method7536() {
		return this.anInt9215;
	}

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7526() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)I")
	@Override
	public int method7530() {
		return this.anInt9214;
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7535() {
		return true;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IF)F")
	@Override
	public float method7534(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt9215;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZBZ)V")
	@Override
	public void method7531(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean645 = arg1;
		this.aBoolean644 = arg0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(FI)F")
	@Override
	public float method7533(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt9214;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIII[IIII)V")
	@Override
	public void method7529(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (this.aClass214_15 != Static255.aClass214_8 || Static108.aClass82_8 != this.aClass82_20) {
			throw new RuntimeException();
		}
		@Pc(22) PixelBuffer local22 = this.aClass121_Sub2_Sub2_8.aPixelBuffer1;
		@Pc(33) int local33 = this.anIDirect3DTexture1.LockRect(0, arg4, arg1, arg5, arg3, 0, local22);
		if (!te.a(2005530599, local33)) {
			return;
		}
		@Pc(41) int local41 = local22.getRowPitch();
		if (arg5 * 4 == local41 && arg0 == arg5) {
			local22.a((int[]) arg2, 0, 0, arg3 * arg5);
		} else {
			for (@Pc(64) int local64 = 0; local64 < arg3; local64++) {
				local22.a(arg2, local64 * arg0, local64 * local41, arg5);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!td;B)V")
	@Override
	public void method7527(@OriginalArg(0) Class301 arg0) {
		super.method7527(arg0);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!nl;IB[BIIIII)V")
	@Override
	public void method7532(@OriginalArg(0) Class214 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		if (this.aClass214_15 != arg0 || Static108.aClass82_8 != this.aClass82_20) {
			throw new RuntimeException();
		}
		@Pc(23) PixelBuffer local23 = this.aClass121_Sub2_Sub2_8.aPixelBuffer1;
		@Pc(34) int local34 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg3, arg1, 0, local23);
		if (!te.a(2005530599, local34)) {
			return;
		}
		@Pc(44) int local44 = arg3 * this.aClass214_15.anInt5985;
		@Pc(50) int local50 = arg4 * this.aClass214_15.anInt5985;
		@Pc(53) int local53 = local23.getRowPitch();
		if (local53 == local44 && local50 == local44) {
			local23.a((byte[]) arg2, 0, 0, local44 * arg1);
		} else {
			for (@Pc(74) int local74 = 0; local74 < arg1; local74++) {
				local23.a(arg2, local74 * local50, local53 * local74, local44);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}
}

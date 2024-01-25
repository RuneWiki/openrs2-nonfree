import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.bea;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class65_Sub1 extends Class65 implements Interface14 {

	@OriginalMember(owner = "client!db", name = "g", descriptor = "Z")
	public boolean aBoolean115;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Z")
	public boolean aBoolean116;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "I")
	private final int anInt1468;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "I")
	private final int anInt1467;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!tb;Lclient!lca;Lclient!ig;II)V")
	public Class65_Sub1(@OriginalArg(0) Class134_Sub1_Sub2 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) Class155 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass134_Sub1_Sub2_7.aBoolean653) {
			this.anInt1468 = arg3;
			this.anInt1467 = arg4;
		} else {
			this.anInt1468 = Static457.method6299(arg3);
			this.anInt1467 = Static457.method6299(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass134_Sub1_Sub2_7.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static491.method6865(this.aClass155_19, this.aClass203_13), 1);
	}

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!tb;Lclient!lca;IIZ[BII)V")
	public Class65_Sub1(@OriginalArg(0) Class134_Sub1_Sub2 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static215.aClass155_10, arg4 && arg0.aBoolean656, arg3 * arg2);
		if (this.aClass134_Sub1_Sub2_7.aBoolean653) {
			this.anInt1468 = arg2;
			this.anInt1467 = arg3;
		} else {
			this.anInt1468 = Static457.method6299(arg2);
			this.anInt1467 = Static457.method6299(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass134_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt1468, this.anInt1467, 0, 1024, Static491.method6865(Static215.aClass155_10, this.aClass203_13), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass134_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt1468, this.anInt1467, 1, 0, Static491.method6865(Static215.aClass155_10, this.aClass203_13), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass134_Sub1_Sub2_7.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (bea.a(-115, local90)) {
			@Pc(107) int local107 = arg2 * this.aClass203_13.anInt5023;
			@Pc(113) int local113 = arg2 * this.aClass203_13.anInt5023;
			@Pc(116) int local116 = local79.getRowPitch();
			if (local116 == local107 && local107 == local113) {
				local79.a((byte[]) arg5, arg6, 0, local107 * arg3);
			} else {
				for (@Pc(124) int local124 = 0; local124 < arg3; local124++) {
					local79.a(arg5, arg6 + local113 * local124, local116 * local124, local107);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!tb;IIZ[III)V")
	public Class65_Sub1(@OriginalArg(0) Class134_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static129.aClass203_5, Static215.aClass155_10, arg3 && arg0.aBoolean656, arg2 * arg1);
		if (this.aClass134_Sub1_Sub2_7.aBoolean653) {
			this.anInt1468 = arg1;
			this.anInt1467 = arg2;
		} else {
			this.anInt1468 = Static457.method6299(arg1);
			this.anInt1467 = Static457.method6299(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass134_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt1468, this.anInt1467, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass134_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt1468, this.anInt1467, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass134_Sub1_Sub2_7.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (bea.a(105, local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(94) int local94 = local71.getRowPitch();
			if (local94 == arg1 * 4 && arg6 == arg1) {
				local71.a((int[]) arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(112) int local112 = 0; local112 < arg2; local112++) {
					local71.a(arg4, arg5 + local112 * arg6, local112 * local94, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!lca;IIZIIII[B)V")
	@Override
	public void method2131(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) byte[] arg4) {
		if (this.aClass203_13 != arg0 || this.aClass155_19 != Static215.aClass155_10) {
			throw new RuntimeException();
		}
		@Pc(23) PixelBuffer local23 = this.aClass134_Sub1_Sub2_7.aPixelBuffer1;
		@Pc(34) int local34 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg3, arg2, 0, local23);
		if (!bea.a(101, local34)) {
			return;
		}
		@Pc(44) int local44 = arg1 * this.aClass203_13.anInt5023;
		@Pc(50) int local50 = arg3 * this.aClass203_13.anInt5023;
		@Pc(53) int local53 = local23.getRowPitch();
		if (local53 == local50 && local50 == local44) {
			local23.a((byte[]) arg4, 0, 0, local50 * arg2);
		} else {
			for (@Pc(69) int local69 = 0; local69 < arg2; local69++) {
				local23.a(arg4, local44 * local69, local69 * local53, local50);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IBIII[III)V")
	@Override
	public void method2134(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static129.aClass203_5 != this.aClass203_13 || this.aClass155_19 != Static215.aClass155_10) {
			throw new RuntimeException();
		}
		@Pc(22) PixelBuffer local22 = this.aClass134_Sub1_Sub2_7.aPixelBuffer1;
		@Pc(33) int local33 = this.anIDirect3DTexture1.LockRect(0, arg1, arg4, arg0, arg5, 0, local22);
		if (!bea.a(-10, local33)) {
			return;
		}
		@Pc(40) int local40 = local22.getRowPitch();
		if (arg0 * 4 == local40 && arg2 == arg0) {
			local22.a((int[]) arg3, 0, 0, arg5 * arg0);
		} else {
			for (@Pc(63) int local63 = 0; local63 < arg5; local63++) {
				local22.a(arg3, arg2 * local63, local40 * local63, arg0);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)I")
	@Override
	public int method2132() {
		return this.anInt1468;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(FI)F")
	@Override
	public float method2128(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1468;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!gaa;I)V")
	@Override
	public void method5452(@OriginalArg(0) Class115 arg0) {
		super.method5452(arg0);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	@Override
	public void method5454() {
		this.aClass134_Sub1_Sub2_7.method6864(this);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BZZ)V")
	@Override
	public void method2130(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean115 = arg0;
		this.aBoolean116 = arg1;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZF)F")
	@Override
	public float method2133(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt1467;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method2129() {
		return true;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method5453() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)I")
	@Override
	public int method2135() {
		return this.anInt1467;
	}
}

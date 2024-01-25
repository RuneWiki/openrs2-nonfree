import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.fe;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kda")
public final class Class172_Sub1 extends Class172 implements Interface3 {

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "Z")
	public boolean aBoolean353;

	@OriginalMember(owner = "client!kda", name = "j", descriptor = "Z")
	public boolean aBoolean354;

	@OriginalMember(owner = "client!kda", name = "h", descriptor = "I")
	private final int anInt5088;

	@OriginalMember(owner = "client!kda", name = "i", descriptor = "I")
	private final int anInt5089;

	@OriginalMember(owner = "client!kda", name = "g", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lclient!de;Lclient!kl;Lclient!vt;II)V")
	public Class172_Sub1(@OriginalArg(0) Class62_Sub1_Sub1 arg0, @OriginalArg(1) Class174 arg1, @OriginalArg(2) Class306 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass62_Sub1_Sub1_8.aBoolean134) {
			this.anInt5088 = arg3;
			this.anInt5089 = arg4;
		} else {
			this.anInt5088 = Static179.method3071(arg3);
			this.anInt5089 = Static179.method3071(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass62_Sub1_Sub1_8.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static87.method1934(this.aClass174_13, this.aClass306_10), 1);
	}

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lclient!de;Lclient!kl;IIZ[BII)V")
	public Class172_Sub1(@OriginalArg(0) Class62_Sub1_Sub1 arg0, @OriginalArg(1) Class174 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static523.aClass306_15, arg4 && arg0.aBoolean135, arg2 * arg3);
		if (this.aClass62_Sub1_Sub1_8.aBoolean134) {
			this.anInt5088 = arg2;
			this.anInt5089 = arg3;
		} else {
			this.anInt5088 = Static179.method3071(arg2);
			this.anInt5089 = Static179.method3071(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass62_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt5088, this.anInt5089, 0, 1024, Static87.method1934(this.aClass174_13, Static523.aClass306_15), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass62_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt5088, this.anInt5089, 1, 0, Static87.method1934(this.aClass174_13, Static523.aClass306_15), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass62_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (fe.a((byte) -34, local90)) {
			@Pc(105) int local105 = arg2 * this.aClass174_13.anInt5166;
			@Pc(111) int local111 = arg2 * this.aClass174_13.anInt5166;
			@Pc(114) int local114 = local79.getRowPitch();
			if (local105 == local114 && local111 == local105) {
				local79.a((byte[]) arg5, arg6, 0, local105 * arg3);
			} else {
				for (@Pc(135) int local135 = 0; local135 < arg3; local135++) {
					local79.a(arg5, arg6 + local135 * local111, local114 * local135, local105);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lclient!de;IIZ[III)V")
	public Class172_Sub1(@OriginalArg(0) Class62_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static189.aClass174_6, Static523.aClass306_15, arg3 && arg0.aBoolean135, arg2 * arg1);
		if (this.aClass62_Sub1_Sub1_8.aBoolean134) {
			this.anInt5088 = arg1;
			this.anInt5089 = arg2;
		} else {
			this.anInt5088 = Static179.method3071(arg1);
			this.anInt5089 = Static179.method3071(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass62_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt5088, this.anInt5089, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass62_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt5088, this.anInt5089, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass62_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (fe.a((byte) -40, local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(93) int local93 = local71.getRowPitch();
			if (local93 == arg1 * 4 && arg1 == arg6) {
				local71.a((int[]) arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(112) int local112 = 0; local112 < arg2; local112++) {
					local71.a(arg4, arg5 + arg6 * local112, local112 * local93, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)I")
	@Override
	public int method7450() {
		return this.anInt5089;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZF)F")
	@Override
	public float method7456(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt5089;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IF)F")
	@Override
	public float method7449(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt5088;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)I")
	@Override
	public int method7451() {
		return this.anInt5088;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IILclient!kl;III[BII)V")
	@Override
	public void method7453(@OriginalArg(1) int arg0, @OriginalArg(2) Class174 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(8) int arg4) {
		if (arg1 != this.aClass174_13 || this.aClass306_10 != Static523.aClass306_15) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass62_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(26) int local26 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg0, arg4, 0, local15);
		if (!fe.a((byte) -118, local26)) {
			return;
		}
		@Pc(44) int local44 = arg2 * this.aClass174_13.anInt5166;
		@Pc(50) int local50 = arg0 * this.aClass174_13.anInt5166;
		@Pc(53) int local53 = local15.getRowPitch();
		if (local50 == local53 && local50 == local44) {
			local15.a((byte[]) arg3, 0, 0, local50 * arg4);
		} else {
			for (@Pc(69) int local69 = 0; local69 < arg4; local69++) {
				local15.a(arg3, local44 * local69, local53 * local69, local50);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method7454(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean354 = arg0;
		this.aBoolean353 = arg1;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lclient!em;I)V")
	@Override
	public void method7438(@OriginalArg(0) Class86 arg0) {
		super.method7438(arg0);
	}

	@OriginalMember(owner = "client!kda", name = "d", descriptor = "(I)V")
	@Override
	public void method7439() {
		this.aClass62_Sub1_Sub1_8.method1933(this);
	}

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7455() {
		return true;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIZI[IIII)V")
	@Override
	public void method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static189.aClass174_6 != this.aClass174_13 || Static523.aClass306_15 != this.aClass306_10) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass62_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(27) int local27 = this.anIDirect3DTexture1.LockRect(0, arg4, arg0, arg2, arg1, 0, local16);
		if (!fe.a((byte) -47, local27)) {
			return;
		}
		@Pc(42) int local42 = local16.getRowPitch();
		if (local42 == arg2 * 4 && arg5 == arg2) {
			local16.a((int[]) arg3, 0, 0, arg2 * arg1);
		} else {
			for (@Pc(56) int local56 = 0; local56 < arg1; local56++) {
				local16.a(arg3, local56 * arg5, local56 * local42, arg2);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6219() {
		return this.anIDirect3DTexture1;
	}
}

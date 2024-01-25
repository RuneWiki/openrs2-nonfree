import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.ec;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class74_Sub1 extends Class74 implements Interface20 {

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "Z")
	public boolean aBoolean205;

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "Z")
	public boolean aBoolean206;

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
	private final int anInt2725;

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
	private final int anInt2724;

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!hl;Lclient!wd;Lclient!jm;II)V")
	public Class74_Sub1(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass16_Sub1_Sub2_9.aBoolean366) {
			this.anInt2725 = arg3;
			this.anInt2724 = arg4;
		} else {
			this.anInt2725 = Static629.method8469(arg3);
			this.anInt2724 = Static629.method8469(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass16_Sub1_Sub2_9.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static208.method4018(this.aClass366_14, this.aClass160_20), 1);
	}

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!hl;Lclient!wd;IIZ[BII)V")
	public Class74_Sub1(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static258.aClass160_9, arg4 && arg0.aBoolean368, arg3 * arg2);
		if (this.aClass16_Sub1_Sub2_9.aBoolean366) {
			this.anInt2725 = arg2;
			this.anInt2724 = arg3;
		} else {
			this.anInt2725 = Static629.method8469(arg2);
			this.anInt2724 = Static629.method8469(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass16_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt2725, this.anInt2724, 0, 1024, Static208.method4018(this.aClass366_14, Static258.aClass160_9), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass16_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt2725, this.anInt2724, 1, 0, Static208.method4018(this.aClass366_14, Static258.aClass160_9), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass16_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (ec.a(local90, 2005530520)) {
			@Pc(106) int local106 = arg2 * this.aClass366_14.anInt10394;
			@Pc(112) int local112 = arg2 * this.aClass366_14.anInt10394;
			@Pc(115) int local115 = local79.getRowPitch();
			if (local112 == local115 && local112 == local106) {
				local79.a((byte[]) arg5, arg6, 0, local112 * arg3);
			} else {
				for (@Pc(132) int local132 = 0; local132 < arg3; local132++) {
					local79.a(arg5, arg6 + local132 * local106, local115 * local132, local112);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!hl;IIZ[III)V")
	public Class74_Sub1(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static456.aClass366_9, Static258.aClass160_9, arg3 && arg0.aBoolean368, arg2 * arg1);
		if (this.aClass16_Sub1_Sub2_9.aBoolean366) {
			this.anInt2724 = arg2;
			this.anInt2725 = arg1;
		} else {
			this.anInt2725 = Static629.method8469(arg1);
			this.anInt2724 = Static629.method8469(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass16_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt2725, this.anInt2724, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass16_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt2725, this.anInt2724, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass16_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (ec.a(local82, 2005530520)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(97) int local97 = local71.getRowPitch();
			if (arg1 * 4 == local97 && arg1 == arg6) {
				local71.a((int[]) arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(115) int local115 = 0; local115 < arg2; local115++) {
					local71.a(arg4, arg5 + arg6 * local115, local115 * local97, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)I")
	@Override
	public int method6630() {
		return this.anInt2724;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIB[BIIILclient!wd;I)V")
	@Override
	public void method6631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(7) Class366 arg4) {
		if (this.aClass366_14 != arg4 || Static258.aClass160_9 != this.aClass160_20) {
			throw new RuntimeException();
		}
		@Pc(23) PixelBuffer local23 = this.aClass16_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(34) int local34 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg0, 0, local23);
		if (!ec.a(local34, 2005530520)) {
			return;
		}
		@Pc(44) int local44 = arg1 * this.aClass366_14.anInt10394;
		@Pc(50) int local50 = arg3 * this.aClass366_14.anInt10394;
		@Pc(53) int local53 = local23.getRowPitch();
		if (local53 == local44 && local50 == local44) {
			local23.a((byte[]) arg2, 0, 0, arg0 * local44);
		} else {
			for (@Pc(74) int local74 = 0; local74 < arg0; local74++) {
				local23.a(arg2, local74 * local50, local53 * local74, local44);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII[IIZI)V")
	@Override
	public void method6629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (this.aClass366_14 != Static456.aClass366_9 || Static258.aClass160_9 != this.aClass160_20) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass16_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(27) int local27 = this.anIDirect3DTexture1.LockRect(0, arg4, arg2, arg0, arg5, 0, local16);
		if (!ec.a(local27, 2005530520)) {
			return;
		}
		@Pc(35) int local35 = local16.getRowPitch();
		if (local35 == arg0 * 4 && arg1 == arg0) {
			local16.a((int[]) arg3, 0, 0, arg5 * arg0);
		} else {
			for (@Pc(53) int local53 = 0; local53 < arg5; local53++) {
				local16.a(arg3, arg1 * local53, local53 * local35, arg0);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)I")
	@Override
	public int method6624() {
		return this.anInt2725;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(FI)F")
	@Override
	public float method6625(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt2724;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I[IIIIII)V")
	@Override
	public void method6628(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass366_14 != Static456.aClass366_9 || Static258.aClass160_9 != this.aClass160_20) {
			throw new RuntimeException();
		}
		@Pc(22) PixelBuffer local22 = this.aClass16_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(33) int local33 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 16, local22);
		if (!ec.a(local33, 2005530520)) {
			return;
		}
		@Pc(41) int local41 = local22.getRowPitch();
		if (arg1 * 4 == local41) {
			local22.b(arg0, 0, 0, arg0.length);
		} else {
			for (@Pc(52) int local52 = 0; local52 < arg2; local52++) {
				local22.b(arg0, arg1 * local52, local41 * local52, arg1);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
	@Override
	public void method8281() {
		this.aClass16_Sub1_Sub2_9.method4015(this);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IF)F")
	@Override
	public float method6627(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt2725;
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6626() {
		return true;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!qo;I)V")
	@Override
	public void method8280(@OriginalArg(0) Class277 arg0) {
		super.method8280(arg0);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZZB)V")
	@Override
	public void method6623(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean206 = arg1;
		this.aBoolean205 = arg0;
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8279() {
		return this.anIDirect3DTexture1;
	}
}

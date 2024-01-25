import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.jc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class186_Sub1 extends Class186 implements Interface8 {

	@OriginalMember(owner = "client!om", name = "g", descriptor = "Z")
	public boolean aBoolean488;

	@OriginalMember(owner = "client!om", name = "h", descriptor = "Z")
	public boolean aBoolean489;

	@OriginalMember(owner = "client!om", name = "f", descriptor = "I")
	private final int anInt6762;

	@OriginalMember(owner = "client!om", name = "j", descriptor = "I")
	private final int anInt6763;

	@OriginalMember(owner = "client!om", name = "i", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!hb;IIZ[III)V")
	public Class186_Sub1(@OriginalArg(0) Class12_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static253.aClass297_5, Static554.aClass340_14, arg3 && arg0.aBoolean300, arg2 * arg1);
		if (this.aClass12_Sub2_Sub1_9.aBoolean301) {
			this.anInt6762 = arg2;
			this.anInt6763 = arg1;
		} else {
			this.anInt6763 = Static200.method3428(arg1);
			this.anInt6762 = Static200.method3428(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass12_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt6763, this.anInt6762, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass12_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt6763, this.anInt6762, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass12_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (jc.a(-1, local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(95) int local95 = local71.getRowPitch();
			if (local95 == arg1 * 4 && arg6 == arg1) {
				local71.a((int[]) arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(113) int local113 = 0; local113 < arg2; local113++) {
					local71.a(arg4, arg5 + local113 * arg6, local113 * local95, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!hb;Lclient!sk;Lclient!vea;II)V")
	public Class186_Sub1(@OriginalArg(0) Class12_Sub2_Sub1 arg0, @OriginalArg(1) Class297 arg1, @OriginalArg(2) Class340 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass12_Sub2_Sub1_9.aBoolean301) {
			this.anInt6762 = arg4;
			this.anInt6763 = arg3;
		} else {
			this.anInt6763 = Static200.method3428(arg3);
			this.anInt6762 = Static200.method3428(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass12_Sub2_Sub1_9.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static182.method3208(this.aClass297_15, this.aClass340_20), 1);
	}

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!hb;Lclient!sk;IIZ[BII)V")
	public Class186_Sub1(@OriginalArg(0) Class12_Sub2_Sub1 arg0, @OriginalArg(1) Class297 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static554.aClass340_14, arg4 && arg0.aBoolean300, arg3 * arg2);
		if (this.aClass12_Sub2_Sub1_9.aBoolean301) {
			this.anInt6763 = arg2;
			this.anInt6762 = arg3;
		} else {
			this.anInt6763 = Static200.method3428(arg2);
			this.anInt6762 = Static200.method3428(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass12_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt6763, this.anInt6762, 0, 1024, Static182.method3208(this.aClass297_15, Static554.aClass340_14), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass12_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt6763, this.anInt6762, 1, 0, Static182.method3208(this.aClass297_15, Static554.aClass340_14), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass12_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (jc.a(-1, local90)) {
			@Pc(106) int local106 = arg2 * this.aClass297_15.anInt8136;
			@Pc(112) int local112 = arg2 * this.aClass297_15.anInt8136;
			@Pc(115) int local115 = local79.getRowPitch();
			if (local115 == local106 && local106 == local112) {
				local79.a((byte[]) arg5, arg6, 0, local106 * arg3);
			} else {
				for (@Pc(132) int local132 = 0; local132 < arg3; local132++) {
					local79.a(arg5, arg6 + local132 * local112, local115 * local132, local106);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)I")
	@Override
	public int method7328() {
		return this.anInt6763;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIII[BLclient!sk;I)V")
	@Override
	public void method7329(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(6) byte[] arg2, @OriginalArg(7) Class297 arg3, @OriginalArg(8) int arg4) {
		if (arg3 != this.aClass297_15 || this.aClass340_20 != Static554.aClass340_14) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass12_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(32) int local32 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg4, 0, local15);
		if (!jc.a(-1, local32)) {
			return;
		}
		@Pc(45) int local45 = arg1 * this.aClass297_15.anInt8136;
		@Pc(51) int local51 = arg0 * this.aClass297_15.anInt8136;
		@Pc(54) int local54 = local15.getRowPitch();
		if (local45 == local54 && local51 == local45) {
			local15.a((byte[]) arg2, 0, 0, arg4 * local45);
		} else {
			for (@Pc(66) int local66 = 0; local66 < arg4; local66++) {
				local15.a(arg2, local51 * local66, local66 * local54, local45);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZBZ)V")
	@Override
	public void method7331(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean489 = arg1;
		this.aBoolean488 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7670() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!ng;)V")
	@Override
	public void method7669(@OriginalArg(1) Class225 arg0) {
		super.method7669(arg0);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(Z)V")
	@Override
	public void method7671() {
		this.aClass12_Sub2_Sub1_9.method3213(this);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(FB)F")
	@Override
	public float method7326(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt6763;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(III[IIBII)V")
	@Override
	public void method7330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static253.aClass297_5 != this.aClass297_15 || this.aClass340_20 != Static554.aClass340_14) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass12_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(33) int local33 = this.anIDirect3DTexture1.LockRect(0, arg4, arg2, arg1, arg5, 0, local16);
		if (!jc.a(-1, local33)) {
			return;
		}
		@Pc(42) int local42 = local16.getRowPitch();
		if (local42 == arg1 * 4 && arg0 == arg1) {
			local16.a((int[]) arg3, 0, 0, arg1 * arg5);
		} else {
			for (@Pc(61) int local61 = 0; local61 < arg5; local61++) {
				local16.a(arg3, local61 * arg0, local42 * local61, arg1);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)I")
	@Override
	public int method7327() {
		return this.anInt6762;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7332() {
		return true;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BF)F")
	@Override
	public float method7325(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt6762;
	}
}

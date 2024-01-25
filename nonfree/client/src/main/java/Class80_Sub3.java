import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.rn;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class80_Sub3 extends Class80 implements Interface11 {

	@OriginalMember(owner = "client!ww", name = "h", descriptor = "Z")
	public boolean aBoolean765;

	@OriginalMember(owner = "client!ww", name = "j", descriptor = "Z")
	public boolean aBoolean766;

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "I")
	private final int anInt10359;

	@OriginalMember(owner = "client!ww", name = "i", descriptor = "I")
	private final int anInt10360;

	@OriginalMember(owner = "client!ww", name = "g", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!aia;Lclient!ul;IIZ[BII)V")
	public Class80_Sub3(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static553.aClass330_14, arg4 && arg0.aBoolean61, arg3 * arg2);
		if (this.aClass16_Sub1_Sub1_9.aBoolean64) {
			this.anInt10359 = arg3;
			this.anInt10360 = arg2;
		} else {
			this.anInt10360 = Static527.method7377(arg2);
			this.anInt10359 = Static527.method7377(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass16_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt10360, this.anInt10359, 0, 1024, Static16.method688(this.aClass361_17, Static553.aClass330_14), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass16_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt10360, this.anInt10359, 1, 0, Static16.method688(this.aClass361_17, Static553.aClass330_14), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass16_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (rn.a(local90, -56)) {
			@Pc(106) int local106 = arg2 * this.aClass361_17.anInt9527;
			@Pc(112) int local112 = arg2 * this.aClass361_17.anInt9527;
			@Pc(115) int local115 = local79.getRowPitch();
			if (local106 == local115 && local112 == local106) {
				local79.a((byte[]) arg5, arg6, 0, local106 * arg3);
			} else {
				for (@Pc(132) int local132 = 0; local132 < arg3; local132++) {
					local79.a(arg5, local132 * local112 + arg6, local115 * local132, local106);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!aia;IIZ[III)V")
	public Class80_Sub3(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static264.aClass361_8, Static553.aClass330_14, arg3 && arg0.aBoolean61, arg1 * arg2);
		if (this.aClass16_Sub1_Sub1_9.aBoolean64) {
			this.anInt10360 = arg1;
			this.anInt10359 = arg2;
		} else {
			this.anInt10360 = Static527.method7377(arg1);
			this.anInt10359 = Static527.method7377(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass16_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt10360, this.anInt10359, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass16_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt10360, this.anInt10359, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass16_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (rn.a(local82, -122)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(94) int local94 = local71.getRowPitch();
			if (arg1 * 4 == local94 && arg1 == arg6) {
				local71.a((int[]) arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(108) int local108 = 0; local108 < arg2; local108++) {
					local71.a(arg4, arg6 * local108 + arg5, local94 * local108, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!aia;Lclient!ul;Lclient!so;II)V")
	public Class80_Sub3(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(2) Class330 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass16_Sub1_Sub1_9.aBoolean64) {
			this.anInt10359 = arg4;
			this.anInt10360 = arg3;
		} else {
			this.anInt10360 = Static527.method7377(arg3);
			this.anInt10359 = Static527.method7377(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass16_Sub1_Sub1_9.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static16.method688(this.aClass361_17, this.aClass330_20), 1);
	}

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "(B)I")
	@Override
	public int method8765() {
		return this.anInt10359;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)V")
	@Override
	public void method8759() {
		this.aClass16_Sub1_Sub1_9.method690(this);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method8761(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean766 = arg1;
		this.aBoolean765 = arg0;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)I")
	@Override
	public int method8760() {
		return this.anInt10360;
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8763() {
		return true;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "([IIIIIIII)V")
	@Override
	public void method8768(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (this.aClass361_17 != Static264.aClass361_8 || this.aClass330_20 != Static553.aClass330_14) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass16_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(27) int local27 = this.anIDirect3DTexture1.LockRect(0, arg2, arg1, arg5, arg4, 0, local16);
		if (!rn.a(local27, -100)) {
			return;
		}
		@Pc(35) int local35 = local16.getRowPitch();
		if (local35 == arg5 * 4 && arg3 == arg5) {
			local16.a((int[]) arg0, 0, 0, arg5 * arg4);
		} else {
			for (@Pc(54) int local54 = 0; local54 < arg4; local54++) {
				local16.a(arg0, local54 * arg3, local54 * local35, arg5);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIZI[III)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(6) int arg2) {
		if (Static264.aClass361_8 != this.aClass361_17 || Static553.aClass330_14 != this.aClass330_20) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass16_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(26) int local26 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg0, arg2, 16, local15);
		if (!rn.a(local26, -55)) {
			return;
		}
		@Pc(33) int local33 = local15.getRowPitch();
		if (arg0 * 4 == local33) {
			local15.b(arg1, 0, 0, arg1.length);
		} else {
			for (@Pc(52) int local52 = 0; local52 < arg2; local52++) {
				local15.b(arg1, local52 * arg0, local33 * local52, arg0);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(FB)F")
	@Override
	public float method8762(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt10360;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!ws;B)V")
	@Override
	public void method8758(@OriginalArg(0) Class395 arg0) {
		super.method8758(arg0);
	}

	@OriginalMember(owner = "client!ww", name = "d", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8757() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IF)F")
	@Override
	public float method8766(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt10359;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "([BIIILclient!ul;IIII)V")
	@Override
	public void method8764(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class361 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4) {
		if (this.aClass361_17 != arg2 || Static553.aClass330_14 != this.aClass330_20) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass16_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(30) int local30 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg4, arg1, 0, local15);
		if (!rn.a(local30, -102)) {
			return;
		}
		@Pc(40) int local40 = arg3 * this.aClass361_17.anInt9527;
		@Pc(46) int local46 = arg4 * this.aClass361_17.anInt9527;
		@Pc(49) int local49 = local15.getRowPitch();
		if (local46 == local49 && local46 == local40) {
			local15.a((byte[]) arg0, 0, 0, arg1 * local46);
		} else {
			for (@Pc(61) int local61 = 0; local61 < arg1; local61++) {
				local15.a(arg0, local40 * local61, local61 * local49, local46);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}
}

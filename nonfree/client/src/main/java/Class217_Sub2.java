import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.fma;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class217_Sub2 extends Class217 implements Interface16 {

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "Z")
	public boolean aBoolean649;

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "Z")
	public boolean aBoolean650;

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
	private final int anInt9682;

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
	private final int anInt9683;

	@OriginalMember(owner = "client!tk", name = "j", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!tha;Lclient!sca;Lclient!hu;II)V")
	public Class217_Sub2(@OriginalArg(0) Class22_Sub2_Sub1 arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) Class167 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass22_Sub2_Sub1_9.aBoolean646) {
			this.anInt9682 = arg4;
			this.anInt9683 = arg3;
		} else {
			this.anInt9683 = Static92.method1941(arg3);
			this.anInt9682 = Static92.method1941(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass22_Sub2_Sub1_9.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static622.method8193(this.aClass167_20, this.aClass335_18), 1);
	}

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!tha;Lclient!sca;IIZ[BII)V")
	public Class217_Sub2(@OriginalArg(0) Class22_Sub2_Sub1 arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static259.aClass167_7, arg4 && arg0.aBoolean644, arg2 * arg3);
		if (this.aClass22_Sub2_Sub1_9.aBoolean646) {
			this.anInt9683 = arg2;
			this.anInt9682 = arg3;
		} else {
			this.anInt9683 = Static92.method1941(arg2);
			this.anInt9682 = Static92.method1941(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass22_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt9683, this.anInt9682, 0, 1024, Static622.method8193(Static259.aClass167_7, this.aClass335_18), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass22_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt9683, this.anInt9682, 1, 0, Static622.method8193(Static259.aClass167_7, this.aClass335_18), 1);
		}
		@Pc(80) PixelBuffer local80 = this.aClass22_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(91) int local91 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local80);
		if (fma.a(local91, (byte) 120)) {
			@Pc(112) int local112 = arg2 * this.aClass335_18.anInt8864;
			@Pc(118) int local118 = arg2 * this.aClass335_18.anInt8864;
			@Pc(121) int local121 = local80.getRowPitch();
			if (local112 == local121 && local118 == local112) {
				local80.a((byte[]) arg5, arg6, 0, arg3 * local112);
			} else {
				for (@Pc(135) int local135 = 0; local135 < arg3; local135++) {
					local80.a(arg5, local118 * local135 + arg6, local121 * local135, local112);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!tha;IIZ[III)V")
	public Class217_Sub2(@OriginalArg(0) Class22_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static646.aClass335_14, Static259.aClass167_7, arg3 && arg0.aBoolean644, arg1 * arg2);
		if (this.aClass22_Sub2_Sub1_9.aBoolean646) {
			this.anInt9682 = arg2;
			this.anInt9683 = arg1;
		} else {
			this.anInt9683 = Static92.method1941(arg1);
			this.anInt9682 = Static92.method1941(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass22_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt9683, this.anInt9682, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass22_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt9683, this.anInt9682, 1, 0, 21, 1);
		}
		@Pc(72) PixelBuffer local72 = this.aClass22_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(83) int local83 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local72);
		if (fma.a(local83, (byte) -1)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(99) int local99 = local72.getRowPitch();
			if (local99 == arg1 * 4 && arg6 == arg1) {
				local72.b(arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(115) int local115 = 0; local115 < arg2; local115++) {
					local72.b(arg4, local115 * arg6 + arg5, local115 * local99, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!on;B)V")
	@Override
	public void method9229(@OriginalArg(0) Class280 arg0) {
		super.method9229(arg0);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZZ)V")
	@Override
	public void method8248(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean650 = arg0;
		this.aBoolean649 = arg1;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZIIII[III)V")
	@Override
	public void method8242(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (this.aClass335_18 != Static646.aClass335_14 || this.aClass167_20 != Static259.aClass167_7) {
			throw new RuntimeException();
		}
		@Pc(35) PixelBuffer local35 = this.aClass22_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(46) int local46 = this.anIDirect3DTexture1.LockRect(0, arg1, arg4, arg2, arg0, 0, local35);
		if (!fma.a(local46, (byte) 123)) {
			return;
		}
		@Pc(53) int local53 = local35.getRowPitch();
		if (arg2 * 4 == local53 && arg2 == arg5) {
			local35.b(arg3, 0, 0, arg0 * arg2);
		} else {
			for (@Pc(73) int local73 = 0; local73 < arg0; local73++) {
				local35.b(arg3, arg5 * local73, local73 * local53, arg2);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
	@Override
	public void method9230() {
		this.aClass22_Sub2_Sub1_9.method8192(this);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IF)F")
	@Override
	public float method8250(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt9682;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8244() {
		return true;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(Z)I")
	@Override
	public int method8245() {
		return this.anInt9682;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[IIIIII)V")
	@Override
	public void method8249(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		if (this.aClass335_18 != Static646.aClass335_14 || this.aClass167_20 != Static259.aClass167_7) {
			throw new RuntimeException();
		}
		@Pc(23) PixelBuffer local23 = this.aClass22_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(34) int local34 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg1, 16, local23);
		if (!fma.a(local34, (byte) 105)) {
			return;
		}
		@Pc(41) int local41 = local23.getRowPitch();
		if (local41 == arg2 * 4) {
			local23.a((int[]) arg0, 0, 0, arg0.length);
		} else {
			for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
				local23.a(arg0, arg2 * local48, local48 * local41, arg2);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(FI)F")
	@Override
	public float method8247(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt9683;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)I")
	@Override
	public int method8246() {
		return this.anInt9683;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIILclient!sca;I[BI)V")
	@Override
	public void method8243(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class335 arg2, @OriginalArg(7) byte[] arg3, @OriginalArg(8) int arg4) {
		if (arg2 != this.aClass335_18 || this.aClass167_20 != Static259.aClass167_7) {
			throw new RuntimeException();
		}
		@Pc(18) PixelBuffer local18 = this.aClass22_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(29) int local29 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg4, arg1, 0, local18);
		if (!fma.a(local29, (byte) 103)) {
			return;
		}
		@Pc(39) int local39 = arg0 * this.aClass335_18.anInt8864;
		@Pc(45) int local45 = arg4 * this.aClass335_18.anInt8864;
		@Pc(48) int local48 = local18.getRowPitch();
		if (local45 == local48 && local39 == local45) {
			local18.a((byte[]) arg3, 0, 0, arg1 * local45);
		} else {
			for (@Pc(62) int local62 = 0; local62 < arg1; local62++) {
				local18.a(arg3, local39 * local62, local48 * local62, local45);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method9228() {
		return this.anIDirect3DTexture1;
	}
}

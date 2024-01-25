import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.wu;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class204_Sub1 extends Class204 implements Interface17 {

	@OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
	private final int anInt5976;

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
	private final int anInt5974;

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
	private final int anInt5975;

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!bv;Lclient!dk;III[B)V")
	public Class204_Sub1(@OriginalArg(0) Class42_Sub1_Sub1 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static155.aClass114_6, false, arg2 * arg3 * arg4);
		this.anInt5976 = arg3;
		this.anInt5974 = arg2;
		this.anInt5975 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass42_Sub1_Sub1_6.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static50.method1347(this.aClass114_17, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass42_Sub1_Sub1_6.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (wu.a(local53, (byte) 125)) {
			@Pc(64) int local64 = this.aClass72_13.anInt2163 * this.anInt5974;
			@Pc(69) int local69 = local64 * this.anInt5976;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local69 == local72) {
				local40.a((byte[]) arg5, 0, 0, this.anInt5975 * local64 * this.anInt5976);
			} else {
				@Pc(82) int local82 = local40.getRowPitch();
				@Pc(87) int local87;
				if (local82 == local64) {
					for (local87 = 0; local87 < this.anInt5975; local87++) {
						local40.a(arg5, local69 * local87, local87 * local72, local69);
					}
				} else {
					for (local87 = 0; local87 < this.anInt5975; local87++) {
						for (@Pc(93) int local93 = 0; local93 < this.anInt5976; local93++) {
							local40.a(arg5, local64 * local93 + local87 * local69, local72 * local87 - -(local93 * local82), local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6852() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
	@Override
	public void method6969() {
		this.aClass42_Sub1_Sub1_6.method1341(this);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZLclient!fj;)V")
	@Override
	public void method6968(@OriginalArg(1) Class101 arg0) {
		super.method6968(arg0);
	}
}

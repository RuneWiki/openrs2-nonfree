import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.raa;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class28_Sub1 extends Class28 implements Interface19 {

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
	private final int anInt627;

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
	private final int anInt626;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
	private final int anInt625;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!mh;Lclient!qda;III[B)V")
	public Class28_Sub1(@OriginalArg(0) Class126_Sub2_Sub2 arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static385.aClass247_14, false, arg4 * arg2 * arg3);
		this.anInt627 = arg4;
		this.anInt626 = arg3;
		this.anInt625 = arg2;
		this.anIDirect3DVolumeTexture1 = this.aClass126_Sub2_Sub2_7.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static351.method5578(this.aClass247_19, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass126_Sub2_Sub2_7.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (raa.a(local53, (byte) 106)) {
			@Pc(64) int local64 = this.aClass281_17.anInt7736 * this.anInt625;
			@Pc(69) int local69 = this.anInt626 * local64;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local69 == local72) {
				local40.a((byte[]) arg5, 0, 0, this.anInt627 * this.anInt626 * local64);
			} else {
				@Pc(91) int local91 = local40.getRowPitch();
				@Pc(96) int local96;
				if (local91 == local64) {
					for (local96 = 0; local96 < this.anInt627; local96++) {
						local40.a(arg5, local96 * local69, local96 * local72, local69);
					}
				} else {
					for (local96 = 0; local96 < this.anInt627; local96++) {
						for (@Pc(121) int local121 = 0; local121 < this.anInt626; local121++) {
							local40.a(arg5, local69 * local96 + local64 * local121, local91 * local121 + local72 * local96, local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!kha;)V")
	@Override
	public void method7609(@OriginalArg(1) Class189 arg0) {
		super.method7609(arg0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	@Override
	public void method7610() {
		this.aClass126_Sub2_Sub2_7.method5581(this);
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6206() {
		return this.anIDirect3DVolumeTexture1;
	}
}

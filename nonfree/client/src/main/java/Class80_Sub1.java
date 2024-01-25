import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.rn;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class80_Sub1 extends Class80 implements Interface24 {

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
	private final int anInt6651;

	@OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
	private final int anInt6653;

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
	private final int anInt6652;

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!aia;Lclient!ul;III[B)V")
	public Class80_Sub1(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static553.aClass330_14, false, arg3 * arg2 * arg4);
		this.anInt6651 = arg2;
		this.anInt6653 = arg4;
		this.anInt6652 = arg3;
		this.anIDirect3DVolumeTexture1 = this.aClass16_Sub1_Sub1_9.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static16.method688(arg1, this.aClass330_20), 1);
		@Pc(40) PixelBuffer local40 = this.aClass16_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (rn.a(local53, -106)) {
			@Pc(65) int local65 = this.anInt6651 * this.aClass361_17.anInt9527;
			@Pc(70) int local70 = local65 * this.anInt6652;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local73 == local70) {
				local40.a((byte[]) arg5, 0, 0, local65 * this.anInt6652 * this.anInt6653);
			} else {
				@Pc(79) int local79 = local40.getRowPitch();
				@Pc(88) int local88;
				if (local79 == local65) {
					for (local88 = 0; local88 < this.anInt6653; local88++) {
						local40.a(arg5, local88 * local70, local88 * local73, local70);
					}
				} else {
					for (local88 = 0; local88 < this.anInt6653; local88++) {
						for (@Pc(98) int local98 = 0; local98 < this.anInt6652; local98++) {
							local40.a(arg5, local98 * local65 + local70 * local88, local88 * local73 + local79 * local98, local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8757() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
	@Override
	public void method8759() {
		this.aClass16_Sub1_Sub1_9.method682(this);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!ws;B)V")
	@Override
	public void method8758(@OriginalArg(0) Class395 arg0) {
		super.method8758(arg0);
	}
}

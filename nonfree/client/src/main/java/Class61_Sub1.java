import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.pia;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class61_Sub1 extends Class61 implements Interface13 {

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
	private final int anInt1644;

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
	private final int anInt1646;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
	private final int anInt1645;

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!lj;Lclient!nea;III[B)V")
	public Class61_Sub1(@OriginalArg(0) Class101_Sub1_Sub2 arg0, @OriginalArg(1) Class244 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static114.aClass79_7, false, arg2 * arg3 * arg4);
		this.anInt1644 = arg3;
		this.anInt1646 = arg2;
		this.anInt1645 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass101_Sub1_Sub2_9.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static344.method5970(arg1, this.aClass79_20), 1);
		@Pc(40) PixelBuffer local40 = this.aClass101_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (pia.a(-2005530600, local53)) {
			@Pc(64) int local64 = this.aClass244_16.anInt7387 * this.anInt1646;
			@Pc(69) int local69 = local64 * this.anInt1644;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local69 == local72) {
				local40.a((byte[]) arg5, 0, 0, this.anInt1645 * this.anInt1644 * local64);
			} else {
				@Pc(91) int local91 = local40.getRowPitch();
				@Pc(96) int local96;
				if (local91 == local64) {
					for (local96 = 0; local96 < this.anInt1645; local96++) {
						local40.a(arg5, local96 * local69, local96 * local72, local69);
					}
				} else {
					for (local96 = 0; local96 < this.anInt1645; local96++) {
						for (@Pc(106) int local106 = 0; local106 < this.anInt1644; local106++) {
							local40.a(arg5, local96 * local69 + local106 * local64, local96 * local72 + local91 * local106, local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
	@Override
	public void method9326() {
		this.aClass101_Sub1_Sub2_9.method5964(this);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!rha;)V")
	@Override
	public void method9325(@OriginalArg(1) Class315 arg0) {
		super.method9325(arg0);
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method9324() {
		return this.anIDirect3DVolumeTexture1;
	}
}

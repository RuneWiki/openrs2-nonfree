import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.ue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class55_Sub3 extends Class55 implements Interface13 {

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
	private final int anInt7198;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
	private final int anInt7197;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	private final int anInt7199;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!bfa;Lclient!wq;III[B)V")
	public Class55_Sub3(@OriginalArg(0) Class20_Sub2_Sub1 arg0, @OriginalArg(1) Class375 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static29.aClass26_4, false, arg4 * arg3 * arg2);
		this.anInt7198 = arg2;
		this.anInt7197 = arg4;
		this.anInt7199 = arg3;
		this.anIDirect3DVolumeTexture1 = this.aClass20_Sub2_Sub1_8.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static39.method1331(this.aClass26_17, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass20_Sub2_Sub1_8.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (ue.a(local53, false)) {
			@Pc(64) int local64 = this.aClass375_33.anInt11029 * this.anInt7198;
			@Pc(69) int local69 = local64 * this.anInt7199;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local72 == local69) {
				local40.a((byte[]) arg5, 0, 0, this.anInt7197 * local64 * this.anInt7199);
			} else {
				@Pc(91) int local91 = local40.getRowPitch();
				@Pc(96) int local96;
				if (local64 == local91) {
					for (local96 = 0; local96 < this.anInt7197; local96++) {
						local40.a(arg5, local69 * local96, local96 * local72, local69);
					}
				} else {
					for (local96 = 0; local96 < this.anInt7197; local96++) {
						for (@Pc(102) int local102 = 0; local102 < this.anInt7199; local102++) {
							local40.a(arg5, local64 * local102 + local69 * local96, local102 * local91 + local96 * local72, local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	@Override
	public void method8286() {
		this.aClass20_Sub2_Sub1_8.method1332(this);
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6142() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!ria;I)V")
	@Override
	public void method8287(@OriginalArg(0) Class298 arg0) {
		super.method8287(arg0);
	}
}

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.jc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class186_Sub2 extends Class186 implements Interface12 {

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
	private final int anInt7025;

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!hb;IZ[[I)V")
	public Class186_Sub2(@OriginalArg(0) Class12_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static253.aClass297_5, Static554.aClass340_14, arg2 && arg0.aBoolean303, arg1 * 6 * arg1);
		this.anInt7025 = arg1;
		if (this.aBoolean678) {
			this.anIDirect3DCubeTexture1 = this.aClass12_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt7025, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass12_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt7025, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass12_Sub2_Sub1_9.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt7025, this.anInt7025, 0, local52);
			if (jc.a(-1, local73)) {
				@Pc(80) int local80 = local52.getRowPitch();
				if (this.anInt7025 * 4 == local80) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt7025 * this.anInt7025);
				} else {
					for (@Pc(101) int local101 = 0; local101 < this.anInt7025; local101++) {
						local52.a(arg3[local54], this.anInt7025 * local101, local80 * local101, this.anInt7025);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7670() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(Z)V")
	@Override
	public void method7671() {
		this.aClass12_Sub2_Sub1_9.method3212(this);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILclient!ng;)V")
	@Override
	public void method7669(@OriginalArg(1) Class225 arg0) {
		super.method7669(arg0);
	}
}

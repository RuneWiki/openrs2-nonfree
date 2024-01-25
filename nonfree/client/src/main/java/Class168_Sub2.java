import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.gfa;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class168_Sub2 extends Class168 implements Interface3 {

	@OriginalMember(owner = "client!li", name = "f", descriptor = "I")
	private final int anInt5061;

	@OriginalMember(owner = "client!li", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!ik;IZ[[I)V")
	public Class168_Sub2(@OriginalArg(0) Class162_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static225.aClass366_3, Static42.aClass35_4, arg2 && arg0.aBoolean290, arg1 * arg1 * 6);
		this.anInt5061 = arg1;
		if (this.aBoolean798) {
			this.anIDirect3DCubeTexture1 = this.aClass162_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt5061, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass162_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt5061, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass162_Sub1_Sub1_9.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt5061, this.anInt5061, 0, local52);
			if (gfa.a(local73, (int) 10067)) {
				@Pc(80) int local80 = local52.getRowPitch();
				if (local80 == this.anInt5061 * 4) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt5061 * this.anInt5061);
				} else {
					for (@Pc(101) int local101 = 0; local101 < this.anInt5061; local101++) {
						local52.a(arg3[local54], local101 * this.anInt5061, local80 * local101, this.anInt5061);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
	@Override
	public void method7635() {
		this.aClass162_Sub1_Sub1_9.method3305(this);
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7633() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!kk;I)V")
	@Override
	public void method7634(@OriginalArg(0) Class195 arg0) {
		super.method7634(arg0);
	}
}

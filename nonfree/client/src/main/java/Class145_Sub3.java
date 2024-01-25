import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.aha;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class145_Sub3 extends Class145 implements Interface17 {

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
	private final int anInt7719;

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!us;IZ[[I)V")
	public Class145_Sub3(@OriginalArg(0) Class33_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static220.aClass276_11, Static111.aClass79_7, arg2 && arg0.aBoolean755, arg1 * arg1 * 6);
		this.anInt7719 = arg1;
		if (this.aBoolean606) {
			this.anIDirect3DCubeTexture1 = this.aClass33_Sub2_Sub2_7.anIDirect3DDevice1.a(this.anInt7719, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass33_Sub2_Sub2_7.anIDirect3DDevice1.a(this.anInt7719, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass33_Sub2_Sub2_7.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt7719, this.anInt7719, 0, local52);
			if (aha.a(-1, local73)) {
				@Pc(80) int local80 = local52.getRowPitch();
				if (local80 == this.anInt7719 * 4) {
					local52.b(arg3[local54], 0, 0, this.anInt7719 * this.anInt7719);
				} else {
					for (@Pc(88) int local88 = 0; local88 < this.anInt7719; local88++) {
						local52.b(arg3[local54], this.anInt7719 * local88, local88 * local80, this.anInt7719);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6705() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ko;I)V")
	@Override
	public void method8612(@OriginalArg(0) Class198 arg0) {
		super.method8612(arg0);
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)V")
	@Override
	public void method8613() {
		this.aClass33_Sub2_Sub2_7.method8296(this);
	}
}

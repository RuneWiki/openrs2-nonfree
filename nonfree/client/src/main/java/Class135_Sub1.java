import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.ud;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hha")
public final class Class135_Sub1 extends Class135 implements Interface10 {

	@OriginalMember(owner = "client!hha", name = "g", descriptor = "I")
	private final int anInt4197;

	@OriginalMember(owner = "client!hha", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!hha", name = "<init>", descriptor = "(Lclient!rja;IZ[[I)V")
	public Class135_Sub1(@OriginalArg(0) Class13_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static419.aClass327_2, Static246.aClass152_10, arg2 && arg0.aBoolean669, arg1 * 6 * arg1);
		this.anInt4197 = arg1;
		if (this.aBoolean458) {
			this.anIDirect3DCubeTexture1 = this.aClass13_Sub1_Sub2_4.anIDirect3DDevice1.a(this.anInt4197, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass13_Sub1_Sub2_4.anIDirect3DDevice1.a(this.anInt4197, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass13_Sub1_Sub2_4.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt4197, this.anInt4197, 0, local52);
			if (ud.a(0, (int) local71)) {
				@Pc(78) int local78 = local52.getRowPitch();
				if (local78 == this.anInt4197 * 4) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt4197 * this.anInt4197);
				} else {
					for (@Pc(86) int local86 = 0; local86 < this.anInt4197; local86++) {
						local52.a(arg3[local54], local86 * this.anInt4197, local78 * local86, this.anInt4197);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!hha", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method5798() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(ILclient!wga;)V")
	@Override
	public void method8137(@OriginalArg(1) Class385 arg0) {
		super.method8137(arg0);
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)V")
	@Override
	public void method8138() {
		this.aClass13_Sub1_Sub2_4.method7550(this);
	}
}

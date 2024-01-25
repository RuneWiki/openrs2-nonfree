import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.vq;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class48_Sub1 extends Class48 implements Interface3 {

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
	private final int anInt1681;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!ad;IZ[[I)V")
	public Class48_Sub1(@OriginalArg(0) Class5_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static502.aClass182_14, Static637.aClass376_16, arg2 && arg0.aBoolean54, arg1 * 6 * arg1);
		this.anInt1681 = arg1;
		if (this.aBoolean621) {
			this.anIDirect3DCubeTexture1 = this.aClass5_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt1681, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass5_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt1681, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass5_Sub1_Sub1_8.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt1681, this.anInt1681, 0, local52);
			if (vq.b(-2005530516, local71)) {
				@Pc(78) int local78 = local52.getRowPitch();
				if (this.anInt1681 * 4 == local78) {
					local52.b(arg3[local54], 0, 0, this.anInt1681 * this.anInt1681);
				} else {
					for (@Pc(90) int local90 = 0; local90 < this.anInt1681; local90++) {
						local52.b(arg3[local54], local90 * this.anInt1681, local90 * local78, this.anInt1681);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7473() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZLclient!ui;)V")
	@Override
	public void method7472(@OriginalArg(1) Class339 arg0) {
		super.method7472(arg0);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	@Override
	public void method7474() {
		this.aClass5_Sub1_Sub1_8.method651(this);
	}
}

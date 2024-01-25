import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.dt;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class19_Sub1 extends Class19 implements Interface11 {

	@OriginalMember(owner = "client!au", name = "f", descriptor = "I")
	private final int anInt436;

	@OriginalMember(owner = "client!au", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!hg;IZ[[I)V")
	public Class19_Sub1(@OriginalArg(0) Class4_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static171.aClass110_13, Static517.aClass308_15, arg2 && arg0.aBoolean302, arg1 * arg1 * 6);
		this.anInt436 = arg1;
		if (this.aBoolean416) {
			this.anIDirect3DCubeTexture1 = this.aClass4_Sub2_Sub1_7.anIDirect3DDevice1.a(this.anInt436, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass4_Sub2_Sub1_7.anIDirect3DDevice1.a(this.anInt436, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass4_Sub2_Sub1_7.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt436, this.anInt436, 0, local52);
			if (dt.a(local73, -2005530590)) {
				@Pc(81) int local81 = local52.getRowPitch();
				if (this.anInt436 * 4 == local81) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt436 * this.anInt436);
				} else {
					for (@Pc(106) int local106 = 0; local106 < this.anInt436; local106++) {
						local52.a(arg3[local54], this.anInt436 * local106, local81 * local106, this.anInt436);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method5123() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!au", name = "c", descriptor = "(B)V")
	@Override
	public void method7756() {
		this.aClass4_Sub2_Sub1_7.method3487(this);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ILclient!ie;)V")
	@Override
	public void method7757(@OriginalArg(1) Class136 arg0) {
		super.method7757(arg0);
	}
}

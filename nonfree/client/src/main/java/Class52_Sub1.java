import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.ala;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cia")
public final class Class52_Sub1 extends Class52 implements Interface7 {

	@OriginalMember(owner = "client!cia", name = "g", descriptor = "I")
	private final int anInt1247;

	@OriginalMember(owner = "client!cia", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(Lclient!de;IZ[[I)V")
	public Class52_Sub1(@OriginalArg(0) Class67_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static557.aClass145_14, Static438.aClass261_14, arg2 && arg0.aBoolean180, arg1 * arg1 * 6);
		this.anInt1247 = arg1;
		if (this.aBoolean450) {
			this.anIDirect3DCubeTexture1 = this.aClass67_Sub1_Sub1_4.anIDirect3DDevice1.a(this.anInt1247, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass67_Sub1_Sub1_4.anIDirect3DDevice1.a(this.anInt1247, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass67_Sub1_Sub1_4.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt1247, this.anInt1247, 0, local52);
			if (ala.a(local71, -1)) {
				@Pc(78) int local78 = local52.getRowPitch();
				if (local78 == this.anInt1247 * 4) {
					local52.b(arg3[local54], 0, 0, this.anInt1247 * this.anInt1247);
				} else {
					for (@Pc(104) int local104 = 0; local104 < this.anInt1247; local104++) {
						local52.b(arg3[local54], local104 * this.anInt1247, local104 * local78, this.anInt1247);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(Z)V")
	@Override
	public void method9257() {
		this.aClass67_Sub1_Sub1_4.method1921(this);
	}

	@OriginalMember(owner = "client!cia", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method4344() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(Lclient!vea;I)V")
	@Override
	public void method9258(@OriginalArg(0) Class384 arg0) {
		super.method9258(arg0);
	}
}

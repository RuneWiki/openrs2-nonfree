import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.pda;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oga")
public final class Class38_Sub2 extends Class38 implements Interface20 {

	@OriginalMember(owner = "client!oga", name = "h", descriptor = "I")
	private final int anInt7062;

	@OriginalMember(owner = "client!oga", name = "f", descriptor = "I")
	private final int anInt7060;

	@OriginalMember(owner = "client!oga", name = "g", descriptor = "I")
	private final int anInt7061;

	@OriginalMember(owner = "client!oga", name = "i", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Lclient!uda;Lclient!g;III[B)V")
	public Class38_Sub2(@OriginalArg(0) Class95_Sub1_Sub2 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static666.aClass389_16, false, arg2 * arg3 * arg4);
		this.anInt7062 = arg2;
		this.anInt7060 = arg3;
		this.anInt7061 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass95_Sub1_Sub2_7.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static602.method8215(this.aClass389_8, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass95_Sub1_Sub2_7.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (pda.a(local53, 17527)) {
			@Pc(65) int local65 = this.anInt7062 * this.aClass122_16.anInt3389;
			@Pc(70) int local70 = local65 * this.anInt7060;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local73 == local70) {
				local40.a((byte[]) arg5, 0, 0, this.anInt7061 * local65 * this.anInt7060);
			} else {
				@Pc(79) int local79 = local40.getRowPitch();
				@Pc(88) int local88;
				if (local65 == local79) {
					for (local88 = 0; local88 < this.anInt7061; local88++) {
						local40.a(arg5, local88 * local70, local88 * local73, local70);
					}
				} else {
					for (local88 = 0; local88 < this.anInt7061; local88++) {
						for (@Pc(98) int local98 = 0; local98 < this.anInt7060; local98++) {
							local40.a(arg5, local65 * local98 + local70 * local88, local79 * local98 + local73 * local88, local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)V")
	@Override
	public void method7463() {
		this.aClass95_Sub1_Sub2_7.method8221(this);
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(BLclient!ag;)V")
	@Override
	public void method7462(@OriginalArg(1) Class8 arg0) {
		super.method7462(arg0);
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6846() {
		return this.anIDirect3DVolumeTexture1;
	}
}

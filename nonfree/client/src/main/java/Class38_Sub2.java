import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.kg;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oha")
public final class Class38_Sub2 extends Class38 implements Interface11 {

	@OriginalMember(owner = "client!oha", name = "h", descriptor = "I")
	private final int anInt7490;

	@OriginalMember(owner = "client!oha", name = "i", descriptor = "I")
	private final int anInt7491;

	@OriginalMember(owner = "client!oha", name = "g", descriptor = "I")
	private final int anInt7489;

	@OriginalMember(owner = "client!oha", name = "f", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lclient!bea;Lclient!kt;III[B)V")
	public Class38_Sub2(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static302.aClass176_8, false, arg4 * arg2 * arg3);
		this.anInt7490 = arg3;
		this.anInt7491 = arg4;
		this.anInt7489 = arg2;
		this.anIDirect3DVolumeTexture1 = this.aClass5_Sub2_Sub1_9.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static36.method1272(arg1, this.aClass176_19), 1);
		@Pc(40) PixelBuffer local40 = this.aClass5_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (kg.a(-21593, local53)) {
			@Pc(65) int local65 = this.anInt7489 * this.aClass178_14.anInt6173;
			@Pc(70) int local70 = local65 * this.anInt7490;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local73 == local70) {
				local40.a((byte[]) arg5, 0, 0, this.anInt7490 * local65 * this.anInt7491);
			} else {
				@Pc(92) int local92 = local40.getRowPitch();
				@Pc(101) int local101;
				if (local92 == local65) {
					for (local101 = 0; local101 < this.anInt7491; local101++) {
						local40.a(arg5, local101 * local70, local101 * local73, local70);
					}
				} else {
					for (local101 = 0; local101 < this.anInt7491; local101++) {
						for (@Pc(130) int local130 = 0; local130 < this.anInt7490; local130++) {
							local40.a(arg5, local130 * local65 + local70 * local101, local130 * local92 + local73 * local101, local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(BLclient!nd;)V")
	@Override
	public void method8610(@OriginalArg(1) Class216 arg0) {
		super.method8610(arg0);
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8444() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
	@Override
	public void method8611() {
		this.aClass5_Sub2_Sub1_9.method1275(this);
	}
}

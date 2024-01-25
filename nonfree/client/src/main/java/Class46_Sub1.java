import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.co;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class46_Sub1 extends Class46 implements Interface15 {

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
	private final int anInt1364;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	private final int anInt1365;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
	private final int anInt1363;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!fi;Lclient!pd;III[B)V")
	public Class46_Sub1(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static409.aClass242_13, false, arg4 * arg2 * arg3);
		this.anInt1364 = arg4;
		this.anInt1365 = arg3;
		this.anInt1363 = arg2;
		this.anIDirect3DVolumeTexture1 = this.aClass100_Sub1_Sub1_7.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static157.method2992(arg1, this.aClass242_9), 1);
		@Pc(40) PixelBuffer local40 = this.aClass100_Sub1_Sub1_7.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (co.a((byte) 55, local53)) {
			@Pc(65) int local65 = this.aClass250_10.anInt7790 * this.anInt1363;
			@Pc(70) int local70 = this.anInt1365 * local65;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local73 == local70) {
				local40.a((byte[]) arg5, 0, 0, this.anInt1364 * this.anInt1365 * local65);
			} else {
				@Pc(92) int local92 = local40.getRowPitch();
				@Pc(101) int local101;
				if (local65 == local92) {
					for (local101 = 0; local101 < this.anInt1364; local101++) {
						local40.a(arg5, local70 * local101, local101 * local73, local70);
					}
				} else {
					for (local101 = 0; local101 < this.anInt1364; local101++) {
						for (@Pc(130) int local130 = 0; local130 < this.anInt1365; local130++) {
							local40.a(arg5, local65 * local130 + local101 * local70, local73 * local101 + local92 * local130, local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	@Override
	public void method7826() {
		this.aClass100_Sub1_Sub1_7.method2988(this);
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method4660() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLclient!ej;)V")
	@Override
	public void method7827(@OriginalArg(1) Class82 arg0) {
		super.method7827(arg0);
	}
}

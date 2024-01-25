import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.gfa;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class168_Sub1 extends Class168 implements Interface15 {

	@OriginalMember(owner = "client!it", name = "i", descriptor = "I")
	private final int anInt3960;

	@OriginalMember(owner = "client!it", name = "g", descriptor = "I")
	private final int anInt3958;

	@OriginalMember(owner = "client!it", name = "h", descriptor = "I")
	private final int anInt3959;

	@OriginalMember(owner = "client!it", name = "f", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!ik;Lclient!wu;III[B)V")
	public Class168_Sub1(@OriginalArg(0) Class162_Sub1_Sub1 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static42.aClass35_4, false, arg2 * arg3 * arg4);
		this.anInt3960 = arg3;
		this.anInt3958 = arg4;
		this.anInt3959 = arg2;
		this.anIDirect3DVolumeTexture1 = this.aClass162_Sub1_Sub1_9.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static231.method3307(arg1, this.aClass35_20), 1);
		@Pc(40) PixelBuffer local40 = this.aClass162_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (gfa.a(local53, (int) 10067)) {
			@Pc(65) int local65 = this.anInt3959 * this.aClass366_15.anInt9633;
			@Pc(70) int local70 = local65 * this.anInt3960;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local73 == local70) {
				local40.a((byte[]) arg5, 0, 0, local65 * this.anInt3960 * this.anInt3958);
			} else {
				@Pc(83) int local83 = local40.getRowPitch();
				@Pc(88) int local88;
				if (local83 == local65) {
					for (local88 = 0; local88 < this.anInt3958; local88++) {
						local40.a(arg5, local88 * local70, local73 * local88, local70);
					}
				} else {
					for (local88 = 0; local88 < this.anInt3958; local88++) {
						for (@Pc(117) int local117 = 0; local117 < this.anInt3960; local117++) {
							local40.a(arg5, local117 * local65 + local70 * local88, local83 * local117 + local73 * local88, local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!kk;I)V")
	@Override
	public void method7634(@OriginalArg(0) Class195 arg0) {
		super.method7634(arg0);
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
	@Override
	public void method7635() {
		this.aClass162_Sub1_Sub1_9.method3309(this);
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7633() {
		return this.anIDirect3DVolumeTexture1;
	}
}

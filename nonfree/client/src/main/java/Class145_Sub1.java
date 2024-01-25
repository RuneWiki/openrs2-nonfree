import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.aha;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class145_Sub1 extends Class145 implements Interface7 {

	@OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
	private final int anInt3398;

	@OriginalMember(owner = "client!hca", name = "h", descriptor = "I")
	private final int anInt3397;

	@OriginalMember(owner = "client!hca", name = "g", descriptor = "I")
	private final int anInt3396;

	@OriginalMember(owner = "client!hca", name = "f", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Lclient!us;Lclient!pe;III[B)V")
	public Class145_Sub1(@OriginalArg(0) Class33_Sub2_Sub2 arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static111.aClass79_7, false, arg2 * arg3 * arg4);
		this.anInt3398 = arg2;
		this.anInt3397 = arg3;
		this.anInt3396 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass33_Sub2_Sub2_7.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static616.method8295(arg1, this.aClass79_18), 1);
		@Pc(40) PixelBuffer local40 = this.aClass33_Sub2_Sub2_7.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (aha.a(-1, local53)) {
			@Pc(65) int local65 = this.aClass276_16.anInt7331 * this.anInt3398;
			@Pc(70) int local70 = local65 * this.anInt3397;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local73 == local70) {
				local40.a((byte[]) arg5, 0, 0, local65 * this.anInt3397 * this.anInt3396);
			} else {
				@Pc(79) int local79 = local40.getRowPitch();
				@Pc(88) int local88;
				if (local79 == local65) {
					for (local88 = 0; local88 < this.anInt3396; local88++) {
						local40.a(arg5, local88 * local70, local88 * local73, local70);
					}
				} else {
					for (local88 = 0; local88 < this.anInt3396; local88++) {
						for (@Pc(94) int local94 = 0; local94 < this.anInt3397; local94++) {
							local40.a(arg5, local70 * local88 + local65 * local94, local79 * local94 + local73 * local88, local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!ko;I)V")
	@Override
	public void method8612(@OriginalArg(0) Class198 arg0) {
		super.method8612(arg0);
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6705() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "(I)V")
	@Override
	public void method8613() {
		this.aClass33_Sub2_Sub2_7.method8297(this);
	}
}

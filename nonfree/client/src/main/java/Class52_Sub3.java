import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.ala;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class52_Sub3 extends Class52 implements Interface1 {

	@OriginalMember(owner = "client!iw", name = "i", descriptor = "I")
	private final int anInt5200;

	@OriginalMember(owner = "client!iw", name = "h", descriptor = "I")
	private final int anInt5201;

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "I")
	private final int anInt5202;

	@OriginalMember(owner = "client!iw", name = "g", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lclient!de;Lclient!hd;III[B)V")
	public Class52_Sub3(@OriginalArg(0) Class67_Sub1_Sub1 arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static438.aClass261_14, false, arg3 * arg2 * arg4);
		this.anInt5200 = arg3;
		this.anInt5201 = arg2;
		this.anInt5202 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass67_Sub1_Sub1_4.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static107.method1928(this.aClass261_8, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass67_Sub1_Sub1_4.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (ala.a(local53, -1)) {
			@Pc(66) int local66 = this.aClass145_8.anInt4448 * this.anInt5201;
			@Pc(71) int local71 = local66 * this.anInt5200;
			@Pc(74) int local74 = local40.getSlicePitch();
			if (local71 == local74) {
				local40.a((byte[]) arg5, 0, 0, this.anInt5200 * local66 * this.anInt5202);
			} else {
				@Pc(80) int local80 = local40.getRowPitch();
				@Pc(85) int local85;
				if (local80 == local66) {
					for (local85 = 0; local85 < this.anInt5202; local85++) {
						local40.a(arg5, local71 * local85, local74 * local85, local71);
					}
				} else {
					for (local85 = 0; local85 < this.anInt5202; local85++) {
						for (@Pc(95) int local95 = 0; local95 < this.anInt5200; local95++) {
							local40.a(arg5, local66 * local95 + local85 * local71, local74 * local85 - -(local95 * local80), local66);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method4344() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Z)V")
	@Override
	public void method9257() {
		this.aClass67_Sub1_Sub1_4.method1924(this);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!vea;I)V")
	@Override
	public void method9258(@OriginalArg(0) Class384 arg0) {
		super.method9258(arg0);
	}
}

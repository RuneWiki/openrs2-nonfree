import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.gh;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class33_Sub2 extends Class33 implements Interface14 {

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
	private final int anInt4981;

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
	private final int anInt4982;

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
	private final int anInt4980;

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!er;Lclient!ua;III[B)V")
	public Class33_Sub2(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class358 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static104.aClass86_8, false, arg4 * arg2 * arg3);
		this.anInt4981 = arg4;
		this.anInt4982 = arg2;
		this.anInt4980 = arg3;
		this.anIDirect3DVolumeTexture1 = this.aClass100_Sub1_Sub1_6.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static136.method2539(this.aClass86_18, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass100_Sub1_Sub1_6.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (gh.a(-2005530585, local53)) {
			@Pc(66) int local66 = this.anInt4982 * this.aClass358_15.anInt9551;
			@Pc(71) int local71 = this.anInt4980 * local66;
			@Pc(74) int local74 = local40.getSlicePitch();
			if (local71 == local74) {
				local40.a((byte[]) arg5, 0, 0, this.anInt4981 * this.anInt4980 * local66);
			} else {
				@Pc(98) int local98 = local40.getRowPitch();
				@Pc(103) int local103;
				if (local98 == local66) {
					for (local103 = 0; local103 < this.anInt4981; local103++) {
						local40.a(arg5, local103 * local71, local103 * local74, local71);
					}
				} else {
					for (local103 = 0; local103 < this.anInt4981; local103++) {
						for (@Pc(133) int local133 = 0; local133 < this.anInt4980; local133++) {
							local40.a(arg5, local103 * local71 + local133 * local66, local133 * local98 + local103 * local74, local66);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
	@Override
	public void method8895() {
		this.aClass100_Sub1_Sub1_6.method2538(this);
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6164() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILclient!se;)V")
	@Override
	public void method8896(@OriginalArg(1) Class328 arg0) {
		super.method8896(arg0);
	}
}

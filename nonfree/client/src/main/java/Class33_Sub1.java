import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.wd;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bha")
public final class Class33_Sub1 extends Class33 implements Interface5 {

	@OriginalMember(owner = "client!bha", name = "i", descriptor = "I")
	private final int anInt808;

	@OriginalMember(owner = "client!bha", name = "f", descriptor = "I")
	private final int anInt806;

	@OriginalMember(owner = "client!bha", name = "g", descriptor = "I")
	private final int anInt807;

	@OriginalMember(owner = "client!bha", name = "h", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(Lclient!rd;Lclient!kea;III[B)V")
	public Class33_Sub1(@OriginalArg(0) Class95_Sub3_Sub1 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static290.aClass189_11, false, arg3 * arg2 * arg4);
		this.anInt808 = arg3;
		this.anInt806 = arg4;
		this.anInt807 = arg2;
		this.anIDirect3DVolumeTexture1 = this.aClass95_Sub3_Sub1_8.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static484.method6732(this.aClass189_20, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass95_Sub3_Sub1_8.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (wd.a(111, (int) local53)) {
			@Pc(64) int local64 = this.aClass188_14.anInt4725 * this.anInt807;
			@Pc(69) int local69 = this.anInt808 * local64;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local69 == local72) {
				local40.a((byte[]) arg5, 0, 0, this.anInt806 * local64 * this.anInt808);
			} else {
				@Pc(91) int local91 = local40.getRowPitch();
				@Pc(96) int local96;
				if (local91 == local64) {
					for (local96 = 0; local96 < this.anInt806; local96++) {
						local40.a(arg5, local96 * local69, local72 * local96, local69);
					}
				} else {
					for (local96 = 0; local96 < this.anInt806; local96++) {
						for (@Pc(125) int local125 = 0; local125 < this.anInt808; local125++) {
							local40.a(arg5, local69 * local96 + local125 * local64, local91 * local125 + local72 * local96, local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(I)V")
	@Override
	public void method7839() {
		this.aClass95_Sub3_Sub1_8.method6728(this);
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(BLclient!tb;)V")
	@Override
	public void method7837(@OriginalArg(1) Class328 arg0) {
		super.method7837(arg0);
	}

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7838() {
		return this.anIDirect3DVolumeTexture1;
	}
}

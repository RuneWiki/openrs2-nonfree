import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.dt;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class19_Sub2 extends Class19 implements Interface3 {

	@OriginalMember(owner = "client!de", name = "h", descriptor = "I")
	private final int anInt1875;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "I")
	private final int anInt1876;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "I")
	private final int anInt1874;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!hg;Lclient!g;III[B)V")
	public Class19_Sub2(@OriginalArg(0) Class4_Sub2_Sub1 arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static517.aClass308_15, false, arg3 * arg2 * arg4);
		this.anInt1875 = arg3;
		this.anInt1876 = arg4;
		this.anInt1874 = arg2;
		this.anIDirect3DVolumeTexture1 = this.aClass4_Sub2_Sub1_7.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static177.method3493(arg1, this.aClass308_9), 1);
		@Pc(40) PixelBuffer local40 = this.aClass4_Sub2_Sub1_7.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (dt.a(local53, -2005530590)) {
			@Pc(64) int local64 = this.anInt1874 * this.aClass110_18.anInt2917;
			@Pc(69) int local69 = this.anInt1875 * local64;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local72 == local69) {
				local40.a((byte[]) arg5, 0, 0, this.anInt1875 * local64 * this.anInt1876);
			} else {
				@Pc(82) int local82 = local40.getRowPitch();
				@Pc(91) int local91;
				if (local64 == local82) {
					for (local91 = 0; local91 < this.anInt1876; local91++) {
						local40.a(arg5, local91 * local69, local91 * local72, local69);
					}
				} else {
					for (local91 = 0; local91 < this.anInt1876; local91++) {
						for (@Pc(120) int local120 = 0; local120 < this.anInt1875; local120++) {
							local40.a(arg5, local64 * local120 + local91 * local69, local91 * local72 - -(local82 * local120), local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!ie;)V")
	@Override
	public void method7757(@OriginalArg(1) Class136 arg0) {
		super.method7757(arg0);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method5123() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V")
	@Override
	public void method7756() {
		this.aClass4_Sub2_Sub1_7.method3483(this);
	}
}

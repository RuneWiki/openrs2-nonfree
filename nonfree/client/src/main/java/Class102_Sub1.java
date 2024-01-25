import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.qr;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class102_Sub1 extends Class102 implements Interface6 {

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
	private final int anInt2659;

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
	private final int anInt2661;

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
	private final int anInt2660;

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!gaa;Lclient!ec;III[B)V")
	public Class102_Sub1(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static47.aClass42_4, false, arg3 * arg2 * arg4);
		this.anInt2659 = arg2;
		this.anInt2661 = arg3;
		this.anInt2660 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass100_Sub1_Sub1_8.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static160.method2855(arg1, this.aClass42_18), 1);
		@Pc(40) PixelBuffer local40 = this.aClass100_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (qr.a(local53, -2005530519)) {
			@Pc(64) int local64 = this.anInt2659 * this.aClass88_12.anInt2256;
			@Pc(69) int local69 = this.anInt2661 * local64;
			@Pc(72) int local72 = local40.getSlicePitch();
			if (local72 == local69) {
				local40.a((byte[]) arg5, 0, 0, this.anInt2660 * this.anInt2661 * local64);
			} else {
				@Pc(95) int local95 = local40.getRowPitch();
				@Pc(104) int local104;
				if (local95 == local64) {
					for (local104 = 0; local104 < this.anInt2660; local104++) {
						local40.a(arg5, local104 * local69, local104 * local72, local69);
					}
				} else {
					for (local104 = 0; local104 < this.anInt2660; local104++) {
						for (@Pc(129) int local129 = 0; local129 < this.anInt2661; local129++) {
							local40.a(arg5, local104 * local69 + local64 * local129, local129 * local95 + local72 * local104, local64);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	@Override
	public void method7049() {
		this.aClass100_Sub1_Sub1_8.method2847(this);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!mv;I)V")
	@Override
	public void method7050(@OriginalArg(0) Class227 arg0) {
		super.method7050(arg0);
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method5797() {
		return this.anIDirect3DVolumeTexture1;
	}
}

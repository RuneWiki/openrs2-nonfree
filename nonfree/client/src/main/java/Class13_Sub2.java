import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.pp;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class13_Sub2 extends Class13 implements Interface17 {

	@OriginalMember(owner = "client!eca", name = "f", descriptor = "I")
	private final int anInt2963;

	@OriginalMember(owner = "client!eca", name = "i", descriptor = "I")
	private final int anInt2965;

	@OriginalMember(owner = "client!eca", name = "h", descriptor = "I")
	private final int anInt2964;

	@OriginalMember(owner = "client!eca", name = "g", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!cu;Lclient!em;III[B)V")
	public Class13_Sub2(@OriginalArg(0) Class33_Sub1_Sub2 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static137.aClass89_8, false, arg4 * arg2 * arg3);
		this.anInt2963 = arg2;
		this.anInt2965 = arg3;
		this.anInt2964 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass33_Sub1_Sub2_7.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static80.method2127(this.aClass89_18, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass33_Sub1_Sub2_7.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (pp.a(false, local53)) {
			@Pc(65) int local65 = this.aClass82_14.anInt3195 * this.anInt2963;
			@Pc(70) int local70 = this.anInt2965 * local65;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local73 == local70) {
				local40.a((byte[]) arg5, 0, 0, this.anInt2965 * local65 * this.anInt2964);
			} else {
				@Pc(96) int local96 = local40.getRowPitch();
				@Pc(101) int local101;
				if (local96 == local65) {
					for (local101 = 0; local101 < this.anInt2964; local101++) {
						local40.a(arg5, local70 * local101, local101 * local73, local70);
					}
				} else {
					for (local101 = 0; local101 < this.anInt2964; local101++) {
						for (@Pc(111) int local111 = 0; local111 < this.anInt2965; local111++) {
							local40.a(arg5, local70 * local101 + local65 * local111, local101 * local73 + local111 * local96, local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!bba;I)V")
	@Override
	public void method7294(@OriginalArg(0) Class26 arg0) {
		super.method7294(arg0);
	}

	@OriginalMember(owner = "client!eca", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6679() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "(I)V")
	@Override
	public void method7293() {
		this.aClass33_Sub1_Sub2_7.method2123(this);
	}
}

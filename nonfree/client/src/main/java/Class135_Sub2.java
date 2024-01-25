import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.ud;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lba")
public final class Class135_Sub2 extends Class135 implements Interface21 {

	@OriginalMember(owner = "client!lba", name = "h", descriptor = "I")
	private final int anInt5491;

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "I")
	private final int anInt5490;

	@OriginalMember(owner = "client!lba", name = "i", descriptor = "I")
	private final int anInt5492;

	@OriginalMember(owner = "client!lba", name = "g", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Lclient!rja;Lclient!sw;III[B)V")
	public Class135_Sub2(@OriginalArg(0) Class13_Sub1_Sub2 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static246.aClass152_10, false, arg2 * arg3 * arg4);
		this.anInt5491 = arg3;
		this.anInt5490 = arg2;
		this.anInt5492 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass13_Sub1_Sub2_4.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static525.method7553(arg1, this.aClass152_18), 1);
		@Pc(40) PixelBuffer local40 = this.aClass13_Sub1_Sub2_4.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (ud.a(0, (int) local53)) {
			@Pc(65) int local65 = this.aClass327_15.anInt9117 * this.anInt5490;
			@Pc(70) int local70 = local65 * this.anInt5491;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local73 == local70) {
				local40.a((byte[]) arg5, 0, 0, this.anInt5492 * this.anInt5491 * local65);
			} else {
				@Pc(79) int local79 = local40.getRowPitch();
				@Pc(88) int local88;
				if (local79 == local65) {
					for (local88 = 0; local88 < this.anInt5492; local88++) {
						local40.a(arg5, local70 * local88, local73 * local88, local70);
					}
				} else {
					for (local88 = 0; local88 < this.anInt5492; local88++) {
						for (@Pc(121) int local121 = 0; local121 < this.anInt5491; local121++) {
							local40.a(arg5, local88 * local70 + local121 * local65, local73 * local88 + local121 * local79, local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method5798() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILclient!wga;)V")
	@Override
	public void method8137(@OriginalArg(1) Class385 arg0) {
		super.method8137(arg0);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
	@Override
	public void method8138() {
		this.aClass13_Sub1_Sub2_4.method7556(this);
	}
}

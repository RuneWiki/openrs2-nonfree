import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.fo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class21_Sub1 extends Class21 implements Interface18 {

	@OriginalMember(owner = "client!av", name = "h", descriptor = "I")
	private final int anInt1012;

	@OriginalMember(owner = "client!av", name = "f", descriptor = "I")
	private final int anInt1011;

	@OriginalMember(owner = "client!av", name = "i", descriptor = "I")
	private final int anInt1013;

	@OriginalMember(owner = "client!av", name = "g", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lclient!wda;Lclient!aq;III[B)V")
	public Class21_Sub1(@OriginalArg(0) Class9_Sub1_Sub2 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static489.aClass289_13, false, arg4 * arg2 * arg3);
		this.anInt1012 = arg4;
		this.anInt1011 = arg2;
		this.anInt1013 = arg3;
		this.anIDirect3DVolumeTexture1 = this.aClass9_Sub1_Sub2_6.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static532.method7780(this.aClass289_8, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass9_Sub1_Sub2_6.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (fo.a(local53, (byte) 52)) {
			@Pc(65) int local65 = this.anInt1011 * this.aClass16_18.anInt871;
			@Pc(70) int local70 = this.anInt1013 * local65;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local70 == local73) {
				local40.a((byte[]) arg5, 0, 0, local65 * this.anInt1013 * this.anInt1012);
			} else {
				@Pc(83) int local83 = local40.getRowPitch();
				@Pc(88) int local88;
				if (local65 == local83) {
					for (local88 = 0; local88 < this.anInt1012; local88++) {
						local40.a(arg5, local70 * local88, local88 * local73, local70);
					}
				} else {
					for (local88 = 0; local88 < this.anInt1012; local88++) {
						for (@Pc(117) int local117 = 0; local117 < this.anInt1013; local117++) {
							local40.a(arg5, local65 * local117 + local70 * local88, local83 * local117 + local88 * local73, local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(B)V")
	@Override
	public void method7954() {
		this.aClass9_Sub1_Sub2_6.method7787(this);
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6151() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!pw;I)V")
	@Override
	public void method7955(@OriginalArg(0) Class234 arg0) {
		super.method7955(arg0);
	}
}

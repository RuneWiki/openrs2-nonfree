import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.fe;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class172_Sub3 extends Class172 implements Interface17 {

	@OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
	private final int anInt7679;

	@OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
	private final int anInt7680;

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "I")
	private final int anInt7678;

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!de;Lclient!kl;III[B)V")
	public Class172_Sub3(@OriginalArg(0) Class62_Sub1_Sub1 arg0, @OriginalArg(1) Class174 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static523.aClass306_15, false, arg4 * arg2 * arg3);
		this.anInt7679 = arg2;
		this.anInt7680 = arg3;
		this.anInt7678 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass62_Sub1_Sub1_8.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static87.method1934(arg1, this.aClass306_10), 1);
		@Pc(40) PixelBuffer local40 = this.aClass62_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (fe.a((byte) -115, local53)) {
			@Pc(65) int local65 = this.anInt7679 * this.aClass174_13.anInt5166;
			@Pc(70) int local70 = local65 * this.anInt7680;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local70 == local73) {
				local40.a((byte[]) arg5, 0, 0, local65 * this.anInt7680 * this.anInt7678);
			} else {
				@Pc(83) int local83 = local40.getRowPitch();
				@Pc(92) int local92;
				if (local65 == local83) {
					for (local92 = 0; local92 < this.anInt7678; local92++) {
						local40.a(arg5, local70 * local92, local73 * local92, local70);
					}
				} else {
					for (local92 = 0; local92 < this.anInt7678; local92++) {
						for (@Pc(121) int local121 = 0; local121 < this.anInt7680; local121++) {
							local40.a(arg5, local70 * local92 + local65 * local121, local121 * local83 + local92 * local73, local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6219() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "(I)V")
	@Override
	public void method7439() {
		this.aClass62_Sub1_Sub1_8.method1929(this);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!em;I)V")
	@Override
	public void method7438(@OriginalArg(0) Class86 arg0) {
		super.method7438(arg0);
	}
}

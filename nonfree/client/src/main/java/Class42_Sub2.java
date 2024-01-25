import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.qi;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class42_Sub2 extends Class42 implements Interface14 {

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
	private final int anInt1931;

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
	private final int anInt1930;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
	private final int anInt1932;

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!eda;Lclient!sq;III[B)V")
	public Class42_Sub2(@OriginalArg(0) Class45_Sub2_Sub1 arg0, @OriginalArg(1) Class314 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static471.aClass298_15, false, arg4 * arg2 * arg3);
		this.anInt1931 = arg4;
		this.anInt1930 = arg2;
		this.anInt1932 = arg3;
		this.anIDirect3DVolumeTexture1 = this.aClass45_Sub2_Sub1_9.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static116.method2411(arg1, this.aClass298_20), 1);
		@Pc(40) PixelBuffer local40 = this.aClass45_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (qi.a((byte) 35, local53)) {
			@Pc(65) int local65 = this.aClass314_21.anInt8032 * this.anInt1930;
			@Pc(70) int local70 = this.anInt1932 * local65;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local73 == local70) {
				local40.a((byte[]) arg5, 0, 0, this.anInt1932 * local65 * this.anInt1931);
			} else {
				@Pc(92) int local92 = local40.getRowPitch();
				@Pc(101) int local101;
				if (local65 == local92) {
					for (local101 = 0; local101 < this.anInt1931; local101++) {
						local40.a(arg5, local101 * local70, local73 * local101, local70);
					}
				} else {
					for (local101 = 0; local101 < this.anInt1931; local101++) {
						for (@Pc(126) int local126 = 0; local126 < this.anInt1932; local126++) {
							local40.a(arg5, local101 * local70 + local126 * local65, local126 * local92 + local73 * local101, local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6964() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
	@Override
	public void method6965() {
		this.aClass45_Sub2_Sub1_9.method2406(this);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!dj;B)V")
	@Override
	public void method6963(@OriginalArg(0) Class71 arg0) {
		super.method6963(arg0);
	}
}

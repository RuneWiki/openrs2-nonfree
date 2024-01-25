import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.saa;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class21_Sub1 extends Class21 implements Interface1 {

	@OriginalMember(owner = "client!an", name = "i", descriptor = "I")
	private final int anInt501;

	@OriginalMember(owner = "client!an", name = "f", descriptor = "I")
	private final int anInt499;

	@OriginalMember(owner = "client!an", name = "g", descriptor = "I")
	private final int anInt500;

	@OriginalMember(owner = "client!an", name = "h", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!sga;Lclient!pb;III[B)V")
	public Class21_Sub1(@OriginalArg(0) Class132_Sub1_Sub2 arg0, @OriginalArg(1) Class265 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static417.aClass250_14, false, arg4 * arg3 * arg2);
		this.anInt501 = arg3;
		this.anInt499 = arg2;
		this.anInt500 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass132_Sub1_Sub2_9.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static537.method7654(arg1, this.aClass250_20), 1);
		@Pc(40) PixelBuffer local40 = this.aClass132_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (saa.b(local53, (byte) -109)) {
			@Pc(65) int local65 = this.anInt499 * this.aClass265_18.anInt7469;
			@Pc(70) int local70 = local65 * this.anInt501;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local73 == local70) {
				local40.a((byte[]) arg5, 0, 0, local65 * this.anInt501 * this.anInt500);
			} else {
				@Pc(92) int local92 = local40.getRowPitch();
				@Pc(97) int local97;
				if (local92 == local65) {
					for (local97 = 0; local97 < this.anInt500; local97++) {
						local40.a(arg5, local70 * local97, local97 * local73, local70);
					}
				} else {
					for (local97 = 0; local97 < this.anInt500; local97++) {
						for (@Pc(122) int local122 = 0; local122 < this.anInt501; local122++) {
							local40.a(arg5, local97 * local70 + local65 * local122, local92 * local122 + local97 * local73, local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BLclient!cw;)V")
	@Override
	public void method8893(@OriginalArg(1) Class59 arg0) {
		super.method8893(arg0);
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8894() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V")
	@Override
	public void method8895() {
		this.aClass132_Sub1_Sub2_9.method7661(this);
	}
}

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.dm;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class139_Sub1 extends Class139 implements Interface15 {

	@OriginalMember(owner = "client!j", name = "f", descriptor = "I")
	private final int anInt3849;

	@OriginalMember(owner = "client!j", name = "i", descriptor = "I")
	private final int anInt3851;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "I")
	private final int anInt3850;

	@OriginalMember(owner = "client!j", name = "h", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!nca;Lclient!jt;III[B)V")
	public Class139_Sub1(@OriginalArg(0) Class39_Sub2_Sub1 arg0, @OriginalArg(1) Class150 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static268.aClass171_10, false, arg2 * arg3 * arg4);
		this.anInt3849 = arg3;
		this.anInt3851 = arg2;
		this.anInt3850 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass39_Sub2_Sub1_8.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static317.method5078(this.aClass171_18, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass39_Sub2_Sub1_8.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (dm.a((int) 7155, local53)) {
			@Pc(65) int local65 = this.anInt3851 * this.aClass150_14.anInt4202;
			@Pc(70) int local70 = this.anInt3849 * local65;
			@Pc(73) int local73 = local40.getSlicePitch();
			if (local70 == local73) {
				local40.a((byte[]) arg5, 0, 0, this.anInt3850 * local65 * this.anInt3849);
			} else {
				@Pc(96) int local96 = local40.getRowPitch();
				@Pc(101) int local101;
				if (local65 == local96) {
					for (local101 = 0; local101 < this.anInt3850; local101++) {
						local40.a(arg5, local101 * local70, local101 * local73, local70);
					}
				} else {
					for (local101 = 0; local101 < this.anInt3850; local101++) {
						for (@Pc(126) int local126 = 0; local126 < this.anInt3849; local126++) {
							local40.a(arg5, local126 * local65 + local101 * local70, local73 * local101 - -(local126 * local96), local65);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!qq;I)V")
	@Override
	public void method7130(@OriginalArg(0) Class240 arg0) {
		super.method7130(arg0);
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6781() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
	@Override
	public void method7131() {
		this.aClass39_Sub2_Sub1_8.method5081(this);
	}
}

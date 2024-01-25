import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.dm;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class139_Sub3 extends Class139 implements Interface4 {

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
	private final int anInt8099;

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lclient!nca;IZ[[I)V")
	public Class139_Sub3(@OriginalArg(0) Class39_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static51.aClass150_1, Static268.aClass171_10, arg2 && arg0.aBoolean442, arg1 * 6 * arg1);
		this.anInt8099 = arg1;
		if (this.aBoolean595) {
			this.anIDirect3DCubeTexture1 = this.aClass39_Sub2_Sub1_8.anIDirect3DDevice1.a(this.anInt8099, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass39_Sub2_Sub1_8.anIDirect3DDevice1.a(this.anInt8099, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass39_Sub2_Sub1_8.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt8099, this.anInt8099, 0, local52);
			if (dm.a((int) 7155, local73)) {
				@Pc(80) int local80 = local52.getRowPitch();
				if (this.anInt8099 * 4 == local80) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt8099 * this.anInt8099);
				} else {
					for (@Pc(101) int local101 = 0; local101 < this.anInt8099; local101++) {
						local52.a(arg3[local54], local101 * this.anInt8099, local101 * local80, this.anInt8099);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!qq;I)V")
	@Override
	public void method7130(@OriginalArg(0) Class240 arg0) {
		super.method7130(arg0);
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6781() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(I)V")
	@Override
	public void method7131() {
		this.aClass39_Sub2_Sub1_8.method5080(this);
	}
}

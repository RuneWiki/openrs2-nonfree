import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.qi;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class42_Sub1 extends Class42 implements Interface6 {

	@OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
	private final int anInt1118;

	@OriginalMember(owner = "client!bw", name = "g", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!eda;IZ[[I)V")
	public Class42_Sub1(@OriginalArg(0) Class45_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static469.aClass314_11, Static471.aClass298_15, arg2 && arg0.aBoolean223, arg1 * arg1 * 6);
		this.anInt1118 = arg1;
		if (this.aBoolean642) {
			this.anIDirect3DCubeTexture1 = this.aClass45_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt1118, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass45_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt1118, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass45_Sub2_Sub1_9.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(71) int local71 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt1118, this.anInt1118, 0, local52);
			if (qi.a((byte) 35, local71)) {
				@Pc(78) int local78 = local52.getRowPitch();
				if (this.anInt1118 * 4 == local78) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt1118 * this.anInt1118);
				} else {
					for (@Pc(99) int local99 = 0; local99 < this.anInt1118; local99++) {
						local52.a(arg3[local54], this.anInt1118 * local99, local78 * local99, this.anInt1118);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)V")
	@Override
	public void method6965() {
		this.aClass45_Sub2_Sub1_9.method2412(this);
	}

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6964() {
		return this.anIDirect3DCubeTexture1;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!dj;B)V")
	@Override
	public void method6963(@OriginalArg(0) Class71 arg0) {
		super.method6963(arg0);
	}
}

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.kg;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nea")
public final class Class38_Sub1 extends Class38 implements Interface24 {

	@OriginalMember(owner = "client!nea", name = "g", descriptor = "I")
	private final int anInt7065;

	@OriginalMember(owner = "client!nea", name = "f", descriptor = "Lclient!jagdx/IDirect3DCubeTexture;")
	private final IDirect3DCubeTexture anIDirect3DCubeTexture1;

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lclient!bea;IZ[[I)V")
	public Class38_Sub1(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Static120.aClass178_4, Static302.aClass176_8, arg2 && arg0.aBoolean130, arg1 * arg1 * 6);
		this.anInt7065 = arg1;
		if (this.aBoolean821) {
			this.anIDirect3DCubeTexture1 = this.aClass5_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt7065, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DCubeTexture1 = this.aClass5_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt7065, 1, 0, 21, 1);
		}
		@Pc(52) PixelBuffer local52 = this.aClass5_Sub2_Sub1_9.aPixelBuffer1;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			@Pc(73) int local73 = this.anIDirect3DCubeTexture1.LockRect(local54, 0, 0, 0, this.anInt7065, this.anInt7065, 0, local52);
			if (kg.a(-21593, local73)) {
				@Pc(80) int local80 = local52.getRowPitch();
				if (local80 == this.anInt7065 * 4) {
					local52.a((int[]) arg3[local54], 0, 0, this.anInt7065 * this.anInt7065);
				} else {
					for (@Pc(92) int local92 = 0; local92 < this.anInt7065; local92++) {
						local52.a(arg3[local54], this.anInt7065 * local92, local92 * local80, this.anInt7065);
					}
				}
				this.anIDirect3DCubeTexture1.UnlockRect(local54, 0);
			}
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V")
	@Override
	public void method8611() {
		this.aClass5_Sub2_Sub1_9.method1276(this);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(BLclient!nd;)V")
	@Override
	public void method8610(@OriginalArg(1) Class216 arg0) {
		super.method8610(arg0);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8444() {
		return this.anIDirect3DCubeTexture1;
	}
}

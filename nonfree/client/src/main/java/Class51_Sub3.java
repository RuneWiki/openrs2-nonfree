import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.hc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class51_Sub3 extends Class51 implements Interface19 {

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
	private final int anInt3203;

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
	private final int anInt3205;

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
	private final int anInt3204;

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!sd;Lclient!eu;III[B)V")
	public Class51_Sub3(@OriginalArg(0) Class57_Sub3_Sub2 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static453.aClass278_13, false, arg3 * arg2 * arg4);
		this.anInt3203 = arg2;
		this.anInt3205 = arg3;
		this.anInt3204 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass57_Sub3_Sub2_6.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static531.method7874(this.aClass278_7, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass57_Sub3_Sub2_6.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (hc.a(local53, true)) {
			@Pc(66) int local66 = this.anInt3203 * this.aClass114_8.anInt2411;
			@Pc(71) int local71 = this.anInt3205 * local66;
			@Pc(74) int local74 = local40.getSlicePitch();
			if (local74 == local71) {
				local40.a((byte[]) arg5, 0, 0, this.anInt3205 * local66 * this.anInt3204);
			} else {
				@Pc(84) int local84 = local40.getRowPitch();
				@Pc(93) int local93;
				if (local66 == local84) {
					for (local93 = 0; local93 < this.anInt3204; local93++) {
						local40.a(arg5, local93 * local71, local93 * local74, local71);
					}
				} else {
					for (local93 = 0; local93 < this.anInt3204; local93++) {
						for (@Pc(99) int local99 = 0; local99 < this.anInt3205; local99++) {
							local40.a(arg5, local93 * local71 + local66 * local99, local93 * local74 + local99 * local84, local66);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method2834() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	@Override
	public void method8305() {
		this.aClass57_Sub3_Sub2_6.method7873(this);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZLclient!li;)V")
	@Override
	public void method8306(@OriginalArg(1) Class216 arg0) {
		super.method8306(arg0);
	}
}

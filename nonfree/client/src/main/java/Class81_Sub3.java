import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.hia;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class81_Sub3 extends Class81 implements Interface18 {

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
	private final int anInt11009;

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
	private final int anInt11010;

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
	private final int anInt11008;

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!hda;Lclient!o;III[B)V")
	public Class81_Sub3(@OriginalArg(0) Class144_Sub1_Sub1 arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static18.aClass19_4, false, arg4 * arg2 * arg3);
		this.anInt11009 = arg4;
		this.anInt11010 = arg3;
		this.anInt11008 = arg2;
		this.anIDirect3DVolumeTexture1 = this.aClass144_Sub1_Sub1_9.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static215.method3733(arg1, this.aClass19_19), 1);
		@Pc(40) PixelBuffer local40 = this.aClass144_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (hia.a(local53, (byte) -123)) {
			@Pc(66) int local66 = this.anInt11008 * this.aClass260_14.anInt7205;
			@Pc(71) int local71 = this.anInt11010 * local66;
			@Pc(74) int local74 = local40.getSlicePitch();
			if (local71 == local74) {
				local40.a((byte[]) arg5, 0, 0, this.anInt11009 * this.anInt11010 * local66);
			} else {
				@Pc(98) int local98 = local40.getRowPitch();
				@Pc(107) int local107;
				if (local98 == local66) {
					for (local107 = 0; local107 < this.anInt11009; local107++) {
						local40.a(arg5, local107 * local71, local74 * local107, local71);
					}
				} else {
					for (local107 = 0; local107 < this.anInt11009; local107++) {
						for (@Pc(117) int local117 = 0; local117 < this.anInt11010; local117++) {
							local40.a(arg5, local117 * local66 + local107 * local71, local98 * local117 + local74 * local107, local66);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method9339() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
	@Override
	public void method9348() {
		this.aClass144_Sub1_Sub1_9.method3739(this);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLclient!gk;)V")
	@Override
	public void method9349(@OriginalArg(1) Class137 arg0) {
		super.method9349(arg0);
	}
}

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.uo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sca")
public final class Class77_Sub2 extends Class77 implements Interface7 {

	@OriginalMember(owner = "client!sca", name = "g", descriptor = "I")
	private final int anInt9045;

	@OriginalMember(owner = "client!sca", name = "i", descriptor = "I")
	private final int anInt9046;

	@OriginalMember(owner = "client!sca", name = "h", descriptor = "I")
	private final int anInt9044;

	@OriginalMember(owner = "client!sca", name = "f", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lclient!wu;Lclient!pm;III[B)V")
	public Class77_Sub2(@OriginalArg(0) Class145_Sub1_Sub2 arg0, @OriginalArg(1) Class295 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static243.aClass158_10, false, arg4 * arg2 * arg3);
		this.anInt9045 = arg3;
		this.anInt9046 = arg2;
		this.anInt9044 = arg4;
		this.anIDirect3DVolumeTexture1 = this.aClass145_Sub1_Sub2_9.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static725.method9866(this.aClass158_20, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass145_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (uo.a(local53, true)) {
			@Pc(66) int local66 = this.aClass295_15.anInt7929 * this.anInt9046;
			@Pc(71) int local71 = this.anInt9045 * local66;
			@Pc(74) int local74 = local40.getSlicePitch();
			if (local71 == local74) {
				local40.a((byte[]) arg5, 0, 0, this.anInt9044 * local66 * this.anInt9045);
			} else {
				@Pc(94) int local94 = local40.getRowPitch();
				@Pc(99) int local99;
				if (local66 == local94) {
					for (local99 = 0; local99 < this.anInt9044; local99++) {
						local40.a(arg5, local99 * local71, local74 * local99, local71);
					}
				} else {
					for (local99 = 0; local99 < this.anInt9044; local99++) {
						for (@Pc(129) int local129 = 0; local129 < this.anInt9045; local129++) {
							local40.a(arg5, local71 * local99 + local66 * local129, local74 * local99 - -(local129 * local94), local66);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)V")
	@Override
	public void method8449() {
		this.aClass145_Sub1_Sub2_9.method9859(this);
	}

	@OriginalMember(owner = "client!sca", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8447() {
		return this.anIDirect3DVolumeTexture1;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!wh;Z)V")
	@Override
	public void method8448(@OriginalArg(0) Class400 arg0) {
		super.method8448(arg0);
	}
}

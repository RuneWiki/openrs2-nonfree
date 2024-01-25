import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.fma;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class217_Sub1 extends Class217 implements Interface19 {

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
	private final int anInt5618;

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
	private final int anInt5619;

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
	private final int anInt5617;

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!tha;Lclient!sca;III[B)V")
	public Class217_Sub1(@OriginalArg(0) Class22_Sub2_Sub1 arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static259.aClass167_7, false, arg3 * arg2 * arg4);
		this.anInt5618 = arg4;
		this.anInt5619 = arg2;
		this.anInt5617 = arg3;
		this.anIDirect3DVolumeTexture1 = this.aClass22_Sub2_Sub1_9.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static622.method8193(this.aClass167_20, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass22_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (fma.a(local53, (byte) -34)) {
			@Pc(66) int local66 = this.anInt5619 * this.aClass335_18.anInt8864;
			@Pc(71) int local71 = this.anInt5617 * local66;
			@Pc(74) int local74 = local40.getSlicePitch();
			if (local71 == local74) {
				local40.a((byte[]) arg5, 0, 0, this.anInt5617 * local66 * this.anInt5618);
			} else {
				@Pc(94) int local94 = local40.getRowPitch();
				@Pc(103) int local103;
				if (local66 == local94) {
					for (local103 = 0; local103 < this.anInt5618; local103++) {
						local40.a(arg5, local103 * local71, local74 * local103, local71);
					}
				} else {
					for (local103 = 0; local103 < this.anInt5618; local103++) {
						for (@Pc(133) int local133 = 0; local133 < this.anInt5617; local133++) {
							local40.a(arg5, local71 * local103 + local66 * local133, local74 * local103 - -(local94 * local133), local66);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!on;B)V")
	@Override
	public void method9229(@OriginalArg(0) Class280 arg0) {
		super.method9229(arg0);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V")
	@Override
	public void method9230() {
		this.aClass22_Sub2_Sub1_9.method8199(this);
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method9228() {
		return this.anIDirect3DVolumeTexture1;
	}
}

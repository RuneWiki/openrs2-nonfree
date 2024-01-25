import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.aha;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class145_Sub2 extends Class145 implements Interface1 {

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "Z")
	public boolean aBoolean425;

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "Z")
	public boolean aBoolean426;

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
	private final int anInt5649;

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
	private final int anInt5648;

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!us;Lclient!pe;Lclient!dw;II)V")
	public Class145_Sub2(@OriginalArg(0) Class33_Sub2_Sub2 arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) Class79 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass33_Sub2_Sub2_7.aBoolean756) {
			this.anInt5649 = arg4;
			this.anInt5648 = arg3;
		} else {
			this.anInt5648 = Static162.method2593(arg3);
			this.anInt5649 = Static162.method2593(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass33_Sub2_Sub2_7.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static616.method8295(this.aClass276_16, this.aClass79_18), 1);
	}

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!us;Lclient!pe;IIZ[BII)V")
	public Class145_Sub2(@OriginalArg(0) Class33_Sub2_Sub2 arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static111.aClass79_7, arg4 && arg0.aBoolean758, arg3 * arg2);
		if (this.aClass33_Sub2_Sub2_7.aBoolean756) {
			this.anInt5649 = arg3;
			this.anInt5648 = arg2;
		} else {
			this.anInt5648 = Static162.method2593(arg2);
			this.anInt5649 = Static162.method2593(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass33_Sub2_Sub2_7.anIDirect3DDevice1.a(this.anInt5648, this.anInt5649, 0, 1024, Static616.method8295(this.aClass276_16, Static111.aClass79_7), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass33_Sub2_Sub2_7.anIDirect3DDevice1.a(this.anInt5648, this.anInt5649, 1, 0, Static616.method8295(this.aClass276_16, Static111.aClass79_7), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass33_Sub2_Sub2_7.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (aha.a(-1, local90)) {
			@Pc(108) int local108 = arg2 * this.aClass276_16.anInt7331;
			@Pc(114) int local114 = arg2 * this.aClass276_16.anInt7331;
			@Pc(117) int local117 = local79.getRowPitch();
			if (local114 == local117 && local114 == local108) {
				local79.a((byte[]) arg5, arg6, 0, local114 * arg3);
			} else {
				for (@Pc(129) int local129 = 0; local129 < arg3; local129++) {
					local79.a(arg5, local108 * local129 + arg6, local129 * local117, local114);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!us;IIZ[III)V")
	public Class145_Sub2(@OriginalArg(0) Class33_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static220.aClass276_11, Static111.aClass79_7, arg3 && arg0.aBoolean758, arg2 * arg1);
		if (this.aClass33_Sub2_Sub2_7.aBoolean756) {
			this.anInt5648 = arg1;
			this.anInt5649 = arg2;
		} else {
			this.anInt5648 = Static162.method2593(arg1);
			this.anInt5649 = Static162.method2593(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass33_Sub2_Sub2_7.anIDirect3DDevice1.a(this.anInt5648, this.anInt5649, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass33_Sub2_Sub2_7.anIDirect3DDevice1.a(this.anInt5648, this.anInt5649, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass33_Sub2_Sub2_7.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (aha.a(-1, local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(95) int local95 = local71.getRowPitch();
			if (arg1 * 4 == local95 && arg6 == arg1) {
				local71.b(arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(109) int local109 = 0; local109 < arg2; local109++) {
					local71.b(arg4, arg6 * local109 + arg5, local95 * local109, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII[BILclient!pe;II)V")
	@Override
	public void method8626(@OriginalArg(4) byte[] arg0, @OriginalArg(5) int arg1, @OriginalArg(6) Class276 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4) {
		if (arg2 != this.aClass276_16 || this.aClass79_18 != Static111.aClass79_7) {
			throw new RuntimeException();
		}
		@Pc(22) PixelBuffer local22 = this.aClass33_Sub2_Sub2_7.aPixelBuffer1;
		@Pc(33) int local33 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg3, arg4, 0, local22);
		if (!aha.a(-1, local33)) {
			return;
		}
		@Pc(45) int local45 = arg1 * this.aClass276_16.anInt7331;
		@Pc(51) int local51 = arg3 * this.aClass276_16.anInt7331;
		@Pc(54) int local54 = local22.getRowPitch();
		if (local51 == local54 && local51 == local45) {
			local22.a((byte[]) arg0, 0, 0, arg4 * local51);
		} else {
			for (@Pc(75) int local75 = 0; local75 < arg4; local75++) {
				local22.a(arg0, local45 * local75, local75 * local54, local51);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII[IBI)V")
	@Override
	public void method8624(@OriginalArg(3) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(6) int arg2) {
		if (this.aClass276_16 != Static220.aClass276_11 || this.aClass79_18 != Static111.aClass79_7) {
			throw new RuntimeException();
		}
		@Pc(22) PixelBuffer local22 = this.aClass33_Sub2_Sub2_7.aPixelBuffer1;
		@Pc(33) int local33 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg0, arg2, 16, local22);
		if (!aha.a(-1, local33)) {
			return;
		}
		@Pc(41) int local41 = local22.getRowPitch();
		if (local41 == arg0 * 4) {
			local22.a((int[]) arg1, 0, 0, arg1.length);
		} else {
			for (@Pc(48) int local48 = 0; local48 < arg2; local48++) {
				local22.a(arg1, arg0 * local48, local48 * local41, arg0);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)I")
	@Override
	public int method8630() {
		return this.anInt5648;
	}

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)V")
	@Override
	public void method8613() {
		this.aClass33_Sub2_Sub2_7.method8294(this);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZZB)V")
	@Override
	public void method8629(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean425 = arg1;
		this.aBoolean426 = arg0;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6705() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)I")
	@Override
	public int method8628() {
		return this.anInt5649;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII[IIBI)V")
	@Override
	public void method8625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (Static220.aClass276_11 != this.aClass276_16 || Static111.aClass79_7 != this.aClass79_18) {
			throw new RuntimeException();
		}
		@Pc(24) PixelBuffer local24 = this.aClass33_Sub2_Sub2_7.aPixelBuffer1;
		@Pc(35) int local35 = this.anIDirect3DTexture1.LockRect(0, arg1, arg5, arg0, arg2, 0, local24);
		if (!aha.a(-1, local35)) {
			return;
		}
		@Pc(42) int local42 = local24.getRowPitch();
		if (arg0 * 4 == local42 && arg4 == arg0) {
			local24.b(arg3, 0, 0, arg2 * arg0);
		} else {
			for (@Pc(52) int local52 = 0; local52 < arg2; local52++) {
				local24.b(arg3, local52 * arg4, local42 * local52, arg0);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!ko;I)V")
	@Override
	public void method8612(@OriginalArg(0) Class198 arg0) {
		super.method8612(arg0);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IF)F")
	@Override
	public float method8627(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt5648;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BF)F")
	@Override
	public float method8631(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt5649;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8623() {
		return true;
	}
}

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.pia;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class61_Sub2 extends Class61 implements Interface10 {

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "Z")
	public boolean aBoolean117;

	@OriginalMember(owner = "client!cw", name = "j", descriptor = "Z")
	public boolean aBoolean118;

	@OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
	private final int anInt1672;

	@OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
	private final int anInt1671;

	@OriginalMember(owner = "client!cw", name = "i", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!lj;Lclient!nea;IIZ[BII)V")
	public Class61_Sub2(@OriginalArg(0) Class101_Sub1_Sub2 arg0, @OriginalArg(1) Class244 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static114.aClass79_7, arg4 && arg0.aBoolean502, arg3 * arg2);
		if (this.aClass101_Sub1_Sub2_9.aBoolean503) {
			this.anInt1671 = arg3;
			this.anInt1672 = arg2;
		} else {
			this.anInt1672 = Static432.method7064(arg2);
			this.anInt1671 = Static432.method7064(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass101_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt1672, this.anInt1671, 0, 1024, Static344.method5970(this.aClass244_16, Static114.aClass79_7), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass101_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt1672, this.anInt1671, 1, 0, Static344.method5970(this.aClass244_16, Static114.aClass79_7), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass101_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (pia.a(-2005530600, local90)) {
			@Pc(107) int local107 = arg2 * this.aClass244_16.anInt7387;
			@Pc(113) int local113 = arg2 * this.aClass244_16.anInt7387;
			@Pc(116) int local116 = local79.getRowPitch();
			if (local116 == local113 && local113 == local107) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local113);
			} else {
				for (@Pc(128) int local128 = 0; local128 < arg3; local128++) {
					local79.a(arg5, arg6 + local107 * local128, local128 * local116, local113);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!lj;Lclient!nea;Lclient!dr;II)V")
	public Class61_Sub2(@OriginalArg(0) Class101_Sub1_Sub2 arg0, @OriginalArg(1) Class244 arg1, @OriginalArg(2) Class79 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass101_Sub1_Sub2_9.aBoolean503) {
			this.anInt1671 = arg4;
			this.anInt1672 = arg3;
		} else {
			this.anInt1672 = Static432.method7064(arg3);
			this.anInt1671 = Static432.method7064(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass101_Sub1_Sub2_9.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static344.method5970(this.aClass244_16, this.aClass79_20), 1);
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!lj;IIZ[III)V")
	public Class61_Sub2(@OriginalArg(0) Class101_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static584.aClass244_9, Static114.aClass79_7, arg3 && arg0.aBoolean502, arg2 * arg1);
		if (this.aClass101_Sub1_Sub2_9.aBoolean503) {
			this.anInt1672 = arg1;
			this.anInt1671 = arg2;
		} else {
			this.anInt1672 = Static432.method7064(arg1);
			this.anInt1671 = Static432.method7064(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass101_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt1672, this.anInt1671, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass101_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt1672, this.anInt1671, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass101_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (pia.a(-2005530600, local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(94) int local94 = local71.getRowPitch();
			if (arg1 * 4 == local94 && arg6 == arg1) {
				local71.a((int[]) arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(112) int local112 = 0; local112 < arg2; local112++) {
					local71.a(arg4, arg6 * local112 + arg5, local112 * local94, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method9107(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean117 = arg0;
		this.aBoolean118 = arg1;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IF)F")
	@Override
	public float method9102(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt1672;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(FI)F")
	@Override
	public float method9104(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1671;
	}

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method9324() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IZLclient!nea;I[BIIII)V")
	@Override
	public void method9106(@OriginalArg(2) Class244 arg0, @OriginalArg(4) byte[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) int arg4) {
		if (arg0 != this.aClass244_16 || this.aClass79_20 != Static114.aClass79_7) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass101_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(40) int local40 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg3, arg4, 0, local16);
		if (!pia.a(-2005530600, local40)) {
			return;
		}
		@Pc(50) int local50 = arg3 * this.aClass244_16.anInt7387;
		@Pc(56) int local56 = arg2 * this.aClass244_16.anInt7387;
		@Pc(59) int local59 = local16.getRowPitch();
		if (local50 == local59 && local50 == local56) {
			local16.a((byte[]) arg1, 0, 0, arg4 * local50);
		} else {
			for (@Pc(84) int local84 = 0; local84 < arg4; local84++) {
				local16.a(arg1, local84 * local56, local59 * local84, local50);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILclient!rha;)V")
	@Override
	public void method9325(@OriginalArg(1) Class315 arg0) {
		super.method9325(arg0);
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(B)I")
	@Override
	public int method9105() {
		return this.anInt1672;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9103() {
		return true;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
	@Override
	public void method9326() {
		this.aClass101_Sub1_Sub2_9.method5973(this);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(III[IIII)V")
	@Override
	public void method9100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (Static584.aClass244_9 != this.aClass244_16 || Static114.aClass79_7 != this.aClass79_20) {
			throw new RuntimeException();
		}
		@Pc(20) PixelBuffer local20 = this.aClass101_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(31) int local31 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg0, 16, local20);
		if (!pia.a(-2005530600, local31)) {
			return;
		}
		@Pc(41) int local41 = local20.getRowPitch();
		if (local41 == arg1 * 4) {
			local20.b(arg2, 0, 0, arg2.length);
		} else {
			for (@Pc(48) int local48 = 0; local48 < arg0; local48++) {
				local20.b(arg2, arg1 * local48, local48 * local41, arg1);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(II[IIIIII)V")
	@Override
	public void method9108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static584.aClass244_9 != this.aClass244_16 || Static114.aClass79_7 != this.aClass79_20) {
			throw new RuntimeException();
		}
		@Pc(24) PixelBuffer local24 = this.aClass101_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(35) int local35 = this.anIDirect3DTexture1.LockRect(0, arg5, arg1, arg4, arg3, 0, local24);
		if (!pia.a(-2005530600, local35)) {
			return;
		}
		@Pc(42) int local42 = local24.getRowPitch();
		if (local42 == arg4 * 4 && arg4 == arg0) {
			local24.a((int[]) arg2, 0, 0, arg4 * arg3);
		} else {
			for (@Pc(61) int local61 = 0; local61 < arg3; local61++) {
				local24.a(arg2, local61 * arg0, local61 * local42, arg4);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)I")
	@Override
	public int method9101() {
		return this.anInt1671;
	}
}

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.rj;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class132_Sub1 extends Class132 implements Interface20 {

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "Z")
	public boolean aBoolean300;

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "Z")
	public boolean aBoolean301;

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
	private final int anInt4005;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
	private final int anInt4004;

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!hb;Lclient!lw;IIZ[BII)V")
	public Class132_Sub1(@OriginalArg(0) Class133_Sub1_Sub1 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static20.aClass19_4, arg4 && arg0.aBoolean283, arg2 * arg3);
		if (this.aClass133_Sub1_Sub1_8.aBoolean282) {
			this.anInt4005 = arg3;
			this.anInt4004 = arg2;
		} else {
			this.anInt4004 = Static613.method8740(arg2);
			this.anInt4005 = Static613.method8740(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass133_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt4004, this.anInt4005, 0, 1024, Static195.method3493(this.aClass223_15, Static20.aClass19_4), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass133_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt4004, this.anInt4005, 1, 0, Static195.method3493(this.aClass223_15, Static20.aClass19_4), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass133_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (rj.a(-112, local90)) {
			@Pc(107) int local107 = arg2 * this.aClass223_15.anInt5604;
			@Pc(113) int local113 = arg2 * this.aClass223_15.anInt5604;
			@Pc(116) int local116 = local79.getRowPitch();
			if (local107 == local116 && local107 == local113) {
				local79.a((byte[]) arg5, arg6, 0, local107 * arg3);
			} else {
				for (@Pc(128) int local128 = 0; local128 < arg3; local128++) {
					local79.a(arg5, arg6 + local128 * local113, local116 * local128, local107);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!hb;Lclient!lw;Lclient!al;II)V")
	public Class132_Sub1(@OriginalArg(0) Class133_Sub1_Sub1 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass133_Sub1_Sub1_8.aBoolean282) {
			this.anInt4004 = arg3;
			this.anInt4005 = arg4;
		} else {
			this.anInt4004 = Static613.method8740(arg3);
			this.anInt4005 = Static613.method8740(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass133_Sub1_Sub1_8.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static195.method3493(this.aClass223_15, this.aClass19_20), 1);
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!hb;IIZ[III)V")
	public Class132_Sub1(@OriginalArg(0) Class133_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static576.aClass223_16, Static20.aClass19_4, arg3 && arg0.aBoolean283, arg2 * arg1);
		if (this.aClass133_Sub1_Sub1_8.aBoolean282) {
			this.anInt4005 = arg2;
			this.anInt4004 = arg1;
		} else {
			this.anInt4004 = Static613.method8740(arg1);
			this.anInt4005 = Static613.method8740(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass133_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt4004, this.anInt4005, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass133_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt4004, this.anInt4005, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass133_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (rj.a(-34, local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(97) int local97 = local71.getRowPitch();
			if (arg1 * 4 == local97 && arg1 == arg6) {
				local71.b(arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(116) int local116 = 0; local116 < arg2; local116++) {
					local71.b(arg4, local116 * arg6 + arg5, local97 * local116, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!gca;I)V")
	@Override
	public void method7905(@OriginalArg(0) Class116 arg0) {
		super.method7905(arg0);
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4642() {
		return true;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)I")
	@Override
	public int method4637() {
		return this.anInt4004;
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7906() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)I")
	@Override
	public int method4636() {
		return this.anInt4005;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!lw;IIIIII[B)V")
	@Override
	public void method4638(@OriginalArg(0) int arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(5) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) byte[] arg4) {
		if (this.aClass223_15 != arg1 || Static20.aClass19_4 != this.aClass19_20) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass133_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(26) int local26 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg3, arg2, 0, local15);
		if (!rj.a(107, local26)) {
			return;
		}
		@Pc(42) int local42 = arg0 * this.aClass223_15.anInt5604;
		@Pc(48) int local48 = arg3 * this.aClass223_15.anInt5604;
		@Pc(51) int local51 = local15.getRowPitch();
		if (local51 == local48 && local42 == local48) {
			local15.a((byte[]) arg4, 0, 0, arg2 * local48);
		} else {
			for (@Pc(67) int local67 = 0; local67 < arg2; local67++) {
				local15.a(arg4, local67 * local42, local67 * local51, local48);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZZ)V")
	@Override
	public void method4639(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean301 = arg0;
		this.aBoolean300 = arg1;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	@Override
	public void method7907() {
		this.aClass133_Sub1_Sub1_8.method3488(this);
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(IF)F")
	@Override
	public float method4641(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt4005;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IF)F")
	@Override
	public float method4640(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt4004;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBII[III)V")
	@Override
	public void method4643(@OriginalArg(0) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(5) int arg2) {
		if (this.aClass223_15 != Static576.aClass223_16 || this.aClass19_20 != Static20.aClass19_4) {
			throw new RuntimeException();
		}
		@Pc(23) PixelBuffer local23 = this.aClass133_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(34) int local34 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg0, arg2, 16, local23);
		if (!rj.a(109, local34)) {
			return;
		}
		@Pc(43) int local43 = local23.getRowPitch();
		if (local43 == arg0 * 4) {
			local23.a((int[]) arg1, 0, 0, arg1.length);
		} else {
			for (@Pc(50) int local50 = 0; local50 < arg2; local50++) {
				local23.a(arg1, local50 * arg0, local43 * local50, arg0);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[IIIIIII)V")
	@Override
	public void method4635(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static576.aClass223_16 != this.aClass223_15 || Static20.aClass19_4 != this.aClass19_20) {
			throw new RuntimeException();
		}
		@Pc(22) PixelBuffer local22 = this.aClass133_Sub1_Sub1_8.aPixelBuffer1;
		@Pc(33) int local33 = this.anIDirect3DTexture1.LockRect(0, arg4, arg5, arg2, arg3, 0, local22);
		if (!rj.a(90, local33)) {
			return;
		}
		@Pc(40) int local40 = local22.getRowPitch();
		if (local40 == arg2 * 4 && arg2 == arg0) {
			local22.b(arg1, 0, 0, arg3 * arg2);
		} else {
			for (@Pc(63) int local63 = 0; local63 < arg3; local63++) {
				local22.b(arg1, local63 * arg0, local63 * local40, arg2);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}
}

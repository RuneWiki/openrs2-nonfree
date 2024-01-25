import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.hia;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class81_Sub1 extends Class81 implements Interface9 {

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "Z")
	public boolean aBoolean388;

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "Z")
	public boolean aBoolean389;

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
	private final int anInt5242;

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
	private final int anInt5241;

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!hda;Lclient!o;Lclient!al;II)V")
	public Class81_Sub1(@OriginalArg(0) Class144_Sub1_Sub1 arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass144_Sub1_Sub1_9.aBoolean323) {
			this.anInt5242 = arg4;
			this.anInt5241 = arg3;
		} else {
			this.anInt5241 = Static255.method4294(arg3);
			this.anInt5242 = Static255.method4294(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass144_Sub1_Sub1_9.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static215.method3733(this.aClass260_14, this.aClass19_19), 1);
	}

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!hda;Lclient!o;IIZ[BII)V")
	public Class81_Sub1(@OriginalArg(0) Class144_Sub1_Sub1 arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static18.aClass19_4, arg4 && arg0.aBoolean322, arg3 * arg2);
		if (this.aClass144_Sub1_Sub1_9.aBoolean323) {
			this.anInt5241 = arg2;
			this.anInt5242 = arg3;
		} else {
			this.anInt5241 = Static255.method4294(arg2);
			this.anInt5242 = Static255.method4294(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass144_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt5241, this.anInt5242, 0, 1024, Static215.method3733(this.aClass260_14, Static18.aClass19_4), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass144_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt5241, this.anInt5242, 1, 0, Static215.method3733(this.aClass260_14, Static18.aClass19_4), 1);
		}
		@Pc(80) PixelBuffer local80 = this.aClass144_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(91) int local91 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local80);
		if (hia.a(local91, (byte) -123)) {
			@Pc(112) int local112 = arg2 * this.aClass260_14.anInt7205;
			@Pc(118) int local118 = arg2 * this.aClass260_14.anInt7205;
			@Pc(121) int local121 = local80.getRowPitch();
			if (local121 == local118 && local118 == local112) {
				local80.a((byte[]) arg5, arg6, 0, arg3 * local118);
			} else {
				for (@Pc(135) int local135 = 0; local135 < arg3; local135++) {
					local80.a(arg5, local112 * local135 + arg6, local121 * local135, local118);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!hda;IIZ[III)V")
	public Class81_Sub1(@OriginalArg(0) Class144_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static641.aClass260_12, Static18.aClass19_4, arg3 && arg0.aBoolean322, arg1 * arg2);
		if (this.aClass144_Sub1_Sub1_9.aBoolean323) {
			this.anInt5241 = arg1;
			this.anInt5242 = arg2;
		} else {
			this.anInt5241 = Static255.method4294(arg1);
			this.anInt5242 = Static255.method4294(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass144_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt5241, this.anInt5242, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass144_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt5241, this.anInt5242, 1, 0, 21, 1);
		}
		@Pc(72) PixelBuffer local72 = this.aClass144_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(83) int local83 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local72);
		if (hia.a(local83, (byte) -123)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(99) int local99 = local72.getRowPitch();
			if (arg1 * 4 == local99 && arg1 == arg6) {
				local72.b(arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(121) int local121 = 0; local121 < arg2; local121++) {
					local72.b(arg4, local121 * arg6 + arg5, local121 * local99, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[IIIIZI)V")
	@Override
	public void method4771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int arg5) {
		if (Static641.aClass260_12 != this.aClass260_14 || this.aClass19_19 != Static18.aClass19_4) {
			throw new RuntimeException();
		}
		@Pc(19) PixelBuffer local19 = this.aClass144_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(34) int local34 = this.anIDirect3DTexture1.LockRect(0, arg5, arg3, arg4, arg0, 0, local19);
		if (!hia.a(local34, (byte) -123)) {
			return;
		}
		@Pc(43) int local43 = local19.getRowPitch();
		if (local43 == arg4 * 4 && arg4 == arg1) {
			local19.b(arg2, 0, 0, arg0 * arg4);
		} else {
			for (@Pc(69) int local69 = 0; local69 < arg0; local69++) {
				local19.b(arg2, local69 * arg1, local43 * local69, arg4);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!o;IIIIZI[B)V")
	@Override
	public void method4776(@OriginalArg(0) int arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(8) byte[] arg4) {
		if (arg1 != this.aClass260_14 || this.aClass19_19 != Static18.aClass19_4) {
			throw new RuntimeException();
		}
		@Pc(19) PixelBuffer local19 = this.aClass144_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(30) int local30 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg0, 0, local19);
		if (!hia.a(local30, (byte) -123)) {
			return;
		}
		@Pc(40) int local40 = arg3 * this.aClass260_14.anInt7205;
		@Pc(46) int local46 = arg2 * this.aClass260_14.anInt7205;
		@Pc(49) int local49 = local19.getRowPitch();
		if (local49 == local46 && local40 == local46) {
			local19.a((byte[]) arg4, 0, 0, arg0 * local46);
		} else {
			for (@Pc(73) int local73 = 0; local73 < arg0; local73++) {
				local19.a(arg4, local40 * local73, local49 * local73, local46);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(FB)F")
	@Override
	public float method4772(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt5241;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZLclient!gk;)V")
	@Override
	public void method9349(@OriginalArg(1) Class137 arg0) {
		super.method9349(arg0);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIIII[II)V")
	@Override
	public void method4768(@OriginalArg(4) int arg0, @OriginalArg(5) int[] arg1, @OriginalArg(6) int arg2) {
		if (Static641.aClass260_12 != this.aClass260_14 || this.aClass19_19 != Static18.aClass19_4) {
			throw new RuntimeException();
		}
		@Pc(28) PixelBuffer local28 = this.aClass144_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(39) int local39 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg0, arg2, 16, local28);
		if (!hia.a(local39, (byte) -123)) {
			return;
		}
		@Pc(48) int local48 = local28.getRowPitch();
		if (local48 == arg0 * 4) {
			local28.a((int[]) arg1, 0, 0, arg1.length);
		} else {
			for (@Pc(68) int local68 = 0; local68 < arg2; local68++) {
				local28.a(arg1, local68 * arg0, local48 * local68, arg0);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)I")
	@Override
	public int method4774() {
		return this.anInt5242;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)I")
	@Override
	public int method4775() {
		return this.anInt5241;
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method9339() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4769() {
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(FI)F")
	@Override
	public float method4770(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt5242;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
	@Override
	public void method9348() {
		this.aClass144_Sub1_Sub1_9.method3731(this);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZZZ)V")
	@Override
	public void method4773(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean388 = arg1;
		this.aBoolean389 = arg0;
	}
}

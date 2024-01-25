import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.lg;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class99_Sub1 extends Class99 implements Interface27 {

	@OriginalMember(owner = "client!em", name = "h", descriptor = "Z")
	public boolean aBoolean226;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "Z")
	public boolean aBoolean227;

	@OriginalMember(owner = "client!em", name = "f", descriptor = "I")
	private final int anInt2906;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "I")
	private final int anInt2907;

	@OriginalMember(owner = "client!em", name = "j", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!ul;Lclient!et;IIZ[BII)V")
	public Class99_Sub1(@OriginalArg(0) Class13_Sub3_Sub2 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static638.aClass381_15, arg4 && arg0.aBoolean703, arg2 * arg3);
		if (this.aClass13_Sub3_Sub2_6.aBoolean706) {
			this.anInt2906 = arg2;
			this.anInt2907 = arg3;
		} else {
			this.anInt2906 = Static613.method8565(arg2);
			this.anInt2907 = Static613.method8565(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass13_Sub3_Sub2_6.anIDirect3DDevice1.a(this.anInt2906, this.anInt2907, 0, 1024, Static586.method8309(Static638.aClass381_15, this.aClass104_16), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass13_Sub3_Sub2_6.anIDirect3DDevice1.a(this.anInt2906, this.anInt2907, 1, 0, Static586.method8309(Static638.aClass381_15, this.aClass104_16), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass13_Sub3_Sub2_6.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (lg.b(local90, 25499)) {
			@Pc(105) int local105 = arg2 * this.aClass104_16.anInt2988;
			@Pc(111) int local111 = arg2 * this.aClass104_16.anInt2988;
			@Pc(114) int local114 = local79.getRowPitch();
			if (local111 == local114 && local111 == local105) {
				local79.a((byte[]) arg5, arg6, 0, local111 * arg3);
			} else {
				for (@Pc(126) int local126 = 0; local126 < arg3; local126++) {
					local79.a(arg5, local126 * local105 + arg6, local114 * local126, local111);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!ul;Lclient!et;Lclient!wha;II)V")
	public Class99_Sub1(@OriginalArg(0) Class13_Sub3_Sub2 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class381 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass13_Sub3_Sub2_6.aBoolean706) {
			this.anInt2906 = arg3;
			this.anInt2907 = arg4;
		} else {
			this.anInt2906 = Static613.method8565(arg3);
			this.anInt2907 = Static613.method8565(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass13_Sub3_Sub2_6.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static586.method8309(this.aClass381_8, this.aClass104_16), 1);
	}

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!ul;IIZ[III)V")
	public Class99_Sub1(@OriginalArg(0) Class13_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static78.aClass104_3, Static638.aClass381_15, arg3 && arg0.aBoolean703, arg2 * arg1);
		if (this.aClass13_Sub3_Sub2_6.aBoolean706) {
			this.anInt2906 = arg1;
			this.anInt2907 = arg2;
		} else {
			this.anInt2906 = Static613.method8565(arg1);
			this.anInt2907 = Static613.method8565(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass13_Sub3_Sub2_6.anIDirect3DDevice1.a(this.anInt2906, this.anInt2907, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass13_Sub3_Sub2_6.anIDirect3DDevice1.a(this.anInt2906, this.anInt2907, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass13_Sub3_Sub2_6.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (lg.b(local82, 25499)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(94) int local94 = local71.getRowPitch();
			if (local94 == arg1 * 4 && arg6 == arg1) {
				local71.a((int[]) arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(117) int local117 = 0; local117 < arg2; local117++) {
					local71.a(arg4, arg5 + local117 * arg6, local117 * local94, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!em", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7187() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILclient!cg;)V")
	@Override
	public void method8818(@OriginalArg(1) Class54 arg0) {
		super.method8818(arg0);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BZZ)V")
	@Override
	public void method7134(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean226 = arg1;
		this.aBoolean227 = arg0;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)I")
	@Override
	public int method7128() {
		return this.anInt2906;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(I)I")
	@Override
	public int method7130() {
		return this.anInt2907;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(FI)F")
	@Override
	public float method7133(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt2907;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILclient!et;III[BIII)V")
	@Override
	public void method7129(@OriginalArg(0) int arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(6) int arg4) {
		if (arg1 != this.aClass104_16 || Static638.aClass381_15 != this.aClass381_8) {
			throw new RuntimeException();
		}
		@Pc(23) PixelBuffer local23 = this.aClass13_Sub3_Sub2_6.aPixelBuffer1;
		@Pc(34) int local34 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg4, arg0, 0, local23);
		if (!lg.b(local34, 25499)) {
			return;
		}
		@Pc(44) int local44 = arg2 * this.aClass104_16.anInt2988;
		@Pc(50) int local50 = arg4 * this.aClass104_16.anInt2988;
		@Pc(53) int local53 = local23.getRowPitch();
		if (local53 == local50 && local50 == local44) {
			local23.a((byte[]) arg3, 0, 0, local50 * arg0);
		} else {
			for (@Pc(69) int local69 = 0; local69 < arg0; local69++) {
				local23.a(arg3, local44 * local69, local53 * local69, local50);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II[IIIII)V")
	@Override
	public void method7132(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(4) int arg2) {
		if (this.aClass104_16 != Static78.aClass104_3 || Static638.aClass381_15 != this.aClass381_8) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass13_Sub3_Sub2_6.aPixelBuffer1;
		@Pc(32) int local32 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg0, arg2, 16, local15);
		if (!lg.b(local32, 25499)) {
			return;
		}
		@Pc(40) int local40 = local15.getRowPitch();
		if (arg0 * 4 == local40) {
			local15.b(arg1, 0, 0, arg1.length);
		} else {
			for (@Pc(51) int local51 = 0; local51 < arg2; local51++) {
				local15.b(arg1, local51 * arg0, local51 * local40, arg0);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IF)F")
	@Override
	public float method7127(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt2906;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIII[IIII)V")
	@Override
	public void method7131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aClass104_16 != Static78.aClass104_3 || this.aClass381_8 != Static638.aClass381_15) {
			throw new RuntimeException();
		}
		@Pc(28) PixelBuffer local28 = this.aClass13_Sub3_Sub2_6.aPixelBuffer1;
		@Pc(39) int local39 = this.anIDirect3DTexture1.LockRect(0, arg0, arg2, arg4, arg5, 0, local28);
		if (!lg.b(local39, 25499)) {
			return;
		}
		@Pc(46) int local46 = local28.getRowPitch();
		if (local46 == arg4 * 4 && arg1 == arg4) {
			local28.a((int[]) arg3, 0, 0, arg5 * arg4);
		} else {
			for (@Pc(56) int local56 = 0; local56 < arg5; local56++) {
				local28.a(arg3, local56 * arg1, local56 * local46, arg4);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!em", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7135() {
		return true;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V")
	@Override
	public void method8817() {
		this.aClass13_Sub3_Sub2_6.method8319(this);
	}
}

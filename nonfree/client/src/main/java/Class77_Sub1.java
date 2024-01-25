import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.uo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class77_Sub1 extends Class77 implements Interface4 {

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Z")
	public boolean aBoolean206;

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "Z")
	public boolean aBoolean207;

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
	private final int anInt1815;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
	private final int anInt1814;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!wu;IIZ[III)V")
	public Class77_Sub1(@OriginalArg(0) Class145_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static165.aClass295_6, Static243.aClass158_10, arg3 && arg0.aBoolean965, arg1 * arg2);
		if (this.aClass145_Sub1_Sub2_9.aBoolean967) {
			this.anInt1815 = arg1;
			this.anInt1814 = arg2;
		} else {
			this.anInt1815 = Static330.method4577(arg1);
			this.anInt1814 = Static330.method4577(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass145_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt1815, this.anInt1814, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass145_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt1815, this.anInt1814, 1, 0, 21, 1);
		}
		@Pc(72) PixelBuffer local72 = this.aClass145_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(83) int local83 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local72);
		if (uo.a(local83, true)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(99) int local99 = local72.getRowPitch();
			if (arg1 * 4 == local99 && arg1 == arg6) {
				local72.a((int[]) arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(111) int local111 = 0; local111 < arg2; local111++) {
					local72.a(arg4, arg5 + arg6 * local111, local111 * local99, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!wu;Lclient!pm;IIZ[BII)V")
	public Class77_Sub1(@OriginalArg(0) Class145_Sub1_Sub2 arg0, @OriginalArg(1) Class295 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static243.aClass158_10, arg4 && arg0.aBoolean965, arg2 * arg3);
		if (this.aClass145_Sub1_Sub2_9.aBoolean967) {
			this.anInt1815 = arg2;
			this.anInt1814 = arg3;
		} else {
			this.anInt1815 = Static330.method4577(arg2);
			this.anInt1814 = Static330.method4577(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass145_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt1815, this.anInt1814, 0, 1024, Static725.method9866(Static243.aClass158_10, this.aClass295_15), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass145_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt1815, this.anInt1814, 1, 0, Static725.method9866(Static243.aClass158_10, this.aClass295_15), 1);
		}
		@Pc(80) PixelBuffer local80 = this.aClass145_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(91) int local91 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local80);
		if (uo.a(local91, true)) {
			@Pc(112) int local112 = arg2 * this.aClass295_15.anInt7929;
			@Pc(118) int local118 = arg2 * this.aClass295_15.anInt7929;
			@Pc(121) int local121 = local80.getRowPitch();
			if (local121 == local118 && local112 == local118) {
				local80.a((byte[]) arg5, arg6, 0, arg3 * local118);
			} else {
				for (@Pc(149) int local149 = 0; local149 < arg3; local149++) {
					local80.a(arg5, arg6 + local149 * local112, local121 * local149, local118);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!wu;Lclient!pm;Lclient!hk;II)V")
	public Class77_Sub1(@OriginalArg(0) Class145_Sub1_Sub2 arg0, @OriginalArg(1) Class295 arg1, @OriginalArg(2) Class158 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass145_Sub1_Sub2_9.aBoolean967) {
			this.anInt1815 = arg3;
			this.anInt1814 = arg4;
		} else {
			this.anInt1815 = Static330.method4577(arg3);
			this.anInt1814 = Static330.method4577(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass145_Sub1_Sub2_9.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static725.method9866(this.aClass158_20, this.aClass295_15), 1);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)I")
	@Override
	public int method6852() {
		return this.anInt1814;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6860() {
		return true;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[IIIII)V")
	@Override
	public void method6859(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(5) int arg2) {
		if (Static165.aClass295_6 != this.aClass295_15 || Static243.aClass158_10 != this.aClass158_20) {
			throw new RuntimeException();
		}
		@Pc(28) PixelBuffer local28 = this.aClass145_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(39) int local39 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg0, 16, local28);
		if (!uo.a(local39, true)) {
			return;
		}
		@Pc(48) int local48 = local28.getRowPitch();
		if (arg2 * 4 == local48) {
			local28.b(arg1, 0, 0, arg1.length);
		} else {
			for (@Pc(64) int local64 = 0; local64 < arg0; local64++) {
				local28.b(arg1, local64 * arg2, local48 * local64, arg2);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!wh;Z)V")
	@Override
	public void method8448(@OriginalArg(0) Class400 arg0) {
		super.method8448(arg0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method6853(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean206 = arg1;
		this.aBoolean207 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)I")
	@Override
	public int method6858() {
		return this.anInt1815;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[BILclient!pm;IIIIB)V")
	@Override
	public void method6854(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class295 arg3, @OriginalArg(5) int arg4) {
		if (this.aClass295_15 != arg3 || Static243.aClass158_10 != this.aClass158_20) {
			throw new RuntimeException();
		}
		@Pc(18) PixelBuffer local18 = this.aClass145_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(33) int local33 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg4, 0, local18);
		if (!uo.a(local33, true)) {
			return;
		}
		@Pc(45) int local45 = arg2 * this.aClass295_15.anInt7929;
		@Pc(51) int local51 = arg0 * this.aClass295_15.anInt7929;
		@Pc(54) int local54 = local18.getRowPitch();
		if (local54 == local45 && local45 == local51) {
			local18.a((byte[]) arg1, 0, 0, local45 * arg4);
		} else {
			for (@Pc(82) int local82 = 0; local82 < arg4; local82++) {
				local18.a(arg1, local51 * local82, local82 * local54, local45);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	@Override
	public void method8449() {
		this.aClass145_Sub1_Sub2_9.method9858(this);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII[III)V")
	@Override
	public void method6855(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static165.aClass295_6 != this.aClass295_15 || this.aClass158_20 != Static243.aClass158_10) {
			throw new RuntimeException();
		}
		@Pc(27) PixelBuffer local27 = this.aClass145_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(38) int local38 = this.anIDirect3DTexture1.LockRect(0, arg0, arg1, arg5, arg4, 0, local27);
		if (!uo.a(local38, true)) {
			return;
		}
		@Pc(47) int local47 = local27.getRowPitch();
		if (arg5 * 4 == local47 && arg2 == arg5) {
			local27.a((int[]) arg3, 0, 0, arg5 * arg4);
		} else {
			for (@Pc(77) int local77 = 0; local77 < arg4; local77++) {
				local27.a(arg3, local77 * arg2, local47 * local77, arg5);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(FI)F")
	@Override
	public float method6856(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1815;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8447() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IF)F")
	@Override
	public float method6857(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt1814;
	}
}

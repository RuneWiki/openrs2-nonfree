import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.dt;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class19_Sub3 extends Class19 implements Interface5 {

	@OriginalMember(owner = "client!mda", name = "f", descriptor = "Z")
	public boolean aBoolean417;

	@OriginalMember(owner = "client!mda", name = "i", descriptor = "Z")
	public boolean aBoolean418;

	@OriginalMember(owner = "client!mda", name = "j", descriptor = "I")
	private final int anInt5581;

	@OriginalMember(owner = "client!mda", name = "g", descriptor = "I")
	private final int anInt5580;

	@OriginalMember(owner = "client!mda", name = "h", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!hg;Lclient!g;Lclient!vp;II)V")
	public Class19_Sub3(@OriginalArg(0) Class4_Sub2_Sub1 arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(2) Class308 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass4_Sub2_Sub1_7.aBoolean305) {
			this.anInt5581 = arg3;
			this.anInt5580 = arg4;
		} else {
			this.anInt5581 = Static184.method3549(arg3);
			this.anInt5580 = Static184.method3549(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass4_Sub2_Sub1_7.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static177.method3493(this.aClass110_18, this.aClass308_9), 1);
	}

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!hg;Lclient!g;IIZ[BII)V")
	public Class19_Sub3(@OriginalArg(0) Class4_Sub2_Sub1 arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static517.aClass308_15, arg4 && arg0.aBoolean303, arg3 * arg2);
		if (this.aClass4_Sub2_Sub1_7.aBoolean305) {
			this.anInt5581 = arg2;
			this.anInt5580 = arg3;
		} else {
			this.anInt5581 = Static184.method3549(arg2);
			this.anInt5580 = Static184.method3549(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass4_Sub2_Sub1_7.anIDirect3DDevice1.a(this.anInt5581, this.anInt5580, 0, 1024, Static177.method3493(this.aClass110_18, Static517.aClass308_15), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass4_Sub2_Sub1_7.anIDirect3DDevice1.a(this.anInt5581, this.anInt5580, 1, 0, Static177.method3493(this.aClass110_18, Static517.aClass308_15), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass4_Sub2_Sub1_7.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (dt.a(local90, -2005530590)) {
			@Pc(108) int local108 = arg2 * this.aClass110_18.anInt2917;
			@Pc(114) int local114 = arg2 * this.aClass110_18.anInt2917;
			@Pc(117) int local117 = local79.getRowPitch();
			if (local117 == local108 && local108 == local114) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local108);
			} else {
				for (@Pc(138) int local138 = 0; local138 < arg3; local138++) {
					local79.a(arg5, arg6 + local138 * local114, local117 * local138, local108);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!hg;IIZ[III)V")
	public Class19_Sub3(@OriginalArg(0) Class4_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static171.aClass110_13, Static517.aClass308_15, arg3 && arg0.aBoolean303, arg2 * arg1);
		if (this.aClass4_Sub2_Sub1_7.aBoolean305) {
			this.anInt5580 = arg2;
			this.anInt5581 = arg1;
		} else {
			this.anInt5581 = Static184.method3549(arg1);
			this.anInt5580 = Static184.method3549(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass4_Sub2_Sub1_7.anIDirect3DDevice1.a(this.anInt5581, this.anInt5580, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass4_Sub2_Sub1_7.anIDirect3DDevice1.a(this.anInt5581, this.anInt5580, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass4_Sub2_Sub1_7.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (dt.a(local82, -2005530590)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(97) int local97 = local71.getRowPitch();
			if (local97 == arg1 * 4 && arg1 == arg6) {
				local71.a((int[]) arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(116) int local116 = 0; local116 < arg2; local116++) {
					local71.a(arg4, arg6 * local116 + arg5, local97 * local116, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7775() {
		return true;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(BF)F")
	@Override
	public float method7774(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt5581;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILclient!ie;)V")
	@Override
	public void method7757(@OriginalArg(1) Class136 arg0) {
		super.method7757(arg0);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ZZB)V")
	@Override
	public void method7769(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean418 = arg0;
		this.aBoolean417 = arg1;
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method5123() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "(B)V")
	@Override
	public void method7756() {
		this.aClass4_Sub2_Sub1_7.method3489(this);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(FZ)F")
	@Override
	public float method7768(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt5580;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)I")
	@Override
	public int method7770() {
		return this.anInt5580;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "([IIIIIIII)V")
	@Override
	public void method7773(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static171.aClass110_13 != this.aClass110_18 || this.aClass308_9 != Static517.aClass308_15) {
			throw new RuntimeException();
		}
		@Pc(21) PixelBuffer local21 = this.aClass4_Sub2_Sub1_7.aPixelBuffer1;
		@Pc(32) int local32 = this.anIDirect3DTexture1.LockRect(0, arg2, arg5, arg1, arg4, 0, local21);
		if (!dt.a(local32, -2005530590)) {
			return;
		}
		@Pc(39) int local39 = local21.getRowPitch();
		if (local39 == arg1 * 4 && arg3 == arg1) {
			local21.a((int[]) arg0, 0, 0, arg1 * arg4);
		} else {
			for (@Pc(53) int local53 = 0; local53 < arg4; local53++) {
				local21.a(arg0, arg3 * local53, local39 * local53, arg1);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(BIIILclient!g;III[B)V")
	@Override
	public void method7772(@OriginalArg(3) int arg0, @OriginalArg(4) Class110 arg1, @OriginalArg(5) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) byte[] arg4) {
		if (this.aClass110_18 != arg1 || Static517.aClass308_15 != this.aClass308_9) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass4_Sub2_Sub1_7.aPixelBuffer1;
		@Pc(27) int local27 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg3, arg2, 0, local16);
		if (!dt.a(local27, -2005530590)) {
			return;
		}
		@Pc(38) int local38 = arg3 * this.aClass110_18.anInt2917;
		@Pc(44) int local44 = arg0 * this.aClass110_18.anInt2917;
		@Pc(47) int local47 = local16.getRowPitch();
		if (local38 == local47 && local44 == local38) {
			local16.a((byte[]) arg4, 0, 0, local38 * arg2);
		} else {
			for (@Pc(68) int local68 = 0; local68 < arg2; local68++) {
				local16.a(arg4, local44 * local68, local68 * local47, local38);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(B)I")
	@Override
	public int method7771() {
		return this.anInt5581;
	}
}

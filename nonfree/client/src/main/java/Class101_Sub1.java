import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.aq;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class101_Sub1 extends Class101 implements Interface12 {

	@OriginalMember(owner = "client!et", name = "f", descriptor = "Z")
	public boolean aBoolean165;

	@OriginalMember(owner = "client!et", name = "i", descriptor = "Z")
	public boolean aBoolean166;

	@OriginalMember(owner = "client!et", name = "j", descriptor = "I")
	private final int anInt2359;

	@OriginalMember(owner = "client!et", name = "h", descriptor = "I")
	private final int anInt2358;

	@OriginalMember(owner = "client!et", name = "g", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!ki;IIZ[III)V")
	public Class101_Sub1(@OriginalArg(0) Class143_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static92.aClass255_3, Static314.aClass206_12, arg3 && arg0.aBoolean362, arg1 * arg2);
		if (this.aClass143_Sub1_Sub1_5.aBoolean364) {
			this.anInt2358 = arg2;
			this.anInt2359 = arg1;
		} else {
			this.anInt2359 = Static209.method2991(arg1);
			this.anInt2358 = Static209.method2991(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass143_Sub1_Sub1_5.anIDirect3DDevice1.a(this.anInt2359, this.anInt2358, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass143_Sub1_Sub1_5.anIDirect3DDevice1.a(this.anInt2359, this.anInt2358, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass143_Sub1_Sub1_5.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (aq.b(local82, -85)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(97) int local97 = local71.getRowPitch();
			if (arg1 * 4 == local97 && arg1 == arg6) {
				local71.a((int[]) arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(116) int local116 = 0; local116 < arg2; local116++) {
					local71.a(arg4, arg5 + arg6 * local116, local116 * local97, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!ki;Lclient!ofa;Lclient!kn;II)V")
	public Class101_Sub1(@OriginalArg(0) Class143_Sub1_Sub1 arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass143_Sub1_Sub1_5.aBoolean364) {
			this.anInt2358 = arg4;
			this.anInt2359 = arg3;
		} else {
			this.anInt2359 = Static209.method2991(arg3);
			this.anInt2358 = Static209.method2991(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass143_Sub1_Sub1_5.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static306.method4609(this.aClass255_20, this.aClass206_17), 1);
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!ki;Lclient!ofa;IIZ[BII)V")
	public Class101_Sub1(@OriginalArg(0) Class143_Sub1_Sub1 arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static314.aClass206_12, arg4 && arg0.aBoolean362, arg2 * arg3);
		if (this.aClass143_Sub1_Sub1_5.aBoolean364) {
			this.anInt2358 = arg3;
			this.anInt2359 = arg2;
		} else {
			this.anInt2359 = Static209.method2991(arg2);
			this.anInt2358 = Static209.method2991(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass143_Sub1_Sub1_5.anIDirect3DDevice1.a(this.anInt2359, this.anInt2358, 0, 1024, Static306.method4609(this.aClass255_20, Static314.aClass206_12), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass143_Sub1_Sub1_5.anIDirect3DDevice1.a(this.anInt2359, this.anInt2358, 1, 0, Static306.method4609(this.aClass255_20, Static314.aClass206_12), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass143_Sub1_Sub1_5.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (aq.b(local90, -81)) {
			@Pc(106) int local106 = arg2 * this.aClass255_20.anInt7179;
			@Pc(112) int local112 = arg2 * this.aClass255_20.anInt7179;
			@Pc(115) int local115 = local79.getRowPitch();
			if (local115 == local112 && local112 == local106) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local112);
			} else {
				for (@Pc(132) int local132 = 0; local132 < arg3; local132++) {
					local79.a(arg5, arg6 + local132 * local106, local132 * local115, local112);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "([IZIIIII)V")
	@Override
	public void method7454(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2) {
		if (this.aClass255_20 != Static92.aClass255_3 || Static314.aClass206_12 != this.aClass206_17) {
			throw new RuntimeException();
		}
		@Pc(22) PixelBuffer local22 = this.aClass143_Sub1_Sub1_5.aPixelBuffer1;
		@Pc(33) int local33 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 16, local22);
		if (!aq.b(local33, -69)) {
			return;
		}
		@Pc(41) int local41 = local22.getRowPitch();
		if (arg1 * 4 == local41) {
			local22.b(arg0, 0, 0, arg0.length);
		} else {
			for (@Pc(48) int local48 = 0; local48 < arg2; local48++) {
				local22.b(arg0, arg1 * local48, local41 * local48, arg1);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IF)F")
	@Override
	public float method7450(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt2359;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIILclient!ofa;[BIZI)V")
	@Override
	public void method7452(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class255 arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(6) int arg4) {
		if (arg2 != this.aClass255_20 || this.aClass206_17 != Static314.aClass206_12) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass143_Sub1_Sub1_5.aPixelBuffer1;
		@Pc(34) int local34 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg4, arg1, 0, local16);
		if (!aq.b(local34, -61)) {
			return;
		}
		@Pc(45) int local45 = arg0 * this.aClass255_20.anInt7179;
		@Pc(51) int local51 = arg4 * this.aClass255_20.anInt7179;
		@Pc(54) int local54 = local16.getRowPitch();
		if (local54 == local51 && local51 == local45) {
			local16.a((byte[]) arg3, 0, 0, arg1 * local51);
		} else {
			for (@Pc(75) int local75 = 0; local75 < arg1; local75++) {
				local16.a(arg3, local45 * local75, local75 * local54, local51);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(I)I")
	@Override
	public int method7448() {
		return this.anInt2358;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!cr;Z)V")
	@Override
	public void method7435(@OriginalArg(0) Class67 arg0) {
		super.method7435(arg0);
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(IF)F")
	@Override
	public float method7455(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt2358;
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7453() {
		return true;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ZBZ)V")
	@Override
	public void method7449(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean165 = arg1;
		this.aBoolean166 = arg0;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
	@Override
	public void method7436() {
		this.aClass143_Sub1_Sub1_5.method4604(this);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIZI[I)V")
	@Override
	public void method7451(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5) {
		if (Static92.aClass255_3 != this.aClass255_20 || this.aClass206_17 != Static314.aClass206_12) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass143_Sub1_Sub1_5.aPixelBuffer1;
		@Pc(30) int local30 = this.anIDirect3DTexture1.LockRect(0, arg2, arg4, arg0, arg3, 0, local16);
		if (!aq.b(local30, -43)) {
			return;
		}
		@Pc(37) int local37 = local16.getRowPitch();
		if (arg0 * 4 == local37 && arg1 == arg0) {
			local16.a((int[]) arg5, 0, 0, arg0 * arg3);
		} else {
			for (@Pc(55) int local55 = 0; local55 < arg3; local55++) {
				local16.a(arg5, local55 * arg1, local55 * local37, arg0);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)I")
	@Override
	public int method7456() {
		return this.anInt2359;
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6875() {
		return this.anIDirect3DTexture1;
	}
}

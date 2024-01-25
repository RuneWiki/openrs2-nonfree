import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.saa;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class21_Sub3 extends Class21 implements Interface2 {

	@OriginalMember(owner = "client!wca", name = "f", descriptor = "Z")
	public boolean aBoolean734;

	@OriginalMember(owner = "client!wca", name = "j", descriptor = "Z")
	public boolean aBoolean735;

	@OriginalMember(owner = "client!wca", name = "g", descriptor = "I")
	private final int anInt10503;

	@OriginalMember(owner = "client!wca", name = "i", descriptor = "I")
	private final int anInt10504;

	@OriginalMember(owner = "client!wca", name = "h", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lclient!sga;Lclient!pb;Lclient!oea;II)V")
	public Class21_Sub3(@OriginalArg(0) Class132_Sub1_Sub2 arg0, @OriginalArg(1) Class265 arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass132_Sub1_Sub2_9.aBoolean646) {
			this.anInt10504 = arg4;
			this.anInt10503 = arg3;
		} else {
			this.anInt10503 = Static655.method8912(arg3);
			this.anInt10504 = Static655.method8912(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass132_Sub1_Sub2_9.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static537.method7654(this.aClass265_18, this.aClass250_20), 1);
	}

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lclient!sga;Lclient!pb;IIZ[BII)V")
	public Class21_Sub3(@OriginalArg(0) Class132_Sub1_Sub2 arg0, @OriginalArg(1) Class265 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static417.aClass250_14, arg4 && arg0.aBoolean648, arg3 * arg2);
		if (this.aClass132_Sub1_Sub2_9.aBoolean646) {
			this.anInt10504 = arg3;
			this.anInt10503 = arg2;
		} else {
			this.anInt10503 = Static655.method8912(arg2);
			this.anInt10504 = Static655.method8912(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass132_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt10503, this.anInt10504, 0, 1024, Static537.method7654(this.aClass265_18, Static417.aClass250_14), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass132_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt10503, this.anInt10504, 1, 0, Static537.method7654(this.aClass265_18, Static417.aClass250_14), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass132_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (saa.b(local90, (byte) 100)) {
			@Pc(108) int local108 = arg2 * this.aClass265_18.anInt7469;
			@Pc(114) int local114 = arg2 * this.aClass265_18.anInt7469;
			@Pc(117) int local117 = local79.getRowPitch();
			if (local117 == local114 && local108 == local114) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local114);
			} else {
				for (@Pc(133) int local133 = 0; local133 < arg3; local133++) {
					local79.a(arg5, arg6 + local133 * local108, local133 * local117, local114);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lclient!sga;IIZ[III)V")
	public Class21_Sub3(@OriginalArg(0) Class132_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static169.aClass265_9, Static417.aClass250_14, arg3 && arg0.aBoolean648, arg1 * arg2);
		if (this.aClass132_Sub1_Sub2_9.aBoolean646) {
			this.anInt10503 = arg1;
			this.anInt10504 = arg2;
		} else {
			this.anInt10503 = Static655.method8912(arg1);
			this.anInt10504 = Static655.method8912(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass132_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt10503, this.anInt10504, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass132_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt10503, this.anInt10504, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass132_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (saa.b(local82, (byte) -56)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(97) int local97 = local71.getRowPitch();
			if (local97 == arg1 * 4 && arg6 == arg1) {
				local71.a((int[]) arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(107) int local107 = 0; local107 < arg2; local107++) {
					local71.a(arg4, local107 * arg6 + arg5, local107 * local97, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)I")
	@Override
	public int method8896() {
		return this.anInt10504;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(I[IIIIZII)V")
	@Override
	public void method8903(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static169.aClass265_9 != this.aClass265_18 || this.aClass250_20 != Static417.aClass250_14) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass132_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(32) int local32 = this.anIDirect3DTexture1.LockRect(0, arg2, arg4, arg5, arg3, 0, local16);
		if (!saa.b(local32, (byte) -72)) {
			return;
		}
		@Pc(39) int local39 = local16.getRowPitch();
		if (arg5 * 4 == local39 && arg1 == arg5) {
			local16.a((int[]) arg0, 0, 0, arg3 * arg5);
		} else {
			for (@Pc(62) int local62 = 0; local62 < arg3; local62++) {
				local16.a(arg0, local62 * arg1, local62 * local39, arg5);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8904() {
		return true;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(II[BLclient!pb;IIIII)V")
	@Override
	public void method8899(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class265 arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4) {
		if (arg2 != this.aClass265_18 || Static417.aClass250_14 != this.aClass250_20) {
			throw new RuntimeException();
		}
		@Pc(23) PixelBuffer local23 = this.aClass132_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(34) int local34 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg3, arg4, 0, local23);
		if (!saa.b(local34, (byte) -67)) {
			return;
		}
		@Pc(45) int local45 = arg3 * this.aClass265_18.anInt7469;
		@Pc(51) int local51 = arg0 * this.aClass265_18.anInt7469;
		@Pc(54) int local54 = local23.getRowPitch();
		if (local45 == local54 && local45 == local51) {
			local23.a((byte[]) arg1, 0, 0, arg4 * local45);
		} else {
			for (@Pc(66) int local66 = 0; local66 < arg4; local66++) {
				local23.a(arg1, local66 * local51, local66 * local54, local45);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8894() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(ZZZ)V")
	@Override
	public void method8901(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean734 = arg0;
		this.aBoolean735 = arg1;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(BLclient!cw;)V")
	@Override
	public void method8893(@OriginalArg(1) Class59 arg0) {
		super.method8893(arg0);
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)V")
	@Override
	public void method8895() {
		this.aClass132_Sub1_Sub2_9.method7666(this);
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(B)I")
	@Override
	public int method8902() {
		return this.anInt10503;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIII[III)V")
	@Override
	public void method8897(@OriginalArg(3) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(5) int arg2) {
		if (Static169.aClass265_9 != this.aClass265_18 || Static417.aClass250_14 != this.aClass250_20) {
			throw new RuntimeException();
		}
		@Pc(22) PixelBuffer local22 = this.aClass132_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(33) int local33 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg0, 16, local22);
		if (!saa.b(local33, (byte) 110)) {
			return;
		}
		@Pc(41) int local41 = local22.getRowPitch();
		if (local41 == arg2 * 4) {
			local22.b(arg1, 0, 0, arg1.length);
		} else {
			for (@Pc(60) int local60 = 0; local60 < arg0; local60++) {
				local22.b(arg1, arg2 * local60, local60 * local41, arg2);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(FI)F")
	@Override
	public float method8898(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt10503;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(FZ)F")
	@Override
	public float method8900(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt10504;
	}
}

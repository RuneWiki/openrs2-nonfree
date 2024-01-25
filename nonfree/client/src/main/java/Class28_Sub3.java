import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.raa;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class28_Sub3 extends Class28 implements Interface25 {

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "Z")
	public boolean aBoolean580;

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "Z")
	public boolean aBoolean581;

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
	private final int anInt6975;

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
	private final int anInt6976;

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!mh;Lclient!qda;IIZ[BII)V")
	public Class28_Sub3(@OriginalArg(0) Class126_Sub2_Sub2 arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static385.aClass247_14, arg4 && arg0.aBoolean528, arg3 * arg2);
		if (this.aClass126_Sub2_Sub2_7.aBoolean525) {
			this.anInt6975 = arg3;
			this.anInt6976 = arg2;
		} else {
			this.anInt6976 = Static522.method6795(arg2);
			this.anInt6975 = Static522.method6795(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass126_Sub2_Sub2_7.anIDirect3DDevice1.a(this.anInt6976, this.anInt6975, 0, 1024, Static351.method5578(Static385.aClass247_14, this.aClass281_17), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass126_Sub2_Sub2_7.anIDirect3DDevice1.a(this.anInt6976, this.anInt6975, 1, 0, Static351.method5578(Static385.aClass247_14, this.aClass281_17), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass126_Sub2_Sub2_7.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (raa.a(local90, (byte) 123)) {
			@Pc(109) int local109 = arg2 * this.aClass281_17.anInt7736;
			@Pc(115) int local115 = arg2 * this.aClass281_17.anInt7736;
			@Pc(118) int local118 = local79.getRowPitch();
			if (local109 == local118 && local109 == local115) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local109);
			} else {
				for (@Pc(139) int local139 = 0; local139 < arg3; local139++) {
					local79.a(arg5, local115 * local139 + arg6, local118 * local139, local109);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!mh;Lclient!qda;Lclient!ns;II)V")
	public Class28_Sub3(@OriginalArg(0) Class126_Sub2_Sub2 arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(2) Class247 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass126_Sub2_Sub2_7.aBoolean525) {
			this.anInt6975 = arg4;
			this.anInt6976 = arg3;
		} else {
			this.anInt6976 = Static522.method6795(arg3);
			this.anInt6975 = Static522.method6795(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass126_Sub2_Sub2_7.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static351.method5578(this.aClass247_19, this.aClass281_17), 1);
	}

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!mh;IIZ[III)V")
	public Class28_Sub3(@OriginalArg(0) Class126_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static208.aClass281_10, Static385.aClass247_14, arg3 && arg0.aBoolean528, arg1 * arg2);
		if (this.aClass126_Sub2_Sub2_7.aBoolean525) {
			this.anInt6975 = arg2;
			this.anInt6976 = arg1;
		} else {
			this.anInt6976 = Static522.method6795(arg1);
			this.anInt6975 = Static522.method6795(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass126_Sub2_Sub2_7.anIDirect3DDevice1.a(this.anInt6976, this.anInt6975, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass126_Sub2_Sub2_7.anIDirect3DDevice1.a(this.anInt6976, this.anInt6975, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass126_Sub2_Sub2_7.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (raa.a(local82, (byte) 117)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(95) int local95 = local71.getRowPitch();
			if (local95 == arg1 * 4 && arg6 == arg1) {
				local71.a((int[]) arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(122) int local122 = 0; local122 < arg2; local122++) {
					local71.a(arg4, arg6 * local122 + arg5, local122 * local95, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IF)F")
	@Override
	public float method7624(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt6976;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)I")
	@Override
	public int method7623() {
		return this.anInt6976;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!qda;IBIIII[B)V")
	@Override
	public void method7628(@OriginalArg(0) int arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) byte[] arg4) {
		if (arg1 != this.aClass281_17 || Static385.aClass247_14 != this.aClass247_19) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass126_Sub2_Sub2_7.aPixelBuffer1;
		@Pc(39) int local39 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local15);
		if (!raa.a(local39, (byte) 127)) {
			return;
		}
		@Pc(49) int local49 = arg0 * this.aClass281_17.anInt7736;
		@Pc(55) int local55 = arg2 * this.aClass281_17.anInt7736;
		@Pc(58) int local58 = local15.getRowPitch();
		if (local55 == local58 && local49 == local55) {
			local15.a((byte[]) arg4, 0, 0, arg3 * local55);
		} else {
			for (@Pc(79) int local79 = 0; local79 < arg3; local79++) {
				local15.a(arg4, local49 * local79, local79 * local58, local55);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II[IIIII)V")
	@Override
	public void method7629(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(6) int arg2) {
		if (Static208.aClass281_10 != this.aClass281_17 || Static385.aClass247_14 != this.aClass247_19) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass126_Sub2_Sub2_7.aPixelBuffer1;
		@Pc(34) int local34 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg0, 16, local15);
		if (!raa.a(local34, (byte) 110)) {
			return;
		}
		@Pc(42) int local42 = local15.getRowPitch();
		if (arg2 * 4 == local42) {
			local15.b(arg1, 0, 0, arg1.length);
		} else {
			for (@Pc(57) int local57 = 0; local57 < arg0; local57++) {
				local15.b(arg1, local57 * arg2, local42 * local57, arg2);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZZ)V")
	@Override
	public void method7630(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean581 = arg1;
		this.aBoolean580 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6206() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIII[IIB)V")
	@Override
	public void method7625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		if (this.aClass281_17 != Static208.aClass281_10 || this.aClass247_19 != Static385.aClass247_14) {
			throw new RuntimeException();
		}
		@Pc(22) PixelBuffer local22 = this.aClass126_Sub2_Sub2_7.aPixelBuffer1;
		@Pc(33) int local33 = this.anIDirect3DTexture1.LockRect(0, arg2, arg0, arg3, arg5, 0, local22);
		if (!raa.a(local33, (byte) 116)) {
			return;
		}
		@Pc(41) int local41 = local22.getRowPitch();
		if (arg3 * 4 == local41 && arg3 == arg1) {
			local22.a((int[]) arg4, 0, 0, arg3 * arg5);
		} else {
			for (@Pc(55) int local55 = 0; local55 < arg5; local55++) {
				local22.a(arg4, local55 * arg1, local41 * local55, arg3);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(FI)F")
	@Override
	public float method7631(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt6975;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
	@Override
	public void method7610() {
		this.aClass126_Sub2_Sub2_7.method5583(this);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!kha;)V")
	@Override
	public void method7609(@OriginalArg(1) Class189 arg0) {
		super.method7609(arg0);
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)I")
	@Override
	public int method7626() {
		return this.anInt6975;
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7627() {
		return true;
	}
}

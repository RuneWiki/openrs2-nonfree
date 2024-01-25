import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.kg;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class38_Sub3 extends Class38 implements Interface15 {

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "Z")
	public boolean aBoolean822;

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "Z")
	public boolean aBoolean823;

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
	private final int anInt10394;

	@OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
	private final int anInt10395;

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lclient!bea;IIZ[III)V")
	public Class38_Sub3(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static120.aClass178_4, Static302.aClass176_8, arg3 && arg0.aBoolean131, arg1 * arg2);
		if (this.aClass5_Sub2_Sub1_9.aBoolean132) {
			this.anInt10394 = arg1;
			this.anInt10395 = arg2;
		} else {
			this.anInt10394 = Static101.method2622(arg1);
			this.anInt10395 = Static101.method2622(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass5_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt10394, this.anInt10395, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass5_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt10394, this.anInt10395, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass5_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (kg.a(-21593, local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(94) int local94 = local71.getRowPitch();
			if (local94 == arg1 * 4 && arg1 == arg6) {
				local71.a((int[]) arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(112) int local112 = 0; local112 < arg2; local112++) {
					local71.a(arg4, arg5 + arg6 * local112, local94 * local112, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lclient!bea;Lclient!kt;Lclient!kq;II)V")
	public Class38_Sub3(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass5_Sub2_Sub1_9.aBoolean132) {
			this.anInt10395 = arg4;
			this.anInt10394 = arg3;
		} else {
			this.anInt10394 = Static101.method2622(arg3);
			this.anInt10395 = Static101.method2622(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass5_Sub2_Sub1_9.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static36.method1272(this.aClass178_14, this.aClass176_19), 1);
	}

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lclient!bea;Lclient!kt;IIZ[BII)V")
	public Class38_Sub3(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static302.aClass176_8, arg4 && arg0.aBoolean131, arg2 * arg3);
		if (this.aClass5_Sub2_Sub1_9.aBoolean132) {
			this.anInt10395 = arg3;
			this.anInt10394 = arg2;
		} else {
			this.anInt10394 = Static101.method2622(arg2);
			this.anInt10395 = Static101.method2622(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass5_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt10394, this.anInt10395, 0, 1024, Static36.method1272(this.aClass178_14, Static302.aClass176_8), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass5_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt10394, this.anInt10395, 1, 0, Static36.method1272(this.aClass178_14, Static302.aClass176_8), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass5_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (kg.a(-21593, local90)) {
			@Pc(109) int local109 = arg2 * this.aClass178_14.anInt6173;
			@Pc(115) int local115 = arg2 * this.aClass178_14.anInt6173;
			@Pc(118) int local118 = local79.getRowPitch();
			if (local118 == local109 && local115 == local109) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local109);
			} else {
				for (@Pc(130) int local130 = 0; local130 < arg3; local130++) {
					local79.a(arg5, arg6 + local130 * local115, local130 * local118, local109);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIIII[BLclient!kt;I)V")
	@Override
	public void method8447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) Class178 arg4) {
		if (arg4 != this.aClass178_14 || Static302.aClass176_8 != this.aClass176_19) {
			throw new RuntimeException();
		}
		@Pc(22) PixelBuffer local22 = this.aClass5_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(33) int local33 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local22);
		if (!kg.a(-21593, local33)) {
			return;
		}
		@Pc(43) int local43 = arg0 * this.aClass178_14.anInt6173;
		@Pc(49) int local49 = arg1 * this.aClass178_14.anInt6173;
		@Pc(52) int local52 = local22.getRowPitch();
		if (local52 == local49 && local43 == local49) {
			local22.a((byte[]) arg3, 0, 0, local49 * arg2);
		} else {
			for (@Pc(73) int local73 = 0; local73 < arg2; local73++) {
				local22.a(arg3, local73 * local43, local73 * local52, local49);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
	@Override
	public void method8611() {
		this.aClass5_Sub2_Sub1_9.method1277(this);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IF)F")
	@Override
	public float method8451(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt10395;
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)I")
	@Override
	public int method8449() {
		return this.anInt10395;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(BF)F")
	@Override
	public float method8448(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt10394;
	}

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8454() {
		return true;
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)I")
	@Override
	public int method8453() {
		return this.anInt10394;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(BLclient!nd;)V")
	@Override
	public void method8610(@OriginalArg(1) Class216 arg0) {
		super.method8610(arg0);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8444() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIBII[II)V")
	@Override
	public void method8450(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int[] arg2) {
		if (Static120.aClass178_4 != this.aClass178_14 || this.aClass176_19 != Static302.aClass176_8) {
			throw new RuntimeException();
		}
		@Pc(24) PixelBuffer local24 = this.aClass5_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(35) int local35 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg0, arg1, 16, local24);
		if (!kg.a(-21593, local35)) {
			return;
		}
		@Pc(43) int local43 = local24.getRowPitch();
		if (local43 == arg0 * 4) {
			local24.b(arg2, 0, 0, arg2.length);
		} else {
			for (@Pc(62) int local62 = 0; local62 < arg1; local62++) {
				local24.b(arg2, local62 * arg0, local43 * local62, arg0);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method8452(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean822 = arg0;
		this.aBoolean823 = arg1;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(III[IIIII)V")
	@Override
	public void method8455(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static120.aClass178_4 != this.aClass178_14 || Static302.aClass176_8 != this.aClass176_19) {
			throw new RuntimeException();
		}
		@Pc(19) PixelBuffer local19 = this.aClass5_Sub2_Sub1_9.aPixelBuffer1;
		@Pc(30) int local30 = this.anIDirect3DTexture1.LockRect(0, arg3, arg0, arg5, arg1, 0, local19);
		if (!kg.a(-21593, local30)) {
			return;
		}
		@Pc(37) int local37 = local19.getRowPitch();
		if (local37 == arg5 * 4 && arg5 == arg4) {
			local19.a((int[]) arg2, 0, 0, arg1 * arg5);
		} else {
			for (@Pc(55) int local55 = 0; local55 < arg1; local55++) {
				local19.a(arg2, local55 * arg4, local55 * local37, arg5);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}
}

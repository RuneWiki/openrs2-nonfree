import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.pda;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class38_Sub3 extends Class38 implements Interface8 {

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "Z")
	public boolean aBoolean577;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "Z")
	public boolean aBoolean578;

	@OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
	private final int anInt8330;

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
	private final int anInt8331;

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!uda;Lclient!g;IIZ[BII)V")
	public Class38_Sub3(@OriginalArg(0) Class95_Sub1_Sub2 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static666.aClass389_16, arg4 && arg0.aBoolean705, arg2 * arg3);
		if (this.aClass95_Sub1_Sub2_7.aBoolean707) {
			this.anInt8330 = arg2;
			this.anInt8331 = arg3;
		} else {
			this.anInt8330 = Static585.method7772(arg2);
			this.anInt8331 = Static585.method7772(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass95_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt8330, this.anInt8331, 0, 1024, Static602.method8215(Static666.aClass389_16, this.aClass122_16), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass95_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt8330, this.anInt8331, 1, 0, Static602.method8215(Static666.aClass389_16, this.aClass122_16), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass95_Sub1_Sub2_7.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (pda.a(local90, 17527)) {
			@Pc(109) int local109 = arg2 * this.aClass122_16.anInt3389;
			@Pc(115) int local115 = arg2 * this.aClass122_16.anInt3389;
			@Pc(118) int local118 = local79.getRowPitch();
			if (local109 == local118 && local115 == local109) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local109);
			} else {
				for (@Pc(135) int local135 = 0; local135 < arg3; local135++) {
					local79.a(arg5, local135 * local115 + arg6, local135 * local118, local109);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!uda;IIZ[III)V")
	public Class38_Sub3(@OriginalArg(0) Class95_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static21.aClass122_14, Static666.aClass389_16, arg3 && arg0.aBoolean705, arg1 * arg2);
		if (this.aClass95_Sub1_Sub2_7.aBoolean707) {
			this.anInt8330 = arg1;
			this.anInt8331 = arg2;
		} else {
			this.anInt8330 = Static585.method7772(arg1);
			this.anInt8331 = Static585.method7772(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass95_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt8330, this.anInt8331, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass95_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt8330, this.anInt8331, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass95_Sub1_Sub2_7.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (pda.a(local82, 17527)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(94) int local94 = local71.getRowPitch();
			if (arg1 * 4 == local94 && arg1 == arg6) {
				local71.a((int[]) arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(108) int local108 = 0; local108 < arg2; local108++) {
					local71.a(arg4, arg5 + local108 * arg6, local108 * local94, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!uda;Lclient!g;Lclient!wj;II)V")
	public Class38_Sub3(@OriginalArg(0) Class95_Sub1_Sub2 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) Class389 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass95_Sub1_Sub2_7.aBoolean707) {
			this.anInt8330 = arg3;
			this.anInt8331 = arg4;
		} else {
			this.anInt8330 = Static585.method7772(arg3);
			this.anInt8331 = Static585.method7772(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass95_Sub1_Sub2_7.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static602.method8215(this.aClass389_8, this.aClass122_16), 1);
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)I")
	@Override
	public int method7073() {
		return this.anInt8331;
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6846() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)I")
	@Override
	public int method7071() {
		return this.anInt8330;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
	@Override
	public void method7463() {
		this.aClass95_Sub1_Sub2_7.method8213(this);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IF)F")
	@Override
	public float method7065(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt8331;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIII[BLclient!g;IB)V")
	@Override
	public void method7069(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(6) Class122 arg3, @OriginalArg(7) int arg4) {
		if (arg3 != this.aClass122_16 || this.aClass389_8 != Static666.aClass389_16) {
			throw new RuntimeException();
		}
		@Pc(24) PixelBuffer local24 = this.aClass95_Sub1_Sub2_7.aPixelBuffer1;
		@Pc(35) int local35 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg4, arg1, 0, local24);
		if (!pda.a(local35, 17527)) {
			return;
		}
		@Pc(46) int local46 = arg4 * this.aClass122_16.anInt3389;
		@Pc(52) int local52 = arg0 * this.aClass122_16.anInt3389;
		@Pc(55) int local55 = local24.getRowPitch();
		if (local55 == local46 && local46 == local52) {
			local24.a((byte[]) arg2, 0, 0, arg1 * local46);
		} else {
			for (@Pc(76) int local76 = 0; local76 < arg1; local76++) {
				local24.a(arg2, local52 * local76, local55 * local76, local46);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZZZ)V")
	@Override
	public void method7068(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean577 = arg0;
		this.aBoolean578 = arg1;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIII[III)V")
	@Override
	public void method7066(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) int arg5) {
		if (this.aClass122_16 != Static21.aClass122_14 || this.aClass389_8 != Static666.aClass389_16) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass95_Sub1_Sub2_7.aPixelBuffer1;
		@Pc(27) int local27 = this.anIDirect3DTexture1.LockRect(0, arg2, arg0, arg1, arg5, 0, local16);
		if (!pda.a(local27, 17527)) {
			return;
		}
		@Pc(38) int local38 = local16.getRowPitch();
		if (arg1 * 4 == local38 && arg1 == arg3) {
			local16.a((int[]) arg4, 0, 0, arg1 * arg5);
		} else {
			for (@Pc(61) int local61 = 0; local61 < arg5; local61++) {
				local16.a(arg4, arg3 * local61, local38 * local61, arg1);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(FZ)F")
	@Override
	public float method7067(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt8330;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7072() {
		return true;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I[IIIIII)V")
	@Override
	public void method7070(@OriginalArg(1) int[] arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		if (this.aClass122_16 != Static21.aClass122_14 || Static666.aClass389_16 != this.aClass389_8) {
			throw new RuntimeException();
		}
		@Pc(19) PixelBuffer local19 = this.aClass95_Sub1_Sub2_7.aPixelBuffer1;
		@Pc(30) int local30 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg1, 16, local19);
		if (!pda.a(local30, 17527)) {
			return;
		}
		@Pc(40) int local40 = local19.getRowPitch();
		if (arg2 * 4 == local40) {
			local19.b(arg0, 0, 0, arg0.length);
		} else {
			for (@Pc(59) int local59 = 0; local59 < arg1; local59++) {
				local19.b(arg0, arg2 * local59, local40 * local59, arg2);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(BLclient!ag;)V")
	@Override
	public void method7462(@OriginalArg(1) Class8 arg0) {
		super.method7462(arg0);
	}
}

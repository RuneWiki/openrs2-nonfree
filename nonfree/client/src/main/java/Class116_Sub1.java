import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.qc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class116_Sub1 extends Class116 implements Interface9 {

	@OriginalMember(owner = "client!haa", name = "f", descriptor = "Z")
	public boolean aBoolean292;

	@OriginalMember(owner = "client!haa", name = "h", descriptor = "Z")
	public boolean aBoolean293;

	@OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
	private final int anInt3945;

	@OriginalMember(owner = "client!haa", name = "j", descriptor = "I")
	private final int anInt3946;

	@OriginalMember(owner = "client!haa", name = "g", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lclient!rca;Lclient!kp;Lclient!vt;II)V")
	public Class116_Sub1(@OriginalArg(0) Class5_Sub3_Sub2 arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(2) Class310 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass5_Sub3_Sub2_8.aBoolean547) {
			this.anInt3945 = arg4;
			this.anInt3946 = arg3;
		} else {
			this.anInt3946 = Static483.method7134(arg3);
			this.anInt3945 = Static483.method7134(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass5_Sub3_Sub2_8.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static415.method6432(this.aClass310_11, this.aClass167_11), 1);
	}

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lclient!rca;IIZ[III)V")
	public Class116_Sub1(@OriginalArg(0) Class5_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static468.aClass167_14, Static524.aClass310_16, arg3 && arg0.aBoolean548, arg2 * arg1);
		if (this.aClass5_Sub3_Sub2_8.aBoolean547) {
			this.anInt3946 = arg1;
			this.anInt3945 = arg2;
		} else {
			this.anInt3946 = Static483.method7134(arg1);
			this.anInt3945 = Static483.method7134(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass5_Sub3_Sub2_8.anIDirect3DDevice1.a(this.anInt3946, this.anInt3945, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass5_Sub3_Sub2_8.anIDirect3DDevice1.a(this.anInt3946, this.anInt3945, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass5_Sub3_Sub2_8.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (qc.a((byte) 48, local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(93) int local93 = local71.getRowPitch();
			if (arg1 * 4 == local93 && arg1 == arg6) {
				local71.b(arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(107) int local107 = 0; local107 < arg2; local107++) {
					local71.b(arg4, arg6 * local107 + arg5, local93 * local107, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lclient!rca;Lclient!kp;IIZ[BII)V")
	public Class116_Sub1(@OriginalArg(0) Class5_Sub3_Sub2 arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static524.aClass310_16, arg4 && arg0.aBoolean548, arg2 * arg3);
		if (this.aClass5_Sub3_Sub2_8.aBoolean547) {
			this.anInt3945 = arg3;
			this.anInt3946 = arg2;
		} else {
			this.anInt3946 = Static483.method7134(arg2);
			this.anInt3945 = Static483.method7134(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass5_Sub3_Sub2_8.anIDirect3DDevice1.a(this.anInt3946, this.anInt3945, 0, 1024, Static415.method6432(Static524.aClass310_16, this.aClass167_11), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass5_Sub3_Sub2_8.anIDirect3DDevice1.a(this.anInt3946, this.anInt3945, 1, 0, Static415.method6432(Static524.aClass310_16, this.aClass167_11), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass5_Sub3_Sub2_8.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (qc.a((byte) 48, local90)) {
			@Pc(106) int local106 = arg2 * this.aClass167_11.anInt5192;
			@Pc(112) int local112 = arg2 * this.aClass167_11.anInt5192;
			@Pc(115) int local115 = local79.getRowPitch();
			if (local115 == local106 && local112 == local106) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local106);
			} else {
				for (@Pc(127) int local127 = 0; local127 < arg3; local127++) {
					local79.a(arg5, arg6 + local127 * local112, local127 * local115, local106);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIILclient!kp;[BIBII)V")
	@Override
	public void method3274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class167 arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(8) int arg4) {
		if (this.aClass167_11 != arg2 || this.aClass310_11 != Static524.aClass310_16) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass5_Sub3_Sub2_8.aPixelBuffer1;
		@Pc(43) int local43 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg4, 0, local16);
		if (!qc.a((byte) 48, local43)) {
			return;
		}
		@Pc(53) int local53 = arg0 * this.aClass167_11.anInt5192;
		@Pc(59) int local59 = arg1 * this.aClass167_11.anInt5192;
		@Pc(62) int local62 = local16.getRowPitch();
		if (local62 == local59 && local53 == local59) {
			local16.a((byte[]) arg3, 0, 0, local59 * arg4);
		} else {
			for (@Pc(74) int local74 = 0; local74 < arg4; local74++) {
				local16.a(arg3, local74 * local53, local62 * local74, local59);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "(I)V")
	@Override
	public void method6469() {
		this.aClass5_Sub3_Sub2_8.method6437(this);
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)I")
	@Override
	public int method3273() {
		return this.anInt3946;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIIII[II)V")
	@Override
	public void method3271(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5) {
		if (Static468.aClass167_14 != this.aClass167_11 || this.aClass310_11 != Static524.aClass310_16) {
			throw new RuntimeException();
		}
		@Pc(24) PixelBuffer local24 = this.aClass5_Sub3_Sub2_8.aPixelBuffer1;
		@Pc(35) int local35 = this.anIDirect3DTexture1.LockRect(0, arg0, arg3, arg2, arg5, 0, local24);
		if (!qc.a((byte) 48, local35)) {
			return;
		}
		@Pc(42) int local42 = local24.getRowPitch();
		if (local42 == arg2 * 4 && arg1 == arg2) {
			local24.b(arg4, 0, 0, arg2 * arg5);
		} else {
			for (@Pc(56) int local56 = 0; local56 < arg5; local56++) {
				local24.b(arg4, local56 * arg1, local56 * local42, arg2);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method3276() {
		return true;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZF)F")
	@Override
	public float method3275(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt3946;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IF)F")
	@Override
	public float method3277(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt3945;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)I")
	@Override
	public int method3272() {
		return this.anInt3945;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZZB)V")
	@Override
	public void method3270(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean292 = arg1;
		this.aBoolean293 = arg0;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!lba;I)V")
	@Override
	public void method6468(@OriginalArg(0) Class172 arg0) {
		super.method6468(arg0);
	}

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method5960() {
		return this.anIDirect3DTexture1;
	}
}

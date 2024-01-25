import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.ck;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class193_Sub1 extends Class193 implements Interface7 {

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "Z")
	public boolean aBoolean397;

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "Z")
	public boolean aBoolean398;

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
	private final int anInt5177;

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
	private final int anInt5176;

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!os;Lclient!hh;IIZ[BII)V")
	public Class193_Sub1(@OriginalArg(0) Class75_Sub1_Sub2 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static435.aClass274_13, arg4 && arg0.aBoolean578, arg2 * arg3);
		if (this.aClass75_Sub1_Sub2_8.aBoolean579) {
			this.anInt5177 = arg2;
			this.anInt5176 = arg3;
		} else {
			this.anInt5177 = Static314.method4970(arg2);
			this.anInt5176 = Static314.method4970(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass75_Sub1_Sub2_8.anIDirect3DDevice1.a(this.anInt5177, this.anInt5176, 0, 1024, Static440.method6860(Static435.aClass274_13, this.aClass155_54), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass75_Sub1_Sub2_8.anIDirect3DDevice1.a(this.anInt5177, this.anInt5176, 1, 0, Static440.method6860(Static435.aClass274_13, this.aClass155_54), 1);
		}
		@Pc(80) PixelBuffer local80 = this.aClass75_Sub1_Sub2_8.aPixelBuffer1;
		@Pc(91) int local91 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local80);
		if (ck.a(local91, -1)) {
			@Pc(112) int local112 = arg2 * this.aClass155_54.anInt4383;
			@Pc(118) int local118 = arg2 * this.aClass155_54.anInt4383;
			@Pc(121) int local121 = local80.getRowPitch();
			if (local118 == local121 && local118 == local112) {
				local80.a((byte[]) arg5, arg6, 0, local118 * arg3);
			} else {
				for (@Pc(135) int local135 = 0; local135 < arg3; local135++) {
					local80.a(arg5, arg6 + local112 * local135, local135 * local121, local118);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!os;IIZ[III)V")
	public Class193_Sub1(@OriginalArg(0) Class75_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static432.aClass155_45, Static435.aClass274_13, arg3 && arg0.aBoolean578, arg1 * arg2);
		if (this.aClass75_Sub1_Sub2_8.aBoolean579) {
			this.anInt5176 = arg2;
			this.anInt5177 = arg1;
		} else {
			this.anInt5177 = Static314.method4970(arg1);
			this.anInt5176 = Static314.method4970(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass75_Sub1_Sub2_8.anIDirect3DDevice1.a(this.anInt5177, this.anInt5176, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass75_Sub1_Sub2_8.anIDirect3DDevice1.a(this.anInt5177, this.anInt5176, 1, 0, 21, 1);
		}
		@Pc(72) PixelBuffer local72 = this.aClass75_Sub1_Sub2_8.aPixelBuffer1;
		@Pc(83) int local83 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local72);
		if (ck.a(local83, -1)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(96) int local96 = local72.getRowPitch();
			if (local96 == arg1 * 4 && arg1 == arg6) {
				local72.a((int[]) arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(108) int local108 = 0; local108 < arg2; local108++) {
					local72.a(arg4, local108 * arg6 + arg5, local96 * local108, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!os;Lclient!hh;Lclient!on;II)V")
	public Class193_Sub1(@OriginalArg(0) Class75_Sub1_Sub2 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) Class274 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass75_Sub1_Sub2_8.aBoolean579) {
			this.anInt5177 = arg3;
			this.anInt5176 = arg4;
		} else {
			this.anInt5177 = Static314.method4970(arg3);
			this.anInt5176 = Static314.method4970(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass75_Sub1_Sub2_8.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static440.method6860(this.aClass274_18, this.aClass155_54), 1);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8722() {
		return true;
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)I")
	@Override
	public int method8724() {
		return this.anInt5177;
	}

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8209() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZF)F")
	@Override
	public float method8720(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt5176;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIII[IB)V")
	@Override
	public void method8717(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int[] arg2) {
		if (Static432.aClass155_45 != this.aClass155_54 || this.aClass274_18 != Static435.aClass274_13) {
			throw new RuntimeException();
		}
		@Pc(19) PixelBuffer local19 = this.aClass75_Sub1_Sub2_8.aPixelBuffer1;
		@Pc(30) int local30 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg0, arg1, 16, local19);
		if (!ck.a(local30, -1)) {
			return;
		}
		@Pc(37) int local37 = local19.getRowPitch();
		if (local37 == arg0 * 4) {
			local19.b(arg2, 0, 0, arg2.length);
		} else {
			for (@Pc(57) int local57 = 0; local57 < arg1; local57++) {
				local19.b(arg2, local57 * arg0, local57 * local37, arg0);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!hh;I[BIIIIII)V")
	@Override
	public void method8716(@OriginalArg(0) Class155 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 != this.aClass155_54 || Static435.aClass274_13 != this.aClass274_18) {
			throw new RuntimeException();
		}
		@Pc(33) PixelBuffer local33 = this.aClass75_Sub1_Sub2_8.aPixelBuffer1;
		@Pc(44) int local44 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg4, arg3, 0, local33);
		if (!ck.a(local44, -1)) {
			return;
		}
		@Pc(54) int local54 = arg2 * this.aClass155_54.anInt4383;
		@Pc(60) int local60 = arg4 * this.aClass155_54.anInt4383;
		@Pc(63) int local63 = local33.getRowPitch();
		if (local63 == local60 && local54 == local60) {
			local33.a((byte[]) arg1, 0, 0, arg3 * local60);
		} else {
			for (@Pc(87) int local87 = 0; local87 < arg3; local87++) {
				local33.a(arg1, local54 * local87, local63 * local87, local60);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZZ)V")
	@Override
	public void method8723(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean398 = arg1;
		this.aBoolean397 = arg0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!td;I)V")
	@Override
	public void method8704(@OriginalArg(0) Class338 arg0) {
		super.method8704(arg0);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIBI[IIII)V")
	@Override
	public void method8721(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static432.aClass155_45 != this.aClass155_54 || Static435.aClass274_13 != this.aClass274_18) {
			throw new RuntimeException();
		}
		@Pc(19) PixelBuffer local19 = this.aClass75_Sub1_Sub2_8.aPixelBuffer1;
		@Pc(30) int local30 = this.anIDirect3DTexture1.LockRect(0, arg5, arg0, arg4, arg3, 0, local19);
		if (!ck.a(local30, -1)) {
			return;
		}
		@Pc(47) int local47 = local19.getRowPitch();
		if (arg4 * 4 == local47 && arg4 == arg1) {
			local19.a((int[]) arg2, 0, 0, arg3 * arg4);
		} else {
			for (@Pc(63) int local63 = 0; local63 < arg3; local63++) {
				local19.a(arg2, local63 * arg1, local63 * local47, arg4);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	@Override
	public void method8703() {
		this.aClass75_Sub1_Sub2_8.method6861(this);
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)I")
	@Override
	public int method8718() {
		return this.anInt5176;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IF)F")
	@Override
	public float method8719(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt5177;
	}
}

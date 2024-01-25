import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.ala;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dea")
public final class Class52_Sub2 extends Class52 implements Interface6 {

	@OriginalMember(owner = "client!dea", name = "i", descriptor = "Z")
	public boolean aBoolean182;

	@OriginalMember(owner = "client!dea", name = "h", descriptor = "Z")
	public boolean aBoolean183;

	@OriginalMember(owner = "client!dea", name = "f", descriptor = "I")
	private final int anInt2166;

	@OriginalMember(owner = "client!dea", name = "g", descriptor = "I")
	private final int anInt2165;

	@OriginalMember(owner = "client!dea", name = "j", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!de;Lclient!hd;Lclient!ns;II)V")
	public Class52_Sub2(@OriginalArg(0) Class67_Sub1_Sub1 arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) Class261 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass67_Sub1_Sub1_4.aBoolean177) {
			this.anInt2166 = arg4;
			this.anInt2165 = arg3;
		} else {
			this.anInt2165 = Static60.method735(arg3);
			this.anInt2166 = Static60.method735(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass67_Sub1_Sub1_4.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static107.method1928(this.aClass261_8, this.aClass145_8), 1);
	}

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!de;Lclient!hd;IIZ[BII)V")
	public Class52_Sub2(@OriginalArg(0) Class67_Sub1_Sub1 arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static438.aClass261_14, arg4 && arg0.aBoolean179, arg3 * arg2);
		if (this.aClass67_Sub1_Sub1_4.aBoolean177) {
			this.anInt2166 = arg3;
			this.anInt2165 = arg2;
		} else {
			this.anInt2165 = Static60.method735(arg2);
			this.anInt2166 = Static60.method735(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass67_Sub1_Sub1_4.anIDirect3DDevice1.a(this.anInt2165, this.anInt2166, 0, 1024, Static107.method1928(Static438.aClass261_14, this.aClass145_8), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass67_Sub1_Sub1_4.anIDirect3DDevice1.a(this.anInt2165, this.anInt2166, 1, 0, Static107.method1928(Static438.aClass261_14, this.aClass145_8), 1);
		}
		@Pc(80) PixelBuffer local80 = this.aClass67_Sub1_Sub1_4.aPixelBuffer1;
		@Pc(91) int local91 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local80);
		if (ala.a(local91, -1)) {
			@Pc(112) int local112 = arg2 * this.aClass145_8.anInt4448;
			@Pc(118) int local118 = arg2 * this.aClass145_8.anInt4448;
			@Pc(121) int local121 = local80.getRowPitch();
			if (local121 == local112 && local118 == local112) {
				local80.a((byte[]) arg5, arg6, 0, arg3 * local112);
			} else {
				for (@Pc(149) int local149 = 0; local149 < arg3; local149++) {
					local80.a(arg5, arg6 + local118 * local149, local121 * local149, local112);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!de;IIZ[III)V")
	public Class52_Sub2(@OriginalArg(0) Class67_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static557.aClass145_14, Static438.aClass261_14, arg3 && arg0.aBoolean179, arg2 * arg1);
		if (this.aClass67_Sub1_Sub1_4.aBoolean177) {
			this.anInt2165 = arg1;
			this.anInt2166 = arg2;
		} else {
			this.anInt2165 = Static60.method735(arg1);
			this.anInt2166 = Static60.method735(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass67_Sub1_Sub1_4.anIDirect3DDevice1.a(this.anInt2165, this.anInt2166, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass67_Sub1_Sub1_4.anIDirect3DDevice1.a(this.anInt2165, this.anInt2166, 1, 0, 21, 1);
		}
		@Pc(72) PixelBuffer local72 = this.aClass67_Sub1_Sub1_4.aPixelBuffer1;
		@Pc(83) int local83 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local72);
		if (ala.a(local83, -1)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(97) int local97 = local72.getRowPitch();
			if (arg1 * 4 == local97 && arg1 == arg6) {
				local72.b(arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(119) int local119 = 0; local119 < arg2; local119++) {
					local72.b(arg4, arg5 + local119 * arg6, local97 * local119, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIIIII[I)V")
	@Override
	public void method9274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) int[] arg2) {
		if (Static557.aClass145_14 != this.aClass145_8 || this.aClass261_8 != Static438.aClass261_14) {
			throw new RuntimeException();
		}
		@Pc(19) PixelBuffer local19 = this.aClass67_Sub1_Sub1_4.aPixelBuffer1;
		@Pc(30) int local30 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg0, 16, local19);
		if (!ala.a(local30, -1)) {
			return;
		}
		@Pc(46) int local46 = local19.getRowPitch();
		if (local46 == arg1 * 4) {
			local19.a((int[]) arg2, 0, 0, arg2.length);
		} else {
			for (@Pc(57) int local57 = 0; local57 < arg0; local57++) {
				local19.a(arg2, local57 * arg1, local46 * local57, arg1);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(FB)F")
	@Override
	public float method9276(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt2165;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZBZ)V")
	@Override
	public void method9275(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean182 = arg1;
		this.aBoolean183 = arg0;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!vea;I)V")
	@Override
	public void method9258(@OriginalArg(0) Class384 arg0) {
		super.method9258(arg0);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)I")
	@Override
	public int method9277() {
		return this.anInt2166;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Z)V")
	@Override
	public void method9257() {
		this.aClass67_Sub1_Sub1_4.method1927(this);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(I[IIIIIII)V")
	@Override
	public void method9273(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static557.aClass145_14 != this.aClass145_8 || this.aClass261_8 != Static438.aClass261_14) {
			throw new RuntimeException();
		}
		@Pc(18) PixelBuffer local18 = this.aClass67_Sub1_Sub1_4.aPixelBuffer1;
		@Pc(37) int local37 = this.anIDirect3DTexture1.LockRect(0, arg3, arg1, arg4, arg2, 0, local18);
		if (!ala.a(local37, -1)) {
			return;
		}
		@Pc(46) int local46 = local18.getRowPitch();
		if (local46 == arg4 * 4 && arg5 == arg4) {
			local18.b(arg0, 0, 0, arg2 * arg4);
		} else {
			for (@Pc(58) int local58 = 0; local58 < arg2; local58++) {
				local18.b(arg0, arg5 * local58, local58 * local46, arg4);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method4344() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(III[BBLclient!hd;III)V")
	@Override
	public void method9270(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(5) Class145 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4) {
		if (this.aClass145_8 != arg2 || this.aClass261_8 != Static438.aClass261_14) {
			throw new RuntimeException();
		}
		@Pc(22) PixelBuffer local22 = this.aClass67_Sub1_Sub1_4.aPixelBuffer1;
		@Pc(33) int local33 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg3, arg4, 0, local22);
		if (!ala.a(local33, -1)) {
			return;
		}
		@Pc(45) int local45 = arg0 * this.aClass145_8.anInt4448;
		@Pc(51) int local51 = arg3 * this.aClass145_8.anInt4448;
		@Pc(54) int local54 = local22.getRowPitch();
		if (local54 == local51 && local45 == local51) {
			local22.a((byte[]) arg1, 0, 0, local51 * arg4);
		} else {
			for (@Pc(78) int local78 = 0; local78 < arg4; local78++) {
				local22.a(arg1, local78 * local45, local54 * local78, local51);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9272() {
		return true;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(FI)F")
	@Override
	public float method9269(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt2166;
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(B)I")
	@Override
	public int method9271() {
		return this.anInt2165;
	}
}

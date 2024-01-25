import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.mo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class24_Sub1 extends Class24 implements Interface3 {

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "Z")
	public boolean aBoolean35;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "Z")
	public boolean aBoolean36;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
	private final int anInt827;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
	private final int anInt828;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!hv;Lclient!uda;IIZ[BII)V")
	public Class24_Sub1(@OriginalArg(0) Class122_Sub2_Sub1 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static431.aClass264_15, arg4 && arg0.aBoolean276, arg3 * arg2);
		if (this.aClass122_Sub2_Sub1_5.aBoolean277) {
			this.anInt827 = arg2;
			this.anInt828 = arg3;
		} else {
			this.anInt827 = Static352.method5306(arg2);
			this.anInt828 = Static352.method5306(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass122_Sub2_Sub1_5.anIDirect3DDevice1.a(this.anInt827, this.anInt828, 0, 1024, Static195.method3407(this.aClass292_7, Static431.aClass264_15), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass122_Sub2_Sub1_5.anIDirect3DDevice1.a(this.anInt827, this.anInt828, 1, 0, Static195.method3407(this.aClass292_7, Static431.aClass264_15), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass122_Sub2_Sub1_5.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (mo.b(local90, 28658)) {
			@Pc(109) int local109 = arg2 * this.aClass292_7.anInt8024;
			@Pc(115) int local115 = arg2 * this.aClass292_7.anInt8024;
			@Pc(118) int local118 = local79.getRowPitch();
			if (local118 == local115 && local115 == local109) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local115);
			} else {
				for (@Pc(134) int local134 = 0; local134 < arg3; local134++) {
					local79.a(arg5, arg6 + local134 * local109, local134 * local118, local115);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!hv;Lclient!uda;Lclient!sb;II)V")
	public Class24_Sub1(@OriginalArg(0) Class122_Sub2_Sub1 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) Class264 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass122_Sub2_Sub1_5.aBoolean277) {
			this.anInt827 = arg3;
			this.anInt828 = arg4;
		} else {
			this.anInt827 = Static352.method5306(arg3);
			this.anInt828 = Static352.method5306(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass122_Sub2_Sub1_5.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static195.method3407(this.aClass292_7, this.aClass264_8), 1);
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!hv;IIZ[III)V")
	public Class24_Sub1(@OriginalArg(0) Class122_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static542.aClass292_17, Static431.aClass264_15, arg3 && arg0.aBoolean276, arg1 * arg2);
		if (this.aClass122_Sub2_Sub1_5.aBoolean277) {
			this.anInt827 = arg1;
			this.anInt828 = arg2;
		} else {
			this.anInt827 = Static352.method5306(arg1);
			this.anInt828 = Static352.method5306(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass122_Sub2_Sub1_5.anIDirect3DDevice1.a(this.anInt827, this.anInt828, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass122_Sub2_Sub1_5.anIDirect3DDevice1.a(this.anInt827, this.anInt828, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass122_Sub2_Sub1_5.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (mo.b(local82, 28658)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(93) int local93 = local71.getRowPitch();
			if (local93 == arg1 * 4 && arg6 == arg1) {
				local71.b(arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(107) int local107 = 0; local107 < arg2; local107++) {
					local71.b(arg4, arg6 * local107 + arg5, local107 * local93, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)I")
	@Override
	public int method7315() {
		return this.anInt827;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[BIBLclient!uda;III)V")
	@Override
	public void method7321(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class292 arg3, @OriginalArg(7) int arg4) {
		if (arg3 != this.aClass292_7 || Static431.aClass264_15 != this.aClass264_8) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass122_Sub2_Sub1_5.aPixelBuffer1;
		@Pc(27) int local27 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg4, 0, local16);
		if (!mo.b(local27, 28658)) {
			return;
		}
		@Pc(37) int local37 = arg2 * this.aClass292_7.anInt8024;
		@Pc(43) int local43 = arg0 * this.aClass292_7.anInt8024;
		@Pc(46) int local46 = local16.getRowPitch();
		if (local37 == local46 && local43 == local37) {
			local16.a((byte[]) arg1, 0, 0, local37 * arg4);
		} else {
			for (@Pc(62) int local62 = 0; local62 < arg4; local62++) {
				local16.a(arg1, local43 * local62, local46 * local62, local37);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IF)F")
	@Override
	public float method7317(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt828;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BF)F")
	@Override
	public float method7320(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt827;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!gu;I)V")
	@Override
	public void method7302(@OriginalArg(0) Class113 arg0) {
		super.method7302(arg0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method7318(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean36 = arg0;
		this.aBoolean35 = arg1;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method3590() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)I")
	@Override
	public int method7319() {
		return this.anInt828;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III[IIIII)V")
	@Override
	public void method7322(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (this.aClass292_7 != Static542.aClass292_17 || Static431.aClass264_15 != this.aClass264_8) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass122_Sub2_Sub1_5.aPixelBuffer1;
		@Pc(27) int local27 = this.anIDirect3DTexture1.LockRect(0, arg2, arg5, arg4, arg3, 0, local16);
		if (!mo.b(local27, 28658)) {
			return;
		}
		@Pc(35) int local35 = local16.getRowPitch();
		if (local35 == arg4 * 4 && arg0 == arg4) {
			local16.b(arg1, 0, 0, arg4 * arg3);
		} else {
			for (@Pc(53) int local53 = 0; local53 < arg3; local53++) {
				local16.b(arg1, local53 * arg0, local53 * local35, arg4);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
	@Override
	public void method7303() {
		this.aClass122_Sub2_Sub1_5.method3409(this);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7316() {
		return true;
	}
}

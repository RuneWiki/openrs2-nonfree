import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.hc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class51_Sub1 extends Class51 implements Interface26 {

	@OriginalMember(owner = "client!dda", name = "i", descriptor = "Z")
	public boolean aBoolean151;

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "Z")
	public boolean aBoolean152;

	@OriginalMember(owner = "client!dda", name = "j", descriptor = "I")
	private final int anInt1601;

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
	private final int anInt1602;

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!sd;Lclient!eu;IIZ[BII)V")
	public Class51_Sub1(@OriginalArg(0) Class57_Sub3_Sub2 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static453.aClass278_13, arg4 && arg0.aBoolean702, arg3 * arg2);
		if (this.aClass57_Sub3_Sub2_6.aBoolean704) {
			this.anInt1601 = arg2;
			this.anInt1602 = arg3;
		} else {
			this.anInt1601 = Static94.method1393(arg2);
			this.anInt1602 = Static94.method1393(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass57_Sub3_Sub2_6.anIDirect3DDevice1.a(this.anInt1601, this.anInt1602, 0, 1024, Static531.method7874(Static453.aClass278_13, this.aClass114_8), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass57_Sub3_Sub2_6.anIDirect3DDevice1.a(this.anInt1601, this.anInt1602, 1, 0, Static531.method7874(Static453.aClass278_13, this.aClass114_8), 1);
		}
		@Pc(80) PixelBuffer local80 = this.aClass57_Sub3_Sub2_6.aPixelBuffer1;
		@Pc(91) int local91 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local80);
		if (hc.a(local91, true)) {
			@Pc(112) int local112 = arg2 * this.aClass114_8.anInt2411;
			@Pc(118) int local118 = arg2 * this.aClass114_8.anInt2411;
			@Pc(121) int local121 = local80.getRowPitch();
			if (local112 == local121 && local118 == local112) {
				local80.a((byte[]) arg5, arg6, 0, arg3 * local112);
			} else {
				for (@Pc(135) int local135 = 0; local135 < arg3; local135++) {
					local80.a(arg5, local135 * local118 + arg6, local121 * local135, local112);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!sd;Lclient!eu;Lclient!pj;II)V")
	public Class51_Sub1(@OriginalArg(0) Class57_Sub3_Sub2 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) Class278 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass57_Sub3_Sub2_6.aBoolean704) {
			this.anInt1601 = arg3;
			this.anInt1602 = arg4;
		} else {
			this.anInt1601 = Static94.method1393(arg3);
			this.anInt1602 = Static94.method1393(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass57_Sub3_Sub2_6.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static531.method7874(this.aClass278_7, this.aClass114_8), 1);
	}

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!sd;IIZ[III)V")
	public Class51_Sub1(@OriginalArg(0) Class57_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static412.aClass114_17, Static453.aClass278_13, arg3 && arg0.aBoolean702, arg2 * arg1);
		if (this.aClass57_Sub3_Sub2_6.aBoolean704) {
			this.anInt1602 = arg2;
			this.anInt1601 = arg1;
		} else {
			this.anInt1601 = Static94.method1393(arg1);
			this.anInt1602 = Static94.method1393(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass57_Sub3_Sub2_6.anIDirect3DDevice1.a(this.anInt1601, this.anInt1602, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass57_Sub3_Sub2_6.anIDirect3DDevice1.a(this.anInt1601, this.anInt1602, 1, 0, 21, 1);
		}
		@Pc(72) PixelBuffer local72 = this.aClass57_Sub3_Sub2_6.aPixelBuffer1;
		@Pc(83) int local83 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local72);
		if (hc.a(local83, true)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(99) int local99 = local72.getRowPitch();
			if (local99 == arg1 * 4 && arg1 == arg6) {
				local72.a((int[]) arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(115) int local115 = 0; local115 < arg2; local115++) {
					local72.a(arg4, arg5 + local115 * arg6, local115 * local99, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(BF)F")
	@Override
	public float method4353(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt1601;
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4352() {
		return true;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I[BIIIIILclient!eu;I)V")
	@Override
	public void method4354(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(7) Class114 arg4) {
		if (arg4 != this.aClass114_8 || this.aClass278_7 != Static453.aClass278_13) {
			throw new RuntimeException();
		}
		@Pc(18) PixelBuffer local18 = this.aClass57_Sub3_Sub2_6.aPixelBuffer1;
		@Pc(29) int local29 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg3, arg2, 0, local18);
		if (!hc.a(local29, true)) {
			return;
		}
		@Pc(57) int local57 = arg3 * this.aClass114_8.anInt2411;
		@Pc(63) int local63 = arg0 * this.aClass114_8.anInt2411;
		@Pc(66) int local66 = local18.getRowPitch();
		if (local57 == local66 && local57 == local63) {
			local18.a((byte[]) arg1, 0, 0, arg2 * local57);
		} else {
			for (@Pc(80) int local80 = 0; local80 < arg2; local80++) {
				local18.a(arg1, local63 * local80, local66 * local80, local57);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method4348(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean151 = arg1;
		this.aBoolean152 = arg0;
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(B)I")
	@Override
	public int method4347() {
		return this.anInt1601;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZLclient!li;)V")
	@Override
	public void method8306(@OriginalArg(1) Class216 arg0) {
		super.method8306(arg0);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "([IIIIIII)V")
	@Override
	public void method4350(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2) {
		if (this.aClass114_8 != Static412.aClass114_17 || this.aClass278_7 != Static453.aClass278_13) {
			throw new RuntimeException();
		}
		@Pc(18) PixelBuffer local18 = this.aClass57_Sub3_Sub2_6.aPixelBuffer1;
		@Pc(29) int local29 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg1, 16, local18);
		if (!hc.a(local29, true)) {
			return;
		}
		@Pc(36) int local36 = local18.getRowPitch();
		if (arg2 * 4 == local36) {
			local18.b(arg0, 0, 0, arg0.length);
		} else {
			for (@Pc(56) int local56 = 0; local56 < arg1; local56++) {
				local18.b(arg0, arg2 * local56, local36 * local56, arg2);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V")
	@Override
	public void method8305() {
		this.aClass57_Sub3_Sub2_6.method7879(this);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)I")
	@Override
	public int method4349() {
		return this.anInt1602;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IF)F")
	@Override
	public float method4346(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt1602;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "([IIBIIIII)V")
	@Override
	public void method4351(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static412.aClass114_17 != this.aClass114_8 || this.aClass278_7 != Static453.aClass278_13) {
			throw new RuntimeException();
		}
		@Pc(23) PixelBuffer local23 = this.aClass57_Sub3_Sub2_6.aPixelBuffer1;
		@Pc(34) int local34 = this.anIDirect3DTexture1.LockRect(0, arg2, arg3, arg4, arg5, 0, local23);
		if (!hc.a(local34, true)) {
			return;
		}
		@Pc(41) int local41 = local23.getRowPitch();
		if (arg4 * 4 == local41 && arg4 == arg1) {
			local23.a((int[]) arg0, 0, 0, arg5 * arg4);
		} else {
			for (@Pc(71) int local71 = 0; local71 < arg5; local71++) {
				local23.a(arg0, local71 * arg1, local41 * local71, arg4);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method2834() {
		return this.anIDirect3DTexture1;
	}
}

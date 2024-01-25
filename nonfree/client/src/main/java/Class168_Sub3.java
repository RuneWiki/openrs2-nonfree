import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.gfa;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class168_Sub3 extends Class168 implements Interface11 {

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "Z")
	public boolean aBoolean799;

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "Z")
	public boolean aBoolean800;

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
	private final int anInt9537;

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
	private final int anInt9538;

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!ik;Lclient!wu;Lclient!bk;II)V")
	public Class168_Sub3(@OriginalArg(0) Class162_Sub1_Sub1 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass162_Sub1_Sub1_9.aBoolean289) {
			this.anInt9537 = arg4;
			this.anInt9538 = arg3;
		} else {
			this.anInt9538 = Static355.method5078(arg3);
			this.anInt9537 = Static355.method5078(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass162_Sub1_Sub1_9.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static231.method3307(this.aClass366_15, this.aClass35_20), 1);
	}

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!ik;IIZ[III)V")
	public Class168_Sub3(@OriginalArg(0) Class162_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static225.aClass366_3, Static42.aClass35_4, arg3 && arg0.aBoolean287, arg2 * arg1);
		if (this.aClass162_Sub1_Sub1_9.aBoolean289) {
			this.anInt9538 = arg1;
			this.anInt9537 = arg2;
		} else {
			this.anInt9538 = Static355.method5078(arg1);
			this.anInt9537 = Static355.method5078(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass162_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt9538, this.anInt9537, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass162_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt9538, this.anInt9537, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass162_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (gfa.a(local82, (int) 10067)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(95) int local95 = local71.getRowPitch();
			if (arg1 * 4 == local95 && arg1 == arg6) {
				local71.a((int[]) arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(118) int local118 = 0; local118 < arg2; local118++) {
					local71.a(arg4, local118 * arg6 + arg5, local118 * local95, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!ik;Lclient!wu;IIZ[BII)V")
	public Class168_Sub3(@OriginalArg(0) Class162_Sub1_Sub1 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static42.aClass35_4, arg4 && arg0.aBoolean287, arg3 * arg2);
		if (this.aClass162_Sub1_Sub1_9.aBoolean289) {
			this.anInt9538 = arg2;
			this.anInt9537 = arg3;
		} else {
			this.anInt9538 = Static355.method5078(arg2);
			this.anInt9537 = Static355.method5078(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass162_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt9538, this.anInt9537, 0, 1024, Static231.method3307(this.aClass366_15, Static42.aClass35_4), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass162_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt9538, this.anInt9537, 1, 0, Static231.method3307(this.aClass366_15, Static42.aClass35_4), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass162_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (gfa.a(local90, (int) 10067)) {
			@Pc(106) int local106 = arg2 * this.aClass366_15.anInt9633;
			@Pc(112) int local112 = arg2 * this.aClass366_15.anInt9633;
			@Pc(115) int local115 = local79.getRowPitch();
			if (local115 == local112 && local106 == local112) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local112);
			} else {
				for (@Pc(127) int local127 = 0; local127 < arg3; local127++) {
					local79.a(arg5, arg6 + local106 * local127, local115 * local127, local112);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II[IIIIII)V")
	@Override
	public void method7637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aClass366_15 != Static225.aClass366_3 || this.aClass35_20 != Static42.aClass35_4) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass162_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(34) int local34 = this.anIDirect3DTexture1.LockRect(0, arg1, arg4, arg5, arg3, 0, local16);
		if (!gfa.a(local34, (int) 10067)) {
			return;
		}
		@Pc(42) int local42 = local16.getRowPitch();
		if (local42 == arg5 * 4 && arg0 == arg5) {
			local16.a((int[]) arg2, 0, 0, arg5 * arg3);
		} else {
			for (@Pc(60) int local60 = 0; local60 < arg3; local60++) {
				local16.a(arg2, local60 * arg0, local42 * local60, arg5);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7643() {
		return true;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)I")
	@Override
	public int method7638() {
		return this.anInt9538;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!kk;I)V")
	@Override
	public void method7634(@OriginalArg(0) Class195 arg0) {
		super.method7634(arg0);
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7633() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
	@Override
	public void method7635() {
		this.aClass162_Sub1_Sub1_9.method3301(this);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZZB)V")
	@Override
	public void method7639(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean799 = arg1;
		this.aBoolean800 = arg0;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(FI)F")
	@Override
	public float method7636(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt9537;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)I")
	@Override
	public int method7642() {
		return this.anInt9537;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIII[BLclient!wu;I)V")
	@Override
	public void method7641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) Class366 arg4) {
		if (arg4 != this.aClass366_15 || this.aClass35_20 != Static42.aClass35_4) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass162_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(26) int local26 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg0, 0, local15);
		if (!gfa.a(local26, (int) 10067)) {
			return;
		}
		@Pc(45) int local45 = arg2 * this.aClass366_15.anInt9633;
		@Pc(51) int local51 = arg1 * this.aClass366_15.anInt9633;
		@Pc(54) int local54 = local15.getRowPitch();
		if (local51 == local54 && local51 == local45) {
			local15.a((byte[]) arg3, 0, 0, arg0 * local51);
		} else {
			for (@Pc(71) int local71 = 0; local71 < arg0; local71++) {
				local15.a(arg3, local45 * local71, local71 * local54, local51);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IF)F")
	@Override
	public float method7640(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt9538;
	}
}

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.ue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class55_Sub2 extends Class55 implements Interface27 {

	@OriginalMember(owner = "client!kt", name = "i", descriptor = "Z")
	public boolean aBoolean477;

	@OriginalMember(owner = "client!kt", name = "j", descriptor = "Z")
	public boolean aBoolean478;

	@OriginalMember(owner = "client!kt", name = "h", descriptor = "I")
	private final int anInt6355;

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
	private final int anInt6354;

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!bfa;IIZ[III)V")
	public Class55_Sub2(@OriginalArg(0) Class20_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static354.aClass375_31, Static29.aClass26_4, arg3 && arg0.aBoolean108, arg2 * arg1);
		if (this.aClass20_Sub2_Sub1_8.aBoolean107) {
			this.anInt6354 = arg2;
			this.anInt6355 = arg1;
		} else {
			this.anInt6355 = Static231.method4407(arg1);
			this.anInt6354 = Static231.method4407(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass20_Sub2_Sub1_8.anIDirect3DDevice1.a(this.anInt6355, this.anInt6354, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass20_Sub2_Sub1_8.anIDirect3DDevice1.a(this.anInt6355, this.anInt6354, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass20_Sub2_Sub1_8.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (ue.a(local82, false)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(95) int local95 = local71.getRowPitch();
			if (local95 == arg1 * 4 && arg1 == arg6) {
				local71.a((int[]) arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(114) int local114 = 0; local114 < arg2; local114++) {
					local71.a(arg4, local114 * arg6 + arg5, local95 * local114, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!bfa;Lclient!wq;Lclient!baa;II)V")
	public Class55_Sub2(@OriginalArg(0) Class20_Sub2_Sub1 arg0, @OriginalArg(1) Class375 arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass20_Sub2_Sub1_8.aBoolean107) {
			this.anInt6355 = arg3;
			this.anInt6354 = arg4;
		} else {
			this.anInt6355 = Static231.method4407(arg3);
			this.anInt6354 = Static231.method4407(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass20_Sub2_Sub1_8.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static39.method1331(this.aClass26_17, this.aClass375_33), 1);
	}

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!bfa;Lclient!wq;IIZ[BII)V")
	public Class55_Sub2(@OriginalArg(0) Class20_Sub2_Sub1 arg0, @OriginalArg(1) Class375 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static29.aClass26_4, arg4 && arg0.aBoolean108, arg2 * arg3);
		if (this.aClass20_Sub2_Sub1_8.aBoolean107) {
			this.anInt6355 = arg2;
			this.anInt6354 = arg3;
		} else {
			this.anInt6355 = Static231.method4407(arg2);
			this.anInt6354 = Static231.method4407(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass20_Sub2_Sub1_8.anIDirect3DDevice1.a(this.anInt6355, this.anInt6354, 0, 1024, Static39.method1331(Static29.aClass26_4, this.aClass375_33), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass20_Sub2_Sub1_8.anIDirect3DDevice1.a(this.anInt6355, this.anInt6354, 1, 0, Static39.method1331(Static29.aClass26_4, this.aClass375_33), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass20_Sub2_Sub1_8.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (ue.a(local90, false)) {
			@Pc(105) int local105 = arg2 * this.aClass375_33.anInt11029;
			@Pc(111) int local111 = arg2 * this.aClass375_33.anInt11029;
			@Pc(114) int local114 = local79.getRowPitch();
			if (local114 == local105 && local111 == local105) {
				local79.a((byte[]) arg5, arg6, 0, local105 * arg3);
			} else {
				for (@Pc(130) int local130 = 0; local130 < arg3; local130++) {
					local79.a(arg5, local130 * local111 + arg6, local114 * local130, local105);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!ria;I)V")
	@Override
	public void method8287(@OriginalArg(0) Class298 arg0) {
		super.method8287(arg0);
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6142() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)I")
	@Override
	public int method8303() {
		return this.anInt6355;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)I")
	@Override
	public int method8306() {
		return this.anInt6354;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I[IIIIBI)V")
	@Override
	public void method8299(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		if (Static354.aClass375_31 != this.aClass375_33 || this.aClass26_17 != Static29.aClass26_4) {
			throw new RuntimeException();
		}
		@Pc(22) PixelBuffer local22 = this.aClass20_Sub2_Sub1_8.aPixelBuffer1;
		@Pc(33) int local33 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 16, local22);
		if (!ue.a(local33, false)) {
			return;
		}
		@Pc(41) int local41 = local22.getRowPitch();
		if (local41 == arg1 * 4) {
			local22.b(arg0, 0, 0, arg0.length);
		} else {
			for (@Pc(48) int local48 = 0; local48 < arg2; local48++) {
				local22.b(arg0, arg1 * local48, local48 * local41, arg1);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BF)F")
	@Override
	public float method8305(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt6354;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(II[IIIIII)V")
	@Override
	public void method8302(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (this.aClass375_33 != Static354.aClass375_31 || this.aClass26_17 != Static29.aClass26_4) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass20_Sub2_Sub1_8.aPixelBuffer1;
		@Pc(27) int local27 = this.anIDirect3DTexture1.LockRect(0, arg2, arg4, arg3, arg5, 0, local16);
		if (!ue.a(local27, false)) {
			return;
		}
		@Pc(35) int local35 = local16.getRowPitch();
		if (arg3 * 4 == local35 && arg0 == arg3) {
			local16.a((int[]) arg1, 0, 0, arg5 * arg3);
		} else {
			for (@Pc(53) int local53 = 0; local53 < arg5; local53++) {
				local16.a(arg1, arg0 * local53, local53 * local35, arg3);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(FI)F")
	@Override
	public float method8301(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt6355;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V")
	@Override
	public void method8286() {
		this.aClass20_Sub2_Sub1_8.method1327(this);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIBIIII[BLclient!wq;)V")
	@Override
	public void method8304(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(7) byte[] arg3, @OriginalArg(8) Class375 arg4) {
		if (this.aClass375_33 != arg4 || this.aClass26_17 != Static29.aClass26_4) {
			throw new RuntimeException();
		}
		@Pc(20) PixelBuffer local20 = this.aClass20_Sub2_Sub1_8.aPixelBuffer1;
		@Pc(31) int local31 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg1, 0, local20);
		if (!ue.a(local31, false)) {
			return;
		}
		@Pc(42) int local42 = arg0 * this.aClass375_33.anInt11029;
		@Pc(48) int local48 = arg2 * this.aClass375_33.anInt11029;
		@Pc(51) int local51 = local20.getRowPitch();
		if (local48 == local51 && local42 == local48) {
			local20.a((byte[]) arg3, 0, 0, local48 * arg1);
		} else {
			for (@Pc(72) int local72 = 0; local72 < arg1; local72++) {
				local20.a(arg3, local72 * local42, local72 * local51, local48);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8307() {
		return true;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method8300(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean478 = arg1;
		this.aBoolean477 = arg0;
	}
}

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.mk;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class228_Sub2 extends Class228 implements Interface21 {

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "Z")
	public boolean aBoolean577;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "Z")
	public boolean aBoolean578;

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
	private final int anInt8332;

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
	private final int anInt8331;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!ta;IIZ[III)V")
	public Class228_Sub2(@OriginalArg(0) Class137_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static238.aClass363_4, Static47.aClass36_5, arg3 && arg0.aBoolean691, arg1 * arg2);
		if (this.aClass137_Sub1_Sub2_9.aBoolean690) {
			this.anInt8332 = arg1;
			this.anInt8331 = arg2;
		} else {
			this.anInt8332 = Static330.method5181(arg1);
			this.anInt8331 = Static330.method5181(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass137_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt8332, this.anInt8331, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass137_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt8332, this.anInt8331, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass137_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (mk.b(local82, -1)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(98) int local98 = local71.getRowPitch();
			if (arg1 * 4 == local98 && arg6 == arg1) {
				local71.b(arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(116) int local116 = 0; local116 < arg2; local116++) {
					local71.b(arg4, arg5 + arg6 * local116, local98 * local116, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!ta;Lclient!vea;IIZ[BII)V")
	public Class228_Sub2(@OriginalArg(0) Class137_Sub1_Sub2 arg0, @OriginalArg(1) Class363 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static47.aClass36_5, arg4 && arg0.aBoolean691, arg3 * arg2);
		if (this.aClass137_Sub1_Sub2_9.aBoolean690) {
			this.anInt8331 = arg3;
			this.anInt8332 = arg2;
		} else {
			this.anInt8332 = Static330.method5181(arg2);
			this.anInt8331 = Static330.method5181(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass137_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt8332, this.anInt8331, 0, 1024, Static560.method8093(this.aClass363_18, Static47.aClass36_5), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass137_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt8332, this.anInt8331, 1, 0, Static560.method8093(this.aClass363_18, Static47.aClass36_5), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass137_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (mk.b(local90, -1)) {
			@Pc(106) int local106 = arg2 * this.aClass363_18.anInt10558;
			@Pc(112) int local112 = arg2 * this.aClass363_18.anInt10558;
			@Pc(115) int local115 = local79.getRowPitch();
			if (local112 == local115 && local112 == local106) {
				local79.a((byte[]) arg5, arg6, 0, local112 * arg3);
			} else {
				for (@Pc(123) int local123 = 0; local123 < arg3; local123++) {
					local79.a(arg5, local123 * local106 + arg6, local115 * local123, local112);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!ta;Lclient!vea;Lclient!bja;II)V")
	public Class228_Sub2(@OriginalArg(0) Class137_Sub1_Sub2 arg0, @OriginalArg(1) Class363 arg1, @OriginalArg(2) Class36 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass137_Sub1_Sub2_9.aBoolean690) {
			this.anInt8332 = arg3;
			this.anInt8331 = arg4;
		} else {
			this.anInt8332 = Static330.method5181(arg3);
			this.anInt8331 = Static330.method5181(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass137_Sub1_Sub2_9.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static560.method8093(this.aClass363_18, this.aClass36_20), 1);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)I")
	@Override
	public int method9038() {
		return this.anInt8332;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(FI)F")
	@Override
	public float method9037(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt8332;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!tda;)V")
	@Override
	public void method9087(@OriginalArg(1) Class334 arg0) {
		super.method9087(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9040() {
		return true;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZZB)V")
	@Override
	public void method9033(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean578 = arg0;
		this.aBoolean577 = arg1;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIBI[III)V")
	@Override
	public void method9036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		if (this.aClass363_18 != Static238.aClass363_4 || Static47.aClass36_5 != this.aClass36_20) {
			throw new RuntimeException();
		}
		@Pc(19) PixelBuffer local19 = this.aClass137_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(30) int local30 = this.anIDirect3DTexture1.LockRect(0, arg3, arg2, arg0, arg5, 0, local19);
		if (!mk.b(local30, -1)) {
			return;
		}
		@Pc(37) int local37 = local19.getRowPitch();
		if (arg0 * 4 == local37 && arg1 == arg0) {
			local19.b(arg4, 0, 0, arg0 * arg5);
		} else {
			for (@Pc(56) int local56 = 0; local56 < arg5; local56++) {
				local19.b(arg4, arg1 * local56, local56 * local37, arg0);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILclient!vea;IIII[BI)V")
	@Override
	public void method9039(@OriginalArg(0) int arg0, @OriginalArg(2) Class363 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) byte[] arg4) {
		if (this.aClass363_18 != arg1 || Static47.aClass36_5 != this.aClass36_20) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass137_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(26) int local26 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg0, arg2, 0, local15);
		if (!mk.b(local26, -1)) {
			return;
		}
		@Pc(36) int local36 = arg3 * this.aClass363_18.anInt10558;
		@Pc(42) int local42 = arg0 * this.aClass363_18.anInt10558;
		@Pc(45) int local45 = local15.getRowPitch();
		if (local42 == local45 && local42 == local36) {
			local15.a((byte[]) arg4, 0, 0, local42 * arg2);
		} else {
			for (@Pc(61) int local61 = 0; local61 < arg2; local61++) {
				local15.a(arg4, local61 * local36, local45 * local61, local42);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIBI[III)V")
	@Override
	public void method9035(@OriginalArg(3) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(6) int arg2) {
		if (this.aClass363_18 != Static238.aClass363_4 || this.aClass36_20 != Static47.aClass36_5) {
			throw new RuntimeException();
		}
		@Pc(20) PixelBuffer local20 = this.aClass137_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(31) int local31 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg0, arg2, 16, local20);
		if (!mk.b(local31, -1)) {
			return;
		}
		@Pc(39) int local39 = local20.getRowPitch();
		if (local39 == arg0 * 4) {
			local20.a((int[]) arg1, 0, 0, arg1.length);
		} else {
			for (@Pc(46) int local46 = 0; local46 < arg2; local46++) {
				local20.a(arg1, arg0 * local46, local39 * local46, arg0);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method9086() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	@Override
	public void method9088() {
		this.aClass137_Sub1_Sub2_9.method8097(this);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(FI)F")
	@Override
	public float method9032(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt8331;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)I")
	@Override
	public int method9034() {
		return this.anInt8331;
	}
}

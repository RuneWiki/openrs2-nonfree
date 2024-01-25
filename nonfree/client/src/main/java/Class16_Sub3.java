import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.op;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class16_Sub3 extends Class16 implements Interface26 {

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "Z")
	public boolean aBoolean694;

	@OriginalMember(owner = "client!ut", name = "j", descriptor = "Z")
	public boolean aBoolean695;

	@OriginalMember(owner = "client!ut", name = "i", descriptor = "I")
	private final int anInt9581;

	@OriginalMember(owner = "client!ut", name = "h", descriptor = "I")
	private final int anInt9580;

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!lt;Lclient!kca;IIZ[BII)V")
	public Class16_Sub3(@OriginalArg(0) Class87_Sub1_Sub2 arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static545.aClass324_12, arg4 && arg0.aBoolean467, arg3 * arg2);
		if (this.aClass87_Sub1_Sub2_9.aBoolean465) {
			this.anInt9581 = arg2;
			this.anInt9580 = arg3;
		} else {
			this.anInt9581 = Static347.method5404(arg2);
			this.anInt9580 = Static347.method5404(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass87_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt9581, this.anInt9580, 0, 1024, Static332.method5160(Static545.aClass324_12, this.aClass187_17), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass87_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt9581, this.anInt9580, 1, 0, Static332.method5160(Static545.aClass324_12, this.aClass187_17), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass87_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (op.a(local90, (byte) -126)) {
			@Pc(108) int local108 = arg2 * this.aClass187_17.anInt5376;
			@Pc(114) int local114 = arg2 * this.aClass187_17.anInt5376;
			@Pc(117) int local117 = local79.getRowPitch();
			if (local117 == local108 && local108 == local114) {
				local79.a((byte[]) arg5, arg6, 0, local108 * arg3);
			} else {
				for (@Pc(129) int local129 = 0; local129 < arg3; local129++) {
					local79.a(arg5, arg6 + local114 * local129, local129 * local117, local108);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!lt;IIZ[III)V")
	public Class16_Sub3(@OriginalArg(0) Class87_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static524.aClass187_15, Static545.aClass324_12, arg3 && arg0.aBoolean467, arg2 * arg1);
		if (this.aClass87_Sub1_Sub2_9.aBoolean465) {
			this.anInt9580 = arg2;
			this.anInt9581 = arg1;
		} else {
			this.anInt9581 = Static347.method5404(arg1);
			this.anInt9580 = Static347.method5404(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass87_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt9581, this.anInt9580, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass87_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt9581, this.anInt9580, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass87_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (op.a(local82, (byte) -105)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(98) int local98 = local71.getRowPitch();
			if (arg1 * 4 == local98 && arg1 == arg6) {
				local71.a((int[]) arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(121) int local121 = 0; local121 < arg2; local121++) {
					local71.a(arg4, arg6 * local121 + arg5, local121 * local98, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!lt;Lclient!kca;Lclient!ti;II)V")
	public Class16_Sub3(@OriginalArg(0) Class87_Sub1_Sub2 arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) Class324 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass87_Sub1_Sub2_9.aBoolean465) {
			this.anInt9581 = arg3;
			this.anInt9580 = arg4;
		} else {
			this.anInt9581 = Static347.method5404(arg3);
			this.anInt9580 = Static347.method5404(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass87_Sub1_Sub2_9.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static332.method5160(this.aClass324_19, this.aClass187_17), 1);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)I")
	@Override
	public int method8054() {
		return this.anInt9580;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method8047() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(FI)F")
	@Override
	public float method8049(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt9580;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!qt;I)V")
	@Override
	public void method8046(@OriginalArg(0) Class283 arg0) {
		super.method8046(arg0);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIILclient!kca;Z[BI)V")
	@Override
	public void method8051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class187 arg3, @OriginalArg(7) byte[] arg4) {
		if (this.aClass187_17 != arg3 || Static545.aClass324_12 != this.aClass324_19) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass87_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(38) int local38 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local15);
		if (!op.a(local38, (byte) -97)) {
			return;
		}
		@Pc(49) int local49 = arg1 * this.aClass187_17.anInt5376;
		@Pc(55) int local55 = arg0 * this.aClass187_17.anInt5376;
		@Pc(58) int local58 = local15.getRowPitch();
		if (local58 == local49 && local49 == local55) {
			local15.a((byte[]) arg4, 0, 0, arg2 * local49);
		} else {
			for (@Pc(70) int local70 = 0; local70 < arg2; local70++) {
				local15.a(arg4, local70 * local55, local58 * local70, local49);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZBZ)V")
	@Override
	public void method8053(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean695 = arg0;
		this.aBoolean694 = arg1;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
	@Override
	public void method8048() {
		this.aClass87_Sub1_Sub2_9.method5161(this);
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8050() {
		return true;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIZII[II)V")
	@Override
	public void method8057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5) {
		if (Static524.aClass187_15 != this.aClass187_17 || this.aClass324_19 != Static545.aClass324_12) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass87_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(26) int local26 = this.anIDirect3DTexture1.LockRect(0, arg1, arg2, arg4, arg0, 0, local15);
		if (!op.a(local26, (byte) -121)) {
			return;
		}
		@Pc(33) int local33 = local15.getRowPitch();
		if (arg4 * 4 == local33 && arg4 == arg3) {
			local15.a((int[]) arg5, 0, 0, arg0 * arg4);
		} else {
			for (@Pc(56) int local56 = 0; local56 < arg0; local56++) {
				local15.a(arg5, local56 * arg3, local33 * local56, arg4);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(I)I")
	@Override
	public int method8055() {
		return this.anInt9581;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "([IIIBIII)V")
	@Override
	public void method8052(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		if (this.aClass187_17 != Static524.aClass187_15 || Static545.aClass324_12 != this.aClass324_19) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass87_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(26) int local26 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 16, local15);
		if (!op.a(local26, (byte) -127)) {
			return;
		}
		@Pc(37) int local37 = local15.getRowPitch();
		if (local37 == arg1 * 4) {
			local15.b(arg0, 0, 0, arg0.length);
		} else {
			for (@Pc(44) int local44 = 0; local44 < arg2; local44++) {
				local15.b(arg0, arg1 * local44, local44 * local37, arg1);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IF)F")
	@Override
	public float method8056(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt9581;
	}
}

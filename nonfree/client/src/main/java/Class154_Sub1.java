import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.eo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class154_Sub1 extends Class154 implements Interface4 {

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "Z")
	public boolean aBoolean320;

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "Z")
	public boolean aBoolean321;

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
	private final int anInt4738;

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
	private final int anInt4739;

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!oe;Lclient!jb;IIZ[BII)V")
	public Class154_Sub1(@OriginalArg(0) Class7_Sub1_Sub2 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static424.aClass273_12, arg4 && arg0.aBoolean536, arg3 * arg2);
		if (this.aClass7_Sub1_Sub2_8.aBoolean534) {
			this.anInt4739 = arg3;
			this.anInt4738 = arg2;
		} else {
			this.anInt4738 = Static488.method7100(arg2);
			this.anInt4739 = Static488.method7100(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass7_Sub1_Sub2_8.anIDirect3DDevice1.a(this.anInt4738, this.anInt4739, 0, 1024, Static373.method5791(Static424.aClass273_12, this.aClass161_19), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass7_Sub1_Sub2_8.anIDirect3DDevice1.a(this.anInt4738, this.anInt4739, 1, 0, Static373.method5791(Static424.aClass273_12, this.aClass161_19), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass7_Sub1_Sub2_8.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (eo.a(-114, local90)) {
			@Pc(108) int local108 = arg2 * this.aClass161_19.anInt4901;
			@Pc(114) int local114 = arg2 * this.aClass161_19.anInt4901;
			@Pc(117) int local117 = local79.getRowPitch();
			if (local114 == local117 && local114 == local108) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local114);
			} else {
				for (@Pc(129) int local129 = 0; local129 < arg3; local129++) {
					local79.a(arg5, local129 * local108 + arg6, local129 * local117, local114);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!oe;Lclient!jb;Lclient!qda;II)V")
	public Class154_Sub1(@OriginalArg(0) Class7_Sub1_Sub2 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) Class273 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass7_Sub1_Sub2_8.aBoolean534) {
			this.anInt4738 = arg3;
			this.anInt4739 = arg4;
		} else {
			this.anInt4738 = Static488.method7100(arg3);
			this.anInt4739 = Static488.method7100(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass7_Sub1_Sub2_8.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static373.method5791(this.aClass273_18, this.aClass161_19), 1);
	}

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!oe;IIZ[III)V")
	public Class154_Sub1(@OriginalArg(0) Class7_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static151.aClass161_6, Static424.aClass273_12, arg3 && arg0.aBoolean536, arg2 * arg1);
		if (this.aClass7_Sub1_Sub2_8.aBoolean534) {
			this.anInt4739 = arg2;
			this.anInt4738 = arg1;
		} else {
			this.anInt4738 = Static488.method7100(arg1);
			this.anInt4739 = Static488.method7100(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass7_Sub1_Sub2_8.anIDirect3DDevice1.a(this.anInt4738, this.anInt4739, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass7_Sub1_Sub2_8.anIDirect3DDevice1.a(this.anInt4738, this.anInt4739, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass7_Sub1_Sub2_8.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (eo.a(-121, local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(95) int local95 = local71.getRowPitch();
			if (local95 == arg1 * 4 && arg1 == arg6) {
				local71.b(arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(114) int local114 = 0; local114 < arg2; local114++) {
					local71.b(arg4, arg6 * local114 + arg5, local114 * local95, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7870() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZZ)V")
	@Override
	public void method7375(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean320 = arg1;
		this.aBoolean321 = arg0;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(FZ)F")
	@Override
	public float method7377(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt4739;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IF)F")
	@Override
	public float method7374(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt4738;
	}

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "(I)I")
	@Override
	public int method7376() {
		return this.anInt4739;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BLclient!tn;)V")
	@Override
	public void method7869(@OriginalArg(1) Class318 arg0) {
		super.method7869(arg0);
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7371() {
		return true;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "([BIIIIIIILclient!jb;)V")
	@Override
	public void method7378(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(8) Class161 arg4) {
		if (arg4 != this.aClass161_19 || this.aClass273_18 != Static424.aClass273_12) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass7_Sub1_Sub2_8.aPixelBuffer1;
		@Pc(27) int local27 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg3, arg2, 0, local16);
		if (!eo.a(38, local27)) {
			return;
		}
		@Pc(44) int local44 = arg1 * this.aClass161_19.anInt4901;
		@Pc(50) int local50 = arg3 * this.aClass161_19.anInt4901;
		@Pc(53) int local53 = local16.getRowPitch();
		if (local50 == local53 && local44 == local50) {
			local16.a((byte[]) arg0, 0, 0, arg2 * local50);
		} else {
			for (@Pc(65) int local65 = 0; local65 < arg2; local65++) {
				local16.a(arg0, local65 * local44, local65 * local53, local50);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIII[III)V")
	@Override
	public void method7373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		if (Static151.aClass161_6 != this.aClass161_19 || this.aClass273_18 != Static424.aClass273_12) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass7_Sub1_Sub2_8.aPixelBuffer1;
		@Pc(31) int local31 = this.anIDirect3DTexture1.LockRect(0, arg3, arg1, arg2, arg5, 0, local16);
		if (!eo.a(-113, local31)) {
			return;
		}
		@Pc(39) int local39 = local16.getRowPitch();
		if (local39 == arg2 * 4 && arg2 == arg0) {
			local16.b(arg4, 0, 0, arg5 * arg2);
		} else {
			for (@Pc(66) int local66 = 0; local66 < arg5; local66++) {
				local16.b(arg4, arg0 * local66, local66 * local39, arg2);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
	@Override
	public void method7871() {
		this.aClass7_Sub1_Sub2_8.method5790(this);
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)I")
	@Override
	public int method7372() {
		return this.anInt4738;
	}
}

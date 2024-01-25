import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.dm;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class139_Sub2 extends Class139 implements Interface8 {

	@OriginalMember(owner = "client!lw", name = "g", descriptor = "Z")
	public boolean aBoolean394;

	@OriginalMember(owner = "client!lw", name = "i", descriptor = "Z")
	public boolean aBoolean395;

	@OriginalMember(owner = "client!lw", name = "j", descriptor = "I")
	private final int anInt5306;

	@OriginalMember(owner = "client!lw", name = "h", descriptor = "I")
	private final int anInt5305;

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!nca;IIZ[III)V")
	public Class139_Sub2(@OriginalArg(0) Class39_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static51.aClass150_1, Static268.aClass171_10, arg3 && arg0.aBoolean443, arg1 * arg2);
		if (this.aClass39_Sub2_Sub1_8.aBoolean441) {
			this.anInt5305 = arg2;
			this.anInt5306 = arg1;
		} else {
			this.anInt5306 = Static131.method2413(arg1);
			this.anInt5305 = Static131.method2413(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass39_Sub2_Sub1_8.anIDirect3DDevice1.a(this.anInt5306, this.anInt5305, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass39_Sub2_Sub1_8.anIDirect3DDevice1.a(this.anInt5306, this.anInt5305, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass39_Sub2_Sub1_8.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (dm.a((int) 7155, local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(96) int local96 = local71.getRowPitch();
			if (local96 == arg1 * 4 && arg1 == arg6) {
				local71.a((int[]) arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(106) int local106 = 0; local106 < arg2; local106++) {
					local71.a(arg4, arg5 + arg6 * local106, local96 * local106, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!nca;Lclient!jt;IIZ[BII)V")
	public Class139_Sub2(@OriginalArg(0) Class39_Sub2_Sub1 arg0, @OriginalArg(1) Class150 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static268.aClass171_10, arg4 && arg0.aBoolean443, arg2 * arg3);
		if (this.aClass39_Sub2_Sub1_8.aBoolean441) {
			this.anInt5305 = arg3;
			this.anInt5306 = arg2;
		} else {
			this.anInt5306 = Static131.method2413(arg2);
			this.anInt5305 = Static131.method2413(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass39_Sub2_Sub1_8.anIDirect3DDevice1.a(this.anInt5306, this.anInt5305, 0, 1024, Static317.method5078(Static268.aClass171_10, this.aClass150_14), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass39_Sub2_Sub1_8.anIDirect3DDevice1.a(this.anInt5306, this.anInt5305, 1, 0, Static317.method5078(Static268.aClass171_10, this.aClass150_14), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass39_Sub2_Sub1_8.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (dm.a((int) 7155, local90)) {
			@Pc(106) int local106 = arg2 * this.aClass150_14.anInt4202;
			@Pc(112) int local112 = arg2 * this.aClass150_14.anInt4202;
			@Pc(115) int local115 = local79.getRowPitch();
			if (local115 == local106 && local106 == local112) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local106);
			} else {
				for (@Pc(123) int local123 = 0; local123 < arg3; local123++) {
					local79.a(arg5, local123 * local112 + arg6, local123 * local115, local106);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!nca;Lclient!jt;Lclient!lc;II)V")
	public Class139_Sub2(@OriginalArg(0) Class39_Sub2_Sub1 arg0, @OriginalArg(1) Class150 arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass39_Sub2_Sub1_8.aBoolean441) {
			this.anInt5305 = arg4;
			this.anInt5306 = arg3;
		} else {
			this.anInt5306 = Static131.method2413(arg3);
			this.anInt5305 = Static131.method2413(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass39_Sub2_Sub1_8.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static317.method5078(this.aClass171_18, this.aClass150_14), 1);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IF)F")
	@Override
	public float method5777(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt5305;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(III[IIIII)V")
	@Override
	public void method5779(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (Static51.aClass150_1 != this.aClass150_14 || this.aClass171_18 != Static268.aClass171_10) {
			throw new RuntimeException();
		}
		@Pc(20) PixelBuffer local20 = this.aClass39_Sub2_Sub1_8.aPixelBuffer1;
		@Pc(31) int local31 = this.anIDirect3DTexture1.LockRect(0, arg0, arg4, arg5, arg1, 0, local20);
		if (!dm.a((int) 7155, local31)) {
			return;
		}
		@Pc(39) int local39 = local20.getRowPitch();
		if (local39 == arg5 * 4 && arg3 == arg5) {
			local20.a((int[]) arg2, 0, 0, arg5 * arg1);
		} else {
			for (@Pc(57) int local57 = 0; local57 < arg1; local57++) {
				local20.a(arg2, arg3 * local57, local39 * local57, arg5);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method5780(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean395 = arg1;
		this.aBoolean394 = arg0;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5774() {
		return true;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!qq;I)V")
	@Override
	public void method7130(@OriginalArg(0) Class240 arg0) {
		super.method7130(arg0);
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(I)V")
	@Override
	public void method7131() {
		this.aClass39_Sub2_Sub1_8.method5074(this);
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)I")
	@Override
	public int method5778() {
		return this.anInt5305;
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method6781() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(IF)F")
	@Override
	public float method5781(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt5306;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Z)I")
	@Override
	public int method5775() {
		return this.anInt5306;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILclient!jt;I[BIIIII)V")
	@Override
	public void method5776(@OriginalArg(1) Class150 arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 != this.aClass150_14 || Static268.aClass171_10 != this.aClass171_18) {
			throw new RuntimeException();
		}
		@Pc(21) PixelBuffer local21 = this.aClass39_Sub2_Sub1_8.aPixelBuffer1;
		@Pc(32) int local32 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg4, arg2, 0, local21);
		if (!dm.a((int) 7155, local32)) {
			return;
		}
		@Pc(44) int local44 = arg3 * this.aClass150_14.anInt4202;
		@Pc(50) int local50 = arg4 * this.aClass150_14.anInt4202;
		@Pc(53) int local53 = local21.getRowPitch();
		if (local50 == local53 && local50 == local44) {
			local21.a((byte[]) arg1, 0, 0, arg2 * local50);
		} else {
			for (@Pc(69) int local69 = 0; local69 < arg2; local69++) {
				local21.a(arg1, local69 * local44, local69 * local53, local50);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}
}

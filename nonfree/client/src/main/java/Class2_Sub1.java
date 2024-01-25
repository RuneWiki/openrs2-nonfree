import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.js;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1 extends Class2 implements Interface12 {

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "Z")
	public boolean aBoolean3;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "Z")
	public boolean aBoolean4;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
	private final int anInt3;

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
	private final int anInt4;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!to;Lclient!os;IIZ[BII)V")
	public Class2_Sub1(@OriginalArg(0) Class31_Sub1_Sub2 arg0, @OriginalArg(1) Class245 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static331.aClass204_13, arg4 && arg0.aBoolean617, arg3 * arg2);
		if (this.aClass31_Sub1_Sub2_9.aBoolean618) {
			this.anInt3 = arg2;
			this.anInt4 = arg3;
		} else {
			this.anInt3 = Static538.method7366(arg2);
			this.anInt4 = Static538.method7366(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass31_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt3, this.anInt4, 0, 1024, Static518.method7194(Static331.aClass204_13, this.aClass245_15), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass31_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt3, this.anInt4, 1, 0, Static518.method7194(Static331.aClass204_13, this.aClass245_15), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass31_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (js.b(local90, 141953135)) {
			@Pc(108) int local108 = arg2 * this.aClass245_15.anInt6985;
			@Pc(114) int local114 = arg2 * this.aClass245_15.anInt6985;
			@Pc(117) int local117 = local79.getRowPitch();
			if (local108 == local117 && local108 == local114) {
				local79.a((byte[]) arg5, arg6, 0, local108 * arg3);
			} else {
				for (@Pc(134) int local134 = 0; local134 < arg3; local134++) {
					local79.a(arg5, local134 * local114 + arg6, local117 * local134, local108);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!to;IIZ[III)V")
	public Class2_Sub1(@OriginalArg(0) Class31_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static18.aClass245_3, Static331.aClass204_13, arg3 && arg0.aBoolean617, arg1 * arg2);
		if (this.aClass31_Sub1_Sub2_9.aBoolean618) {
			this.anInt3 = arg1;
			this.anInt4 = arg2;
		} else {
			this.anInt3 = Static538.method7366(arg1);
			this.anInt4 = Static538.method7366(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass31_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt3, this.anInt4, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass31_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt3, this.anInt4, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass31_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (js.b(local82, 141953135)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(98) int local98 = local71.getRowPitch();
			if (local98 == arg1 * 4 && arg1 == arg6) {
				local71.b(arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(125) int local125 = 0; local125 < arg2; local125++) {
					local71.b(arg4, local125 * arg6 + arg5, local98 * local125, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!to;Lclient!os;Lclient!mg;II)V")
	public Class2_Sub1(@OriginalArg(0) Class31_Sub1_Sub2 arg0, @OriginalArg(1) Class245 arg1, @OriginalArg(2) Class204 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass31_Sub1_Sub2_9.aBoolean618) {
			this.anInt4 = arg4;
			this.anInt3 = arg3;
		} else {
			this.anInt3 = Static538.method7366(arg3);
			this.anInt4 = Static538.method7366(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass31_Sub1_Sub2_9.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static518.method7194(this.aClass204_20, this.aClass245_15), 1);
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method2992() {
		return true;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IF)F")
	@Override
	public float method2988(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt3;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method7710() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
	@Override
	public void method7712() {
		this.aClass31_Sub1_Sub2_9.method7187(this);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)I")
	@Override
	public int method2991() {
		return this.anInt4;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II[IIIIII)V")
	@Override
	public void method2995(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (this.aClass245_15 != Static18.aClass245_3 || Static331.aClass204_13 != this.aClass204_20) {
			throw new RuntimeException();
		}
		@Pc(19) PixelBuffer local19 = this.aClass31_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(30) int local30 = this.anIDirect3DTexture1.LockRect(0, arg3, arg5, arg0, arg4, 0, local19);
		if (!js.b(local30, 141953135)) {
			return;
		}
		@Pc(37) int local37 = local19.getRowPitch();
		if (arg0 * 4 == local37 && arg0 == arg2) {
			local19.b(arg1, 0, 0, arg4 * arg0);
		} else {
			for (@Pc(55) int local55 = 0; local55 < arg4; local55++) {
				local19.b(arg1, local55 * arg2, local55 * local37, arg0);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!dca;B)V")
	@Override
	public void method7711(@OriginalArg(0) Class65 arg0) {
		super.method7711(arg0);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!os;II[BIIII)V")
	@Override
	public void method2989(@OriginalArg(1) Class245 arg0, @OriginalArg(4) byte[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) int arg4) {
		if (this.aClass245_15 != arg0 || this.aClass204_20 != Static331.aClass204_13) {
			throw new RuntimeException();
		}
		@Pc(23) PixelBuffer local23 = this.aClass31_Sub1_Sub2_9.aPixelBuffer1;
		@Pc(34) int local34 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local23);
		if (!js.b(local34, 141953135)) {
			return;
		}
		@Pc(46) int local46 = arg2 * this.aClass245_15.anInt6985;
		@Pc(52) int local52 = arg4 * this.aClass245_15.anInt6985;
		@Pc(55) int local55 = local23.getRowPitch();
		if (local55 == local46 && local52 == local46) {
			local23.a((byte[]) arg1, 0, 0, arg3 * local46);
		} else {
			for (@Pc(67) int local67 = 0; local67 < arg3; local67++) {
				local23.a(arg1, local52 * local67, local55 * local67, local46);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(FB)F")
	@Override
	public float method2994(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt4;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZZB)V")
	@Override
	public void method2990(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean3 = arg1;
		this.aBoolean4 = arg0;
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)I")
	@Override
	public int method2993() {
		return this.anInt3;
	}
}

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.rl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class20_Sub2 extends Class20 implements Interface10 {

	@OriginalMember(owner = "client!ct", name = "i", descriptor = "Z")
	public boolean aBoolean166;

	@OriginalMember(owner = "client!ct", name = "j", descriptor = "Z")
	public boolean aBoolean167;

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
	private final int anInt1984;

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
	private final int anInt1985;

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!hg;IIZ[III)V")
	public Class20_Sub2(@OriginalArg(0) Class43_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static581.aClass93_14, Static461.aClass292_14, arg3 && arg0.aBoolean311, arg2 * arg1);
		if (this.aClass43_Sub1_Sub1_6.aBoolean310) {
			this.anInt1985 = arg2;
			this.anInt1984 = arg1;
		} else {
			this.anInt1984 = Static114.method2375(arg1);
			this.anInt1985 = Static114.method2375(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass43_Sub1_Sub1_6.anIDirect3DDevice1.a(this.anInt1984, this.anInt1985, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass43_Sub1_Sub1_6.anIDirect3DDevice1.a(this.anInt1984, this.anInt1985, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass43_Sub1_Sub1_6.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (rl.a(local82, (int) 3102)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(94) int local94 = local71.getRowPitch();
			if (arg1 * 4 == local94 && arg6 == arg1) {
				local71.a((int[]) arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(108) int local108 = 0; local108 < arg2; local108++) {
					local71.a(arg4, arg6 * local108 + arg5, local94 * local108, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!hg;Lclient!fda;Lclient!ro;II)V")
	public Class20_Sub2(@OriginalArg(0) Class43_Sub1_Sub1 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) Class292 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass43_Sub1_Sub1_6.aBoolean310) {
			this.anInt1985 = arg4;
			this.anInt1984 = arg3;
		} else {
			this.anInt1984 = Static114.method2375(arg3);
			this.anInt1985 = Static114.method2375(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass43_Sub1_Sub1_6.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static195.method3533(this.aClass93_7, this.aClass292_7), 1);
	}

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!hg;Lclient!fda;IIZ[BII)V")
	public Class20_Sub2(@OriginalArg(0) Class43_Sub1_Sub1 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static461.aClass292_14, arg4 && arg0.aBoolean311, arg2 * arg3);
		if (this.aClass43_Sub1_Sub1_6.aBoolean310) {
			this.anInt1984 = arg2;
			this.anInt1985 = arg3;
		} else {
			this.anInt1984 = Static114.method2375(arg2);
			this.anInt1985 = Static114.method2375(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass43_Sub1_Sub1_6.anIDirect3DDevice1.a(this.anInt1984, this.anInt1985, 0, 1024, Static195.method3533(this.aClass93_7, Static461.aClass292_14), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass43_Sub1_Sub1_6.anIDirect3DDevice1.a(this.anInt1984, this.anInt1985, 1, 0, Static195.method3533(this.aClass93_7, Static461.aClass292_14), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass43_Sub1_Sub1_6.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (rl.a(local90, (int) 3102)) {
			@Pc(106) int local106 = arg2 * this.aClass93_7.anInt2936;
			@Pc(112) int local112 = arg2 * this.aClass93_7.anInt2936;
			@Pc(115) int local115 = local79.getRowPitch();
			if (local115 == local112 && local106 == local112) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local112);
			} else {
				for (@Pc(136) int local136 = 0; local136 < arg3; local136++) {
					local79.a(arg5, local136 * local106 + arg6, local136 * local115, local112);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method6171(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean166 = arg0;
		this.aBoolean167 = arg1;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6172() {
		return true;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZLclient!gw;)V")
	@Override
	public void method7422(@OriginalArg(1) Class123 arg0) {
		super.method7422(arg0);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method3898() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(FI)F")
	@Override
	public float method6175(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1984;
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "(I)V")
	@Override
	public void method7423() {
		this.aClass43_Sub1_Sub1_6.method3538(this);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IBI[IIIII)V")
	@Override
	public void method6169(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (this.aClass93_7 != Static581.aClass93_14 || this.aClass292_7 != Static461.aClass292_14) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass43_Sub1_Sub1_6.aPixelBuffer1;
		@Pc(35) int local35 = this.anIDirect3DTexture1.LockRect(0, arg0, arg4, arg3, arg5, 0, local16);
		if (!rl.a(local35, (int) 3102)) {
			return;
		}
		@Pc(42) int local42 = local16.getRowPitch();
		if (local42 == arg3 * 4 && arg3 == arg2) {
			local16.a((int[]) arg1, 0, 0, arg3 * arg5);
		} else {
			for (@Pc(61) int local61 = 0; local61 < arg5; local61++) {
				local16.a(arg1, arg2 * local61, local61 * local42, arg3);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(FI)F")
	@Override
	public float method6170(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1985;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)I")
	@Override
	public int method6174() {
		return this.anInt1984;
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(I)I")
	@Override
	public int method6176() {
		return this.anInt1985;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!fda;IIIII[BZI)V")
	@Override
	public void method6173(@OriginalArg(0) Class93 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(8) int arg4) {
		if (this.aClass93_7 != arg0 || Static461.aClass292_14 != this.aClass292_7) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass43_Sub1_Sub1_6.aPixelBuffer1;
		@Pc(27) int local27 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg4, arg1, 0, local16);
		if (!rl.a(local27, (int) 3102)) {
			return;
		}
		@Pc(43) int local43 = arg4 * this.aClass93_7.anInt2936;
		@Pc(49) int local49 = arg2 * this.aClass93_7.anInt2936;
		@Pc(52) int local52 = local16.getRowPitch();
		if (local52 == local43 && local43 == local49) {
			local16.a((byte[]) arg3, 0, 0, local43 * arg1);
		} else {
			for (@Pc(73) int local73 = 0; local73 < arg1; local73++) {
				local16.a(arg3, local49 * local73, local73 * local52, local43);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}
}

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.ae;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class88_Sub2 extends Class88 implements Interface5 {

	@OriginalMember(owner = "client!md", name = "g", descriptor = "Z")
	public boolean aBoolean452;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "Z")
	public boolean aBoolean453;

	@OriginalMember(owner = "client!md", name = "f", descriptor = "I")
	private final int anInt5794;

	@OriginalMember(owner = "client!md", name = "i", descriptor = "I")
	private final int anInt5795;

	@OriginalMember(owner = "client!md", name = "j", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!ega;Lclient!pn;Lclient!jg;II)V")
	public Class88_Sub2(@OriginalArg(0) Class78_Sub1_Sub1 arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) Class172 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass78_Sub1_Sub1_7.aBoolean180) {
			this.anInt5795 = arg4;
			this.anInt5794 = arg3;
		} else {
			this.anInt5794 = Static122.method2187(arg3);
			this.anInt5795 = Static122.method2187(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass78_Sub1_Sub1_7.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static117.method2129(this.aClass271_10, this.aClass172_18), 1);
	}

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!ega;Lclient!pn;IIZ[BII)V")
	public Class88_Sub2(@OriginalArg(0) Class78_Sub1_Sub1 arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static243.aClass172_9, arg4 && arg0.aBoolean179, arg2 * arg3);
		if (this.aClass78_Sub1_Sub1_7.aBoolean180) {
			this.anInt5795 = arg3;
			this.anInt5794 = arg2;
		} else {
			this.anInt5794 = Static122.method2187(arg2);
			this.anInt5795 = Static122.method2187(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass78_Sub1_Sub1_7.anIDirect3DDevice1.a(this.anInt5794, this.anInt5795, 0, 1024, Static117.method2129(this.aClass271_10, Static243.aClass172_9), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass78_Sub1_Sub1_7.anIDirect3DDevice1.a(this.anInt5794, this.anInt5795, 1, 0, Static117.method2129(this.aClass271_10, Static243.aClass172_9), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass78_Sub1_Sub1_7.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (ae.a((byte) 21, local90)) {
			@Pc(108) int local108 = arg2 * this.aClass271_10.anInt7253;
			@Pc(114) int local114 = arg2 * this.aClass271_10.anInt7253;
			@Pc(117) int local117 = local79.getRowPitch();
			if (local114 == local117 && local114 == local108) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local114);
			} else {
				for (@Pc(142) int local142 = 0; local142 < arg3; local142++) {
					local79.a(arg5, local108 * local142 + arg6, local117 * local142, local114);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!ega;IIZ[III)V")
	public Class88_Sub2(@OriginalArg(0) Class78_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static429.aClass271_12, Static243.aClass172_9, arg3 && arg0.aBoolean179, arg2 * arg1);
		if (this.aClass78_Sub1_Sub1_7.aBoolean180) {
			this.anInt5794 = arg1;
			this.anInt5795 = arg2;
		} else {
			this.anInt5794 = Static122.method2187(arg1);
			this.anInt5795 = Static122.method2187(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass78_Sub1_Sub1_7.anIDirect3DDevice1.a(this.anInt5794, this.anInt5795, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass78_Sub1_Sub1_7.anIDirect3DDevice1.a(this.anInt5794, this.anInt5795, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass78_Sub1_Sub1_7.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (ae.a((byte) -107, local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(96) int local96 = local71.getRowPitch();
			if (arg1 * 4 == local96 && arg6 == arg1) {
				local71.a((int[]) arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(106) int local106 = 0; local106 < arg2; local106++) {
					local71.a(arg4, arg5 + local106 * arg6, local106 * local96, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method7314(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean453 = arg0;
		this.aBoolean452 = arg1;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)I")
	@Override
	public int method7313() {
		return this.anInt5794;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method5851() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BF)F")
	@Override
	public float method7315(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt5794;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(III[IIIII)V")
	@Override
	public void method7318(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static429.aClass271_12 != this.aClass271_10 || this.aClass172_18 != Static243.aClass172_9) {
			throw new RuntimeException();
		}
		@Pc(20) PixelBuffer local20 = this.aClass78_Sub1_Sub1_7.aPixelBuffer1;
		@Pc(31) int local31 = this.anIDirect3DTexture1.LockRect(0, arg3, arg2, arg4, arg0, 0, local20);
		if (!ae.a((byte) -106, local31)) {
			return;
		}
		@Pc(39) int local39 = local20.getRowPitch();
		if (arg4 * 4 == local39 && arg4 == arg5) {
			local20.a((int[]) arg1, 0, 0, arg4 * arg0);
		} else {
			for (@Pc(62) int local62 = 0; local62 < arg0; local62++) {
				local20.a(arg1, arg5 * local62, local39 * local62, arg4);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
	@Override
	public void method7299() {
		this.aClass78_Sub1_Sub1_7.method2137(this);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7312() {
		return true;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!dca;B)V")
	@Override
	public void method7298(@OriginalArg(0) Class54 arg0) {
		super.method7298(arg0);
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(BF)F")
	@Override
	public float method7316(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt5795;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(I)I")
	@Override
	public int method7317() {
		return this.anInt5795;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIZILclient!pn;I[B)V")
	@Override
	public void method7311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) Class271 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) byte[] arg4) {
		if (arg2 != this.aClass271_10 || this.aClass172_18 != Static243.aClass172_9) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass78_Sub1_Sub1_7.aPixelBuffer1;
		@Pc(33) int local33 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg3, 0, local16);
		if (!ae.a((byte) -123, local33)) {
			return;
		}
		@Pc(43) int local43 = arg0 * this.aClass271_10.anInt7253;
		@Pc(49) int local49 = arg1 * this.aClass271_10.anInt7253;
		@Pc(52) int local52 = local16.getRowPitch();
		if (local49 == local52 && local43 == local49) {
			local16.a((byte[]) arg4, 0, 0, local49 * arg3);
		} else {
			for (@Pc(60) int local60 = 0; local60 < arg3; local60++) {
				local16.a(arg4, local60 * local43, local52 * local60, local49);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}
}

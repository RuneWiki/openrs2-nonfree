import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.co;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public final class Class46_Sub2 extends Class46 implements Interface3 {

	@OriginalMember(owner = "client!dga", name = "g", descriptor = "Z")
	public boolean aBoolean147;

	@OriginalMember(owner = "client!dga", name = "i", descriptor = "Z")
	public boolean aBoolean148;

	@OriginalMember(owner = "client!dga", name = "f", descriptor = "I")
	private final int anInt1983;

	@OriginalMember(owner = "client!dga", name = "h", descriptor = "I")
	private final int anInt1984;

	@OriginalMember(owner = "client!dga", name = "j", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lclient!fi;Lclient!pd;Lclient!ok;II)V")
	public Class46_Sub2(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) Class242 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass100_Sub1_Sub1_7.aBoolean240) {
			this.anInt1984 = arg4;
			this.anInt1983 = arg3;
		} else {
			this.anInt1983 = Static567.method8129(arg3);
			this.anInt1984 = Static567.method8129(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass100_Sub1_Sub1_7.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static157.method2992(this.aClass250_10, this.aClass242_9), 1);
	}

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lclient!fi;IIZ[III)V")
	public Class46_Sub2(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static203.aClass250_7, Static409.aClass242_13, arg3 && arg0.aBoolean238, arg2 * arg1);
		if (this.aClass100_Sub1_Sub1_7.aBoolean240) {
			this.anInt1983 = arg1;
			this.anInt1984 = arg2;
		} else {
			this.anInt1983 = Static567.method8129(arg1);
			this.anInt1984 = Static567.method8129(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass100_Sub1_Sub1_7.anIDirect3DDevice1.a(this.anInt1983, this.anInt1984, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass100_Sub1_Sub1_7.anIDirect3DDevice1.a(this.anInt1983, this.anInt1984, 1, 0, 21, 1);
		}
		@Pc(71) PixelBuffer local71 = this.aClass100_Sub1_Sub1_7.aPixelBuffer1;
		@Pc(82) int local82 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local71);
		if (co.a((byte) 88, local82)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(98) int local98 = local71.getRowPitch();
			if (local98 == arg1 * 4 && arg1 == arg6) {
				local71.a((int[]) arg4, arg5, 0, arg2 * arg1);
			} else {
				for (@Pc(125) int local125 = 0; local125 < arg2; local125++) {
					local71.a(arg4, local125 * arg6 + arg5, local125 * local98, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lclient!fi;Lclient!pd;IIZ[BII)V")
	public Class46_Sub2(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static409.aClass242_13, arg4 && arg0.aBoolean238, arg2 * arg3);
		if (this.aClass100_Sub1_Sub1_7.aBoolean240) {
			this.anInt1984 = arg3;
			this.anInt1983 = arg2;
		} else {
			this.anInt1983 = Static567.method8129(arg2);
			this.anInt1984 = Static567.method8129(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass100_Sub1_Sub1_7.anIDirect3DDevice1.a(this.anInt1983, this.anInt1984, 0, 1024, Static157.method2992(this.aClass250_10, Static409.aClass242_13), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass100_Sub1_Sub1_7.anIDirect3DDevice1.a(this.anInt1983, this.anInt1984, 1, 0, Static157.method2992(this.aClass250_10, Static409.aClass242_13), 1);
		}
		@Pc(79) PixelBuffer local79 = this.aClass100_Sub1_Sub1_7.aPixelBuffer1;
		@Pc(90) int local90 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local79);
		if (co.a((byte) 79, local90)) {
			@Pc(108) int local108 = arg2 * this.aClass250_10.anInt7790;
			@Pc(114) int local114 = arg2 * this.aClass250_10.anInt7790;
			@Pc(117) int local117 = local79.getRowPitch();
			if (local117 == local108 && local108 == local114) {
				local79.a((byte[]) arg5, arg6, 0, arg3 * local108);
			} else {
				for (@Pc(134) int local134 = 0; local134 < arg3; local134++) {
					local79.a(arg5, arg6 + local114 * local134, local134 * local117, local108);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(I)I")
	@Override
	public int method7840() {
		return this.anInt1984;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(BLclient!ej;)V")
	@Override
	public void method7827(@OriginalArg(1) Class82 arg0) {
		super.method7827(arg0);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(I[IIIIII)V")
	@Override
	public void method7843(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2) {
		if (this.aClass250_10 != Static203.aClass250_7 || Static409.aClass242_13 != this.aClass242_9) {
			throw new RuntimeException();
		}
		@Pc(21) PixelBuffer local21 = this.aClass100_Sub1_Sub1_7.aPixelBuffer1;
		@Pc(32) int local32 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg1, 16, local21);
		if (!co.a((byte) 105, local32)) {
			return;
		}
		@Pc(40) int local40 = local21.getRowPitch();
		if (local40 == arg2 * 4) {
			local21.b(arg0, 0, 0, arg0.length);
		} else {
			for (@Pc(51) int local51 = 0; local51 < arg1; local51++) {
				local21.b(arg0, local51 * arg2, local40 * local51, arg2);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)I")
	@Override
	public int method7841() {
		return this.anInt1983;
	}

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method4660() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIIII[II)V")
	@Override
	public void method7842(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5) {
		if (Static203.aClass250_7 != this.aClass250_10 || this.aClass242_9 != Static409.aClass242_13) {
			throw new RuntimeException();
		}
		@Pc(15) PixelBuffer local15 = this.aClass100_Sub1_Sub1_7.aPixelBuffer1;
		@Pc(34) int local34 = this.anIDirect3DTexture1.LockRect(0, arg1, arg4, arg0, arg2, 0, local15);
		if (!co.a((byte) 112, local34)) {
			return;
		}
		@Pc(42) int local42 = local15.getRowPitch();
		if (local42 == arg0 * 4 && arg0 == arg3) {
			local15.a((int[]) arg5, 0, 0, arg0 * arg2);
		} else {
			for (@Pc(61) int local61 = 0; local61 < arg2; local61++) {
				local15.a(arg5, local61 * arg3, local61 * local42, arg0);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZBZ)V")
	@Override
	public void method7839(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		this.aBoolean148 = arg0;
		this.aBoolean147 = arg1;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(FI)F")
	@Override
	public float method7845(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1984;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)V")
	@Override
	public void method7826() {
		this.aClass100_Sub1_Sub1_7.method2996(this);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIIIII[BLclient!pd;)V")
	@Override
	public void method7844(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(7) byte[] arg3, @OriginalArg(8) Class250 arg4) {
		if (arg4 != this.aClass250_10 || this.aClass242_9 != Static409.aClass242_13) {
			throw new RuntimeException();
		}
		@Pc(16) PixelBuffer local16 = this.aClass100_Sub1_Sub1_7.aPixelBuffer1;
		@Pc(27) int local27 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg0, arg2, 0, local16);
		if (!co.a((byte) 82, local27)) {
			return;
		}
		@Pc(38) int local38 = arg0 * this.aClass250_10.anInt7790;
		@Pc(44) int local44 = arg1 * this.aClass250_10.anInt7790;
		@Pc(47) int local47 = local16.getRowPitch();
		if (local38 == local47 && local38 == local44) {
			local16.a((byte[]) arg3, 0, 0, local38 * arg2);
		} else {
			for (@Pc(59) int local59 = 0; local59 < arg2; local59++) {
				local16.a(arg3, local44 * local59, local47 * local59, local38);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(BF)F")
	@Override
	public float method7846(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt1983;
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7847() {
		return true;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class11_Sub1_Sub5_Sub1 extends Class11_Sub1_Sub5 implements Interface15 {

	@OriginalMember(owner = "client!kd", name = "K", descriptor = "Lclient!cr;")
	private Class48 aClass48_4;

	@OriginalMember(owner = "client!kd", name = "U", descriptor = "Z")
	private boolean aBoolean366 = false;

	@OriginalMember(owner = "client!kd", name = "cb", descriptor = "Lclient!vi;")
	public final Class349 aClass349_2;

	@OriginalMember(owner = "client!kd", name = "jb", descriptor = "Z")
	private final boolean aBoolean367;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!r;Lclient!js;IIIIIZIIIII)V")
	public Class11_Sub1_Sub5_Sub1(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass349_2 = new Class349(arg0, arg1, arg10, arg11, super.aByte113, arg3, this, arg7, arg12);
		this.aBoolean367 = arg1.anInt4662 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Lclient!r;I)Lclient!bca;")
	@Override
	public Class11_Sub2 method7219(@OriginalArg(0) Class78 arg0) {
		@Pc(23) Class52 local23 = this.aClass349_2.method7534(true, 2048, arg0, false);
		if (local23 == null) {
			return null;
		}
		@Pc(30) Class34 local30 = arg0.method6848();
		local30.NA(super.aShort59 + super.anInt8902, super.anInt8908, super.anInt8906 + super.aShort58);
		@Pc(46) Class11_Sub2 local46 = null;
		if (this.aBoolean367) {
			local46 = Static586.method7842(1);
		}
		@Pc(58) int local58 = super.anInt8902 >> 9;
		@Pc(63) int local63 = super.anInt8906 >> 9;
		this.aClass349_2.method7533(true, local63, local23, arg0, local58, local58, local30, local63);
		if (Static594.aBoolean718) {
			local23.method7405(local30, local46 == null ? null : local46.aClass11_Sub4Array1[0], Static18.anInt503, 0);
		} else {
			local23.method7413(local30, local46 == null ? null : local46.aClass11_Sub4Array1[0], 0);
		}
		if (this.aClass349_2.aClass11_Sub9_8 != null) {
			@Pc(113) Class64 local113 = this.aClass349_2.aClass11_Sub9_8.method5336();
			if (Static594.aBoolean718) {
				arg0.method6850(local113, Static18.anInt503);
			} else {
				arg0.method6796(local113);
			}
		}
		this.aBoolean366 = local23.LA() || this.aClass349_2.aClass11_Sub9_8 != null;
		if (this.aClass48_4 == null) {
			this.aClass48_4 = Static300.method7775(super.anInt8902, super.anInt8908, local23, super.anInt8906);
		} else {
			Static349.method5202(this.aClass48_4, super.anInt8902, super.anInt8908, super.anInt8906, local23);
		}
		return local46;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7229() {
		return this.aClass349_2.method7540();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!r;)Lclient!cr;")
	@Override
	public Class48 method7205(@OriginalArg(1) Class78 arg0) {
		return this.aClass48_4;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)I")
	@Override
	public int method7230() {
		return this.aClass349_2.anInt9248;
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7217() {
		return this.aBoolean366;
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)I")
	@Override
	public int method7212() {
		return this.aClass349_2.method7536();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILclient!r;)Z")
	@Override
	public boolean method7210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class78 arg2) {
		@Pc(12) Class52 local12 = this.aClass349_2.method7534(false, 131072, arg2, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(24) Class34 local24 = arg2.method6848();
			local24.NA(super.aShort59 + super.anInt8902, super.anInt8908, super.aShort58 + super.anInt8906);
			return Static594.aBoolean718 ? local12.method7392(arg1, arg0, local24, false, Static18.anInt503) : local12.method7402(arg1, arg0, local24, false);
		}
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)I")
	@Override
	public int method7208(@OriginalArg(0) int arg0) {
		if (arg0 != 6329) {
			this.aClass48_4 = null;
		}
		return this.aClass349_2.method7532(0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)I")
	@Override
	public int method7227() {
		return this.aClass349_2.anInt9245;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7226(@OriginalArg(0) Class78 arg0) {
		this.aClass349_2.method7531(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7206(@OriginalArg(0) Class78 arg0) {
		@Pc(12) Class52 local12 = this.aClass349_2.method7534(true, 262144, arg0, false);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt8902 >> 9;
		@Pc(24) int local24 = super.anInt8906 >> 9;
		@Pc(27) Class34 local27 = arg0.method6848();
		local27.NA(super.anInt8902, super.anInt8908, super.anInt8906);
		this.aClass349_2.method7533(false, local24, local12, arg0, local19, local19, local27, local24);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7231(@OriginalArg(1) Class78 arg0) {
		this.aClass349_2.method7535(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	@Override
	public void method7228() {
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)I")
	@Override
	public int method7232() {
		return this.aClass349_2.anInt9246;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7209() {
		return false;
	}
}

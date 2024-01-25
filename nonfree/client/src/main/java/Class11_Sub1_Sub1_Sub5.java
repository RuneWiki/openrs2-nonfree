import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class11_Sub1_Sub1_Sub5 extends Class11_Sub1_Sub1 implements Interface15 {

	@OriginalMember(owner = "client!pf", name = "T", descriptor = "Lclient!cr;")
	private Class48 aClass48_7;

	@OriginalMember(owner = "client!pf", name = "U", descriptor = "Z")
	private boolean aBoolean546 = false;

	@OriginalMember(owner = "client!pf", name = "X", descriptor = "Lclient!vi;")
	public final Class349 aClass349_3;

	@OriginalMember(owner = "client!pf", name = "bb", descriptor = "Z")
	private final boolean aBoolean547;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!r;Lclient!js;IIIIIZIIIIIII)V")
	public Class11_Sub1_Sub1_Sub5(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt4628 == 1, Static503.method7061(arg13, arg12));
		this.aClass349_3 = new Class349(arg0, arg1, arg12, arg13, super.aByte113, arg3, this, arg7, arg14);
		this.aBoolean547 = arg1.anInt4662 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)I")
	@Override
	public int method7232() {
		return this.aClass349_3.anInt9246;
	}

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7214() {
		return false;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!r;)Lclient!cr;")
	@Override
	public Class48 method7205(@OriginalArg(1) Class78 arg0) {
		return this.aClass48_7;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7206(@OriginalArg(0) Class78 arg0) {
		@Pc(12) Class52 local12 = this.aClass349_3.method7534(true, 262144, arg0, true);
		if (local12 != null) {
			@Pc(17) Class34 local17 = arg0.method6848();
			local17.NA(super.anInt8902, super.anInt8908, super.anInt8906);
			this.aClass349_3.method7533(false, super.aShort88, local12, arg0, super.aShort91, super.aShort90, local17, super.aShort89);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIILclient!r;)Z")
	@Override
	public boolean method7210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class78 arg2) {
		@Pc(12) Class52 local12 = this.aClass349_3.method7534(false, 131072, arg2, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class34 local19 = arg2.method6848();
			local19.NA(super.anInt8902, super.anInt8908, super.anInt8906);
			return Static594.aBoolean718 ? local12.method7392(arg1, arg0, local19, false, Static18.anInt503) : local12.method7402(arg1, arg0, local19, false);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!vv;IIZLclient!r;II)V")
	@Override
	public void method7215(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class78 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)I")
	@Override
	public int method7212() {
		return this.aClass349_3.method7536();
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)I")
	@Override
	public int method7208(@OriginalArg(0) int arg0) {
		if (arg0 != 6329) {
			this.method7206(null);
		}
		return this.aClass349_3.method7532(0);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)I")
	@Override
	public int method7227() {
		return this.aClass349_3.anInt9245;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7226(@OriginalArg(0) Class78 arg0) {
		this.aClass349_3.method7531(arg0);
	}

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "(I)V")
	@Override
	public void method7222() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(Lclient!r;I)Lclient!bca;")
	@Override
	public Class11_Sub2 method7219(@OriginalArg(0) Class78 arg0) {
		@Pc(21) Class52 local21 = this.aClass349_3.method7534(true, 2048, arg0, false);
		if (local21 == null) {
			return null;
		}
		@Pc(28) Class34 local28 = arg0.method6848();
		local28.NA(super.anInt8902, super.anInt8908, super.anInt8906);
		@Pc(38) Class11_Sub2 local38 = null;
		if (this.aBoolean547) {
			local38 = Static586.method7842(1);
		}
		this.aClass349_3.method7533(true, super.aShort88, local21, arg0, super.aShort91, super.aShort90, local28, super.aShort89);
		if (Static594.aBoolean718) {
			local21.method7405(local28, local38 == null ? null : local38.aClass11_Sub4Array1[0], Static18.anInt503, 0);
		} else {
			local21.method7413(local28, local38 == null ? null : local38.aClass11_Sub4Array1[0], 0);
		}
		if (this.aClass349_3.aClass11_Sub9_8 != null) {
			@Pc(99) Class64 local99 = this.aClass349_3.aClass11_Sub9_8.method5336();
			if (Static594.aBoolean718) {
				arg0.method6850(local99, Static18.anInt503);
			} else {
				arg0.method6796(local99);
			}
		}
		this.aBoolean546 = local21.LA() || this.aClass349_3.aClass11_Sub9_8 != null;
		if (this.aClass48_7 == null) {
			this.aClass48_7 = Static300.method7775(super.anInt8902, super.anInt8908, local21, super.anInt8906);
		} else {
			Static349.method5202(this.aClass48_7, super.anInt8902, super.anInt8908, super.anInt8906, local21);
		}
		return local38;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7229() {
		return this.aClass349_3.method7540();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	@Override
	public void method7228() {
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)I")
	@Override
	public int method7230() {
		return this.aClass349_3.anInt9248;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7209() {
		return false;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7231(@OriginalArg(1) Class78 arg0) {
		this.aClass349_3.method7535(arg0);
	}

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7217() {
		return this.aBoolean546;
	}
}

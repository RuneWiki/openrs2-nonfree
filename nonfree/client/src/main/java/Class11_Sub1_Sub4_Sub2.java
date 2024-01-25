import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class11_Sub1_Sub4_Sub2 extends Class11_Sub1_Sub4 implements Interface15 {

	@OriginalMember(owner = "client!ub", name = "Z", descriptor = "Lclient!cr;")
	private Class48 aClass48_8;

	@OriginalMember(owner = "client!ub", name = "db", descriptor = "Z")
	private boolean aBoolean668 = false;

	@OriginalMember(owner = "client!ub", name = "S", descriptor = "Lclient!vi;")
	public final Class349 aClass349_4;

	@OriginalMember(owner = "client!ub", name = "W", descriptor = "Z")
	private final boolean aBoolean667;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!r;Lclient!js;IIIIIZII)V")
	public Class11_Sub1_Sub4_Sub2(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt4675);
		this.aClass349_4 = new Class349(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean667 = arg1.anInt4662 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	@Override
	public void method7228() {
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7217() {
		return this.aBoolean668;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7231(@OriginalArg(1) Class78 arg0) {
		this.aClass349_4.method7535(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)I")
	@Override
	public int method7232() {
		return this.aClass349_4.anInt9246;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)I")
	@Override
	public int method7230() {
		return this.aClass349_4.anInt9248;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!r;)Lclient!cr;")
	@Override
	public Class48 method7205(@OriginalArg(1) Class78 arg0) {
		return this.aClass48_8;
	}

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7214() {
		return false;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7209() {
		return false;
	}

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)I")
	@Override
	public int method7212() {
		return this.aClass349_4.method7536();
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7229() {
		return this.aClass349_4.method7540();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7206(@OriginalArg(0) Class78 arg0) {
		@Pc(12) Class52 local12 = this.aClass349_4.method7534(true, 262144, arg0, true);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt8902 >> 9;
		@Pc(24) int local24 = super.anInt8906 >> 9;
		@Pc(27) Class34 local27 = arg0.method6848();
		local27.NA(super.anInt8902, super.anInt8908, super.anInt8906);
		this.aClass349_4.method7533(false, local24, local12, arg0, local19, local19, local27, local24);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Lclient!r;I)Lclient!bca;")
	@Override
	public Class11_Sub2 method7219(@OriginalArg(0) Class78 arg0) {
		@Pc(16) Class52 local16 = this.aClass349_4.method7534(true, 2048, arg0, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class34 local23 = arg0.method6848();
		local23.NA(super.anInt8902, super.anInt8908, super.anInt8906);
		@Pc(33) Class11_Sub2 local33 = null;
		if (this.aBoolean667) {
			local33 = Static586.method7842(1);
		}
		@Pc(47) int local47 = super.anInt8902 >> 9;
		@Pc(52) int local52 = super.anInt8906 >> 9;
		this.aClass349_4.method7533(true, local52, local16, arg0, local47, local47, local23, local52);
		if (Static594.aBoolean718) {
			local16.method7405(local23, local33 == null ? null : local33.aClass11_Sub4Array1[0], Static18.anInt503, 0);
		} else {
			local16.method7413(local23, local33 == null ? null : local33.aClass11_Sub4Array1[0], 0);
		}
		if (this.aClass349_4.aClass11_Sub9_8 != null) {
			@Pc(107) Class64 local107 = this.aClass349_4.aClass11_Sub9_8.method5336();
			if (Static594.aBoolean718) {
				arg0.method6850(local107, Static18.anInt503);
			} else {
				arg0.method6796(local107);
			}
		}
		this.aBoolean668 = local16.LA() || this.aClass349_4.aClass11_Sub9_8 != null;
		if (this.aClass48_8 == null) {
			this.aClass48_8 = Static300.method7775(super.anInt8902, super.anInt8908, local16, super.anInt8906);
		} else {
			Static349.method5202(this.aClass48_8, super.anInt8902, super.anInt8908, super.anInt8906, local16);
		}
		return local33;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)I")
	@Override
	public int method7227() {
		return this.aClass349_4.anInt9245;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!vv;IIZLclient!r;II)V")
	@Override
	public void method7215(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class78 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIILclient!r;)Z")
	@Override
	public boolean method7210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class78 arg2) {
		@Pc(14) Class52 local14 = this.aClass349_4.method7534(false, 131072, arg2, false);
		if (local14 == null) {
			return false;
		} else {
			@Pc(21) Class34 local21 = arg2.method6848();
			local21.NA(super.anInt8902, super.anInt8908, super.anInt8906);
			return Static594.aBoolean718 ? local14.method7392(arg1, arg0, local21, false, Static18.anInt503) : local14.method7402(arg1, arg0, local21, false);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7226(@OriginalArg(0) Class78 arg0) {
		this.aClass349_4.method7531(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)I")
	@Override
	public int method7208(@OriginalArg(0) int arg0) {
		if (arg0 != 6329) {
			Static522.aShortArray119 = null;
		}
		return this.aClass349_4.method7532(0);
	}

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "(I)V")
	@Override
	public void method7222() {
		throw new IllegalStateException();
	}
}

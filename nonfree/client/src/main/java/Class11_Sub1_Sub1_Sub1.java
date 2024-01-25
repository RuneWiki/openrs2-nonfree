import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class11_Sub1_Sub1_Sub1 extends Class11_Sub1_Sub1 {

	@OriginalMember(owner = "client!aj", name = "nb", descriptor = "Lclient!oa;")
	private Class11_Sub9 aClass11_Sub9_1;

	@OriginalMember(owner = "client!aj", name = "Q", descriptor = "Z")
	public boolean aBoolean15 = false;

	@OriginalMember(owner = "client!aj", name = "hb", descriptor = "I")
	private int anInt407 = 0;

	@OriginalMember(owner = "client!aj", name = "kb", descriptor = "I")
	private int anInt410 = 0;

	@OriginalMember(owner = "client!aj", name = "cb", descriptor = "Z")
	private boolean aBoolean16 = false;

	@OriginalMember(owner = "client!aj", name = "qb", descriptor = "I")
	private final int anInt414 = -1;

	@OriginalMember(owner = "client!aj", name = "tb", descriptor = "I")
	private int anInt416 = 0;

	@OriginalMember(owner = "client!aj", name = "pb", descriptor = "I")
	private int anInt413 = 0;

	@OriginalMember(owner = "client!aj", name = "ub", descriptor = "I")
	private int anInt417 = 0;

	@OriginalMember(owner = "client!aj", name = "db", descriptor = "I")
	public final int anInt404;

	@OriginalMember(owner = "client!aj", name = "ab", descriptor = "I")
	private final int anInt402;

	@OriginalMember(owner = "client!aj", name = "gb", descriptor = "Lclient!ks;")
	private Class197 aClass197_1;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class11_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt404 = arg1 + arg2;
		this.anInt407 = arg12;
		this.anInt402 = arg0;
		@Pc(53) Class134 local53 = Static583.aClass256_2.method5466(this.anInt402);
		@Pc(56) int local56 = local53.anInt3775;
		if (local56 == -1) {
			this.aBoolean15 = true;
		} else {
			this.aClass197_1 = Static223.aClass245_1.method5312(local56);
			this.aBoolean15 = false;
		}
		if (this.anInt404 == arg2) {
			Static473.method6515(this, this.aClass197_1, this.anInt417);
		}
	}

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7217() {
		return this.aBoolean16;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILclient!r;I)Lclient!da;")
	private Class52 method347(@OriginalArg(1) int arg0, @OriginalArg(2) Class78 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class134 local10 = Static583.aClass256_2.method5466(arg2);
		@Pc(19) Class129 local19 = Static36.aClass129Array7[super.aByte113];
		@Pc(34) Class129 local34 = super.aByte112 >= 3 ? null : Static36.aClass129Array7[super.aByte112 + 1];
		return this.aBoolean15 ? local10.method3067(local34, super.anInt8908, -1, 0, super.anInt8902, local19, arg0, arg1, Static223.aClass245_1, -1, super.anInt8906) : local10.method3067(local34, super.anInt8908, this.anInt414, this.anInt416, super.anInt8902, local19, arg0, arg1, Static223.aClass245_1, this.anInt417, super.anInt8906);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
	public void method348(@OriginalArg(0) int arg0) {
		if (this.aBoolean15) {
			return;
		}
		this.anInt416 += arg0;
		while (this.anInt416 > this.aClass197_1.anIntArray279[this.anInt417]) {
			this.anInt416 -= this.aClass197_1.anIntArray279[this.anInt417];
			this.anInt417++;
			if (this.aClass197_1.anIntArray284.length <= this.anInt417) {
				this.aBoolean15 = true;
				break;
			}
		}
		if (!this.aBoolean15) {
			Static473.method6515(this, this.aClass197_1, this.anInt417);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIILclient!r;)Z")
	@Override
	public boolean method7210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class78 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!vv;IIZLclient!r;II)V")
	@Override
	public void method7215(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class78 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass11_Sub9_1 != null) {
			this.aClass11_Sub9_1.method5342();
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(Lclient!r;I)Lclient!bca;")
	@Override
	public Class11_Sub2 method7219(@OriginalArg(0) Class78 arg0) {
		@Pc(20) Class52 local20 = this.method347((this.anInt407 == 0 ? 0 : 5) | 0x800, arg0, this.anInt402);
		if (local20 == null) {
			return null;
		}
		if (this.anInt407 != 0) {
			local20.M(this.anInt407 * 2048);
		}
		@Pc(39) Class34 local39 = arg0.method6848();
		local39.NA(super.anInt8902, super.anInt8908, super.anInt8906);
		this.method350(local39, local20, arg0);
		if (Static594.aBoolean718) {
			local20.method7405(local39, null, Static18.anInt503, 0);
		} else {
			local20.method7413(local39, null, 0);
		}
		if (this.aClass11_Sub9_1 != null) {
			@Pc(80) Class64 local80 = this.aClass11_Sub9_1.method5336();
			if (Static594.aBoolean718) {
				arg0.method6850(local80, Static18.anInt503);
			} else {
				arg0.method6796(local80);
			}
		}
		this.aBoolean16 = local20.LA();
		this.anInt413 = local20.J();
		this.anInt410 = local20.RA();
		return null;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!q;Lclient!da;BLclient!r;)V")
	private void method350(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(3) Class78 arg2) {
		arg1.method7410(arg0);
		@Pc(14) Class244[] local14 = arg1.method7404();
		@Pc(17) Class212[] local17 = arg1.method7395();
		if ((this.aClass11_Sub9_1 == null || this.aClass11_Sub9_1.aBoolean511) && (local14 != null || local17 != null)) {
			this.aClass11_Sub9_1 = Static363.method5341(Static518.anInt9331, true);
		}
		if (this.aClass11_Sub9_1 != null) {
			this.aClass11_Sub9_1.method5339(arg2, (long) Static518.anInt9331, local14, local17);
			this.aClass11_Sub9_1.method5348(super.aByte113, super.aShort90, super.aShort91, super.aShort88, super.aShort89);
		}
	}

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "(I)V")
	@Override
	public void method7222() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)I")
	@Override
	public int method7208(@OriginalArg(0) int arg0) {
		if (arg0 != 6329) {
			this.aClass11_Sub9_1 = null;
		}
		return this.anInt410;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!r;)Lclient!cr;")
	@Override
	public Class48 method7205(@OriginalArg(1) Class78 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	public void method351() {
		if (this.aClass11_Sub9_1 != null) {
			this.aClass11_Sub9_1.method5342();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7206(@OriginalArg(0) Class78 arg0) {
		@Pc(15) Class52 local15 = this.method347(0, arg0, this.anInt402);
		if (local15 != null) {
			@Pc(20) Class34 local20 = arg0.method6848();
			local20.NA(super.anInt8902, super.anInt8908, super.anInt8906);
			this.method350(local20, local15, arg0);
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7209() {
		return false;
	}

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7214() {
		return false;
	}

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "(I)I")
	@Override
	public int method7212() {
		return this.anInt413;
	}
}

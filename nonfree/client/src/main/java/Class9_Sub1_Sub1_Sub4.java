import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class9_Sub1_Sub1_Sub4 extends Class9_Sub1_Sub1 {

	@OriginalMember(owner = "client!ii", name = "lb", descriptor = "Lclient!qfa;")
	public static final Class272 lb = new Class272(53, -1);

	@OriginalMember(owner = "client!ii", name = "P", descriptor = "Lclient!gp;")
	private Class9_Sub6 aClass9_Sub6_5;

	@OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
	private final int anInt4345 = -1;

	@OriginalMember(owner = "client!ii", name = "N", descriptor = "I")
	private int anInt4346 = 0;

	@OriginalMember(owner = "client!ii", name = "cb", descriptor = "I")
	private int anInt4360 = 0;

	@OriginalMember(owner = "client!ii", name = "bb", descriptor = "I")
	private int anInt4359 = 0;

	@OriginalMember(owner = "client!ii", name = "kb", descriptor = "Z")
	private boolean aBoolean333 = false;

	@OriginalMember(owner = "client!ii", name = "db", descriptor = "I")
	private int anInt4361 = 0;

	@OriginalMember(owner = "client!ii", name = "ob", descriptor = "I")
	private int anInt4369 = 0;

	@OriginalMember(owner = "client!ii", name = "ib", descriptor = "Z")
	public boolean aBoolean332 = false;

	@OriginalMember(owner = "client!ii", name = "V", descriptor = "I")
	private final int anInt4353;

	@OriginalMember(owner = "client!ii", name = "mb", descriptor = "I")
	public final int anInt4367;

	@OriginalMember(owner = "client!ii", name = "sb", descriptor = "Lclient!as;")
	private Class17 aClass17_2;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class9_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt4353 = arg0;
		this.anInt4367 = arg2 + arg1;
		this.anInt4359 = arg12;
		@Pc(54) Class175 local54 = Static547.aClass248_2.method5708(this.anInt4353);
		@Pc(57) int local57 = local54.anInt4956;
		if (local57 == -1) {
			this.aBoolean332 = true;
		} else {
			this.aClass17_2 = Static330.aClass279_2.method6216(local57);
			this.aBoolean332 = false;
		}
		if (this.anInt4367 == arg2) {
			Static351.method5300(this.anInt4360, this.aClass17_2, super.anInt8980, super.anInt8975, super.aByte126, false);
		}
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7481() {
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BILclient!r;I)Lclient!da;")
	private Class57 method3863(@OriginalArg(1) int arg0, @OriginalArg(2) Class43 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class175 local8 = Static547.aClass248_2.method5708(arg2);
		@Pc(13) Class139 local13 = Static374.aClass139Array17[super.aByte126];
		@Pc(34) Class139 local34 = super.aByte125 >= 3 ? null : Static374.aClass139Array17[super.aByte125 + 1];
		return this.aBoolean332 ? local8.method4325(0, local13, -1, arg1, arg0, super.anInt8975, local34, Static330.aClass279_2, -1, super.anInt8977, super.anInt8980) : local8.method4325(this.anInt4346, local13, this.anInt4360, arg1, arg0, super.anInt8975, local34, Static330.aClass279_2, this.anInt4345, super.anInt8977, super.anInt8980);
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(ILclient!r;)Lclient!fe;")
	@Override
	public Class9_Sub2 method7480(@OriginalArg(1) Class43 arg0) {
		@Pc(23) Class57 local23 = this.method3863((this.anInt4359 == 0 ? 0 : 5) | 0x800, arg0, this.anInt4353);
		if (local23 == null) {
			return null;
		}
		if (this.anInt4359 != 0) {
			local23.M(this.anInt4359 * 2048);
		}
		@Pc(50) Class109 local50 = arg0.method7142();
		local50.NA(super.anInt8975, super.anInt8977, super.anInt8980);
		this.method3865(local50, local23, arg0);
		if (Static225.aBoolean335) {
			local23.method7521(local50, null, Static354.anInt6136, 0);
		} else {
			local23.method7501(local50, null, 0);
		}
		if (this.aClass9_Sub6_5 != null) {
			@Pc(86) Class96 local86 = this.aClass9_Sub6_5.method3053();
			if (Static225.aBoolean335) {
				arg0.method7176(local86, Static354.anInt6136);
			} else {
				arg0.method7189(local86);
			}
		}
		this.aBoolean333 = local23.LA();
		this.anInt4369 = local23.J();
		this.anInt4361 = local23.RA();
		return null;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!r;BII)Z")
	@Override
	public boolean method7474(@OriginalArg(0) Class43 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7483() {
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(Z)I")
	@Override
	public int method7482(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			Static223.method3867(24, -41, 93);
		}
		return this.anInt4361;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IILclient!gfa;IILclient!r;Z)V")
	@Override
	public void method7479(@OriginalArg(0) int arg0, @OriginalArg(2) Class9_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class43 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V")
	@Override
	public void method7477() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILclient!r;)Lclient!bm;")
	@Override
	public Class29 method7469(@OriginalArg(1) Class43 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
	public void method3864() {
		if (this.aClass9_Sub6_5 != null) {
			this.aClass9_Sub6_5.method3059();
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!q;Lclient!da;BLclient!r;)V")
	private void method3865(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(3) Class43 arg2) {
		arg1.method7525(arg0);
		@Pc(15) Class323[] local15 = arg1.method7503();
		@Pc(18) Class15[] local18 = arg1.method7516();
		if ((this.aClass9_Sub6_5 == null || this.aClass9_Sub6_5.aBoolean274) && (local15 != null || local18 != null)) {
			this.aClass9_Sub6_5 = Static177.method3058(Static305.anInt5560, true);
		}
		if (this.aClass9_Sub6_5 != null) {
			this.aClass9_Sub6_5.method3060(arg2, (long) Static305.anInt5560, local15, local18);
			this.aClass9_Sub6_5.method3049(super.aByte126, super.aShort112, super.aShort114, super.aShort115, super.aShort113);
		}
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7473() {
		return this.aBoolean333;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)V")
	public void method3866(@OriginalArg(1) int arg0) {
		if (this.aBoolean332) {
			return;
		}
		this.anInt4346 += arg0;
		while (this.anInt4346 > this.aClass17_2.anIntArray54[this.anInt4360]) {
			this.anInt4346 -= this.aClass17_2.anIntArray54[this.anInt4360];
			this.anInt4360++;
			if (this.aClass17_2.anIntArray55.length <= this.anInt4360) {
				this.aBoolean332 = true;
				break;
			}
		}
		if (!this.aBoolean332) {
			Static351.method5300(this.anInt4360, this.aClass17_2, super.anInt8980, super.anInt8975, super.aByte126, false);
		}
	}

	@OriginalMember(owner = "client!ii", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass9_Sub6_5 != null) {
			this.aClass9_Sub6_5.method3059();
		}
	}

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)I")
	@Override
	public int method7478() {
		return this.anInt4369;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7471(@OriginalArg(1) Class43 arg0) {
		@Pc(17) Class57 local17 = this.method3863(0, arg0, this.anInt4353);
		if (local17 != null) {
			@Pc(22) Class109 local22 = arg0.method7142();
			local22.NA(super.anInt8975, super.anInt8977, super.anInt8980);
			this.method3865(local22, local17, arg0);
		}
	}
}

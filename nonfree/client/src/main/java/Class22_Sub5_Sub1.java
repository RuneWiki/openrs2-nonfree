import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class22_Sub5_Sub1 extends Class22_Sub5 implements Interface1 {

	@OriginalMember(owner = "client!rq", name = "O", descriptor = "B")
	private final byte aByte60;

	@OriginalMember(owner = "client!rq", name = "W", descriptor = "Z")
	private final boolean aBoolean409;

	@OriginalMember(owner = "client!rq", name = "U", descriptor = "S")
	private final short aShort75;

	@OriginalMember(owner = "client!rq", name = "Q", descriptor = "B")
	private final byte aByte61;

	@OriginalMember(owner = "client!rq", name = "T", descriptor = "Z")
	private final boolean aBoolean408;

	@OriginalMember(owner = "client!rq", name = "fb", descriptor = "B")
	private final byte aByte63;

	@OriginalMember(owner = "client!rq", name = "ab", descriptor = "Z")
	private final boolean aBoolean410;

	@OriginalMember(owner = "client!rq", name = "bb", descriptor = "Lclient!ug;")
	private Class7_Sub1_Sub4 aClass7_Sub1_Sub4_5;

	@OriginalMember(owner = "client!rq", name = "gb", descriptor = "Lclient!sj;")
	private Class31 aClass31_6;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!pe;Lclient!kk;IIIIZIIIII)V")
	public Class22_Sub5_Sub1(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static312.method5043(arg10, arg11));
		this.aByte60 = (byte) arg11;
		this.aBoolean409 = arg6;
		super.anInt6336 = (short) arg5;
		this.aShort75 = (short) arg1.anInt3534;
		this.aByte61 = (byte) arg10;
		this.aBoolean408 = arg1.anInt3560 != 0;
		this.aByte63 = (byte) arg2;
		super.anInt6344 = (short) arg3;
		this.aBoolean410 = arg0.method5418() && arg1.aBoolean274 && !this.aBoolean409 && Static336.anInt4180 != 0;
		@Pc(77) Class104 local77 = this.method4667(arg0, this.aBoolean410, 1024);
		if (local77 != null) {
			this.aClass7_Sub1_Sub4_5 = local77.aClass7_Sub1_Sub4_2;
			this.aClass31_6 = local77.aClass31_2;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)I")
	@Override
	public int method5360() {
		return this.aByte60;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
	@Override
	public void method5358() {
		if (this.aClass31_6 != null) {
			this.aClass31_6.method1921();
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IILclient!pe;I)Z")
	@Override
	public boolean method5342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89 arg2) {
		@Pc(9) Class31 local9 = this.method4664(65536, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class70 local14 = arg2.method5427();
			local14.method3707(super.anInt6344, super.anInt6345, super.anInt6336);
			return local9.method1932(arg1, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!pe;B)Lclient!ca;")
	@Override
	public Class36_Sub1 method5345(@OriginalArg(0) Class89 arg0) {
		if (this.aClass31_6 == null) {
			return null;
		}
		@Pc(11) Class70 local11 = arg0.method5427();
		local11.method3707(super.anInt6344 + super.anInt6347, super.anInt6345, super.anInt6339 + super.anInt6336);
		@Pc(33) Class36_Sub1 local33 = null;
		if (this.aBoolean408) {
			local33 = Static184.method3381(1);
		}
		this.aClass31_6.method1928(local11, local33 == null ? null : local33.aClass36_Sub6Array1[0], 0);
		return local33;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(BILclient!pe;)Lclient!sj;")
	private Class31 method4664(@OriginalArg(1) int arg0, @OriginalArg(2) Class89 arg1) {
		if (this.aClass31_6 != null && arg1.method5399(this.aClass31_6.method1912(), arg0) == 0) {
			return this.aClass31_6;
		} else {
			@Pc(28) Class104 local28 = this.method4667(arg1, false, arg0);
			return local28 == null ? null : local28.aClass31_2;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!pe;I)V")
	@Override
	public void method5359(@OriginalArg(0) Class89 arg0) {
		@Pc(14) Class7_Sub1_Sub4 local14;
		if (this.aClass7_Sub1_Sub4_5 == null && this.aBoolean410) {
			@Pc(25) Class104 local25 = this.method4667(arg0, true, 131072);
			local14 = local25 == null ? null : local25.aClass7_Sub1_Sub4_2;
		} else {
			local14 = this.aClass7_Sub1_Sub4_5;
			this.aClass7_Sub1_Sub4_5 = null;
		}
		if (local14 != null) {
			Static86.method1826(local14, this.aByte63, super.anInt6344, super.anInt6336, null);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(BLclient!pe;)V")
	@Override
	public void method5365(@OriginalArg(1) Class89 arg0) {
		@Pc(33) Class7_Sub1_Sub4 local33;
		if (this.aClass7_Sub1_Sub4_5 == null && this.aBoolean410) {
			@Pc(26) Class104 local26 = this.method4667(arg0, true, 131072);
			local33 = local26 == null ? null : local26.aClass7_Sub1_Sub4_2;
		} else {
			local33 = this.aClass7_Sub1_Sub4_5;
			this.aClass7_Sub1_Sub4_5 = null;
		}
		if (local33 != null) {
			Static33.method687(local33, this.aByte63, super.anInt6344, super.anInt6336, null);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!pe;ZIB)Lclient!il;")
	private Class104 method4667(@OriginalArg(0) Class89 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(15) Class122 local15 = Static245.method4227(this.aShort75 & 0xFFFF);
		@Pc(23) Class8 local23;
		@Pc(29) Class8 local29;
		if (this.aBoolean409) {
			local23 = Static251.aClass8Array6[this.aByte63];
			local29 = Static136.aClass8Array3[0];
		} else {
			local23 = Static136.aClass8Array3[this.aByte63];
			if (this.aByte63 >= 3) {
				local29 = null;
			} else {
				local29 = Static136.aClass8Array3[this.aByte63 + 1];
			}
		}
		return local15.method3229(super.anInt6336, this.aByte60, arg1, arg0, local23, local29, this.aByte61, super.anInt6345, arg2, super.anInt6344);
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(B)I")
	@Override
	public int method5362() {
		return this.aShort75 & 0xFFFF;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILclient!pe;)V")
	@Override
	public void method5341(@OriginalArg(1) Class89 arg0) {
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!pe;II)Lclient!sj;")
	@Override
	public Class31 method5364(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1) {
		return this.method4664(arg1, arg0);
	}

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5363() {
		return this.aBoolean410;
	}

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "(I)I")
	@Override
	public int method5351() {
		return this.aClass31_6 == null ? 0 : this.aClass31_6.method1920();
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)I")
	@Override
	public int method5361() {
		return this.aByte61;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class15_Sub5_Sub1 extends Class15_Sub5 implements Interface10 {

	@OriginalMember(owner = "client!oca", name = "E", descriptor = "Lclient!km;")
	private Class175 aClass175_5;

	@OriginalMember(owner = "client!oca", name = "L", descriptor = "Z")
	private final boolean aBoolean452;

	@OriginalMember(owner = "client!oca", name = "v", descriptor = "Z")
	private final boolean aBoolean450;

	@OriginalMember(owner = "client!oca", name = "o", descriptor = "B")
	private final byte aByte63;

	@OriginalMember(owner = "client!oca", name = "q", descriptor = "Z")
	private boolean aBoolean449;

	@OriginalMember(owner = "client!oca", name = "H", descriptor = "S")
	private final short aShort87;

	@OriginalMember(owner = "client!oca", name = "J", descriptor = "B")
	private final byte aByte64;

	@OriginalMember(owner = "client!oca", name = "F", descriptor = "Z")
	private final boolean aBoolean451;

	@OriginalMember(owner = "client!oca", name = "N", descriptor = "Lclient!r;")
	private Class36 aClass36_3;

	@OriginalMember(owner = "client!oca", name = "w", descriptor = "Lclient!k;")
	private Class5_Sub2_Sub13 aClass5_Sub2_Sub13_3;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lclient!qa;Lclient!tk;IIIIZIZ)V")
	public Class15_Sub5_Sub1(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt8173, arg1.aBoolean578, arg1.aBoolean580);
		this.aBoolean452 = arg1.anInt8152 != 0 && !arg6;
		super.anInt8441 = arg5;
		this.aBoolean450 = arg6;
		super.anInt8440 = arg3;
		this.aByte63 = (byte) arg2;
		this.aBoolean449 = arg8;
		this.aShort87 = (short) arg1.anInt8190;
		this.aByte64 = (byte) arg7;
		this.aBoolean451 = arg0.method7047() && arg1.aBoolean592 && !this.aBoolean450 && Static300.aClass5_Sub28_Sub1_1.method4116(Static17.anInt459) != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean449) {
			local69 |= 0x10000;
		}
		@Pc(84) Class89 local84 = this.method5410(local69, this.aBoolean451, arg0);
		if (local84 != null) {
			this.aClass36_3 = local84.aClass36_1;
			this.aClass5_Sub2_Sub13_3 = local84.aClass5_Sub2_Sub13_1;
			if (this.aBoolean449) {
				this.aClass36_3 = this.aClass36_3.method7356((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6869(@OriginalArg(1) Class62 arg0) {
		@Pc(39) Class5_Sub2_Sub13 local39;
		if (this.aClass5_Sub2_Sub13_3 == null && this.aBoolean451) {
			@Pc(32) Class89 local32 = this.method5410(262144, true, arg0);
			local39 = local32 == null ? null : local32.aClass5_Sub2_Sub13_1;
		} else {
			local39 = this.aClass5_Sub2_Sub13_3;
			this.aClass5_Sub2_Sub13_3 = null;
		}
		if (local39 != null) {
			Static135.method2556(local39, this.aByte63, super.anInt8440, super.anInt8441, null);
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)I")
	@Override
	public int method6867() {
		return 22;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	@Override
	public Class36 method6873(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1) {
		return this.method5409(arg1, arg0);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(BZILclient!qa;IILclient!cea;)V")
	@Override
	public void method6859(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class15 arg5) {
		if (arg5 instanceof Class15_Sub5_Sub1) {
			@Pc(5) Class15_Sub5_Sub1 local5 = (Class15_Sub5_Sub1) arg5;
			if (this.aClass36_3 != null && local5.aClass36_3 != null) {
				this.aClass36_3.method7349(local5.aClass36_3, arg3, arg1, arg4, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6862(@OriginalArg(0) Class62 arg0) {
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method6872(@OriginalArg(1) Class62 arg0) {
		@Pc(25) Class5_Sub2_Sub13 local25;
		if (this.aClass5_Sub2_Sub13_3 == null && this.aBoolean451) {
			@Pc(18) Class89 local18 = this.method5410(262144, true, arg0);
			local25 = local18 == null ? null : local18.aClass5_Sub2_Sub13_1;
		} else {
			local25 = this.aClass5_Sub2_Sub13_3;
			this.aClass5_Sub2_Sub13_3 = null;
		}
		if (local25 != null) {
			Static44.method899(local25, this.aByte63, super.anInt8440, super.anInt8441, null);
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(BLclient!qa;II)Z")
	@Override
	public boolean method6857(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class36 local15 = this.method5409(arg0, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class78 local20 = arg0.method6994();
			local20.oa(super.anInt8440, super.anInt8442, super.anInt8441);
			return local15.method7359(arg1, arg2, local20, false);
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!qa;I)Lclient!bi;")
	@Override
	public Class30_Sub1 method6858(@OriginalArg(0) Class62 arg0) {
		if (this.aClass36_3 == null) {
			return null;
		}
		@Pc(11) Class78 local11 = arg0.method6994();
		local11.oa(super.anInt8440, super.anInt8442, super.anInt8441);
		@Pc(21) Class30_Sub1 local21 = null;
		if (this.aBoolean452) {
			local21 = Static363.method5549(1);
		}
		this.aClass36_3.method7360(local11, local21 == null ? null : local21.aClass30_Sub6Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!qa;BI)Lclient!r;")
	private Class36 method5409(@OriginalArg(0) Class62 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass36_3 != null && arg0.method7017(this.aClass36_3.ba(), arg1) == 0) {
			return this.aClass36_3;
		} else {
			@Pc(29) Class89 local29 = this.method5410(arg1, false, arg0);
			return local29 == null ? null : local29.aClass36_1;
		}
	}

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6871() {
		return this.aBoolean451;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)I")
	@Override
	public int method6866() {
		return this.aByte64;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6861() {
		return this.aBoolean449;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IBZLclient!qa;)Lclient!ep;")
	private Class89 method5410(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class62 arg2) {
		@Pc(15) Class283 local15 = Static453.aClass88_3.method2294(this.aShort87 & 0xFFFF);
		@Pc(32) Class131 local32;
		@Pc(27) Class131 local27;
		if (this.aBoolean450) {
			local27 = Static493.aClass131Array5[0];
			local32 = Static511.aClass131Array6[this.aByte63];
		} else {
			local32 = Static493.aClass131Array5[this.aByte63];
			if (this.aByte63 < 3) {
				local27 = Static493.aClass131Array5[this.aByte63 + 1];
			} else {
				local27 = null;
			}
		}
		return local15.method6612(22, local32, local27, this.aByte64, super.anInt8440, arg1, super.anInt8441, arg0, arg2, super.anInt8442);
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(I)I")
	@Override
	public int method6868() {
		return this.aShort87 & 0xFFFF;
	}

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "(I)V")
	@Override
	public void method6870() {
		if (this.aClass36_3 != null) {
			this.aClass36_3.method7357();
		}
	}

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "(I)V")
	@Override
	public void method6860() {
		this.aBoolean449 = false;
		if (this.aClass36_3 != null) {
			this.aClass36_3.m(this.aClass36_3.ba() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(ILclient!qa;)Lclient!km;")
	@Override
	public Class175 method6854(@OriginalArg(1) Class62 arg0) {
		if (this.aClass175_5 == null) {
			this.aClass175_5 = Static272.method4491(this.method5409(arg0, 0), super.anInt8440, super.anInt8441, super.anInt8442);
		}
		return this.aClass175_5;
	}
}

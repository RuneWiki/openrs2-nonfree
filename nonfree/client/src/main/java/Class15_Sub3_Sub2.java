import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class15_Sub3_Sub2 extends Class15_Sub3 implements Interface10 {

	@OriginalMember(owner = "client!fn", name = "t", descriptor = "Lclient!km;")
	private Class175 aClass175_2;

	@OriginalMember(owner = "client!fn", name = "y", descriptor = "Z")
	private final boolean aBoolean192;

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "B")
	private final byte aByte34;

	@OriginalMember(owner = "client!fn", name = "U", descriptor = "S")
	private final short aShort43;

	@OriginalMember(owner = "client!fn", name = "r", descriptor = "B")
	private final byte aByte35;

	@OriginalMember(owner = "client!fn", name = "N", descriptor = "B")
	private final byte aByte36;

	@OriginalMember(owner = "client!fn", name = "u", descriptor = "Z")
	private final boolean aBoolean191;

	@OriginalMember(owner = "client!fn", name = "p", descriptor = "Z")
	private boolean aBoolean190;

	@OriginalMember(owner = "client!fn", name = "O", descriptor = "Z")
	private final boolean aBoolean193;

	@OriginalMember(owner = "client!fn", name = "G", descriptor = "Lclient!k;")
	private Class5_Sub2_Sub13 aClass5_Sub2_Sub13_2;

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "Lclient!r;")
	public Class36 aClass36_2;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!qa;Lclient!tk;IIIIZIIZ)V")
	public Class15_Sub3_Sub2(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static367.method5593(arg8, arg7));
		this.aBoolean192 = arg1.anInt8152 != 0 && !arg6;
		this.aByte34 = (byte) arg2;
		super.anInt6142 = arg5;
		this.aShort43 = (short) arg1.anInt8190;
		this.aByte35 = (byte) arg7;
		this.aByte36 = (byte) arg8;
		this.aBoolean191 = arg6;
		this.aBoolean190 = arg9;
		super.anInt6146 = arg3;
		this.aBoolean193 = arg0.method7047() && arg1.aBoolean592 && !this.aBoolean191 && Static300.aClass5_Sub28_Sub1_1.method4116(Static17.anInt459) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean190) {
			local71 |= 0x10000;
		}
		@Pc(86) Class89 local86 = this.method2632(this.aBoolean193, local71, arg0);
		if (local86 != null) {
			this.aClass5_Sub2_Sub13_2 = local86.aClass5_Sub2_Sub13_1;
			this.aClass36_2 = local86.aClass36_1;
			if (this.aBoolean190) {
				this.aClass36_2 = this.aClass36_2.method7356((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6862(@OriginalArg(0) Class62 arg0) {
	}

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "(I)V")
	@Override
	public void method6860() {
		this.aBoolean190 = false;
		if (this.aClass36_2 != null) {
			this.aClass36_2.m(this.aClass36_2.ba() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BZILclient!qa;IILclient!cea;)V")
	@Override
	public void method6859(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class15 arg5) {
		if (arg5 instanceof Class15_Sub3_Sub2) {
			@Pc(32) Class15_Sub3_Sub2 local32 = (Class15_Sub3_Sub2) arg5;
			if (this.aClass36_2 != null && local32.aClass36_2 != null) {
				this.aClass36_2.method7349(local32.aClass36_2, arg3, arg1, arg4, arg0);
			}
		} else if (arg5 instanceof Class15_Sub2_Sub6) {
			@Pc(12) Class15_Sub2_Sub6 local12 = (Class15_Sub2_Sub6) arg5;
			if (this.aClass36_2 != null && local12.aClass36_6 != null) {
				this.aClass36_2.method7349(local12.aClass36_6, arg3, arg1, arg4, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6871() {
		return this.aBoolean193;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLclient!qa;II)Z")
	@Override
	public boolean method6857(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class36 local9 = this.method2633(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class78 local14 = arg0.method6994();
			local14.oa(super.anInt6146, super.anInt6143, super.anInt6142);
			return local9.method7359(arg1, arg2, local14, false);
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(ILclient!qa;)Lclient!km;")
	@Override
	public Class175 method6854(@OriginalArg(1) Class62 arg0) {
		if (this.aClass175_2 == null) {
			this.aClass175_2 = Static272.method4491(this.method2633(0, arg0), super.anInt6146, super.anInt6142, super.anInt6143);
		}
		return this.aClass175_2;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6869(@OriginalArg(1) Class62 arg0) {
		@Pc(25) Class5_Sub2_Sub13 local25;
		if (this.aClass5_Sub2_Sub13_2 == null && this.aBoolean193) {
			@Pc(18) Class89 local18 = this.method2632(true, 262144, arg0);
			local25 = local18 == null ? null : local18.aClass5_Sub2_Sub13_1;
		} else {
			local25 = this.aClass5_Sub2_Sub13_2;
			this.aClass5_Sub2_Sub13_2 = null;
		}
		if (local25 != null) {
			Static135.method2556(local25, this.aByte34, super.anInt6146, super.anInt6142, null);
		}
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)V")
	@Override
	public void method6870() {
		if (this.aClass36_2 != null) {
			this.aClass36_2.method7357();
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)I")
	@Override
	public int method6866() {
		return this.aByte36;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	@Override
	public Class36 method6873(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1) {
		return this.method2633(arg0, arg1);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZIILclient!qa;)Lclient!ep;")
	private Class89 method2632(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2) {
		@Pc(13) Class283 local13 = Static453.aClass88_3.method2294(this.aShort43 & 0xFFFF);
		@Pc(26) Class131 local26;
		@Pc(37) Class131 local37;
		if (this.aBoolean191) {
			local26 = Static511.aClass131Array6[this.aByte34];
			local37 = Static493.aClass131Array5[0];
		} else {
			local26 = Static493.aClass131Array5[this.aByte34];
			if (this.aByte34 < 3) {
				local37 = Static493.aClass131Array5[this.aByte34 + 1];
			} else {
				local37 = null;
			}
		}
		return local13.method6612(this.aByte35, local26, local37, this.aByte36, super.anInt6146, arg0, super.anInt6142, arg1, arg2, super.anInt6143);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method6872(@OriginalArg(1) Class62 arg0) {
		@Pc(22) Class5_Sub2_Sub13 local22;
		if (this.aClass5_Sub2_Sub13_2 == null && this.aBoolean193) {
			@Pc(33) Class89 local33 = this.method2632(true, 262144, arg0);
			local22 = local33 == null ? null : local33.aClass5_Sub2_Sub13_1;
		} else {
			local22 = this.aClass5_Sub2_Sub13_2;
			this.aClass5_Sub2_Sub13_2 = null;
		}
		if (local22 != null) {
			Static44.method899(local22, this.aByte34, super.anInt6146, super.anInt6142, null);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IBLclient!qa;)Lclient!r;")
	private Class36 method2633(@OriginalArg(0) int arg0, @OriginalArg(2) Class62 arg1) {
		if (this.aClass36_2 != null && arg1.method7017(this.aClass36_2.ba(), arg0) == 0) {
			return this.aClass36_2;
		} else {
			@Pc(31) Class89 local31 = this.method2632(false, arg0, arg1);
			return local31 == null ? null : local31.aClass36_1;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)I")
	@Override
	public int method6867() {
		return this.aByte35;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!qa;I)Lclient!bi;")
	@Override
	public Class30_Sub1 method6858(@OriginalArg(0) Class62 arg0) {
		if (this.aClass36_2 == null) {
			return null;
		}
		@Pc(11) Class78 local11 = arg0.method6994();
		local11.oa(super.anInt6146, super.anInt6143, super.anInt6142);
		@Pc(21) Class30_Sub1 local21 = null;
		if (this.aBoolean192) {
			local21 = Static363.method5549(1);
		}
		this.aClass36_2.method7360(local11, local21 == null ? null : local21.aClass30_Sub6Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6861() {
		return this.aBoolean190;
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)I")
	@Override
	public int method6868() {
		return this.aShort43 & 0xFFFF;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class15_Sub1_Sub3 extends Class15_Sub1 implements Interface10 {

	@OriginalMember(owner = "client!rp", name = "M", descriptor = "Lclient!km;")
	private Class175 aClass175_6;

	@OriginalMember(owner = "client!rp", name = "x", descriptor = "S")
	private final short aShort97;

	@OriginalMember(owner = "client!rp", name = "w", descriptor = "B")
	private final byte aByte73;

	@OriginalMember(owner = "client!rp", name = "R", descriptor = "Z")
	private final boolean aBoolean540;

	@OriginalMember(owner = "client!rp", name = "L", descriptor = "Z")
	private final boolean aBoolean539;

	@OriginalMember(owner = "client!rp", name = "D", descriptor = "B")
	private final byte aByte74;

	@OriginalMember(owner = "client!rp", name = "E", descriptor = "B")
	private final byte aByte75;

	@OriginalMember(owner = "client!rp", name = "C", descriptor = "Z")
	private final boolean aBoolean538;

	@OriginalMember(owner = "client!rp", name = "B", descriptor = "Lclient!k;")
	private Class5_Sub2_Sub13 aClass5_Sub2_Sub13_4;

	@OriginalMember(owner = "client!rp", name = "N", descriptor = "Lclient!r;")
	private Class36 aClass36_4;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!qa;Lclient!tk;IIIIZIIIII)V")
	public Class15_Sub1_Sub3(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static32.method723(arg10, arg11));
		this.aShort97 = (short) arg1.anInt8190;
		this.aByte73 = (byte) arg2;
		this.aBoolean540 = arg6;
		this.aBoolean539 = arg1.anInt8152 != 0 && !arg6;
		super.anInt7573 = arg5;
		super.anInt7582 = arg3;
		this.aByte74 = (byte) arg11;
		this.aByte75 = (byte) arg10;
		this.aBoolean538 = arg0.method7047() && arg1.aBoolean592 && !this.aBoolean540 && Static300.aClass5_Sub28_Sub1_1.method4116(Static17.anInt459) != 0;
		@Pc(77) Class89 local77 = this.method6166(arg0, this.aBoolean538, 2048);
		if (local77 != null) {
			this.aClass5_Sub2_Sub13_4 = local77.aClass5_Sub2_Sub13_1;
			this.aClass36_4 = local77.aClass36_1;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6862(@OriginalArg(0) Class62 arg0) {
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6869(@OriginalArg(1) Class62 arg0) {
		@Pc(19) Class5_Sub2_Sub13 local19;
		if (this.aClass5_Sub2_Sub13_4 == null && this.aBoolean538) {
			@Pc(30) Class89 local30 = this.method6166(arg0, true, 262144);
			local19 = local30 == null ? null : local30.aClass5_Sub2_Sub13_1;
		} else {
			local19 = this.aClass5_Sub2_Sub13_4;
			this.aClass5_Sub2_Sub13_4 = null;
		}
		if (local19 != null) {
			Static135.method2556(local19, this.aByte73, super.anInt7582, super.anInt7573, null);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)I")
	@Override
	public int method6866() {
		return this.aByte74;
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)V")
	@Override
	public void method6870() {
		if (this.aClass36_4 != null) {
			this.aClass36_4.method7357();
		}
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(B)I")
	@Override
	public int method6155() {
		return this.aClass36_4 == null ? 0 : this.aClass36_4.TA();
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	private Class36 method6165(@OriginalArg(1) int arg0, @OriginalArg(2) Class62 arg1) {
		if (this.aClass36_4 != null && arg1.method7017(this.aClass36_4.ba(), arg0) == 0) {
			return this.aClass36_4;
		} else {
			@Pc(31) Class89 local31 = this.method6166(arg1, false, arg0);
			return local31 == null ? null : local31.aClass36_1;
		}
	}

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6871() {
		return this.aBoolean538;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!qa;I)Lclient!bi;")
	@Override
	public Class30_Sub1 method6858(@OriginalArg(0) Class62 arg0) {
		if (this.aClass36_4 == null) {
			return null;
		}
		@Pc(11) Class78 local11 = arg0.method6994();
		local11.oa(super.anInt7574 + super.anInt7582, super.anInt7580, super.anInt7577 + super.anInt7573);
		@Pc(33) Class30_Sub1 local33 = null;
		if (this.aBoolean539) {
			local33 = Static363.method5549(1);
		}
		this.aClass36_4.method7360(local11, local33 == null ? null : local33.aClass30_Sub6Array1[0], 0);
		return local33;
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(ILclient!qa;)Lclient!km;")
	@Override
	public Class175 method6854(@OriginalArg(1) Class62 arg0) {
		if (this.aClass175_6 == null) {
			this.aClass175_6 = Static272.method4491(this.method6165(0, arg0), super.anInt7582, super.anInt7573, super.anInt7580);
		}
		return this.aClass175_6;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!qa;ZII)Lclient!ep;")
	private Class89 method6166(@OriginalArg(0) Class62 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class283 local13 = Static453.aClass88_3.method2294(this.aShort97 & 0xFFFF);
		@Pc(21) Class131 local21;
		@Pc(32) Class131 local32;
		if (this.aBoolean540) {
			local32 = Static493.aClass131Array5[0];
			local21 = Static511.aClass131Array6[this.aByte73];
		} else {
			local21 = Static493.aClass131Array5[this.aByte73];
			if (this.aByte73 < 3) {
				local32 = Static493.aClass131Array5[this.aByte73 + 1];
			} else {
				local32 = null;
			}
		}
		return local13.method6612(this.aByte75, local21, local32, this.aByte74, super.anInt7582, arg1, super.anInt7573, arg2, arg0, super.anInt7580);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BLclient!qa;II)Z")
	@Override
	public boolean method6857(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class36 local9 = this.method6165(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class78 local19 = arg0.method6994();
			local19.oa(super.anInt7582, super.anInt7580, super.anInt7573);
			return local9.method7359(arg1, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)I")
	@Override
	public int method6867() {
		return this.aByte75;
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)I")
	@Override
	public int method6868() {
		return this.aShort97 & 0xFFFF;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method6872(@OriginalArg(1) Class62 arg0) {
		@Pc(22) Class5_Sub2_Sub13 local22;
		if (this.aClass5_Sub2_Sub13_4 == null && this.aBoolean538) {
			@Pc(33) Class89 local33 = this.method6166(arg0, true, 262144);
			local22 = local33 == null ? null : local33.aClass5_Sub2_Sub13_1;
		} else {
			local22 = this.aClass5_Sub2_Sub13_4;
			this.aClass5_Sub2_Sub13_4 = null;
		}
		if (local22 != null) {
			Static44.method899(local22, this.aByte73, super.anInt7582, super.anInt7573, null);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	@Override
	public Class36 method6873(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1) {
		return this.method6165(arg0, arg1);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 implements Interface8 {

	@OriginalMember(owner = "client!wl", name = "M", descriptor = "S")
	private final short aShort98;

	@OriginalMember(owner = "client!wl", name = "I", descriptor = "B")
	private final byte aByte76;

	@OriginalMember(owner = "client!wl", name = "H", descriptor = "Z")
	private final boolean aBoolean494;

	@OriginalMember(owner = "client!wl", name = "U", descriptor = "Z")
	private final boolean aBoolean495;

	@OriginalMember(owner = "client!wl", name = "D", descriptor = "B")
	private final byte aByte75;

	@OriginalMember(owner = "client!wl", name = "T", descriptor = "B")
	private final byte aByte77;

	@OriginalMember(owner = "client!wl", name = "z", descriptor = "Z")
	private final boolean aBoolean493;

	@OriginalMember(owner = "client!wl", name = "W", descriptor = "Lclient!qh;")
	private Class159 aClass159_7;

	@OriginalMember(owner = "client!wl", name = "P", descriptor = "Lclient!ph;")
	private Class2_Sub7_Sub11 aClass2_Sub7_Sub11_6;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!oj;Lclient!cu;IIIIZIIIII)V")
	public Class1_Sub3_Sub3(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static387.method6074(arg10, arg11));
		this.aShort98 = (short) arg1.anInt1234;
		super.anInt6984 = (short) arg3;
		this.aByte76 = (byte) arg10;
		this.aBoolean494 = arg1.anInt1274 != 0 && !arg6;
		this.aBoolean495 = arg6;
		this.aByte75 = (byte) arg2;
		this.aByte77 = (byte) arg11;
		super.anInt6988 = (short) arg5;
		this.aBoolean493 = arg0.method2476() && arg1.aBoolean100 && !this.aBoolean495 && Static266.anInt5047 != 0;
		@Pc(73) Class187 local73 = this.method6037(arg0, this.aBoolean493, 1024);
		if (local73 != null) {
			this.aClass159_7 = local73.aClass159_5;
			this.aClass2_Sub7_Sub11_6 = local73.aClass2_Sub7_Sub11_4;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	@Override
	public void method6030() {
		if (this.aClass159_7 != null) {
			this.aClass159_7.method4928();
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)I")
	@Override
	public int method6031() {
		return this.aByte77;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)I")
	@Override
	public int method6034() {
		return this.aShort98 & 0xFFFF;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILclient!oj;II)Z")
	@Override
	public boolean method6016(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2) {
		@Pc(18) Class159 local18 = this.method6036(65536, arg1);
		if (local18 == null) {
			return false;
		} else {
			@Pc(23) Class21 local23 = arg1.method2445();
			local23.method3711(super.anInt6984, super.anInt6981, super.anInt6988);
			return local18.method4931(arg0, arg2, local23, false);
		}
	}

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "(I)I")
	@Override
	public int method6024() {
		return this.aClass159_7 == null ? 0 : this.aClass159_7.method4941();
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILclient!oj;B)Lclient!qh;")
	@Override
	public Class159 method6029(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1) {
		return this.method6036(arg0, arg1);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)I")
	@Override
	public int method6027() {
		return this.aByte76;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILclient!oj;I)Lclient!qh;")
	private Class159 method6036(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1) {
		if (this.aClass159_7 != null && arg1.method2448(this.aClass159_7.method4951(), arg0) == 0) {
			return this.aClass159_7;
		} else {
			@Pc(31) Class187 local31 = this.method6037(arg1, false, arg0);
			return local31 == null ? null : local31.aClass159_5;
		}
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6023(@OriginalArg(1) Class48 arg0) {
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZLclient!oj;ZI)Lclient!pr;")
	private Class187 method6037(@OriginalArg(1) Class48 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class47 local13 = Static230.aClass96_4.method2303(this.aShort98 & 0xFFFF);
		@Pc(21) Class149 local21;
		@Pc(25) Class149 local25;
		if (this.aBoolean495) {
			local21 = Static248.aClass149Array3[this.aByte75];
			local25 = Static210.aClass149Array5[0];
		} else {
			if (this.aByte75 >= 3) {
				local25 = null;
			} else {
				local25 = Static210.aClass149Array5[this.aByte75 + 1];
			}
			local21 = Static210.aClass149Array5[this.aByte75];
		}
		return local13.method896(local21, local25, this.aByte76, arg1, this.aByte77, super.anInt6984, super.anInt6981, super.anInt6988, arg0, arg2);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6028(@OriginalArg(1) Class48 arg0) {
		@Pc(32) Class2_Sub7_Sub11 local32;
		if (this.aClass2_Sub7_Sub11_6 == null && this.aBoolean493) {
			@Pc(25) Class187 local25 = this.method6037(arg0, true, 131072);
			local32 = local25 == null ? null : local25.aClass2_Sub7_Sub11_4;
		} else {
			local32 = this.aClass2_Sub7_Sub11_6;
			this.aClass2_Sub7_Sub11_6 = null;
		}
		if (local32 != null) {
			Static78.method1356(local32, this.aByte75, super.anInt6984, super.anInt6988, null);
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6033() {
		return this.aBoolean493;
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(ILclient!oj;)Lclient!mg;")
	@Override
	public Class7_Sub5 method6013(@OriginalArg(1) Class48 arg0) {
		if (this.aClass159_7 == null) {
			return null;
		}
		@Pc(17) Class21 local17 = arg0.method2445();
		local17.method3711(super.anInt6984 + super.anInt6983, super.anInt6981, super.anInt6988 + super.anInt6987);
		@Pc(34) Class7_Sub5 local34 = null;
		if (this.aBoolean494) {
			local34 = Static234.method4211(1);
		}
		this.aClass159_7.method4952(local17, local34 == null ? null : local34.aClass7_Sub6Array1[0], 0);
		return local34;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6032(@OriginalArg(1) Class48 arg0) {
		@Pc(22) Class2_Sub7_Sub11 local22;
		if (this.aClass2_Sub7_Sub11_6 == null && this.aBoolean493) {
			@Pc(33) Class187 local33 = this.method6037(arg0, true, 131072);
			local22 = local33 == null ? null : local33.aClass2_Sub7_Sub11_4;
		} else {
			local22 = this.aClass2_Sub7_Sub11_6;
			this.aClass2_Sub7_Sub11_6 = null;
		}
		if (local22 != null) {
			Static169.method5042(local22, this.aByte75, super.anInt6984, super.anInt6988, null);
		}
	}
}

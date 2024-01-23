import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class41 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!gf", name = "t", descriptor = "[I")
	private int[] anIntArray111;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
	public int anInt1335 = -1;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "Z")
	public boolean aBoolean66 = false;

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "[I")
	private int[] anIntArray110 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)Lclient!ib;")
	public Class20_Sub4 method1021() {
		if (this.anIntArray111 == null) {
			return null;
		}
		@Pc(15) Class20_Sub4[] local15 = new Class20_Sub4[this.anIntArray111.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray111.length; local17++) {
			local15[local17] = Static89.method1399(Static228.aClass86_84, this.anIntArray111[local17]);
		}
		@Pc(46) Class20_Sub4 local46;
		if (local15.length == 1) {
			local46 = local15[0];
		} else {
			local46 = new Class20_Sub4(local15, local15.length);
		}
		@Pc(57) int local57;
		if (this.aShortArray10 != null) {
			for (local57 = 0; local57 < this.aShortArray10.length; local57++) {
				local46.method1406(this.aShortArray10[local57], this.aShortArray12[local57]);
			}
		}
		if (this.aShortArray13 != null) {
			for (local57 = 0; local57 < this.aShortArray13.length; local57++) {
				local46.method1398(this.aShortArray13[local57], this.aShortArray11[local57]);
			}
		}
		return local46;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!pg;II)V")
	private void method1022(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1335 = arg0.method2142();
			return;
		}
		@Pc(30) int local30;
		@Pc(40) int local40;
		if (arg1 == 2) {
			local30 = arg0.method2142();
			this.anIntArray111 = new int[local30];
			for (local40 = 0; local40 < local30; local40++) {
				this.anIntArray111[local40] = arg0.method2178();
			}
		} else if (arg1 == 3) {
			this.aBoolean66 = true;
		} else if (arg1 == 40) {
			local30 = arg0.method2142();
			this.aShortArray12 = new short[local30];
			this.aShortArray10 = new short[local30];
			for (local40 = 0; local40 < local30; local40++) {
				this.aShortArray10[local40] = (short) arg0.method2178();
				this.aShortArray12[local40] = (short) arg0.method2178();
			}
		} else if (arg1 == 41) {
			local30 = arg0.method2142();
			this.aShortArray13 = new short[local30];
			this.aShortArray11 = new short[local30];
			for (local40 = 0; local40 < local30; local40++) {
				this.aShortArray13[local40] = (short) arg0.method2178();
				this.aShortArray11[local40] = (short) arg0.method2178();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray110[arg1 - 60] = arg0.method2178();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLclient!pg;)V")
	public void method1023(@OriginalArg(1) Class1_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2142();
			if (local5 == 0) {
				return;
			}
			this.method1022(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)Z")
	public boolean method1024() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray110[local9] != -1 && !Static228.aClass86_84.method3329(0, this.anIntArray110[local9])) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)Lclient!ib;")
	public Class20_Sub4 method1026() {
		@Pc(4) Class20_Sub4[] local4 = new Class20_Sub4[5];
		@Pc(6) int local6 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray110[local12] != -1) {
				local4[local6++] = Static89.method1399(Static228.aClass86_84, this.anIntArray110[local12]);
			}
		}
		@Pc(46) Class20_Sub4 local46 = new Class20_Sub4(local4, local6);
		@Pc(51) int local51;
		if (this.aShortArray10 != null) {
			for (local51 = 0; local51 < this.aShortArray10.length; local51++) {
				local46.method1406(this.aShortArray10[local51], this.aShortArray12[local51]);
			}
		}
		if (this.aShortArray13 != null) {
			for (local51 = 0; local51 < this.aShortArray13.length; local51++) {
				local46.method1398(this.aShortArray13[local51], this.aShortArray11[local51]);
			}
		}
		return local46;
	}

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)Z")
	public boolean method1028() {
		if (this.anIntArray111 == null) {
			return true;
		}
		@Pc(20) boolean local20 = true;
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray111.length; local22++) {
			if (!Static228.aClass86_84.method3329(0, this.anIntArray111[local22])) {
				local20 = false;
			}
		}
		return local20;
	}
}

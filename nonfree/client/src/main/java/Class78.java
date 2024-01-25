import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class78 {

	@OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
	public int anInt1969;

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "Lclient!ku;")
	private final Class139 aClass139_19 = new Class139(64);

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "Lclient!ku;")
	public final Class139 aClass139_20 = new Class139(50);

	@OriginalMember(owner = "client!fd", name = "z", descriptor = "Lclient!oo;")
	public final Class178 aClass178_1 = new Class178(250);

	@OriginalMember(owner = "client!fd", name = "A", descriptor = "Lclient!et;")
	private final Class73 aClass73_1 = new Class73();

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
	public final int anInt1959;

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "Lclient!b;")
	public final Class20 aClass20_23;

	@OriginalMember(owner = "client!fd", name = "F", descriptor = "Lclient!pp;")
	private final Class187 aClass187_1;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Z")
	private boolean aBoolean148;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "Lclient!b;")
	private final Class20 aClass20_22;

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
	public final int anInt1957;

	@OriginalMember(owner = "client!fd", name = "D", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray16;

	@OriginalMember(owner = "client!fd", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray15;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!ea;IZLclient!pp;Lclient!b;Lclient!b;)V")
	public Class78(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class187 arg3, @OriginalArg(4) Class20 arg4, @OriginalArg(5) Class20 arg5) {
		this.anInt1959 = arg1;
		this.aClass20_23 = arg5;
		this.aClass187_1 = arg3;
		this.aBoolean148 = arg2;
		this.aClass20_22 = arg4;
		if (this.aClass20_22 == null) {
			this.anInt1957 = 0;
		} else {
			@Pc(49) int local49 = this.aClass20_22.method229() - 1;
			this.anInt1957 = this.aClass20_22.method231(local49) + local49 * 256;
		}
		this.aStringArray16 = new String[] { null, null, Static258.aClass57_70.method1122(this.anInt1959), null, null };
		this.aStringArray15 = new String[] { null, null, null, null, Static85.aClass57_32.method1122(this.anInt1959) };
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)Lclient!da;")
	public Class51 method1641(@OriginalArg(0) int arg0) {
		@Pc(8) Class139 local8 = this.aClass139_19;
		@Pc(18) Class51 local18;
		synchronized (this.aClass139_19) {
			local18 = (Class51) this.aClass139_19.method3076((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(39) byte[] local39 = this.aClass20_22.method253(Static13.method4662(arg0), Static157.method2411(arg0));
		local18 = new Class51();
		local18.aClass78_1 = this;
		local18.anInt1170 = arg0;
		local18.aStringArray5 = new String[] { null, null, Static258.aClass57_70.method1122(this.anInt1959), null, null };
		local18.aStringArray4 = new String[] { null, null, null, null, Static85.aClass57_32.method1122(this.anInt1959) };
		if (local39 != null) {
			local18.method1010(new Class3_Sub5(local39));
		}
		local18.method1018();
		if (local18.anInt1187 != -1) {
			local18.method1016(this.method1641(local18.anInt1192), this.method1641(local18.anInt1187));
		}
		if (local18.anInt1152 != -1) {
			local18.method1026(this.method1641(local18.anInt1152), this.method1641(local18.anInt1179));
		}
		if (!this.aBoolean148 && local18.aBoolean67) {
			local18.aString13 = Static27.aClass57_12.method1122(this.anInt1959);
			local18.aStringArray5 = this.aStringArray16;
			local18.aStringArray4 = this.aStringArray15;
			local18.anInt1180 = 0;
			local18.aBoolean66 = false;
			local18.anIntArray103 = null;
			if (local18.aClass44_11 != null) {
				@Pc(187) boolean local187 = false;
				for (@Pc(192) Class3 local192 = local18.aClass44_11.method950(); local192 != null; local192 = local18.aClass44_11.method949()) {
					@Pc(202) Class104 local202 = this.aClass187_1.method4279((int) local192.aLong240);
					if (local202.aBoolean201) {
						local192.method5700();
					} else {
						local187 = true;
					}
				}
				if (!local187) {
					local18.aClass44_11 = null;
				}
			}
		}
		@Pc(227) Class139 local227 = this.aClass139_19;
		synchronized (this.aClass139_19) {
			this.aClass139_19.method3070(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
	public void method1642(@OriginalArg(0) int arg0) {
		this.anInt1969 = arg0;
		@Pc(9) Class139 local9 = this.aClass139_20;
		synchronized (this.aClass139_20) {
			this.aClass139_20.method3075();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BZ)V")
	public void method1643(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean148 != arg0) {
			this.aBoolean148 = arg0;
			this.method1649();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
	public void method1645() {
		@Pc(6) Class178 local6 = this.aClass178_1;
		synchronized (this.aClass178_1) {
			this.aClass178_1.method4131();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!np;IIBLclient!cu;III)Lclient!tr;")
	public Class110 method1646(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class49 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass73_1.anInt1903 = arg4;
		this.aClass73_1.aBoolean145 = arg3 != null;
		this.aClass73_1.anInt1905 = arg5;
		this.aClass73_1.anInt1909 = arg0.anInt5461;
		this.aClass73_1.anInt1908 = arg6;
		this.aClass73_1.anInt1915 = arg1;
		this.aClass73_1.anInt1904 = arg2;
		return (Class110) this.aClass178_1.method4139(this.aClass73_1);
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)V")
	public void method1647() {
		@Pc(2) Class139 local2 = this.aClass139_19;
		synchronized (this.aClass139_19) {
			this.aClass139_19.method3083(5);
		}
		local2 = this.aClass139_20;
		synchronized (this.aClass139_20) {
			this.aClass139_20.method3083(5);
		}
		@Pc(45) Class178 local45 = this.aClass178_1;
		synchronized (this.aClass178_1) {
			this.aClass178_1.method4136();
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)V")
	public void method1648() {
		@Pc(2) Class139 local2 = this.aClass139_19;
		synchronized (this.aClass139_19) {
			this.aClass139_19.method3072();
		}
		local2 = this.aClass139_20;
		synchronized (this.aClass139_20) {
			this.aClass139_20.method3072();
		}
		@Pc(36) Class178 local36 = this.aClass178_1;
		synchronized (this.aClass178_1) {
			this.aClass178_1.method4137();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public void method1649() {
		@Pc(2) Class139 local2 = this.aClass139_19;
		synchronized (this.aClass139_19) {
			this.aClass139_19.method3075();
		}
		local2 = this.aClass139_20;
		synchronized (this.aClass139_20) {
			this.aClass139_20.method3075();
		}
		@Pc(36) Class178 local36 = this.aClass178_1;
		synchronized (this.aClass178_1) {
			this.aClass178_1.method4131();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILclient!np;ZLclient!cu;IIILclient!oh;IZLclient!np;)Lclient!tr;")
	public Class110 method1650(@OriginalArg(0) int arg0, @OriginalArg(2) Class155 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class49 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class150 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) Class155 arg10) {
		@Pc(16) Class110 local16 = this.method1646(arg10, arg4, arg0, arg3, arg5, arg8, arg6);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class51 local25 = this.method1641(arg6);
		if (arg4 > 1 && local25.anIntArray105 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (local25.anIntArray104[local35] <= arg4 && local25.anIntArray104[local35] != 0) {
					local33 = local25.anIntArray105[local35];
				}
			}
			if (local33 != -1) {
				local25 = this.method1641(local33);
			}
		}
		@Pc(78) int[] local78 = local25.method1020(arg10, arg0, arg8, arg7, arg3, arg1, arg4, arg5, arg2);
		if (local78 == null) {
			return null;
		}
		@Pc(97) Class110 local97;
		if (arg9) {
			local97 = arg1.method4871(local78, 36, 36, 32);
		} else {
			local97 = arg10.method4871(local78, 36, 36, 32);
		}
		if (!arg9) {
			@Pc(113) Class73 local113 = new Class73();
			local113.anInt1915 = arg4;
			local113.anInt1905 = arg8;
			local113.anInt1904 = arg0;
			local113.anInt1903 = arg5;
			local113.anInt1909 = arg10.anInt5461;
			local113.aBoolean145 = arg3 != null;
			local113.anInt1908 = arg6;
			this.aClass178_1.method4141(local97, local113);
		}
		return local97;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(Z)V")
	public void method1651() {
		@Pc(6) Class139 local6 = this.aClass139_20;
		synchronized (this.aClass139_20) {
			this.aClass139_20.method3075();
		}
	}
}

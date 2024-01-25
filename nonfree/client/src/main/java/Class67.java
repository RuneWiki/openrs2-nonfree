import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class67 {

	@OriginalMember(owner = "client!ep", name = "z", descriptor = "I")
	public int anInt1779;

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "Lclient!d;")
	private final Class44 aClass44_18 = new Class44(64);

	@OriginalMember(owner = "client!ep", name = "v", descriptor = "Lclient!d;")
	public final Class44 aClass44_19 = new Class44(50);

	@OriginalMember(owner = "client!ep", name = "x", descriptor = "Lclient!co;")
	public final Class36 aClass36_1 = new Class36(250);

	@OriginalMember(owner = "client!ep", name = "y", descriptor = "Lclient!uk;")
	private final Class242 aClass242_1 = new Class242();

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "Lclient!um;")
	private final Class243 aClass243_60;

	@OriginalMember(owner = "client!ep", name = "C", descriptor = "Lclient!cg;")
	private final Class33 aClass33_2;

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "Lclient!um;")
	public final Class243 aClass243_59;

	@OriginalMember(owner = "client!ep", name = "p", descriptor = "Z")
	private boolean aBoolean122;

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
	public final int anInt1770;

	@OriginalMember(owner = "client!ep", name = "s", descriptor = "I")
	public final int anInt1775;

	@OriginalMember(owner = "client!ep", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray13;

	@OriginalMember(owner = "client!ep", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray12;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!pt;IZLclient!cg;Lclient!um;Lclient!um;)V")
	public Class67(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class33 arg3, @OriginalArg(4) Class243 arg4, @OriginalArg(5) Class243 arg5) {
		this.aClass243_60 = arg4;
		this.aClass33_2 = arg3;
		this.aClass243_59 = arg5;
		this.aBoolean122 = arg2;
		this.anInt1770 = arg1;
		if (this.aClass243_60 == null) {
			this.anInt1775 = 0;
		} else {
			@Pc(49) int local49 = this.aClass243_60.method5478() - 1;
			this.anInt1775 = local49 * 256 + this.aClass243_60.method5472(local49);
		}
		this.aStringArray13 = new String[] { null, null, Static402.aClass198_111.method4012(this.anInt1770), null, null };
		this.aStringArray12 = new String[] { null, null, null, null, Static2.aClass198_128.method4012(this.anInt1770) };
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZI)V")
	public void method1445(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean122 != arg0) {
			this.aBoolean122 = arg0;
			this.method1447();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIILclient!wq;BLclient!za;II)Lclient!o;")
	public Class49 method1446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class270 arg3, @OriginalArg(5) Class200 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass242_1.aBoolean461 = arg3 != null;
		this.aClass242_1.anInt6875 = arg2;
		this.aClass242_1.anInt6879 = arg4.anInt7330;
		this.aClass242_1.anInt6876 = arg0;
		this.aClass242_1.anInt6880 = arg6;
		this.aClass242_1.anInt6874 = arg1;
		this.aClass242_1.anInt6869 = arg5;
		return (Class49) this.aClass36_1.method947(this.aClass242_1);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V")
	public void method1447() {
		@Pc(8) Class44 local8 = this.aClass44_18;
		synchronized (this.aClass44_18) {
			this.aClass44_18.method1031();
		}
		local8 = this.aClass44_19;
		synchronized (this.aClass44_19) {
			this.aClass44_19.method1031();
		}
		@Pc(42) Class36 local42 = this.aClass36_1;
		synchronized (this.aClass36_1) {
			this.aClass36_1.method945();
		}
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)V")
	public void method1448() {
		@Pc(12) Class36 local12 = this.aClass36_1;
		synchronized (this.aClass36_1) {
			this.aClass36_1.method945();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)V")
	public void method1449() {
		@Pc(6) Class44 local6 = this.aClass44_18;
		synchronized (this.aClass44_18) {
			this.aClass44_18.method1025(5);
		}
		local6 = this.aClass44_19;
		synchronized (this.aClass44_19) {
			this.aClass44_19.method1025(5);
		}
		@Pc(44) Class36 local44 = this.aClass36_1;
		synchronized (this.aClass36_1) {
			this.aClass36_1.method942();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!za;ILclient!za;ZIZILclient!wq;ILclient!la;I)Lclient!o;")
	public Class49 method1451(@OriginalArg(0) int arg0, @OriginalArg(1) Class200 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class200 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) Class270 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class23 arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class49 local16 = this.method1446(arg5, arg0, arg8, arg7, arg3, arg10, arg2);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class40 local25 = this.method1452(arg5);
		if (arg8 > 1 && local25.anIntArray52 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (arg8 >= local25.anIntArray51[local35] && local25.anIntArray51[local35] != 0) {
					local33 = local25.anIntArray52[local35];
				}
			}
			if (local33 != -1) {
				local25 = this.method1452(local33);
			}
		}
		@Pc(86) int[] local86 = local25.method986(arg9, arg2, arg1, arg0, arg4, arg8, arg7, arg10, arg3);
		if (local86 == null) {
			return null;
		}
		@Pc(108) Class49 local108;
		if (arg6) {
			local108 = arg1.method5849(local86, 36, 36, 32);
		} else {
			local108 = arg3.method5849(local86, 36, 36, 32);
		}
		if (!arg6) {
			@Pc(124) Class242 local124 = new Class242();
			local124.anInt6874 = arg0;
			local124.anInt6879 = arg3.anInt7330;
			local124.anInt6880 = arg2;
			local124.aBoolean461 = arg7 != null;
			local124.anInt6869 = arg10;
			local124.anInt6875 = arg8;
			local124.anInt6876 = arg5;
			this.aClass36_1.method948(local108, local124);
		}
		return local108;
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(II)Lclient!cs;")
	public Class40 method1452(@OriginalArg(0) int arg0) {
		@Pc(14) Class44 local14 = this.aClass44_18;
		@Pc(24) Class40 local24;
		synchronized (this.aClass44_18) {
			local24 = (Class40) this.aClass44_18.method1028((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class243 local37 = this.aClass243_60;
		@Pc(50) byte[] local50;
		synchronized (this.aClass243_60) {
			local50 = this.aClass243_60.method5455(Static328.method6020(arg0), Static369.method4832(arg0));
		}
		local24 = new Class40();
		local24.anInt1153 = arg0;
		local24.aClass67_1 = this;
		local24.aStringArray5 = new String[] { null, null, Static402.aClass198_111.method4012(this.anInt1770), null, null };
		local24.aStringArray6 = new String[] { null, null, null, null, Static2.aClass198_128.method4012(this.anInt1770) };
		if (local50 != null) {
			local24.method978(new Class5_Sub15(local50));
		}
		local24.method981();
		if (local24.anInt1190 != -1) {
			local24.method976(this.method1452(local24.anInt1140), this.method1452(local24.anInt1190));
		}
		if (local24.anInt1175 != -1) {
			local24.method979(this.method1452(local24.anInt1175), this.method1452(local24.anInt1159));
		}
		if (!this.aBoolean122 && local24.aBoolean94) {
			local24.aString5 = Static425.aClass198_116.method4012(this.anInt1770);
			local24.aStringArray5 = this.aStringArray13;
			local24.anIntArray50 = null;
			local24.aBoolean93 = false;
			local24.anInt1143 = 0;
			local24.aStringArray6 = this.aStringArray12;
			if (local24.aClass252_7 != null) {
				@Pc(205) boolean local205 = false;
				for (@Pc(210) Class5 local210 = local24.aClass252_7.method5660(); local210 != null; local210 = local24.aClass252_7.method5666()) {
					@Pc(220) Class166 local220 = this.aClass33_2.method788((int) local210.aLong234);
					if (local220.aBoolean281) {
						local210.method6003();
					} else {
						local205 = true;
					}
				}
				if (!local205) {
					local24.aClass252_7 = null;
				}
			}
		}
		@Pc(245) Class44 local245 = this.aClass44_18;
		synchronized (this.aClass44_18) {
			this.aClass44_18.method1017((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
	public void method1453() {
		@Pc(6) Class44 local6 = this.aClass44_18;
		synchronized (this.aClass44_18) {
			this.aClass44_18.method1024();
		}
		local6 = this.aClass44_19;
		synchronized (this.aClass44_19) {
			this.aClass44_19.method1024();
		}
		@Pc(36) Class36 local36 = this.aClass36_1;
		synchronized (this.aClass36_1) {
			this.aClass36_1.method940();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IB)V")
	public void method1454(@OriginalArg(0) int arg0) {
		this.anInt1779 = arg0;
		@Pc(9) Class44 local9 = this.aClass44_19;
		synchronized (this.aClass44_19) {
			this.aClass44_19.method1031();
		}
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)V")
	public void method1456() {
		@Pc(2) Class44 local2 = this.aClass44_19;
		synchronized (this.aClass44_19) {
			this.aClass44_19.method1031();
		}
	}
}

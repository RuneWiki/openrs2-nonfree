import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class316 {

	@OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
	public int anInt9410;

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "Lclient!sw;")
	private final Class277 aClass277_68 = new Class277(64);

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "Lclient!sw;")
	public final Class277 aClass277_69 = new Class277(50);

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "Lclient!eb;")
	public final Class78 aClass78_1 = new Class78(250);

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "Lclient!vda;")
	private final Class301 aClass301_1 = new Class301();

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "Lclient!si;")
	private final Class266 aClass266_2;

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "Lclient!dn;")
	private final Class69 aClass69_98;

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "Z")
	private boolean aBoolean703;

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "Lclient!dn;")
	public final Class69 aClass69_99;

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
	public final int anInt9406;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
	public final int anInt9398;

	@OriginalMember(owner = "client!wg", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray42;

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray43;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!re;IZLclient!si;Lclient!dn;Lclient!dn;)V")
	public Class316(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class266 arg3, @OriginalArg(4) Class69 arg4, @OriginalArg(5) Class69 arg5) {
		this.aClass266_2 = arg3;
		this.aClass69_98 = arg4;
		this.aBoolean703 = arg2;
		this.aClass69_99 = arg5;
		this.anInt9406 = arg1;
		if (this.aClass69_98 == null) {
			this.anInt9398 = 0;
		} else {
			@Pc(54) int local54 = this.aClass69_98.method1895() - 1;
			this.anInt9398 = local54 * 256 + this.aClass69_98.method1884(local54);
		}
		this.aStringArray42 = new String[] { null, null, Static190.aClass45_58.method1474(this.anInt9406), null, null };
		this.aStringArray43 = new String[] { null, null, null, null, Static531.aClass45_136.method1474(this.anInt9406) };
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public void method8099() {
		@Pc(2) Class277 local2 = this.aClass277_68;
		synchronized (this.aClass277_68) {
			this.aClass277_68.method7026();
		}
		local2 = this.aClass277_69;
		synchronized (this.aClass277_69) {
			this.aClass277_69.method7026();
		}
		@Pc(45) Class78 local45 = this.aClass78_1;
		synchronized (this.aClass78_1) {
			this.aClass78_1.method2024();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V")
	public void method8100(@OriginalArg(1) int arg0) {
		this.anInt9410 = arg0;
		@Pc(23) Class277 local23 = this.aClass277_69;
		synchronized (this.aClass277_69) {
			this.aClass277_69.method7019();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILclient!qa;ZIIILclient!pf;)Lclient!ha;")
	public Class104 method8103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class225 arg6) {
		this.aClass301_1.anInt8893 = arg2.anInt8106;
		this.aClass301_1.anInt8895 = arg3;
		this.aClass301_1.anInt8890 = arg4;
		this.aClass301_1.anInt8892 = arg0;
		this.aClass301_1.anInt8888 = arg5;
		this.aClass301_1.anInt8894 = arg1;
		this.aClass301_1.aBoolean671 = arg6 != null;
		return (Class104) this.aClass78_1.method2025(this.aClass301_1);
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)V")
	public void method8104() {
		@Pc(6) Class277 local6 = this.aClass277_68;
		synchronized (this.aClass277_68) {
			this.aClass277_68.method7018(5);
		}
		local6 = this.aClass277_69;
		synchronized (this.aClass277_69) {
			this.aClass277_69.method7018(5);
		}
		@Pc(44) Class78 local44 = this.aClass78_1;
		synchronized (this.aClass78_1) {
			this.aClass78_1.method2020();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
	public void method8105() {
		@Pc(6) Class78 local6 = this.aClass78_1;
		synchronized (this.aClass78_1) {
			this.aClass78_1.method2019();
		}
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
	public void method8106() {
		@Pc(6) Class277 local6 = this.aClass277_68;
		synchronized (this.aClass277_68) {
			this.aClass277_68.method7019();
		}
		local6 = this.aClass277_69;
		synchronized (this.aClass277_69) {
			this.aClass277_69.method7019();
		}
		@Pc(36) Class78 local36 = this.aClass78_1;
		synchronized (this.aClass78_1) {
			this.aClass78_1.method2019();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)Lclient!lu;")
	public Class180 method8107(@OriginalArg(1) int arg0) {
		@Pc(8) Class277 local8 = this.aClass277_68;
		@Pc(18) Class180 local18;
		synchronized (this.aClass277_68) {
			local18 = (Class180) this.aClass277_68.method7014((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class69 local31 = this.aClass69_98;
		@Pc(44) byte[] local44;
		synchronized (this.aClass69_98) {
			local44 = this.aClass69_98.method1888(Static522.method7945(arg0), Static347.method5758(arg0));
		}
		local18 = new Class180();
		local18.aClass316_2 = this;
		local18.anInt5440 = arg0;
		local18.aStringArray26 = new String[] { null, null, Static190.aClass45_58.method1474(this.anInt9406), null, null };
		local18.aStringArray27 = new String[] { null, null, null, null, Static531.aClass45_136.method1474(this.anInt9406) };
		if (local44 != null) {
			local18.method4984(new Class1_Sub17(local44));
		}
		local18.method4979();
		if (local18.anInt5450 != -1) {
			local18.method4974(this.method8107(local18.anInt5401), this.method8107(local18.anInt5450));
		}
		if (local18.anInt5397 != -1) {
			local18.method4968(this.method8107(local18.anInt5397), this.method8107(local18.anInt5408));
		}
		if (!this.aBoolean703 && local18.aBoolean410) {
			local18.aString121 = Static320.aClass45_93.method1474(this.anInt9406);
			local18.aBoolean409 = false;
			local18.anIntArray443 = null;
			local18.anInt5413 = 0;
			local18.aStringArray26 = this.aStringArray42;
			local18.aStringArray27 = this.aStringArray43;
			if (local18.aClass230_33 != null) {
				@Pc(205) boolean local205 = false;
				for (@Pc(210) Class1 local210 = local18.aClass230_33.method6137(); local210 != null; local210 = local18.aClass230_33.method6140()) {
					@Pc(220) Class53 local220 = this.aClass266_2.method6930((int) local210.aLong251);
					if (local220.aBoolean143) {
						local210.method8239();
					} else {
						local205 = true;
					}
				}
				if (!local205) {
					local18.aClass230_33 = null;
				}
			}
		}
		@Pc(245) Class277 local245 = this.aClass277_68;
		synchronized (this.aClass277_68) {
			this.aClass277_68.method7016(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)V")
	public void method8108(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean703) {
			this.aBoolean703 = arg0;
			this.method8106();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZBLclient!qa;Lclient!qa;ILclient!ra;ZIIILclient!pf;I)Lclient!ha;")
	public Class104 method8109(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class36 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class225 arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class104 local16 = this.method8103(arg6, arg8, arg1, arg3, arg7, arg10, arg9);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class180 local25 = this.method8107(arg8);
		if (arg6 > 1 && local25.anIntArray442 != null) {
			@Pc(35) int local35 = -1;
			for (@Pc(37) int local37 = 0; local37 < 10; local37++) {
				if (local25.anIntArray444[local37] <= arg6 && local25.anIntArray444[local37] != 0) {
					local35 = local25.anIntArray442[local37];
				}
			}
			if (local35 != -1) {
				local25 = this.method8107(local35);
			}
		}
		@Pc(93) int[] local93 = local25.method4977(arg2, arg6, arg1, arg5, arg9, arg4, arg7, arg3, arg10);
		if (local93 == null) {
			return null;
		}
		@Pc(107) Class104 local107;
		if (arg0) {
			local107 = arg2.method7156(local93, 36, 36, 32);
		} else {
			local107 = arg1.method7156(local93, 36, 36, 32);
		}
		if (!arg0) {
			@Pc(123) Class301 local123 = new Class301();
			local123.anInt8893 = arg1.anInt8106;
			local123.anInt8892 = arg6;
			local123.anInt8888 = arg10;
			local123.anInt8894 = arg8;
			local123.anInt8890 = arg7;
			local123.anInt8895 = arg3;
			local123.aBoolean671 = arg9 != null;
			this.aClass78_1.method2021(local107, local123);
		}
		return local107;
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
	public void method8110() {
		@Pc(2) Class277 local2 = this.aClass277_69;
		synchronized (this.aClass277_69) {
			this.aClass277_69.method7019();
		}
	}
}

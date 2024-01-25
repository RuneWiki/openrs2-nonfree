import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class312 {

	@OriginalMember(owner = "client!qk", name = "r", descriptor = "Lclient!sw;")
	public Class346 aClass346_2;

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
	public int anInt8304 = 0;

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
	private int anInt8298 = -1;

	@OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
	public int anInt8292 = 0;

	@OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
	public int anInt8303 = 0;

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
	public int anInt8295 = -1;

	@OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
	private int anInt8297 = -1;

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
	public int anInt8302 = 16777215;

	@OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
	public int anInt8294 = -1;

	@OriginalMember(owner = "client!qk", name = "s", descriptor = "Ljava/lang/String;")
	private String aString92 = "";

	@OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
	private int anInt8308 = -1;

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
	public int anInt8311 = -1;

	@OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
	public int anInt8296 = 70;

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
	private int anInt8312 = -1;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLclient!ha;)V")
	private void method7373(@OriginalArg(1) Class145 arg0) {
		@Pc(17) Class254 local17 = this.aClass346_2.aClass254_148;
		@Pc(49) Class355 local49;
		if (this.anInt8308 >= 0 && this.aClass346_2.aClass85_60.method1737((long) this.anInt8308) == null && local17.method6072(this.anInt8308)) {
			local49 = Static737.method8359(local17, this.anInt8308);
			this.aClass346_2.aClass85_60.method1745((long) this.anInt8308, 16383, arg0.method9683(local49, true));
		}
		if (this.anInt8312 >= 0 && this.aClass346_2.aClass85_60.method1737((long) this.anInt8312) == null && local17.method6072(this.anInt8312)) {
			local49 = Static737.method8359(local17, this.anInt8312);
			this.aClass346_2.aClass85_60.method1745((long) this.anInt8312, 16383, arg0.method9683(local49, true));
		}
		if (this.anInt8297 >= 0 && this.aClass346_2.aClass85_60.method1737((long) this.anInt8297) == null && local17.method6072(this.anInt8297)) {
			local49 = Static737.method8359(local17, this.anInt8297);
			this.aClass346_2.aClass85_60.method1745((long) this.anInt8297, 16383, arg0.method9683(local49, true));
		}
		if (this.anInt8298 >= 0 && this.aClass346_2.aClass85_60.method1737((long) this.anInt8298) == null && local17.method6072(this.anInt8298)) {
			local49 = Static737.method8359(local17, this.anInt8298);
			this.aClass346_2.aClass85_60.method1745((long) this.anInt8298, 16383, arg0.method9683(local49, true));
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!et;)V")
	public void method7375(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8581(-17416);
			if (local9 == 0) {
				return;
			}
			this.method7376(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!et;I)V")
	private void method7376(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt8295 = arg1.method8575();
		} else if (arg0 == 2) {
			this.anInt8302 = arg1.method8583();
		} else if (arg0 == 3) {
			this.anInt8308 = arg1.method8575();
		} else if (arg0 == 4) {
			this.anInt8297 = arg1.method8575();
		} else if (arg0 == 5) {
			this.anInt8312 = arg1.method8575();
		} else if (arg0 == 6) {
			this.anInt8298 = arg1.method8575();
		} else if (arg0 == 7) {
			this.anInt8304 = arg1.method8598();
		} else if (arg0 == 8) {
			this.aString92 = arg1.method8537();
		} else if (arg0 == 9) {
			this.anInt8296 = arg1.method8575();
		} else if (arg0 == 10) {
			this.anInt8303 = arg1.method8598();
		} else if (arg0 == 11) {
			this.anInt8294 = 0;
		} else if (arg0 == 12) {
			this.anInt8311 = arg1.method8581(-17416);
		} else if (arg0 == 13) {
			this.anInt8292 = arg1.method8598();
			return;
		} else if (arg0 == 14) {
			this.anInt8294 = arg1.method8575();
			return;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!ha;Z)Lclient!ug;")
	public Class43 method7377(@OriginalArg(0) Class145 arg0) {
		if (this.anInt8312 < 0) {
			return null;
		}
		@Pc(25) Class43 local25 = (Class43) this.aClass346_2.aClass85_60.method1737((long) this.anInt8312);
		if (local25 == null) {
			this.method7373(arg0);
			local25 = (Class43) this.aClass346_2.aClass85_60.method1737((long) this.anInt8312);
		}
		return local25;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!ha;I)Lclient!ug;")
	public Class43 method7378(@OriginalArg(0) Class145 arg0) {
		if (this.anInt8298 < 0) {
			return null;
		}
		@Pc(24) Class43 local24 = (Class43) this.aClass346_2.aClass85_60.method1737((long) this.anInt8298);
		if (local24 == null) {
			this.method7373(arg0);
			local24 = (Class43) this.aClass346_2.aClass85_60.method1737((long) this.anInt8298);
		}
		return local24;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!ha;)Lclient!ug;")
	public Class43 method7379(@OriginalArg(1) Class145 arg0) {
		if (this.anInt8308 < 0) {
			return null;
		}
		@Pc(22) Class43 local22 = (Class43) this.aClass346_2.aClass85_60.method1737((long) this.anInt8308);
		if (local22 == null) {
			this.method7373(arg0);
			local22 = (Class43) this.aClass346_2.aClass85_60.method1737((long) this.anInt8308);
		}
		return local22;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(Lclient!ha;I)Lclient!ug;")
	public Class43 method7380(@OriginalArg(0) Class145 arg0) {
		if (this.anInt8297 < 0) {
			return null;
		}
		@Pc(34) Class43 local34 = (Class43) this.aClass346_2.aClass85_60.method1737((long) this.anInt8297);
		if (local34 == null) {
			this.method7373(arg0);
			local34 = (Class43) this.aClass346_2.aClass85_60.method1737((long) this.anInt8297);
		}
		return local34;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method7383(@OriginalArg(0) int arg0) {
		@Pc(14) String local14 = this.aString92;
		while (true) {
			@Pc(20) int local20 = local14.indexOf("%1");
			if (local20 < 0) {
				return local14;
			}
			local14 = local14.substring(0, local20) + Static251.method3564(false, arg0) + local14.substring(local20 + 2);
		}
	}
}

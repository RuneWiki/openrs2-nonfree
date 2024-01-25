import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class195 {

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Lclient!ut;")
	public Class356 aClass356_1;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Ljava/lang/String;")
	private String aString44 = "";

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
	public int anInt5150 = -1;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
	public int anInt5142 = 16777215;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
	private int anInt5155 = -1;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
	private int anInt5144 = -1;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
	public int anInt5151 = -1;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
	public int anInt5157 = 0;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
	private int anInt5148 = -1;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
	private int anInt5154 = -1;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
	public int anInt5160 = 0;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
	public int anInt5159 = 0;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
	public int anInt5161 = -1;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	public int anInt5162 = 70;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!ha;)Lclient!iea;")
	public Class31 method4514(@OriginalArg(1) Class13 arg0) {
		if (this.anInt5148 < 0) {
			return null;
		}
		@Pc(24) Class31 local24 = (Class31) this.aClass356_1.aClass69_66.method1919((long) this.anInt5148);
		if (local24 == null) {
			this.method4515(arg0);
			local24 = (Class31) this.aClass356_1.aClass69_66.method1919((long) this.anInt5148);
		}
		return local24;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ha;B)V")
	private void method4515(@OriginalArg(0) Class13 arg0) {
		@Pc(7) Class238 local7 = this.aClass356_1.aClass238_273;
		@Pc(33) Class139 local33;
		if (this.anInt5148 >= 0 && this.aClass356_1.aClass69_66.method1919((long) this.anInt5148) == null && local7.method5568(this.anInt5148)) {
			local33 = Static654.method3450(local7, this.anInt5148);
			this.aClass356_1.aClass69_66.method1917((long) this.anInt5148, arg0.method8141(local33, true));
		}
		if (this.anInt5144 >= 0 && this.aClass356_1.aClass69_66.method1919((long) this.anInt5144) == null && local7.method5568(this.anInt5144)) {
			local33 = Static654.method3450(local7, this.anInt5144);
			this.aClass356_1.aClass69_66.method1917((long) this.anInt5144, arg0.method8141(local33, true));
		}
		if (this.anInt5154 >= 0 && this.aClass356_1.aClass69_66.method1919((long) this.anInt5154) == null && local7.method5568(this.anInt5154)) {
			local33 = Static654.method3450(local7, this.anInt5154);
			this.aClass356_1.aClass69_66.method1917((long) this.anInt5154, arg0.method8141(local33, true));
		}
		if (this.anInt5155 >= 0 && this.aClass356_1.aClass69_66.method1919((long) this.anInt5155) == null && local7.method5568(this.anInt5155)) {
			local33 = Static654.method3450(local7, this.anInt5155);
			this.aClass356_1.aClass69_66.method1917((long) this.anInt5155, arg0.method8141(local33, true));
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ha;I)Lclient!iea;")
	public Class31 method4516(@OriginalArg(0) Class13 arg0) {
		if (this.anInt5144 < 0) {
			return null;
		}
		@Pc(23) Class31 local23 = (Class31) this.aClass356_1.aClass69_66.method1919((long) this.anInt5144);
		if (local23 == null) {
			this.method4515(arg0);
			local23 = (Class31) this.aClass356_1.aClass69_66.method1919((long) this.anInt5144);
		}
		return local23;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(ILclient!ha;)Lclient!iea;")
	public Class31 method4517(@OriginalArg(1) Class13 arg0) {
		if (this.anInt5154 < 0) {
			return null;
		}
		@Pc(27) Class31 local27 = (Class31) this.aClass356_1.aClass69_66.method1919((long) this.anInt5154);
		if (local27 == null) {
			this.method4515(arg0);
			local27 = (Class31) this.aClass356_1.aClass69_66.method1919((long) this.anInt5154);
		}
		return local27;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method4518(@OriginalArg(1) int arg0) {
		@Pc(14) String local14 = this.aString44;
		while (true) {
			@Pc(18) int local18 = local14.indexOf("%1");
			if (local18 < 0) {
				return local14;
			}
			local14 = local14.substring(0, local18) + Static317.method4873(arg0, false) + local14.substring(local18 + 2);
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(ILclient!ha;)Lclient!iea;")
	public Class31 method4519(@OriginalArg(1) Class13 arg0) {
		if (this.anInt5155 < 0) {
			return null;
		}
		@Pc(19) Class31 local19 = (Class31) this.aClass356_1.aClass69_66.method1919((long) this.anInt5155);
		if (local19 == null) {
			this.method4515(arg0);
			local19 = (Class31) this.aClass356_1.aClass69_66.method1919((long) this.anInt5155);
		}
		return local19;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!sl;)V")
	public void method4520(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(6) int local6 = arg0.method2859();
			if (local6 == 0) {
				return;
			}
			this.method4522(local6, arg0);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILclient!sl;)V")
	private void method4522(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt5161 = arg1.method2825();
		} else if (arg0 == 2) {
			this.anInt5142 = arg1.method2835();
		} else if (arg0 == 3) {
			this.anInt5148 = arg1.method2825();
		} else if (arg0 == 4) {
			this.anInt5154 = arg1.method2825();
		} else if (arg0 == 5) {
			this.anInt5144 = arg1.method2825();
		} else if (arg0 == 6) {
			this.anInt5155 = arg1.method2825();
		} else if (arg0 == 7) {
			this.anInt5157 = arg1.method2836();
		} else if (arg0 == 8) {
			this.aString44 = arg1.method2884();
		} else if (arg0 == 9) {
			this.anInt5162 = arg1.method2825();
		} else if (arg0 == 10) {
			this.anInt5160 = arg1.method2836();
		} else if (arg0 == 11) {
			this.anInt5150 = 0;
		} else if (arg0 == 12) {
			this.anInt5151 = arg1.method2859();
		} else if (arg0 == 13) {
			this.anInt5159 = arg1.method2836();
		} else if (arg0 == 14) {
			this.anInt5150 = arg1.method2825();
		}
	}
}

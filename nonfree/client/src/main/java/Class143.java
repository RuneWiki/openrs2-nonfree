import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class143 {

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "Lclient!sb;")
	public Class307 aClass307_1;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
	public int anInt5034 = -1;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
	private int anInt5037 = -1;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "Ljava/lang/String;")
	private String aString49 = "";

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
	public int anInt5032 = 0;

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
	private int anInt5040 = -1;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
	public int anInt5031 = 0;

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
	private int anInt5045 = -1;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
	public int anInt5038 = -1;

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
	public int anInt5041 = 70;

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
	public int anInt5042 = -1;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
	private int anInt5030 = -1;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
	public int anInt5029 = 0;

	@OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
	public int anInt5050 = 16777215;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!ha;Z)Lclient!mi;")
	public Class46 method4359(@OriginalArg(0) Class20 arg0) {
		if (this.anInt5037 < 0) {
			return null;
		}
		@Pc(23) Class46 local23 = (Class46) this.aClass307_1.aClass169_54.method5002((long) this.anInt5037);
		if (local23 == null) {
			this.method4365(arg0);
			local23 = (Class46) this.aClass307_1.aClass169_54.method5002((long) this.anInt5037);
		}
		return local23;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!ha;I)Lclient!mi;")
	public Class46 method4360(@OriginalArg(0) Class20 arg0) {
		if (this.anInt5045 < 0) {
			return null;
		}
		@Pc(18) Class46 local18 = (Class46) this.aClass307_1.aClass169_54.method5002((long) this.anInt5045);
		if (local18 == null) {
			this.method4365(arg0);
			local18 = (Class46) this.aClass307_1.aClass169_54.method5002((long) this.anInt5045);
		}
		return local18;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!ha;B)Lclient!mi;")
	public Class46 method4362(@OriginalArg(0) Class20 arg0) {
		if (this.anInt5030 < 0) {
			return null;
		}
		@Pc(18) Class46 local18 = (Class46) this.aClass307_1.aClass169_54.method5002((long) this.anInt5030);
		if (local18 == null) {
			this.method4365(arg0);
			local18 = (Class46) this.aClass307_1.aClass169_54.method5002((long) this.anInt5030);
		}
		return local18;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!cea;II)V")
	private void method4364(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5042 = arg0.method8326();
		} else if (arg1 == 2) {
			this.anInt5050 = arg0.method8347();
		} else if (arg1 == 3) {
			this.anInt5030 = arg0.method8326();
		} else if (arg1 == 4) {
			this.anInt5037 = arg0.method8326();
		} else if (arg1 == 5) {
			this.anInt5040 = arg0.method8326();
		} else if (arg1 == 6) {
			this.anInt5045 = arg0.method8326();
		} else if (arg1 == 7) {
			this.anInt5032 = arg0.method8368();
		} else if (arg1 == 8) {
			this.aString49 = arg0.method8367();
		} else if (arg1 == 9) {
			this.anInt5041 = arg0.method8326();
		} else if (arg1 == 10) {
			this.anInt5031 = arg0.method8368();
		} else if (arg1 == 11) {
			this.anInt5034 = 0;
		} else if (arg1 == 12) {
			this.anInt5038 = arg0.method8383();
		} else if (arg1 == 13) {
			this.anInt5029 = arg0.method8368();
		} else if (arg1 == 14) {
			this.anInt5034 = arg0.method8326();
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(Lclient!ha;I)V")
	private void method4365(@OriginalArg(0) Class20 arg0) {
		@Pc(7) Class157 local7 = this.aClass307_1.aClass157_249;
		@Pc(30) Class296 local30;
		if (this.anInt5030 >= 0 && this.aClass307_1.aClass169_54.method5002((long) this.anInt5030) == null && local7.method4575(this.anInt5030)) {
			local30 = Static652.method7574(local7, this.anInt5030);
			this.aClass307_1.aClass169_54.method5001(arg0.method7294(local30, true), (long) this.anInt5030);
		}
		if (this.anInt5040 >= 0 && this.aClass307_1.aClass169_54.method5002((long) this.anInt5040) == null && local7.method4575(this.anInt5040)) {
			local30 = Static652.method7574(local7, this.anInt5040);
			this.aClass307_1.aClass169_54.method5001(arg0.method7294(local30, true), (long) this.anInt5040);
		}
		if (this.anInt5037 >= 0 && this.aClass307_1.aClass169_54.method5002((long) this.anInt5037) == null && local7.method4575(this.anInt5037)) {
			local30 = Static652.method7574(local7, this.anInt5037);
			this.aClass307_1.aClass169_54.method5001(arg0.method7294(local30, true), (long) this.anInt5037);
		}
		if (this.anInt5045 >= 0 && this.aClass307_1.aClass169_54.method5002((long) this.anInt5045) == null && local7.method4575(this.anInt5045)) {
			local30 = Static652.method7574(local7, this.anInt5045);
			this.aClass307_1.aClass169_54.method5001(arg0.method7294(local30, true), (long) this.anInt5045);
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(Lclient!ha;B)Lclient!mi;")
	public Class46 method4366(@OriginalArg(0) Class20 arg0) {
		if (this.anInt5040 < 0) {
			return null;
		}
		@Pc(29) Class46 local29 = (Class46) this.aClass307_1.aClass169_54.method5002((long) this.anInt5040);
		if (local29 == null) {
			this.method4365(arg0);
			local29 = (Class46) this.aClass307_1.aClass169_54.method5002((long) this.anInt5040);
		}
		return local29;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!cea;)V")
	public void method4367(@OriginalArg(1) Class2_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8383();
			if (local13 == 0) {
				return;
			}
			this.method4364(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method4368(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = this.aString49;
		while (true) {
			@Pc(16) int local16 = local8.indexOf("%1");
			if (local16 < 0) {
				return local8;
			}
			local8 = local8.substring(0, local16) + Static390.method6425(arg0, false) + local8.substring(local16 + 2);
		}
	}
}

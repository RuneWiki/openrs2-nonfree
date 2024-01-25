import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mka")
public final class Class240 {

	@OriginalMember(owner = "client!mka", name = "k", descriptor = "Lclient!ob;")
	public Class262 aClass262_1;

	@OriginalMember(owner = "client!mka", name = "z", descriptor = "I")
	public int anInt6727 = 70;

	@OriginalMember(owner = "client!mka", name = "f", descriptor = "I")
	public int anInt6731 = 16777215;

	@OriginalMember(owner = "client!mka", name = "q", descriptor = "I")
	private int anInt6728 = -1;

	@OriginalMember(owner = "client!mka", name = "l", descriptor = "I")
	private int anInt6744 = -1;

	@OriginalMember(owner = "client!mka", name = "c", descriptor = "I")
	public int anInt6742 = -1;

	@OriginalMember(owner = "client!mka", name = "u", descriptor = "I")
	private int anInt6745 = -1;

	@OriginalMember(owner = "client!mka", name = "j", descriptor = "I")
	public int anInt6741 = 0;

	@OriginalMember(owner = "client!mka", name = "h", descriptor = "I")
	public int anInt6739 = -1;

	@OriginalMember(owner = "client!mka", name = "m", descriptor = "I")
	public int anInt6734 = 0;

	@OriginalMember(owner = "client!mka", name = "y", descriptor = "Ljava/lang/String;")
	private String aString81 = "";

	@OriginalMember(owner = "client!mka", name = "g", descriptor = "I")
	private int anInt6733 = -1;

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "I")
	public int anInt6729 = 0;

	@OriginalMember(owner = "client!mka", name = "p", descriptor = "I")
	public int anInt6740 = -1;

	@OriginalMember(owner = "client!mka", name = "b", descriptor = "(Lclient!ha;I)V")
	private void method5874(@OriginalArg(0) Class144 arg0) {
		@Pc(7) Class310 local7 = this.aClass262_1.aClass310_91;
		@Pc(39) Class266 local39;
		if (this.anInt6745 >= 0 && this.aClass262_1.aClass317_45.method7882((long) this.anInt6745) == null && local7.method7785(this.anInt6745)) {
			local39 = Static697.method6461(local7, this.anInt6745);
			this.aClass262_1.aClass317_45.method7875((long) this.anInt6745, arg0.method6964(local39, true));
		}
		if (this.anInt6733 >= 0 && this.aClass262_1.aClass317_45.method7882((long) this.anInt6733) == null && local7.method7785(this.anInt6733)) {
			local39 = Static697.method6461(local7, this.anInt6733);
			this.aClass262_1.aClass317_45.method7875((long) this.anInt6733, arg0.method6964(local39, true));
		}
		if (this.anInt6744 >= 0 && this.aClass262_1.aClass317_45.method7882((long) this.anInt6744) == null && local7.method7785(this.anInt6744)) {
			local39 = Static697.method6461(local7, this.anInt6744);
			this.aClass262_1.aClass317_45.method7875((long) this.anInt6744, arg0.method6964(local39, true));
		}
		if (this.anInt6728 >= 0 && this.aClass262_1.aClass317_45.method7882((long) this.anInt6728) == null && local7.method7785(this.anInt6728)) {
			local39 = Static697.method6461(local7, this.anInt6728);
			this.aClass262_1.aClass317_45.method7875((long) this.anInt6728, arg0.method6964(local39, true));
		}
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(BILclient!jc;)V")
	private void method5877(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub21 arg1) {
		if (arg0 == 1) {
			this.anInt6742 = arg1.method7717(-1978450544);
		} else if (arg0 == 2) {
			this.anInt6731 = arg1.method7719();
		} else if (arg0 == 3) {
			this.anInt6745 = arg1.method7717(-1978450544);
		} else if (arg0 == 4) {
			this.anInt6744 = arg1.method7717(-1978450544);
		} else if (arg0 == 5) {
			this.anInt6733 = arg1.method7717(-1978450544);
		} else if (arg0 == 6) {
			this.anInt6728 = arg1.method7717(-1978450544);
		} else if (arg0 == 7) {
			this.anInt6734 = arg1.method7752();
		} else if (arg0 == 8) {
			this.aString81 = arg1.method7739();
		} else if (arg0 == 9) {
			this.anInt6727 = arg1.method7717(-1978450544);
		} else if (arg0 == 10) {
			this.anInt6741 = arg1.method7752();
		} else if (arg0 == 11) {
			this.anInt6740 = 0;
		} else if (arg0 == 12) {
			this.anInt6739 = arg1.method7695(107);
		} else if (arg0 == 13) {
			this.anInt6729 = arg1.method7752();
		} else if (arg0 == 14) {
			this.anInt6740 = arg1.method7717(-1978450544);
		}
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(Lclient!ha;I)Lclient!fia;")
	public Class45 method5878(@OriginalArg(0) Class144 arg0) {
		if (this.anInt6744 < 0) {
			return null;
		}
		@Pc(22) Class45 local22 = (Class45) this.aClass262_1.aClass317_45.method7882((long) this.anInt6744);
		if (local22 == null) {
			this.method5874(arg0);
			local22 = (Class45) this.aClass262_1.aClass317_45.method7882((long) this.anInt6744);
		}
		return local22;
	}

	@OriginalMember(owner = "client!mka", name = "b", descriptor = "(BLclient!ha;)Lclient!fia;")
	public Class45 method5880(@OriginalArg(1) Class144 arg0) {
		if (this.anInt6728 < 0) {
			return null;
		}
		@Pc(30) Class45 local30 = (Class45) this.aClass262_1.aClass317_45.method7882((long) this.anInt6728);
		if (local30 == null) {
			this.method5874(arg0);
			local30 = (Class45) this.aClass262_1.aClass317_45.method7882((long) this.anInt6728);
		}
		return local30;
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(Lclient!ha;Z)Lclient!fia;")
	public Class45 method5881(@OriginalArg(0) Class144 arg0) {
		if (this.anInt6745 < 0) {
			return null;
		}
		@Pc(19) Class45 local19 = (Class45) this.aClass262_1.aClass317_45.method7882((long) this.anInt6745);
		if (local19 == null) {
			this.method5874(arg0);
			local19 = (Class45) this.aClass262_1.aClass317_45.method7882((long) this.anInt6745);
		}
		return local19;
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(Lclient!jc;B)V")
	public void method5882(@OriginalArg(0) Class14_Sub21 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method7695(120);
			if (local11 == 0) {
				return;
			}
			this.method5877(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method5883(@OriginalArg(1) int arg0) {
		@Pc(14) String local14 = this.aString81;
		while (true) {
			@Pc(20) int local20 = local14.indexOf("%1");
			if (local20 < 0) {
				return local14;
			}
			local14 = local14.substring(0, local20) + Static545.method5449(false, arg0) + local14.substring(local20 + 2);
		}
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(BLclient!ha;)Lclient!fia;")
	public Class45 method5884(@OriginalArg(1) Class144 arg0) {
		if (this.anInt6733 < 0) {
			return null;
		}
		@Pc(29) Class45 local29 = (Class45) this.aClass262_1.aClass317_45.method7882((long) this.anInt6733);
		if (local29 == null) {
			this.method5874(arg0);
			local29 = (Class45) this.aClass262_1.aClass317_45.method7882((long) this.anInt6733);
		}
		return local29;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class213 {

	@OriginalMember(owner = "client!lg", name = "p", descriptor = "Lclient!fd;")
	public Class102 aClass102_2;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
	public int anInt6364 = 70;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
	public int anInt6365 = -1;

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
	private int anInt6368 = -1;

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
	public int anInt6373 = 0;

	@OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
	public int anInt6380 = -1;

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
	private int anInt6369 = -1;

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
	private int anInt6376 = -1;

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
	public int anInt6366 = 0;

	@OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
	public int anInt6377 = -1;

	@OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
	private int anInt6378 = -1;

	@OriginalMember(owner = "client!lg", name = "v", descriptor = "Ljava/lang/String;")
	private String aString75 = "";

	@OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
	public int anInt6381 = 16777215;

	@OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
	public int anInt6379 = 0;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!ha;I)V")
	private void method5696(@OriginalArg(0) Class101 arg0) {
		@Pc(7) Class124 local7 = this.aClass102_2.aClass124_43;
		@Pc(31) Class67 local31;
		if (this.anInt6376 >= 0 && this.aClass102_2.aClass22_14.method462((long) this.anInt6376) == null && local7.method3627(this.anInt6376)) {
			local31 = Static676.method1689(local7, this.anInt6376);
			this.aClass102_2.aClass22_14.method470((long) this.anInt6376, arg0.method8063(local31, true));
		}
		if (this.anInt6368 >= 0 && this.aClass102_2.aClass22_14.method462((long) this.anInt6368) == null && local7.method3627(this.anInt6368)) {
			local31 = Static676.method1689(local7, this.anInt6368);
			this.aClass102_2.aClass22_14.method470((long) this.anInt6368, arg0.method8063(local31, true));
		}
		if (this.anInt6378 >= 0 && this.aClass102_2.aClass22_14.method462((long) this.anInt6378) == null && local7.method3627(this.anInt6378)) {
			local31 = Static676.method1689(local7, this.anInt6378);
			this.aClass102_2.aClass22_14.method470((long) this.anInt6378, arg0.method8063(local31, true));
		}
		if (this.anInt6369 >= 0 && this.aClass102_2.aClass22_14.method462((long) this.anInt6369) == null && local7.method3627(this.anInt6369)) {
			local31 = Static676.method1689(local7, this.anInt6369);
			this.aClass102_2.aClass22_14.method470((long) this.anInt6369, arg0.method8063(local31, true));
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!ha;)Lclient!mq;")
	public Class71 method5697(@OriginalArg(1) Class101 arg0) {
		if (this.anInt6369 < 0) {
			return null;
		}
		@Pc(19) Class71 local19 = (Class71) this.aClass102_2.aClass22_14.method462((long) this.anInt6369);
		if (local19 == null) {
			this.method5696(arg0);
			local19 = (Class71) this.aClass102_2.aClass22_14.method462((long) this.anInt6369);
		}
		return local19;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(ILclient!ha;)Lclient!mq;")
	public Class71 method5698(@OriginalArg(1) Class101 arg0) {
		if (this.anInt6376 < 0) {
			return null;
		}
		@Pc(18) Class71 local18 = (Class71) this.aClass102_2.aClass22_14.method462((long) this.anInt6376);
		if (local18 == null) {
			this.method5696(arg0);
			local18 = (Class71) this.aClass102_2.aClass22_14.method462((long) this.anInt6376);
		}
		return local18;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!ol;B)V")
	public void method5699(@OriginalArg(0) Class2_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5203();
			if (local9 == 0) {
				return;
			}
			this.method5701(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(Lclient!ha;I)Lclient!mq;")
	public Class71 method5700(@OriginalArg(0) Class101 arg0) {
		if (this.anInt6368 < 0) {
			return null;
		}
		@Pc(21) Class71 local21 = (Class71) this.aClass102_2.aClass22_14.method462((long) this.anInt6368);
		if (local21 == null) {
			this.method5696(arg0);
			local21 = (Class71) this.aClass102_2.aClass22_14.method462((long) this.anInt6368);
		}
		return local21;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILclient!ol;)V")
	private void method5701(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt6377 = arg1.method5211();
		} else if (arg0 == 2) {
			this.anInt6381 = arg1.method5161();
		} else if (arg0 == 3) {
			this.anInt6376 = arg1.method5211();
		} else if (arg0 == 4) {
			this.anInt6378 = arg1.method5211();
		} else if (arg0 == 5) {
			this.anInt6368 = arg1.method5211();
		} else if (arg0 == 6) {
			this.anInt6369 = arg1.method5211();
		} else if (arg0 == 7) {
			this.anInt6379 = arg1.method5174();
		} else if (arg0 == 8) {
			this.aString75 = arg1.method5183();
		} else if (arg0 == 9) {
			this.anInt6364 = arg1.method5211();
		} else if (arg0 == 10) {
			this.anInt6366 = arg1.method5174();
		} else if (arg0 == 11) {
			this.anInt6365 = 0;
		} else if (arg0 == 12) {
			this.anInt6380 = arg1.method5203();
		} else if (arg0 == 13) {
			this.anInt6373 = arg1.method5174();
		} else if (arg0 == 14) {
			this.anInt6365 = arg1.method5211();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method5702(@OriginalArg(1) int arg0) {
		@Pc(14) String local14 = this.aString75;
		while (true) {
			@Pc(18) int local18 = local14.indexOf("%1");
			if (local18 < 0) {
				return local14;
			}
			local14 = local14.substring(0, local18) + Static25.method454(arg0, false) + local14.substring(local18 + 2);
		}
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(Lclient!ha;I)Lclient!mq;")
	public Class71 method5703(@OriginalArg(0) Class101 arg0) {
		if (this.anInt6378 < 0) {
			return null;
		}
		@Pc(24) Class71 local24 = (Class71) this.aClass102_2.aClass22_14.method462((long) this.anInt6378);
		if (local24 == null) {
			this.method5696(arg0);
			local24 = (Class71) this.aClass102_2.aClass22_14.method462((long) this.anInt6378);
		}
		return local24;
	}
}

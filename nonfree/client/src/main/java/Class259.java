import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class259 {

	@OriginalMember(owner = "client!og", name = "u", descriptor = "Lclient!rfa;")
	public Class299 aClass299_2;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "I")
	public int anInt7603 = 70;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "I")
	public int anInt7599 = -1;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "I")
	private int anInt7601 = -1;

	@OriginalMember(owner = "client!og", name = "f", descriptor = "I")
	private int anInt7604 = -1;

	@OriginalMember(owner = "client!og", name = "j", descriptor = "I")
	private int anInt7608 = -1;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "I")
	public int anInt7607 = -1;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "I")
	public int anInt7602 = 0;

	@OriginalMember(owner = "client!og", name = "r", descriptor = "Ljava/lang/String;")
	private String aString76 = "";

	@OriginalMember(owner = "client!og", name = "o", descriptor = "I")
	private int anInt7612 = -1;

	@OriginalMember(owner = "client!og", name = "v", descriptor = "I")
	public int anInt7617 = 16777215;

	@OriginalMember(owner = "client!og", name = "x", descriptor = "I")
	public int anInt7619 = -1;

	@OriginalMember(owner = "client!og", name = "w", descriptor = "I")
	public int anInt7618 = 0;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "I")
	public int anInt7605 = 0;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!ha;B)Lclient!jd;")
	public Class20 method6251(@OriginalArg(0) Class137 arg0) {
		if (this.anInt7601 < 0) {
			return null;
		}
		@Pc(24) Class20 local24 = (Class20) this.aClass299_2.aClass264_53.method6367((long) this.anInt7601);
		if (local24 == null) {
			this.method6260(arg0);
			local24 = (Class20) this.aClass299_2.aClass264_53.method6367((long) this.anInt7601);
		}
		return local24;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BLclient!ha;)Lclient!jd;")
	public Class20 method6252(@OriginalArg(1) Class137 arg0) {
		if (this.anInt7608 < 0) {
			return null;
		}
		@Pc(26) Class20 local26 = (Class20) this.aClass299_2.aClass264_53.method6367((long) this.anInt7608);
		if (local26 == null) {
			this.method6260(arg0);
			local26 = (Class20) this.aClass299_2.aClass264_53.method6367((long) this.anInt7608);
		}
		return local26;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!ha;)Lclient!jd;")
	public Class20 method6253(@OriginalArg(1) Class137 arg0) {
		if (this.anInt7612 < 0) {
			return null;
		}
		@Pc(18) Class20 local18 = (Class20) this.aClass299_2.aClass264_53.method6367((long) this.anInt7612);
		if (local18 == null) {
			this.method6260(arg0);
			local18 = (Class20) this.aClass299_2.aClass264_53.method6367((long) this.anInt7612);
		}
		return local18;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BLclient!so;)V")
	public void method6254(@OriginalArg(1) Class14_Sub29 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5866();
			if (local9 == 0) {
				return;
			}
			this.method6262(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(Lclient!ha;B)Lclient!jd;")
	public Class20 method6256(@OriginalArg(0) Class137 arg0) {
		if (this.anInt7604 < 0) {
			return null;
		}
		@Pc(26) Class20 local26 = (Class20) this.aClass299_2.aClass264_53.method6367((long) this.anInt7604);
		if (local26 == null) {
			this.method6260(arg0);
			local26 = (Class20) this.aClass299_2.aClass264_53.method6367((long) this.anInt7604);
		}
		return local26;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(ILclient!ha;)V")
	private void method6260(@OriginalArg(1) Class137 arg0) {
		@Pc(7) Class386 local7 = this.aClass299_2.aClass386_109;
		@Pc(33) Class356 local33;
		if (this.anInt7608 >= 0 && this.aClass299_2.aClass264_53.method6367((long) this.anInt7608) == null && local7.method9206(this.anInt7608)) {
			local33 = Static688.method8622(local7, this.anInt7608);
			this.aClass299_2.aClass264_53.method6364((long) this.anInt7608, arg0.method7951(local33, true));
		}
		if (this.anInt7612 >= 0 && this.aClass299_2.aClass264_53.method6367((long) this.anInt7612) == null && local7.method9206(this.anInt7612)) {
			local33 = Static688.method8622(local7, this.anInt7612);
			this.aClass299_2.aClass264_53.method6364((long) this.anInt7612, arg0.method7951(local33, true));
		}
		if (this.anInt7604 >= 0 && this.aClass299_2.aClass264_53.method6367((long) this.anInt7604) == null && local7.method9206(this.anInt7604)) {
			local33 = Static688.method8622(local7, this.anInt7604);
			this.aClass299_2.aClass264_53.method6364((long) this.anInt7604, arg0.method7951(local33, true));
		}
		if (this.anInt7601 >= 0 && this.aClass299_2.aClass264_53.method6367((long) this.anInt7601) == null && local7.method9206(this.anInt7601)) {
			local33 = Static688.method8622(local7, this.anInt7601);
			this.aClass299_2.aClass264_53.method6364((long) this.anInt7601, arg0.method7951(local33, true));
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method6261(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = this.aString76;
		while (true) {
			@Pc(12) int local12 = local8.indexOf("%1");
			if (local12 < 0) {
				return local8;
			}
			local8 = local8.substring(0, local12) + Static149.method5514(arg0, false) + local8.substring(local12 + 2);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!so;I)V")
	private void method6262(@OriginalArg(1) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7599 = arg0.method5900();
		} else if (arg1 == 2) {
			this.anInt7617 = arg0.method5862();
		} else if (arg1 == 3) {
			this.anInt7608 = arg0.method5900();
		} else if (arg1 == 4) {
			this.anInt7604 = arg0.method5900();
		} else if (arg1 == 5) {
			this.anInt7612 = arg0.method5900();
		} else if (arg1 == 6) {
			this.anInt7601 = arg0.method5900();
		} else if (arg1 == 7) {
			this.anInt7602 = arg0.method5890();
		} else if (arg1 == 8) {
			this.aString76 = arg0.method5903();
		} else if (arg1 == 9) {
			this.anInt7603 = arg0.method5900();
		} else if (arg1 == 10) {
			this.anInt7618 = arg0.method5890();
		} else if (arg1 == 11) {
			this.anInt7607 = 0;
		} else if (arg1 == 12) {
			this.anInt7619 = arg0.method5866();
		} else if (arg1 == 13) {
			this.anInt7605 = arg0.method5890();
			return;
		} else if (arg1 == 14) {
			this.anInt7607 = arg0.method5900();
			return;
		}
	}
}

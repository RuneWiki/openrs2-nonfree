import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class246 {

	@OriginalMember(owner = "client!nv", name = "v", descriptor = "Lclient!hd;")
	public Class131 aClass131_2;

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "Ljava/lang/String;")
	private String aString63 = "";

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
	private int anInt6616 = -1;

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
	private int anInt6617 = -1;

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "I")
	private int anInt6625 = -1;

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "I")
	private int anInt6622 = -1;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
	public int anInt6615 = 0;

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "I")
	public int anInt6621 = 0;

	@OriginalMember(owner = "client!nv", name = "m", descriptor = "I")
	public int anInt6626 = 0;

	@OriginalMember(owner = "client!nv", name = "q", descriptor = "I")
	public int anInt6630 = -1;

	@OriginalMember(owner = "client!nv", name = "s", descriptor = "I")
	public int anInt6632 = -1;

	@OriginalMember(owner = "client!nv", name = "y", descriptor = "I")
	public int anInt6636 = 16777215;

	@OriginalMember(owner = "client!nv", name = "u", descriptor = "I")
	public int anInt6633 = 70;

	@OriginalMember(owner = "client!nv", name = "z", descriptor = "I")
	public int anInt6637 = -1;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!ha;I)Lclient!vr;")
	public Class33 method5911(@OriginalArg(0) Class13 arg0) {
		if (this.anInt6617 < 0) {
			return null;
		}
		@Pc(19) Class33 local19 = (Class33) this.aClass131_2.aClass165_27.method4389((long) this.anInt6617);
		if (local19 == null) {
			this.method5915(arg0);
			local19 = (Class33) this.aClass131_2.aClass165_27.method4389((long) this.anInt6617);
		}
		return local19;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method5912(@OriginalArg(1) int arg0) {
		@Pc(16) String local16 = this.aString63;
		while (true) {
			@Pc(20) int local20 = local16.indexOf("%1");
			if (local20 < 0) {
				return local16;
			}
			local16 = local16.substring(0, local20) + Static112.method5091(arg0, false) + local16.substring(local20 + 2);
		}
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(Lclient!ha;I)Lclient!vr;")
	public Class33 method5913(@OriginalArg(0) Class13 arg0) {
		if (this.anInt6625 < 0) {
			return null;
		}
		@Pc(19) Class33 local19 = (Class33) this.aClass131_2.aClass165_27.method4389((long) this.anInt6625);
		if (local19 == null) {
			this.method5915(arg0);
			local19 = (Class33) this.aClass131_2.aClass165_27.method4389((long) this.anInt6625);
		}
		return local19;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILclient!jp;I)V")
	private void method5914(@OriginalArg(1) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6632 = arg0.method8593();
		} else if (arg1 == 2) {
			this.anInt6636 = arg0.method8607();
		} else if (arg1 == 3) {
			this.anInt6616 = arg0.method8593();
		} else if (arg1 == 4) {
			this.anInt6622 = arg0.method8593();
		} else if (arg1 == 5) {
			this.anInt6625 = arg0.method8593();
		} else if (arg1 == 6) {
			this.anInt6617 = arg0.method8593();
		} else if (arg1 == 7) {
			this.anInt6621 = arg0.method8589();
		} else if (arg1 == 8) {
			this.aString63 = arg0.method8584();
		} else if (arg1 == 9) {
			this.anInt6633 = arg0.method8593();
		} else if (arg1 == 10) {
			this.anInt6626 = arg0.method8589();
		} else if (arg1 == 11) {
			this.anInt6637 = 0;
		} else if (arg1 == 12) {
			this.anInt6630 = arg0.method8632();
		} else if (arg1 == 13) {
			this.anInt6615 = arg0.method8589();
			return;
		} else if (arg1 == 14) {
			this.anInt6637 = arg0.method8593();
			return;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILclient!ha;)V")
	private void method5915(@OriginalArg(1) Class13 arg0) {
		@Pc(7) Class15 local7 = this.aClass131_2.aClass15_61;
		@Pc(33) Class97 local33;
		if (this.anInt6616 >= 0 && this.aClass131_2.aClass165_27.method4389((long) this.anInt6616) == null && local7.method526(this.anInt6616)) {
			local33 = Static682.method2751(local7, this.anInt6616);
			this.aClass131_2.aClass165_27.method4392(arg0.method8465(local33, true), (long) this.anInt6616);
		}
		if (this.anInt6625 >= 0 && this.aClass131_2.aClass165_27.method4389((long) this.anInt6625) == null && local7.method526(this.anInt6625)) {
			local33 = Static682.method2751(local7, this.anInt6625);
			this.aClass131_2.aClass165_27.method4392(arg0.method8465(local33, true), (long) this.anInt6625);
		}
		if (this.anInt6622 >= 0 && this.aClass131_2.aClass165_27.method4389((long) this.anInt6622) == null && local7.method526(this.anInt6622)) {
			local33 = Static682.method2751(local7, this.anInt6622);
			this.aClass131_2.aClass165_27.method4392(arg0.method8465(local33, true), (long) this.anInt6622);
		}
		if (this.anInt6617 >= 0 && this.aClass131_2.aClass165_27.method4389((long) this.anInt6617) == null && local7.method526(this.anInt6617)) {
			local33 = Static682.method2751(local7, this.anInt6617);
			this.aClass131_2.aClass165_27.method4392(arg0.method8465(local33, true), (long) this.anInt6617);
		}
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(ILclient!ha;)Lclient!vr;")
	public Class33 method5916(@OriginalArg(1) Class13 arg0) {
		if (this.anInt6616 < 0) {
			return null;
		}
		@Pc(27) Class33 local27 = (Class33) this.aClass131_2.aClass165_27.method4389((long) this.anInt6616);
		if (local27 == null) {
			this.method5915(arg0);
			local27 = (Class33) this.aClass131_2.aClass165_27.method4389((long) this.anInt6616);
		}
		return local27;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!jp;B)V")
	public void method5917(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8632();
			if (local13 == 0) {
				return;
			}
			this.method5914(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(Lclient!ha;I)Lclient!vr;")
	public Class33 method5920(@OriginalArg(0) Class13 arg0) {
		if (this.anInt6622 < 0) {
			return null;
		}
		@Pc(23) Class33 local23 = (Class33) this.aClass131_2.aClass165_27.method4389((long) this.anInt6622);
		if (local23 == null) {
			this.method5915(arg0);
			local23 = (Class33) this.aClass131_2.aClass165_27.method4389((long) this.anInt6622);
		}
		return local23;
	}
}

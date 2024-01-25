import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class369 {

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "Lclient!cq;")
	public Class65 aClass65_2;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	public int anInt10469 = 0;

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
	public int anInt10480 = -1;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
	public int anInt10474 = 0;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
	public int anInt10475 = -1;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
	private int anInt10471 = -1;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
	public int anInt10477 = -1;

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
	private int anInt10483 = -1;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
	public int anInt10473 = 70;

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
	public int anInt10485 = 0;

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
	private int anInt10484 = -1;

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
	private int anInt10487 = -1;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Ljava/lang/String;")
	private String aString112 = "";

	@OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
	public int anInt10489 = 16777215;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!ha;I)Lclient!hh;")
	public Class6 method8582(@OriginalArg(0) Class95 arg0) {
		if (this.anInt10484 < 0) {
			return null;
		}
		@Pc(21) Class6 local21 = (Class6) this.aClass65_2.aClass295_6.method6470((long) this.anInt10484);
		if (local21 == null) {
			this.method8586(arg0);
			local21 = (Class6) this.aClass65_2.aClass295_6.method6470((long) this.anInt10484);
		}
		return local21;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method8583(@OriginalArg(0) int arg0) {
		@Pc(13) String local13 = this.aString112;
		while (true) {
			@Pc(17) int local17 = local13.indexOf("%1");
			if (local17 < 0) {
				return local13;
			}
			local13 = local13.substring(0, local17) + Static556.method7330(arg0, false) + local13.substring(local17 + 2);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLclient!dt;)V")
	public void method8584(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7954();
			if (local5 == 0) {
				return;
			}
			this.method8587(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(Lclient!ha;I)Lclient!hh;")
	public Class6 method8585(@OriginalArg(0) Class95 arg0) {
		if (this.anInt10471 < 0) {
			return null;
		}
		@Pc(21) Class6 local21 = (Class6) this.aClass65_2.aClass295_6.method6470((long) this.anInt10471);
		if (local21 == null) {
			this.method8586(arg0);
			local21 = (Class6) this.aClass65_2.aClass295_6.method6470((long) this.anInt10471);
		}
		return local21;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!ha;)V")
	private void method8586(@OriginalArg(1) Class95 arg0) {
		@Pc(13) Class362 local13 = this.aClass65_2.aClass362_19;
		@Pc(39) Class370 local39;
		if (this.anInt10483 >= 0 && this.aClass65_2.aClass295_6.method6470((long) this.anInt10483) == null && local13.method8365(this.anInt10483)) {
			local39 = Static688.method8604(local13, this.anInt10483);
			this.aClass65_2.aClass295_6.method6469((long) this.anInt10483, arg0.method8008(local39, true));
		}
		if (this.anInt10471 >= 0 && this.aClass65_2.aClass295_6.method6470((long) this.anInt10471) == null && local13.method8365(this.anInt10471)) {
			local39 = Static688.method8604(local13, this.anInt10471);
			this.aClass65_2.aClass295_6.method6469((long) this.anInt10471, arg0.method8008(local39, true));
		}
		if (this.anInt10487 >= 0 && this.aClass65_2.aClass295_6.method6470((long) this.anInt10487) == null && local13.method8365(this.anInt10487)) {
			local39 = Static688.method8604(local13, this.anInt10487);
			this.aClass65_2.aClass295_6.method6469((long) this.anInt10487, arg0.method8008(local39, true));
		}
		if (this.anInt10484 >= 0 && this.aClass65_2.aClass295_6.method6470((long) this.anInt10484) == null && local13.method8365(this.anInt10484)) {
			local39 = Static688.method8604(local13, this.anInt10484);
			this.aClass65_2.aClass295_6.method6469((long) this.anInt10484, arg0.method8008(local39, true));
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!dt;B)V")
	private void method8587(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt10480 = arg1.method7951();
		} else if (arg0 == 2) {
			this.anInt10489 = arg1.method7945();
		} else if (arg0 == 3) {
			this.anInt10483 = arg1.method7951();
		} else if (arg0 == 4) {
			this.anInt10487 = arg1.method7951();
		} else if (arg0 == 5) {
			this.anInt10471 = arg1.method7951();
		} else if (arg0 == 6) {
			this.anInt10484 = arg1.method7951();
		} else if (arg0 == 7) {
			this.anInt10485 = arg1.method7918();
		} else if (arg0 == 8) {
			this.aString112 = arg1.method7928();
		} else if (arg0 == 9) {
			this.anInt10473 = arg1.method7951();
		} else if (arg0 == 10) {
			this.anInt10469 = arg1.method7918();
		} else if (arg0 == 11) {
			this.anInt10477 = 0;
		} else if (arg0 == 12) {
			this.anInt10475 = arg1.method7954();
		} else if (arg0 == 13) {
			this.anInt10474 = arg1.method7918();
		} else if (arg0 == 14) {
			this.anInt10477 = arg1.method7951();
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(ILclient!ha;)Lclient!hh;")
	public Class6 method8588(@OriginalArg(1) Class95 arg0) {
		if (this.anInt10483 < 0) {
			return null;
		}
		@Pc(26) Class6 local26 = (Class6) this.aClass65_2.aClass295_6.method6470((long) this.anInt10483);
		if (local26 == null) {
			this.method8586(arg0);
			local26 = (Class6) this.aClass65_2.aClass295_6.method6470((long) this.anInt10483);
		}
		return local26;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(Lclient!ha;I)Lclient!hh;")
	public Class6 method8589(@OriginalArg(0) Class95 arg0) {
		if (this.anInt10487 < 0) {
			return null;
		}
		@Pc(25) Class6 local25 = (Class6) this.aClass65_2.aClass295_6.method6470((long) this.anInt10487);
		if (local25 == null) {
			this.method8586(arg0);
			local25 = (Class6) this.aClass65_2.aClass295_6.method6470((long) this.anInt10487);
		}
		return local25;
	}
}

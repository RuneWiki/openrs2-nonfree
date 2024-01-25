import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class213 {

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "Lclient!rf;")
	public Class312 aClass312_2;

	@OriginalMember(owner = "client!kw", name = "j", descriptor = "I")
	public int anInt5401 = -1;

	@OriginalMember(owner = "client!kw", name = "u", descriptor = "I")
	public int anInt5399 = -1;

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "I")
	private int anInt5393 = -1;

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "I")
	private int anInt5400 = -1;

	@OriginalMember(owner = "client!kw", name = "h", descriptor = "I")
	public int anInt5407 = 16777215;

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "I")
	public int anInt5398 = 0;

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
	public int anInt5410 = 0;

	@OriginalMember(owner = "client!kw", name = "v", descriptor = "I")
	private int anInt5404 = -1;

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "I")
	private int anInt5413 = -1;

	@OriginalMember(owner = "client!kw", name = "q", descriptor = "Ljava/lang/String;")
	private String aString60 = "";

	@OriginalMember(owner = "client!kw", name = "r", descriptor = "I")
	public int anInt5403 = -1;

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "I")
	public int anInt5402 = 70;

	@OriginalMember(owner = "client!kw", name = "s", descriptor = "I")
	public int anInt5409 = 0;

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method4840(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = this.aString60;
		while (true) {
			@Pc(20) int local20 = local8.indexOf("%1");
			if (local20 < 0) {
				return local8;
			}
			local8 = local8.substring(0, local20) + Static539.method7407(false, arg0) + local8.substring(local20 + 2);
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!wq;IB)V")
	private void method4841(@OriginalArg(0) Class5_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5399 = arg0.method7333();
		} else if (arg1 == 2) {
			this.anInt5407 = arg0.method7331();
		} else if (arg1 == 3) {
			this.anInt5400 = arg0.method7333();
		} else if (arg1 == 4) {
			this.anInt5404 = arg0.method7333();
		} else if (arg1 == 5) {
			this.anInt5393 = arg0.method7333();
		} else if (arg1 == 6) {
			this.anInt5413 = arg0.method7333();
		} else if (arg1 == 7) {
			this.anInt5410 = arg0.method7303();
		} else if (arg1 == 8) {
			this.aString60 = arg0.method7275();
		} else if (arg1 == 9) {
			this.anInt5402 = arg0.method7333();
		} else if (arg1 == 10) {
			this.anInt5398 = arg0.method7303();
		} else if (arg1 == 11) {
			this.anInt5403 = 0;
		} else if (arg1 == 12) {
			this.anInt5401 = arg0.method7291();
		} else if (arg1 == 13) {
			this.anInt5409 = arg0.method7303();
			return;
		} else if (arg1 == 14) {
			this.anInt5403 = arg0.method7333();
			return;
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZLclient!ha;)Lclient!hk;")
	public Class155 method4842(@OriginalArg(1) Class100 arg0) {
		if (this.anInt5413 < 0) {
			return null;
		}
		@Pc(22) Class155 local22 = (Class155) this.aClass312_2.aClass168_72.method3860((long) this.anInt5413);
		if (local22 == null) {
			this.method4850(arg0);
			local22 = (Class155) this.aClass312_2.aClass168_72.method3860((long) this.anInt5413);
		}
		return local22;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILclient!wq;)V")
	public void method4843(@OriginalArg(1) Class5_Sub36 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7291();
			if (local9 == 0) {
				return;
			}
			this.method4841(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILclient!ha;)Lclient!hk;")
	public Class155 method4845(@OriginalArg(1) Class100 arg0) {
		if (this.anInt5404 < 0) {
			return null;
		}
		@Pc(20) Class155 local20 = (Class155) this.aClass312_2.aClass168_72.method3860((long) this.anInt5404);
		if (local20 == null) {
			this.method4850(arg0);
			local20 = (Class155) this.aClass312_2.aClass168_72.method3860((long) this.anInt5404);
		}
		return local20;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(ILclient!ha;)Lclient!hk;")
	public Class155 method4848(@OriginalArg(1) Class100 arg0) {
		if (this.anInt5400 < 0) {
			return null;
		}
		@Pc(32) Class155 local32 = (Class155) this.aClass312_2.aClass168_72.method3860((long) this.anInt5400);
		if (local32 == null) {
			this.method4850(arg0);
			local32 = (Class155) this.aClass312_2.aClass168_72.method3860((long) this.anInt5400);
		}
		return local32;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!ha;I)Lclient!hk;")
	public Class155 method4849(@OriginalArg(0) Class100 arg0) {
		if (this.anInt5393 < 0) {
			return null;
		}
		@Pc(22) Class155 local22 = (Class155) this.aClass312_2.aClass168_72.method3860((long) this.anInt5393);
		if (local22 == null) {
			this.method4850(arg0);
			local22 = (Class155) this.aClass312_2.aClass168_72.method3860((long) this.anInt5393);
		}
		return local22;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!ha;Z)V")
	private void method4850(@OriginalArg(0) Class100 arg0) {
		@Pc(15) Class126 local15 = this.aClass312_2.aClass126_232;
		@Pc(45) Class362 local45;
		if (this.anInt5400 >= 0 && this.aClass312_2.aClass168_72.method3860((long) this.anInt5400) == null && local15.method3077(this.anInt5400)) {
			local45 = Static692.method8276(local15, this.anInt5400);
			this.aClass312_2.aClass168_72.method3853((long) this.anInt5400, arg0.method8640(local45, true));
		}
		if (this.anInt5393 >= 0 && this.aClass312_2.aClass168_72.method3860((long) this.anInt5393) == null && local15.method3077(this.anInt5393)) {
			local45 = Static692.method8276(local15, this.anInt5393);
			this.aClass312_2.aClass168_72.method3853((long) this.anInt5393, arg0.method8640(local45, true));
		}
		if (this.anInt5404 >= 0 && this.aClass312_2.aClass168_72.method3860((long) this.anInt5404) == null && local15.method3077(this.anInt5404)) {
			local45 = Static692.method8276(local15, this.anInt5404);
			this.aClass312_2.aClass168_72.method3853((long) this.anInt5404, arg0.method8640(local45, true));
		}
		if (this.anInt5413 >= 0 && this.aClass312_2.aClass168_72.method3860((long) this.anInt5413) == null && local15.method3077(this.anInt5413)) {
			local45 = Static692.method8276(local15, this.anInt5413);
			this.aClass312_2.aClass168_72.method3853((long) this.anInt5413, arg0.method8640(local45, true));
		}
	}
}

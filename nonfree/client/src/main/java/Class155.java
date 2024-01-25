import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class155 {

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "Lclient!mj;")
	public Class237 aClass237_1;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
	private int anInt3472 = -1;

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "Ljava/lang/String;")
	private String aString55 = "";

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
	private int anInt3483 = -1;

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
	public int anInt3471 = -1;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
	public int anInt3480 = 0;

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
	private int anInt3481 = -1;

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
	public int anInt3477 = 0;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
	private int anInt3474 = -1;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
	public int anInt3470 = -1;

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
	public int anInt3476 = -1;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
	public int anInt3490 = 16777215;

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
	public int anInt3488 = 70;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
	public int anInt3491 = 0;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(ILclient!ha;)Lclient!fs;")
	public Class134 method3052(@OriginalArg(1) Class57 arg0) {
		if (this.anInt3481 < 0) {
			return null;
		}
		@Pc(27) Class134 local27 = (Class134) this.aClass237_1.aClass391_33.method9275((long) this.anInt3481);
		if (local27 == null) {
			this.method3057(arg0);
			local27 = (Class134) this.aClass237_1.aClass391_33.method9275((long) this.anInt3481);
		}
		return local27;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method3053(@OriginalArg(0) int arg0) {
		@Pc(14) String local14 = this.aString55;
		while (true) {
			@Pc(20) int local20 = local14.indexOf("%1");
			if (local20 < 0) {
				return local14;
			}
			local14 = local14.substring(0, local20) + Static429.method6352(arg0, false) + local14.substring(local20 + 2);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!ha;)Lclient!fs;")
	public Class134 method3055(@OriginalArg(1) Class57 arg0) {
		if (this.anInt3474 < 0) {
			return null;
		}
		@Pc(22) Class134 local22 = (Class134) this.aClass237_1.aClass391_33.method9275((long) this.anInt3474);
		if (local22 == null) {
			this.method3057(arg0);
			local22 = (Class134) this.aClass237_1.aClass391_33.method9275((long) this.anInt3474);
		}
		return local22;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(ILclient!ha;)V")
	private void method3057(@OriginalArg(1) Class57 arg0) {
		@Pc(7) Class208 local7 = this.aClass237_1.aClass208_87;
		@Pc(37) Class173 local37;
		if (this.anInt3481 >= 0 && this.aClass237_1.aClass391_33.method9275((long) this.anInt3481) == null && local7.method4977(this.anInt3481)) {
			local37 = Static684.method3649(local7, this.anInt3481);
			this.aClass237_1.aClass391_33.method9273((long) this.anInt3481, arg0.method7654(local37, true), 1);
		}
		if (this.anInt3474 >= 0 && this.aClass237_1.aClass391_33.method9275((long) this.anInt3474) == null && local7.method4977(this.anInt3474)) {
			local37 = Static684.method3649(local7, this.anInt3474);
			this.aClass237_1.aClass391_33.method9273((long) this.anInt3474, arg0.method7654(local37, true), 1);
		}
		if (this.anInt3472 >= 0 && this.aClass237_1.aClass391_33.method9275((long) this.anInt3472) == null && local7.method4977(this.anInt3472)) {
			local37 = Static684.method3649(local7, this.anInt3472);
			this.aClass237_1.aClass391_33.method9273((long) this.anInt3472, arg0.method7654(local37, true), 1);
		}
		if (this.anInt3483 >= 0 && this.aClass237_1.aClass391_33.method9275((long) this.anInt3483) == null && local7.method4977(this.anInt3483)) {
			local37 = Static684.method3649(local7, this.anInt3483);
			this.aClass237_1.aClass391_33.method9273((long) this.anInt3483, arg0.method7654(local37, true), 1);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBLclient!ib;)V")
	private void method3059(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 1) {
			this.anInt3476 = arg1.method8519();
		} else if (arg0 == 2) {
			this.anInt3490 = arg1.method8510();
		} else if (arg0 == 3) {
			this.anInt3481 = arg1.method8519();
		} else if (arg0 == 4) {
			this.anInt3472 = arg1.method8519();
		} else if (arg0 == 5) {
			this.anInt3474 = arg1.method8519();
		} else if (arg0 == 6) {
			this.anInt3483 = arg1.method8519();
		} else if (arg0 == 7) {
			this.anInt3491 = arg1.method8516();
		} else if (arg0 == 8) {
			this.aString55 = arg1.method8473();
		} else if (arg0 == 9) {
			this.anInt3488 = arg1.method8519();
		} else if (arg0 == 10) {
			this.anInt3480 = arg1.method8516();
		} else if (arg0 == 11) {
			this.anInt3470 = 0;
		} else if (arg0 == 12) {
			this.anInt3471 = arg1.method8529();
		} else if (arg0 == 13) {
			this.anInt3477 = arg1.method8516();
		} else if (arg0 == 14) {
			this.anInt3470 = arg1.method8519();
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLclient!ib;)V")
	public void method3060(@OriginalArg(1) Class5_Sub23 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method8529();
			if (local14 == 0) {
				return;
			}
			this.method3059(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(ILclient!ha;)Lclient!fs;")
	public Class134 method3062(@OriginalArg(1) Class57 arg0) {
		if (this.anInt3472 < 0) {
			return null;
		}
		@Pc(27) Class134 local27 = (Class134) this.aClass237_1.aClass391_33.method9275((long) this.anInt3472);
		if (local27 == null) {
			this.method3057(arg0);
			local27 = (Class134) this.aClass237_1.aClass391_33.method9275((long) this.anInt3472);
		}
		return local27;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ha;I)Lclient!fs;")
	public Class134 method3063(@OriginalArg(0) Class57 arg0) {
		if (this.anInt3483 < 0) {
			return null;
		}
		@Pc(22) Class134 local22 = (Class134) this.aClass237_1.aClass391_33.method9275((long) this.anInt3483);
		if (local22 == null) {
			this.method3057(arg0);
			local22 = (Class134) this.aClass237_1.aClass391_33.method9275((long) this.anInt3483);
		}
		return local22;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class372 {

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "Lclient!vq;")
	public Class361 aClass361_2;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
	public int anInt10026 = 16777215;

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
	public int anInt10029 = 0;

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
	public int anInt10025 = 0;

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
	private int anInt10034 = -1;

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
	public int anInt10030 = 70;

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
	public int anInt10031 = 0;

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
	public int anInt10023 = -1;

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "Ljava/lang/String;")
	private String aString106 = "";

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
	public int anInt10038 = -1;

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
	private int anInt10039 = -1;

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
	private int anInt10027 = -1;

	@OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
	private int anInt10040 = -1;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
	public int anInt10033 = -1;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!ha;)Lclient!fd;")
	public Class103 method8510(@OriginalArg(1) Class82 arg0) {
		if (this.anInt10040 < 0) {
			return null;
		}
		@Pc(26) Class103 local26 = (Class103) this.aClass361_2.aClass136_67.method3134((long) this.anInt10040);
		if (local26 == null) {
			this.method8516(arg0);
			local26 = (Class103) this.aClass361_2.aClass136_67.method3134((long) this.anInt10040);
		}
		return local26;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method8511(@OriginalArg(0) int arg0) {
		@Pc(14) String local14 = this.aString106;
		while (true) {
			@Pc(18) int local18 = local14.indexOf("%1");
			if (local18 < 0) {
				return local14;
			}
			local14 = local14.substring(0, local18) + Static106.method1791(arg0, false) + local14.substring(local18 + 2);
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(ILclient!ha;)Lclient!fd;")
	public Class103 method8512(@OriginalArg(1) Class82 arg0) {
		if (this.anInt10027 < 0) {
			return null;
		}
		@Pc(26) Class103 local26 = (Class103) this.aClass361_2.aClass136_67.method3134((long) this.anInt10027);
		if (local26 == null) {
			this.method8516(arg0);
			local26 = (Class103) this.aClass361_2.aClass136_67.method3134((long) this.anInt10027);
		}
		return local26;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!dc;II)V")
	private void method8513(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt10038 = arg0.method5610();
		} else if (arg1 == 2) {
			this.anInt10026 = arg0.method5604();
		} else if (arg1 == 3) {
			this.anInt10027 = arg0.method5610();
		} else if (arg1 == 4) {
			this.anInt10034 = arg0.method5610();
		} else if (arg1 == 5) {
			this.anInt10039 = arg0.method5610();
		} else if (arg1 == 6) {
			this.anInt10040 = arg0.method5610();
		} else if (arg1 == 7) {
			this.anInt10025 = arg0.method5624();
		} else if (arg1 == 8) {
			this.aString106 = arg0.method5605();
		} else if (arg1 == 9) {
			this.anInt10030 = arg0.method5610();
		} else if (arg1 == 10) {
			this.anInt10031 = arg0.method5624();
		} else if (arg1 == 11) {
			this.anInt10023 = 0;
		} else if (arg1 == 12) {
			this.anInt10033 = arg0.method5633();
		} else if (arg1 == 13) {
			this.anInt10029 = arg0.method5624();
		} else if (arg1 == 14) {
			this.anInt10023 = arg0.method5610();
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLclient!dc;)V")
	public void method8515(@OriginalArg(1) Class3_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5633();
			if (local5 == 0) {
				return;
			}
			this.method8513(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZLclient!ha;)V")
	private void method8516(@OriginalArg(1) Class82 arg0) {
		@Pc(15) Class343 local15 = this.aClass361_2.aClass343_263;
		@Pc(41) Class251 local41;
		if (this.anInt10027 >= 0 && this.aClass361_2.aClass136_67.method3134((long) this.anInt10027) == null && local15.method8138(this.anInt10027)) {
			local41 = Static656.method6339(local15, this.anInt10027);
			this.aClass361_2.aClass136_67.method3135(arg0.method6106(local41, true), (long) this.anInt10027);
		}
		if (this.anInt10039 >= 0 && this.aClass361_2.aClass136_67.method3134((long) this.anInt10039) == null && local15.method8138(this.anInt10039)) {
			local41 = Static656.method6339(local15, this.anInt10039);
			this.aClass361_2.aClass136_67.method3135(arg0.method6106(local41, true), (long) this.anInt10039);
		}
		if (this.anInt10034 >= 0 && this.aClass361_2.aClass136_67.method3134((long) this.anInt10034) == null && local15.method8138(this.anInt10034)) {
			local41 = Static656.method6339(local15, this.anInt10034);
			this.aClass361_2.aClass136_67.method3135(arg0.method6106(local41, true), (long) this.anInt10034);
		}
		if (this.anInt10040 >= 0 && this.aClass361_2.aClass136_67.method3134((long) this.anInt10040) == null && local15.method8138(this.anInt10040)) {
			local41 = Static656.method6339(local15, this.anInt10040);
			this.aClass361_2.aClass136_67.method3135(arg0.method6106(local41, true), (long) this.anInt10040);
		}
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(ILclient!ha;)Lclient!fd;")
	public Class103 method8517(@OriginalArg(1) Class82 arg0) {
		if (this.anInt10039 < 0) {
			return null;
		}
		@Pc(19) Class103 local19 = (Class103) this.aClass361_2.aClass136_67.method3134((long) this.anInt10039);
		if (local19 == null) {
			this.method8516(arg0);
			local19 = (Class103) this.aClass361_2.aClass136_67.method3134((long) this.anInt10039);
		}
		return local19;
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "(ILclient!ha;)Lclient!fd;")
	public Class103 method8518(@OriginalArg(1) Class82 arg0) {
		if (this.anInt10034 < 0) {
			return null;
		}
		@Pc(26) Class103 local26 = (Class103) this.aClass361_2.aClass136_67.method3134((long) this.anInt10034);
		if (local26 == null) {
			this.method8516(arg0);
			local26 = (Class103) this.aClass361_2.aClass136_67.method3134((long) this.anInt10034);
		}
		return local26;
	}
}

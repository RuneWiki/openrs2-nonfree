import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class145 {

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "Lclient!u;")
	public Class335 aClass335_1;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
	public int anInt4418 = 0;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
	public int anInt4417 = 0;

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
	private int anInt4425 = -1;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
	private int anInt4421 = -1;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "Ljava/lang/String;")
	private String aString52 = "";

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
	public int anInt4419 = 16777215;

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
	public int anInt4428 = 0;

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
	public int anInt4431 = -1;

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
	public int anInt4432 = -1;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
	private int anInt4424 = -1;

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
	public int anInt4423 = 70;

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
	public int anInt4434 = -1;

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
	private int anInt4433 = -1;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method3874(@OriginalArg(1) int arg0) {
		@Pc(13) String local13 = this.aString52;
		while (true) {
			@Pc(17) int local17 = local13.indexOf("%1");
			if (local17 < 0) {
				return local13;
			}
			local13 = local13.substring(0, local17) + Static372.method7365(false, arg0) + local13.substring(local17 + 2);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!ha;)V")
	private void method3875(@OriginalArg(1) Class100 arg0) {
		@Pc(7) Class353 local7 = this.aClass335_1.aClass353_117;
		@Pc(33) Class98 local33;
		if (this.anInt4421 >= 0 && this.aClass335_1.aClass166_57.method4805((long) this.anInt4421) == null && local7.method8401(this.anInt4421)) {
			local33 = Static651.method2396(local7, this.anInt4421);
			this.aClass335_1.aClass166_57.method4803(arg0.method8773(local33, true), (long) this.anInt4421);
		}
		if (this.anInt4425 >= 0 && this.aClass335_1.aClass166_57.method4805((long) this.anInt4425) == null && local7.method8401(this.anInt4425)) {
			local33 = Static651.method2396(local7, this.anInt4425);
			this.aClass335_1.aClass166_57.method4803(arg0.method8773(local33, true), (long) this.anInt4425);
		}
		if (this.anInt4424 >= 0 && this.aClass335_1.aClass166_57.method4805((long) this.anInt4424) == null && local7.method8401(this.anInt4424)) {
			local33 = Static651.method2396(local7, this.anInt4424);
			this.aClass335_1.aClass166_57.method4803(arg0.method8773(local33, true), (long) this.anInt4424);
		}
		if (this.anInt4433 >= 0 && this.aClass335_1.aClass166_57.method4805((long) this.anInt4433) == null && local7.method8401(this.anInt4433)) {
			local33 = Static651.method2396(local7, this.anInt4433);
			this.aClass335_1.aClass166_57.method4803(arg0.method8773(local33, true), (long) this.anInt4433);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLclient!ha;)Lclient!pga;")
	public Class32 method3876(@OriginalArg(1) Class100 arg0) {
		if (this.anInt4425 < 0) {
			return null;
		}
		@Pc(26) Class32 local26 = (Class32) this.aClass335_1.aClass166_57.method4805((long) this.anInt4425);
		if (local26 == null) {
			this.method3875(arg0);
			local26 = (Class32) this.aClass335_1.aClass166_57.method4805((long) this.anInt4425);
		}
		return local26;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!rg;I)V")
	public void method3877(@OriginalArg(0) Class6_Sub40 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8604();
			if (local5 == 0) {
				return;
			}
			this.method3879(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLclient!rg;I)V")
	private void method3879(@OriginalArg(1) Class6_Sub40 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4432 = arg0.method8571();
		} else if (arg1 == 2) {
			this.anInt4419 = arg0.method8606();
		} else if (arg1 == 3) {
			this.anInt4421 = arg0.method8571();
		} else if (arg1 == 4) {
			this.anInt4424 = arg0.method8571();
		} else if (arg1 == 5) {
			this.anInt4425 = arg0.method8571();
		} else if (arg1 == 6) {
			this.anInt4433 = arg0.method8571();
		} else if (arg1 == 7) {
			this.anInt4417 = arg0.method8615();
		} else if (arg1 == 8) {
			this.aString52 = arg0.method8555();
		} else if (arg1 == 9) {
			this.anInt4423 = arg0.method8571();
		} else if (arg1 == 10) {
			this.anInt4418 = arg0.method8615();
		} else if (arg1 == 11) {
			this.anInt4434 = 0;
		} else if (arg1 == 12) {
			this.anInt4431 = arg0.method8604();
		} else if (arg1 == 13) {
			this.anInt4428 = arg0.method8615();
		} else if (arg1 == 14) {
			this.anInt4434 = arg0.method8571();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ha;B)Lclient!pga;")
	public Class32 method3881(@OriginalArg(0) Class100 arg0) {
		if (this.anInt4424 < 0) {
			return null;
		}
		@Pc(26) Class32 local26 = (Class32) this.aClass335_1.aClass166_57.method4805((long) this.anInt4424);
		if (local26 == null) {
			this.method3875(arg0);
			local26 = (Class32) this.aClass335_1.aClass166_57.method4805((long) this.anInt4424);
		}
		return local26;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(ILclient!ha;)Lclient!pga;")
	public Class32 method3882(@OriginalArg(1) Class100 arg0) {
		if (this.anInt4433 < 0) {
			return null;
		}
		@Pc(19) Class32 local19 = (Class32) this.aClass335_1.aClass166_57.method4805((long) this.anInt4433);
		if (local19 == null) {
			this.method3875(arg0);
			local19 = (Class32) this.aClass335_1.aClass166_57.method4805((long) this.anInt4433);
		}
		return local19;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ha;Z)Lclient!pga;")
	public Class32 method3883(@OriginalArg(0) Class100 arg0) {
		if (this.anInt4421 < 0) {
			return null;
		}
		@Pc(21) Class32 local21 = (Class32) this.aClass335_1.aClass166_57.method4805((long) this.anInt4421);
		if (local21 == null) {
			this.method3875(arg0);
			local21 = (Class32) this.aClass335_1.aClass166_57.method4805((long) this.anInt4421);
		}
		return local21;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uha")
public final class Class342 {

	@OriginalMember(owner = "client!uha", name = "j", descriptor = "[C")
	private static final char[] aCharArray8 = new char[64];

	@OriginalMember(owner = "client!uha", name = "u", descriptor = "I")
	public int anInt10243;

	@OriginalMember(owner = "client!uha", name = "m", descriptor = "Z")
	public boolean aBoolean698 = false;

	@OriginalMember(owner = "client!uha", name = "h", descriptor = "Lclient!jr;")
	private Class169 aClass169_64 = new Class169(64);

	@OriginalMember(owner = "client!uha", name = "r", descriptor = "Lclient!jr;")
	public final Class169 aClass169_65 = new Class169(500);

	@OriginalMember(owner = "client!uha", name = "s", descriptor = "Lclient!jr;")
	public final Class169 aClass169_66 = new Class169(30);

	@OriginalMember(owner = "client!uha", name = "t", descriptor = "Lclient!jr;")
	public final Class169 aClass169_67 = new Class169(50);

	@OriginalMember(owner = "client!uha", name = "q", descriptor = "Z")
	public boolean aBoolean699;

	@OriginalMember(owner = "client!uha", name = "c", descriptor = "Lclient!in;")
	public final Class157 aClass157_286;

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "Lclient!in;")
	private final Class157 aClass157_285;

	static {
		for (@Pc(7) int local7 = 0; local7 < 26; local7++) {
			aCharArray8[local7] = (char) (local7 + 65);
		}
		for (@Pc(23) int local23 = 26; local23 < 52; local23++) {
			aCharArray8[local23] = (char) (local23 + 97 - 26);
		}
		for (@Pc(39) int local39 = 52; local39 < 62; local39++) {
			aCharArray8[local39] = (char) (local39 + 48 - 52);
		}
		aCharArray8[62] = '+';
		aCharArray8[63] = '/';
	}

	@OriginalMember(owner = "client!uha", name = "<init>", descriptor = "(Lclient!sj;IZLclient!in;Lclient!in;)V")
	public Class342(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class157 arg3, @OriginalArg(4) Class157 arg4) {
		this.aBoolean699 = arg2;
		this.aClass157_286 = arg4;
		this.aClass157_285 = arg3;
		if (this.aClass157_285 != null) {
			@Pc(47) int local47 = this.aClass157_285.method4568() - 1;
			this.aClass157_285.method4561(local47);
		}
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(ZB)V")
	public void method8533(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean699) {
			this.aBoolean699 = arg0;
			this.method8541();
		}
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(II)Lclient!iv;")
	public Class161 method8534(@OriginalArg(1) int arg0) {
		@Pc(6) Class169 local6 = this.aClass169_64;
		@Pc(18) Class161 local18;
		synchronized (this.aClass169_64) {
			local18 = (Class161) this.aClass169_64.method5002((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class157 local31 = this.aClass157_285;
		@Pc(46) byte[] local46;
		synchronized (this.aClass157_285) {
			local46 = this.aClass157_285.method4564(Static167.method3599(arg0), Static65.method9241(arg0));
		}
		local18 = new Class161();
		local18.anInt5398 = arg0;
		local18.aClass342_4 = this;
		if (local46 != null) {
			local18.method4605(new Class2_Sub11(local46));
		}
		local18.method4614();
		if (!this.aBoolean699 && local18.aBoolean409) {
			local18.anIntArray286 = null;
			local18.aStringArray19 = null;
		}
		if (local18.aBoolean396) {
			local18.anInt5386 = 0;
			local18.aBoolean399 = false;
		}
		@Pc(103) Class169 local103 = this.aClass169_64;
		synchronized (this.aClass169_64) {
			this.aClass169_64.method5001(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)V")
	public void method8535() {
		@Pc(10) Class169 local10 = this.aClass169_64;
		synchronized (this.aClass169_64) {
			this.aClass169_64.method5006();
		}
		local10 = this.aClass169_65;
		synchronized (this.aClass169_65) {
			this.aClass169_65.method5006();
		}
		local10 = this.aClass169_66;
		synchronized (this.aClass169_66) {
			this.aClass169_66.method5006();
		}
		local10 = this.aClass169_67;
		synchronized (this.aClass169_67) {
			this.aClass169_67.method5006();
		}
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(IZ)V")
	public void method8537(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean698 != arg0) {
			this.aBoolean698 = arg0;
			this.method8541();
		}
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(IB)V")
	public void method8538(@OriginalArg(0) int arg0) {
		this.anInt10243 = arg0;
		@Pc(9) Class169 local9 = this.aClass169_65;
		synchronized (this.aClass169_65) {
			this.aClass169_65.method5009();
		}
		local9 = this.aClass169_66;
		synchronized (this.aClass169_66) {
			this.aClass169_66.method5009();
		}
		local9 = this.aClass169_67;
		synchronized (this.aClass169_67) {
			this.aClass169_67.method5009();
		}
	}

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "(II)V")
	public void method8539() {
		@Pc(6) Class169 local6 = this.aClass169_64;
		synchronized (this.aClass169_64) {
			this.aClass169_64.method4997(5);
		}
		local6 = this.aClass169_65;
		synchronized (this.aClass169_65) {
			this.aClass169_65.method4997(5);
		}
		local6 = this.aClass169_66;
		synchronized (this.aClass169_66) {
			this.aClass169_66.method4997(5);
		}
		local6 = this.aClass169_67;
		synchronized (this.aClass169_67) {
			this.aClass169_67.method4997(5);
		}
	}

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "(I)V")
	public void method8541() {
		@Pc(2) Class169 local2 = this.aClass169_64;
		synchronized (this.aClass169_64) {
			this.aClass169_64.method5009();
		}
		local2 = this.aClass169_65;
		synchronized (this.aClass169_65) {
			this.aClass169_65.method5009();
		}
		local2 = this.aClass169_66;
		synchronized (this.aClass169_66) {
			this.aClass169_66.method5009();
		}
		local2 = this.aClass169_67;
		synchronized (this.aClass169_67) {
			this.aClass169_67.method5009();
		}
	}

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "(IZ)V")
	public void method8543(@OriginalArg(0) int arg0) {
		this.aClass169_64 = new Class169(arg0);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class326 {

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
	public int anInt8856;

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "Lclient!mf;")
	private final Class222 aClass222_59 = new Class222(64);

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "Lclient!mf;")
	public final Class222 aClass222_60 = new Class222(50);

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "Lclient!mf;")
	public final Class222 aClass222_61 = new Class222(5);

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "Z")
	public boolean aBoolean686;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "Lclient!pu;")
	public final Class270 aClass270_109;

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "Lclient!kr;")
	public final Class195 aClass195_5;

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "Lclient!pu;")
	private final Class270 aClass270_110;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!kr;IZLclient!pu;Lclient!pu;)V")
	public Class326(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class270 arg3, @OriginalArg(4) Class270 arg4) {
		this.aBoolean686 = arg2;
		this.aClass270_109 = arg4;
		this.aClass195_5 = arg0;
		this.aClass270_110 = arg3;
		if (this.aClass270_110 != null) {
			@Pc(41) int local41 = this.aClass270_110.method5674() - 1;
			this.aClass270_110.method5685(local41);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)Lclient!av;")
	public Class20 method7234(@OriginalArg(0) int arg0) {
		@Pc(6) Class222 local6 = this.aClass222_59;
		@Pc(16) Class20 local16;
		synchronized (this.aClass222_59) {
			local16 = (Class20) this.aClass222_59.method4430((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class270 local29 = this.aClass270_110;
		@Pc(42) byte[] local42;
		synchronized (this.aClass270_110) {
			local42 = this.aClass270_110.method5704(Static485.method6556(arg0), Static190.method2929(arg0));
		}
		local16 = new Class20();
		local16.anInt332 = arg0;
		local16.aClass326_1 = this;
		if (local42 != null) {
			local16.method285(new Class1_Sub35(local42));
		}
		local16.method275();
		@Pc(79) Class222 local79 = this.aClass222_59;
		synchronized (this.aClass222_59) {
			this.aClass222_59.method4434(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
	public void method7236() {
		@Pc(12) Class222 local12 = this.aClass222_59;
		synchronized (this.aClass222_59) {
			this.aClass222_59.method4422();
		}
		local12 = this.aClass222_60;
		synchronized (this.aClass222_60) {
			this.aClass222_60.method4422();
		}
		local12 = this.aClass222_61;
		synchronized (this.aClass222_61) {
			this.aClass222_61.method4422();
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZ)V")
	public void method7237(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean686 != arg0) {
			this.aBoolean686 = arg0;
			this.method7241();
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)V")
	public void method7239(@OriginalArg(1) int arg0) {
		this.anInt8856 = arg0;
		@Pc(9) Class222 local9 = this.aClass222_60;
		synchronized (this.aClass222_60) {
			this.aClass222_60.method4428();
		}
		local9 = this.aClass222_61;
		synchronized (this.aClass222_61) {
			this.aClass222_61.method4428();
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(IB)V")
	public void method7240() {
		@Pc(6) Class222 local6 = this.aClass222_59;
		synchronized (this.aClass222_59) {
			this.aClass222_59.method4433(5);
		}
		local6 = this.aClass222_60;
		synchronized (this.aClass222_60) {
			this.aClass222_60.method4433(5);
		}
		local6 = this.aClass222_61;
		synchronized (this.aClass222_61) {
			this.aClass222_61.method4433(5);
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	public void method7241() {
		@Pc(6) Class222 local6 = this.aClass222_59;
		synchronized (this.aClass222_59) {
			this.aClass222_59.method4428();
		}
		local6 = this.aClass222_60;
		synchronized (this.aClass222_60) {
			this.aClass222_60.method4428();
		}
		local6 = this.aClass222_61;
		synchronized (this.aClass222_61) {
			this.aClass222_61.method4428();
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	public void method7243() {
		@Pc(2) Class222 local2 = this.aClass222_60;
		synchronized (this.aClass222_60) {
			this.aClass222_60.method4428();
		}
		@Pc(29) Class222 local29 = this.aClass222_61;
		synchronized (this.aClass222_61) {
			this.aClass222_61.method4428();
		}
	}
}

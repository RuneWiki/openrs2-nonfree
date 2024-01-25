import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jia")
public final class Class182 {

	@OriginalMember(owner = "client!jia", name = "k", descriptor = "Lclient!wga;")
	private Class380 aClass380_1;

	@OriginalMember(owner = "client!jia", name = "l", descriptor = "I")
	private volatile int anInt5024;

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "Lclient!an;")
	private final Class19 aClass19_6 = new Class19();

	@OriginalMember(owner = "client!jia", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString42;

	@OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class182(@OriginalArg(0) String arg0) {
		this.aString42 = arg0;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(Z)Lclient!nfa;")
	public Class16 method4406() {
		@Pc(8) Class19 local8 = this.aClass19_6;
		synchronized (this.aClass19_6) {
			@Pc(15) Class16 local15 = this.aClass19_6.method562();
			local15.method8874();
			this.anInt5024--;
			return local15;
		}
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(ILclient!rba;)V")
	public void method4407(@OriginalArg(1) Class16_Sub1 arg0) {
		arg0.aBoolean583 = true;
		@Pc(17) Class19 local17 = this.aClass19_6;
		synchronized (this.aClass19_6) {
			this.aClass19_6.method566(arg0);
			this.anInt5024++;
		}
		if (this.aClass380_1 != null) {
			@Pc(42) Class380 local42 = this.aClass380_1;
			synchronized (this.aClass380_1) {
				this.aClass380_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(B)Z")
	public boolean method4408() {
		return this.anInt5024 == 0;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(BLclient!wga;)V")
	public void method4409(@OriginalArg(1) Class380 arg0) {
		this.aClass380_1 = arg0;
	}

	@OriginalMember(owner = "client!jia", name = "b", descriptor = "(ILclient!rba;)V")
	public void method4411(@OriginalArg(1) Class16_Sub1 arg0) {
		arg0.aBoolean583 = false;
		@Pc(9) Class19 local9 = this.aClass19_6;
		synchronized (this.aClass19_6) {
			this.aClass19_6.method566(arg0);
			this.anInt5024++;
		}
		if (this.aClass380_1 != null) {
			@Pc(40) Class380 local40 = this.aClass380_1;
			synchronized (this.aClass380_1) {
				this.aClass380_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(Lclient!ir;Z)V")
	public void method4412(@OriginalArg(0) Class16_Sub3 arg0) {
		@Pc(2) Class19 local2 = this.aClass19_6;
		synchronized (this.aClass19_6) {
			this.aClass19_6.method566(arg0);
			this.anInt5024++;
		}
		if (this.aClass380_1 != null) {
			@Pc(37) Class380 local37 = this.aClass380_1;
			synchronized (this.aClass380_1) {
				this.aClass380_1.notify();
			}
		}
	}
}

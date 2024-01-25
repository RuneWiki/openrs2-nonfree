import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class291 {

	@OriginalMember(owner = "client!re", name = "k", descriptor = "I")
	private volatile int anInt8464;

	@OriginalMember(owner = "client!re", name = "m", descriptor = "Lclient!bi;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "Lclient!fw;")
	private final Class120 aClass120_5 = new Class120();

	@OriginalMember(owner = "client!re", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString96;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class291(@OriginalArg(0) String arg0) {
		this.aString96 = arg0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!dp;)V")
	public void method7259(@OriginalArg(1) Class4_Sub3 arg0) {
		@Pc(2) Class120 local2 = this.aClass120_5;
		synchronized (this.aClass120_5) {
			this.aClass120_5.method2960(arg0);
			this.anInt8464++;
		}
		if (this.aClass33_1 != null) {
			@Pc(39) Class33 local39 = this.aClass33_1;
			synchronized (this.aClass33_1) {
				this.aClass33_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!bi;I)V")
	public void method7260(@OriginalArg(0) Class33 arg0) {
		this.aClass33_1 = arg0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)Z")
	public boolean method7262() {
		return this.anInt8464 == 0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZLclient!jw;)V")
	public void method7263(@OriginalArg(1) Class4_Sub1 arg0) {
		arg0.aBoolean638 = false;
		@Pc(9) Class120 local9 = this.aClass120_5;
		synchronized (this.aClass120_5) {
			this.aClass120_5.method2960(arg0);
			this.anInt8464++;
		}
		if (this.aClass33_1 != null) {
			@Pc(38) Class33 local38 = this.aClass33_1;
			synchronized (this.aClass33_1) {
				this.aClass33_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)Lclient!cda;")
	public Class4 method7265() {
		@Pc(8) Class120 local8 = this.aClass120_5;
		synchronized (this.aClass120_5) {
			@Pc(17) Class4 local17 = this.aClass120_5.method2966();
			local17.method7841();
			this.anInt8464--;
			return local17;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!jw;)V")
	public void method7266(@OriginalArg(1) Class4_Sub1 arg0) {
		arg0.aBoolean638 = true;
		@Pc(9) Class120 local9 = this.aClass120_5;
		synchronized (this.aClass120_5) {
			this.aClass120_5.method2960(arg0);
			this.anInt8464++;
		}
		if (this.aClass33_1 != null) {
			@Pc(42) Class33 local42 = this.aClass33_1;
			synchronized (this.aClass33_1) {
				this.aClass33_1.notify();
			}
		}
	}
}

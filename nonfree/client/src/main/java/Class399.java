import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class399 {

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
	private volatile int anInt11166;

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "Lclient!gu;")
	private Class143 aClass143_1;

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "Lclient!pda;")
	private final Class283 aClass283_15 = new Class283();

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString124;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class399(@OriginalArg(0) String arg0) {
		this.aString124 = arg0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!haa;I)V")
	public void method9461(@OriginalArg(0) Class4_Sub3 arg0) {
		arg0.aBoolean778 = false;
		@Pc(17) Class283 local17 = this.aClass283_15;
		synchronized (this.aClass283_15) {
			this.aClass283_15.method6802(arg0);
			this.anInt11166++;
		}
		if (this.aClass143_1 != null) {
			@Pc(42) Class143 local42 = this.aClass143_1;
			synchronized (this.aClass143_1) {
				this.aClass143_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)Lclient!uo;")
	public Class4 method9462() {
		@Pc(8) Class283 local8 = this.aClass283_15;
		synchronized (this.aClass283_15) {
			@Pc(15) Class4 local15 = this.aClass283_15.method6791();
			local15.method9473();
			this.anInt11166--;
			return local15;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!gu;B)V")
	public void method9463(@OriginalArg(0) Class143 arg0) {
		this.aClass143_1 = arg0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BLclient!haa;)V")
	public void method9465(@OriginalArg(1) Class4_Sub3 arg0) {
		arg0.aBoolean778 = true;
		@Pc(9) Class283 local9 = this.aClass283_15;
		synchronized (this.aClass283_15) {
			this.aClass283_15.method6802(arg0);
			this.anInt11166++;
		}
		if (this.aClass143_1 != null) {
			@Pc(40) Class143 local40 = this.aClass143_1;
			synchronized (this.aClass143_1) {
				this.aClass143_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!wk;Z)V")
	public void method9466(@OriginalArg(0) Class4_Sub10 arg0) {
		@Pc(2) Class283 local2 = this.aClass283_15;
		synchronized (this.aClass283_15) {
			this.aClass283_15.method6802(arg0);
			this.anInt11166++;
		}
		if (this.aClass143_1 != null) {
			@Pc(31) Class143 local31 = this.aClass143_1;
			synchronized (this.aClass143_1) {
				this.aClass143_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)Z")
	public boolean method9468() {
		return this.anInt11166 == 0;
	}
}

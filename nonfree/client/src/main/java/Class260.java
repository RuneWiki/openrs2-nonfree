import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class260 {

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
	private volatile int anInt7916;

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "Lclient!lk;")
	private Class188 aClass188_1;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "Lclient!o;")
	private final Class234 aClass234_9 = new Class234();

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "Ljava/lang/String;")
	public final String aString83;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class260(@OriginalArg(0) String arg0) {
		this.aString83 = arg0;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)Lclient!pha;")
	public Class9 method6661() {
		@Pc(8) Class234 local8 = this.aClass234_9;
		synchronized (this.aClass234_9) {
			@Pc(15) Class9 local15 = this.aClass234_9.method6092();
			local15.method8408();
			this.anInt7916--;
			return local15;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!lk;Z)V")
	public void method6662(@OriginalArg(0) Class188 arg0) {
		this.aClass188_1 = arg0;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLclient!gg;)V")
	public void method6663(@OriginalArg(1) Class9_Sub4 arg0) {
		arg0.aBoolean815 = true;
		@Pc(17) Class234 local17 = this.aClass234_9;
		synchronized (this.aClass234_9) {
			this.aClass234_9.method6097(arg0);
			this.anInt7916++;
		}
		if (this.aClass188_1 != null) {
			@Pc(42) Class188 local42 = this.aClass188_1;
			synchronized (this.aClass188_1) {
				this.aClass188_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)Z")
	public boolean method6664() {
		return this.anInt7916 == 0;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!gg;I)V")
	public void method6665(@OriginalArg(0) Class9_Sub4 arg0) {
		arg0.aBoolean815 = false;
		@Pc(9) Class234 local9 = this.aClass234_9;
		synchronized (this.aClass234_9) {
			this.aClass234_9.method6097(arg0);
			this.anInt7916++;
		}
		if (this.aClass188_1 != null) {
			@Pc(40) Class188 local40 = this.aClass188_1;
			synchronized (this.aClass188_1) {
				this.aClass188_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLclient!qe;)V")
	public void method6666(@OriginalArg(1) Class9_Sub10 arg0) {
		@Pc(2) Class234 local2 = this.aClass234_9;
		synchronized (this.aClass234_9) {
			this.aClass234_9.method6097(arg0);
			this.anInt7916++;
		}
		if (this.aClass188_1 != null) {
			@Pc(31) Class188 local31 = this.aClass188_1;
			synchronized (this.aClass188_1) {
				this.aClass188_1.notify();
			}
		}
	}
}

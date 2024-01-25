import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bka")
public final class Class40 {

	@OriginalMember(owner = "client!bka", name = "h", descriptor = "I")
	private volatile int anInt1039;

	@OriginalMember(owner = "client!bka", name = "o", descriptor = "Lclient!sw;")
	private Class329 aClass329_1;

	@OriginalMember(owner = "client!bka", name = "d", descriptor = "Lclient!bt;")
	private final Class43 aClass43_2 = new Class43();

	@OriginalMember(owner = "client!bka", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString17;

	@OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class40(@OriginalArg(0) String arg0) {
		this.aString17 = arg0;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(ZLclient!sw;)V")
	public void method972(@OriginalArg(1) Class329 arg0) {
		this.aClass329_1 = arg0;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(BLclient!oq;)V")
	public void method973(@OriginalArg(1) Class2_Sub1 arg0) {
		arg0.aBoolean701 = true;
		@Pc(9) Class43 local9 = this.aClass43_2;
		synchronized (this.aClass43_2) {
			this.aClass43_2.method1084(arg0);
			this.anInt1039++;
		}
		if (this.aClass329_1 != null) {
			@Pc(34) Class329 local34 = this.aClass329_1;
			synchronized (this.aClass329_1) {
				this.aClass329_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(ILclient!oq;)V")
	public void method974(@OriginalArg(1) Class2_Sub1 arg0) {
		arg0.aBoolean701 = false;
		@Pc(9) Class43 local9 = this.aClass43_2;
		synchronized (this.aClass43_2) {
			this.aClass43_2.method1084(arg0);
			this.anInt1039++;
		}
		if (this.aClass329_1 != null) {
			@Pc(40) Class329 local40 = this.aClass329_1;
			synchronized (this.aClass329_1) {
				this.aClass329_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(B)Z")
	public boolean method976() {
		return this.anInt1039 == 0;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(I)Lclient!ri;")
	public Class2 method977() {
		@Pc(8) Class43 local8 = this.aClass43_2;
		synchronized (this.aClass43_2) {
			@Pc(15) Class2 local15 = this.aClass43_2.method1087();
			local15.method8436();
			this.anInt1039--;
			return local15;
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(Lclient!th;I)V")
	public void method978(@OriginalArg(0) Class2_Sub10 arg0) {
		@Pc(2) Class43 local2 = this.aClass43_2;
		synchronized (this.aClass43_2) {
			this.aClass43_2.method1084(arg0);
			this.anInt1039++;
		}
		if (this.aClass329_1 != null) {
			@Pc(39) Class329 local39 = this.aClass329_1;
			synchronized (this.aClass329_1) {
				this.aClass329_1.notify();
			}
		}
	}
}

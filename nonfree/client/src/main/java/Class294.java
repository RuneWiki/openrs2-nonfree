import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class294 {

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
	private volatile int anInt8075;

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "Lclient!ui;")
	private Class328 aClass328_1;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "Lclient!vu;")
	private final Class349 aClass349_15 = new Class349();

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "Ljava/lang/String;")
	public final String aString83;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class294(@OriginalArg(0) String arg0) {
		this.aString83 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZLclient!su;)V")
	public void method6716(@OriginalArg(1) Class20_Sub9 arg0) {
		@Pc(10) Class349 local10 = this.aClass349_15;
		synchronized (this.aClass349_15) {
			this.aClass349_15.method7655(arg0);
			this.anInt8075++;
		}
		if (this.aClass328_1 != null) {
			@Pc(35) Class328 local35 = this.aClass328_1;
			synchronized (this.aClass328_1) {
				this.aClass328_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)Lclient!cv;")
	public Class20 method6718() {
		@Pc(14) Class349 local14 = this.aClass349_15;
		synchronized (this.aClass349_15) {
			@Pc(21) Class20 local21 = this.aClass349_15.method7653();
			local21.method7704();
			this.anInt8075--;
			return local21;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!ir;B)V")
	public void method6719(@OriginalArg(0) Class20_Sub2 arg0) {
		arg0.aBoolean644 = false;
		@Pc(9) Class349 local9 = this.aClass349_15;
		synchronized (this.aClass349_15) {
			this.aClass349_15.method7655(arg0);
			this.anInt8075++;
		}
		if (this.aClass328_1 != null) {
			@Pc(42) Class328 local42 = this.aClass328_1;
			synchronized (this.aClass328_1) {
				this.aClass328_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLclient!ui;)V")
	public void method6721(@OriginalArg(1) Class328 arg0) {
		this.aClass328_1 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)Z")
	public boolean method6722() {
		return this.anInt8075 == 0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLclient!ir;)V")
	public void method6723(@OriginalArg(1) Class20_Sub2 arg0) {
		arg0.aBoolean644 = true;
		@Pc(16) Class349 local16 = this.aClass349_15;
		synchronized (this.aClass349_15) {
			this.aClass349_15.method7655(arg0);
			this.anInt8075++;
		}
		if (this.aClass328_1 != null) {
			@Pc(41) Class328 local41 = this.aClass328_1;
			synchronized (this.aClass328_1) {
				this.aClass328_1.notify();
			}
		}
	}
}

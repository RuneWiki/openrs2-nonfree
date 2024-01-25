import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class250 {

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "Lclient!sb;")
	private Class301 aClass301_1;

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
	private volatile int anInt7179;

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "Lclient!hca;")
	private final Class139 aClass139_11 = new Class139();

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString53;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class250(@OriginalArg(0) String arg0) {
		this.aString53 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLclient!li;)V")
	public void method6321(@OriginalArg(1) Class9_Sub7 arg0) {
		@Pc(2) Class139 local2 = this.aClass139_11;
		synchronized (this.aClass139_11) {
			this.aClass139_11.method3203(arg0);
			this.anInt7179++;
		}
		if (this.aClass301_1 != null) {
			@Pc(39) Class301 local39 = this.aClass301_1;
			synchronized (this.aClass301_1) {
				this.aClass301_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!uq;)V")
	public void method6322(@OriginalArg(1) Class9_Sub2 arg0) {
		arg0.aBoolean769 = false;
		@Pc(9) Class139 local9 = this.aClass139_11;
		synchronized (this.aClass139_11) {
			this.aClass139_11.method3203(arg0);
			this.anInt7179++;
		}
		if (this.aClass301_1 != null) {
			@Pc(34) Class301 local34 = this.aClass301_1;
			synchronized (this.aClass301_1) {
				this.aClass301_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)Lclient!mg;")
	public Class9 method6324() {
		@Pc(14) Class139 local14 = this.aClass139_11;
		synchronized (this.aClass139_11) {
			@Pc(21) Class9 local21 = this.aClass139_11.method3198();
			local21.method8593();
			this.anInt7179--;
			return local21;
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)Z")
	public boolean method6326() {
		return this.anInt7179 == 0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLclient!uq;)V")
	public void method6328(@OriginalArg(1) Class9_Sub2 arg0) {
		arg0.aBoolean769 = true;
		@Pc(9) Class139 local9 = this.aClass139_11;
		synchronized (this.aClass139_11) {
			this.aClass139_11.method3203(arg0);
			this.anInt7179++;
		}
		if (this.aClass301_1 != null) {
			@Pc(40) Class301 local40 = this.aClass301_1;
			synchronized (this.aClass301_1) {
				this.aClass301_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!sb;B)V")
	public void method6330(@OriginalArg(0) Class301 arg0) {
		this.aClass301_1 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class350 {

	@OriginalMember(owner = "client!ut", name = "j", descriptor = "Lclient!re;")
	private Class301 aClass301_1;

	@OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
	private volatile int anInt9623;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "Lclient!vm;")
	private final Class363 aClass363_9 = new Class363();

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString132;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class350(@OriginalArg(0) String arg0) {
		this.aString132 = arg0;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILclient!f;)V")
	public void method8250(@OriginalArg(1) Class14_Sub6 arg0) {
		@Pc(2) Class363 local2 = this.aClass363_9;
		synchronized (this.aClass363_9) {
			this.aClass363_9.method8480(arg0);
			this.anInt9623++;
		}
		if (this.aClass301_1 != null) {
			@Pc(37) Class301 local37 = this.aClass301_1;
			synchronized (this.aClass301_1) {
				this.aClass301_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)Z")
	public boolean method8251() {
		return this.anInt9623 == 0;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZLclient!kf;)V")
	public void method8252(@OriginalArg(1) Class14_Sub1 arg0) {
		arg0.aBoolean760 = false;
		@Pc(9) Class363 local9 = this.aClass363_9;
		synchronized (this.aClass363_9) {
			this.aClass363_9.method8480(arg0);
			this.anInt9623++;
		}
		if (this.aClass301_1 != null) {
			@Pc(34) Class301 local34 = this.aClass301_1;
			synchronized (this.aClass301_1) {
				this.aClass301_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!kf;B)V")
	public void method8253(@OriginalArg(0) Class14_Sub1 arg0) {
		arg0.aBoolean760 = true;
		@Pc(17) Class363 local17 = this.aClass363_9;
		synchronized (this.aClass363_9) {
			this.aClass363_9.method8480(arg0);
			this.anInt9623++;
		}
		if (this.aClass301_1 != null) {
			@Pc(42) Class301 local42 = this.aClass301_1;
			synchronized (this.aClass301_1) {
				this.aClass301_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)Lclient!va;")
	public Class14 method8254() {
		@Pc(16) Class363 local16 = this.aClass363_9;
		synchronized (this.aClass363_9) {
			@Pc(23) Class14 local23 = this.aClass363_9.method8484();
			local23.method8904();
			this.anInt9623--;
			return local23;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!re;Z)V")
	public void method8256(@OriginalArg(0) Class301 arg0) {
		this.aClass301_1 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public final class Class198 {

	@OriginalMember(owner = "client!kba", name = "h", descriptor = "I")
	private volatile int anInt5668;

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "Lclient!mja;")
	private Class240 aClass240_1;

	@OriginalMember(owner = "client!kba", name = "l", descriptor = "Lclient!dda;")
	private final Class66 aClass66_6 = new Class66();

	@OriginalMember(owner = "client!kba", name = "j", descriptor = "Ljava/lang/String;")
	public final String aString91;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class198(@OriginalArg(0) String arg0) {
		this.aString91 = arg0;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!mja;I)V")
	public void method4815(@OriginalArg(0) Class240 arg0) {
		this.aClass240_1 = arg0;
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(ILclient!bla;)V")
	public void method4816(@OriginalArg(1) Class19_Sub1 arg0) {
		arg0.aBoolean808 = true;
		@Pc(14) Class66 local14 = this.aClass66_6;
		synchronized (this.aClass66_6) {
			this.aClass66_6.method1375(arg0);
			this.anInt5668++;
		}
		if (this.aClass240_1 != null) {
			@Pc(39) Class240 local39 = this.aClass240_1;
			synchronized (this.aClass240_1) {
				this.aClass240_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILclient!bla;)V")
	public void method4818(@OriginalArg(1) Class19_Sub1 arg0) {
		arg0.aBoolean808 = false;
		@Pc(9) Class66 local9 = this.aClass66_6;
		synchronized (this.aClass66_6) {
			this.aClass66_6.method1375(arg0);
			this.anInt5668++;
		}
		if (this.aClass240_1 != null) {
			@Pc(40) Class240 local40 = this.aClass240_1;
			synchronized (this.aClass240_1) {
				this.aClass240_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)Lclient!bfa;")
	public Class19 method4819() {
		@Pc(8) Class66 local8 = this.aClass66_6;
		synchronized (this.aClass66_6) {
			@Pc(17) Class19 local17 = this.aClass66_6.method1381();
			local17.method9359();
			this.anInt5668--;
			return local17;
		}
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(B)Z")
	public boolean method4821() {
		return this.anInt5668 == 0;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILclient!lha;)V")
	public void method4823(@OriginalArg(1) Class19_Sub7 arg0) {
		@Pc(15) Class66 local15 = this.aClass66_6;
		synchronized (this.aClass66_6) {
			this.aClass66_6.method1375(arg0);
			this.anInt5668++;
		}
		if (this.aClass240_1 != null) {
			@Pc(40) Class240 local40 = this.aClass240_1;
			synchronized (this.aClass240_1) {
				this.aClass240_1.notify();
			}
		}
	}
}

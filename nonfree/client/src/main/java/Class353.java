import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tba")
public final class Class353 {

	@OriginalMember(owner = "client!tba", name = "j", descriptor = "I")
	private volatile int anInt9232;

	@OriginalMember(owner = "client!tba", name = "k", descriptor = "Lclient!wk;")
	private Class405 aClass405_1;

	@OriginalMember(owner = "client!tba", name = "h", descriptor = "Lclient!qw;")
	private final Class319 aClass319_10 = new Class319();

	@OriginalMember(owner = "client!tba", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString117;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class353(@OriginalArg(0) String arg0) {
		this.aString117 = arg0;
	}

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)Lclient!vc;")
	public Class9 method7810() {
		@Pc(17) Class319 local17 = this.aClass319_10;
		synchronized (this.aClass319_10) {
			@Pc(24) Class9 local24 = this.aClass319_10.method7195();
			local24.method9182();
			this.anInt9232--;
			return local24;
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!wk;B)V")
	public void method7811(@OriginalArg(0) Class405 arg0) {
		this.aClass405_1 = arg0;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ILclient!ee;)V")
	public void method7812(@OriginalArg(1) Class9_Sub1 arg0) {
		arg0.aBoolean723 = false;
		@Pc(13) Class319 local13 = this.aClass319_10;
		synchronized (this.aClass319_10) {
			this.aClass319_10.method7196(arg0);
			this.anInt9232++;
		}
		if (this.aClass405_1 != null) {
			@Pc(38) Class405 local38 = this.aClass405_1;
			synchronized (this.aClass405_1) {
				this.aClass405_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)Z")
	public boolean method7813() {
		return this.anInt9232 == 0;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ILclient!qka;)V")
	public void method7814(@OriginalArg(1) Class9_Sub8 arg0) {
		@Pc(2) Class319 local2 = this.aClass319_10;
		synchronized (this.aClass319_10) {
			this.aClass319_10.method7196(arg0);
			this.anInt9232++;
		}
		if (this.aClass405_1 != null) {
			@Pc(35) Class405 local35 = this.aClass405_1;
			synchronized (this.aClass405_1) {
				this.aClass405_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(ILclient!ee;)V")
	public void method7815(@OriginalArg(1) Class9_Sub1 arg0) {
		arg0.aBoolean723 = true;
		@Pc(16) Class319 local16 = this.aClass319_10;
		synchronized (this.aClass319_10) {
			this.aClass319_10.method7196(arg0);
			this.anInt9232++;
		}
		if (this.aClass405_1 != null) {
			@Pc(43) Class405 local43 = this.aClass405_1;
			synchronized (this.aClass405_1) {
				this.aClass405_1.notify();
			}
		}
	}
}

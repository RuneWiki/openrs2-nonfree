import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class56 {

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "Lclient!ol;")
	private Class249 aClass249_1;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
	private volatile int anInt2282;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!wo;")
	private final Class375 aClass375_2 = new Class375();

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "Ljava/lang/String;")
	public final String aString16;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class56(@OriginalArg(0) String arg0) {
		this.aString16 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)Z")
	public boolean method2233() {
		return this.anInt2282 == 0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!mb;Z)V")
	public void method2234(@OriginalArg(0) Class2_Sub3 arg0) {
		arg0.aBoolean873 = true;
		@Pc(9) Class375 local9 = this.aClass375_2;
		synchronized (this.aClass375_2) {
			this.aClass375_2.method8639(arg0);
			this.anInt2282++;
		}
		if (this.aClass249_1 != null) {
			@Pc(40) Class249 local40 = this.aClass249_1;
			synchronized (this.aClass249_1) {
				this.aClass249_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)Lclient!cca;")
	public Class2 method2236() {
		@Pc(16) Class375 local16 = this.aClass375_2;
		synchronized (this.aClass375_2) {
			@Pc(23) Class2 local23 = this.aClass375_2.method8638();
			local23.method8558();
			this.anInt2282--;
			return local23;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!ol;B)V")
	public void method2238(@OriginalArg(0) Class249 arg0) {
		this.aClass249_1 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLclient!rg;)V")
	public void method2239(@OriginalArg(1) Class2_Sub8 arg0) {
		@Pc(13) Class375 local13 = this.aClass375_2;
		synchronized (this.aClass375_2) {
			this.aClass375_2.method8639(arg0);
			this.anInt2282++;
		}
		if (this.aClass249_1 != null) {
			@Pc(38) Class249 local38 = this.aClass249_1;
			synchronized (this.aClass249_1) {
				this.aClass249_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!mb;B)V")
	public void method2241(@OriginalArg(0) Class2_Sub3 arg0) {
		arg0.aBoolean873 = false;
		@Pc(9) Class375 local9 = this.aClass375_2;
		synchronized (this.aClass375_2) {
			this.aClass375_2.method8639(arg0);
			this.anInt2282++;
		}
		if (this.aClass249_1 != null) {
			@Pc(39) Class249 local39 = this.aClass249_1;
			synchronized (this.aClass249_1) {
				this.aClass249_1.notify();
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class181 {

	@OriginalMember(owner = "client!pp", name = "n", descriptor = "[I")
	public static final int[] anIntArray619 = new int[32];

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "Lclient!mq;")
	private Class154 aClass154_36 = new Class154(64);

	@OriginalMember(owner = "client!pp", name = "m", descriptor = "Lclient!mq;")
	public Class154 aClass154_37 = new Class154(64);

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "Lclient!fc;")
	private final Class71 aClass71_68;

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "Lclient!fc;")
	public final Class71 aClass71_69;

	static {
		@Pc(12) int local12 = 2;
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			anIntArray619[local14] = local12 - 1;
			local12 += local12;
		}
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!dk;ILclient!fc;Lclient!fc;)V")
	public Class181(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(3) Class71 arg3) {
		this.aClass71_68 = arg2;
		this.aClass71_69 = arg3;
		this.aClass71_68.method1580(34);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	public void method4315() {
		@Pc(6) Class154 local6 = this.aClass154_36;
		synchronized (this.aClass154_36) {
			this.aClass154_36.method3746();
		}
		local6 = this.aClass154_37;
		synchronized (this.aClass154_37) {
			this.aClass154_37.method3746();
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BI)V")
	public void method4318() {
		@Pc(6) Class154 local6 = this.aClass154_36;
		synchronized (this.aClass154_36) {
			this.aClass154_36.method3758(5);
		}
		local6 = this.aClass154_37;
		synchronized (this.aClass154_37) {
			this.aClass154_37.method3758(5);
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(BI)Lclient!lr;")
	public Class145 method4320(@OriginalArg(1) int arg0) {
		@Pc(6) Class154 local6 = this.aClass154_36;
		@Pc(16) Class145 local16;
		synchronized (this.aClass154_36) {
			local16 = (Class145) this.aClass154_36.method3751((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass71_68.method1555(34, arg0);
		local16 = new Class145();
		local16.aClass181_5 = this;
		if (local33 != null) {
			local16.method3543(new Class2_Sub13(local33));
		}
		@Pc(60) Class154 local60 = this.aClass154_36;
		synchronized (this.aClass154_36) {
			this.aClass154_36.method3745((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(III)V")
	public void method4321(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass154_36 = new Class154(arg0);
		this.aClass154_37 = new Class154(arg1);
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
	public void method4323() {
		@Pc(6) Class154 local6 = this.aClass154_36;
		synchronized (this.aClass154_36) {
			this.aClass154_36.method3748();
		}
		local6 = this.aClass154_37;
		synchronized (this.aClass154_37) {
			this.aClass154_37.method3748();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class33 {

	@OriginalMember(owner = "client!bea", name = "m", descriptor = "I")
	public int anInt855;

	@OriginalMember(owner = "client!bea", name = "k", descriptor = "Lclient!tb;")
	private final Class313 aClass313_8 = new Class313(64);

	@OriginalMember(owner = "client!bea", name = "l", descriptor = "Lclient!tb;")
	public final Class313 aClass313_9 = new Class313(60);

	@OriginalMember(owner = "client!bea", name = "j", descriptor = "Lclient!pl;")
	private final Class259 aClass259_20;

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "Lclient!pl;")
	public final Class259 aClass259_19;

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;Lclient!pl;)V")
	public Class33(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2, @OriginalArg(3) Class259 arg3) {
		this.aClass259_20 = arg2;
		this.aClass259_19 = arg3;
		@Pc(26) int local26 = this.aClass259_20.method5962() - 1;
		this.aClass259_20.method5969(local26);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)V")
	public void method581() {
		@Pc(12) Class313 local12 = this.aClass313_8;
		synchronized (this.aClass313_8) {
			this.aClass313_8.method6982(5);
		}
		local12 = this.aClass313_9;
		synchronized (this.aClass313_9) {
			this.aClass313_9.method6982(5);
		}
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)V")
	public void method585() {
		@Pc(10) Class313 local10 = this.aClass313_8;
		synchronized (this.aClass313_8) {
			this.aClass313_8.method6983();
		}
		local10 = this.aClass313_9;
		synchronized (this.aClass313_9) {
			this.aClass313_9.method6983();
		}
	}

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "(II)V")
	public void method586(@OriginalArg(1) int arg0) {
		this.anInt855 = arg0;
		@Pc(9) Class313 local9 = this.aClass313_9;
		synchronized (this.aClass313_9) {
			this.aClass313_9.method6977();
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(BI)Lclient!iv;")
	public Class167 method587(@OriginalArg(1) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_8;
		@Pc(16) Class167 local16;
		synchronized (this.aClass313_8) {
			local16 = (Class167) this.aClass313_8.method6989((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class259 local35 = this.aClass259_20;
		@Pc(52) byte[] local52;
		synchronized (this.aClass259_20) {
			local52 = this.aClass259_20.method5985(Static374.method5550(arg0), Static433.method6132(arg0));
		}
		local16 = new Class167();
		local16.aClass33_2 = this;
		local16.anInt4363 = arg0;
		if (local52 != null) {
			local16.method3640(new Class2_Sub15(local52));
		}
		@Pc(80) Class313 local80 = this.aClass313_8;
		synchronized (this.aClass313_8) {
			this.aClass313_8.method6980((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(B)V")
	public void method588() {
		@Pc(6) Class313 local6 = this.aClass313_8;
		synchronized (this.aClass313_8) {
			this.aClass313_8.method6977();
		}
		local6 = this.aClass313_9;
		synchronized (this.aClass313_9) {
			this.aClass313_9.method6977();
		}
	}
}

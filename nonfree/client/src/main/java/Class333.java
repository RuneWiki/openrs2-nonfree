import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public final class Class333 {

	@OriginalMember(owner = "client!tw", name = "m", descriptor = "I")
	public int anInt9683;

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "Lclient!of;")
	private final Class236 aClass236_92 = new Class236(64);

	@OriginalMember(owner = "client!tw", name = "l", descriptor = "Lclient!of;")
	public final Class236 aClass236_93 = new Class236(60);

	@OriginalMember(owner = "client!tw", name = "k", descriptor = "Lclient!oh;")
	private final Class237 aClass237_134;

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "Lclient!oh;")
	public final Class237 aClass237_133;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;Lclient!oh;)V")
	public Class333(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2, @OriginalArg(3) Class237 arg3) {
		this.aClass237_134 = arg2;
		this.aClass237_133 = arg3;
		@Pc(26) int local26 = this.aClass237_134.method6311() - 1;
		this.aClass237_134.method6315(local26);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)V")
	public void method7819(@OriginalArg(1) int arg0) {
		this.anInt9683 = arg0;
		@Pc(13) Class236 local13 = this.aClass236_93;
		synchronized (this.aClass236_93) {
			this.aClass236_93.method6253();
		}
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)V")
	public void method7820() {
		@Pc(2) Class236 local2 = this.aClass236_92;
		synchronized (this.aClass236_92) {
			this.aClass236_92.method6245();
		}
		local2 = this.aClass236_93;
		synchronized (this.aClass236_93) {
			this.aClass236_93.method6245();
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(BI)V")
	public void method7821() {
		@Pc(6) Class236 local6 = this.aClass236_92;
		synchronized (this.aClass236_92) {
			this.aClass236_92.method6243(5);
		}
		local6 = this.aClass236_93;
		synchronized (this.aClass236_93) {
			this.aClass236_93.method6243(5);
		}
	}

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "(I)V")
	public void method7822() {
		@Pc(10) Class236 local10 = this.aClass236_92;
		synchronized (this.aClass236_92) {
			this.aClass236_92.method6253();
		}
		local10 = this.aClass236_93;
		synchronized (this.aClass236_93) {
			this.aClass236_93.method6253();
		}
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(II)Lclient!dj;")
	public Class73 method7823(@OriginalArg(1) int arg0) {
		@Pc(6) Class236 local6 = this.aClass236_92;
		@Pc(16) Class73 local16;
		synchronized (this.aClass236_92) {
			local16 = (Class73) this.aClass236_92.method6242((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class237 local29 = this.aClass237_134;
		@Pc(42) byte[] local42;
		synchronized (this.aClass237_134) {
			local42 = this.aClass237_134.method6314(Static264.method4608(arg0), Static177.method3096(arg0));
		}
		local16 = new Class73();
		local16.aClass333_1 = this;
		local16.anInt2715 = arg0;
		if (local42 != null) {
			local16.method2304(new Class8_Sub8(local42));
		}
		@Pc(85) Class236 local85 = this.aClass236_92;
		synchronized (this.aClass236_92) {
			this.aClass236_92.method6241((long) arg0, local16);
			return local16;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rga")
public final class Class293 {

	@OriginalMember(owner = "client!rga", name = "j", descriptor = "Lclient!of;")
	private Class236 aClass236_81 = new Class236(64);

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "Lclient!oh;")
	private final Class237 aClass237_118;

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;)V")
	public Class293(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2) {
		this.aClass237_118 = arg2;
		if (this.aClass237_118 != null) {
			@Pc(20) int local20 = this.aClass237_118.method6311() - 1;
			this.aClass237_118.method6315(local20);
		}
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(II)V")
	public void method7161() {
		@Pc(10) Class236 local10 = this.aClass236_81;
		synchronized (this.aClass236_81) {
			this.aClass236_81.method6243(5);
		}
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)V")
	public void method7162() {
		@Pc(11) Class236 local11 = this.aClass236_81;
		synchronized (this.aClass236_81) {
			this.aClass236_81.method6245();
		}
	}

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(II)Lclient!mu;")
	public Class214 method7163(@OriginalArg(1) int arg0) {
		@Pc(6) Class236 local6 = this.aClass236_81;
		@Pc(16) Class214 local16;
		synchronized (this.aClass236_81) {
			local16 = (Class214) this.aClass236_81.method6242((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class237 local29 = this.aClass237_118;
		@Pc(44) byte[] local44;
		synchronized (this.aClass237_118) {
			local44 = this.aClass237_118.method6314(Static617.method8368(arg0), Static442.method6811(arg0));
		}
		local16 = new Class214();
		if (local44 != null) {
			local16.method5557(new Class8_Sub8(local44));
		}
		@Pc(73) Class236 local73 = this.aClass236_81;
		synchronized (this.aClass236_81) {
			this.aClass236_81.method6241((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(I)V")
	public void method7164() {
		@Pc(14) Class236 local14 = this.aClass236_81;
		synchronized (this.aClass236_81) {
			this.aClass236_81.method6253();
		}
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(BI)V")
	public void method7165(@OriginalArg(1) int arg0) {
		@Pc(12) Class236 local12 = this.aClass236_81;
		synchronized (this.aClass236_81) {
			this.aClass236_81.method6253();
			this.aClass236_81 = new Class236(arg0);
		}
	}
}

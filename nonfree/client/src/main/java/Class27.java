import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class27 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "Lclient!ka;")
	private final Class132 aClass132_4 = new Class132(256);

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "Lclient!dk;")
	private final Class54 aClass54_12;

	static {
		new Class134("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!ad;ILclient!dk;)V")
	public Class27(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2) {
		this.aClass54_12 = arg2;
		this.aClass54_12.method1123(26);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IZ)Lclient!fq;")
	public Class2_Sub5_Sub4 method537(@OriginalArg(0) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_4;
		@Pc(16) Class2_Sub5_Sub4 local16;
		synchronized (this.aClass132_4) {
			local16 = (Class2_Sub5_Sub4) this.aClass132_4.method2701((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class54 local29 = this.aClass54_12;
		@Pc(38) byte[] local38;
		synchronized (this.aClass54_12) {
			local38 = this.aClass54_12.method1126(26, arg0);
		}
		local16 = new Class2_Sub5_Sub4();
		if (local38 != null) {
			local16.method1814(new Class2_Sub13(local38));
		}
		@Pc(66) Class132 local66 = this.aClass132_4;
		synchronized (this.aClass132_4) {
			this.aClass132_4.method2711(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)V")
	public void method538() {
		@Pc(6) Class132 local6 = this.aClass132_4;
		synchronized (this.aClass132_4) {
			this.aClass132_4.method2713(5);
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
	public void method540() {
		@Pc(6) Class132 local6 = this.aClass132_4;
		synchronized (this.aClass132_4) {
			this.aClass132_4.method2698();
		}
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
	public void method542() {
		@Pc(10) Class132 local10 = this.aClass132_4;
		synchronized (this.aClass132_4) {
			this.aClass132_4.method2708();
		}
	}
}

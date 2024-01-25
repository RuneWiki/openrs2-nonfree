import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class275 {

	@OriginalMember(owner = "client!pw", name = "m", descriptor = "I")
	public int anInt7300;

	@OriginalMember(owner = "client!pw", name = "g", descriptor = "Lclient!mga;")
	private final Class223 aClass223_49 = new Class223(64);

	@OriginalMember(owner = "client!pw", name = "l", descriptor = "Lclient!mga;")
	public final Class223 aClass223_50 = new Class223(30);

	@OriginalMember(owner = "client!pw", name = "e", descriptor = "Lclient!bi;")
	public final Class31 aClass31_93;

	@OriginalMember(owner = "client!pw", name = "k", descriptor = "Lclient!bi;")
	private final Class31 aClass31_94;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;Lclient!bi;)V")
	public Class275(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class31 arg3) {
		this.aClass31_93 = arg3;
		this.aClass31_94 = arg2;
		@Pc(26) int local26 = this.aClass31_94.method675() - 1;
		this.aClass31_94.method657(local26);
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)V")
	public void method6047() {
		@Pc(6) Class223 local6 = this.aClass223_49;
		synchronized (this.aClass223_49) {
			this.aClass223_49.method4941();
		}
		local6 = this.aClass223_50;
		synchronized (this.aClass223_50) {
			this.aClass223_50.method4941();
		}
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(Z)V")
	public void method6048() {
		@Pc(6) Class223 local6 = this.aClass223_49;
		synchronized (this.aClass223_49) {
			this.aClass223_49.method4932();
		}
		local6 = this.aClass223_50;
		synchronized (this.aClass223_50) {
			this.aClass223_50.method4932();
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(ZI)V")
	public void method6049() {
		@Pc(2) Class223 local2 = this.aClass223_49;
		synchronized (this.aClass223_49) {
			this.aClass223_49.method4933(5);
		}
		local2 = this.aClass223_50;
		synchronized (this.aClass223_50) {
			this.aClass223_50.method4933(5);
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IB)Lclient!tl;")
	public Class318 method6050(@OriginalArg(0) int arg0) {
		@Pc(12) Class223 local12 = this.aClass223_49;
		@Pc(22) Class318 local22;
		synchronized (this.aClass223_49) {
			local22 = (Class318) this.aClass223_49.method4943((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class31 local35 = this.aClass31_94;
		@Pc(48) byte[] local48;
		synchronized (this.aClass31_94) {
			local48 = this.aClass31_94.method667(Static425.method6082(arg0), Static33.method603(arg0));
		}
		local22 = new Class318();
		local22.anInt8779 = arg0;
		local22.aClass275_2 = this;
		if (local48 != null) {
			local22.method7216(new Class4_Sub9(local48));
		}
		@Pc(76) Class223 local76 = this.aClass223_49;
		synchronized (this.aClass223_49) {
			this.aClass223_49.method4938((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IZ)V")
	public void method6051(@OriginalArg(0) int arg0) {
		this.anInt7300 = arg0;
		@Pc(14) Class223 local14 = this.aClass223_50;
		synchronized (this.aClass223_50) {
			this.aClass223_50.method4932();
		}
	}
}

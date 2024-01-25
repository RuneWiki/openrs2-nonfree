import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class291 {

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "Lclient!mga;")
	private final Class223 aClass223_56 = new Class223(64);

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
	public int anInt7780 = 0;

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "Lclient!bi;")
	private final Class31 aClass31_101;

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
	public final int anInt7774;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;)V")
	public Class291(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2) {
		this.aClass31_101 = arg2;
		this.anInt7774 = this.aClass31_101.method657(4);
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
	public void method6438() {
		@Pc(2) Class223 local2 = this.aClass223_56;
		synchronized (this.aClass223_56) {
			this.aClass223_56.method4932();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
	public void method6439() {
		@Pc(10) Class223 local10 = this.aClass223_56;
		synchronized (this.aClass223_56) {
			this.aClass223_56.method4941();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
	public void method6441() {
		@Pc(2) Class223 local2 = this.aClass223_56;
		synchronized (this.aClass223_56) {
			this.aClass223_56.method4933(5);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)Lclient!kb;")
	public Class187 method6442(@OriginalArg(0) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_56;
		@Pc(16) Class187 local16;
		synchronized (this.aClass223_56) {
			local16 = (Class187) this.aClass223_56.method4943((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class31 local29 = this.aClass31_101;
		@Pc(38) byte[] local38;
		synchronized (this.aClass31_101) {
			local38 = this.aClass31_101.method667(4, arg0);
		}
		local16 = new Class187();
		local16.anInt5086 = arg0;
		local16.aClass291_3 = this;
		if (local38 != null) {
			local16.method4304(new Class4_Sub9(local38));
		}
		local16.method4307();
		@Pc(69) Class223 local69 = this.aClass223_56;
		synchronized (this.aClass223_56) {
			this.aClass223_56.method4938((long) arg0, local16);
			return local16;
		}
	}
}

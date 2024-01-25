import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class82 {

	@OriginalMember(owner = "client!el", name = "f", descriptor = "Lclient!wg;")
	private final Class313 aClass313_10 = new Class313(16);

	@OriginalMember(owner = "client!el", name = "j", descriptor = "Lclient!kr;")
	private final Class171 aClass171_41;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!g;ILclient!kr;)V")
	public Class82(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_41 = arg2;
		this.aClass171_41.method4349(30);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Lclient!haa;")
	public Class116 method1912(@OriginalArg(1) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_10;
		@Pc(16) Class116 local16;
		synchronized (this.aClass313_10) {
			local16 = (Class116) this.aClass313_10.method7406((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class171 local29 = this.aClass171_41;
		@Pc(38) byte[] local38;
		synchronized (this.aClass171_41) {
			local38 = this.aClass171_41.method4339(30, arg0);
		}
		local16 = new Class116();
		if (local38 != null) {
			local16.method2610(new Class1_Sub6(local38));
		}
		@Pc(60) Class313 local60 = this.aClass313_10;
		synchronized (this.aClass313_10) {
			this.aClass313_10.method7399((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)V")
	public void method1916() {
		@Pc(11) Class313 local11 = this.aClass313_10;
		synchronized (this.aClass313_10) {
			this.aClass313_10.method7403(5);
		}
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(B)V")
	public void method1917() {
		@Pc(7) Class313 local7 = this.aClass313_10;
		synchronized (this.aClass313_10) {
			this.aClass313_10.method7398();
		}
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(B)V")
	public void method1918() {
		@Pc(2) Class313 local2 = this.aClass313_10;
		synchronized (this.aClass313_10) {
			this.aClass313_10.method7400();
		}
	}
}

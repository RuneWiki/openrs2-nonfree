import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class79 {

	@OriginalMember(owner = "client!df", name = "g", descriptor = "Lclient!dka;")
	private Class85 aClass85_14 = new Class85(64);

	@OriginalMember(owner = "client!df", name = "h", descriptor = "Lclient!nca;")
	private final Class254 aClass254_46;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;)V")
	public Class79(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_46 = arg2;
		if (this.aClass254_46 != null) {
			@Pc(20) int local20 = this.aClass254_46.method6094() - 1;
			this.aClass254_46.method6101(local20);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)V")
	public void method1603() {
		@Pc(2) Class85 local2 = this.aClass85_14;
		synchronized (this.aClass85_14) {
			this.aClass85_14.method1742(5);
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public void method1604() {
		@Pc(2) Class85 local2 = this.aClass85_14;
		synchronized (this.aClass85_14) {
			this.aClass85_14.method1741();
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(II)Lclient!kt;")
	public Class216 method1605(@OriginalArg(1) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_14;
		@Pc(16) Class216 local16;
		synchronized (this.aClass85_14) {
			local16 = (Class216) this.aClass85_14.method1737((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class254 local30 = this.aClass254_46;
		@Pc(56) byte[] local56;
		synchronized (this.aClass254_46) {
			local56 = this.aClass254_46.method6087(Static144.method2134(arg0), Static671.method9147(arg0));
		}
		local16 = new Class216();
		if (local56 != null) {
			local16.method4809(new Class2_Sub20(local56));
		}
		@Pc(80) Class85 local80 = this.aClass85_14;
		synchronized (this.aClass85_14) {
			this.aClass85_14.method1745((long) arg0, 16383, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
	public void method1607(@OriginalArg(0) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_14;
		synchronized (this.aClass85_14) {
			this.aClass85_14.method1748();
			this.aClass85_14 = new Class85(arg0);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	public void method1608() {
		@Pc(6) Class85 local6 = this.aClass85_14;
		synchronized (this.aClass85_14) {
			this.aClass85_14.method1748();
		}
	}
}

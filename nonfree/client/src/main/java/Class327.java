import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class327 {

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "Lclient!dka;")
	private final Class85 aClass85_55 = new Class85(64);

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "Lclient!dka;")
	public final Class85 aClass85_56 = new Class85(2);

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "Lclient!nca;")
	public final Class254 aClass254_139;

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "Lclient!nca;")
	private final Class254 aClass254_137;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;Lclient!nca;)V")
	public Class327(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) Class254 arg3) {
		this.aClass254_139 = arg3;
		this.aClass254_137 = arg2;
		this.aClass254_137.method6101(33);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZ)V")
	public void method7798() {
		@Pc(6) Class85 local6 = this.aClass85_55;
		synchronized (this.aClass85_55) {
			this.aClass85_55.method1742(5);
		}
		local6 = this.aClass85_56;
		synchronized (this.aClass85_56) {
			this.aClass85_56.method1742(5);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)Lclient!ala;")
	public Class19 method7800(@OriginalArg(1) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_55;
		@Pc(16) Class19 local16;
		synchronized (this.aClass85_55) {
			local16 = (Class19) this.aClass85_55.method1737((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class254 local30 = this.aClass254_137;
		@Pc(39) byte[] local39;
		synchronized (this.aClass254_137) {
			local39 = this.aClass254_137.method6087(arg0, 33);
		}
		local16 = new Class19();
		local16.aClass327_1 = this;
		if (local39 != null) {
			local16.method284(new Class2_Sub20(local39));
		}
		@Pc(66) Class85 local66 = this.aClass85_55;
		synchronized (this.aClass85_55) {
			this.aClass85_55.method1745((long) arg0, 16383, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V")
	public void method7802() {
		@Pc(6) Class85 local6 = this.aClass85_55;
		synchronized (this.aClass85_55) {
			this.aClass85_55.method1741();
		}
		local6 = this.aClass85_56;
		synchronized (this.aClass85_56) {
			this.aClass85_56.method1741();
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
	public void method7803() {
		@Pc(6) Class85 local6 = this.aClass85_55;
		synchronized (this.aClass85_55) {
			this.aClass85_55.method1748();
		}
		local6 = this.aClass85_56;
		synchronized (this.aClass85_56) {
			this.aClass85_56.method1748();
		}
	}
}

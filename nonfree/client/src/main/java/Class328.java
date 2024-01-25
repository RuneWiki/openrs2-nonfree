import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class328 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "Lclient!dka;")
	private final Class85 aClass85_57 = new Class85(64);

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "Lclient!nca;")
	private final Class254 aClass254_140;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;)V")
	public Class328(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_140 = arg2;
		if (this.aClass254_140 != null) {
			this.aClass254_140.method6101(11);
		}
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V")
	public void method7805() {
		@Pc(2) Class85 local2 = this.aClass85_57;
		synchronized (this.aClass85_57) {
			this.aClass85_57.method1748();
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
	public void method7808() {
		@Pc(6) Class85 local6 = this.aClass85_57;
		synchronized (this.aClass85_57) {
			this.aClass85_57.method1741();
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)V")
	public void method7809() {
		@Pc(2) Class85 local2 = this.aClass85_57;
		synchronized (this.aClass85_57) {
			this.aClass85_57.method1742(5);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZI)Lclient!ap;")
	public Class22 method7810(@OriginalArg(1) int arg0) {
		@Pc(15) Class85 local15 = this.aClass85_57;
		@Pc(25) Class22 local25;
		synchronized (this.aClass85_57) {
			local25 = (Class22) this.aClass85_57.method1737((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(39) Class254 local39 = this.aClass254_140;
		@Pc(48) byte[] local48;
		synchronized (this.aClass254_140) {
			local48 = this.aClass254_140.method6087(arg0, 11);
		}
		local25 = new Class22();
		if (local48 != null) {
			local25.method370(new Class2_Sub20(local48));
		}
		@Pc(72) Class85 local72 = this.aClass85_57;
		synchronized (this.aClass85_57) {
			this.aClass85_57.method1745((long) arg0, 16383, local25);
			return local25;
		}
	}
}

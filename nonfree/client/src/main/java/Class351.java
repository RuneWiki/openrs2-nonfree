import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tea")
public final class Class351 {

	@OriginalMember(owner = "client!tea", name = "o", descriptor = "Lclient!dka;")
	private Class85 aClass85_62 = new Class85(64);

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "Lclient!dka;")
	public Class85 aClass85_63 = new Class85(64);

	@OriginalMember(owner = "client!tea", name = "p", descriptor = "Lclient!nca;")
	public final Class254 aClass254_151;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "Lclient!nca;")
	private final Class254 aClass254_152;

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;Lclient!nca;)V")
	public Class351(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) Class254 arg3) {
		this.aClass254_151 = arg3;
		this.aClass254_152 = arg2;
		this.aClass254_152.method6101(34);
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(III)V")
	public void method8330(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass85_62 = new Class85(arg1);
		this.aClass85_63 = new Class85(arg0);
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IB)V")
	public void method8331() {
		@Pc(13) Class85 local13 = this.aClass85_62;
		synchronized (this.aClass85_62) {
			this.aClass85_62.method1742(5);
		}
		local13 = this.aClass85_63;
		synchronized (this.aClass85_63) {
			this.aClass85_63.method1742(5);
		}
	}

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "(I)V")
	public void method8333() {
		@Pc(6) Class85 local6 = this.aClass85_62;
		synchronized (this.aClass85_62) {
			this.aClass85_62.method1748();
		}
		local6 = this.aClass85_63;
		synchronized (this.aClass85_63) {
			this.aClass85_63.method1748();
		}
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(II)Lclient!bma;")
	public Class46 method8334(@OriginalArg(0) int arg0) {
		@Pc(12) Class85 local12 = this.aClass85_62;
		@Pc(24) Class46 local24;
		synchronized (this.aClass85_62) {
			local24 = (Class46) this.aClass85_62.method1737((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(38) Class254 local38 = this.aClass254_152;
		@Pc(47) byte[] local47;
		synchronized (this.aClass254_152) {
			local47 = this.aClass254_152.method6087(arg0, 34);
		}
		local24 = new Class46();
		local24.aClass351_1 = this;
		if (local47 != null) {
			local24.method906(new Class2_Sub20(local47));
		}
		@Pc(74) Class85 local74 = this.aClass85_62;
		synchronized (this.aClass85_62) {
			this.aClass85_62.method1745((long) arg0, 16383, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)V")
	public void method8336() {
		@Pc(2) Class85 local2 = this.aClass85_62;
		synchronized (this.aClass85_62) {
			this.aClass85_62.method1741();
		}
		@Pc(29) Class85 local29 = this.aClass85_63;
		synchronized (this.aClass85_63) {
			this.aClass85_63.method1741();
		}
	}
}

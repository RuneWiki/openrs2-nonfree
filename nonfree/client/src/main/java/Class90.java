import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class90 {

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "Lclient!dka;")
	private final Class85 aClass85_17 = new Class85(64);

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "Lclient!nca;")
	private final Class254 aClass254_48;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
	public final int anInt2113;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;)V")
	public Class90(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_48 = arg2;
		if (this.aClass254_48 == null) {
			this.anInt2113 = 0;
		} else {
			this.anInt2113 = this.aClass254_48.method6101(47);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IZ)V")
	public void method1858() {
		@Pc(6) Class85 local6 = this.aClass85_17;
		synchronized (this.aClass85_17) {
			this.aClass85_17.method1742(5);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
	public void method1860() {
		@Pc(2) Class85 local2 = this.aClass85_17;
		synchronized (this.aClass85_17) {
			this.aClass85_17.method1741();
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)Lclient!sr;")
	public Class343 method1861(@OriginalArg(1) int arg0) {
		@Pc(13) Class85 local13 = this.aClass85_17;
		@Pc(23) Class343 local23;
		synchronized (this.aClass85_17) {
			local23 = (Class343) this.aClass85_17.method1737((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(37) Class254 local37 = this.aClass254_48;
		@Pc(46) byte[] local46;
		synchronized (this.aClass254_48) {
			local46 = this.aClass254_48.method6087(arg0, 47);
		}
		local23 = new Class343();
		if (local46 != null) {
			local23.method8180(new Class2_Sub20(local46));
		}
		@Pc(70) Class85 local70 = this.aClass85_17;
		synchronized (this.aClass85_17) {
			this.aClass85_17.method1745((long) arg0, 16383, local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V")
	public void method1862() {
		@Pc(12) Class85 local12 = this.aClass85_17;
		synchronized (this.aClass85_17) {
			this.aClass85_17.method1748();
		}
	}
}

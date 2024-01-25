import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class31 {

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "Lclient!dka;")
	private final Class85 aClass85_4 = new Class85(64);

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "Lclient!nca;")
	private final Class254 aClass254_21;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;)V")
	public Class31(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_21 = arg2;
		if (this.aClass254_21 != null) {
			this.aClass254_21.method6101(54);
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)Lclient!eca;")
	public Class95 method556(@OriginalArg(0) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_4;
		@Pc(16) Class95 local16;
		synchronized (this.aClass85_4) {
			local16 = (Class95) this.aClass85_4.method1737((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) Class254 local38 = this.aClass254_21;
		@Pc(47) byte[] local47;
		synchronized (this.aClass254_21) {
			local47 = this.aClass254_21.method6087(arg0, 54);
		}
		local16 = new Class95();
		if (local47 != null) {
			local16.method1979(new Class2_Sub20(local47));
		}
		@Pc(71) Class85 local71 = this.aClass85_4;
		synchronized (this.aClass85_4) {
			this.aClass85_4.method1745((long) arg0, 16383, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
	public void method558() {
		@Pc(6) Class85 local6 = this.aClass85_4;
		synchronized (this.aClass85_4) {
			this.aClass85_4.method1742(5);
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	public void method560() {
		@Pc(2) Class85 local2 = this.aClass85_4;
		synchronized (this.aClass85_4) {
			this.aClass85_4.method1741();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
	public void method561() {
		@Pc(2) Class85 local2 = this.aClass85_4;
		synchronized (this.aClass85_4) {
			this.aClass85_4.method1748();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class280 {

	@OriginalMember(owner = "client!or", name = "f", descriptor = "Lclient!dka;")
	private final Class85 aClass85_50 = new Class85(256);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "Lclient!nca;")
	private final Class254 aClass254_124;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;)V")
	public Class280(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_124 = arg2;
		this.aClass254_124.method6101(26);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IB)V")
	public void method6720() {
		@Pc(6) Class85 local6 = this.aClass85_50;
		synchronized (this.aClass85_50) {
			this.aClass85_50.method1742(5);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
	public void method6724() {
		@Pc(2) Class85 local2 = this.aClass85_50;
		synchronized (this.aClass85_50) {
			this.aClass85_50.method1748();
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)Lclient!raa;")
	public Class2_Sub6_Sub18 method6725(@OriginalArg(1) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_50;
		@Pc(16) Class2_Sub6_Sub18 local16;
		synchronized (this.aClass85_50) {
			local16 = (Class2_Sub6_Sub18) this.aClass85_50.method1737((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class254 local30 = this.aClass254_124;
		@Pc(39) byte[] local39;
		synchronized (this.aClass254_124) {
			local39 = this.aClass254_124.method6087(arg0, 26);
		}
		local16 = new Class2_Sub6_Sub18();
		if (local39 != null) {
			local16.method7544(new Class2_Sub20(local39));
		}
		@Pc(63) Class85 local63 = this.aClass85_50;
		synchronized (this.aClass85_50) {
			this.aClass85_50.method1745((long) arg0, 16383, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
	public void method6726() {
		@Pc(6) Class85 local6 = this.aClass85_50;
		synchronized (this.aClass85_50) {
			this.aClass85_50.method1741();
		}
	}
}

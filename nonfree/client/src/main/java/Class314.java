import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class314 {

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "Lclient!dka;")
	private final Class85 aClass85_53 = new Class85(64);

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "Lclient!nca;")
	private final Class254 aClass254_133;

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "Lclient!kh;")
	public final Class210 aClass210_2;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;Lclient!kh;)V")
	public Class314(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) Class210 arg3) {
		this.aClass254_133 = arg2;
		this.aClass254_133.method6101(32);
		this.aClass210_2 = arg3;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)Lclient!bs;")
	public Class49 method7452(@OriginalArg(0) int arg0) {
		@Pc(16) Class85 local16 = this.aClass85_53;
		@Pc(26) Class49 local26;
		synchronized (this.aClass85_53) {
			local26 = (Class49) this.aClass85_53.method1737((long) arg0);
		}
		if (local26 != null) {
			return local26;
		}
		@Pc(40) Class254 local40 = this.aClass254_133;
		@Pc(49) byte[] local49;
		synchronized (this.aClass254_133) {
			local49 = this.aClass254_133.method6087(arg0, 32);
		}
		local26 = new Class49();
		local26.aClass314_1 = this;
		if (local49 != null) {
			local26.method948(new Class2_Sub20(local49));
		}
		@Pc(76) Class85 local76 = this.aClass85_53;
		synchronized (this.aClass85_53) {
			this.aClass85_53.method1745((long) arg0, 16383, local26);
			return local26;
		}
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(B)V")
	public void method7453() {
		@Pc(14) Class85 local14 = this.aClass85_53;
		synchronized (this.aClass85_53) {
			this.aClass85_53.method1741();
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(II)V")
	public void method7455() {
		@Pc(2) Class85 local2 = this.aClass85_53;
		synchronized (this.aClass85_53) {
			this.aClass85_53.method1742(5);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V")
	public void method7457() {
		@Pc(6) Class85 local6 = this.aClass85_53;
		synchronized (this.aClass85_53) {
			this.aClass85_53.method1748();
		}
	}
}

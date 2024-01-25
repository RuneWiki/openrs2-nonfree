import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class231 {

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "Lclient!dka;")
	private final Class85 aClass85_40 = new Class85(64);

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
	public int anInt5963 = 0;

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "Lclient!nca;")
	private final Class254 aClass254_106;

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
	public final int anInt5957;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;)V")
	public Class231(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_106 = arg2;
		this.anInt5957 = this.aClass254_106.method6101(4);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
	public void method5326() {
		@Pc(6) Class85 local6 = this.aClass85_40;
		synchronized (this.aClass85_40) {
			this.aClass85_40.method1741();
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
	public void method5328() {
		@Pc(2) Class85 local2 = this.aClass85_40;
		synchronized (this.aClass85_40) {
			this.aClass85_40.method1748();
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)Lclient!mg;")
	public Class240 method5329(@OriginalArg(1) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_40;
		@Pc(18) Class240 local18;
		synchronized (this.aClass85_40) {
			local18 = (Class240) this.aClass85_40.method1737((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class254 local32 = this.aClass254_106;
		@Pc(43) byte[] local43;
		synchronized (this.aClass254_106) {
			local43 = this.aClass254_106.method6087(arg0, 4);
		}
		local18 = new Class240();
		local18.aClass231_21 = this;
		local18.anInt6492 = arg0;
		if (local43 != null) {
			local18.method5841(new Class2_Sub20(local43));
		}
		local18.method5838();
		@Pc(76) Class85 local76 = this.aClass85_40;
		synchronized (this.aClass85_40) {
			this.aClass85_40.method1745((long) arg0, 16383, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(II)V")
	public void method5332() {
		@Pc(2) Class85 local2 = this.aClass85_40;
		synchronized (this.aClass85_40) {
			this.aClass85_40.method1742(5);
		}
	}
}

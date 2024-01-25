import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class356 {

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "Lclient!de;")
	public final Class69 aClass69_66 = new Class69(20);

	@OriginalMember(owner = "client!ut", name = "l", descriptor = "Lclient!de;")
	private final Class69 aClass69_67 = new Class69(64);

	@OriginalMember(owner = "client!ut", name = "j", descriptor = "Lclient!nd;")
	private final Class238 aClass238_274;

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "Lclient!nd;")
	public final Class238 aClass238_273;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;Lclient!nd;)V")
	public Class356(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2, @OriginalArg(3) Class238 arg3) {
		this.aClass238_274 = arg2;
		this.aClass238_273 = arg3;
		this.aClass238_274.method5592(46);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BI)V")
	public void method8372() {
		@Pc(10) Class69 local10 = this.aClass69_67;
		synchronized (this.aClass69_67) {
			this.aClass69_67.method1910(5);
		}
		local10 = this.aClass69_66;
		synchronized (this.aClass69_66) {
			this.aClass69_66.method1910(5);
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
	public void method8373() {
		@Pc(2) Class69 local2 = this.aClass69_67;
		synchronized (this.aClass69_67) {
			this.aClass69_67.method1905();
		}
		local2 = this.aClass69_66;
		synchronized (this.aClass69_66) {
			this.aClass69_66.method1905();
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)Lclient!kb;")
	public Class195 method8375(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_67;
		@Pc(18) Class195 local18;
		synchronized (this.aClass69_67) {
			local18 = (Class195) this.aClass69_67.method1919((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class238 local31 = this.aClass238_274;
		@Pc(40) byte[] local40;
		synchronized (this.aClass238_274) {
			local40 = this.aClass238_274.method5567(arg0, 46);
		}
		local18 = new Class195();
		local18.aClass356_1 = this;
		if (local40 != null) {
			local18.method4520(new Class2_Sub17(local40));
		}
		@Pc(65) Class69 local65 = this.aClass69_67;
		synchronized (this.aClass69_67) {
			this.aClass69_67.method1917((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(I)V")
	public void method8376() {
		@Pc(2) Class69 local2 = this.aClass69_67;
		synchronized (this.aClass69_67) {
			this.aClass69_67.method1904();
		}
		local2 = this.aClass69_66;
		synchronized (this.aClass69_66) {
			this.aClass69_66.method1904();
		}
	}
}

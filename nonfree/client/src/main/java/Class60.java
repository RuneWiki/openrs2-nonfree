import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class60 {

	@OriginalMember(owner = "client!cr", name = "q", descriptor = "I")
	public int anInt2076;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "Lclient!vg;")
	private final Class342 aClass342_31 = new Class342(64);

	@OriginalMember(owner = "client!cr", name = "o", descriptor = "Lclient!vg;")
	public final Class342 aClass342_32 = new Class342(50);

	@OriginalMember(owner = "client!cr", name = "p", descriptor = "Lclient!vg;")
	public final Class342 aClass342_33 = new Class342(5);

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "Lclient!ei;")
	public final Class89 aClass89_4;

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "Lclient!ri;")
	private final Class284 aClass284_31;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "Z")
	public boolean aBoolean159;

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "Lclient!ri;")
	public final Class284 aClass284_30;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!ei;IZLclient!ri;Lclient!ri;)V")
	public Class60(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class284 arg3, @OriginalArg(4) Class284 arg4) {
		this.aClass89_4 = arg0;
		this.aClass284_31 = arg3;
		this.aBoolean159 = arg2;
		this.aClass284_30 = arg4;
		if (this.aClass284_31 != null) {
			@Pc(41) int local41 = this.aClass284_31.method6322() - 1;
			this.aClass284_31.method6354(local41);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
	public void method1794() {
		@Pc(6) Class342 local6 = this.aClass342_31;
		synchronized (this.aClass342_31) {
			this.aClass342_31.method7693();
		}
		local6 = this.aClass342_32;
		synchronized (this.aClass342_32) {
			this.aClass342_32.method7693();
		}
		local6 = this.aClass342_33;
		synchronized (this.aClass342_33) {
			this.aClass342_33.method7693();
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IB)V")
	public void method1795(@OriginalArg(0) int arg0) {
		this.anInt2076 = arg0;
		@Pc(13) Class342 local13 = this.aClass342_32;
		synchronized (this.aClass342_32) {
			this.aClass342_32.method7693();
		}
		local13 = this.aClass342_33;
		synchronized (this.aClass342_33) {
			this.aClass342_33.method7693();
		}
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(IB)V")
	public void method1796() {
		@Pc(6) Class342 local6 = this.aClass342_31;
		synchronized (this.aClass342_31) {
			this.aClass342_31.method7697(5);
		}
		local6 = this.aClass342_32;
		synchronized (this.aClass342_32) {
			this.aClass342_32.method7697(5);
		}
		@Pc(46) Class342 local46 = this.aClass342_33;
		synchronized (this.aClass342_33) {
			this.aClass342_33.method7697(5);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)Lclient!ms;")
	public Class213 method1797(@OriginalArg(0) int arg0) {
		@Pc(6) Class342 local6 = this.aClass342_31;
		@Pc(16) Class213 local16;
		synchronized (this.aClass342_31) {
			local16 = (Class213) this.aClass342_31.method7684((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class284 local29 = this.aClass284_31;
		@Pc(42) byte[] local42;
		synchronized (this.aClass284_31) {
			local42 = this.aClass284_31.method6331(Static226.method3717(arg0), Static84.method7341(arg0));
		}
		local16 = new Class213();
		local16.aClass60_2 = this;
		local16.anInt6198 = arg0;
		if (local42 != null) {
			local16.method5008(new Class3_Sub26(local42));
		}
		local16.method5001();
		@Pc(73) Class342 local73 = this.aClass342_31;
		synchronized (this.aClass342_31) {
			this.aClass342_31.method7683(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BZ)V")
	public void method1799(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean159 != arg0) {
			this.aBoolean159 = arg0;
			this.method1794();
		}
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(B)V")
	public void method1800() {
		@Pc(6) Class342 local6 = this.aClass342_31;
		synchronized (this.aClass342_31) {
			this.aClass342_31.method7687();
		}
		local6 = this.aClass342_32;
		synchronized (this.aClass342_32) {
			this.aClass342_32.method7687();
		}
		local6 = this.aClass342_33;
		synchronized (this.aClass342_33) {
			this.aClass342_33.method7687();
		}
	}

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "(B)V")
	public void method1801() {
		@Pc(6) Class342 local6 = this.aClass342_32;
		synchronized (this.aClass342_32) {
			this.aClass342_32.method7693();
		}
		local6 = this.aClass342_33;
		synchronized (this.aClass342_33) {
			this.aClass342_33.method7693();
		}
	}
}

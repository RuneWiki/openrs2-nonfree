import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class23 {

	@OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
	public int anInt224;

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "Lclient!vg;")
	private final Class342 aClass342_10 = new Class342(64);

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "Lclient!vg;")
	public final Class342 aClass342_11 = new Class342(60);

	@OriginalMember(owner = "client!ar", name = "i", descriptor = "Lclient!ri;")
	private final Class284 aClass284_8;

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "Lclient!ri;")
	public final Class284 aClass284_7;

	static {
		new Class161("", 76);
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;Lclient!ri;)V")
	public Class23(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2, @OriginalArg(3) Class284 arg3) {
		this.aClass284_8 = arg2;
		this.aClass284_7 = arg3;
		@Pc(26) int local26 = this.aClass284_8.method6322() - 1;
		this.aClass284_8.method6354(local26);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)V")
	public void method225() {
		@Pc(2) Class342 local2 = this.aClass342_10;
		synchronized (this.aClass342_10) {
			this.aClass342_10.method7697(5);
		}
		local2 = this.aClass342_11;
		synchronized (this.aClass342_11) {
			this.aClass342_11.method7697(5);
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IB)V")
	public void method226(@OriginalArg(0) int arg0) {
		this.anInt224 = arg0;
		@Pc(13) Class342 local13 = this.aClass342_11;
		synchronized (this.aClass342_11) {
			this.aClass342_11.method7693();
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZI)Lclient!paa;")
	public Class250 method228(@OriginalArg(1) int arg0) {
		@Pc(6) Class342 local6 = this.aClass342_10;
		@Pc(16) Class250 local16;
		synchronized (this.aClass342_10) {
			local16 = (Class250) this.aClass342_10.method7684((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class284 local29 = this.aClass284_8;
		@Pc(42) byte[] local42;
		synchronized (this.aClass284_8) {
			local42 = this.aClass284_8.method6331(Static165.method2997(arg0), Static47.method1178(arg0));
		}
		local16 = new Class250();
		local16.aClass23_2 = this;
		local16.anInt7020 = arg0;
		if (local42 != null) {
			local16.method5611(new Class3_Sub26(local42));
		}
		@Pc(70) Class342 local70 = this.aClass342_10;
		synchronized (this.aClass342_10) {
			this.aClass342_10.method7683(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
	public void method229() {
		@Pc(10) Class342 local10 = this.aClass342_10;
		synchronized (this.aClass342_10) {
			this.aClass342_10.method7687();
		}
		local10 = this.aClass342_11;
		synchronized (this.aClass342_11) {
			this.aClass342_11.method7687();
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V")
	public void method230() {
		@Pc(10) Class342 local10 = this.aClass342_10;
		synchronized (this.aClass342_10) {
			this.aClass342_10.method7693();
		}
		local10 = this.aClass342_11;
		synchronized (this.aClass342_11) {
			this.aClass342_11.method7693();
		}
	}
}

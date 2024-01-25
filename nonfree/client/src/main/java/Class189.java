import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class189 {

	@OriginalMember(owner = "client!lk", name = "m", descriptor = "Lclient!vg;")
	private Class342 aClass342_118 = new Class342(128);

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "Lclient!vg;")
	public Class342 aClass342_119 = new Class342(64);

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "Lclient!ri;")
	public final Class284 aClass284_95;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "Lclient!ri;")
	private final Class284 aClass284_96;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;Lclient!ri;)V")
	public Class189(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2, @OriginalArg(3) Class284 arg3) {
		this.aClass284_95 = arg3;
		this.aClass284_96 = arg2;
		this.aClass284_96.method6354(36);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	public void method4640() {
		@Pc(6) Class342 local6 = this.aClass342_118;
		synchronized (this.aClass342_118) {
			this.aClass342_118.method7687();
		}
		local6 = this.aClass342_119;
		synchronized (this.aClass342_119) {
			this.aClass342_119.method7687();
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V")
	public void method4641() {
		@Pc(2) Class342 local2 = this.aClass342_118;
		synchronized (this.aClass342_118) {
			this.aClass342_118.method7693();
		}
		local2 = this.aClass342_119;
		synchronized (this.aClass342_119) {
			this.aClass342_119.method7693();
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)Lclient!vca;")
	public Class338 method4642(@OriginalArg(1) int arg0) {
		@Pc(6) Class342 local6 = this.aClass342_118;
		@Pc(16) Class338 local16;
		synchronized (this.aClass342_118) {
			local16 = (Class338) this.aClass342_118.method7684((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class284 local34 = this.aClass284_96;
		@Pc(43) byte[] local43;
		synchronized (this.aClass284_96) {
			local43 = this.aClass284_96.method6331(36, arg0);
		}
		local16 = new Class338();
		local16.aClass189_4 = this;
		local16.anInt9722 = arg0;
		if (local43 != null) {
			local16.method7663(new Class3_Sub26(local43));
		}
		local16.method7659();
		@Pc(74) Class342 local74 = this.aClass342_118;
		synchronized (this.aClass342_118) {
			this.aClass342_118.method7683(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)V")
	public void method4643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass342_118 = new Class342(arg0);
		this.aClass342_119 = new Class342(arg1);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB)V")
	public void method4644() {
		@Pc(6) Class342 local6 = this.aClass342_118;
		synchronized (this.aClass342_118) {
			this.aClass342_118.method7697(5);
		}
		local6 = this.aClass342_119;
		synchronized (this.aClass342_119) {
			this.aClass342_119.method7697(5);
		}
	}
}

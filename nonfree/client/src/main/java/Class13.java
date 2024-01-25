import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class13 {

	@OriginalMember(owner = "client!aga", name = "i", descriptor = "Lclient!vg;")
	private final Class342 aClass342_9 = new Class342(16);

	@OriginalMember(owner = "client!aga", name = "h", descriptor = "Lclient!ri;")
	private final Class284 aClass284_2;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;)V")
	public Class13(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2) {
		this.aClass284_2 = arg2;
		this.aClass284_2.method6354(30);
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)V")
	public void method119() {
		@Pc(2) Class342 local2 = this.aClass342_9;
		synchronized (this.aClass342_9) {
			this.aClass342_9.method7697(5);
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)V")
	public void method121() {
		@Pc(9) Class342 local9 = this.aClass342_9;
		synchronized (this.aClass342_9) {
			this.aClass342_9.method7687();
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(BI)Lclient!pl;")
	public Class257 method123(@OriginalArg(1) int arg0) {
		@Pc(11) Class342 local11 = this.aClass342_9;
		@Pc(21) Class257 local21;
		synchronized (this.aClass342_9) {
			local21 = (Class257) this.aClass342_9.method7684((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class284 local34 = this.aClass284_2;
		@Pc(43) byte[] local43;
		synchronized (this.aClass284_2) {
			local43 = this.aClass284_2.method6331(30, arg0);
		}
		local21 = new Class257();
		if (local43 != null) {
			local21.method5792(new Class3_Sub26(local43));
		}
		@Pc(65) Class342 local65 = this.aClass342_9;
		synchronized (this.aClass342_9) {
			this.aClass342_9.method7683(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)V")
	public void method124() {
		@Pc(10) Class342 local10 = this.aClass342_9;
		synchronized (this.aClass342_9) {
			this.aClass342_9.method7693();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class258 {

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "Lclient!ff;")
	private final Class83 aClass83_63 = new Class83(64);

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "Lclient!vh;")
	private final Class250 aClass250_90;

	@OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
	public final int anInt7474;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lclient!lf;ILclient!vh;)V")
	public Class258(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_90 = arg2;
		if (this.aClass250_90 == null) {
			this.anInt7474 = 0;
		} else {
			this.anInt7474 = this.aClass250_90.method5653(16);
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
	public void method5790() {
		@Pc(6) Class83 local6 = this.aClass83_63;
		synchronized (this.aClass83_63) {
			this.aClass83_63.method1667();
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(II)V")
	public void method5792() {
		@Pc(6) Class83 local6 = this.aClass83_63;
		synchronized (this.aClass83_63) {
			this.aClass83_63.method1663(5);
		}
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(II)Lclient!gt;")
	public Class99 method5794(@OriginalArg(1) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_63;
		@Pc(23) Class99 local23;
		synchronized (this.aClass83_63) {
			local23 = (Class99) this.aClass83_63.method1658((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(40) byte[] local40 = this.aClass250_90.method5667(arg0, 16);
		local23 = new Class99();
		if (local40 != null) {
			local23.method1961(new Class1_Sub1(local40));
		}
		@Pc(56) Class83 local56 = this.aClass83_63;
		synchronized (this.aClass83_63) {
			this.aClass83_63.method1675((long) arg0, local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)V")
	public void method5795() {
		@Pc(11) Class83 local11 = this.aClass83_63;
		synchronized (this.aClass83_63) {
			this.aClass83_63.method1669();
		}
	}
}

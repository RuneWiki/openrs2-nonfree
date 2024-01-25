import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class106 {

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "Lclient!ff;")
	private final Class83 aClass83_22 = new Class83(64);

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "Lclient!ff;")
	public final Class83 aClass83_23 = new Class83(2);

	@OriginalMember(owner = "client!hm", name = "i", descriptor = "Lclient!vh;")
	private final Class250 aClass250_33;

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "Lclient!vh;")
	public final Class250 aClass250_32;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!lf;ILclient!vh;Lclient!vh;)V")
	public Class106(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) Class250 arg3) {
		this.aClass250_33 = arg2;
		this.aClass250_32 = arg3;
		this.aClass250_33.method5653(33);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
	public void method2344() {
		@Pc(6) Class83 local6 = this.aClass83_22;
		synchronized (this.aClass83_22) {
			this.aClass83_22.method1669();
		}
		local6 = this.aClass83_23;
		synchronized (this.aClass83_23) {
			this.aClass83_23.method1669();
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)V")
	public void method2346() {
		@Pc(6) Class83 local6 = this.aClass83_22;
		synchronized (this.aClass83_22) {
			this.aClass83_22.method1663(5);
		}
		local6 = this.aClass83_23;
		synchronized (this.aClass83_23) {
			this.aClass83_23.method1663(5);
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
	public void method2347() {
		@Pc(2) Class83 local2 = this.aClass83_22;
		synchronized (this.aClass83_22) {
			this.aClass83_22.method1667();
		}
		local2 = this.aClass83_23;
		synchronized (this.aClass83_23) {
			this.aClass83_23.method1667();
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(II)Lclient!ct;")
	public Class43 method2348(@OriginalArg(0) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_22;
		@Pc(16) Class43 local16;
		synchronized (this.aClass83_22) {
			local16 = (Class43) this.aClass83_22.method1658((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) byte[] local41 = this.aClass250_33.method5667(arg0, 33);
		local16 = new Class43();
		local16.aClass106_1 = this;
		if (local41 != null) {
			local16.method1075(new Class1_Sub1(local41));
		}
		@Pc(60) Class83 local60 = this.aClass83_22;
		synchronized (this.aClass83_22) {
			this.aClass83_22.method1675((long) arg0, local16);
			return local16;
		}
	}
}

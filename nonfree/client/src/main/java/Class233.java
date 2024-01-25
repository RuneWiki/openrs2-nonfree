import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class233 {

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "Lclient!ff;")
	private final Class83 aClass83_56 = new Class83(64);

	@OriginalMember(owner = "client!tu", name = "i", descriptor = "Lclient!vh;")
	private final Class250 aClass250_82;

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "Lclient!vh;")
	public final Class250 aClass250_81;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!lf;ILclient!vh;Lclient!vh;)V")
	public Class233(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) Class250 arg3) {
		this.aClass250_82 = arg2;
		this.aClass250_81 = arg3;
		this.aClass250_82.method5653(3);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)V")
	public void method5370() {
		@Pc(6) Class83 local6 = this.aClass83_56;
		synchronized (this.aClass83_56) {
			this.aClass83_56.method1663(5);
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
	public void method5373() {
		@Pc(2) Class83 local2 = this.aClass83_56;
		synchronized (this.aClass83_56) {
			this.aClass83_56.method1669();
		}
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(II)Lclient!pq;")
	public Class184 method5374(@OriginalArg(1) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_56;
		@Pc(16) Class184 local16;
		synchronized (this.aClass83_56) {
			local16 = (Class184) this.aClass83_56.method1658((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass250_82.method5667(arg0, 3);
		local16 = new Class184();
		local16.aClass233_2 = this;
		if (local39 != null) {
			local16.method4438(new Class1_Sub1(local39));
		}
		@Pc(58) Class83 local58 = this.aClass83_56;
		synchronized (this.aClass83_56) {
			this.aClass83_56.method1675((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V")
	public void method5375() {
		@Pc(2) Class83 local2 = this.aClass83_56;
		synchronized (this.aClass83_56) {
			this.aClass83_56.method1667();
		}
	}
}

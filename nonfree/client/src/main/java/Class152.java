import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class152 {

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "Lclient!iha;")
	private final Class168 aClass168_39 = new Class168(128);

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "Lclient!gda;")
	private final Class126 aClass126_109;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;)V")
	public Class152(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2) {
		this.aClass126_109 = arg2;
		this.aClass126_109.method3062(1);
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
	public void method3418() {
		@Pc(2) Class168 local2 = this.aClass168_39;
		synchronized (this.aClass168_39) {
			this.aClass168_39.method3862();
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	public void method3419() {
		@Pc(6) Class168 local6 = this.aClass168_39;
		synchronized (this.aClass168_39) {
			this.aClass168_39.method3856();
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
	public void method3420() {
		@Pc(6) Class168 local6 = this.aClass168_39;
		synchronized (this.aClass168_39) {
			this.aClass168_39.method3852(5);
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(BI)Lclient!un;")
	public Class367 method3422(@OriginalArg(1) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_39;
		@Pc(16) Class367 local16;
		synchronized (this.aClass168_39) {
			local16 = (Class367) this.aClass168_39.method3860((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class126 local30 = this.aClass126_109;
		@Pc(39) byte[] local39;
		synchronized (this.aClass126_109) {
			local39 = this.aClass126_109.method3086(arg0, 1);
		}
		local16 = new Class367();
		if (local39 != null) {
			local16.method8374(new Class5_Sub36(local39));
		}
		@Pc(71) Class168 local71 = this.aClass168_39;
		synchronized (this.aClass168_39) {
			this.aClass168_39.method3853((long) arg0, local16);
			return local16;
		}
	}
}

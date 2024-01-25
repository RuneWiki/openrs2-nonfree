import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class39 {

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "Lclient!iha;")
	private final Class168 aClass168_10 = new Class168(64);

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "Lclient!gda;")
	private final Class126 aClass126_30;

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
	public final int anInt701;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;)V")
	public Class39(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2) {
		this.aClass126_30 = arg2;
		if (this.aClass126_30 == null) {
			this.anInt701 = 0;
		} else {
			this.anInt701 = this.aClass126_30.method3062(47);
		}
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)V")
	public void method763() {
		@Pc(13) Class168 local13 = this.aClass168_10;
		synchronized (this.aClass168_10) {
			this.aClass168_10.method3852(5);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
	public void method765() {
		@Pc(14) Class168 local14 = this.aClass168_10;
		synchronized (this.aClass168_10) {
			this.aClass168_10.method3862();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
	public void method766() {
		@Pc(2) Class168 local2 = this.aClass168_10;
		synchronized (this.aClass168_10) {
			this.aClass168_10.method3856();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Lclient!kr;")
	public Class211 method767(@OriginalArg(0) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_10;
		@Pc(18) Class211 local18;
		synchronized (this.aClass168_10) {
			local18 = (Class211) this.aClass168_10.method3860((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(40) Class126 local40 = this.aClass126_30;
		@Pc(49) byte[] local49;
		synchronized (this.aClass126_30) {
			local49 = this.aClass126_30.method3086(arg0, 47);
		}
		local18 = new Class211();
		if (local49 != null) {
			local18.method4812(new Class5_Sub36(local49));
		}
		@Pc(73) Class168 local73 = this.aClass168_10;
		synchronized (this.aClass168_10) {
			this.aClass168_10.method3853((long) arg0, local18);
			return local18;
		}
	}
}

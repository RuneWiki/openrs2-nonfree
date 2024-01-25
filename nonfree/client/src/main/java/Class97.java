import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eka")
public final class Class97 {

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "Lclient!iha;")
	private Class168 aClass168_21 = new Class168(64);

	@OriginalMember(owner = "client!eka", name = "e", descriptor = "Lclient!iha;")
	public Class168 aClass168_22 = new Class168(64);

	@OriginalMember(owner = "client!eka", name = "n", descriptor = "Lclient!gda;")
	public final Class126 aClass126_70;

	@OriginalMember(owner = "client!eka", name = "h", descriptor = "Lclient!gda;")
	private final Class126 aClass126_71;

	@OriginalMember(owner = "client!eka", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;Lclient!gda;)V")
	public Class97(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(3) Class126 arg3) {
		this.aClass126_70 = arg3;
		this.aClass126_71 = arg2;
		this.aClass126_71.method3062(34);
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(IB)Lclient!vg;")
	public Class376 method1927(@OriginalArg(0) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_21;
		@Pc(16) Class376 local16;
		synchronized (this.aClass168_21) {
			local16 = (Class376) this.aClass168_21.method3860((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(40) Class126 local40 = this.aClass126_71;
		@Pc(49) byte[] local49;
		synchronized (this.aClass126_71) {
			local49 = this.aClass126_71.method3086(arg0, 34);
		}
		local16 = new Class376();
		local16.aClass97_4 = this;
		if (local49 != null) {
			local16.method8775(new Class5_Sub36(local49));
		}
		@Pc(76) Class168 local76 = this.aClass168_21;
		synchronized (this.aClass168_21) {
			this.aClass168_21.method3853((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(Z)V")
	public void method1929() {
		@Pc(6) Class168 local6 = this.aClass168_21;
		synchronized (this.aClass168_21) {
			this.aClass168_21.method3856();
		}
		local6 = this.aClass168_22;
		synchronized (this.aClass168_22) {
			this.aClass168_22.method3856();
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(II)V")
	public void method1930() {
		@Pc(2) Class168 local2 = this.aClass168_21;
		synchronized (this.aClass168_21) {
			this.aClass168_21.method3852(5);
		}
		local2 = this.aClass168_22;
		synchronized (this.aClass168_22) {
			this.aClass168_22.method3852(5);
		}
	}

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "(I)V")
	public void method1931() {
		@Pc(2) Class168 local2 = this.aClass168_21;
		synchronized (this.aClass168_21) {
			this.aClass168_21.method3862();
		}
		local2 = this.aClass168_22;
		synchronized (this.aClass168_22) {
			this.aClass168_22.method3862();
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(IZI)V")
	public void method1932(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass168_21 = new Class168(arg1);
		this.aClass168_22 = new Class168(arg0);
	}
}

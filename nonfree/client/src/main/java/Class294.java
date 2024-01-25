import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class294 {

	@OriginalMember(owner = "client!ps", name = "k", descriptor = "Lclient!iha;")
	private final Class168 aClass168_65 = new Class168(64);

	@OriginalMember(owner = "client!ps", name = "m", descriptor = "Lclient!gda;")
	private final Class126 aClass126_214;

	@OriginalMember(owner = "client!ps", name = "l", descriptor = "Lclient!gda;")
	public final Class126 aClass126_215;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;Lclient!gda;)V")
	public Class294(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(3) Class126 arg3) {
		this.aClass126_214 = arg2;
		this.aClass126_215 = arg3;
		this.aClass126_214.method3062(3);
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)V")
	public void method6575() {
		@Pc(10) Class168 local10 = this.aClass168_65;
		synchronized (this.aClass168_65) {
			this.aClass168_65.method3862();
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
	public void method6577() {
		@Pc(2) Class168 local2 = this.aClass168_65;
		synchronized (this.aClass168_65) {
			this.aClass168_65.method3856();
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)V")
	public void method6579() {
		@Pc(2) Class168 local2 = this.aClass168_65;
		synchronized (this.aClass168_65) {
			this.aClass168_65.method3852(5);
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BI)Lclient!jba;")
	public Class180 method6580(@OriginalArg(1) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_65;
		@Pc(16) Class180 local16;
		synchronized (this.aClass168_65) {
			local16 = (Class180) this.aClass168_65.method3860((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class126 local30 = this.aClass126_214;
		@Pc(39) byte[] local39;
		synchronized (this.aClass126_214) {
			local39 = this.aClass126_214.method3086(arg0, 3);
		}
		local16 = new Class180();
		local16.aClass294_2 = this;
		if (local39 != null) {
			local16.method4244(new Class5_Sub36(local39));
		}
		@Pc(76) Class168 local76 = this.aClass168_65;
		synchronized (this.aClass168_65) {
			this.aClass168_65.method3853((long) arg0, local16);
			return local16;
		}
	}
}

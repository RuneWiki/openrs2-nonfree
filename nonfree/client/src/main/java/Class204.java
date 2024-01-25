import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class204 {

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "Lclient!gg;")
	private Class112 aClass112_36 = new Class112(64);

	@OriginalMember(owner = "client!ln", name = "n", descriptor = "Lclient!gg;")
	public Class112 aClass112_37 = new Class112(64);

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "Lclient!kha;")
	public final Class181 aClass181_61;

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "Lclient!kha;")
	private final Class181 aClass181_60;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;Lclient!kha;)V")
	public Class204(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) Class181 arg3) {
		this.aClass181_61 = arg3;
		this.aClass181_60 = arg2;
		this.aClass181_60.method5025(34);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)V")
	public void method5446(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass112_36 = new Class112(arg0);
		this.aClass112_37 = new Class112(arg1);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IB)Lclient!jn;")
	public Class164 method5447(@OriginalArg(0) int arg0) {
		@Pc(11) Class112 local11 = this.aClass112_36;
		@Pc(23) Class164 local23;
		synchronized (this.aClass112_36) {
			local23 = (Class164) this.aClass112_36.method3640((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(36) Class181 local36 = this.aClass181_60;
		@Pc(45) byte[] local45;
		synchronized (this.aClass181_60) {
			local45 = this.aClass181_60.method5023(34, arg0);
		}
		local23 = new Class164();
		local23.aClass204_4 = this;
		if (local45 != null) {
			local23.method4911(new Class3_Sub15(local45));
		}
		@Pc(70) Class112 local70 = this.aClass112_36;
		synchronized (this.aClass112_36) {
			this.aClass112_36.method3636((long) arg0, local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
	public void method5449() {
		@Pc(6) Class112 local6 = this.aClass112_36;
		synchronized (this.aClass112_36) {
			this.aClass112_36.method3638();
		}
		local6 = this.aClass112_37;
		synchronized (this.aClass112_37) {
			this.aClass112_37.method3638();
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(IB)V")
	public void method5451() {
		@Pc(6) Class112 local6 = this.aClass112_36;
		synchronized (this.aClass112_36) {
			this.aClass112_36.method3637(5);
		}
		local6 = this.aClass112_37;
		synchronized (this.aClass112_37) {
			this.aClass112_37.method3637(5);
		}
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(B)V")
	public void method5452() {
		@Pc(6) Class112 local6 = this.aClass112_36;
		synchronized (this.aClass112_36) {
			this.aClass112_36.method3643();
		}
		local6 = this.aClass112_37;
		synchronized (this.aClass112_37) {
			this.aClass112_37.method3643();
		}
	}
}

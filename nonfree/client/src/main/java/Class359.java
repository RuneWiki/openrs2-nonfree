import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class359 {

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "Lclient!gg;")
	private Class112 aClass112_68 = new Class112(64);

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "Lclient!kha;")
	private final Class181 aClass181_126;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;)V")
	public Class359(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2) {
		this.aClass181_126 = arg2;
		if (this.aClass181_126 != null) {
			@Pc(20) int local20 = this.aClass181_126.method5029() - 1;
			this.aClass181_126.method5025(local20);
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)V")
	public void method8265(@OriginalArg(0) int arg0) {
		@Pc(2) Class112 local2 = this.aClass112_68;
		synchronized (this.aClass112_68) {
			this.aClass112_68.method3638();
			this.aClass112_68 = new Class112(arg0);
		}
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
	public void method8266() {
		@Pc(6) Class112 local6 = this.aClass112_68;
		synchronized (this.aClass112_68) {
			this.aClass112_68.method3643();
		}
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)V")
	public void method8267() {
		@Pc(9) Class112 local9 = this.aClass112_68;
		synchronized (this.aClass112_68) {
			this.aClass112_68.method3638();
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BI)V")
	public void method8268() {
		@Pc(12) Class112 local12 = this.aClass112_68;
		synchronized (this.aClass112_68) {
			this.aClass112_68.method3637(5);
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Lclient!sa;")
	public Class297 method8269(@OriginalArg(1) int arg0) {
		@Pc(6) Class112 local6 = this.aClass112_68;
		@Pc(16) Class297 local16;
		synchronized (this.aClass112_68) {
			local16 = (Class297) this.aClass112_68.method3640((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class181 local29 = this.aClass181_126;
		@Pc(44) byte[] local44;
		synchronized (this.aClass181_126) {
			local44 = this.aClass181_126.method5023(Static398.method6369(arg0), Static476.method7561(arg0));
		}
		local16 = new Class297();
		if (local44 != null) {
			local16.method7315(new Class3_Sub15(local44));
		}
		@Pc(73) Class112 local73 = this.aClass112_68;
		synchronized (this.aClass112_68) {
			this.aClass112_68.method3636((long) arg0, local16);
			return local16;
		}
	}
}

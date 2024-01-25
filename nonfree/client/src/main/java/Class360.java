import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class360 {

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "Lclient!gg;")
	private final Class112 aClass112_69 = new Class112(64);

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "Lclient!kha;")
	private final Class181 aClass181_127;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;)V")
	public Class360(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2) {
		this.aClass181_127 = arg2;
		if (this.aClass181_127 != null) {
			this.aClass181_127.method5025(35);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IB)V")
	public void method8270() {
		@Pc(14) Class112 local14 = this.aClass112_69;
		synchronized (this.aClass112_69) {
			this.aClass112_69.method3637(5);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	public void method8271() {
		@Pc(6) Class112 local6 = this.aClass112_69;
		synchronized (this.aClass112_69) {
			this.aClass112_69.method3643();
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)Lclient!as;")
	public Class21 method8272(@OriginalArg(1) int arg0) {
		@Pc(6) Class112 local6 = this.aClass112_69;
		@Pc(16) Class21 local16;
		synchronized (this.aClass112_69) {
			local16 = (Class21) this.aClass112_69.method3640((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class181 local29 = this.aClass181_127;
		@Pc(38) byte[] local38;
		synchronized (this.aClass181_127) {
			local38 = this.aClass181_127.method5023(35, arg0);
		}
		local16 = new Class21();
		if (local38 != null) {
			local16.method414(new Class3_Sub15(local38));
		}
		local16.method415();
		@Pc(63) Class112 local63 = this.aClass112_69;
		synchronized (this.aClass112_69) {
			this.aClass112_69.method3636((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	public void method8273() {
		@Pc(10) Class112 local10 = this.aClass112_69;
		synchronized (this.aClass112_69) {
			this.aClass112_69.method3638();
		}
	}
}

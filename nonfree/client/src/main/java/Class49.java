import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class49 {

	@OriginalMember(owner = "client!co", name = "d", descriptor = "Lclient!gg;")
	private final Class112 aClass112_9 = new Class112(64);

	@OriginalMember(owner = "client!co", name = "i", descriptor = "Lclient!kha;")
	private final Class181 aClass181_11;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;)V")
	public Class49(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2) {
		this.aClass181_11 = arg2;
		if (this.aClass181_11 != null) {
			this.aClass181_11.method5025(11);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
	public void method1850() {
		@Pc(10) Class112 local10 = this.aClass112_9;
		synchronized (this.aClass112_9) {
			this.aClass112_9.method3643();
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V")
	public void method1853() {
		@Pc(6) Class112 local6 = this.aClass112_9;
		synchronized (this.aClass112_9) {
			this.aClass112_9.method3637(5);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
	public void method1854() {
		@Pc(2) Class112 local2 = this.aClass112_9;
		synchronized (this.aClass112_9) {
			this.aClass112_9.method3638();
		}
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(II)Lclient!ic;")
	public Class140 method1857(@OriginalArg(1) int arg0) {
		@Pc(6) Class112 local6 = this.aClass112_9;
		@Pc(16) Class140 local16;
		synchronized (this.aClass112_9) {
			local16 = (Class140) this.aClass112_9.method3640((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class181 local29 = this.aClass181_11;
		@Pc(38) byte[] local38;
		synchronized (this.aClass181_11) {
			local38 = this.aClass181_11.method5023(11, arg0);
		}
		local16 = new Class140();
		if (local38 != null) {
			local16.method4353(new Class3_Sub15(local38));
		}
		@Pc(71) Class112 local71 = this.aClass112_9;
		synchronized (this.aClass112_9) {
			this.aClass112_9.method3636((long) arg0, local16);
			return local16;
		}
	}
}

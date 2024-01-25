import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class356 {

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "Lclient!of;")
	private final Class236 aClass236_102 = new Class236(64);

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "Lclient!oh;")
	private final Class237 aClass237_141;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;)V")
	public Class356(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2) {
		this.aClass237_141 = arg2;
		if (this.aClass237_141 != null) {
			this.aClass237_141.method6315(35);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)Lclient!ria;")
	public Class295 method8253(@OriginalArg(1) int arg0) {
		@Pc(6) Class236 local6 = this.aClass236_102;
		@Pc(16) Class295 local16;
		synchronized (this.aClass236_102) {
			local16 = (Class295) this.aClass236_102.method6242((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class237 local29 = this.aClass237_141;
		@Pc(38) byte[] local38;
		synchronized (this.aClass237_141) {
			local38 = this.aClass237_141.method6314(35, arg0);
		}
		local16 = new Class295();
		if (local38 != null) {
			local16.method7176(new Class8_Sub8(local38));
		}
		local16.method7179();
		@Pc(68) Class236 local68 = this.aClass236_102;
		synchronized (this.aClass236_102) {
			this.aClass236_102.method6241((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
	public void method8254() {
		@Pc(22) Class236 local22 = this.aClass236_102;
		synchronized (this.aClass236_102) {
			this.aClass236_102.method6253();
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V")
	public void method8255() {
		@Pc(10) Class236 local10 = this.aClass236_102;
		synchronized (this.aClass236_102) {
			this.aClass236_102.method6243(5);
		}
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(B)V")
	public void method8257() {
		@Pc(2) Class236 local2 = this.aClass236_102;
		synchronized (this.aClass236_102) {
			this.aClass236_102.method6245();
		}
	}
}

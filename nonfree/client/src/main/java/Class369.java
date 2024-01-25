import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wea")
public final class Class369 {

	@OriginalMember(owner = "client!wea", name = "d", descriptor = "Lclient!of;")
	private final Class236 aClass236_104 = new Class236(64);

	@OriginalMember(owner = "client!wea", name = "l", descriptor = "I")
	public int anInt10421 = 0;

	@OriginalMember(owner = "client!wea", name = "j", descriptor = "Lclient!oh;")
	private final Class237 aClass237_146;

	@OriginalMember(owner = "client!wea", name = "i", descriptor = "I")
	public final int anInt10420;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;)V")
	public Class369(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2) {
		this.aClass237_146 = arg2;
		this.anInt10420 = this.aClass237_146.method6315(4);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)V")
	public void method8407() {
		@Pc(2) Class236 local2 = this.aClass236_104;
		synchronized (this.aClass236_104) {
			this.aClass236_104.method6253();
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)V")
	public void method8408() {
		@Pc(2) Class236 local2 = this.aClass236_104;
		synchronized (this.aClass236_104) {
			this.aClass236_104.method6245();
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IB)Lclient!oaa;")
	public Class232 method8410(@OriginalArg(0) int arg0) {
		@Pc(6) Class236 local6 = this.aClass236_104;
		@Pc(16) Class232 local16;
		synchronized (this.aClass236_104) {
			local16 = (Class232) this.aClass236_104.method6242((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class237 local29 = this.aClass237_146;
		@Pc(38) byte[] local38;
		synchronized (this.aClass237_146) {
			local38 = this.aClass237_146.method6314(4, arg0);
		}
		local16 = new Class232();
		local16.anInt7439 = arg0;
		local16.aClass369_4 = this;
		if (local38 != null) {
			local16.method6150(new Class8_Sub8(local38));
		}
		local16.method6147();
		@Pc(77) Class236 local77 = this.aClass236_104;
		synchronized (this.aClass236_104) {
			this.aClass236_104.method6241((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "(IB)V")
	public void method8411() {
		@Pc(2) Class236 local2 = this.aClass236_104;
		synchronized (this.aClass236_104) {
			this.aClass236_104.method6243(5);
		}
	}
}

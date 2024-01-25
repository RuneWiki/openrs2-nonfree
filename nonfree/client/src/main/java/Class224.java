import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class224 {

	@OriginalMember(owner = "client!tj", name = "k", descriptor = "Lclient!ff;")
	private Class83 aClass83_53 = new Class83(128);

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "Lclient!ff;")
	public Class83 aClass83_55 = new Class83(64);

	@OriginalMember(owner = "client!tj", name = "j", descriptor = "Lclient!vh;")
	private final Class250 aClass250_78;

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "Lclient!vh;")
	public final Class250 aClass250_77;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!lf;ILclient!vh;Lclient!vh;)V")
	public Class224(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) Class250 arg3) {
		this.aClass250_78 = arg2;
		this.aClass250_77 = arg3;
		this.aClass250_78.method5653(36);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)Lclient!tr;")
	public Class231 method5302(@OriginalArg(1) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_53;
		@Pc(16) Class231 local16;
		synchronized (this.aClass83_53) {
			local16 = (Class231) this.aClass83_53.method1658((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass250_78.method5667(arg0, 36);
		local16 = new Class231();
		local16.anInt6840 = arg0;
		local16.aClass224_4 = this;
		if (local33 != null) {
			local16.method5356(new Class1_Sub1(local33));
		}
		local16.method5363();
		@Pc(65) Class83 local65 = this.aClass83_53;
		synchronized (this.aClass83_53) {
			this.aClass83_53.method1675((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V")
	public void method5304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass83_53 = new Class83(arg1);
		this.aClass83_55 = new Class83(arg0);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	public void method5305() {
		@Pc(2) Class83 local2 = this.aClass83_53;
		synchronized (this.aClass83_53) {
			this.aClass83_53.method1667();
		}
		local2 = this.aClass83_55;
		synchronized (this.aClass83_55) {
			this.aClass83_55.method1667();
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)V")
	public void method5306() {
		@Pc(11) Class83 local11 = this.aClass83_53;
		synchronized (this.aClass83_53) {
			this.aClass83_53.method1663(5);
		}
		local11 = this.aClass83_55;
		synchronized (this.aClass83_55) {
			this.aClass83_55.method1663(5);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
	public void method5307() {
		@Pc(2) Class83 local2 = this.aClass83_53;
		synchronized (this.aClass83_53) {
			this.aClass83_53.method1669();
		}
		local2 = this.aClass83_55;
		synchronized (this.aClass83_55) {
			this.aClass83_55.method1669();
		}
	}
}

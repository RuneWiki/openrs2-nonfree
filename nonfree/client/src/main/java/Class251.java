import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class251 {

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "Lclient!ff;")
	private final Class83 aClass83_62 = new Class83(64);

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "Lclient!vh;")
	private final Class250 aClass250_88;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!lf;ILclient!vh;)V")
	public Class251(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_88 = arg2;
		if (this.aClass250_88 != null) {
			this.aClass250_88.method5653(35);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)Lclient!ha;")
	public Class102 method5677(@OriginalArg(0) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_62;
		@Pc(18) Class102 local18;
		synchronized (this.aClass83_62) {
			local18 = (Class102) this.aClass83_62.method1658((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(35) byte[] local35 = this.aClass250_88.method5667(arg0, 35);
		local18 = new Class102();
		if (local35 != null) {
			local18.method2137(new Class1_Sub1(local35));
		}
		local18.method2135();
		@Pc(59) Class83 local59 = this.aClass83_62;
		synchronized (this.aClass83_62) {
			this.aClass83_62.method1675((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	public void method5678() {
		@Pc(14) Class83 local14 = this.aClass83_62;
		synchronized (this.aClass83_62) {
			this.aClass83_62.method1667();
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
	public void method5680() {
		@Pc(2) Class83 local2 = this.aClass83_62;
		synchronized (this.aClass83_62) {
			this.aClass83_62.method1669();
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V")
	public void method5684() {
		@Pc(2) Class83 local2 = this.aClass83_62;
		synchronized (this.aClass83_62) {
			this.aClass83_62.method1663(5);
		}
	}
}

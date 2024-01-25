import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class113 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "Lclient!ff;")
	private final Class83 aClass83_26 = new Class83(64);

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "Lclient!vh;")
	private final Class250 aClass250_36;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
	public final int anInt3153;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!lf;ILclient!vh;)V")
	public Class113(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_36 = arg2;
		this.anInt3153 = this.aClass250_36.method5653(19);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)Lclient!lk;")
	public Class147 method2700(@OriginalArg(0) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_26;
		@Pc(16) Class147 local16;
		synchronized (this.aClass83_26) {
			local16 = (Class147) this.aClass83_26.method1658((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass250_36.method5667(arg0, 19);
		local16 = new Class147();
		if (local33 != null) {
			local16.method3432(new Class1_Sub1(local33));
		}
		@Pc(49) Class83 local49 = this.aClass83_26;
		synchronized (this.aClass83_26) {
			this.aClass83_26.method1675((long) arg0, local16);
			return local16;
		}
	}
}

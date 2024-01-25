import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class86 {

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "Lclient!lh;")
	private final Class151 aClass151_52 = new Class151(64);

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "Lclient!lh;")
	public final Class151 aClass151_53 = new Class151(2);

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "Lclient!hh;")
	private final Class109 aClass109_28;

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "Lclient!hh;")
	public final Class109 aClass109_27;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!mt;ILclient!hh;Lclient!hh;)V")
	public Class86(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) Class109 arg3) {
		this.aClass109_28 = arg2;
		this.aClass109_27 = arg3;
		this.aClass109_28.method2322(33);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
	public void method1708() {
		@Pc(2) Class151 local2 = this.aClass151_52;
		synchronized (this.aClass151_52) {
			this.aClass151_52.method3299();
		}
		local2 = this.aClass151_53;
		synchronized (this.aClass151_53) {
			this.aClass151_53.method3299();
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	public void method1709() {
		@Pc(2) Class151 local2 = this.aClass151_52;
		synchronized (this.aClass151_52) {
			this.aClass151_52.method3298();
		}
		local2 = this.aClass151_53;
		synchronized (this.aClass151_53) {
			this.aClass151_53.method3298();
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Lclient!eh;")
	public Class69 method1712(@OriginalArg(1) int arg0) {
		@Pc(21) Class151 local21 = this.aClass151_52;
		@Pc(33) Class69 local33;
		synchronized (this.aClass151_52) {
			local33 = (Class69) this.aClass151_52.method3288((long) arg0);
		}
		if (local33 != null) {
			return local33;
		}
		@Pc(50) byte[] local50 = this.aClass109_28.method2349(33, arg0);
		local33 = new Class69();
		local33.aClass86_1 = this;
		if (local50 != null) {
			local33.method1240(new Class1_Sub14(local50));
		}
		@Pc(69) Class151 local69 = this.aClass151_52;
		synchronized (this.aClass151_52) {
			this.aClass151_52.method3291((long) arg0, local33);
			return local33;
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)V")
	public void method1713() {
		@Pc(14) Class151 local14 = this.aClass151_52;
		synchronized (this.aClass151_52) {
			this.aClass151_52.method3297(5);
		}
		local14 = this.aClass151_53;
		synchronized (this.aClass151_53) {
			this.aClass151_53.method3297(5);
		}
	}
}

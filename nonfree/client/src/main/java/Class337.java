import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class337 {

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "Lclient!mga;")
	private Class223 aClass223_63 = new Class223(128);

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "Lclient!mga;")
	public Class223 aClass223_64 = new Class223(64);

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "Lclient!bi;")
	public final Class31 aClass31_114;

	@OriginalMember(owner = "client!uk", name = "j", descriptor = "Lclient!bi;")
	private final Class31 aClass31_115;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;Lclient!bi;)V")
	public Class337(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class31 arg3) {
		this.aClass31_114 = arg3;
		this.aClass31_115 = arg2;
		this.aClass31_115.method657(36);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	public void method7440() {
		@Pc(2) Class223 local2 = this.aClass223_63;
		synchronized (this.aClass223_63) {
			this.aClass223_63.method4932();
		}
		local2 = this.aClass223_64;
		synchronized (this.aClass223_64) {
			this.aClass223_64.method4932();
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)Lclient!ee;")
	public Class86 method7441(@OriginalArg(0) int arg0) {
		@Pc(11) Class223 local11 = this.aClass223_63;
		@Pc(21) Class86 local21;
		synchronized (this.aClass223_63) {
			local21 = (Class86) this.aClass223_63.method4943((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class31 local34 = this.aClass31_115;
		@Pc(43) byte[] local43;
		synchronized (this.aClass31_115) {
			local43 = this.aClass31_115.method667(36, arg0);
		}
		local21 = new Class86();
		local21.anInt2711 = arg0;
		local21.aClass337_1 = this;
		if (local43 != null) {
			local21.method2409(new Class4_Sub9(local43));
		}
		local21.method2397();
		@Pc(74) Class223 local74 = this.aClass223_63;
		synchronized (this.aClass223_63) {
			this.aClass223_63.method4938((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZ)V")
	public void method7443() {
		@Pc(11) Class223 local11 = this.aClass223_63;
		synchronized (this.aClass223_63) {
			this.aClass223_63.method4933(5);
		}
		local11 = this.aClass223_64;
		synchronized (this.aClass223_64) {
			this.aClass223_64.method4933(5);
		}
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
	public void method7444() {
		@Pc(10) Class223 local10 = this.aClass223_63;
		synchronized (this.aClass223_63) {
			this.aClass223_63.method4941();
		}
		local10 = this.aClass223_64;
		synchronized (this.aClass223_64) {
			this.aClass223_64.method4941();
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)V")
	public void method7445(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass223_63 = new Class223(arg1);
		this.aClass223_64 = new Class223(arg0);
	}
}

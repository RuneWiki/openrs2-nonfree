import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class58 {

	@OriginalMember(owner = "client!du", name = "h", descriptor = "Lclient!rp;")
	private Class220 aClass220_6 = new Class220(64);

	@OriginalMember(owner = "client!du", name = "d", descriptor = "Lclient!lt;")
	private final Class158 aClass158_18;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lclient!cm;ILclient!lt;)V")
	public Class58(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2) {
		this.aClass158_18 = arg2;
		if (this.aClass158_18 != null) {
			@Pc(20) int local20 = this.aClass158_18.method3695() - 1;
			this.aClass158_18.method3683(local20);
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V")
	public void method1459() {
		@Pc(2) Class220 local2 = this.aClass220_6;
		synchronized (this.aClass220_6) {
			this.aClass220_6.method4999();
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(II)V")
	public void method1461() {
		@Pc(2) Class220 local2 = this.aClass220_6;
		synchronized (this.aClass220_6) {
			this.aClass220_6.method4998(5);
		}
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(B)V")
	public void method1463() {
		@Pc(2) Class220 local2 = this.aClass220_6;
		synchronized (this.aClass220_6) {
			this.aClass220_6.method4987();
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IB)Lclient!k;")
	public Class134 method1465(@OriginalArg(0) int arg0) {
		@Pc(6) Class220 local6 = this.aClass220_6;
		@Pc(16) Class134 local16;
		synchronized (this.aClass220_6) {
			local16 = (Class134) this.aClass220_6.method4990((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass158_18.method3672(Static403.method5490(arg0), Static181.method2816(arg0));
		local16 = new Class134();
		if (local37 != null) {
			local16.method3067(new Class6_Sub15(local37));
		}
		@Pc(53) Class220 local53 = this.aClass220_6;
		synchronized (this.aClass220_6) {
			this.aClass220_6.method4996(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(II)V")
	public void method1466(@OriginalArg(0) int arg0) {
		@Pc(14) Class220 local14 = this.aClass220_6;
		synchronized (this.aClass220_6) {
			this.aClass220_6.method4999();
			this.aClass220_6 = new Class220(arg0);
		}
	}
}

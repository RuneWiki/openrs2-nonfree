import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class21 {

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "Lclient!hn;")
	private final Class102 aClass102_5 = new Class102(64);

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "Lclient!fo;")
	private final Class82 aClass82_5;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!d;ILclient!fo;)V")
	public Class21(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2) {
		this.aClass82_5 = arg2;
		this.aClass82_5.method1823(32);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	public void method394() {
		@Pc(2) Class102 local2 = this.aClass102_5;
		synchronized (this.aClass102_5) {
			this.aClass102_5.method2260();
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	public void method395() {
		@Pc(2) Class102 local2 = this.aClass102_5;
		synchronized (this.aClass102_5) {
			this.aClass102_5.method2271();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)Lclient!ti;")
	public Class236 method396(@OriginalArg(0) int arg0) {
		@Pc(11) Class102 local11 = this.aClass102_5;
		@Pc(21) Class236 local21;
		synchronized (this.aClass102_5) {
			local21 = (Class236) this.aClass102_5.method2258((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class82 local34 = this.aClass82_5;
		@Pc(43) byte[] local43;
		synchronized (this.aClass82_5) {
			local43 = this.aClass82_5.method1817(32, arg0);
		}
		local21 = new Class236();
		if (local43 != null) {
			local21.method5072(new Class1_Sub28(local43));
		}
		@Pc(65) Class102 local65 = this.aClass102_5;
		synchronized (this.aClass102_5) {
			this.aClass102_5.method2272((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
	public void method397() {
		@Pc(6) Class102 local6 = this.aClass102_5;
		synchronized (this.aClass102_5) {
			this.aClass102_5.method2262(5);
		}
	}
}

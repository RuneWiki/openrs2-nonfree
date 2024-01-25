import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class61 {

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "Lclient!jp;")
	private final Class129 aClass129_13 = new Class129(64);

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Lclient!pc;")
	public final Class188 aClass188_26;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Lclient!pc;")
	private final Class188 aClass188_27;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!rb;ILclient!pc;Lclient!pc;)V")
	public Class61(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2, @OriginalArg(3) Class188 arg3) {
		this.aClass188_26 = arg3;
		this.aClass188_27 = arg2;
		this.aClass188_27.method4285(3);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)V")
	public void method1478() {
		@Pc(2) Class129 local2 = this.aClass129_13;
		synchronized (this.aClass129_13) {
			this.aClass129_13.method3028(5);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)Lclient!fl;")
	public Class86 method1479(@OriginalArg(1) int arg0) {
		@Pc(6) Class129 local6 = this.aClass129_13;
		@Pc(16) Class86 local16;
		synchronized (this.aClass129_13) {
			local16 = (Class86) this.aClass129_13.method3023((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass188_27.method4283(3, arg0);
		local16 = new Class86();
		local16.aClass61_2 = this;
		if (local38 != null) {
			local16.method1727(new Class2_Sub20(local38));
		}
		@Pc(57) Class129 local57 = this.aClass129_13;
		synchronized (this.aClass129_13) {
			this.aClass129_13.method3029(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	public void method1480() {
		@Pc(2) Class129 local2 = this.aClass129_13;
		synchronized (this.aClass129_13) {
			this.aClass129_13.method3025();
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
	public void method1484() {
		@Pc(6) Class129 local6 = this.aClass129_13;
		synchronized (this.aClass129_13) {
			this.aClass129_13.method3026();
		}
	}
}

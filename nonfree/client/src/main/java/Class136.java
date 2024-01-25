import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class136 {

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "Lclient!jp;")
	private final Class129 aClass129_34 = new Class129(64);

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "Lclient!pc;")
	private final Class188 aClass188_56;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!rb;ILclient!pc;)V")
	public Class136(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2) {
		this.aClass188_56 = arg2;
		this.aClass188_56.method4285(32);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
	public void method3177() {
		@Pc(6) Class129 local6 = this.aClass129_34;
		synchronized (this.aClass129_34) {
			this.aClass129_34.method3025();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)Lclient!an;")
	public Class12 method3178(@OriginalArg(0) int arg0) {
		@Pc(14) Class129 local14 = this.aClass129_34;
		@Pc(24) Class12 local24;
		synchronized (this.aClass129_34) {
			local24 = (Class12) this.aClass129_34.method3023((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(41) byte[] local41 = this.aClass188_56.method4283(32, arg0);
		local24 = new Class12();
		if (local41 != null) {
			local24.method224(new Class2_Sub20(local41));
		}
		@Pc(57) Class129 local57 = this.aClass129_34;
		synchronized (this.aClass129_34) {
			this.aClass129_34.method3029(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
	public void method3179() {
		@Pc(2) Class129 local2 = this.aClass129_34;
		synchronized (this.aClass129_34) {
			this.aClass129_34.method3028(5);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	public void method3180() {
		@Pc(2) Class129 local2 = this.aClass129_34;
		synchronized (this.aClass129_34) {
			this.aClass129_34.method3026();
		}
	}
}

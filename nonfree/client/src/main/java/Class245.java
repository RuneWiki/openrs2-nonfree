import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class245 {

	@OriginalMember(owner = "client!uk", name = "o", descriptor = "Lclient!jp;")
	private final Class129 aClass129_69 = new Class129(64);

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
	public int anInt7044 = 0;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "Lclient!pc;")
	private final Class188 aClass188_118;

	@OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
	public final int anInt7040;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!rb;ILclient!pc;)V")
	public Class245(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2) {
		this.aClass188_118 = arg2;
		this.anInt7040 = this.aClass188_118.method4285(4);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)V")
	public void method5496() {
		@Pc(2) Class129 local2 = this.aClass129_69;
		synchronized (this.aClass129_69) {
			this.aClass129_69.method3028(5);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	public void method5497() {
		@Pc(2) Class129 local2 = this.aClass129_69;
		synchronized (this.aClass129_69) {
			this.aClass129_69.method3026();
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(IB)Lclient!dq;")
	public Class54 method5500(@OriginalArg(0) int arg0) {
		@Pc(11) Class129 local11 = this.aClass129_69;
		@Pc(21) Class54 local21;
		synchronized (this.aClass129_69) {
			local21 = (Class54) this.aClass129_69.method3023((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass188_118.method4283(4, arg0);
		local21 = new Class54();
		local21.aClass245_4 = this;
		local21.anInt1915 = arg0;
		if (local38 != null) {
			local21.method1392(new Class2_Sub20(local38));
		}
		local21.method1391();
		@Pc(63) Class129 local63 = this.aClass129_69;
		synchronized (this.aClass129_69) {
			this.aClass129_69.method3029(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
	public void method5502() {
		@Pc(11) Class129 local11 = this.aClass129_69;
		synchronized (this.aClass129_69) {
			this.aClass129_69.method3025();
		}
	}
}

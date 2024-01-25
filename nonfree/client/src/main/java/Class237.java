import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class237 {

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "Lclient!jp;")
	private final Class129 aClass129_65 = new Class129(64);

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "Lclient!pc;")
	private final Class188 aClass188_112;

	@OriginalMember(owner = "client!tt", name = "m", descriptor = "I")
	public final int anInt6868;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!rb;ILclient!pc;)V")
	public Class237(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2) {
		this.aClass188_112 = arg2;
		if (this.aClass188_112 == null) {
			this.anInt6868 = 0;
		} else {
			this.anInt6868 = this.aClass188_112.method4285(16);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
	public void method5377() {
		@Pc(2) Class129 local2 = this.aClass129_65;
		synchronized (this.aClass129_65) {
			this.aClass129_65.method3025();
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V")
	public void method5378() {
		@Pc(2) Class129 local2 = this.aClass129_65;
		synchronized (this.aClass129_65) {
			this.aClass129_65.method3026();
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZI)Lclient!om;")
	public Class181 method5379(@OriginalArg(1) int arg0) {
		@Pc(11) Class129 local11 = this.aClass129_65;
		@Pc(21) Class181 local21;
		synchronized (this.aClass129_65) {
			local21 = (Class181) this.aClass129_65.method3023((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass188_112.method4283(16, arg0);
		local21 = new Class181();
		if (local38 != null) {
			local21.method4166(new Class2_Sub20(local38));
		}
		@Pc(54) Class129 local54 = this.aClass129_65;
		synchronized (this.aClass129_65) {
			this.aClass129_65.method3029(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)V")
	public void method5381() {
		@Pc(14) Class129 local14 = this.aClass129_65;
		synchronized (this.aClass129_65) {
			this.aClass129_65.method3028(5);
		}
	}
}

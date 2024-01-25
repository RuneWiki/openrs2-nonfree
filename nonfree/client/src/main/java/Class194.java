import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class194 {

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "Lclient!jp;")
	private final Class129 aClass129_50 = new Class129(64);

	@OriginalMember(owner = "client!pp", name = "p", descriptor = "Lclient!jp;")
	private final Class129 aClass129_51 = new Class129(100);

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "Lclient!pc;")
	private final Class188 aClass188_80;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!rb;ILclient!pc;Lclient!pc;Lclient!pc;)V")
	public Class194(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2, @OriginalArg(3) Class188 arg3, @OriginalArg(4) Class188 arg4) {
		this.aClass188_80 = arg2;
		if (this.aClass188_80 != null) {
			@Pc(26) int local26 = this.aClass188_80.method4299() - 1;
			this.aClass188_80.method4285(local26);
		}
		Static195.method3039(arg4, arg3);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IB)Lclient!dc;")
	public Class46 method4371(@OriginalArg(0) int arg0) {
		@Pc(11) Class129 local11 = this.aClass129_50;
		@Pc(21) Class46 local21;
		synchronized (this.aClass129_50) {
			local21 = (Class46) this.aClass129_50.method3023((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(42) byte[] local42 = this.aClass188_80.method4283(Static313.method4435(arg0), Static330.method4705(arg0));
		local21 = new Class46();
		local21.anInt1768 = arg0;
		local21.aClass194_2 = this;
		if (local42 != null) {
			local21.method1263(new Class2_Sub20(local42));
		}
		local21.method1262();
		@Pc(67) Class129 local67 = this.aClass129_50;
		synchronized (this.aClass129_50) {
			this.aClass129_50.method3029(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)V")
	public void method4374() {
		@Pc(6) Class129 local6 = this.aClass129_50;
		synchronized (this.aClass129_50) {
			this.aClass129_50.method3028(5);
		}
		local6 = this.aClass129_51;
		synchronized (this.aClass129_51) {
			this.aClass129_51.method3028(5);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)V")
	public void method4375() {
		@Pc(11) Class129 local11 = this.aClass129_50;
		synchronized (this.aClass129_50) {
			this.aClass129_50.method3025();
		}
		local11 = this.aClass129_51;
		synchronized (this.aClass129_51) {
			this.aClass129_51.method3025();
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(II)Lclient!dr;")
	public Class2_Sub2_Sub7 method4376(@OriginalArg(0) int arg0) {
		@Pc(6) Class129 local6 = this.aClass129_51;
		@Pc(16) Class2_Sub2_Sub7 local16;
		synchronized (this.aClass129_51) {
			local16 = (Class2_Sub2_Sub7) this.aClass129_51.method3023((long) arg0);
			if (local16 == null) {
				local16 = new Class2_Sub2_Sub7(arg0);
				this.aClass129_51.method3029(local16, (long) arg0);
			}
		}
		synchronized (local16) {
			return local16.method1406() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
	public void method4378() {
		@Pc(6) Class129 local6 = this.aClass129_50;
		synchronized (this.aClass129_50) {
			this.aClass129_50.method3026();
		}
		local6 = this.aClass129_51;
		synchronized (this.aClass129_51) {
			this.aClass129_51.method3026();
		}
	}
}

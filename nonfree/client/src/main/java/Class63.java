import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cka")
public final class Class63 {

	@OriginalMember(owner = "client!cka", name = "h", descriptor = "Lclient!jda;")
	private final Class165 aClass165_14 = new Class165(64);

	@OriginalMember(owner = "client!cka", name = "p", descriptor = "I")
	public int anInt1430 = 0;

	@OriginalMember(owner = "client!cka", name = "i", descriptor = "Lclient!aj;")
	private final Class15 aClass15_23;

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "I")
	public final int anInt1421;

	@OriginalMember(owner = "client!cka", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;)V")
	public Class63(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		this.aClass15_23 = arg2;
		this.anInt1421 = this.aClass15_23.method512(4);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(I)V")
	public void method1436() {
		@Pc(6) Class165 local6 = this.aClass165_14;
		synchronized (this.aClass165_14) {
			this.aClass165_14.method4403();
		}
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(B)V")
	public void method1439() {
		@Pc(8) Class165 local8 = this.aClass165_14;
		synchronized (this.aClass165_14) {
			this.aClass165_14.method4400();
		}
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(II)V")
	public void method1440() {
		@Pc(8) Class165 local8 = this.aClass165_14;
		synchronized (this.aClass165_14) {
			this.aClass165_14.method4394(5);
		}
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IB)Lclient!ck;")
	public Class62 method1441(@OriginalArg(0) int arg0) {
		@Pc(6) Class165 local6 = this.aClass165_14;
		@Pc(16) Class62 local16;
		synchronized (this.aClass165_14) {
			local16 = (Class62) this.aClass165_14.method4389((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class15 local29 = this.aClass15_23;
		@Pc(38) byte[] local38;
		synchronized (this.aClass15_23) {
			local38 = this.aClass15_23.method517(arg0, 4);
		}
		local16 = new Class62();
		local16.anInt1411 = arg0;
		local16.aClass63_1 = this;
		if (local38 != null) {
			local16.method1427(new Class3_Sub25(local38));
		}
		local16.method1431();
		@Pc(74) Class165 local74 = this.aClass165_14;
		synchronized (this.aClass165_14) {
			this.aClass165_14.method4392(local16, (long) arg0);
			return local16;
		}
	}
}

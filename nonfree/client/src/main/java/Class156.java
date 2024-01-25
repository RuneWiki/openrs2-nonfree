import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class156 {

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "Lclient!fc;")
	private final Class94 aClass94_27 = new Class94(64);

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "Lclient!ni;")
	private final Class223 aClass223_62;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
	public final int anInt5796;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;)V")
	public Class156(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_62 = arg2;
		if (this.aClass223_62 == null) {
			this.anInt5796 = 0;
		} else {
			this.anInt5796 = this.aClass223_62.method5970(16);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public void method4846() {
		@Pc(6) Class94 local6 = this.aClass94_27;
		synchronized (this.aClass94_27) {
			this.aClass94_27.method2952();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)Lclient!ld;")
	public Class181 method4847(@OriginalArg(0) int arg0) {
		@Pc(6) Class94 local6 = this.aClass94_27;
		@Pc(16) Class181 local16;
		synchronized (this.aClass94_27) {
			local16 = (Class181) this.aClass94_27.method2960((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class223 local29 = this.aClass223_62;
		@Pc(44) byte[] local44;
		synchronized (this.aClass223_62) {
			local44 = this.aClass223_62.method5954(arg0, 16);
		}
		local16 = new Class181();
		if (local44 != null) {
			local16.method5249(new Class6_Sub8(local44));
		}
		@Pc(66) Class94 local66 = this.aClass94_27;
		synchronized (this.aClass94_27) {
			this.aClass94_27.method2963((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
	public void method4848() {
		@Pc(10) Class94 local10 = this.aClass94_27;
		synchronized (this.aClass94_27) {
			this.aClass94_27.method2964();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)V")
	public void method4849() {
		@Pc(10) Class94 local10 = this.aClass94_27;
		synchronized (this.aClass94_27) {
			this.aClass94_27.method2958(5);
		}
	}
}

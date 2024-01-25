import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class92 {

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "Lclient!pca;")
	private final Class245 aClass245_26 = new Class245(64);

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "Lclient!jo;")
	private final Class168 aClass168_33;

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "Lclient!jo;")
	private final Class168 aClass168_32;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(ILclient!jo;Lclient!jo;)V")
	public Class92(@OriginalArg(0) int arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) Class168 arg2) {
		this.aClass168_33 = arg1;
		this.aClass168_32 = arg2;
		if (this.aClass168_33 != null) {
			this.aClass168_33.method4443(0);
		}
		if (this.aClass168_32 != null) {
			this.aClass168_32.method4443(0);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IB)Lclient!iq;")
	public Class6_Sub4_Sub7 method2484(@OriginalArg(0) int arg0) {
		@Pc(11) Class6_Sub4_Sub7 local11 = (Class6_Sub4_Sub7) this.aClass245_26.method6082((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass168_32.method4435(arg0 & 0x7FFF, 0);
		} else {
			local27 = this.aClass168_33.method4435(arg0, 0);
		}
		local11 = new Class6_Sub4_Sub7();
		if (local27 != null) {
			local11.method4097(new Class6_Sub26(local27));
		}
		if (arg0 >= 32768) {
			local11.method4098();
		}
		this.aClass245_26.method6075(local11, (long) arg0);
		return local11;
	}
}

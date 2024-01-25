import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class208 {

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "Lclient!of;")
	private final Class236 aClass236_65 = new Class236(64);

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "Lclient!oh;")
	private final Class237 aClass237_95;

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "Lclient!oh;")
	private final Class237 aClass237_94;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(ILclient!oh;Lclient!oh;)V")
	public Class208(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) Class237 arg2) {
		this.aClass237_95 = arg2;
		this.aClass237_94 = arg1;
		if (this.aClass237_94 != null) {
			this.aClass237_94.method6315(0);
		}
		if (this.aClass237_95 != null) {
			this.aClass237_95.method6315(0);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)Lclient!baa;")
	public Class8_Sub5_Sub2 method5471(@OriginalArg(1) int arg0) {
		@Pc(13) Class8_Sub5_Sub2 local13 = (Class8_Sub5_Sub2) this.aClass236_65.method6242((long) arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = this.aClass237_94.method6314(0, arg0);
		} else {
			local27 = this.aClass237_95.method6314(0, arg0 & 0x7FFF);
		}
		local13 = new Class8_Sub5_Sub2();
		if (local27 != null) {
			local13.method1112(new Class8_Sub8(local27));
		}
		if (arg0 >= 32768) {
			local13.method1114();
		}
		this.aClass236_65.method6241((long) arg0, local13);
		return local13;
	}
}

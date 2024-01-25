import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class23 {

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "Lclient!au;")
	private final Class21 aClass21_7 = new Class21(64);

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "Lclient!mv;")
	private final Class229 aClass229_5;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "Lclient!mv;")
	private final Class229 aClass229_4;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(ILclient!mv;Lclient!mv;)V")
	public Class23(@OriginalArg(0) int arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) Class229 arg2) {
		this.aClass229_5 = arg1;
		this.aClass229_4 = arg2;
		if (this.aClass229_5 != null) {
			this.aClass229_5.method4981(0);
		}
		if (this.aClass229_4 != null) {
			this.aClass229_4.method4981(0);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Lclient!ab;")
	public Class2_Sub2_Sub1 method361(@OriginalArg(0) int arg0) {
		@Pc(11) Class2_Sub2_Sub1 local11 = (Class2_Sub2_Sub1) this.aClass21_7.method324((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass229_4.method4980(0, arg0 & 0x7FFF);
		} else {
			local27 = this.aClass229_5.method4980(0, arg0);
		}
		local11 = new Class2_Sub2_Sub1();
		if (local27 != null) {
			local11.method58(new Class2_Sub7(local27));
		}
		if (arg0 >= 32768) {
			local11.method55();
		}
		this.aClass21_7.method317(local11, (long) arg0);
		return local11;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class79 {

	@OriginalMember(owner = "client!et", name = "c", descriptor = "Lclient!fr;")
	private final Class91 aClass91_32 = new Class91(64);

	@OriginalMember(owner = "client!et", name = "e", descriptor = "Lclient!qs;")
	private final Class211 aClass211_27;

	@OriginalMember(owner = "client!et", name = "i", descriptor = "Lclient!qs;")
	private final Class211 aClass211_28;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(ILclient!qs;Lclient!qs;)V")
	public Class79(@OriginalArg(0) int arg0, @OriginalArg(1) Class211 arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_27 = arg1;
		this.aClass211_28 = arg2;
		if (this.aClass211_27 != null) {
			this.aClass211_27.method4772(0);
		}
		if (this.aClass211_28 != null) {
			this.aClass211_28.method4772(0);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II)Lclient!cr;")
	public Class1_Sub1_Sub5 method1757(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub1_Sub5 local11 = (Class1_Sub1_Sub5) this.aClass91_32.method1988((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = this.aClass211_27.method4758(arg0, 0);
		} else {
			local27 = this.aClass211_28.method4758(arg0 & 0x7FFF, 0);
		}
		local11 = new Class1_Sub1_Sub5();
		if (local27 != null) {
			local11.method1143(new Class1_Sub3(local27));
		}
		if (arg0 >= 32768) {
			local11.method1147();
		}
		this.aClass91_32.method1990(local11, (long) arg0);
		return local11;
	}
}

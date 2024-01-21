import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class17 {

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Lclient!db;")
	private final Class3_Sub1 aClass3_Sub1_25 = new Class3_Sub1();

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "Lclient!lf;")
	private final Class43 aClass43_1 = new Class43();

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
	private final int anInt989;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "Lclient!wd;")
	private final Class82 aClass82_2;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I)V")
	public Class17(@OriginalArg(0) int arg0) {
		this.anInt988 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.anInt989 = arg0;
		this.aClass82_2 = new Class82(local16);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IJ)Lclient!db;")
	public Class3_Sub1 method643(@OriginalArg(1) long arg0) {
		@Pc(24) Class3_Sub1 local24 = (Class3_Sub1) this.aClass82_2.method2305(arg0);
		if (local24 != null) {
			this.aClass43_1.method1392(local24);
		}
		return local24;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(JBLclient!db;)V")
	public void method644(@OriginalArg(0) long arg0, @OriginalArg(2) Class3_Sub1 arg1) {
		if (this.anInt988 == 0) {
			@Pc(7) Class3_Sub1 local7 = this.aClass43_1.method1394();
			local7.method2264();
			local7.method2270();
			if (local7 == this.aClass3_Sub1_25) {
				local7 = this.aClass43_1.method1394();
				local7.method2264();
				local7.method2270();
			}
		} else {
			this.anInt988--;
		}
		this.aClass82_2.method2303(arg1, arg0);
		this.aClass43_1.method1392(arg1);
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
	public void method646() {
		while (true) {
			@Pc(10) Class3_Sub1 local10 = this.aClass43_1.method1394();
			if (local10 == null) {
				this.anInt988 = this.anInt989;
				return;
			}
			local10.method2264();
			local10.method2270();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZJ)V")
	public void method649(@OriginalArg(1) long arg0) {
		@Pc(10) Class3_Sub1 local10 = (Class3_Sub1) this.aClass82_2.method2305(arg0);
		if (local10 != null) {
			local10.method2264();
			local10.method2270();
			this.anInt988++;
		}
	}
}

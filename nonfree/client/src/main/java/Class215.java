import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class215 {

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "Lclient!au;")
	private final Class21 aClass21_48 = new Class21(128);

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "Lclient!mv;")
	private final Class229 aClass229_75;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;)V")
	public Class215(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2) {
		this.aClass229_75 = arg2;
		if (this.aClass229_75 != null) {
			@Pc(20) int local20 = this.aClass229_75.method4952() - 1;
			this.aClass229_75.method4981(local20);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)Lclient!fi;")
	public Class108 method4452(@OriginalArg(0) int arg0) {
		@Pc(6) Class21 local6 = this.aClass21_48;
		@Pc(16) Class108 local16;
		synchronized (this.aClass21_48) {
			local16 = (Class108) this.aClass21_48.method324((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass229_75.method4980(Static549.method7174(arg0), Static6.method120(arg0));
		local16 = new Class108();
		if (local37 != null) {
			local16.method1994(new Class2_Sub7(local37));
		}
		@Pc(58) Class21 local58 = this.aClass21_48;
		synchronized (this.aClass21_48) {
			this.aClass21_48.method317(local16, (long) arg0);
			return local16;
		}
	}
}

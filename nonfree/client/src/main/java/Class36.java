import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class36 {

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "Lclient!jv;")
	private Class126 aClass126_9 = new Class126(64);

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "Lclient!bu;")
	private final Class32 aClass32_16;

	static {
		new Class189("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!oq;ILclient!bu;)V")
	public Class36(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2) {
		this.aClass32_16 = arg2;
		if (this.aClass32_16 != null) {
			@Pc(20) int local20 = this.aClass32_16.method809() - 1;
			this.aClass32_16.method790(local20);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V")
	public void method853(@OriginalArg(1) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_9;
		synchronized (this.aClass126_9) {
			this.aClass126_9.method3135();
			this.aClass126_9 = new Class126(arg0);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public void method856() {
		@Pc(2) Class126 local2 = this.aClass126_9;
		synchronized (this.aClass126_9) {
			this.aClass126_9.method3135();
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)Lclient!vs;")
	public Class261 method857(@OriginalArg(0) int arg0) {
		@Pc(11) Class126 local11 = this.aClass126_9;
		@Pc(21) Class261 local21;
		synchronized (this.aClass126_9) {
			local21 = (Class261) this.aClass126_9.method3141((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(42) byte[] local42 = this.aClass32_16.method785(Static129.method2029(arg0), Static204.method3186(arg0));
		local21 = new Class261();
		if (local42 != null) {
			local21.method5731(new Class3_Sub7(local42));
		}
		@Pc(58) Class126 local58 = this.aClass126_9;
		synchronized (this.aClass126_9) {
			this.aClass126_9.method3132((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)V")
	public void method859() {
		@Pc(2) Class126 local2 = this.aClass126_9;
		synchronized (this.aClass126_9) {
			this.aClass126_9.method3140(5);
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
	public void method860() {
		@Pc(2) Class126 local2 = this.aClass126_9;
		synchronized (this.aClass126_9) {
			this.aClass126_9.method3131();
		}
	}
}

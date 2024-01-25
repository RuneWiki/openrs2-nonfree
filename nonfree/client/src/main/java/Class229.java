import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class229 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Lclient!dc;")
	private final Class44 aClass44_49 = new Class44(256);

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "Lclient!he;")
	private final Class100 aClass100_78;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!ci;ILclient!he;)V")
	public Class229(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		this.aClass100_78 = arg2;
		this.aClass100_78.method2523(26);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lclient!ua;")
	public Class6_Sub2_Sub14 method5603(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_49;
		@Pc(18) Class6_Sub2_Sub14 local18;
		synchronized (this.aClass44_49) {
			local18 = (Class6_Sub2_Sub14) this.aClass44_49.method1353((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(35) byte[] local35 = this.aClass100_78.method2520(arg0, 26);
		local18 = new Class6_Sub2_Sub14();
		if (local35 != null) {
			local18.method5765(new Class6_Sub1(local35));
		}
		@Pc(51) Class44 local51 = this.aClass44_49;
		synchronized (this.aClass44_49) {
			this.aClass44_49.method1349(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
	public void method5605() {
		@Pc(2) Class44 local2 = this.aClass44_49;
		synchronized (this.aClass44_49) {
			this.aClass44_49.method1351();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)V")
	public void method5607() {
		@Pc(6) Class44 local6 = this.aClass44_49;
		synchronized (this.aClass44_49) {
			this.aClass44_49.method1352(5);
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
	public void method5608() {
		@Pc(11) Class44 local11 = this.aClass44_49;
		synchronized (this.aClass44_49) {
			this.aClass44_49.method1348();
		}
	}
}

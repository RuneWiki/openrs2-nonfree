import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class18 {

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "Lclient!au;")
	private final Class21 aClass21_4 = new Class21(64);

	@OriginalMember(owner = "client!ar", name = "i", descriptor = "Lclient!au;")
	private final Class21 aClass21_5 = new Class21(100);

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "Lclient!mv;")
	private final Class229 aClass229_3;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;Lclient!mv;Lclient!mv;)V")
	public Class18(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2, @OriginalArg(3) Class229 arg3, @OriginalArg(4) Class229 arg4) {
		this.aClass229_3 = arg2;
		if (this.aClass229_3 != null) {
			@Pc(26) int local26 = this.aClass229_3.method4952() - 1;
			this.aClass229_3.method4981(local26);
		}
		Static109.method1597(arg4, arg3);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)Lclient!ofa;")
	public Class2_Sub2_Sub15 method292(@OriginalArg(1) int arg0) {
		@Pc(6) Class21 local6 = this.aClass21_5;
		synchronized (this.aClass21_5) {
			@Pc(18) Class2_Sub2_Sub15 local18 = (Class2_Sub2_Sub15) this.aClass21_5.method324((long) arg0);
			if (local18 == null) {
				local18 = new Class2_Sub2_Sub15(arg0);
				this.aClass21_5.method317(local18, (long) arg0);
			}
			return local18.method5306() ? local18 : null;
		}
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(II)V")
	public void method293() {
		@Pc(6) Class21 local6 = this.aClass21_4;
		synchronized (this.aClass21_4) {
			this.aClass21_4.method323(5);
		}
		local6 = this.aClass21_5;
		synchronized (this.aClass21_5) {
			this.aClass21_5.method323(5);
		}
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(II)Lclient!hq;")
	public Class148 method296(@OriginalArg(1) int arg0) {
		@Pc(6) Class21 local6 = this.aClass21_4;
		@Pc(16) Class148 local16;
		synchronized (this.aClass21_4) {
			local16 = (Class148) this.aClass21_4.method324((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class229 local37 = this.aClass229_3;
		@Pc(50) byte[] local50;
		synchronized (this.aClass229_3) {
			local50 = this.aClass229_3.method4980(Static47.method843(arg0), Static334.method7629(arg0));
		}
		local16 = new Class148();
		local16.anInt3056 = arg0;
		local16.aClass18_2 = this;
		if (local50 != null) {
			local16.method2584(new Class2_Sub7(local50));
		}
		local16.method2583();
		@Pc(81) Class21 local81 = this.aClass21_4;
		synchronized (this.aClass21_4) {
			this.aClass21_4.method317(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
	public void method297() {
		@Pc(2) Class21 local2 = this.aClass21_4;
		synchronized (this.aClass21_4) {
			this.aClass21_4.method314();
		}
		local2 = this.aClass21_5;
		synchronized (this.aClass21_5) {
			this.aClass21_5.method314();
		}
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
	public void method298() {
		@Pc(2) Class21 local2 = this.aClass21_4;
		synchronized (this.aClass21_4) {
			this.aClass21_4.method313();
		}
		local2 = this.aClass21_5;
		synchronized (this.aClass21_5) {
			this.aClass21_5.method313();
		}
	}
}

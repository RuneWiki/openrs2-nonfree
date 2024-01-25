import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public final class Class49 {

	@OriginalMember(owner = "client!cda", name = "p", descriptor = "I")
	public int anInt1075;

	@OriginalMember(owner = "client!cda", name = "h", descriptor = "Lclient!au;")
	private final Class21 aClass21_13 = new Class21(64);

	@OriginalMember(owner = "client!cda", name = "o", descriptor = "Lclient!au;")
	public final Class21 aClass21_14 = new Class21(60);

	@OriginalMember(owner = "client!cda", name = "f", descriptor = "Lclient!mv;")
	public final Class229 aClass229_15;

	@OriginalMember(owner = "client!cda", name = "j", descriptor = "Lclient!mv;")
	private final Class229 aClass229_16;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;Lclient!mv;)V")
	public Class49(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2, @OriginalArg(3) Class229 arg3) {
		this.aClass229_15 = arg3;
		this.aClass229_16 = arg2;
		@Pc(26) int local26 = this.aClass229_16.method4952() - 1;
		this.aClass229_16.method4981(local26);
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
	public void method1019() {
		@Pc(2) Class21 local2 = this.aClass21_13;
		synchronized (this.aClass21_13) {
			this.aClass21_13.method314();
		}
		local2 = this.aClass21_14;
		synchronized (this.aClass21_14) {
			this.aClass21_14.method314();
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IB)V")
	public void method1020() {
		@Pc(2) Class21 local2 = this.aClass21_13;
		synchronized (this.aClass21_13) {
			this.aClass21_13.method323(5);
		}
		local2 = this.aClass21_14;
		synchronized (this.aClass21_14) {
			this.aClass21_14.method323(5);
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(BI)Lclient!dw;")
	public Class82 method1021(@OriginalArg(1) int arg0) {
		@Pc(6) Class21 local6 = this.aClass21_13;
		@Pc(25) Class82 local25;
		synchronized (this.aClass21_13) {
			local25 = (Class82) this.aClass21_13.method324((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(38) Class229 local38 = this.aClass229_16;
		@Pc(51) byte[] local51;
		synchronized (this.aClass229_16) {
			local51 = this.aClass229_16.method4980(Static266.method3709(arg0), Static366.method5155(arg0));
		}
		local25 = new Class82();
		local25.aClass49_2 = this;
		local25.anInt1831 = arg0;
		if (local51 != null) {
			local25.method1539(new Class2_Sub7(local51));
		}
		local6 = this.aClass21_13;
		synchronized (this.aClass21_13) {
			this.aClass21_13.method317(local25, (long) arg0);
			return local25;
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)V")
	public void method1022() {
		@Pc(2) Class21 local2 = this.aClass21_13;
		synchronized (this.aClass21_13) {
			this.aClass21_13.method313();
		}
		local2 = this.aClass21_14;
		synchronized (this.aClass21_14) {
			this.aClass21_14.method313();
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(II)V")
	public void method1023(@OriginalArg(1) int arg0) {
		this.anInt1075 = arg0;
		@Pc(15) Class21 local15 = this.aClass21_14;
		synchronized (this.aClass21_14) {
			this.aClass21_14.method313();
		}
	}
}

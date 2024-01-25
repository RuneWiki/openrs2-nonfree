import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class63 {

	@OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
	public int anInt2044;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "Lclient!fr;")
	private final Class91 aClass91_26 = new Class91(64);

	@OriginalMember(owner = "client!dt", name = "n", descriptor = "Lclient!fr;")
	public final Class91 aClass91_27 = new Class91(30);

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "Lclient!qs;")
	private final Class211 aClass211_25;

	@OriginalMember(owner = "client!dt", name = "l", descriptor = "Lclient!qs;")
	public final Class211 aClass211_26;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!wv;ILclient!qs;Lclient!qs;)V")
	public Class63(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2, @OriginalArg(3) Class211 arg3) {
		this.aClass211_25 = arg2;
		this.aClass211_26 = arg3;
		@Pc(26) int local26 = this.aClass211_25.method4751() - 1;
		this.aClass211_25.method4772(local26);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BI)Lclient!sa;")
	public Class223 method1524(@OriginalArg(1) int arg0) {
		@Pc(12) Class91 local12 = this.aClass91_26;
		@Pc(22) Class223 local22;
		synchronized (this.aClass91_26) {
			local22 = (Class223) this.aClass91_26.method1988((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class211 local35 = this.aClass211_25;
		@Pc(48) byte[] local48;
		synchronized (this.aClass211_25) {
			local48 = this.aClass211_25.method4758(Static48.method901(arg0), Static205.method3284(arg0));
		}
		local22 = new Class223();
		local22.anInt6634 = arg0;
		local22.aClass63_2 = this;
		if (local48 != null) {
			local22.method5068(new Class1_Sub3(local48));
		}
		@Pc(76) Class91 local76 = this.aClass91_26;
		synchronized (this.aClass91_26) {
			this.aClass91_26.method1990(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)V")
	public void method1525(@OriginalArg(0) int arg0) {
		this.anInt2044 = arg0;
		@Pc(13) Class91 local13 = this.aClass91_27;
		synchronized (this.aClass91_27) {
			this.aClass91_27.method1999();
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V")
	public void method1526() {
		@Pc(2) Class91 local2 = this.aClass91_26;
		synchronized (this.aClass91_26) {
			this.aClass91_26.method1999();
		}
		local2 = this.aClass91_27;
		synchronized (this.aClass91_27) {
			this.aClass91_27.method1999();
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IB)V")
	public void method1527() {
		@Pc(6) Class91 local6 = this.aClass91_26;
		synchronized (this.aClass91_26) {
			this.aClass91_26.method1998(5);
		}
		local6 = this.aClass91_27;
		synchronized (this.aClass91_27) {
			this.aClass91_27.method1998(5);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
	public void method1528() {
		@Pc(2) Class91 local2 = this.aClass91_26;
		synchronized (this.aClass91_26) {
			this.aClass91_26.method1993();
		}
		local2 = this.aClass91_27;
		synchronized (this.aClass91_27) {
			this.aClass91_27.method1993();
		}
	}
}

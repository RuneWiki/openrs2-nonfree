import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class42 {

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "Lclient!fr;")
	private final Class91 aClass91_11 = new Class91(16);

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Lclient!qs;")
	private final Class211 aClass211_14;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!wv;ILclient!qs;)V")
	public Class42(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_14 = arg2;
		this.aClass211_14.method4772(30);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)Lclient!fm;")
	public Class88 method896(@OriginalArg(1) int arg0) {
		@Pc(12) Class91 local12 = this.aClass91_11;
		@Pc(22) Class88 local22;
		synchronized (this.aClass91_11) {
			local22 = (Class88) this.aClass91_11.method1988((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class211 local35 = this.aClass211_14;
		@Pc(44) byte[] local44;
		synchronized (this.aClass211_14) {
			local44 = this.aClass211_14.method4758(arg0, 30);
		}
		local22 = new Class88();
		if (local44 != null) {
			local22.method1930(new Class1_Sub3(local44));
		}
		@Pc(66) Class91 local66 = this.aClass91_11;
		synchronized (this.aClass91_11) {
			this.aClass91_11.method1990(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
	public void method899() {
		@Pc(2) Class91 local2 = this.aClass91_11;
		synchronized (this.aClass91_11) {
			this.aClass91_11.method1999();
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
	public void method902() {
		@Pc(6) Class91 local6 = this.aClass91_11;
		synchronized (this.aClass91_11) {
			this.aClass91_11.method1993();
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)V")
	public void method903() {
		@Pc(8) Class91 local8 = this.aClass91_11;
		synchronized (this.aClass91_11) {
			this.aClass91_11.method1998(5);
		}
	}
}

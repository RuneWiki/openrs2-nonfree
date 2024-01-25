import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class251 {

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "Lclient!fr;")
	private final Class91 aClass91_95 = new Class91(64);

	@OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
	public int anInt7374 = 0;

	@OriginalMember(owner = "client!uo", name = "k", descriptor = "Lclient!qs;")
	private final Class211 aClass211_83;

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
	public final int anInt7367;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!wv;ILclient!qs;)V")
	public Class251(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_83 = arg2;
		this.anInt7367 = this.aClass211_83.method4772(4);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)V")
	public void method5607() {
		@Pc(2) Class91 local2 = this.aClass91_95;
		synchronized (this.aClass91_95) {
			this.aClass91_95.method1998(5);
		}
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(IB)Lclient!fv;")
	public Class92 method5608(@OriginalArg(0) int arg0) {
		@Pc(6) Class91 local6 = this.aClass91_95;
		@Pc(16) Class92 local16;
		synchronized (this.aClass91_95) {
			local16 = (Class92) this.aClass91_95.method1988((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_83;
		@Pc(40) byte[] local40;
		synchronized (this.aClass211_83) {
			local40 = this.aClass211_83.method4758(arg0, 4);
		}
		local16 = new Class92();
		local16.anInt2783 = arg0;
		local16.aClass251_3 = this;
		if (local40 != null) {
			local16.method2050(new Class1_Sub3(local40));
		}
		local16.method2049();
		@Pc(77) Class91 local77 = this.aClass91_95;
		synchronized (this.aClass91_95) {
			this.aClass91_95.method1990(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V")
	public void method5609() {
		@Pc(14) Class91 local14 = this.aClass91_95;
		synchronized (this.aClass91_95) {
			this.aClass91_95.method1999();
		}
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)V")
	public void method5611() {
		@Pc(2) Class91 local2 = this.aClass91_95;
		synchronized (this.aClass91_95) {
			this.aClass91_95.method1993();
		}
	}
}

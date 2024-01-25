import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class270 {

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "Lclient!fr;")
	private final Class91 aClass91_102 = new Class91(64);

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "Lclient!qs;")
	private final Class211 aClass211_93;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!wv;ILclient!qs;)V")
	public Class270(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_93 = arg2;
		this.aClass211_93.method4772(31);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BI)V")
	public void method6167() {
		@Pc(11) Class91 local11 = this.aClass91_102;
		synchronized (this.aClass91_102) {
			this.aClass91_102.method1998(5);
		}
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
	public void method6168() {
		@Pc(6) Class91 local6 = this.aClass91_102;
		synchronized (this.aClass91_102) {
			this.aClass91_102.method1999();
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)Lclient!qi;")
	public Class206 method6169(@OriginalArg(0) int arg0) {
		@Pc(6) Class91 local6 = this.aClass91_102;
		@Pc(16) Class206 local16;
		synchronized (this.aClass91_102) {
			local16 = (Class206) this.aClass91_102.method1988((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_93;
		@Pc(40) byte[] local40;
		synchronized (this.aClass211_93) {
			local40 = this.aClass211_93.method4758(arg0, 31);
		}
		local16 = new Class206();
		if (local40 != null) {
			local16.method4661(new Class1_Sub3(local40));
		}
		@Pc(62) Class91 local62 = this.aClass91_102;
		synchronized (this.aClass91_102) {
			this.aClass91_102.method1990(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)V")
	public void method6170() {
		@Pc(6) Class91 local6 = this.aClass91_102;
		synchronized (this.aClass91_102) {
			this.aClass91_102.method1993();
		}
	}
}

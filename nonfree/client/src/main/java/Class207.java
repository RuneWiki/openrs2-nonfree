import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public final class Class207 {

	@OriginalMember(owner = "client!maa", name = "e", descriptor = "Lclient!me;")
	private final Class211 aClass211_45 = new Class211(128);

	@OriginalMember(owner = "client!maa", name = "f", descriptor = "Lclient!pe;")
	private final Class254 aClass254_88;

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;)V")
	public Class207(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_88 = arg2;
		if (this.aClass254_88 != null) {
			@Pc(20) int local20 = this.aClass254_88.method6421() - 1;
			this.aClass254_88.method6396(local20);
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(BI)Lclient!nea;")
	public Class227 method5258(@OriginalArg(1) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_45;
		@Pc(16) Class227 local16;
		synchronized (this.aClass211_45) {
			local16 = (Class227) this.aClass211_45.method5534((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass254_88.method6401(Static179.method3184(arg0), Static436.method6868(arg0));
		local16 = new Class227();
		if (local37 != null) {
			local16.method5827(new Class3_Sub7(local37));
		}
		@Pc(59) Class211 local59 = this.aClass211_45;
		synchronized (this.aClass211_45) {
			this.aClass211_45.method5529((long) arg0, local16);
			return local16;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class211 {

	@OriginalMember(owner = "client!oca", name = "h", descriptor = "Lclient!qc;")
	private final Class231 aClass231_52 = new Class231(256);

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "Lclient!dda;")
	private final Class53 aClass53_98;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lclient!oda;ILclient!dda;)V")
	public Class211(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2) {
		this.aClass53_98 = arg2;
		this.aClass53_98.method1592(26);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(II)V")
	public void method5364() {
		@Pc(2) Class231 local2 = this.aClass231_52;
		synchronized (this.aClass231_52) {
			this.aClass231_52.method6231(5);
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IB)Lclient!jn;")
	public Class2_Sub13_Sub7 method5365(@OriginalArg(0) int arg0) {
		@Pc(11) Class231 local11 = this.aClass231_52;
		@Pc(21) Class2_Sub13_Sub7 local21;
		synchronized (this.aClass231_52) {
			local21 = (Class2_Sub13_Sub7) this.aClass231_52.method6228((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class53 local34 = this.aClass53_98;
		@Pc(43) byte[] local43;
		synchronized (this.aClass53_98) {
			local43 = this.aClass53_98.method1616(arg0, 26);
		}
		local21 = new Class2_Sub13_Sub7();
		if (local43 != null) {
			local21.method3623(new Class2_Sub29(local43));
		}
		@Pc(65) Class231 local65 = this.aClass231_52;
		synchronized (this.aClass231_52) {
			this.aClass231_52.method6232(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
	public void method5367() {
		@Pc(6) Class231 local6 = this.aClass231_52;
		synchronized (this.aClass231_52) {
			this.aClass231_52.method6240();
		}
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(I)V")
	public void method5369() {
		@Pc(2) Class231 local2 = this.aClass231_52;
		synchronized (this.aClass231_52) {
			this.aClass231_52.method6227();
		}
	}
}

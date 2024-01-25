import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class70 {

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!jr;")
	private final Class169 aClass169_14 = new Class169(64);

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!in;")
	private final Class157 aClass157_59;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;)V")
	public Class70(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2) {
		this.aClass157_59 = arg2;
		if (this.aClass157_59 != null) {
			this.aClass157_59.method4561(11);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Lclient!uaa;")
	public Class335 method2496(@OriginalArg(0) int arg0) {
		@Pc(6) Class169 local6 = this.aClass169_14;
		@Pc(16) Class335 local16;
		synchronized (this.aClass169_14) {
			local16 = (Class335) this.aClass169_14.method5002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class157 local34 = this.aClass157_59;
		@Pc(43) byte[] local43;
		synchronized (this.aClass157_59) {
			local43 = this.aClass157_59.method4564(11, arg0);
		}
		local16 = new Class335();
		if (local43 != null) {
			local16.method8408(new Class2_Sub11(local43));
		}
		@Pc(65) Class169 local65 = this.aClass169_14;
		synchronized (this.aClass169_14) {
			this.aClass169_14.method5001(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public void method2497() {
		@Pc(2) Class169 local2 = this.aClass169_14;
		synchronized (this.aClass169_14) {
			this.aClass169_14.method5009();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public void method2498() {
		@Pc(6) Class169 local6 = this.aClass169_14;
		synchronized (this.aClass169_14) {
			this.aClass169_14.method5006();
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)V")
	public void method2499() {
		@Pc(2) Class169 local2 = this.aClass169_14;
		synchronized (this.aClass169_14) {
			this.aClass169_14.method4997(5);
		}
	}
}

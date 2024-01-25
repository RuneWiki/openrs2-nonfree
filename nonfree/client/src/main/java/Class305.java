import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class305 {

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "Lclient!jr;")
	private final Class169 aClass169_53 = new Class169(64);

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "Lclient!in;")
	private final Class157 aClass157_246;

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
	public final int anInt9249;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;)V")
	public Class305(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2) {
		this.aClass157_246 = arg2;
		if (this.aClass157_246 == null) {
			this.anInt9249 = 0;
		} else {
			this.anInt9249 = this.aClass157_246.method4561(16);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)V")
	public void method7736() {
		@Pc(8) Class169 local8 = this.aClass169_53;
		synchronized (this.aClass169_53) {
			this.aClass169_53.method4997(5);
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)Lclient!ow;")
	public Class253 method7737(@OriginalArg(1) int arg0) {
		@Pc(6) Class169 local6 = this.aClass169_53;
		@Pc(16) Class253 local16;
		synchronized (this.aClass169_53) {
			local16 = (Class253) this.aClass169_53.method5002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class157 local29 = this.aClass157_246;
		@Pc(38) byte[] local38;
		synchronized (this.aClass157_246) {
			local38 = this.aClass157_246.method4564(16, arg0);
		}
		local16 = new Class253();
		if (local38 != null) {
			local16.method6655(new Class2_Sub11(local38));
		}
		@Pc(66) Class169 local66 = this.aClass169_53;
		synchronized (this.aClass169_53) {
			this.aClass169_53.method5001(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V")
	public void method7738() {
		@Pc(6) Class169 local6 = this.aClass169_53;
		synchronized (this.aClass169_53) {
			this.aClass169_53.method5009();
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
	public void method7739() {
		@Pc(11) Class169 local11 = this.aClass169_53;
		synchronized (this.aClass169_53) {
			this.aClass169_53.method5006();
		}
	}
}

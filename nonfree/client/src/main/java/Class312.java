import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sga")
public final class Class312 {

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "Lclient!jr;")
	private final Class169 aClass169_56 = new Class169(64);

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "Lclient!in;")
	private final Class157 aClass157_252;

	@OriginalMember(owner = "client!sga", name = "g", descriptor = "Lclient!in;")
	private final Class157 aClass157_253;

	@OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(ILclient!in;Lclient!in;)V")
	public Class312(@OriginalArg(0) int arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(2) Class157 arg2) {
		this.aClass157_252 = arg1;
		this.aClass157_253 = arg2;
		if (this.aClass157_252 != null) {
			this.aClass157_252.method4561(0);
		}
		if (this.aClass157_253 != null) {
			this.aClass157_253.method4561(0);
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(II)Lclient!ug;")
	public Class2_Sub6_Sub20 method7842(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub6_Sub20 local11 = (Class2_Sub6_Sub20) this.aClass169_56.method5002((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = this.aClass157_252.method4564(0, arg0);
		} else {
			local27 = this.aClass157_253.method4564(0, arg0 & 0x7FFF);
		}
		local11 = new Class2_Sub6_Sub20();
		if (local27 != null) {
			local11.method8502(new Class2_Sub11(local27));
		}
		if (arg0 >= 32768) {
			local11.method8505();
		}
		this.aClass169_56.method5001(local11, (long) arg0);
		return local11;
	}
}

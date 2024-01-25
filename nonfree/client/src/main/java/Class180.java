import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class180 {

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "Lclient!mo;")
	private final Class160 aClass160_38 = new Class160(64);

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "Lclient!nl;")
	private final Class171 aClass171_62;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lclient!lo;ILclient!nl;)V")
	public Class180(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_62 = arg2;
		this.aClass171_62.method3750(5);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BI)Lclient!pd;")
	public Class2_Sub10_Sub13 method3969(@OriginalArg(1) int arg0) {
		@Pc(6) Class160 local6 = this.aClass160_38;
		@Pc(16) Class2_Sub10_Sub13 local16;
		synchronized (this.aClass160_38) {
			local16 = (Class2_Sub10_Sub13) this.aClass160_38.method3599((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass171_62.method3745(5, arg0);
		local16 = new Class2_Sub10_Sub13();
		if (local33 != null) {
			local16.method4022(new Class2_Sub16(local33));
		}
		@Pc(57) Class160 local57 = this.aClass160_38;
		synchronized (this.aClass160_38) {
			this.aClass160_38.method3602((long) arg0, local16);
			return local16;
		}
	}
}

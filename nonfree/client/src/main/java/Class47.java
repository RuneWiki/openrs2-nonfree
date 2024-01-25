import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class47 {

	@OriginalMember(owner = "client!di", name = "i", descriptor = "Lclient!mo;")
	private final Class160 aClass160_10 = new Class160(128);

	@OriginalMember(owner = "client!di", name = "k", descriptor = "Lclient!nl;")
	private final Class171 aClass171_19;

	static {
		new Class32("Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.");
	}

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!lo;ILclient!nl;)V")
	public Class47(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_19 = arg2;
		this.aClass171_19.method3750(1);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
	public void method942() {
		@Pc(6) Class160 local6 = this.aClass160_10;
		synchronized (this.aClass160_10) {
			this.aClass160_10.method3595();
		}
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(B)V")
	public void method943() {
		@Pc(2) Class160 local2 = this.aClass160_10;
		synchronized (this.aClass160_10) {
			this.aClass160_10.method3605();
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V")
	public void method945() {
		@Pc(6) Class160 local6 = this.aClass160_10;
		synchronized (this.aClass160_10) {
			this.aClass160_10.method3606(5);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)Lclient!ei;")
	public Class58 method946(@OriginalArg(0) int arg0) {
		@Pc(11) Class160 local11 = this.aClass160_10;
		@Pc(21) Class58 local21;
		synchronized (this.aClass160_10) {
			local21 = (Class58) this.aClass160_10.method3599((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass171_19.method3745(1, arg0);
		local21 = new Class58();
		if (local38 != null) {
			local21.method1197(new Class2_Sub16(local38));
		}
		@Pc(54) Class160 local54 = this.aClass160_10;
		synchronized (this.aClass160_10) {
			this.aClass160_10.method3602((long) arg0, local21);
			return local21;
		}
	}
}

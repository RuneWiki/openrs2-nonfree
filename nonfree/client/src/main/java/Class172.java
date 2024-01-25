import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class172 {

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "Lclient!nj;")
	private final Class171 aClass171_45 = new Class171(64);

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "Lclient!mg;")
	private final Class160 aClass160_54;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!al;ILclient!mg;)V")
	public Class172(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_54 = arg2;
		this.aClass160_54.method3722(5);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)Lclient!rb;")
	public Class2_Sub5_Sub14 method3944(@OriginalArg(0) int arg0) {
		@Pc(6) Class171 local6 = this.aClass171_45;
		@Pc(16) Class2_Sub5_Sub14 local16;
		synchronized (this.aClass171_45) {
			local16 = (Class2_Sub5_Sub14) this.aClass171_45.method3941((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass160_54.method3696(arg0, 5);
		local16 = new Class2_Sub5_Sub14();
		if (local33 != null) {
			local16.method4684(new Class2_Sub23(local33));
		}
		@Pc(54) Class171 local54 = this.aClass171_45;
		synchronized (this.aClass171_45) {
			this.aClass171_45.method3940((long) arg0, local16);
			return local16;
		}
	}
}

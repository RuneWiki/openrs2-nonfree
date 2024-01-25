import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class139 {

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "Lclient!mo;")
	private final Class160 aClass160_30 = new Class160(64);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "Lclient!nl;")
	private final Class171 aClass171_45;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!lo;ILclient!nl;)V")
	public Class139(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_45 = arg2;
		this.aClass171_45.method3750(32);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)Lclient!ie;")
	public Class103 method3157(@OriginalArg(0) int arg0) {
		@Pc(6) Class160 local6 = this.aClass160_30;
		@Pc(16) Class103 local16;
		synchronized (this.aClass160_30) {
			local16 = (Class103) this.aClass160_30.method3599((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) byte[] local41 = this.aClass171_45.method3745(32, arg0);
		local16 = new Class103();
		if (local41 != null) {
			local16.method2669(new Class2_Sub16(local41));
		}
		@Pc(57) Class160 local57 = this.aClass160_30;
		synchronized (this.aClass160_30) {
			this.aClass160_30.method3602((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)V")
	public void method3158() {
		@Pc(2) Class160 local2 = this.aClass160_30;
		synchronized (this.aClass160_30) {
			this.aClass160_30.method3606(5);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
	public void method3160() {
		@Pc(6) Class160 local6 = this.aClass160_30;
		synchronized (this.aClass160_30) {
			this.aClass160_30.method3605();
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
	public void method3163() {
		@Pc(6) Class160 local6 = this.aClass160_30;
		synchronized (this.aClass160_30) {
			this.aClass160_30.method3595();
		}
	}
}

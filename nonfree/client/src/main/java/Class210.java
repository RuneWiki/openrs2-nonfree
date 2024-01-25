import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class210 {

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "Lclient!mo;")
	private final Class160 aClass160_46 = new Class160(64);

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "Lclient!mo;")
	public final Class160 aClass160_48 = new Class160(2);

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "Lclient!nl;")
	private final Class171 aClass171_78;

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "Lclient!nl;")
	public final Class171 aClass171_79;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!lo;ILclient!nl;Lclient!nl;)V")
	public Class210(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class171 arg3) {
		this.aClass171_78 = arg2;
		this.aClass171_79 = arg3;
		this.aClass171_78.method3750(33);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V")
	public void method4437() {
		@Pc(6) Class160 local6 = this.aClass160_46;
		synchronized (this.aClass160_46) {
			this.aClass160_46.method3606(5);
		}
		local6 = this.aClass160_48;
		synchronized (this.aClass160_48) {
			this.aClass160_48.method3606(5);
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
	public void method4438() {
		@Pc(7) Class160 local7 = this.aClass160_46;
		synchronized (this.aClass160_46) {
			this.aClass160_46.method3595();
		}
		local7 = this.aClass160_48;
		synchronized (this.aClass160_48) {
			this.aClass160_48.method3595();
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)Lclient!us;")
	public Class232 method4439(@OriginalArg(1) int arg0) {
		@Pc(6) Class160 local6 = this.aClass160_46;
		@Pc(16) Class232 local16;
		synchronized (this.aClass160_46) {
			local16 = (Class232) this.aClass160_46.method3599((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass171_78.method3745(33, arg0);
		local16 = new Class232();
		local16.aClass210_2 = this;
		if (local33 != null) {
			local16.method5191(new Class2_Sub16(local33));
		}
		@Pc(52) Class160 local52 = this.aClass160_46;
		synchronized (this.aClass160_46) {
			this.aClass160_46.method3602((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V")
	public void method4440() {
		@Pc(6) Class160 local6 = this.aClass160_46;
		synchronized (this.aClass160_46) {
			this.aClass160_46.method3605();
		}
		local6 = this.aClass160_48;
		synchronized (this.aClass160_48) {
			this.aClass160_48.method3605();
		}
	}
}

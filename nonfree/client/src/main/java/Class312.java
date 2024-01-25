import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sda")
public final class Class312 {

	@OriginalMember(owner = "client!sda", name = "g", descriptor = "Lclient!qr;")
	private final Class293 aClass293_58 = new Class293(64);

	@OriginalMember(owner = "client!sda", name = "d", descriptor = "Lclient!wu;")
	private final Class384 aClass384_114;

	@OriginalMember(owner = "client!sda", name = "h", descriptor = "I")
	public final int anInt8606;

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;)V")
	public Class312(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2) {
		this.aClass384_114 = arg2;
		this.anInt8606 = this.aClass384_114.method8862(19);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IB)Lclient!eba;")
	public Class85 method7415(@OriginalArg(0) int arg0) {
		@Pc(6) Class293 local6 = this.aClass293_58;
		@Pc(16) Class85 local16;
		synchronized (this.aClass293_58) {
			local16 = (Class85) this.aClass293_58.method6921((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class384 local29 = this.aClass384_114;
		@Pc(38) byte[] local38;
		synchronized (this.aClass384_114) {
			local38 = this.aClass384_114.method8885(19, arg0);
		}
		local16 = new Class85();
		if (local38 != null) {
			local16.method1657(new Class5_Sub12(local38));
		}
		@Pc(65) Class293 local65 = this.aClass293_58;
		synchronized (this.aClass293_58) {
			this.aClass293_58.method6925((long) arg0, local16);
			return local16;
		}
	}
}

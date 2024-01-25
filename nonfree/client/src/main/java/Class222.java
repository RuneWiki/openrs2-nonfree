import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class222 {

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "Lclient!rp;")
	private final Class220 aClass220_48 = new Class220(64);

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "Lclient!lt;")
	private final Class158 aClass158_74;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!cm;ILclient!lt;)V")
	public Class222(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2) {
		this.aClass158_74 = arg2;
		this.aClass158_74.method3683(32);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)Lclient!qk;")
	public Class208 method5008(@OriginalArg(0) int arg0) {
		@Pc(11) Class220 local11 = this.aClass220_48;
		@Pc(21) Class208 local21;
		synchronized (this.aClass220_48) {
			local21 = (Class208) this.aClass220_48.method4990((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass158_74.method3672(arg0, 32);
		local21 = new Class208();
		if (local38 != null) {
			local21.method4713(new Class6_Sub15(local38));
		}
		@Pc(54) Class220 local54 = this.aClass220_48;
		synchronized (this.aClass220_48) {
			this.aClass220_48.method4996(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZI)V")
	public void method5010() {
		@Pc(2) Class220 local2 = this.aClass220_48;
		synchronized (this.aClass220_48) {
			this.aClass220_48.method4998(5);
		}
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
	public void method5011() {
		@Pc(12) Class220 local12 = this.aClass220_48;
		synchronized (this.aClass220_48) {
			this.aClass220_48.method4999();
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)V")
	public void method5012() {
		@Pc(2) Class220 local2 = this.aClass220_48;
		synchronized (this.aClass220_48) {
			this.aClass220_48.method4987();
		}
	}
}

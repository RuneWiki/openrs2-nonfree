import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class43 {

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "Lclient!rp;")
	private final Class220 aClass220_3 = new Class220(64);

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "Lclient!lt;")
	private final Class158 aClass158_14;

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
	public final int anInt1049;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!cm;ILclient!lt;)V")
	public Class43(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2) {
		this.aClass158_14 = arg2;
		if (this.aClass158_14 == null) {
			this.anInt1049 = 0;
		} else {
			this.anInt1049 = this.aClass158_14.method3683(16);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
	public void method971() {
		@Pc(11) Class220 local11 = this.aClass220_3;
		synchronized (this.aClass220_3) {
			this.aClass220_3.method4999();
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)V")
	public void method972() {
		@Pc(6) Class220 local6 = this.aClass220_3;
		synchronized (this.aClass220_3) {
			this.aClass220_3.method4998(5);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)Lclient!md;")
	public Class163 method973(@OriginalArg(0) int arg0) {
		@Pc(6) Class220 local6 = this.aClass220_3;
		@Pc(16) Class163 local16;
		synchronized (this.aClass220_3) {
			local16 = (Class163) this.aClass220_3.method4990((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass158_14.method3672(arg0, 16);
		local16 = new Class163();
		if (local38 != null) {
			local16.method3727(new Class6_Sub15(local38));
		}
		@Pc(54) Class220 local54 = this.aClass220_3;
		synchronized (this.aClass220_3) {
			this.aClass220_3.method4996(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(Z)V")
	public void method976() {
		@Pc(10) Class220 local10 = this.aClass220_3;
		synchronized (this.aClass220_3) {
			this.aClass220_3.method4987();
		}
	}
}

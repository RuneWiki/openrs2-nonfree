import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class76 {

	@OriginalMember(owner = "client!dp", name = "j", descriptor = "Lclient!oo;")
	private final Class264 aClass264_15 = new Class264(64);

	@OriginalMember(owner = "client!dp", name = "i", descriptor = "Lclient!wia;")
	private final Class386 aClass386_25;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
	public final int anInt2260;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;)V")
	public Class76(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2) {
		this.aClass386_25 = arg2;
		if (this.aClass386_25 == null) {
			this.anInt2260 = 0;
		} else {
			this.anInt2260 = this.aClass386_25.method9210(16);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V")
	public void method1916() {
		@Pc(6) Class264 local6 = this.aClass264_15;
		synchronized (this.aClass264_15) {
			this.aClass264_15.method6368();
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BI)Lclient!vfa;")
	public Class365 method1917(@OriginalArg(1) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_15;
		@Pc(16) Class365 local16;
		synchronized (this.aClass264_15) {
			local16 = (Class365) this.aClass264_15.method6367((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class386 local29 = this.aClass386_25;
		@Pc(38) byte[] local38;
		synchronized (this.aClass386_25) {
			local38 = this.aClass386_25.method9196(arg0, 16);
		}
		local16 = new Class365();
		if (local38 != null) {
			local16.method8815(new Class14_Sub29(local38));
		}
		@Pc(68) Class264 local68 = this.aClass264_15;
		synchronized (this.aClass264_15) {
			this.aClass264_15.method6364((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V")
	public void method1919() {
		@Pc(2) Class264 local2 = this.aClass264_15;
		synchronized (this.aClass264_15) {
			this.aClass264_15.method6366(5);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
	public void method1921() {
		@Pc(2) Class264 local2 = this.aClass264_15;
		synchronized (this.aClass264_15) {
			this.aClass264_15.method6360();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ufa")
public final class Class350 {

	@OriginalMember(owner = "client!ufa", name = "d", descriptor = "Lclient!oo;")
	private final Class264 aClass264_60 = new Class264(64);

	@OriginalMember(owner = "client!ufa", name = "h", descriptor = "I")
	public int anInt10170 = 0;

	@OriginalMember(owner = "client!ufa", name = "f", descriptor = "Lclient!wia;")
	private final Class386 aClass386_125;

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
	public final int anInt10167;

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;)V")
	public Class350(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2) {
		this.aClass386_125 = arg2;
		this.anInt10167 = this.aClass386_125.method9210(4);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ZI)V")
	public void method8460() {
		@Pc(6) Class264 local6 = this.aClass264_60;
		synchronized (this.aClass264_60) {
			this.aClass264_60.method6366(5);
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)V")
	public void method8461() {
		@Pc(2) Class264 local2 = this.aClass264_60;
		synchronized (this.aClass264_60) {
			this.aClass264_60.method6360();
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(II)Lclient!jp;")
	public Class188 method8462(@OriginalArg(1) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_60;
		@Pc(16) Class188 local16;
		synchronized (this.aClass264_60) {
			local16 = (Class188) this.aClass264_60.method6367((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class386 local29 = this.aClass386_125;
		@Pc(38) byte[] local38;
		synchronized (this.aClass386_125) {
			local38 = this.aClass386_125.method9196(arg0, 4);
		}
		local16 = new Class188();
		local16.aClass350_3 = this;
		local16.anInt4904 = arg0;
		if (local38 != null) {
			local16.method4091(new Class14_Sub29(local38));
		}
		local16.method4092();
		@Pc(69) Class264 local69 = this.aClass264_60;
		synchronized (this.aClass264_60) {
			this.aClass264_60.method6364((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V")
	public void method8463() {
		@Pc(6) Class264 local6 = this.aClass264_60;
		synchronized (this.aClass264_60) {
			this.aClass264_60.method6368();
		}
	}
}

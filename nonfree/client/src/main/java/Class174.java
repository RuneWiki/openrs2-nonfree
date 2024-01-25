import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class174 {

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "Lclient!er;")
	private final Class69 aClass69_47 = new Class69(256);

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "Lclient!ns;")
	private final Class166 aClass166_203;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!go;ILclient!ns;)V")
	public Class174(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2) {
		this.aClass166_203 = arg2;
		this.aClass166_203.method3691(26);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
	public void method3997() {
		@Pc(6) Class69 local6 = this.aClass69_47;
		synchronized (this.aClass69_47) {
			this.aClass69_47.method1593();
		}
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
	public void method3999() {
		@Pc(10) Class69 local10 = this.aClass69_47;
		synchronized (this.aClass69_47) {
			this.aClass69_47.method1600();
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZ)Lclient!sq;")
	public Class4_Sub1_Sub17 method4001(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_47;
		@Pc(16) Class4_Sub1_Sub17 local16;
		synchronized (this.aClass69_47) {
			local16 = (Class4_Sub1_Sub17) this.aClass69_47.method1591((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass166_203.method3696(arg0, 26);
		local16 = new Class4_Sub1_Sub17();
		if (local33 != null) {
			local16.method5074(new Class4_Sub30(local33));
		}
		@Pc(49) Class69 local49 = this.aClass69_47;
		synchronized (this.aClass69_47) {
			this.aClass69_47.method1590((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)V")
	public void method4002() {
		@Pc(7) Class69 local7 = this.aClass69_47;
		synchronized (this.aClass69_47) {
			this.aClass69_47.method1594(5);
		}
	}
}

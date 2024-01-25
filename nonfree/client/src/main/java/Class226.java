import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class226 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "Lclient!er;")
	private final Class69 aClass69_67 = new Class69(64);

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "Lclient!ns;")
	private final Class166 aClass166_258;

	static {
		new Class242("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!go;ILclient!ns;)V")
	public Class226(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2) {
		this.aClass166_258 = arg2;
		this.aClass166_258.method3691(32);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
	public void method5107() {
		@Pc(8) Class69 local8 = this.aClass69_67;
		synchronized (this.aClass69_67) {
			this.aClass69_67.method1594(5);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
	public void method5108() {
		@Pc(8) Class69 local8 = this.aClass69_67;
		synchronized (this.aClass69_67) {
			this.aClass69_67.method1593();
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)Lclient!jr;")
	public Class132 method5109(@OriginalArg(1) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_67;
		@Pc(16) Class132 local16;
		synchronized (this.aClass69_67) {
			local16 = (Class132) this.aClass69_67.method1591((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass166_258.method3696(arg0, 32);
		local16 = new Class132();
		if (local38 != null) {
			local16.method2833(new Class4_Sub30(local38));
		}
		@Pc(54) Class69 local54 = this.aClass69_67;
		synchronized (this.aClass69_67) {
			this.aClass69_67.method1590((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
	public void method5110() {
		@Pc(6) Class69 local6 = this.aClass69_67;
		synchronized (this.aClass69_67) {
			this.aClass69_67.method1600();
		}
	}
}

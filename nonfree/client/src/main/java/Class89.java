import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class89 {

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
	public int anInt2591;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "Lclient!er;")
	private final Class69 aClass69_32 = new Class69(64);

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "Lclient!er;")
	public final Class69 aClass69_33 = new Class69(30);

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "Lclient!ns;")
	private final Class166 aClass166_97;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "Lclient!ns;")
	public final Class166 aClass166_98;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!go;ILclient!ns;Lclient!ns;)V")
	public Class89(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2, @OriginalArg(3) Class166 arg3) {
		this.aClass166_97 = arg2;
		this.aClass166_98 = arg3;
		@Pc(26) int local26 = this.aClass166_97.method3695() - 1;
		this.aClass166_97.method3691(local26);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
	public void method1915() {
		@Pc(2) Class69 local2 = this.aClass69_32;
		synchronized (this.aClass69_32) {
			this.aClass69_32.method1593();
		}
		local2 = this.aClass69_33;
		synchronized (this.aClass69_33) {
			this.aClass69_33.method1593();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
	public void method1916(@OriginalArg(0) int arg0) {
		this.anInt2591 = arg0;
		@Pc(13) Class69 local13 = this.aClass69_33;
		synchronized (this.aClass69_33) {
			this.aClass69_33.method1593();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public void method1917() {
		@Pc(2) Class69 local2 = this.aClass69_32;
		synchronized (this.aClass69_32) {
			this.aClass69_32.method1600();
		}
		local2 = this.aClass69_33;
		synchronized (this.aClass69_33) {
			this.aClass69_33.method1600();
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)Lclient!nh;")
	public Class161 method1918(@OriginalArg(0) int arg0) {
		@Pc(10) Class69 local10 = this.aClass69_32;
		@Pc(20) Class161 local20;
		synchronized (this.aClass69_32) {
			local20 = (Class161) this.aClass69_32.method1591((long) arg0);
		}
		if (local20 != null) {
			return local20;
		}
		@Pc(41) byte[] local41 = this.aClass166_97.method3696(Static403.method5327(arg0), Static86.method4901(arg0));
		local20 = new Class161();
		local20.anInt4698 = arg0;
		local20.aClass89_2 = this;
		if (local41 != null) {
			local20.method3588(new Class4_Sub30(local41));
		}
		@Pc(63) Class69 local63 = this.aClass69_32;
		synchronized (this.aClass69_32) {
			this.aClass69_32.method1590((long) arg0, local20);
			return local20;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)V")
	public void method1919() {
		@Pc(2) Class69 local2 = this.aClass69_32;
		synchronized (this.aClass69_32) {
			this.aClass69_32.method1594(5);
		}
		local2 = this.aClass69_33;
		synchronized (this.aClass69_33) {
			this.aClass69_33.method1594(5);
		}
	}
}

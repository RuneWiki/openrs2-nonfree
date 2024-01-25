import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class23 {

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "Lclient!er;")
	private final Class69 aClass69_8 = new Class69(128);

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "Lclient!ns;")
	private final Class166 aClass166_38;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!go;ILclient!ns;)V")
	public Class23(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2) {
		this.aClass166_38 = arg2;
		this.aClass166_38.method3691(1);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)V")
	public void method632() {
		@Pc(14) Class69 local14 = this.aClass69_8;
		synchronized (this.aClass69_8) {
			this.aClass69_8.method1594(5);
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)Lclient!ao;")
	public Class13 method633(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_8;
		@Pc(16) Class13 local16;
		synchronized (this.aClass69_8) {
			local16 = (Class13) this.aClass69_8.method1591((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass166_38.method3696(arg0, 1);
		local16 = new Class13();
		if (local33 != null) {
			local16.method339(new Class4_Sub30(local33));
		}
		@Pc(57) Class69 local57 = this.aClass69_8;
		synchronized (this.aClass69_8) {
			this.aClass69_8.method1590((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
	public void method635() {
		@Pc(6) Class69 local6 = this.aClass69_8;
		synchronized (this.aClass69_8) {
			this.aClass69_8.method1600();
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)V")
	public void method637() {
		@Pc(6) Class69 local6 = this.aClass69_8;
		synchronized (this.aClass69_8) {
			this.aClass69_8.method1593();
		}
	}
}

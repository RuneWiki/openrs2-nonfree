import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vga")
public final class Class364 {

	@OriginalMember(owner = "client!vga", name = "k", descriptor = "Lclient!de;")
	private final Class69 aClass69_68 = new Class69(64);

	@OriginalMember(owner = "client!vga", name = "f", descriptor = "Lclient!nd;")
	private final Class238 aClass238_283;

	@OriginalMember(owner = "client!vga", name = "d", descriptor = "I")
	public final int anInt10060;

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;)V")
	public Class364(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2) {
		this.aClass238_283 = arg2;
		if (this.aClass238_283 == null) {
			this.anInt10060 = 0;
		} else {
			this.anInt10060 = this.aClass238_283.method5592(16);
		}
	}

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "(B)V")
	public void method8541() {
		@Pc(6) Class69 local6 = this.aClass69_68;
		synchronized (this.aClass69_68) {
			this.aClass69_68.method1904();
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(II)V")
	public void method8542() {
		@Pc(6) Class69 local6 = this.aClass69_68;
		synchronized (this.aClass69_68) {
			this.aClass69_68.method1910(5);
		}
	}

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "(II)Lclient!jp;")
	public Class186 method8544(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_68;
		@Pc(16) Class186 local16;
		synchronized (this.aClass69_68) {
			local16 = (Class186) this.aClass69_68.method1919((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class238 local29 = this.aClass238_283;
		@Pc(40) byte[] local40;
		synchronized (this.aClass238_283) {
			local40 = this.aClass238_283.method5567(arg0, 16);
		}
		local16 = new Class186();
		if (local40 != null) {
			local16.method4471(new Class2_Sub17(local40));
		}
		@Pc(62) Class69 local62 = this.aClass69_68;
		synchronized (this.aClass69_68) {
			this.aClass69_68.method1917((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(Z)V")
	public void method8545() {
		@Pc(6) Class69 local6 = this.aClass69_68;
		synchronized (this.aClass69_68) {
			this.aClass69_68.method1905();
		}
	}
}

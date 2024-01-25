import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hga")
public final class Class146 {

	@OriginalMember(owner = "client!hga", name = "e", descriptor = "Lclient!de;")
	private final Class69 aClass69_22 = new Class69(64);

	@OriginalMember(owner = "client!hga", name = "j", descriptor = "Lclient!nd;")
	private final Class238 aClass238_99;

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;)V")
	public Class146(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2) {
		this.aClass238_99 = arg2;
		this.aClass238_99.method5592(32);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(B)V")
	public void method3509() {
		@Pc(2) Class69 local2 = this.aClass69_22;
		synchronized (this.aClass69_22) {
			this.aClass69_22.method1905();
		}
	}

	@OriginalMember(owner = "client!hga", name = "c", descriptor = "(I)V")
	public void method3511() {
		@Pc(13) Class69 local13 = this.aClass69_22;
		synchronized (this.aClass69_22) {
			this.aClass69_22.method1904();
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(II)Lclient!ql;")
	public Class291 method3512(@OriginalArg(1) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_22;
		@Pc(16) Class291 local16;
		synchronized (this.aClass69_22) {
			local16 = (Class291) this.aClass69_22.method1919((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class238 local29 = this.aClass238_99;
		@Pc(38) byte[] local38;
		synchronized (this.aClass238_99) {
			local38 = this.aClass238_99.method5567(arg0, 32);
		}
		local16 = new Class291();
		if (local38 != null) {
			local16.method6684(new Class2_Sub17(local38));
		}
		@Pc(60) Class69 local60 = this.aClass69_22;
		synchronized (this.aClass69_22) {
			this.aClass69_22.method1917((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(BI)V")
	public void method3514() {
		@Pc(6) Class69 local6 = this.aClass69_22;
		synchronized (this.aClass69_22) {
			this.aClass69_22.method1910(5);
		}
	}
}

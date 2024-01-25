import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class216 {

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "Lclient!de;")
	private final Class69 aClass69_33 = new Class69(64);

	@OriginalMember(owner = "client!ls", name = "n", descriptor = "I")
	public int anInt5873 = 0;

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "Lclient!nd;")
	private final Class238 aClass238_156;

	@OriginalMember(owner = "client!ls", name = "j", descriptor = "I")
	public final int anInt5869;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;)V")
	public Class216(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2) {
		this.aClass238_156 = arg2;
		this.anInt5869 = this.aClass238_156.method5592(4);
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V")
	public void method5088() {
		@Pc(12) Class69 local12 = this.aClass69_33;
		synchronized (this.aClass69_33) {
			this.aClass69_33.method1905();
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)Lclient!pia;")
	public Class273 method5090(@OriginalArg(1) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_33;
		@Pc(16) Class273 local16;
		synchronized (this.aClass69_33) {
			local16 = (Class273) this.aClass69_33.method1919((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class238 local29 = this.aClass238_156;
		@Pc(38) byte[] local38;
		synchronized (this.aClass238_156) {
			local38 = this.aClass238_156.method5567(arg0, 4);
		}
		local16 = new Class273();
		local16.aClass216_3 = this;
		local16.anInt7211 = arg0;
		if (local38 != null) {
			local16.method6311(new Class2_Sub17(local38));
		}
		local16.method6312();
		@Pc(69) Class69 local69 = this.aClass69_33;
		synchronized (this.aClass69_33) {
			this.aClass69_33.method1917((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "(I)V")
	public void method5091() {
		@Pc(10) Class69 local10 = this.aClass69_33;
		synchronized (this.aClass69_33) {
			this.aClass69_33.method1904();
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(II)V")
	public void method5094() {
		@Pc(2) Class69 local2 = this.aClass69_33;
		synchronized (this.aClass69_33) {
			this.aClass69_33.method1910(5);
		}
	}
}

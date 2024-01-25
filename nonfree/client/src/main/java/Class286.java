import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class286 {

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "Lclient!qc;")
	private final Class231 aClass231_67 = new Class231(64);

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
	public int anInt8619 = 0;

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "Lclient!dda;")
	private final Class53 aClass53_138;

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
	public final int anInt8617;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!oda;ILclient!dda;)V")
	public Class286(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2) {
		this.aClass53_138 = arg2;
		this.anInt8617 = this.aClass53_138.method1592(4);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
	public void method7230() {
		@Pc(6) Class231 local6 = this.aClass231_67;
		synchronized (this.aClass231_67) {
			this.aClass231_67.method6240();
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
	public void method7232() {
		@Pc(6) Class231 local6 = this.aClass231_67;
		synchronized (this.aClass231_67) {
			this.aClass231_67.method6227();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V")
	public void method7233() {
		@Pc(2) Class231 local2 = this.aClass231_67;
		synchronized (this.aClass231_67) {
			this.aClass231_67.method6231(5);
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)Lclient!ch;")
	public Class37 method7234(@OriginalArg(1) int arg0) {
		@Pc(6) Class231 local6 = this.aClass231_67;
		@Pc(16) Class37 local16;
		synchronized (this.aClass231_67) {
			local16 = (Class37) this.aClass231_67.method6228((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class53 local29 = this.aClass53_138;
		@Pc(38) byte[] local38;
		synchronized (this.aClass53_138) {
			local38 = this.aClass53_138.method1616(arg0, 4);
		}
		local16 = new Class37();
		local16.aClass286_3 = this;
		local16.anInt1218 = arg0;
		if (local38 != null) {
			local16.method1152(new Class2_Sub29(local38));
		}
		local16.method1156();
		@Pc(71) Class231 local71 = this.aClass231_67;
		synchronized (this.aClass231_67) {
			this.aClass231_67.method6232(local16, (long) arg0);
			return local16;
		}
	}
}

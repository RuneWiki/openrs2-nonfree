import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class100 {

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "Lclient!dka;")
	private final Class85 aClass85_19 = new Class85(128);

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "Lclient!nca;")
	private final Class254 aClass254_58;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;)V")
	public Class100(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_58 = arg2;
		this.aClass254_58.method6101(1);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
	public void method2137() {
		@Pc(2) Class85 local2 = this.aClass85_19;
		synchronized (this.aClass85_19) {
			this.aClass85_19.method1741();
		}
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
	public void method2139() {
		@Pc(6) Class85 local6 = this.aClass85_19;
		synchronized (this.aClass85_19) {
			this.aClass85_19.method1748();
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZ)V")
	public void method2140() {
		@Pc(6) Class85 local6 = this.aClass85_19;
		synchronized (this.aClass85_19) {
			this.aClass85_19.method1742(5);
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)Lclient!pfa;")
	public Class287 method2141(@OriginalArg(0) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_19;
		@Pc(16) Class287 local16;
		synchronized (this.aClass85_19) {
			local16 = (Class287) this.aClass85_19.method1737((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class254 local30 = this.aClass254_58;
		@Pc(39) byte[] local39;
		synchronized (this.aClass254_58) {
			local39 = this.aClass254_58.method6087(arg0, 1);
		}
		local16 = new Class287();
		if (local39 != null) {
			local16.method6908(new Class2_Sub20(local39));
		}
		@Pc(63) Class85 local63 = this.aClass85_19;
		synchronized (this.aClass85_19) {
			this.aClass85_19.method1745((long) arg0, 16383, local16);
			return local16;
		}
	}
}

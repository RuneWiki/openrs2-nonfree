import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class223 {

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "Lclient!fa;")
	private final Class68 aClass68_45 = new Class68(64);

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "Lclient!fs;")
	private final Class76 aClass76_86;

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "I")
	public final int anInt6400;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lclient!jk;ILclient!fs;)V")
	public Class223(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2) {
		this.aClass76_86 = arg2;
		if (this.aClass76_86 == null) {
			this.anInt6400 = 0;
		} else {
			this.anInt6400 = this.aClass76_86.method2108(16);
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
	public void method5002() {
		@Pc(6) Class68 local6 = this.aClass68_45;
		synchronized (this.aClass68_45) {
			this.aClass68_45.method1777();
		}
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V")
	public void method5003() {
		@Pc(6) Class68 local6 = this.aClass68_45;
		synchronized (this.aClass68_45) {
			this.aClass68_45.method1791();
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)Lclient!iq;")
	public Class111 method5004(@OriginalArg(0) int arg0) {
		@Pc(6) Class68 local6 = this.aClass68_45;
		@Pc(16) Class111 local16;
		synchronized (this.aClass68_45) {
			local16 = (Class111) this.aClass68_45.method1787((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass76_86.method2104(arg0, 16);
		local16 = new Class111();
		if (local33 != null) {
			local16.method2810(new Class4_Sub12(local33));
		}
		@Pc(49) Class68 local49 = this.aClass68_45;
		synchronized (this.aClass68_45) {
			this.aClass68_45.method1779((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(II)V")
	public void method5005() {
		@Pc(2) Class68 local2 = this.aClass68_45;
		synchronized (this.aClass68_45) {
			this.aClass68_45.method1788(5);
		}
	}
}

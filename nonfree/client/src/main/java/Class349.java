import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public final class Class349 {

	@OriginalMember(owner = "client!vfa", name = "j", descriptor = "Lclient!aj;")
	private final Class10 aClass10_65 = new Class10(16);

	@OriginalMember(owner = "client!vfa", name = "k", descriptor = "Lclient!om;")
	private final Class246 aClass246_257;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;)V")
	public Class349(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_257 = arg2;
		this.aClass246_257.method5673(30);
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V")
	public void method7439() {
		@Pc(10) Class10 local10 = this.aClass10_65;
		synchronized (this.aClass10_65) {
			this.aClass10_65.method263();
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)V")
	public void method7440() {
		@Pc(6) Class10 local6 = this.aClass10_65;
		synchronized (this.aClass10_65) {
			this.aClass10_65.method258(5);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(II)Lclient!eu;")
	public Class86 method7443(@OriginalArg(1) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_65;
		@Pc(16) Class86 local16;
		synchronized (this.aClass10_65) {
			local16 = (Class86) this.aClass10_65.method250((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_257;
		@Pc(38) byte[] local38;
		synchronized (this.aClass246_257) {
			local38 = this.aClass246_257.method5653(30, arg0);
		}
		local16 = new Class86();
		if (local38 != null) {
			local16.method2552(new Class3_Sub11(local38));
		}
		@Pc(60) Class10 local60 = this.aClass10_65;
		synchronized (this.aClass10_65) {
			this.aClass10_65.method254(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)V")
	public void method7444() {
		@Pc(6) Class10 local6 = this.aClass10_65;
		synchronized (this.aClass10_65) {
			this.aClass10_65.method262();
		}
	}
}

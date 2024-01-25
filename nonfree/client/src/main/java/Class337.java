import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class337 {

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "Lclient!qr;")
	private final Class293 aClass293_62 = new Class293(64);

	@OriginalMember(owner = "client!uaa", name = "f", descriptor = "Lclient!wu;")
	private final Class384 aClass384_125;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;)V")
	public Class337(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2) {
		this.aClass384_125 = arg2;
		this.aClass384_125.method8862(31);
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IB)V")
	public void method7921() {
		@Pc(14) Class293 local14 = this.aClass293_62;
		synchronized (this.aClass293_62) {
			this.aClass293_62.method6922(5);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)Lclient!en;")
	public Class98 method7922(@OriginalArg(1) int arg0) {
		@Pc(11) Class293 local11 = this.aClass293_62;
		@Pc(21) Class98 local21;
		synchronized (this.aClass293_62) {
			local21 = (Class98) this.aClass293_62.method6921((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class384 local34 = this.aClass384_125;
		@Pc(43) byte[] local43;
		synchronized (this.aClass384_125) {
			local43 = this.aClass384_125.method8885(31, arg0);
		}
		local21 = new Class98();
		if (local43 != null) {
			local21.method1984(new Class5_Sub12(local43));
		}
		@Pc(65) Class293 local65 = this.aClass293_62;
		synchronized (this.aClass293_62) {
			this.aClass293_62.method6925((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)V")
	public void method7923() {
		@Pc(2) Class293 local2 = this.aClass293_62;
		synchronized (this.aClass293_62) {
			this.aClass293_62.method6930();
		}
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)V")
	public void method7925() {
		@Pc(10) Class293 local10 = this.aClass293_62;
		synchronized (this.aClass293_62) {
			this.aClass293_62.method6927();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class49 {

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Lclient!jr;")
	private final Class169 aClass169_8 = new Class169(64);

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
	public int anInt2009 = 0;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "Lclient!in;")
	private final Class157 aClass157_38;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
	public final int anInt1998;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;)V")
	public Class49(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2) {
		this.aClass157_38 = arg2;
		this.anInt1998 = this.aClass157_38.method4561(4);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
	public void method1917() {
		@Pc(2) Class169 local2 = this.aClass169_8;
		synchronized (this.aClass169_8) {
			this.aClass169_8.method4997(5);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
	public void method1918() {
		@Pc(6) Class169 local6 = this.aClass169_8;
		synchronized (this.aClass169_8) {
			this.aClass169_8.method5006();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZ)Lclient!vd;")
	public Class354 method1919(@OriginalArg(0) int arg0) {
		@Pc(11) Class169 local11 = this.aClass169_8;
		@Pc(21) Class354 local21;
		synchronized (this.aClass169_8) {
			local21 = (Class354) this.aClass169_8.method5002((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class157 local34 = this.aClass157_38;
		@Pc(43) byte[] local43;
		synchronized (this.aClass157_38) {
			local43 = this.aClass157_38.method4564(4, arg0);
		}
		local21 = new Class354();
		local21.anInt10466 = arg0;
		local21.aClass49_6 = this;
		if (local43 != null) {
			local21.method8735(new Class2_Sub11(local43));
		}
		local21.method8732();
		@Pc(74) Class169 local74 = this.aClass169_8;
		synchronized (this.aClass169_8) {
			this.aClass169_8.method5001(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public void method1922() {
		@Pc(2) Class169 local2 = this.aClass169_8;
		synchronized (this.aClass169_8) {
			this.aClass169_8.method5009();
		}
	}
}

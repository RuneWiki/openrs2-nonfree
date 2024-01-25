import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class121 {

	@OriginalMember(owner = "client!gba", name = "f", descriptor = "Lclient!qr;")
	private final Class293 aClass293_16 = new Class293(16);

	@OriginalMember(owner = "client!gba", name = "g", descriptor = "Lclient!wu;")
	private final Class384 aClass384_44;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;)V")
	public Class121(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2) {
		this.aClass384_44 = arg2;
		this.aClass384_44.method8862(29);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IZ)V")
	public void method2661() {
		@Pc(12) Class293 local12 = this.aClass293_16;
		synchronized (this.aClass293_16) {
			this.aClass293_16.method6922(5);
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)V")
	public void method2664() {
		@Pc(6) Class293 local6 = this.aClass293_16;
		synchronized (this.aClass293_16) {
			this.aClass293_16.method6927();
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)Lclient!dd;")
	private Class69 method2665(@OriginalArg(1) int arg0) {
		@Pc(6) Class293 local6 = this.aClass293_16;
		@Pc(16) Class69 local16;
		synchronized (this.aClass293_16) {
			local16 = (Class69) this.aClass293_16.method6921((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class384 local29 = this.aClass384_44;
		@Pc(38) byte[] local38;
		synchronized (this.aClass384_44) {
			local38 = this.aClass384_44.method8885(29, arg0);
		}
		local16 = new Class69();
		if (local38 != null) {
			local16.method1395(new Class5_Sub12(local38));
		}
		@Pc(68) Class293 local68 = this.aClass293_16;
		synchronized (this.aClass293_16) {
			this.aClass293_16.method6925((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(Z)V")
	public void method2666() {
		@Pc(6) Class293 local6 = this.aClass293_16;
		synchronized (this.aClass293_16) {
			this.aClass293_16.method6930();
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIIIILclient!ap;)Lclient!lt;")
	public Class218 method2668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class20 arg4) {
		@Pc(7) Class123[] local7 = null;
		@Pc(12) Class69 local12 = this.method2665(arg1);
		if (local12.anIntArray114 != null) {
			local7 = new Class123[local12.anIntArray114.length];
			for (@Pc(27) int local27 = 0; local27 < local7.length; local27++) {
				@Pc(37) Class202 local37 = arg4.method490(local12.anIntArray114[local27]);
				local7[local27] = new Class123(local37.anInt5508, local37.anInt5500, local37.anInt5498, local37.anInt5506, local37.anInt5501, local37.anInt5504, local37.anInt5505, local37.aBoolean468);
			}
		}
		return new Class218(local12.anInt1459, local7, local12.anInt1460, arg2, arg0, arg3);
	}
}

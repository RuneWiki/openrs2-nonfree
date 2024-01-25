import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class187 {

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "Lclient!hn;")
	private final Class102 aClass102_41 = new Class102(16);

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "Lclient!fo;")
	private final Class82 aClass82_73;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!d;ILclient!fo;)V")
	public Class187(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2) {
		this.aClass82_73 = arg2;
		this.aClass82_73.method1823(29);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
	public void method4184() {
		@Pc(12) Class102 local12 = this.aClass102_41;
		synchronized (this.aClass102_41) {
			this.aClass102_41.method2260();
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)Lclient!cp;")
	private Class41 method4185(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_41;
		@Pc(18) Class41 local18;
		synchronized (this.aClass102_41) {
			local18 = (Class41) this.aClass102_41.method2258((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class82 local31 = this.aClass82_73;
		@Pc(42) byte[] local42;
		synchronized (this.aClass82_73) {
			local42 = this.aClass82_73.method1817(29, arg0);
		}
		local18 = new Class41();
		if (local42 != null) {
			local18.method1001(new Class1_Sub28(local42));
		}
		@Pc(70) Class102 local70 = this.aClass102_41;
		synchronized (this.aClass102_41) {
			this.aClass102_41.method2272((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)V")
	public void method4186() {
		@Pc(6) Class102 local6 = this.aClass102_41;
		synchronized (this.aClass102_41) {
			this.aClass102_41.method2262(5);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!nf;IIII)Lclient!ad;")
	public Class5 method4188(@OriginalArg(1) Class164 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) Class18[] local15 = null;
		@Pc(20) Class41 local20 = this.method4185(arg1);
		if (local20.anIntArray53 != null) {
			local15 = new Class18[local20.anIntArray53.length];
			for (@Pc(30) int local30 = 0; local30 < local15.length; local30++) {
				@Pc(40) Class80 local40 = arg0.method3758(local20.anIntArray53[local30]);
				local15[local30] = new Class18(local40.anInt2142, local40.anInt2134, local40.anInt2132, local40.anInt2136, local40.anInt2137, local40.anInt2135, local40.anInt2139, local40.aBoolean246);
			}
		}
		return new Class5(local20.anInt1092, local15, local20.anInt1091, arg4, arg2, arg3);
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(B)V")
	public void method4189() {
		@Pc(6) Class102 local6 = this.aClass102_41;
		synchronized (this.aClass102_41) {
			this.aClass102_41.method2271();
		}
	}
}

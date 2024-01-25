import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public final class Class2 {

	@OriginalMember(owner = "client!aaa", name = "i", descriptor = "Lclient!sw;")
	private final Class277 aClass277_1 = new Class277(16);

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "Lclient!dn;")
	private final Class69 aClass69_1;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!re;ILclient!dn;)V")
	public Class2(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2) {
		this.aClass69_1 = arg2;
		this.aClass69_1.method1884(29);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
	public void method180() {
		@Pc(2) Class277 local2 = this.aClass277_1;
		synchronized (this.aClass277_1) {
			this.aClass277_1.method7026();
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lclient!tca;IIIII)Lclient!dd;")
	public Class62 method181(@OriginalArg(0) Class280 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class76[] local7 = null;
		@Pc(24) Class165 local24 = this.method183(arg1);
		if (local24.anIntArray399 != null) {
			local7 = new Class76[local24.anIntArray399.length];
			for (@Pc(34) int local34 = 0; local34 < local7.length; local34++) {
				@Pc(44) Class92 local44 = arg0.method7060(local24.anIntArray399[local34]);
				local7[local34] = new Class76(local44.anInt2456, local44.anInt2464, local44.anInt2458, local44.anInt2462, local44.anInt2463, local44.anInt2461, local44.anInt2465, local44.aBoolean210);
			}
		}
		return new Class62(local24.anInt4809, local7, local24.anInt4806, arg4, arg3, arg2);
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(B)V")
	public void method182() {
		@Pc(2) Class277 local2 = this.aClass277_1;
		synchronized (this.aClass277_1) {
			this.aClass277_1.method7019();
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)Lclient!ki;")
	private Class165 method183(@OriginalArg(1) int arg0) {
		@Pc(12) Class277 local12 = this.aClass277_1;
		@Pc(22) Class165 local22;
		synchronized (this.aClass277_1) {
			local22 = (Class165) this.aClass277_1.method7014((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class69 local35 = this.aClass69_1;
		@Pc(46) byte[] local46;
		synchronized (this.aClass69_1) {
			local46 = this.aClass69_1.method1888(arg0, 29);
		}
		local22 = new Class165();
		if (local46 != null) {
			local22.method4433(new Class1_Sub17(local46));
		}
		@Pc(68) Class277 local68 = this.aClass277_1;
		synchronized (this.aClass277_1) {
			this.aClass277_1.method7016(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZI)V")
	public void method184() {
		@Pc(14) Class277 local14 = this.aClass277_1;
		synchronized (this.aClass277_1) {
			this.aClass277_1.method7018(5);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class299 {

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "Lclient!qc;")
	private final Class231 aClass231_68 = new Class231(16);

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "Lclient!dda;")
	private final Class53 aClass53_144;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!oda;ILclient!dda;)V")
	public Class299(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2) {
		this.aClass53_144 = arg2;
		this.aClass53_144.method1592(29);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!ik;IIIII)Lclient!ml;")
	public Class191 method7461(@OriginalArg(0) Class131 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class319[] local7 = null;
		@Pc(12) Class66 local12 = this.method7462(arg2);
		if (local12.anIntArray218 != null) {
			local7 = new Class319[local12.anIntArray218.length];
			for (@Pc(30) int local30 = 0; local30 < local7.length; local30++) {
				@Pc(40) Class271 local40 = arg0.method3297(local12.anIntArray218[local30]);
				local7[local30] = new Class319(local40.anInt8340, local40.anInt8335, local40.anInt8337, local40.anInt8342, local40.anInt8333, local40.anInt8343, local40.anInt8339, local40.aBoolean603);
			}
		}
		return new Class191(local12.anInt1979, local7, local12.anInt1982, arg1, arg4, arg3);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)Lclient!eb;")
	private Class66 method7462(@OriginalArg(1) int arg0) {
		@Pc(6) Class231 local6 = this.aClass231_68;
		@Pc(16) Class66 local16;
		synchronized (this.aClass231_68) {
			local16 = (Class66) this.aClass231_68.method6228((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class53 local29 = this.aClass53_144;
		@Pc(38) byte[] local38;
		synchronized (this.aClass53_144) {
			local38 = this.aClass53_144.method1616(arg0, 29);
		}
		local16 = new Class66();
		if (local38 != null) {
			local16.method1925(new Class2_Sub29(local38));
		}
		@Pc(60) Class231 local60 = this.aClass231_68;
		synchronized (this.aClass231_68) {
			this.aClass231_68.method6232(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
	public void method7463() {
		@Pc(2) Class231 local2 = this.aClass231_68;
		synchronized (this.aClass231_68) {
			this.aClass231_68.method6227();
		}
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)V")
	public void method7464() {
		@Pc(6) Class231 local6 = this.aClass231_68;
		synchronized (this.aClass231_68) {
			this.aClass231_68.method6231(5);
		}
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V")
	public void method7465() {
		@Pc(6) Class231 local6 = this.aClass231_68;
		synchronized (this.aClass231_68) {
			this.aClass231_68.method6240();
		}
	}
}

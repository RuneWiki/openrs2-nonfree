import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class232 {

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "Lclient!dka;")
	private final Class85 aClass85_43 = new Class85(16);

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "Lclient!nca;")
	private final Class254 aClass254_108;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;)V")
	public Class232(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_108 = arg2;
		this.aClass254_108.method6101(29);
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(IB)Lclient!daa;")
	private Class73 method5473(@OriginalArg(0) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_43;
		@Pc(16) Class73 local16;
		synchronized (this.aClass85_43) {
			local16 = (Class73) this.aClass85_43.method1737((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class254 local30 = this.aClass254_108;
		@Pc(39) byte[] local39;
		synchronized (this.aClass254_108) {
			local39 = this.aClass254_108.method6087(arg0, 29);
		}
		local16 = new Class73();
		if (local39 != null) {
			local16.method1539(new Class2_Sub20(local39));
		}
		@Pc(71) Class85 local71 = this.aClass85_43;
		synchronized (this.aClass85_43) {
			this.aClass85_43.method1745((long) arg0, 16383, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIIILclient!at;I)Lclient!to;")
	public Class358 method5474(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class25 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class219[] local7 = null;
		@Pc(12) Class73 local12 = this.method5473(arg2);
		if (local12.anIntArray132 != null) {
			local7 = new Class219[local12.anIntArray132.length];
			for (@Pc(28) int local28 = 0; local28 < local7.length; local28++) {
				@Pc(38) Class366 local38 = arg3.method435(local12.anIntArray132[local28]);
				local7[local28] = new Class219(local38.anInt9844, local38.anInt9849, local38.anInt9837, local38.anInt9843, local38.anInt9847, local38.anInt9850, local38.anInt9838, local38.aBoolean839, local38.anInt9840, local38.anInt9848, local38.anInt9845);
			}
		}
		return new Class358(local12.anInt1789, local7, local12.anInt1791, arg4, arg1, arg0, local12.anInt1790, local12.anInt1793);
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
	public void method5475() {
		@Pc(9) Class85 local9 = this.aClass85_43;
		synchronized (this.aClass85_43) {
			this.aClass85_43.method1741();
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IB)V")
	public void method5477() {
		@Pc(2) Class85 local2 = this.aClass85_43;
		synchronized (this.aClass85_43) {
			this.aClass85_43.method1742(5);
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V")
	public void method5478() {
		@Pc(15) Class85 local15 = this.aClass85_43;
		synchronized (this.aClass85_43) {
			this.aClass85_43.method1748();
		}
	}
}

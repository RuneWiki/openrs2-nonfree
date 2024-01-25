import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class78 {

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "Lclient!er;")
	private final Class69 aClass69_28 = new Class69(16);

	@OriginalMember(owner = "client!fj", name = "j", descriptor = "Lclient!ns;")
	private final Class166 aClass166_87;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!go;ILclient!ns;)V")
	public Class78(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2) {
		this.aClass166_87 = arg2;
		this.aClass166_87.method3691(29);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IB)V")
	public void method1811() {
		@Pc(10) Class69 local10 = this.aClass69_28;
		synchronized (this.aClass69_28) {
			this.aClass69_28.method1594(5);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
	public void method1813() {
		@Pc(2) Class69 local2 = this.aClass69_28;
		synchronized (this.aClass69_28) {
			this.aClass69_28.method1593();
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(IB)Lclient!kf;")
	private Class135 method1815(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_28;
		@Pc(16) Class135 local16;
		synchronized (this.aClass69_28) {
			local16 = (Class135) this.aClass69_28.method1591((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(40) byte[] local40 = this.aClass166_87.method3696(arg0, 29);
		local16 = new Class135();
		if (local40 != null) {
			local16.method2940(new Class4_Sub30(local40));
		}
		@Pc(58) Class69 local58 = this.aClass69_28;
		synchronized (this.aClass69_28) {
			this.aClass69_28.method1590((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
	public void method1817() {
		@Pc(10) Class69 local10 = this.aClass69_28;
		synchronized (this.aClass69_28) {
			this.aClass69_28.method1600();
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!gd;IIII)Lclient!jk;")
	public Class129 method1818(@OriginalArg(0) int arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) Class228[] local12 = null;
		@Pc(17) Class135 local17 = this.method1815(arg3);
		if (local17.anIntArray322 != null) {
			local12 = new Class228[local17.anIntArray322.length];
			for (@Pc(27) int local27 = 0; local27 < local12.length; local27++) {
				@Pc(37) Class110 local37 = arg1.method1914(local17.anIntArray322[local27]);
				local12[local27] = new Class228(local37.anInt2874, local37.anInt2875, local37.anInt2880, local37.anInt2883, local37.anInt2881, local37.anInt2873, local37.anInt2876, local37.aBoolean208);
			}
		}
		return new Class129(local17.anInt3901, local12, local17.anInt3899, arg4, arg0, arg2);
	}
}

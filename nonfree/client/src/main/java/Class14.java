import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class14 {

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "Lclient!vh;")
	private final Class330 aClass330_5 = new Class330(16);

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "Lclient!pj;")
	private final Class248 aClass248_3;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;)V")
	public Class14(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2) {
		this.aClass248_3 = arg2;
		this.aClass248_3.method5793(29);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)Lclient!ts;")
	private Class312 method205(@OriginalArg(0) int arg0) {
		@Pc(6) Class330 local6 = this.aClass330_5;
		@Pc(16) Class312 local16;
		synchronized (this.aClass330_5) {
			local16 = (Class312) this.aClass330_5.method7677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class248 local29 = this.aClass248_3;
		@Pc(43) byte[] local43;
		synchronized (this.aClass248_3) {
			local43 = this.aClass248_3.method5797(29, arg0);
		}
		local16 = new Class312();
		if (local43 != null) {
			local16.method6974(new Class6_Sub12(local43));
		}
		@Pc(65) Class330 local65 = this.aClass330_5;
		synchronized (this.aClass330_5) {
			this.aClass330_5.method7676(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)V")
	public void method206() {
		@Pc(2) Class330 local2 = this.aClass330_5;
		synchronized (this.aClass330_5) {
			this.aClass330_5.method7680(5);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILclient!gd;II)Lclient!iea;")
	public Class141 method207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class116 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) Class48[] local13 = null;
		@Pc(18) Class312 local18 = this.method205(arg4);
		if (local18.anIntArray625 != null) {
			local13 = new Class48[local18.anIntArray625.length];
			for (@Pc(28) int local28 = 0; local28 < local13.length; local28++) {
				@Pc(38) Class186 local38 = arg2.method2646(local18.anIntArray625[local28]);
				local13[local28] = new Class48(local38.anInt5346, local38.anInt5342, local38.anInt5345, local38.anInt5348, local38.anInt5339, local38.anInt5344, local38.anInt5340, local38.aBoolean374);
			}
		}
		return new Class141(local18.anInt8769, local13, local18.anInt8770, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
	public void method208() {
		@Pc(6) Class330 local6 = this.aClass330_5;
		synchronized (this.aClass330_5) {
			this.aClass330_5.method7688();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
	public void method209() {
		@Pc(10) Class330 local10 = this.aClass330_5;
		synchronized (this.aClass330_5) {
			this.aClass330_5.method7678();
		}
	}
}

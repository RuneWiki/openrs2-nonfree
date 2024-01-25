import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class72 {

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "Lclient!hp;")
	private final Class125 aClass125_17 = new Class125(16);

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "Lclient!kea;")
	private final Class161 aClass161_25;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!cda;ILclient!kea;)V")
	public Class72(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2) {
		this.aClass161_25 = arg2;
		this.aClass161_25.method4266(29);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILclient!su;III)Lclient!ll;")
	public Class178 method2107(@OriginalArg(0) int arg0, @OriginalArg(2) Class274 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class258[] local7 = null;
		@Pc(12) Class97 local12 = this.method2110(arg0);
		if (local12.anIntArray287 != null) {
			local7 = new Class258[local12.anIntArray287.length];
			for (@Pc(26) int local26 = 0; local26 < local7.length; local26++) {
				@Pc(36) Class77 local36 = arg1.method6828(local12.anIntArray287[local26]);
				local7[local26] = new Class258(local36.anInt2524, local36.anInt2526, local36.anInt2522, local36.anInt2521, local36.anInt2520, local36.anInt2518, local36.anInt2523, local36.aBoolean188);
			}
		}
		return new Class178(local12.anInt2946, local7, local12.anInt2944, arg2, arg4, arg3);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
	public void method2108() {
		@Pc(2) Class125 local2 = this.aClass125_17;
		synchronized (this.aClass125_17) {
			this.aClass125_17.method3516();
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)Lclient!fu;")
	private Class97 method2110(@OriginalArg(1) int arg0) {
		@Pc(11) Class125 local11 = this.aClass125_17;
		@Pc(21) Class97 local21;
		synchronized (this.aClass125_17) {
			local21 = (Class97) this.aClass125_17.method3512((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class161 local34 = this.aClass161_25;
		@Pc(43) byte[] local43;
		synchronized (this.aClass161_25) {
			local43 = this.aClass161_25.method4243(arg0, 29);
		}
		local21 = new Class97();
		if (local43 != null) {
			local21.method2511(new Class3_Sub27(local43));
		}
		@Pc(65) Class125 local65 = this.aClass125_17;
		synchronized (this.aClass125_17) {
			this.aClass125_17.method3519((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
	public void method2112() {
		@Pc(2) Class125 local2 = this.aClass125_17;
		synchronized (this.aClass125_17) {
			this.aClass125_17.method3522(5);
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
	public void method2113() {
		@Pc(10) Class125 local10 = this.aClass125_17;
		synchronized (this.aClass125_17) {
			this.aClass125_17.method3521();
		}
	}
}

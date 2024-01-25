import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bda")
public final class Class28 {

	@OriginalMember(owner = "client!bda", name = "i", descriptor = "Lclient!mq;")
	private final Class223 aClass223_3 = new Class223(16);

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "Lclient!jn;")
	private final Class176 aClass176_10;

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;)V")
	public Class28(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2) {
		this.aClass176_10 = arg2;
		this.aClass176_10.method3999(29);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Z)V")
	public void method450() {
		@Pc(2) Class223 local2 = this.aClass223_3;
		synchronized (this.aClass223_3) {
			this.aClass223_3.method5398();
		}
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(B)V")
	public void method454() {
		@Pc(2) Class223 local2 = this.aClass223_3;
		synchronized (this.aClass223_3) {
			this.aClass223_3.method5400();
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BI)Lclient!ku;")
	private Class198 method455(@OriginalArg(1) int arg0) {
		@Pc(11) Class223 local11 = this.aClass223_3;
		@Pc(21) Class198 local21;
		synchronized (this.aClass223_3) {
			local21 = (Class198) this.aClass223_3.method5388((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class176 local34 = this.aClass176_10;
		@Pc(43) byte[] local43;
		synchronized (this.aClass176_10) {
			local43 = this.aClass176_10.method3994(arg0, 29);
		}
		local21 = new Class198();
		if (local43 != null) {
			local21.method4885(new Class4_Sub11(local43));
		}
		@Pc(65) Class223 local65 = this.aClass223_3;
		synchronized (this.aClass223_3) {
			this.aClass223_3.method5394(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IILclient!jea;III)Lclient!md;")
	public Class215 method457(@OriginalArg(0) int arg0, @OriginalArg(2) Class170 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) Class333[] local13 = null;
		@Pc(18) Class198 local18 = this.method455(arg0);
		if (local18.anIntArray281 != null) {
			local13 = new Class333[local18.anIntArray281.length];
			for (@Pc(28) int local28 = 0; local28 < local13.length; local28++) {
				@Pc(38) Class355 local38 = arg1.method3841(local18.anIntArray281[local28]);
				local13[local28] = new Class333(local38.anInt10060, local38.anInt10066, local38.anInt10065, local38.anInt10058, local38.anInt10059, local38.anInt10062, local38.anInt10055, local38.aBoolean712);
			}
		}
		return new Class215(local18.anInt5783, local13, local18.anInt5782, arg4, arg3, arg2);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)V")
	public void method458() {
		@Pc(6) Class223 local6 = this.aClass223_3;
		synchronized (this.aClass223_3) {
			this.aClass223_3.method5399(5);
		}
	}
}

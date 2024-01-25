import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class141 {

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "Lclient!vi;")
	private final Class332 aClass332_90 = new Class332(16);

	@OriginalMember(owner = "client!iba", name = "d", descriptor = "Lclient!pq;")
	private final Class251 aClass251_69;

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;)V")
	public Class141(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_69 = arg2;
		this.aClass251_69.method5849(29);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IB)V")
	public void method3008() {
		@Pc(6) Class332 local6 = this.aClass332_90;
		synchronized (this.aClass332_90) {
			this.aClass332_90.method7497(5);
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(II)Lclient!ed;")
	private Class80 method3010(@OriginalArg(0) int arg0) {
		@Pc(14) Class332 local14 = this.aClass332_90;
		@Pc(24) Class80 local24;
		synchronized (this.aClass332_90) {
			local24 = (Class80) this.aClass332_90.method7502((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class251 local37 = this.aClass251_69;
		@Pc(46) byte[] local46;
		synchronized (this.aClass251_69) {
			local46 = this.aClass251_69.method5860(29, arg0);
		}
		local24 = new Class80();
		if (local46 != null) {
			local24.method1695(new Class6_Sub14(local46));
		}
		@Pc(68) Class332 local68 = this.aClass332_90;
		synchronized (this.aClass332_90) {
			this.aClass332_90.method7498((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIILclient!gq;II)Lclient!eo;")
	public Class89 method3011(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class124 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class86[] local7 = null;
		@Pc(21) Class80 local21 = this.method3010(arg1);
		if (local21.anIntArray268 != null) {
			local7 = new Class86[local21.anIntArray268.length];
			for (@Pc(31) int local31 = 0; local31 < local7.length; local31++) {
				@Pc(41) Class203 local41 = arg2.method2626(local21.anIntArray268[local31]);
				local7[local31] = new Class86(local41.anInt5714, local41.anInt5706, local41.anInt5707, local41.anInt5709, local41.anInt5710, local41.anInt5703, local41.anInt5708, local41.aBoolean364);
			}
		}
		return new Class89(local21.anInt1966, local7, local21.anInt1962, arg3, arg0, arg4);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
	public void method3012() {
		@Pc(12) Class332 local12 = this.aClass332_90;
		synchronized (this.aClass332_90) {
			this.aClass332_90.method7512();
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Z)V")
	public void method3013() {
		@Pc(6) Class332 local6 = this.aClass332_90;
		synchronized (this.aClass332_90) {
			this.aClass332_90.method7510();
		}
	}
}

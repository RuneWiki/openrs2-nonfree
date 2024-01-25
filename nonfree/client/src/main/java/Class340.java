import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class340 {

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "Lclient!jda;")
	private final Class165 aClass165_67 = new Class165(16);

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "Lclient!aj;")
	private final Class15 aClass15_145;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;)V")
	public Class340(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		this.aClass15_145 = arg2;
		this.aClass15_145.method512(29);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
	public void method8281() {
		@Pc(6) Class165 local6 = this.aClass165_67;
		synchronized (this.aClass165_67) {
			this.aClass165_67.method4403();
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V")
	public void method8282() {
		@Pc(2) Class165 local2 = this.aClass165_67;
		synchronized (this.aClass165_67) {
			this.aClass165_67.method4400();
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILclient!dj;III)Lclient!lt;")
	public Class206 method8283(@OriginalArg(1) int arg0, @OriginalArg(2) Class75 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) Class350[] local12 = null;
		@Pc(17) Class380 local17 = this.method8284(arg4);
		if (local17.anIntArray929 != null) {
			local12 = new Class350[local17.anIntArray929.length];
			for (@Pc(27) int local27 = 0; local27 < local12.length; local27++) {
				@Pc(39) Class134 local39 = arg1.method2033(local17.anIntArray929[local27]);
				local12[local27] = new Class350(local39.anInt4192, local39.anInt4194, local39.anInt4193, local39.anInt4191, local39.anInt4189, local39.anInt4190, local39.anInt4195, local39.aBoolean314);
			}
		}
		return new Class206(local17.anInt10540, local12, local17.anInt10536, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IB)Lclient!wda;")
	private Class380 method8284(@OriginalArg(0) int arg0) {
		@Pc(6) Class165 local6 = this.aClass165_67;
		@Pc(16) Class380 local16;
		synchronized (this.aClass165_67) {
			local16 = (Class380) this.aClass165_67.method4389((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class15 local29 = this.aClass15_145;
		@Pc(40) byte[] local40;
		synchronized (this.aClass15_145) {
			local40 = this.aClass15_145.method517(arg0, 29);
		}
		local16 = new Class380();
		if (local40 != null) {
			local16.method9121(new Class3_Sub25(local40));
		}
		@Pc(62) Class165 local62 = this.aClass165_67;
		synchronized (this.aClass165_67) {
			this.aClass165_67.method4392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(IB)V")
	public void method8285() {
		@Pc(14) Class165 local14 = this.aClass165_67;
		synchronized (this.aClass165_67) {
			this.aClass165_67.method4394(5);
		}
	}
}

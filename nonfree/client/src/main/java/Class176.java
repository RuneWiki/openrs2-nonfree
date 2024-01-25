import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class176 {

	@OriginalMember(owner = "client!ju", name = "f", descriptor = "Lclient!me;")
	private final Class211 aClass211_40 = new Class211(16);

	@OriginalMember(owner = "client!ju", name = "h", descriptor = "Lclient!pe;")
	private final Class254 aClass254_75;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;)V")
	public Class176(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_75 = arg2;
		this.aClass254_75.method6396(29);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(BI)V")
	public void method4567() {
		@Pc(6) Class211 local6 = this.aClass211_40;
		synchronized (this.aClass211_40) {
			this.aClass211_40.method5538(5);
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZI)Lclient!vf;")
	private Class337 method4568(@OriginalArg(1) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_40;
		@Pc(16) Class337 local16;
		synchronized (this.aClass211_40) {
			local16 = (Class337) this.aClass211_40.method5534((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class254 local34 = this.aClass254_75;
		@Pc(43) byte[] local43;
		synchronized (this.aClass254_75) {
			local43 = this.aClass254_75.method6401(29, arg0);
		}
		local16 = new Class337();
		if (local43 != null) {
			local16.method8082(new Class3_Sub7(local43));
		}
		@Pc(65) Class211 local65 = this.aClass211_40;
		synchronized (this.aClass211_40) {
			this.aClass211_40.method5529((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIBILclient!qp;I)Lclient!hg;")
	public Class140 method4570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class272 arg3, @OriginalArg(5) int arg4) {
		@Pc(5) Class104[] local5 = null;
		@Pc(10) Class337 local10 = this.method4568(arg2);
		if (local10.anIntArray657 != null) {
			local5 = new Class104[local10.anIntArray657.length];
			for (@Pc(28) int local28 = 0; local28 < local5.length; local28++) {
				@Pc(37) Class311 local37 = arg3.method6854(local10.anIntArray657[local28]);
				local5[local28] = new Class104(local37.anInt9335, local37.anInt9333, local37.anInt9332, local37.anInt9331, local37.anInt9340, local37.anInt9336, local37.anInt9338, local37.aBoolean784);
			}
		}
		return new Class140(local10.anInt9952, local5, local10.anInt9954, arg4, arg0, arg1);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V")
	public void method4571() {
		@Pc(6) Class211 local6 = this.aClass211_40;
		synchronized (this.aClass211_40) {
			this.aClass211_40.method5537();
		}
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)V")
	public void method4572() {
		@Pc(6) Class211 local6 = this.aClass211_40;
		synchronized (this.aClass211_40) {
			this.aClass211_40.method5535();
		}
	}
}

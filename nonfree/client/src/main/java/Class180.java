import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class180 {

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Lclient!ge;")
	private final Class83 aClass83_33 = new Class83(16);

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "Lclient!ci;")
	private final Class38 aClass38_56;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!sn;ILclient!ci;)V")
	public Class180(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2) {
		this.aClass38_56 = arg2;
		this.aClass38_56.method1032(29);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)V")
	public void method4407() {
		@Pc(11) Class83 local11 = this.aClass83_33;
		synchronized (this.aClass83_33) {
			this.aClass83_33.method2345(5);
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	public void method4408() {
		@Pc(6) Class83 local6 = this.aClass83_33;
		synchronized (this.aClass83_33) {
			this.aClass83_33.method2336();
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!sq;IIIII)Lclient!vq;")
	public Class265 method4409(@OriginalArg(0) Class237 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class132[] local7 = null;
		@Pc(12) Class67 local12 = this.method4411(arg4);
		if (local12.anIntArray181 != null) {
			local7 = new Class132[local12.anIntArray181.length];
			for (@Pc(30) int local30 = 0; local30 < local7.length; local30++) {
				@Pc(40) Class163 local40 = arg0.method5401(local12.anIntArray181[local30]);
				local7[local30] = new Class132(local40.anInt4827, local40.anInt4824, local40.anInt4820, local40.anInt4828, local40.anInt4826, local40.anInt4821, local40.anInt4829, local40.aBoolean334);
			}
		}
		return new Class265(local12.anInt2073, local7, local12.anInt2075, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(II)Lclient!ep;")
	private Class67 method4411(@OriginalArg(0) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_33;
		@Pc(16) Class67 local16;
		synchronized (this.aClass83_33) {
			local16 = (Class67) this.aClass83_33.method2338((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class38 local37 = this.aClass38_56;
		@Pc(46) byte[] local46;
		synchronized (this.aClass38_56) {
			local46 = this.aClass38_56.method1039(arg0, 29);
		}
		local16 = new Class67();
		if (local46 != null) {
			local16.method1843(new Class4_Sub20(local46));
		}
		@Pc(68) Class83 local68 = this.aClass83_33;
		synchronized (this.aClass83_33) {
			this.aClass83_33.method2337(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
	public void method4412() {
		@Pc(6) Class83 local6 = this.aClass83_33;
		synchronized (this.aClass83_33) {
			this.aClass83_33.method2346();
		}
	}
}

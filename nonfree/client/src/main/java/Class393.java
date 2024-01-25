import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class393 {

	@OriginalMember(owner = "client!ws", name = "i", descriptor = "Lclient!tq;")
	private final Class340 aClass340_70 = new Class340(16);

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "Lclient!wm;")
	private final Class390 aClass390_128;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;)V")
	public Class393(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2) {
		this.aClass390_128 = arg2;
		this.aClass390_128.method8913(29);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V")
	public void method9015() {
		@Pc(6) Class340 local6 = this.aClass340_70;
		synchronized (this.aClass340_70) {
			this.aClass340_70.method7987();
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)Lclient!ri;")
	private Class302 method9017(@OriginalArg(1) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_70;
		@Pc(16) Class302 local16;
		synchronized (this.aClass340_70) {
			local16 = (Class302) this.aClass340_70.method7999((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class390 local29 = this.aClass390_128;
		@Pc(38) byte[] local38;
		synchronized (this.aClass390_128) {
			local38 = this.aClass390_128.method8914(29, arg0);
		}
		local16 = new Class302();
		if (local38 != null) {
			local16.method7298(new Class5_Sub41(local38));
		}
		@Pc(60) Class340 local60 = this.aClass340_70;
		synchronized (this.aClass340_70) {
			this.aClass340_70.method7986((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V")
	public void method9018() {
		@Pc(12) Class340 local12 = this.aClass340_70;
		synchronized (this.aClass340_70) {
			this.aClass340_70.method8000();
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BIIIILclient!fl;)Lclient!am;")
	public Class20 method9019(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class122 arg4) {
		@Pc(5) Class92[] local5 = null;
		@Pc(10) Class302 local10 = this.method9017(arg3);
		if (local10.anIntArray481 != null) {
			local5 = new Class92[local10.anIntArray481.length];
			for (@Pc(25) int local25 = 0; local25 < local5.length; local25++) {
				@Pc(34) Class192 local34 = arg4.method2977(local10.anIntArray481[local25]);
				local5[local25] = new Class92(local34.anInt5861, local34.anInt5859, local34.anInt5856, local34.anInt5866, local34.anInt5860, local34.anInt5862, local34.anInt5857, local34.aBoolean515);
			}
		}
		return new Class20(local10.anInt8555, local5, local10.anInt8552, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(II)V")
	public void method9020() {
		@Pc(6) Class340 local6 = this.aClass340_70;
		synchronized (this.aClass340_70) {
			this.aClass340_70.method7996(5);
		}
	}
}

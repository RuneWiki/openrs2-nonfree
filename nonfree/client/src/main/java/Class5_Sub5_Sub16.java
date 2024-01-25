import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class5_Sub5_Sub16 extends Class5_Sub5 {

	@OriginalMember(owner = "client!lu", name = "v", descriptor = "Lclient!qha;")
	private Class291 aClass291_24;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!ib;II)V")
	private void method5292(@OriginalArg(0) Class5_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(8) int local8 = arg0.method8529();
		@Pc(15) int local15;
		if (this.aClass291_24 == null) {
			local15 = Static94.method1393(local8);
			this.aClass291_24 = new Class291(local15);
		}
		for (local15 = 0; local15 < local8; local15++) {
			@Pc(39) boolean local39 = arg0.method8529() == 1;
			@Pc(43) int local43 = arg0.method8510();
			@Pc(52) Class5 local52;
			if (local39) {
				local52 = new Class5_Sub42(arg0.method8497());
			} else {
				local52 = new Class5_Sub29(arg0.method8527());
			}
			this.aClass291_24.method6984((long) local43, local52);
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILclient!ib;)V")
	public void method5293(@OriginalArg(1) Class5_Sub23 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8529();
			if (local13 == 0) {
				return;
			}
			this.method5292(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method5294(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass291_24 == null) {
			return arg1;
		} else {
			@Pc(23) Class5_Sub42 local23 = (Class5_Sub42) this.aClass291_24.method6993((long) arg0, 1);
			return local23 == null ? arg1 : local23.aString105;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BII)I")
	public int method5295(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass291_24 == null) {
			return arg1;
		} else {
			@Pc(24) Class5_Sub29 local24 = (Class5_Sub29) this.aClass291_24.method6993((long) arg0, 1);
			return local24 == null ? arg1 : local24.anInt5492;
		}
	}
}

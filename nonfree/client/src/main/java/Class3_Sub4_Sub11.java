import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class3_Sub4_Sub11 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ho", name = "B", descriptor = "Lclient!gn;")
	private Class136 aClass136_24;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZII)I")
	public int method3928(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass136_24 == null) {
			return arg0;
		} else {
			@Pc(33) Class3_Sub42 local33 = (Class3_Sub42) this.aClass136_24.method3503((long) arg1);
			return local33 == null ? arg0 : local33.anInt8429;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!rba;I)V")
	public void method3931(@OriginalArg(0) Class3_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5322(-81);
			if (local5 == 0) {
				return;
			}
			this.method3932(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!rba;II)V")
	private void method3932(@OriginalArg(0) Class3_Sub28 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(14) int local14 = arg0.method5322(-76);
		@Pc(21) int local21;
		if (this.aClass136_24 == null) {
			local21 = Static60.method735(local14);
			this.aClass136_24 = new Class136(local21);
		}
		for (local21 = 0; local21 < local14; local21++) {
			@Pc(43) boolean local43 = arg0.method5322(-98) == 1;
			@Pc(47) int local47 = arg0.method5307();
			@Pc(56) Class3 local56;
			if (local43) {
				local56 = new Class3_Sub30(arg0.method5295());
			} else {
				local56 = new Class3_Sub42(arg0.method5312());
			}
			this.aClass136_24.method3508((long) local47, local56);
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Ljava/lang/String;IZ)Ljava/lang/String;")
	public String method3933(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass136_24 == null) {
			return arg0;
		} else {
			@Pc(17) Class3_Sub30 local17 = (Class3_Sub30) this.aClass136_24.method3503((long) arg1);
			return local17 == null ? arg0 : local17.aString89;
		}
	}
}

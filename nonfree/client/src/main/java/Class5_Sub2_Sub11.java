import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class5_Sub2_Sub11 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ng", name = "G", descriptor = "Lclient!vg;")
	private Class252 aClass252_28;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
	public String method3446(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass252_28 == null) {
			return arg0;
		} else {
			@Pc(24) Class5_Sub13 local24 = (Class5_Sub13) this.aClass252_28.method5659((long) arg1);
			return local24 == null ? arg0 : local24.aString11;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!fh;B)V")
	public void method3448(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5539();
			if (local9 == 0) {
				return;
			}
			this.method3451(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BII)I")
	public int method3450(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass252_28 == null) {
			return arg0;
		} else {
			@Pc(21) Class5_Sub34 local21 = (Class5_Sub34) this.aClass252_28.method5659((long) arg1);
			return local21 == null ? arg0 : local21.anInt5642;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!fh;IZ)V")
	private void method3451(@OriginalArg(0) Class5_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(10) int local10 = arg0.method5539();
		@Pc(17) int local17;
		if (this.aClass252_28 == null) {
			local17 = Static331.method4084(local10);
			this.aClass252_28 = new Class252(local17);
		}
		for (local17 = 0; local17 < local10; local17++) {
			@Pc(36) boolean local36 = arg0.method5539() == 1;
			@Pc(40) int local40 = arg0.method5541();
			@Pc(49) Class5 local49;
			if (local36) {
				local49 = new Class5_Sub13(arg0.method5549());
			} else {
				local49 = new Class5_Sub34(arg0.method5603());
			}
			this.aClass252_28.method5658(local49, (long) local40);
		}
	}
}

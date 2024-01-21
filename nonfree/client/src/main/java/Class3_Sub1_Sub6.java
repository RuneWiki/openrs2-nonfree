import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class3_Sub1_Sub6 extends Class3_Sub1 {

	@OriginalMember(owner = "client!e", name = "Q", descriptor = "[Lclient!ng;")
	public final Class65[] aClass65Array1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!bc;Lclient!bc;IZ)V")
	public Class3_Sub1_Sub6(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class70 local7 = new Class70();
		@Pc(12) int local12 = arg0.method56(arg2);
		this.aClass65Array1 = new Class65[local12];
		@Pc(21) int[] local21 = arg0.method36(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method60(arg2, local21[local23]);
			@Pc(35) Class3_Sub14 local35 = null;
			@Pc(49) int local49 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			for (@Pc(54) Class3_Sub14 local54 = (Class3_Sub14) local7.method1953(); local54 != null; local54 = (Class3_Sub14) local7.method1948()) {
				if (local54.anInt1987 == local49) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(80) byte[] local80 = arg1.method59(local49, 0);
				local35 = new Class3_Sub14(local49, local80);
				local7.method1958(local35);
			}
			this.aClass65Array1[local21[local23]] = new Class65(local33, local35);
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(II)Z")
	public boolean method591(@OriginalArg(0) int arg0) {
		return this.aClass65Array1[arg0].aBoolean107;
	}
}

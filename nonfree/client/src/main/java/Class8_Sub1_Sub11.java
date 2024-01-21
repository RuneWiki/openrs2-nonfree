import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class8_Sub1_Sub11 extends Class8_Sub1 {

	@OriginalMember(owner = "client!he", name = "jb", descriptor = "[Lclient!k;")
	public final Class41[] aClass41Array1;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!dd;Lclient!dd;IZ)V")
	public Class8_Sub1_Sub11(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class49 local7 = new Class49();
		@Pc(12) int local12 = arg0.method1144(arg2);
		this.aClass41Array1 = new Class41[local12];
		@Pc(21) int[] local21 = arg0.method1153(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method1156(local21[local23], arg2);
			@Pc(35) Class8_Sub6 local35 = null;
			@Pc(49) int local49 = (local33[0] & 0xFF) << 8 | local33[1] & 0xFF;
			for (@Pc(54) Class8_Sub6 local54 = (Class8_Sub6) local7.method1107(); local54 != null; local54 = (Class8_Sub6) local7.method1109()) {
				if (local54.anInt613 == local49) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(88) byte[] local88 = arg1.method1162(local49, 0);
				local35 = new Class8_Sub6(local49, local88);
				local7.method1114(local35);
			}
			this.aClass41Array1[local21[local23]] = new Class41(local33, local35);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)Z")
	public boolean method768(@OriginalArg(1) int arg0) {
		return this.aClass41Array1[arg0].aBoolean65;
	}
}

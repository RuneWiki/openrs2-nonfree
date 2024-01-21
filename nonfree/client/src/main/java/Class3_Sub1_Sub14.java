import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class3_Sub1_Sub14 extends Class3_Sub1 {

	@OriginalMember(owner = "client!pc", name = "bb", descriptor = "[Lclient!le;")
	public final Class44[] aClass44Array1;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!ef;Lclient!ef;IZ)V")
	public Class3_Sub1_Sub14(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class65 local7 = new Class65();
		@Pc(12) int local12 = arg0.method561(arg2);
		this.aClass44Array1 = new Class44[local12];
		@Pc(21) int[] local21 = arg0.method571(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(27) Class3_Sub24 local27 = null;
			@Pc(35) byte[] local35 = arg0.method566(arg2, local21[local23]);
			@Pc(49) int local49 = local35[1] & 0xFF | (local35[0] & 0xFF) << 8;
			for (@Pc(54) Class3_Sub24 local54 = (Class3_Sub24) local7.method1958(); local54 != null; local54 = (Class3_Sub24) local7.method1962()) {
				if (local49 == local54.anInt3128) {
					local27 = local54;
					break;
				}
			}
			if (local27 == null) {
				@Pc(88) byte[] local88 = arg1.method558(0, local49);
				local27 = new Class3_Sub24(local49, local88);
				local7.method1955(local27);
			}
			this.aClass44Array1[local21[local23]] = new Class44(local35, local27);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)Z")
	public boolean method1663(@OriginalArg(1) int arg0) {
		return this.aClass44Array1[arg0].aBoolean101;
	}
}

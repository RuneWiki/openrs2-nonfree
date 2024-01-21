import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class3_Sub1_Sub6 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ie", name = "P", descriptor = "[Lclient!ec;")
	public final Class20[] aClass20Array1;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!we;Lclient!we;IZ)V")
	public Class3_Sub1_Sub6(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class11 local7 = new Class11();
		@Pc(12) int local12 = arg0.method1507(arg2);
		this.aClass20Array1 = new Class20[local12];
		@Pc(21) int[] local21 = arg0.method1506(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(27) Class3_Sub5 local27 = null;
			@Pc(35) byte[] local35 = arg0.method1512(arg2, local21[local23]);
			@Pc(49) int local49 = (local35[0] & 0xFF) << 8 | local35[1] & 0xFF;
			for (@Pc(54) Class3_Sub5 local54 = (Class3_Sub5) local7.method189(); local54 != null; local54 = (Class3_Sub5) local7.method187()) {
				if (local49 == local54.anInt735) {
					local27 = local54;
					break;
				}
			}
			if (local27 == null) {
				@Pc(84) byte[] local84 = arg1.method1496(0, local49);
				local27 = new Class3_Sub5(local49, local84);
				local7.method190(local27);
			}
			this.aClass20Array1[local21[local23]] = new Class20(local35, local27);
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(II)Z")
	public boolean method938(@OriginalArg(0) int arg0) {
		return this.aClass20Array1[arg0].aBoolean34;
	}
}

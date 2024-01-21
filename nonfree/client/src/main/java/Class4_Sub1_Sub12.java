import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class4_Sub1_Sub12 extends Class4_Sub1 {

	@OriginalMember(owner = "client!rc", name = "P", descriptor = "[Lclient!ff;")
	public final Class25[] aClass25Array1;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!ea;Lclient!ea;IZ)V")
	public Class4_Sub1_Sub12(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class82 local7 = new Class82();
		@Pc(12) int local12 = arg0.method591(arg2);
		this.aClass25Array1 = new Class25[local12];
		@Pc(21) int[] local21 = arg0.method598(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(27) Class4_Sub16 local27 = null;
			@Pc(35) byte[] local35 = arg0.method597(arg2, local21[local23]);
			@Pc(49) int local49 = (local35[0] & 0xFF) << 8 | local35[1] & 0xFF;
			for (@Pc(54) Class4_Sub16 local54 = (Class4_Sub16) local7.method2025(); local54 != null; local54 = (Class4_Sub16) local7.method2023()) {
				if (local49 == local54.anInt2018) {
					local27 = local54;
					break;
				}
			}
			if (local27 == null) {
				@Pc(84) byte[] local84 = arg1.method608(0, local49);
				local27 = new Class4_Sub16(local49, local84);
				local7.method2028(local27);
			}
			this.aClass25Array1[local21[local23]] = new Class25(local35, local27);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)Z")
	public boolean method1702(@OriginalArg(0) int arg0) {
		return this.aClass25Array1[arg0].aBoolean93;
	}
}

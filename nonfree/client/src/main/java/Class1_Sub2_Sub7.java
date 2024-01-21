import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!f", name = "O", descriptor = "[Lclient!le;")
	public final Class48[] aClass48Array1;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!ag;Lclient!ag;IZ)V")
	public Class1_Sub2_Sub7(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class82 local7 = new Class82();
		@Pc(12) int local12 = arg0.method2260(arg2);
		this.aClass48Array1 = new Class48[local12];
		@Pc(21) int[] local21 = arg0.method2265(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(27) Class1_Sub3 local27 = null;
			@Pc(35) byte[] local35 = arg0.method2243(arg2, local21[local23]);
			@Pc(49) int local49 = (local35[0] & 0xFF) << 8 | local35[1] & 0xFF;
			for (@Pc(54) Class1_Sub3 local54 = (Class1_Sub3) local7.method2849(); local54 != null; local54 = (Class1_Sub3) local7.method2855()) {
				if (local49 == local54.anInt246) {
					local27 = local54;
					break;
				}
			}
			if (local27 == null) {
				@Pc(84) byte[] local84 = arg1.method2261(local49, 0);
				local27 = new Class1_Sub3(local49, local84);
				local7.method2853(local27);
			}
			this.aClass48Array1[local21[local23]] = new Class48(local35, local27);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Z")
	public boolean method1189(@OriginalArg(1) int arg0) {
		return this.aClass48Array1[arg0].aBoolean209;
	}
}

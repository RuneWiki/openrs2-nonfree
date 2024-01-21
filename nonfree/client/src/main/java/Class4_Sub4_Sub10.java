import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class4_Sub4_Sub10 extends Class4_Sub4 {

	@OriginalMember(owner = "client!mb", name = "Bb", descriptor = "[Lclient!vb;")
	public final Class76[] aClass76Array1;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!lc;Lclient!lc;IZ)V")
	public Class4_Sub4_Sub10(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class70 local7 = new Class70();
		@Pc(12) int local12 = arg0.method1114(arg2);
		this.aClass76Array1 = new Class76[local12];
		@Pc(21) int[] local21 = arg0.method1099(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method1110(local21[local23], arg2);
			@Pc(47) int local47 = (local33[0] & 0xFF) << 8 | local33[1] & 0xFF;
			@Pc(52) Class4_Sub3 local52 = (Class4_Sub3) local7.method1939();
			@Pc(54) Class4_Sub3 local54 = null;
			while (local52 != null) {
				if (local47 == local52.anInt153) {
					local54 = local52;
					break;
				}
				local52 = (Class4_Sub3) local7.method1936();
			}
			if (local54 == null) {
				@Pc(84) byte[] local84 = arg1.method1111(local47, 0);
				local54 = new Class4_Sub3(local47, local84);
				local7.method1931(local54);
			}
			this.aClass76Array1[local21[local23]] = new Class76(local33, local54);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)Z")
	public boolean method1380(@OriginalArg(0) int arg0) {
		return this.aClass76Array1[arg0].aBoolean120;
	}
}

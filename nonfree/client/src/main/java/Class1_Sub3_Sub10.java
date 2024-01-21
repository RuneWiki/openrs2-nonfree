import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class1_Sub3_Sub10 extends Class1_Sub3 {

	@OriginalMember(owner = "client!j", name = "N", descriptor = "[Lclient!ti;")
	public final Class88[] aClass88Array1;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!ab;Lclient!ab;IZ)V")
	public Class1_Sub3_Sub10(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class20 local7 = new Class20();
		@Pc(12) int local12 = arg0.method3270(arg2);
		this.aClass88Array1 = new Class88[local12];
		@Pc(21) int[] local21 = arg0.method3258(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method3265(arg2, local21[local23]);
			@Pc(47) int local47 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			@Pc(49) Class1_Sub26 local49 = null;
			for (@Pc(54) Class1_Sub26 local54 = (Class1_Sub26) local7.method467(); local54 != null; local54 = (Class1_Sub26) local7.method468()) {
				if (local54.anInt4426 == local47) {
					local49 = local54;
					break;
				}
			}
			if (local49 == null) {
				@Pc(80) byte[] local80 = arg1.method3275(0, local47);
				local49 = new Class1_Sub26(local47, local80);
				local7.method466(local49);
			}
			this.aClass88Array1[local21[local23]] = new Class88(local33, local49);
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(II)Z")
	public boolean method1301(@OriginalArg(0) int arg0) {
		return this.aClass88Array1[arg0].aBoolean222;
	}
}

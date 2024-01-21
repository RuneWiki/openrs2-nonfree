import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!id", name = "cb", descriptor = "[Lclient!hc;")
	public final Class30[] aClass30Array1;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!oc;Lclient!oc;IZ)V")
	public Class1_Sub2_Sub10(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class2 local7 = new Class2();
		@Pc(12) int local12 = arg0.method1279(arg2);
		this.aClass30Array1 = new Class30[local12];
		@Pc(21) int[] local21 = arg0.method1274(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method1269(arg2, local21[local23]);
			@Pc(35) Class1_Sub6 local35 = null;
			@Pc(49) int local49 = (local33[0] & 0xFF) << 8 | local33[1] & 0xFF;
			for (@Pc(54) Class1_Sub6 local54 = (Class1_Sub6) local7.method22(); local54 != null; local54 = (Class1_Sub6) local7.method23()) {
				if (local54.anInt1042 == local49) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(80) byte[] local80 = arg1.method1270(0, local49);
				local35 = new Class1_Sub6(local49, local80);
				local7.method33(local35);
			}
			this.aClass30Array1[local21[local23]] = new Class30(local33, local35);
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(II)Z")
	public boolean method1010(@OriginalArg(1) int arg0) {
		return this.aClass30Array1[arg0].aBoolean49;
	}
}

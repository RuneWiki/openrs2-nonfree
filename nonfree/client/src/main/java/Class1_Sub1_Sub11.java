import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pd", name = "pb", descriptor = "[Lclient!oa;")
	public final Class50[] aClass50Array1;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!sf;Lclient!sf;IZ)V")
	public Class1_Sub1_Sub11(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class61 local7 = new Class61();
		@Pc(12) int local12 = arg0.method106(arg2);
		this.aClass50Array1 = new Class50[local12];
		@Pc(21) int[] local21 = arg0.method129(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method107(local21[local23], arg2);
			@Pc(35) Class1_Sub21 local35 = null;
			@Pc(49) int local49 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			for (@Pc(54) Class1_Sub21 local54 = (Class1_Sub21) local7.method1748(); local54 != null; local54 = (Class1_Sub21) local7.method1760()) {
				if (local49 == local54.anInt2766) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(80) byte[] local80 = arg1.method108(0, local49);
				local35 = new Class1_Sub21(local49, local80);
				local7.method1754(local35);
			}
			this.aClass50Array1[local21[local23]] = new Class50(local33, local35);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)Z")
	public boolean method1609(@OriginalArg(1) int arg0) {
		return this.aClass50Array1[arg0].aBoolean89;
	}
}

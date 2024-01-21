import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aa", name = "Q", descriptor = "[Lclient!ka;")
	public final Class45[] aClass45Array1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!kh;Lclient!kh;IZ)V")
	public Class2_Sub1_Sub1(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class12 local7 = new Class12();
		@Pc(12) int local12 = arg0.method1039(arg2);
		this.aClass45Array1 = new Class45[local12];
		@Pc(21) int[] local21 = arg0.method1022(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method1030(local21[local23], arg2);
			@Pc(47) int local47 = (local33[0] & 0xFF) << 8 | local33[1] & 0xFF;
			@Pc(49) Class2_Sub9 local49 = null;
			for (@Pc(54) Class2_Sub9 local54 = (Class2_Sub9) local7.method384(); local54 != null; local54 = (Class2_Sub9) local7.method381()) {
				if (local54.anInt1471 == local47) {
					local49 = local54;
					break;
				}
			}
			if (local49 == null) {
				@Pc(80) byte[] local80 = arg1.method1033(0, local47);
				local49 = new Class2_Sub9(local47, local80);
				local7.method382(local49);
			}
			this.aClass45Array1[local21[local23]] = new Class45(local33, local49);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Z")
	public boolean method31(@OriginalArg(0) int arg0) {
		return this.aClass45Array1[arg0].aBoolean82;
	}
}

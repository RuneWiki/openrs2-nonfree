import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class3_Sub3_Sub15 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ud", name = "nb", descriptor = "[Lclient!lb;")
	public final Class38[] aClass38Array1;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!td;Lclient!td;IZ)V")
	public Class3_Sub3_Sub15(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class28 local7 = new Class28();
		@Pc(12) int local12 = arg0.method1609(arg2);
		this.aClass38Array1 = new Class38[local12];
		@Pc(21) int[] local21 = arg0.method1597(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method1615(arg2, local21[local23]);
			@Pc(35) Class3_Sub2 local35 = null;
			@Pc(49) int local49 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			for (@Pc(54) Class3_Sub2 local54 = (Class3_Sub2) local7.method884(); local54 != null; local54 = (Class3_Sub2) local7.method875()) {
				if (local54.anInt86 == local49) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(84) byte[] local84 = arg1.method1602(0, local49);
				local35 = new Class3_Sub2(local49, local84);
				local7.method889(local35);
			}
			this.aClass38Array1[local21[local23]] = new Class38(local33, local35);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Z")
	public boolean method1833(@OriginalArg(1) int arg0) {
		return this.aClass38Array1[arg0].aBoolean77;
	}
}

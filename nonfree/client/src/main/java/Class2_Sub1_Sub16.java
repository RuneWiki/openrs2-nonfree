import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class2_Sub1_Sub16 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ua", name = "S", descriptor = "[Lclient!gb;")
	public final Class25[] aClass25Array1;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!jd;Lclient!jd;IZ)V")
	public Class2_Sub1_Sub16(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class34 local7 = new Class34();
		@Pc(12) int local12 = arg0.method1763(arg2);
		this.aClass25Array1 = new Class25[local12];
		@Pc(21) int[] local21 = arg0.method1762(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(27) Class2_Sub2 local27 = null;
			@Pc(35) byte[] local35 = arg0.method1761(arg2, local21[local23]);
			@Pc(49) int local49 = local35[1] & 0xFF | (local35[0] & 0xFF) << 8;
			for (@Pc(54) Class2_Sub2 local54 = (Class2_Sub2) local7.method872(); local54 != null; local54 = (Class2_Sub2) local7.method879()) {
				if (local54.anInt184 == local49) {
					local27 = local54;
					break;
				}
			}
			if (local27 == null) {
				@Pc(80) byte[] local80 = arg1.method1767(local49, 0);
				local27 = new Class2_Sub2(local49, local80);
				local7.method876(local27);
			}
			this.aClass25Array1[local21[local23]] = new Class25(local35, local27);
		}
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(II)Z")
	public boolean method1909(@OriginalArg(0) int arg0) {
		return this.aClass25Array1[arg0].aBoolean58;
	}
}

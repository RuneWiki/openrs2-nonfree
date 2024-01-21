import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class2_Sub2_Sub16 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ua", name = "nb", descriptor = "[Lclient!te;")
	public final Class73[] aClass73Array1;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!g;Lclient!g;IZ)V")
	public Class2_Sub2_Sub16(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class13 local7 = new Class13();
		@Pc(12) int local12 = arg0.method1369(arg2);
		this.aClass73Array1 = new Class73[local12];
		@Pc(21) int[] local21 = arg0.method1352(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(27) Class2_Sub7 local27 = null;
			@Pc(35) byte[] local35 = arg0.method1358(local21[local23], arg2);
			@Pc(49) int local49 = local35[1] & 0xFF | (local35[0] & 0xFF) << 8;
			for (@Pc(54) Class2_Sub7 local54 = (Class2_Sub7) local7.method415(); local54 != null; local54 = (Class2_Sub7) local7.method414()) {
				if (local54.anInt615 == local49) {
					local27 = local54;
					break;
				}
			}
			if (local27 == null) {
				@Pc(80) byte[] local80 = arg1.method1368(local49, 0);
				local27 = new Class2_Sub7(local49, local80);
				local7.method418(local27);
			}
			this.aClass73Array1[local21[local23]] = new Class73(local35, local27);
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)Z")
	public boolean method1745(@OriginalArg(0) int arg0) {
		return this.aClass73Array1[arg0].aBoolean105;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class2_Sub1_Sub16 extends Class2_Sub1 {

	@OriginalMember(owner = "client!t", name = "Nb", descriptor = "[Lclient!o;")
	public final Class42[] aClass42Array1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!bd;Lclient!bd;IZ)V")
	public Class2_Sub1_Sub16(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class46 local7 = new Class46();
		@Pc(12) int local12 = arg0.method1702(arg2);
		this.aClass42Array1 = new Class42[local12];
		@Pc(21) int[] local21 = arg0.method1704(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method1684(local21[local23], arg2);
			@Pc(35) Class2_Sub13 local35 = null;
			@Pc(49) int local49 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			for (@Pc(54) Class2_Sub13 local54 = (Class2_Sub13) local7.method1435(); local54 != null; local54 = (Class2_Sub13) local7.method1442()) {
				if (local49 == local54.anInt2660) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(80) byte[] local80 = arg1.method1694(0, local49);
				local35 = new Class2_Sub13(local49, local80);
				local7.method1437(local35);
			}
			this.aClass42Array1[local21[local23]] = new Class42(local33, local35);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)Z")
	public boolean method1613(@OriginalArg(0) int arg0) {
		return this.aClass42Array1[arg0].aBoolean107;
	}
}

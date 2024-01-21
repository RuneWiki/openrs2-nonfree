import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class3_Sub1_Sub12 extends Class3_Sub1 {

	@OriginalMember(owner = "client!od", name = "cb", descriptor = "[Lclient!qa;")
	public final Class53[] aClass53Array1;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!bf;Lclient!bf;IZ)V")
	public Class3_Sub1_Sub12(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class51 local7 = new Class51();
		@Pc(12) int local12 = arg0.method1875(arg2);
		this.aClass53Array1 = new Class53[local12];
		@Pc(21) int[] local21 = arg0.method1863(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method1882(arg2, local21[local23]);
			@Pc(35) Class3_Sub12 local35 = null;
			@Pc(49) int local49 = (local33[0] & 0xFF) << 8 | local33[1] & 0xFF;
			for (@Pc(54) Class3_Sub12 local54 = (Class3_Sub12) local7.method1316(); local54 != null; local54 = (Class3_Sub12) local7.method1310()) {
				if (local54.anInt2684 == local49) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(88) byte[] local88 = arg1.method1871(local49, 0);
				local35 = new Class3_Sub12(local49, local88);
				local7.method1303(local35);
			}
			this.aClass53Array1[local21[local23]] = new Class53(local33, local35);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)Z")
	public boolean method1293(@OriginalArg(0) int arg0) {
		return this.aClass53Array1[arg0].aBoolean103;
	}
}

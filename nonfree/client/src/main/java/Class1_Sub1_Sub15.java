import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ph", name = "H", descriptor = "[Lclient!pj;")
	public Class89[] aClass89Array1;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!pa;Lclient!pa;IZ)V")
	public Class1_Sub1_Sub15(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class75 local7 = new Class75();
		@Pc(12) int local12 = arg0.method3323(arg2);
		this.aClass89Array1 = new Class89[local12];
		@Pc(21) int[] local21 = arg0.method3308(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method3325(arg2, local21[local23]);
			@Pc(35) Class1_Sub28 local35 = null;
			@Pc(49) int local49 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			for (@Pc(54) Class1_Sub28 local54 = (Class1_Sub28) local7.method2239(); local54 != null; local54 = (Class1_Sub28) local7.method2238()) {
				if (local54.anInt4206 == local49) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(92) byte[] local92 = arg1.method3327(0, local49);
				local35 = new Class1_Sub28(local49, local92);
				local7.method2240(local35);
			}
			this.aClass89Array1[local21[local23]] = new Class89(local33, local35);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)Z")
	public boolean method2744(@OriginalArg(0) int arg0) {
		return this.aClass89Array1[arg0].aBoolean146;
	}
}

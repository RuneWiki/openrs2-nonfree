import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class3_Sub1_Sub16 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ua", name = "Q", descriptor = "[Lclient!ie;")
	public final Class32[] aClass32Array1;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!mb;Lclient!mb;IZ)V")
	public Class3_Sub1_Sub16(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class24 local7 = new Class24();
		@Pc(12) int local12 = arg0.method1494(arg2);
		this.aClass32Array1 = new Class32[local12];
		@Pc(21) int[] local21 = arg0.method1497(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method1504(arg2, local21[local23]);
			@Pc(35) Class3_Sub12 local35 = null;
			@Pc(49) int local49 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			for (@Pc(54) Class3_Sub12 local54 = (Class3_Sub12) local7.method534(); local54 != null; local54 = (Class3_Sub12) local7.method525()) {
				if (local54.anInt2561 == local49) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(92) byte[] local92 = arg1.method1499(local49, 0);
				local35 = new Class3_Sub12(local49, local92);
				local7.method535(local35);
			}
			this.aClass32Array1[local21[local23]] = new Class32(local33, local35);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)Z")
	public boolean method1650(@OriginalArg(0) int arg0) {
		return this.aClass32Array1[arg0].aBoolean70;
	}
}

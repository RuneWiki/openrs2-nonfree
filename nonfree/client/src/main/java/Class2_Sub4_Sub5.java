import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class2_Sub4_Sub5 extends Class2_Sub4 {

	@OriginalMember(owner = "client!dc", name = "R", descriptor = "[Lclient!rf;")
	public final Class72[] aClass72Array1;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!jc;Lclient!jc;IZ)V")
	public Class2_Sub4_Sub5(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class65 local7 = new Class65();
		@Pc(12) int local12 = arg0.method1785(arg2);
		this.aClass72Array1 = new Class72[local12];
		@Pc(21) int[] local21 = arg0.method1780(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method1771(arg2, local21[local23]);
			@Pc(35) Class2_Sub24 local35 = null;
			@Pc(49) int local49 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			for (@Pc(54) Class2_Sub24 local54 = (Class2_Sub24) local7.method2115(); local54 != null; local54 = (Class2_Sub24) local7.method2117()) {
				if (local54.anInt3446 == local49) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(80) byte[] local80 = arg1.method1770(0, local49);
				local35 = new Class2_Sub24(local49, local80);
				local7.method2116(local35);
			}
			this.aClass72Array1[local21[local23]] = new Class72(local33, local35);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Z")
	public boolean method659(@OriginalArg(1) int arg0) {
		return this.aClass72Array1[arg0].aBoolean144;
	}
}

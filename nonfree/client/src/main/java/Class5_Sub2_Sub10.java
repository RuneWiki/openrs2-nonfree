import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class5_Sub2_Sub10 extends Class5_Sub2 {

	@OriginalMember(owner = "client!kc", name = "U", descriptor = "[Lclient!ab;")
	public final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!ff;Lclient!ff;IZ)V")
	public Class5_Sub2_Sub10(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class58 local7 = new Class58();
		@Pc(12) int local12 = arg0.method1031(arg2);
		this.aClass3Array1 = new Class3[local12];
		@Pc(21) int[] local21 = arg0.method1040(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method1038(arg2, local21[local23]);
			@Pc(35) Class5_Sub24 local35 = null;
			@Pc(49) int local49 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			for (@Pc(54) Class5_Sub24 local54 = (Class5_Sub24) local7.method1669(); local54 != null; local54 = (Class5_Sub24) local7.method1664()) {
				if (local49 == local54.anInt3390) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(88) byte[] local88 = arg1.method1046(local49, 0);
				local35 = new Class5_Sub24(local49, local88);
				local7.method1663(local35);
			}
			this.aClass3Array1[local21[local23]] = new Class3(local33, local35);
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)Z")
	public boolean method1100(@OriginalArg(1) int arg0) {
		return this.aClass3Array1[arg0].aBoolean2;
	}
}

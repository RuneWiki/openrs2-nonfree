import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class3_Sub1_Sub14 extends Class3_Sub1 {

	@OriginalMember(owner = "client!nc", name = "P", descriptor = "[Lclient!fh;")
	public final Class25[] aClass25Array1;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!f;Lclient!f;IZ)V")
	public Class3_Sub1_Sub14(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class72 local7 = new Class72();
		@Pc(12) int local12 = arg0.method353(arg2);
		this.aClass25Array1 = new Class25[local12];
		@Pc(21) int[] local21 = arg0.method345(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method348(arg2, local21[local23]);
			@Pc(35) Class3_Sub21 local35 = null;
			@Pc(49) int local49 = (local33[0] & 0xFF) << 8 | local33[1] & 0xFF;
			for (@Pc(54) Class3_Sub21 local54 = (Class3_Sub21) local7.method2401(); local54 != null; local54 = (Class3_Sub21) local7.method2407()) {
				if (local49 == local54.anInt3413) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(84) byte[] local84 = arg1.method361(0, local49);
				local35 = new Class3_Sub21(local49, local84);
				local7.method2404(local35);
			}
			this.aClass25Array1[local21[local23]] = new Class25(local33, local35);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)Z")
	public boolean method1933(@OriginalArg(0) int arg0) {
		return this.aClass25Array1[arg0].aBoolean78;
	}
}

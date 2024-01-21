import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class5_Sub2_Sub12 extends Class5_Sub2 {

	@OriginalMember(owner = "client!qe", name = "db", descriptor = "[Lclient!va;")
	public final Class74[] aClass74Array1;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!sd;Lclient!sd;IZ)V")
	public Class5_Sub2_Sub12(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class10 local5 = new Class10();
		@Pc(10) int local10 = arg0.method737(arg2);
		this.aClass74Array1 = new Class74[local10];
		@Pc(19) int[] local19 = arg0.method756(arg2);
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(30) byte[] local30 = arg0.method733(local19[local21], arg2);
			@Pc(44) int local44 = local30[1] & 0xFF | (local30[0] & 0xFF) << 8;
			@Pc(46) Class5_Sub16 local46 = null;
			for (@Pc(51) Class5_Sub16 local51 = (Class5_Sub16) local5.method230(); local51 != null; local51 = (Class5_Sub16) local5.method233()) {
				if (local44 == local51.anInt2796) {
					local46 = local51;
					break;
				}
			}
			if (local46 == null) {
				@Pc(83) byte[] local83 = arg1.method749(0, local44);
				local46 = new Class5_Sub16(local44, local83);
				local5.method234(local46);
			}
			this.aClass74Array1[local19[local21]] = new Class74(local30, local46);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)Z")
	public boolean method1725(@OriginalArg(1) int arg0) {
		return this.aClass74Array1[arg0].aBoolean130;
	}
}

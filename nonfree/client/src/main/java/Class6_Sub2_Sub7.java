import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class6_Sub2_Sub7 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ka", name = "bb", descriptor = "[Lclient!qc;")
	public final Class52[] aClass52Array1;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lclient!pb;Lclient!pb;IZ)V")
	public Class6_Sub2_Sub7(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class3 local7 = new Class3();
		@Pc(12) int local12 = arg0.method1224(arg2);
		this.aClass52Array1 = new Class52[local12];
		@Pc(21) int[] local21 = arg0.method1240(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(27) Class6_Sub14 local27 = null;
			@Pc(35) byte[] local35 = arg0.method1243(local21[local23], arg2);
			@Pc(49) int local49 = (local35[0] & 0xFF) << 8 | local35[1] & 0xFF;
			for (@Pc(54) Class6_Sub14 local54 = (Class6_Sub14) local7.method31(); local54 != null; local54 = (Class6_Sub14) local7.method26()) {
				if (local54.anInt3093 == local49) {
					local27 = local54;
					break;
				}
			}
			if (local27 == null) {
				@Pc(92) byte[] local92 = arg1.method1228(0, local49);
				local27 = new Class6_Sub14(local49, local92);
				local7.method23(local27);
			}
			this.aClass52Array1[local21[local23]] = new Class52(local35, local27);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Z")
	public boolean method1015(@OriginalArg(0) int arg0) {
		return this.aClass52Array1[arg0].aBoolean108;
	}
}

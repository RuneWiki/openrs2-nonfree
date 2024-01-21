import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class2_Sub2_Sub14 extends Class2_Sub2 {

	@OriginalMember(owner = "client!kf", name = "V", descriptor = "[Lclient!eb;")
	public final Class22[] aClass22Array1;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!ke;Lclient!ke;IZ)V")
	public Class2_Sub2_Sub14(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class10 local5 = new Class10();
		@Pc(10) int local10 = arg0.method2223(arg2);
		this.aClass22Array1 = new Class22[local10];
		@Pc(19) int[] local19 = arg0.method2217(arg2);
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(30) byte[] local30 = arg0.method2205(local19[local21], arg2);
			@Pc(44) int local44 = local30[1] & 0xFF | (local30[0] & 0xFF) << 8;
			@Pc(49) Class2_Sub24 local49 = (Class2_Sub24) local5.method444();
			@Pc(51) Class2_Sub24 local51 = null;
			while (local49 != null) {
				if (local44 == local49.anInt4520) {
					local51 = local49;
					break;
				}
				local49 = (Class2_Sub24) local5.method451();
			}
			if (local51 == null) {
				@Pc(83) byte[] local83 = arg1.method2222(0, local44);
				local51 = new Class2_Sub24(local44, local83);
				local5.method448(local51);
			}
			this.aClass22Array1[local19[local21]] = new Class22(local30, local51);
		}
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(II)Z")
	public boolean method1558(@OriginalArg(1) int arg0) {
		return this.aClass22Array1[arg0].aBoolean54;
	}
}

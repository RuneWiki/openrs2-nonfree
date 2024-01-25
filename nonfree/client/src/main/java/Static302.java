import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "Lclient!ch;")
	public static Class56 aClass56_7;

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_127 = new Class100(85, 12);

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
	public static int anInt10116 = 0;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!eo;B)[I")
	public static int[] method8417(@OriginalArg(0) Class14_Sub19 arg0) {
		@Pc(10) Class14_Sub29 local10 = new Class14_Sub29(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			local13[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method5854(10);
		local10.method5861(local13[0]);
		local10.method5861(local13[1]);
		local10.method5861(local13[2]);
		local10.method5861(local13[3]);
		for (@Pc(60) int local60 = 0; local60 < 10; local60++) {
			local10.method5861((int) (Math.random() * 9.9999999E7D));
		}
		local10.method5859((int) (Math.random() * 9.9999999E7D));
		local10.method5851(Static604.aBigInteger11, Static315.aBigInteger6);
		arg0.aClass14_Sub29_Sub1_1.method5838(0, local10.aByteArray84, local10.anInt7264);
		return local13;
	}
}

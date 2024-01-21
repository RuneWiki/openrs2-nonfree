import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BBIXHJOC")
public class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!BBIXHJOC", name = "h", descriptor = "I")
	private static int anInt764 = 5;

	@OriginalMember(owner = "client!BBIXHJOC", name = "j", descriptor = "[Lclient!SWCSHRND;")
	public Class40[] aClass40Array10;

	@OriginalMember(owner = "client!BBIXHJOC", name = "i", descriptor = "I")
	private int anInt765 = 5;

	@OriginalMember(owner = "client!BBIXHJOC", name = "k", descriptor = "I")
	public int anInt766 = 1000;

	@OriginalMember(owner = "client!BBIXHJOC", name = "a", descriptor = "(IIIIIIIII)V")
	public void method508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class1_Sub1_Sub1_Sub4 local3 = this.method509(anInt764);
		if (local3 != null) {
			this.anInt766 = local3.anInt766;
			local3.method508(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!BBIXHJOC", name = "a", descriptor = "(I)Lclient!JLNSJQDR;")
	protected Class1_Sub1_Sub1_Sub4 method509(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < this.anInt765 || arg0 > this.anInt765) {
				for (@Pc(9) int local9 = 1; local9 > 0; local9++) {
				}
			}
			return null;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("92170, " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IWSGBTLV")
public class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!IWSGBTLV", name = "j", descriptor = "I")
	private static int anInt798 = -132;

	@OriginalMember(owner = "client!IWSGBTLV", name = "k", descriptor = "[Lclient!RXUUDUNX;")
	public Class30[] aClass30Array10;

	@OriginalMember(owner = "client!IWSGBTLV", name = "i", descriptor = "I")
	private int anInt797 = -33;

	@OriginalMember(owner = "client!IWSGBTLV", name = "l", descriptor = "I")
	public int anInt799 = 1000;

	@OriginalMember(owner = "client!IWSGBTLV", name = "a", descriptor = "(IIIIIIIII)V")
	public void method561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class3_Sub1_Sub1_Sub1 local3 = this.method562(anInt798);
		if (local3 != null) {
			this.anInt799 = local3.anInt799;
			local3.method561(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!IWSGBTLV", name = "a", descriptor = "(I)Lclient!CADBNSXE;")
	protected Class3_Sub1_Sub1_Sub1 method562(@OriginalArg(0) int arg0) {
		try {
			while (arg0 >= 0) {
				this.anInt797 = 458;
			}
			return null;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("66989, " + arg0 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}
}

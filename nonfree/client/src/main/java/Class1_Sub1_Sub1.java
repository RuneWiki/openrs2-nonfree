import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UCNHLGIK")
public class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!UCNHLGIK", name = "j", descriptor = "[Lclient!GHQPSUCN;")
	public Class11[] aClass11Array10;

	@OriginalMember(owner = "client!UCNHLGIK", name = "i", descriptor = "I")
	private int anInt715 = 47998;

	@OriginalMember(owner = "client!UCNHLGIK", name = "k", descriptor = "I")
	public int anInt716 = 1000;

	@OriginalMember(owner = "client!UCNHLGIK", name = "a", descriptor = "(IIIIIIIII)V")
	public void method503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.method504(822);
		if (local3 != null) {
			this.anInt716 = local3.anInt716;
			local3.method503(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!UCNHLGIK", name = "a", descriptor = "(I)Lclient!OJGAHFXC;")
	protected Class1_Sub1_Sub1_Sub5 method504(@OriginalArg(0) int arg0) {
		try {
			return null;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("82856, " + 822 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CYZGZTKE")
public class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!CYZGZTKE", name = "k", descriptor = "[Lclient!BRVNRJXX;")
	public Class5[] aClass5Array10;

	@OriginalMember(owner = "client!CYZGZTKE", name = "l", descriptor = "I")
	public int anInt670 = 1000;

	@OriginalMember(owner = "client!CYZGZTKE", name = "a", descriptor = "(IIIIIIIII)V")
	public void method447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class1_Sub1_Sub1_Sub4 local3 = this.method448();
		if (local3 != null) {
			this.anInt670 = local3.anInt670;
			local3.method447(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!CYZGZTKE", name = "a", descriptor = "(I)Lclient!LFTMDGKK;")
	protected Class1_Sub1_Sub1_Sub4 method448() {
		try {
			return null;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("46955, " + 0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}
}

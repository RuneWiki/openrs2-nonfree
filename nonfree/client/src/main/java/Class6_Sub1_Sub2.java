import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GHXFOOXU")
public class Class6_Sub1_Sub2 extends Class6_Sub1 {

	@OriginalMember(owner = "client!GHXFOOXU", name = "j", descriptor = "[Lclient!CEAXDMTD;")
	public Class4[] aClass4Array10;

	@OriginalMember(owner = "client!GHXFOOXU", name = "h", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!GHXFOOXU", name = "i", descriptor = "B")
	private byte aByte52 = 2;

	@OriginalMember(owner = "client!GHXFOOXU", name = "k", descriptor = "I")
	public int anInt738 = 1000;

	@OriginalMember(owner = "client!GHXFOOXU", name = "a", descriptor = "(IIIIIIIII)V")
	public void method521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class6_Sub1_Sub2_Sub2 local3 = this.method522((byte) 2);
		if (local3 != null) {
			this.anInt738 = local3.anInt738;
			local3.method521(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!GHXFOOXU", name = "a", descriptor = "(B)Lclient!FLXAIVEA;")
	protected Class6_Sub1_Sub2_Sub2 method522(@OriginalArg(0) byte arg0) {
		try {
			if (2 != this.aByte52) {
				this.aBoolean182 = !this.aBoolean182;
			}
			return null;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("34917, " + 2 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MODNYPGG")
public class Class6_Sub1_Sub2 extends Class6_Sub1 {

	@OriginalMember(owner = "client!MODNYPGG", name = "k", descriptor = "[Lclient!JSRLGUEA;")
	public Class19[] aClass19Array10;

	@OriginalMember(owner = "client!MODNYPGG", name = "j", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!MODNYPGG", name = "l", descriptor = "I")
	public int anInt640 = 1000;

	@OriginalMember(owner = "client!MODNYPGG", name = "a", descriptor = "(IIIIIIIII)V")
	public void method381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class6_Sub1_Sub2_Sub5 local3 = this.method382();
		if (local3 != null) {
			this.anInt640 = local3.anInt640;
			local3.method381(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!MODNYPGG", name = "a", descriptor = "(I)Lclient!NGYJLUVS;")
	protected Class6_Sub1_Sub2_Sub5 method382() {
		try {
			return null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("47797, " + -12617 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}

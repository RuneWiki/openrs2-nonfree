import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XBYIDFVN")
public class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!XBYIDFVN", name = "i", descriptor = "[Lclient!RSYMRWPZ;")
	public Class38[] aClass38Array10;

	@OriginalMember(owner = "client!XBYIDFVN", name = "h", descriptor = "I")
	private int anInt705 = 650;

	@OriginalMember(owner = "client!XBYIDFVN", name = "j", descriptor = "I")
	public int anInt706 = 1000;

	@OriginalMember(owner = "client!XBYIDFVN", name = "a", descriptor = "(IIIIIIIII)V")
	public void method496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class1_Sub1_Sub1_Sub4 local3 = this.method497((byte) 6);
		if (local3 != null) {
			this.anInt706 = local3.anInt706;
			local3.method496(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!XBYIDFVN", name = "a", descriptor = "(B)Lclient!PDVZPZLT;")
	protected Class1_Sub1_Sub1_Sub4 method497(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			return null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("32656, " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}
}

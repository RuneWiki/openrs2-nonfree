import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TFGCPINZ")
public class Class8_Sub1_Sub1 extends Class8_Sub1 {

	@OriginalMember(owner = "client!TFGCPINZ", name = "j", descriptor = "[Lclient!UJXOWZEU;")
	public Class42[] aClass42Array10;

	@OriginalMember(owner = "client!TFGCPINZ", name = "k", descriptor = "I")
	public int anInt786 = 1000;

	@OriginalMember(owner = "client!TFGCPINZ", name = "a", descriptor = "(IIIIIIIII)V")
	public void method532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class8_Sub1_Sub1_Sub5 local3 = this.method533((byte) 7);
		if (local3 != null) {
			this.anInt786 = local3.anInt786;
			local3.method532(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!TFGCPINZ", name = "a", descriptor = "(B)Lclient!JJMVUSJJ;")
	protected Class8_Sub1_Sub1_Sub5 method533(@OriginalArg(0) byte arg0) {
		try {
			return null;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("84948, " + 7 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DKQKXOQO")
public class Class3_Sub3_Sub2 extends Class3_Sub3 {

	@OriginalMember(owner = "client!DKQKXOQO", name = "j", descriptor = "[Lclient!WTVUTTQF;")
	public Class40[] aClass40Array10;

	@OriginalMember(owner = "client!DKQKXOQO", name = "i", descriptor = "Z")
	private boolean aBoolean179 = true;

	@OriginalMember(owner = "client!DKQKXOQO", name = "k", descriptor = "I")
	public int anInt793 = 1000;

	@OriginalMember(owner = "client!DKQKXOQO", name = "a", descriptor = "(IIIIIIIII)V")
	public void method524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class3_Sub3_Sub2_Sub3 local3 = this.method525();
		if (local3 != null) {
			this.anInt793 = local3.anInt793;
			local3.method524(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!DKQKXOQO", name = "a", descriptor = "(I)Lclient!FCIDIKVY;")
	protected Class3_Sub3_Sub2_Sub3 method525() {
		try {
			return null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("35439, " + 0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AOBGXKOU")
public class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!AOBGXKOU", name = "k", descriptor = "[Lclient!KCBBJKUN;")
	public Class24[] aClass24Array9;

	@OriginalMember(owner = "client!AOBGXKOU", name = "i", descriptor = "Z")
	private boolean aBoolean222 = true;

	@OriginalMember(owner = "client!AOBGXKOU", name = "j", descriptor = "Z")
	private boolean aBoolean223 = true;

	@OriginalMember(owner = "client!AOBGXKOU", name = "l", descriptor = "I")
	public int anInt732 = 1000;

	@OriginalMember(owner = "client!AOBGXKOU", name = "a", descriptor = "(IIIIIIIII)V")
	public void method504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class3_Sub1_Sub2_Sub6 local3 = this.method505();
		if (local3 != null) {
			this.anInt732 = local3.anInt732;
			local3.method504(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!AOBGXKOU", name = "a", descriptor = "(Z)Lclient!YABPKWWG;")
	protected Class3_Sub1_Sub2_Sub6 method505() {
		try {
			return null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("19607, " + true + ", " + local12.toString());
			throw new RuntimeException();
		}
	}
}

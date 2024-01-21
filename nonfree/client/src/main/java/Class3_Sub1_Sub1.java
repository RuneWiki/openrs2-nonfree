import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZJNSWWFY")
public class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ZJNSWWFY", name = "i", descriptor = "[Lclient!DZBHNAUV;")
	public Class4[] aClass4Array10;

	@OriginalMember(owner = "client!ZJNSWWFY", name = "h", descriptor = "Z")
	private boolean aBoolean183 = true;

	@OriginalMember(owner = "client!ZJNSWWFY", name = "j", descriptor = "I")
	public int anInt709 = 1000;

	@OriginalMember(owner = "client!ZJNSWWFY", name = "a", descriptor = "(IIIIIIIII)V")
	public void method534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class3_Sub1_Sub1_Sub1 local3 = this.method535();
		if (local3 != null) {
			this.anInt709 = local3.anInt709;
			local3.method534(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!ZJNSWWFY", name = "a", descriptor = "(Z)Lclient!CSGBDGDY;")
	protected Class3_Sub1_Sub1_Sub1 method535() {
		try {
			return null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("23, " + true + ", " + local12.toString());
			throw new RuntimeException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public abstract class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ea", name = "bb", descriptor = "I")
	public int anInt1974 = 1000;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(Z)Lclient!hb;")
	protected Class2_Sub1_Sub4_Sub5 method1264() {
		return null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class2_Sub1_Sub4_Sub5 local7 = this.method1264();
		if (local7 != null) {
			this.anInt1974 = local7.anInt1974;
			local7.method1265(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}
}

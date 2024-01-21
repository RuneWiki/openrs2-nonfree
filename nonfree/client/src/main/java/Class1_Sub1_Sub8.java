import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public abstract class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kd", name = "ab", descriptor = "I")
	public int anInt2716 = 1000;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)Lclient!pc;")
	protected Class1_Sub1_Sub8_Sub3 method1835() {
		return null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class1_Sub1_Sub8_Sub3 local3 = this.method1835();
		if (local3 != null) {
			this.anInt2716 = local3.anInt2716;
			local3.method1840(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}
}

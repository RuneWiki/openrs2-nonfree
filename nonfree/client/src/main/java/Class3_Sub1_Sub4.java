import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public abstract class Class3_Sub1_Sub4 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ed", name = "Y", descriptor = "S")
	public short aShort32 = -32768;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIII)V")
	public void method2260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class3_Sub1_Sub4_Sub5 local7 = this.method2261();
		if (local7 != null) {
			local7.method2260(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.aShort32 = local7.aShort32;
		}
	}

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "(I)Lclient!o;")
	protected Class3_Sub1_Sub4_Sub5 method2261() {
		return null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "Z")
	public boolean aBoolean632;

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "Lclient!gda;")
	public Class3_Sub1 aClass3_Sub1_21;

	@OriginalMember(owner = "client!rk", name = "t", descriptor = "[Lclient!gca;")
	public Class3_Sub4[] aClass3_Sub4Array1;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILclient!ha;II)Z")
	public boolean method7042(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = this.aClass3_Sub1_21.method8493();
		if (this.aClass3_Sub4Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass3_Sub4Array1.length; local15++) {
				this.aClass3_Sub4Array1[local15].anInt3112 <<= local10;
				if (this.aClass3_Sub4Array1[local15].method2891(arg0, arg2) && this.aClass3_Sub1_21.method8488(arg0, arg2, arg1)) {
					this.aClass3_Sub4Array1[local15].anInt3112 >>= local10;
					return true;
				}
				this.aClass3_Sub4Array1[local15].anInt3112 >>= local10;
			}
		}
		return false;
	}
}

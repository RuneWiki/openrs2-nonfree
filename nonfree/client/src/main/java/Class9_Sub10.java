import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class9_Sub10 extends Class9 {

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "[Lclient!kia;")
	public Class9_Sub5[] aClass9_Sub5Array1;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "Lclient!uq;")
	public Class9_Sub2 aClass9_Sub2_22;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "Z")
	public boolean aBoolean698;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!ha;BI)Z")
	public boolean method7967(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = this.aClass9_Sub2_22.method8599();
		if (this.aClass9_Sub5Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass9_Sub5Array1.length; local15++) {
				this.aClass9_Sub5Array1[local15].anInt5913 <<= local10;
				if (this.aClass9_Sub5Array1[local15].method5103(arg0, arg2) && this.aClass9_Sub2_22.method8605(arg0, arg1, arg2)) {
					this.aClass9_Sub5Array1[local15].anInt5913 >>= local10;
					return true;
				}
				this.aClass9_Sub5Array1[local15].anInt5913 >>= local10;
			}
		}
		return false;
	}
}

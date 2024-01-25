import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "Lclient!mb;")
	public Class2_Sub3 aClass2_Sub3_9;

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "Z")
	public boolean aBoolean455;

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "[Lclient!fda;")
	public Class2_Sub5[] aClass2_Sub5Array1;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIILclient!ha;)Z")
	public boolean method4385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(10) int local10 = this.aClass2_Sub3_9.method8578();
		if (this.aClass2_Sub5Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass2_Sub5Array1.length; local15++) {
				this.aClass2_Sub5Array1[local15].anInt3616 <<= local10;
				if (this.aClass2_Sub5Array1[local15].method3182(arg0, arg1) && this.aClass2_Sub3_9.method8573(arg0, arg1, arg2)) {
					this.aClass2_Sub5Array1[local15].anInt3616 >>= local10;
					return true;
				}
				this.aClass2_Sub5Array1[local15].anInt3616 >>= local10;
			}
		}
		return false;
	}
}

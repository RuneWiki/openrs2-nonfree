import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class4_Sub6 extends Class4 {

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "Lclient!ov;")
	public Class4_Sub2 aClass4_Sub2_9;

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "Z")
	public boolean aBoolean220;

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "[Lclient!qw;")
	public Class4_Sub9[] aClass4_Sub9Array1;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILclient!ha;B)Z")
	public boolean method2723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2) {
		@Pc(10) int local10 = this.aClass4_Sub2_9.method8716();
		if (this.aClass4_Sub9Array1 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.aClass4_Sub9Array1.length; local21++) {
				this.aClass4_Sub9Array1[local21].anInt7894 <<= local10;
				if (this.aClass4_Sub9Array1[local21].method6948(arg1, arg0) && this.aClass4_Sub2_9.method8724(arg1, arg0, arg2)) {
					this.aClass4_Sub9Array1[local21].anInt7894 >>= local10;
					return true;
				}
				this.aClass4_Sub9Array1[local21].anInt7894 >>= local10;
			}
		}
		return false;
	}
}

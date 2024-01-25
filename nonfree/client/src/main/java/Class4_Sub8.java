import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class4_Sub8 extends Class4 {

	@OriginalMember(owner = "client!iaa", name = "j", descriptor = "[Lclient!fa;")
	public Class4_Sub6[] aClass4_Sub6Array1;

	@OriginalMember(owner = "client!iaa", name = "k", descriptor = "Z")
	public boolean aBoolean360;

	@OriginalMember(owner = "client!iaa", name = "h", descriptor = "Lclient!tl;")
	public Class4_Sub2 aClass4_Sub2_13;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILclient!ha;BI)Z")
	public boolean method3682(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = this.aClass4_Sub2_13.method8979(65535);
		if (this.aClass4_Sub6Array1 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.aClass4_Sub6Array1.length; local21++) {
				this.aClass4_Sub6Array1[local21].anInt2723 <<= local16;
				if (this.aClass4_Sub6Array1[local21].method2384(arg0, arg2) && this.aClass4_Sub2_13.method8980(arg1, arg0, -11191, arg2)) {
					this.aClass4_Sub6Array1[local21].anInt2723 >>= local16;
					return true;
				}
				this.aClass4_Sub6Array1[local21].anInt2723 >>= local16;
			}
		}
		return false;
	}
}

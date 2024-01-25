import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class9_Sub6 extends Class9 {

	@OriginalMember(owner = "client!nk", name = "o", descriptor = "Lclient!ee;")
	public Class9_Sub1 aClass9_Sub1_18;

	@OriginalMember(owner = "client!nk", name = "s", descriptor = "Z")
	public boolean aBoolean452;

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "[Lclient!ve;")
	public Class9_Sub9[] aClass9_Sub9Array1;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZLclient!ha;II)Z")
	public boolean method5893(@OriginalArg(1) Class22 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = this.aClass9_Sub1_18.method9088();
		if (this.aClass9_Sub9Array1 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.aClass9_Sub9Array1.length; local21++) {
				this.aClass9_Sub9Array1[local21].anInt10620 <<= local16;
				if (this.aClass9_Sub9Array1[local21].method9029(arg2, arg1) && this.aClass9_Sub1_18.method9089(arg0, arg2, arg1)) {
					this.aClass9_Sub9Array1[local21].anInt10620 >>= local16;
					return true;
				}
				this.aClass9_Sub9Array1[local21].anInt10620 >>= local16;
			}
		}
		return false;
	}
}

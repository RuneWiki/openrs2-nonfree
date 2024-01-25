import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "[Lclient!lda;")
	public Class9_Sub6[] aClass9_Sub6Array1;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "Lclient!gg;")
	public Class9_Sub4 aClass9_Sub4_1;

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "Z")
	public boolean aBoolean82;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!ha;III)Z")
	public boolean method797(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(18) int local18 = this.aClass9_Sub4_1.method8421();
		if (this.aClass9_Sub6Array1 != null) {
			for (@Pc(23) int local23 = 0; local23 < this.aClass9_Sub6Array1.length; local23++) {
				this.aClass9_Sub6Array1[local23].anInt6269 <<= local18;
				if (this.aClass9_Sub6Array1[local23].method5258(arg1, arg2) && this.aClass9_Sub4_1.method8411(arg1, arg0, arg2)) {
					this.aClass9_Sub6Array1[local23].anInt6269 >>= local18;
					return true;
				}
				this.aClass9_Sub6Array1[local23].anInt6269 >>= local18;
			}
		}
		return false;
	}
}

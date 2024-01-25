import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lba")
public final class Class15_Sub7 extends Class15 {

	@OriginalMember(owner = "client!lba", name = "k", descriptor = "Lclient!rr;")
	public Class15_Sub1 aClass15_Sub1_14;

	@OriginalMember(owner = "client!lba", name = "l", descriptor = "Z")
	public boolean aBoolean429;

	@OriginalMember(owner = "client!lba", name = "o", descriptor = "[Lclient!im;")
	public Class15_Sub6[] aClass15_Sub6Array1;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIILclient!ha;)Z")
	public boolean method4914(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class16 arg2) {
		@Pc(10) int local10 = this.aClass15_Sub1_14.method8321();
		if (this.aClass15_Sub6Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass15_Sub6Array1.length; local15++) {
				this.aClass15_Sub6Array1[local15].anInt5264 <<= local10;
				if (this.aClass15_Sub6Array1[local15].method4302(arg1, arg0) && this.aClass15_Sub1_14.method8316(arg1, arg0, arg2)) {
					this.aClass15_Sub6Array1[local15].anInt5264 >>= local10;
					return true;
				}
				this.aClass15_Sub6Array1[local15].anInt5264 >>= local10;
			}
		}
		return false;
	}
}

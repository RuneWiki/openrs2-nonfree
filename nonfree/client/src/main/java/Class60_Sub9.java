import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class60_Sub9 extends Class60 {

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "Z")
	public boolean aBoolean668;

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "Lclient!rfa;")
	public Class60_Sub1 aClass60_Sub1_21;

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "[Lclient!wha;")
	public Class60_Sub10[] aClass60_Sub10Array1;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!ha;III)Z")
	public boolean method7678(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = this.aClass60_Sub1_21.method7916();
		if (this.aClass60_Sub10Array1 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.aClass60_Sub10Array1.length; local21++) {
				this.aClass60_Sub10Array1[local21].anInt10339 <<= local16;
				if (this.aClass60_Sub10Array1[local21].method8918(arg1, arg2) && this.aClass60_Sub1_21.method7927(arg0, arg2, arg1)) {
					this.aClass60_Sub10Array1[local21].anInt10339 >>= local16;
					return true;
				}
				this.aClass60_Sub10Array1[local21].anInt10339 >>= local16;
			}
		}
		return false;
	}
}

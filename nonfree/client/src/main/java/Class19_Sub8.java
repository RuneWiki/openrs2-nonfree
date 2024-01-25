import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mla")
public final class Class19_Sub8 extends Class19 {

	@OriginalMember(owner = "client!mla", name = "d", descriptor = "Lclient!bla;")
	public Class19_Sub1 aClass19_Sub1_16;

	@OriginalMember(owner = "client!mla", name = "e", descriptor = "Z")
	public boolean aBoolean559;

	@OriginalMember(owner = "client!mla", name = "f", descriptor = "[Lclient!laa;")
	public Class19_Sub6[] aClass19_Sub6Array1;

	@OriginalMember(owner = "client!mla", name = "a", descriptor = "(IILclient!ha;I)Z")
	public boolean method5985(@OriginalArg(0) int arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = this.aClass19_Sub1_16.method9362();
		if (this.aClass19_Sub6Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass19_Sub6Array1.length; local15++) {
				this.aClass19_Sub6Array1[local15].anInt5949 <<= local10;
				if (this.aClass19_Sub6Array1[local15].method5062(arg0, arg2) && this.aClass19_Sub1_16.method9369(arg2, arg1, arg0)) {
					this.aClass19_Sub6Array1[local15].anInt5949 >>= local10;
					return true;
				}
				this.aClass19_Sub6Array1[local15].anInt5949 >>= local10;
			}
		}
		return false;
	}
}

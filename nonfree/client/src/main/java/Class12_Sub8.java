import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public final class Class12_Sub8 extends Class12 {

	@OriginalMember(owner = "client!maa", name = "j", descriptor = "Z")
	public boolean aBoolean459;

	@OriginalMember(owner = "client!maa", name = "k", descriptor = "Lclient!je;")
	public Class12_Sub2 aClass12_Sub2_15;

	@OriginalMember(owner = "client!maa", name = "o", descriptor = "[Lclient!ag;")
	public Class12_Sub1[] aClass12_Sub1Array1;

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IILclient!ha;I)Z")
	public boolean method5353(@OriginalArg(0) int arg0, @OriginalArg(2) Class137 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = this.aClass12_Sub2_15.method9153();
		if (this.aClass12_Sub1Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass12_Sub1Array1.length; local15++) {
				this.aClass12_Sub1Array1[local15].anInt81 <<= local10;
				if (this.aClass12_Sub1Array1[local15].method76(arg2, arg0) && this.aClass12_Sub2_15.method9154(arg2, arg0, arg1)) {
					this.aClass12_Sub1Array1[local15].anInt81 >>= local10;
					return true;
				}
				this.aClass12_Sub1Array1[local15].anInt81 >>= local10;
			}
		}
		return false;
	}
}

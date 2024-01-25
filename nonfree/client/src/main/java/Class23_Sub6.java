import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hga")
public final class Class23_Sub6 extends Class23 {

	@OriginalMember(owner = "client!hga", name = "g", descriptor = "[Lclient!eea;")
	public Class23_Sub4[] aClass23_Sub4Array1;

	@OriginalMember(owner = "client!hga", name = "h", descriptor = "Lclient!cn;")
	public Class23_Sub2 aClass23_Sub2_10;

	@OriginalMember(owner = "client!hga", name = "j", descriptor = "Z")
	public boolean aBoolean307;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILclient!ha;II)Z")
	public boolean method3462(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = this.aClass23_Sub2_10.method8605();
		if (this.aClass23_Sub4Array1 != null) {
			for (@Pc(19) int local19 = 0; local19 < this.aClass23_Sub4Array1.length; local19++) {
				this.aClass23_Sub4Array1[local19].anInt2466 <<= local10;
				if (this.aClass23_Sub4Array1[local19].method2264(arg2, arg0) && this.aClass23_Sub2_10.method8600(arg1, arg2, arg0)) {
					this.aClass23_Sub4Array1[local19].anInt2466 >>= local10;
					return true;
				}
				this.aClass23_Sub4Array1[local19].anInt2466 >>= local10;
			}
		}
		return false;
	}
}

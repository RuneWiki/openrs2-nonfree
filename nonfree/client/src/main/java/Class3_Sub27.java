import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class Class3_Sub27 extends Class3 {

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
	public int anInt3893 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
	public int anInt3896 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
	public int anInt3899 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
	public int anInt3900 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
	public int anInt3897 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
	public int anInt3898 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
	public int anInt3903 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
	public int anInt3904 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "Lclient!vr;")
	public final Class3_Sub41 aClass3_Sub41_1;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!vr;)V")
	public Class3_Sub27(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aClass3_Sub41_1 = arg0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBI)Z")
	public boolean method3675(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt3897 <= arg1 && this.anInt3893 >= arg1 && arg0 >= this.anInt3903 && arg0 <= this.anInt3898) {
			return true;
		} else {
			return arg1 >= this.anInt3904 && arg1 <= this.anInt3896 && arg0 >= this.anInt3899 && arg0 <= this.anInt3900;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
	public int anInt165 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
	public int anInt168 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
	public int anInt166 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
	public int anInt170 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
	public int anInt167 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
	public int anInt174 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
	public int anInt173 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
	public int anInt164 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ai", name = "x", descriptor = "Lclient!tj;")
	public final Class7_Sub37 aClass7_Sub37_1;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!tj;)V")
	public Class7_Sub2(@OriginalArg(0) Class7_Sub37 arg0) {
		this.aClass7_Sub37_1 = arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)Z")
	public boolean method152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt165 <= arg1 && this.anInt166 >= arg1 && arg0 >= this.anInt174 && this.anInt167 >= arg0) {
			return true;
		} else {
			return arg1 >= this.anInt170 && arg1 <= this.anInt164 && arg0 >= this.anInt173 && arg0 <= this.anInt168;
		}
	}
}

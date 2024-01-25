import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public final class Class109 {

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "Lclient!gl;")
	public Class109 aClass109_1;

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "Lclient!q;")
	public Class205 aClass205_4;

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
	public int anInt3778;

	@OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
	public int anInt3779;

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
	public int anInt3780;

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
	public final int anInt3774;

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
	public final int anInt3776;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(II)V")
	public Class109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3774 = arg0;
		this.anInt3776 = arg1;
	}

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!gl;I)V")
	public Class109(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1) {
		this.aClass109_1 = arg0;
		this.anInt3776 = arg1 + this.aClass109_1.anInt3776;
		this.aClass205_4 = this.aClass109_1.aClass205_4;
		this.anInt3774 = this.aClass109_1.anInt3774;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)Lclient!em;")
	public Class75 method3130() {
		return Static352.method5552(this.anInt3774);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)Lclient!gl;")
	public Class109 method3132(@OriginalArg(1) int arg0) {
		return new Class109(this.anInt3774, arg0);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!mn", name = "q", descriptor = "I")
	public int anInt3983 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
	public int anInt3984 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!mn", name = "z", descriptor = "I")
	public int anInt3992 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
	public int anInt3985 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
	public int anInt3982 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
	public int anInt3987 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!mn", name = "w", descriptor = "I")
	public int anInt3989 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!mn", name = "y", descriptor = "I")
	public int anInt3991 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!mn", name = "o", descriptor = "Lclient!ne;")
	public final Class1_Sub25 aClass1_Sub25_1;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!ne;)V")
	public Class1_Sub22(@OriginalArg(0) Class1_Sub25 arg0) {
		this.aClass1_Sub25_1 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBI)Z")
	public boolean method3694(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt3989 <= arg0 && arg0 <= this.anInt3983 && arg1 >= this.anInt3987 && this.anInt3992 >= arg1) {
			return true;
		} else {
			return this.anInt3985 <= arg0 && arg0 <= this.anInt3991 && this.anInt3982 <= arg1 && arg1 <= this.anInt3984;
		}
	}
}

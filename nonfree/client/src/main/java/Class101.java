import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public final class Class101 {

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	public int anInt3053;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "Lclient!jc;")
	public Class101 aClass101_2;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
	public int anInt3057;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "Lclient!pg;")
	public Class51 aClass51_2;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	public int anInt3058;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	public final int anInt3055;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	public final int anInt3054;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(II)V")
	public Class101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3055 = arg0;
		this.anInt3054 = arg1;
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!jc;I)V")
	public Class101(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1) {
		this.aClass101_2 = arg0;
		this.anInt3055 = this.aClass101_2.anInt3055;
		this.anInt3054 = this.aClass101_2.anInt3054 + arg1;
		this.aClass51_2 = this.aClass101_2.aClass51_2;
	}
}

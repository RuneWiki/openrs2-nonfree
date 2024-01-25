import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public final class Class112 {

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
	public int anInt3026;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
	public int anInt3027;

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
	public int anInt3029;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
	public int anInt3030;

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
	public int anInt3031;

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "Lclient!jq;")
	public Class112 aClass112_2;

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
	public int anInt3034;

	@OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
	public int anInt3035;

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
	public int anInt3036;

	@OriginalMember(owner = "client!jq", name = "r", descriptor = "I")
	public int anInt3037;

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
	public final int anInt3028;

	@OriginalMember(owner = "client!jq", name = "q", descriptor = "B")
	public final byte aByte26;

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
	public final int anInt3033;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
	public final int anInt3024;

	@OriginalMember(owner = "client!jq", name = "s", descriptor = "I")
	public final int anInt3038;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(IIIIB)V")
	public Class112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt3028 = arg3;
		this.aByte26 = arg4;
		this.anInt3033 = arg2;
		this.anInt3024 = arg1;
		this.anInt3038 = arg0;
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!jq;I)V")
	public Class112(@OriginalArg(0) Class112 arg0, @OriginalArg(1) int arg1) {
		this.aClass112_2 = arg0;
		this.anInt3033 = this.aClass112_2.anInt3033 + arg1;
		this.aByte26 = this.aClass112_2.aByte26;
		this.anInt3028 = arg1 + this.aClass112_2.anInt3028;
		this.anInt3024 = arg1 + this.aClass112_2.anInt3024;
		this.anInt3038 = this.aClass112_2.anInt3038;
	}
}

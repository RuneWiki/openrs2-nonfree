import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public final class Class121 {

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
	public int anInt3042;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
	public int anInt3043;

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
	public int anInt3044;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
	public int anInt3045;

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
	public int anInt3047;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
	public int anInt3049;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
	public int anInt3050;

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
	public int anInt3051;

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
	public int anInt3052;

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
	public int anInt3053;

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
	public int anInt3054;

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
	public int anInt3056;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!gi;)Z")
	public boolean method2582(@OriginalArg(1) Class121 arg0) {
		return arg0.anInt3044 == this.anInt3044 && this.anInt3050 == arg0.anInt3050 && arg0.anInt3047 == this.anInt3047;
	}
}

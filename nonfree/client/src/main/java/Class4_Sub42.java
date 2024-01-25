import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public final class Class4_Sub42 extends Class4 {

	@OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
	private final int anInt6197;

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
	public final int anInt6190;

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
	private final int anInt6188;

	@OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
	private final int anInt6205;

	@OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
	private final int anInt6200;

	@OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
	public final int anInt6199;

	@OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
	public final int anInt6194;

	@OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
	public final int anInt6204;

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
	private final int anInt6189;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class4_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt6197 = arg3;
		this.anInt6190 = arg7;
		this.anInt6188 = arg4;
		this.anInt6205 = arg1;
		this.anInt6200 = arg2;
		this.anInt6199 = arg5;
		this.anInt6194 = arg6;
		this.anInt6204 = arg8;
		this.anInt6189 = arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)Z")
	public boolean method5258(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt6199 <= arg0 && this.anInt6190 >= arg0 && arg1 >= this.anInt6194 && arg1 <= this.anInt6204;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II[II)V")
	public void method5259(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[2] = this.anInt6194 + arg2 - this.anInt6200;
		arg1[0] = 0;
		arg1[1] = arg0 + this.anInt6199 - this.anInt6205;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIII)Z")
	public boolean method5260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg1 == this.anInt6189 && arg2 >= this.anInt6205 && this.anInt6197 >= arg2 && this.anInt6200 <= arg0 && this.anInt6188 >= arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "([IIIB)V")
	public void method5261(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0[0] = this.anInt6189;
		arg0[1] = arg2 + this.anInt6205 - this.anInt6199;
		arg0[2] = this.anInt6200 + arg1 - this.anInt6194;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BII)Z")
	public boolean method5262(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt6205 <= arg0 && this.anInt6197 >= arg0 && this.anInt6200 <= arg1 && arg1 <= this.anInt6188;
	}
}

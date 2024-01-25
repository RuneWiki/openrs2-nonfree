import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public final class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!bfa", name = "n", descriptor = "I")
	private final int anInt963;

	@OriginalMember(owner = "client!bfa", name = "B", descriptor = "I")
	public final int anInt976;

	@OriginalMember(owner = "client!bfa", name = "z", descriptor = "I")
	public final int anInt974;

	@OriginalMember(owner = "client!bfa", name = "p", descriptor = "I")
	public final int anInt965;

	@OriginalMember(owner = "client!bfa", name = "v", descriptor = "I")
	private final int anInt971;

	@OriginalMember(owner = "client!bfa", name = "s", descriptor = "I")
	private final int anInt968;

	@OriginalMember(owner = "client!bfa", name = "w", descriptor = "I")
	private final int anInt972;

	@OriginalMember(owner = "client!bfa", name = "C", descriptor = "I")
	public final int anInt977;

	@OriginalMember(owner = "client!bfa", name = "A", descriptor = "I")
	private final int anInt975;

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt963 = arg0;
		this.anInt976 = arg8;
		this.anInt974 = arg7;
		this.anInt965 = arg6;
		this.anInt971 = arg1;
		this.anInt968 = arg3;
		this.anInt972 = arg4;
		this.anInt977 = arg5;
		this.anInt975 = arg2;
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(BII)Z")
	public boolean method1068(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt971 && this.anInt968 >= arg1 && arg0 >= this.anInt975 && this.anInt972 >= arg0;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(III[I)V")
	public void method1069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[1] = arg0 + this.anInt971 - this.anInt977;
		arg2[2] = this.anInt975 + arg1 - this.anInt965;
		arg2[0] = this.anInt963;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IZI)Z")
	public boolean method1070(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt977 && arg1 <= this.anInt974 && arg0 >= this.anInt965 && this.anInt976 >= arg0;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B[III)V")
	public void method1071(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[2] = arg2 + this.anInt965 - this.anInt975;
		arg0[1] = this.anInt977 + arg1 - this.anInt971;
		arg0[0] = 0;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(BIII)Z")
	public boolean method1074(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt963 == arg2 && arg1 >= this.anInt971 && arg1 <= this.anInt968 && arg0 >= this.anInt975 && arg0 <= this.anInt972;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public final class Class3_Sub44 extends Class3 {

	@OriginalMember(owner = "client!vt", name = "u", descriptor = "I")
	public final int anInt7387;

	@OriginalMember(owner = "client!vt", name = "G", descriptor = "I")
	public final int anInt7395;

	@OriginalMember(owner = "client!vt", name = "q", descriptor = "I")
	private final int anInt7384;

	@OriginalMember(owner = "client!vt", name = "m", descriptor = "I")
	private final int anInt7380;

	@OriginalMember(owner = "client!vt", name = "w", descriptor = "I")
	private final int anInt7389;

	@OriginalMember(owner = "client!vt", name = "t", descriptor = "I")
	public final int anInt7386;

	@OriginalMember(owner = "client!vt", name = "p", descriptor = "I")
	public final int anInt7383;

	@OriginalMember(owner = "client!vt", name = "F", descriptor = "I")
	private final int anInt7394;

	@OriginalMember(owner = "client!vt", name = "r", descriptor = "I")
	private final int anInt7385;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class3_Sub44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt7387 = arg8;
		this.anInt7395 = arg7;
		this.anInt7384 = arg3;
		this.anInt7380 = arg0;
		this.anInt7389 = arg4;
		this.anInt7386 = arg6;
		this.anInt7383 = arg5;
		this.anInt7394 = arg2;
		this.anInt7385 = arg1;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(III[I)V")
	public void method5741(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[1] = arg0 + this.anInt7383 - this.anInt7385;
		arg2[0] = 0;
		arg2[2] = this.anInt7386 + arg1 - this.anInt7394;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIII)Z")
	public boolean method5743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 == this.anInt7380 && arg2 >= this.anInt7385 && arg2 <= this.anInt7384 && this.anInt7394 <= arg1 && arg1 <= this.anInt7389;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IZI)Z")
	public boolean method5744(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt7383 && this.anInt7395 >= arg1 && arg0 >= this.anInt7386 && this.anInt7387 >= arg0;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II[IZ)V")
	public void method5745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[2] = arg0 + this.anInt7394 - this.anInt7386;
		arg2[1] = this.anInt7385 + arg1 - this.anInt7383;
		arg2[0] = this.anInt7380;
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(IIB)Z")
	public boolean method5746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= this.anInt7385 && arg1 <= this.anInt7384 && arg0 >= this.anInt7394 && this.anInt7389 >= arg0;
	}
}

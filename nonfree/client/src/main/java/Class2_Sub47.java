import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class2_Sub47 extends Class2 {

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
	public final int anInt8704;

	@OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
	public final int anInt8711;

	@OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
	private final int anInt8709;

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
	private final int anInt8702;

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
	public final int anInt8707;

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
	private final int anInt8706;

	@OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
	private final int anInt8713;

	@OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
	private final int anInt8710;

	@OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
	public final int anInt8716;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class2_Sub47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt8704 = arg8;
		this.anInt8711 = arg7;
		this.anInt8709 = arg4;
		this.anInt8702 = arg2;
		this.anInt8707 = arg6;
		this.anInt8706 = arg1;
		this.anInt8713 = arg3;
		this.anInt8710 = arg0;
		this.anInt8716 = arg5;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)Z")
	public boolean method7298(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt8716 <= arg1 && this.anInt8711 >= arg1 && this.anInt8707 <= arg0 && arg0 <= this.anInt8704;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I[III)V")
	public void method7299(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[0] = this.anInt8710;
		arg1[1] = arg2 + this.anInt8706 - this.anInt8716;
		arg1[2] = this.anInt8702 + arg0 - this.anInt8707;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIB[I)V")
	public void method7300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[1] = arg1 + this.anInt8716 - this.anInt8706;
		arg2[2] = this.anInt8707 + arg0 - this.anInt8702;
		arg2[0] = 0;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(III)Z")
	public boolean method7301(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt8706 && this.anInt8713 >= arg1 && arg0 >= this.anInt8702 && this.anInt8709 >= arg0;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIII)Z")
	public boolean method7302(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg2 == this.anInt8710 && arg0 >= this.anInt8706 && this.anInt8713 >= arg0 && this.anInt8702 <= arg1 && this.anInt8709 >= arg1;
	}
}

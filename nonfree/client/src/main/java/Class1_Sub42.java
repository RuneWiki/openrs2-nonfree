import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public final class Class1_Sub42 extends Class1 {

	@OriginalMember(owner = "client!rt", name = "w", descriptor = "I")
	private final int anInt7919;

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
	public final int anInt7907;

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
	public final int anInt7909;

	@OriginalMember(owner = "client!rt", name = "p", descriptor = "I")
	public final int anInt7912;

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
	private final int anInt7905;

	@OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
	public final int anInt7915;

	@OriginalMember(owner = "client!rt", name = "u", descriptor = "I")
	private final int anInt7917;

	@OriginalMember(owner = "client!rt", name = "v", descriptor = "I")
	private final int anInt7918;

	@OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
	private final int anInt7914;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt7919 = arg3;
		this.anInt7907 = arg7;
		this.anInt7909 = arg8;
		this.anInt7912 = arg5;
		this.anInt7905 = arg0;
		this.anInt7915 = arg6;
		this.anInt7917 = arg4;
		this.anInt7918 = arg1;
		this.anInt7914 = arg2;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "([IBII)V")
	public void method6591(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = arg2 + this.anInt7912 - this.anInt7918;
		arg0[2] = this.anInt7915 + arg1 - this.anInt7914;
		arg0[0] = 0;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BII)Z")
	public boolean method6592(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt7912 <= arg0 && arg0 <= this.anInt7907 && this.anInt7915 <= arg1 && this.anInt7909 >= arg1;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)Z")
	public boolean method6593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt7918 && arg0 <= this.anInt7919 && this.anInt7914 <= arg1 && this.anInt7917 >= arg1;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIZI)Z")
	public boolean method6594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg0 == this.anInt7905 && arg2 >= this.anInt7918 && arg2 <= this.anInt7919 && arg1 >= this.anInt7914 && arg1 <= this.anInt7917;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I[III)V")
	public void method6595(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = this.anInt7918 + arg1 - this.anInt7912;
		arg0[0] = this.anInt7905;
		arg0[2] = arg2 + this.anInt7914 - this.anInt7915;
	}
}

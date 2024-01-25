import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class Class5_Sub48 extends Class5 {

	@OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
	public int anInt8588 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
	public int anInt8584 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
	public int anInt8582 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
	public int anInt8590 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
	public int anInt8589 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
	public int anInt8586 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rk", name = "z", descriptor = "I")
	public int anInt8593 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
	public int anInt8594 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "Lclient!kj;")
	public final Class5_Sub36 aClass5_Sub36_1;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!kj;)V")
	public Class5_Sub48(@OriginalArg(0) Class5_Sub36 arg0) {
		this.aClass5_Sub36_1 = arg0;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIB)Z")
	public boolean method7314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= this.anInt8586 && arg1 <= this.anInt8590 && arg0 >= this.anInt8594 && arg0 <= this.anInt8584) {
			return true;
		} else {
			return arg1 >= this.anInt8582 && this.anInt8588 >= arg1 && this.anInt8589 <= arg0 && arg0 <= this.anInt8593;
		}
	}
}

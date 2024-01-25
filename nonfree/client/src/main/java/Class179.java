import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public final class Class179 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "I")
	public int anInt4621;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "I")
	public int anInt4622;

	@OriginalMember(owner = "client!od", name = "h", descriptor = "I")
	public int anInt4626;

	@OriginalMember(owner = "client!od", name = "i", descriptor = "I")
	public int anInt4627;

	@OriginalMember(owner = "client!od", name = "l", descriptor = "Lclient!od;")
	public Class179 aClass179_1;

	@OriginalMember(owner = "client!od", name = "o", descriptor = "I")
	public int anInt4632;

	@OriginalMember(owner = "client!od", name = "p", descriptor = "I")
	public int anInt4633;

	@OriginalMember(owner = "client!od", name = "q", descriptor = "I")
	public int anInt4634;

	@OriginalMember(owner = "client!od", name = "s", descriptor = "I")
	public int anInt4636;

	@OriginalMember(owner = "client!od", name = "t", descriptor = "I")
	public int anInt4637;

	@OriginalMember(owner = "client!od", name = "j", descriptor = "I")
	public final int anInt4628;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "I")
	private final int anInt4631;

	@OriginalMember(owner = "client!od", name = "u", descriptor = "I")
	public final int anInt4638;

	@OriginalMember(owner = "client!od", name = "f", descriptor = "B")
	public final byte aByte57;

	@OriginalMember(owner = "client!od", name = "e", descriptor = "I")
	public final int anInt4624;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIIB)V")
	public Class179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt4628 = arg1;
		this.anInt4631 = arg0;
		this.anInt4638 = arg3;
		this.aByte57 = arg4;
		this.anInt4624 = arg2;
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!od;I)V")
	public Class179(@OriginalArg(0) Class179 arg0, @OriginalArg(1) int arg1) {
		this.aClass179_1 = arg0;
		this.aByte57 = this.aClass179_1.aByte57;
		this.anInt4628 = this.aClass179_1.anInt4628 + arg1;
		this.anInt4624 = this.aClass179_1.anInt4624 + arg1;
		this.anInt4631 = this.aClass179_1.anInt4631;
		this.anInt4638 = this.aClass179_1.anInt4638 + arg1;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IBII)Lclient!od;")
	public Class179 method3673(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class179(this.anInt4631, arg0, arg1, arg2, this.aByte57);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)Lclient!lv;")
	public Class156 method3676() {
		return Static216.method2865(this.anInt4631);
	}
}

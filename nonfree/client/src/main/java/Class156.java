import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class156 {

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
	public int anInt4584;

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
	public int anInt4587;

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
	public int anInt4590;

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "Lclient!hl;")
	public Class156 aClass156_2;

	@OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
	public int anInt4592;

	@OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
	public int anInt4594;

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
	public int anInt4595;

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
	public int anInt4596;

	@OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
	public int anInt4598;

	@OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
	public int anInt4599;

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
	private final int anInt4591;

	@OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
	public final int anInt4586;

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
	public final int anInt4597;

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
	public final int anInt4588;

	@OriginalMember(owner = "client!hl", name = "s", descriptor = "B")
	public final byte aByte85;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(IIIIB)V")
	public Class156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt4591 = arg0;
		this.anInt4586 = arg2;
		this.anInt4597 = arg1;
		this.anInt4588 = arg3;
		this.aByte85 = arg4;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII)Lclient!hl;")
	public Class156 method3752(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class156(this.anInt4591, arg2, arg0, arg1, this.aByte85);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)Lclient!ila;")
	public Class173 method3754() {
		return Static389.method5892(this.anInt4591);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public final class Class141 {

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "Lclient!lq;")
	public Class141 aClass141_1;

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
	public int anInt4123;

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
	public int anInt4124;

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
	public int anInt4128;

	@OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
	public int anInt4129;

	@OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
	public int anInt4130;

	@OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
	public int anInt4132;

	@OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
	public int anInt4135;

	@OriginalMember(owner = "client!lq", name = "t", descriptor = "I")
	public int anInt4138;

	@OriginalMember(owner = "client!lq", name = "u", descriptor = "I")
	public int anInt4139;

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "B")
	public final byte aByte46;

	@OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
	public final int anInt4131;

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
	public final int anInt4126;

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "I")
	public final int anInt4134;

	@OriginalMember(owner = "client!lq", name = "v", descriptor = "I")
	private final int anInt4140;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(IIIIB)V")
	public Class141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte46 = arg4;
		this.anInt4131 = arg1;
		this.anInt4126 = arg2;
		this.anInt4134 = arg3;
		this.anInt4140 = arg0;
	}

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!lq;I)V")
	public Class141(@OriginalArg(0) Class141 arg0, @OriginalArg(1) int arg1) {
		this.aClass141_1 = arg0;
		this.anInt4140 = this.aClass141_1.anInt4140;
		this.anInt4134 = this.aClass141_1.anInt4134 + arg1;
		this.anInt4131 = this.aClass141_1.anInt4131 + arg1;
		this.anInt4126 = arg1 + this.aClass141_1.anInt4126;
		this.aByte46 = this.aClass141_1.aByte46;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIII)Lclient!lq;")
	public Class141 method3497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return new Class141(this.anInt4140, arg1, arg0, arg2, this.aByte46);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)Lclient!un;")
	public Class248 method3498() {
		return Static307.method4639(this.anInt4140);
	}
}

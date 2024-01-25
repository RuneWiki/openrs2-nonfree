import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public abstract class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!eq", name = "v", descriptor = "I")
	protected int anInt7188;

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "F")
	protected float aFloat143;

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
	protected int anInt7179;

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
	private final int anInt7183;

	@OriginalMember(owner = "client!eq", name = "t", descriptor = "I")
	protected int anInt7186;

	@OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
	private final int anInt7185;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt7188 = arg2;
		this.aFloat143 = arg5;
		this.anInt7179 = arg0;
		this.anInt7183 = arg3;
		this.anInt7186 = arg1;
		this.anInt7185 = arg4;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)I")
	public final int method6011() {
		return this.anInt7186;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(FI)V")
	public abstract void method6012(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)F")
	public final float method6013() {
		return this.aFloat143;
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(B)I")
	public final int method6015() {
		return this.anInt7188;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIB)V")
	public abstract void method6016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "(B)I")
	public final int method6018() {
		return this.anInt7183;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)I")
	public final int method6020() {
		return this.anInt7185;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)I")
	public final int method6021() {
		return this.anInt7179;
	}
}

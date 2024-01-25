import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public abstract class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
	private final int anInt7575;

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
	protected int anInt7574;

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
	protected int anInt7571;

	@OriginalMember(owner = "client!bq", name = "y", descriptor = "I")
	protected int anInt7584;

	@OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
	private final int anInt7579;

	@OriginalMember(owner = "client!bq", name = "u", descriptor = "F")
	protected float aFloat174;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt7575 = arg3;
		this.anInt7574 = arg0;
		this.anInt7571 = arg1;
		this.anInt7584 = arg2;
		this.anInt7579 = arg4;
		this.aFloat174 = arg5;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIII)V")
	public abstract void method6342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)I")
	public final int method6343() {
		return this.anInt7584;
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)I")
	public final int method6346() {
		return this.anInt7571;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BF)V")
	public abstract void method6347(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)I")
	public final int method6348() {
		return this.anInt7574;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)I")
	public final int method6349() {
		return this.anInt7575;
	}

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "(I)I")
	public final int method6351() {
		return this.anInt7579;
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(B)F")
	public final float method6352() {
		return this.aFloat174;
	}
}

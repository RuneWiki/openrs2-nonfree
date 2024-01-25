import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public abstract class Class3_Sub22 extends Class3 {

	@OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
	protected int anInt7939;

	@OriginalMember(owner = "client!ff", name = "y", descriptor = "F")
	protected float aFloat162;

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
	protected int anInt7940;

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
	private final int anInt7935;

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
	protected int anInt7943;

	@OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
	private final int anInt7937;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt7939 = arg1;
		this.aFloat162 = arg5;
		this.anInt7940 = arg0;
		this.anInt7935 = arg3;
		this.anInt7943 = arg2;
		this.anInt7937 = arg4;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(FB)V")
	public abstract void method6723(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)I")
	public final int method6724() {
		return this.anInt7937;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)I")
	public final int method6725() {
		return this.anInt7943;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)V")
	public abstract void method6727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)I")
	public final int method6728() {
		return this.anInt7939;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)I")
	public final int method6729() {
		return this.anInt7935;
	}

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)I")
	public final int method6731() {
		return this.anInt7940;
	}

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)F")
	public final float method6732() {
		return this.aFloat162;
	}
}

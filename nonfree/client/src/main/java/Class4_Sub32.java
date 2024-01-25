import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public abstract class Class4_Sub32 extends Class4 {

	@OriginalMember(owner = "client!pv", name = "v", descriptor = "I")
	private final int anInt8015;

	@OriginalMember(owner = "client!pv", name = "u", descriptor = "I")
	protected int anInt8014;

	@OriginalMember(owner = "client!pv", name = "m", descriptor = "I")
	private final int anInt8007;

	@OriginalMember(owner = "client!pv", name = "w", descriptor = "I")
	protected int anInt8016;

	@OriginalMember(owner = "client!pv", name = "q", descriptor = "I")
	protected int anInt8010;

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "F")
	protected float aFloat163;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(IIIIIF)V")
	public Class4_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt8015 = arg3;
		this.anInt8014 = arg1;
		this.anInt8007 = arg4;
		this.anInt8016 = arg0;
		this.anInt8010 = arg2;
		this.aFloat163 = arg5;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)I")
	public final int method6613(@OriginalArg(0) int arg0) {
		return this.anInt8007;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)I")
	public final int method6614() {
		return this.anInt8016;
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)I")
	public final int method6615(@OriginalArg(0) int arg0) {
		return this.anInt8014;
	}

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "(B)I")
	public final int method6617() {
		return this.anInt8010;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)F")
	public final float method6618() {
		return this.aFloat163;
	}

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "(I)I")
	public final int method6621() {
		return this.anInt8015;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(BIII)V")
	public abstract void method6623(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(FB)V")
	public abstract void method6624(@OriginalArg(0) float arg0);
}

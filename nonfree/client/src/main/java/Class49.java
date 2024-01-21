import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public final class Class49 {

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
	public int anInt2402;

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
	public int anInt2403;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
	public int anInt2404;

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "B")
	private byte aByte6;

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
	public int anInt2406;

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
	public int anInt2408;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	public Class49() {
	}

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!oa;)V")
	public Class49(@OriginalArg(0) Class2_Sub18 arg0) {
		this.aByte6 = arg0.method2392();
		this.anInt2404 = arg0.method2353();
		this.anInt2402 = arg0.method2382();
		this.anInt2408 = arg0.method2382();
		this.anInt2406 = arg0.method2382();
		this.anInt2403 = arg0.method2382();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)I")
	public int method1688() {
		return (this.aByte6 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)I")
	public int method1690() {
		return this.aByte6 & 0x7;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public abstract class Class5_Sub27 extends Class5 {

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
	private final int anInt7104;

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
	protected int anInt7110;

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
	protected int anInt7112;

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
	protected int anInt7105;

	@OriginalMember(owner = "client!tn", name = "s", descriptor = "F")
	protected float aFloat150;

	@OriginalMember(owner = "client!tn", name = "w", descriptor = "I")
	private final int anInt7116;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IIIIIF)V")
	public Class5_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt7104 = arg3;
		this.anInt7110 = arg0;
		this.anInt7112 = arg1;
		this.anInt7105 = arg2;
		this.aFloat150 = arg5;
		this.anInt7116 = arg4;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)I")
	public final int method6330() {
		return this.anInt7110;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)F")
	public final float method6331() {
		return this.aFloat150;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIII)V")
	public abstract void method6332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(I)I")
	public final int method6334() {
		return this.anInt7112;
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(B)I")
	public final int method6335() {
		return this.anInt7105;
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(Z)I")
	public final int method6336() {
		return this.anInt7116;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(FI)V")
	public abstract void method6337(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "(I)I")
	public final int method6338() {
		return this.anInt7104;
	}
}

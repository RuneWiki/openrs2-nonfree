import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class Class4_Sub17 extends Class4 {

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
	protected int anInt7716;

	@OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
	protected int anInt7725;

	@OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
	private final int anInt7719;

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
	private final int anInt7717;

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
	protected int anInt7718;

	@OriginalMember(owner = "client!ni", name = "y", descriptor = "F")
	protected float aFloat96;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(IIIIIF)V")
	public Class4_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt7716 = arg1;
		this.anInt7725 = arg2;
		this.anInt7719 = arg3;
		this.anInt7717 = arg4;
		this.anInt7718 = arg0;
		this.aFloat96 = arg5;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BIII)V")
	public abstract void method6157(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)F")
	public final float method6158() {
		return this.aFloat96;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)I")
	public final int method6159() {
		return this.anInt7717;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)I")
	public final int method6160() {
		return this.anInt7719;
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(B)I")
	public final int method6161() {
		return this.anInt7725;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)I")
	public final int method6162() {
		return this.anInt7716;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BF)V")
	public abstract void method6164(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "(B)I")
	public final int method6165() {
		return this.anInt7718;
	}
}

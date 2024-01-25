import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public abstract class Class4_Sub8 extends Class4 {

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
	protected int anInt7367;

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
	protected int anInt7363;

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "F")
	protected float aFloat216;

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
	private final int anInt7371;

	@OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
	private final int anInt7369;

	@OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
	protected int anInt7368;

	static {
		new Class242("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIIF)V")
	public Class4_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt7367 = arg2;
		this.anInt7363 = arg0;
		this.aFloat216 = arg5;
		this.anInt7371 = arg3;
		this.anInt7369 = arg4;
		this.anInt7368 = arg1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(FI)V")
	public abstract void method5671(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)I")
	public final int method5674() {
		return this.anInt7368;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)F")
	public final float method5675() {
		return this.aFloat216;
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)I")
	public final int method5676() {
		return this.anInt7363;
	}

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)I")
	public final int method5679() {
		return this.anInt7371;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)V")
	public abstract void method5680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)I")
	public final int method5682() {
		return this.anInt7367;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)I")
	public final int method5683() {
		return this.anInt7369;
	}
}

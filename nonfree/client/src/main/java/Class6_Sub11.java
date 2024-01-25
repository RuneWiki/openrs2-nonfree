import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public abstract class Class6_Sub11 extends Class6 {

	@OriginalMember(owner = "client!dq", name = "w", descriptor = "I")
	private final int anInt7819;

	@OriginalMember(owner = "client!dq", name = "H", descriptor = "I")
	protected int anInt7828;

	@OriginalMember(owner = "client!dq", name = "u", descriptor = "F")
	protected float aFloat100;

	@OriginalMember(owner = "client!dq", name = "G", descriptor = "I")
	protected int anInt7827;

	@OriginalMember(owner = "client!dq", name = "s", descriptor = "I")
	private final int anInt7816;

	@OriginalMember(owner = "client!dq", name = "z", descriptor = "I")
	protected int anInt7821;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(IIIIIF)V")
	public Class6_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt7819 = arg4;
		this.anInt7828 = arg0;
		this.aFloat100 = arg5;
		this.anInt7827 = arg1;
		this.anInt7816 = arg3;
		this.anInt7821 = arg2;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIII)V")
	public abstract void method6387(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)F")
	public final float method6389() {
		return this.aFloat100;
	}

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "(I)I")
	public final int method6390() {
		return this.anInt7828;
	}

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "(I)I")
	public final int method6391() {
		return this.anInt7827;
	}

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "(I)I")
	public final int method6392() {
		return this.anInt7821;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(Z)I")
	public final int method6395() {
		return this.anInt7816;
	}

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "(I)I")
	public final int method6396() {
		return this.anInt7819;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(FI)V")
	public abstract void method6397(@OriginalArg(0) float arg0);
}

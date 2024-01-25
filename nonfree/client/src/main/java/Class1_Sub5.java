import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public abstract class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!qea", name = "u", descriptor = "F")
	protected float aFloat112;

	@OriginalMember(owner = "client!qea", name = "l", descriptor = "I")
	private final int anInt4958;

	@OriginalMember(owner = "client!qea", name = "i", descriptor = "I")
	protected int anInt4955;

	@OriginalMember(owner = "client!qea", name = "p", descriptor = "I")
	protected int anInt4961;

	@OriginalMember(owner = "client!qea", name = "j", descriptor = "I")
	private final int anInt4956;

	@OriginalMember(owner = "client!qea", name = "r", descriptor = "I")
	protected int anInt4963;

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.aFloat112 = arg5;
		this.anInt4958 = arg4;
		this.anInt4955 = arg2;
		this.anInt4961 = arg0;
		this.anInt4956 = arg3;
		this.anInt4963 = arg1;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)I")
	public final int method4158() {
		return this.anInt4955;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)I")
	public final int method4159() {
		return this.anInt4961;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Z)F")
	public final float method4160() {
		return this.aFloat112;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIIB)V")
	public abstract void method4161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)I")
	public final int method4162() {
		return this.anInt4956;
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(B)I")
	public final int method4163() {
		return this.anInt4963;
	}

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "(I)I")
	public final int method4165() {
		return this.anInt4958;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(FI)V")
	public abstract void method4166(@OriginalArg(0) float arg0);
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public abstract class Class3_Sub28 extends Class3 {

	@OriginalMember(owner = "client!pn", name = "o", descriptor = "F")
	protected float aFloat202;

	@OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
	private final int anInt10039;

	@OriginalMember(owner = "client!pn", name = "v", descriptor = "I")
	protected int anInt10044;

	@OriginalMember(owner = "client!pn", name = "A", descriptor = "I")
	private final int anInt10048;

	@OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
	protected int anInt10042;

	@OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
	protected int anInt10040;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.aFloat202 = arg5;
		this.anInt10039 = arg3;
		this.anInt10044 = arg1;
		this.anInt10048 = arg4;
		this.anInt10042 = arg2;
		this.anInt10040 = arg0;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(FI)V")
	public abstract void method8151(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)I")
	public final int method8153() {
		return this.anInt10048;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)I")
	public final int method8154() {
		return this.anInt10039;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)I")
	public final int method8155() {
		return this.anInt10044;
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)I")
	public final int method8156() {
		return this.anInt10040;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BIII)V")
	public abstract void method8157(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "(I)I")
	public final int method8158() {
		return this.anInt10042;
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(B)F")
	public final float method8159() {
		return this.aFloat202;
	}
}

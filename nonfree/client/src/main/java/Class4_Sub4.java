import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!je", name = "k", descriptor = "Z")
	public boolean aBoolean223 = false;

	@OriginalMember(owner = "client!je", name = "t", descriptor = "Z")
	public boolean aBoolean224 = false;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "I")
	protected int anInt2907;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "I")
	protected int anInt2905;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "I")
	protected final int anInt2906;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class4_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean223 = arg3;
		this.anInt2907 = arg0;
		this.aBoolean224 = arg4;
		this.anInt2905 = arg2;
		this.anInt2906 = arg1;
	}
}

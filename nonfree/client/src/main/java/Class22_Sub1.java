import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!be", name = "k", descriptor = "Z")
	public boolean aBoolean419 = false;

	@OriginalMember(owner = "client!be", name = "r", descriptor = "Z")
	public boolean aBoolean420 = false;

	@OriginalMember(owner = "client!be", name = "p", descriptor = "I")
	protected int anInt5706;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "I")
	protected int anInt5707;

	@OriginalMember(owner = "client!be", name = "n", descriptor = "I")
	protected final int anInt5705;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class22_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5706 = arg2;
		this.anInt5707 = arg0;
		this.aBoolean419 = arg3;
		this.anInt5705 = arg1;
		this.aBoolean420 = arg4;
	}
}

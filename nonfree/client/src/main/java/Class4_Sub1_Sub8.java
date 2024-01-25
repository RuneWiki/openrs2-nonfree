import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public final class Class4_Sub1_Sub8 extends Class4_Sub1 {

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "B")
	private byte aByte101;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "B")
	private byte aByte102;

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "B")
	private byte aByte103;

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "Z")
	private boolean aBoolean546;

	@OriginalMember(owner = "client!pb", name = "x", descriptor = "B")
	private byte aByte104;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!es;)V")
	@Override
	public void method8334(@OriginalArg(1) Class4_Sub11 arg0) {
		this.aBoolean546 = arg0.method8865() == 1;
		this.aByte102 = arg0.method8861();
		this.aByte101 = arg0.method8861();
		this.aByte104 = arg0.method8861();
		this.aByte103 = arg0.method8861();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!oga;I)V")
	@Override
	public void method8329(@OriginalArg(0) Class267 arg0) {
		arg0.aByte93 = this.aByte101;
		arg0.aByte95 = this.aByte103;
		arg0.aBoolean525 = this.aBoolean546;
		arg0.aByte96 = this.aByte104;
		arg0.aByte94 = this.aByte102;
	}
}

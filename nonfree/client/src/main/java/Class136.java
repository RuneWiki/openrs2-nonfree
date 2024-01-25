import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public final class Class136 {

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
	public int anInt3736;

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
	public int anInt3737;

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
	public int anInt3738;

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "Lclient!gv;")
	public Class136 aClass136_1;

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "I")
	public int anInt3743;

	@OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
	public int anInt3744;

	@OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
	public int anInt3746;

	@OriginalMember(owner = "client!gv", name = "o", descriptor = "I")
	public int anInt3747;

	@OriginalMember(owner = "client!gv", name = "q", descriptor = "I")
	public int anInt3749;

	@OriginalMember(owner = "client!gv", name = "u", descriptor = "I")
	public int anInt3753;

	@OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
	private final int anInt3745;

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
	public final int anInt3739;

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "B")
	public final byte aByte75;

	@OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
	public final int anInt3741;

	@OriginalMember(owner = "client!gv", name = "r", descriptor = "I")
	public final int anInt3750;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(IIIIB)V")
	public Class136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt3745 = arg0;
		this.anInt3739 = arg2;
		this.aByte75 = arg4;
		this.anInt3741 = arg1;
		this.anInt3750 = arg3;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIII)Lclient!gv;")
	public Class136 method3076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class136(this.anInt3745, arg1, arg2, arg0, this.aByte75);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)Lclient!lu;")
	public Class223 method3078() {
		return Static35.method825(this.anInt3745);
	}
}

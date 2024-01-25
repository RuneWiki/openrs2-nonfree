import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nla")
public final class Class262 {

	@OriginalMember(owner = "client!nla", name = "c", descriptor = "[I")
	public final int[] anIntArray504 = new int[2];

	@OriginalMember(owner = "client!nla", name = "e", descriptor = "[I")
	public final int[] anIntArray505 = new int[3];

	@OriginalMember(owner = "client!nla", name = "i", descriptor = "[I")
	public final int[] anIntArray503 = new int[3];

	@OriginalMember(owner = "client!nla", name = "k", descriptor = "[I")
	public final int[] anIntArray507 = new int[2];

	@OriginalMember(owner = "client!nla", name = "l", descriptor = "[S")
	public short[] aShortArray119;

	@OriginalMember(owner = "client!nla", name = "g", descriptor = "[S")
	public short[] aShortArray120;

	@OriginalMember(owner = "client!nla", name = "<init>", descriptor = "(Lclient!k;)V")
	public Class262(@OriginalArg(0) Class203 arg0) {
		this.anIntArray503[2] = arg0.anInt4867;
		this.anIntArray503[1] = arg0.anInt4833;
		this.anIntArray503[0] = arg0.anInt4899;
		this.anIntArray505[1] = arg0.anInt4863;
		this.anIntArray505[0] = arg0.anInt4879;
		this.anIntArray505[2] = arg0.anInt4866;
		this.anIntArray507[1] = arg0.anInt4862;
		this.anIntArray507[0] = arg0.anInt4887;
		this.anIntArray504[1] = arg0.anInt4891;
		this.anIntArray504[0] = arg0.anInt4856;
		if (arg0.aShortArray86 != null) {
			this.aShortArray119 = new short[arg0.aShortArray86.length];
			Static728.method271(arg0.aShortArray86, 0, this.aShortArray119, 0, this.aShortArray119.length);
		}
		if (arg0.aShortArray88 != null) {
			this.aShortArray120 = new short[arg0.aShortArray88.length];
			Static728.method271(arg0.aShortArray88, 0, this.aShortArray120, 0, this.aShortArray120.length);
		}
	}
}

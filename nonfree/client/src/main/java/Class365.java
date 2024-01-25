import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public final class Class365 {

	@OriginalMember(owner = "client!uw", name = "d", descriptor = "I")
	public int anInt10802;

	@OriginalMember(owner = "client!uw", name = "f", descriptor = "I")
	public int anInt10804;

	@OriginalMember(owner = "client!uw", name = "g", descriptor = "I")
	public int anInt10805;

	@OriginalMember(owner = "client!uw", name = "j", descriptor = "I")
	public int anInt10807 = 128;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "I")
	public int anInt10799 = 128;

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
	public int anInt10800;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(I)V")
	public Class365(@OriginalArg(0) int arg0) {
		this.anInt10800 = arg0;
	}

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(IIIIII)V")
	private Class365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt10802 = arg3;
		this.anInt10799 = arg2;
		this.anInt10804 = arg5;
		this.anInt10800 = arg0;
		this.anInt10805 = arg4;
		this.anInt10807 = arg1;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)Lclient!uw;")
	public Class365 method9237() {
		return new Class365(this.anInt10800, this.anInt10807, this.anInt10799, this.anInt10802, this.anInt10805, this.anInt10804);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!uw;B)V")
	public void method9239(@OriginalArg(0) Class365 arg0) {
		this.anInt10800 = arg0.anInt10800;
		this.anInt10805 = arg0.anInt10805;
		this.anInt10802 = arg0.anInt10802;
		this.anInt10804 = arg0.anInt10804;
		this.anInt10807 = arg0.anInt10807;
		this.anInt10799 = arg0.anInt10799;
	}
}

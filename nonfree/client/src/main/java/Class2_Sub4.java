import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public abstract class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
	protected final int anInt3999;

	@OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
	protected int anInt3992;

	@OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
	public final int anInt3996;

	@OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
	protected int anInt3993;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(IIII)V")
	protected Class2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3999 = arg1;
		this.anInt3992 = arg2;
		this.anInt3996 = arg3;
		this.anInt3993 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!v", name = "j", descriptor = "I")
	protected final int anInt6719;

	@OriginalMember(owner = "client!v", name = "l", descriptor = "I")
	protected int anInt6721;

	@OriginalMember(owner = "client!v", name = "k", descriptor = "I")
	protected int anInt6720;

	@OriginalMember(owner = "client!v", name = "m", descriptor = "I")
	public final int anInt6722;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(IIII)V")
	protected Class1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6719 = arg1;
		this.anInt6721 = arg0;
		this.anInt6720 = arg2;
		this.anInt6722 = arg3;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public abstract class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
	protected int anInt1074;

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
	protected final int anInt1076;

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
	protected int anInt1077;

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
	public final int anInt1073;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIII)V")
	protected Class12_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1074 = arg0;
		this.anInt1076 = arg1;
		this.anInt1077 = arg2;
		this.anInt1073 = arg3;
	}
}

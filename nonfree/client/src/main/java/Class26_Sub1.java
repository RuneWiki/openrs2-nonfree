import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public abstract class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
	protected int anInt3954;

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
	protected final int anInt3956;

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
	protected int anInt3955;

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
	public final int anInt3958;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(IIII)V")
	protected Class26_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3954 = arg2;
		this.anInt3956 = arg1;
		this.anInt3955 = arg0;
		this.anInt3958 = arg3;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class Class30_Sub4 extends Class30 {

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "Z")
	public boolean aBoolean323 = false;

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "Z")
	public boolean aBoolean325 = false;

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "S")
	public final short aShort75;

	@OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
	protected final int anInt5199;

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
	protected int anInt5193;

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
	protected int anInt5194;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class30_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.aShort75 = (short) arg3;
		this.anInt5199 = arg1;
		this.anInt5193 = arg2;
		this.aBoolean325 = arg4;
		this.anInt5194 = arg0;
		this.aBoolean323 = arg5;
	}
}

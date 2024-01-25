import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public abstract class Class47_Sub3 extends Class47 {

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "Z")
	public boolean aBoolean537 = false;

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "Z")
	public boolean aBoolean538 = false;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
	protected int anInt7956;

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "S")
	public final short aShort112;

	@OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
	protected int anInt7957;

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
	protected final int anInt7955;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class47_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.anInt7956 = arg0;
		this.aBoolean538 = arg5;
		this.aBoolean537 = arg4;
		this.aShort112 = (short) arg3;
		this.anInt7957 = arg2;
		this.anInt7955 = arg1;
	}
}

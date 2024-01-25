import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public abstract class Class16_Sub4 extends Class16 {

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "Z")
	public boolean aBoolean336 = false;

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "Z")
	public boolean aBoolean337 = false;

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
	protected int anInt3646;

	@OriginalMember(owner = "client!hr", name = "n", descriptor = "I")
	protected int anInt3647;

	@OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
	protected final int anInt3648;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class16_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3646 = arg0;
		this.aBoolean337 = arg3;
		this.anInt3647 = arg2;
		this.anInt3648 = arg1;
		this.aBoolean336 = arg4;
	}
}

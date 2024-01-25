import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "Z")
	public boolean aBoolean519 = false;

	@OriginalMember(owner = "client!ag", name = "v", descriptor = "Z")
	public boolean aBoolean520 = false;

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
	protected final int anInt5985;

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
	protected int anInt5987;

	@OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
	protected int anInt5990;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5985 = arg1;
		this.aBoolean520 = arg4;
		this.aBoolean519 = arg3;
		this.anInt5987 = arg2;
		this.anInt5990 = arg0;
	}
}

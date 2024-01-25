import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public final class Class23 {

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "S")
	public final short aShort3;

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "B")
	public byte aByte4;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "Lclient!ms;")
	public Interface5 anInterface5_1;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "B")
	public final byte aByte3;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!rl;Lclient!ms;III)V")
	public Class23(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aShort3 = (short) arg2;
		this.aByte4 = (byte) arg4;
		this.anInterface5_1 = arg1;
		this.aByte3 = (byte) arg3;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public final class Class164 {

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "S")
	public final short aShort61;

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "B")
	public final byte aByte64;

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "B")
	public byte aByte65;

	@OriginalMember(owner = "client!jaa", name = "g", descriptor = "Lclient!lca;")
	public Interface14 anInterface14_4;

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Lclient!lca;III)V")
	public Class164(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aShort61 = (short) arg1;
		this.aByte64 = (byte) arg2;
		this.aByte65 = (byte) arg3;
		this.anInterface14_4 = arg0;
	}
}

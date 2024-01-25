import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public final class Class225 {

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "Lclient!hh;")
	public Interface5 anInterface5_7;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "B")
	public final byte aByte95;

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "S")
	public final short aShort199;

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "B")
	public byte aByte96;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!gk;Lclient!hh;III)V")
	public Class225(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInterface5_7 = arg1;
		this.aByte95 = (byte) arg3;
		this.aShort199 = (short) arg2;
		this.aByte96 = (byte) arg4;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public final class Class100 {

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "B")
	public byte aByte25;

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "Lclient!rg;")
	public Interface12 anInterface12_4;

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "B")
	public final byte aByte26;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "S")
	public final short aShort27;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!bo;Lclient!rg;III)V")
	public Class100(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) Interface12 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aByte25 = (byte) arg4;
		this.anInterface12_4 = arg1;
		this.aByte26 = (byte) arg3;
		this.aShort27 = (short) arg2;
	}
}

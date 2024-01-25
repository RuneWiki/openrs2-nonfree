import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public final class Class195 {

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "B")
	public byte aByte60;

	@OriginalMember(owner = "client!ot", name = "h", descriptor = "Lclient!eo;")
	public Interface5 anInterface5_5;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "S")
	public final short aShort67;

	@OriginalMember(owner = "client!ot", name = "j", descriptor = "B")
	public final byte aByte61;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!bl;Lclient!eo;III)V")
	public Class195(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aByte60 = (byte) arg4;
		this.anInterface5_5 = arg1;
		this.aShort67 = (short) arg2;
		this.aByte61 = (byte) arg3;
	}
}

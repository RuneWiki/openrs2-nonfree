import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public final class Class213 {

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "B")
	public byte aByte82;

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "B")
	public final byte aByte83;

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "S")
	public final short aShort70;

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "Lclient!cd;")
	public Interface5 anInterface5_1;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!cd;III)V")
	public Class213(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte82 = (byte) arg3;
		this.aByte83 = (byte) arg2;
		this.aShort70 = (short) arg1;
		this.anInterface5_1 = arg0;
	}
}

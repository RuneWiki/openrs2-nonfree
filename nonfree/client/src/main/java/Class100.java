import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public final class Class100 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "B")
	public byte aByte26;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "S")
	public final short aShort24;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "B")
	public final byte aByte27;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "Lclient!nn;")
	public Interface11 anInterface11_2;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!nn;III)V")
	public Class100(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte26 = (byte) arg3;
		this.aShort24 = (short) arg1;
		this.aByte27 = (byte) arg2;
		this.anInterface11_2 = arg0;
	}
}

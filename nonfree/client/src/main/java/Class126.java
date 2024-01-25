import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public final class Class126 {

	@OriginalMember(owner = "client!hea", name = "f", descriptor = "S")
	public final short aShort44;

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "B")
	public byte aByte36;

	@OriginalMember(owner = "client!hea", name = "e", descriptor = "B")
	public final byte aByte37;

	@OriginalMember(owner = "client!hea", name = "d", descriptor = "Lclient!ut;")
	public Interface21 anInterface21_2;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lclient!ut;III)V")
	public Class126(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aShort44 = (short) arg1;
		this.aByte36 = (byte) arg3;
		this.aByte37 = (byte) arg2;
		this.anInterface21_2 = arg0;
	}
}

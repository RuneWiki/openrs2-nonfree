import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public final class Class188 {

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "B")
	public final byte aByte64;

	@OriginalMember(owner = "client!maa", name = "e", descriptor = "B")
	public byte aByte65;

	@OriginalMember(owner = "client!maa", name = "i", descriptor = "Lclient!sp;")
	public Interface16 anInterface16_1;

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "S")
	public final short aShort90;

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lclient!sp;III)V")
	public Class188(@OriginalArg(0) Interface16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte64 = (byte) arg2;
		this.aByte65 = (byte) arg3;
		this.anInterface16_1 = arg0;
		this.aShort90 = (short) arg1;
	}
}

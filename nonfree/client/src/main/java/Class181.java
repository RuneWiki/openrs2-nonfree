import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public final class Class181 {

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "S")
	public final short aShort76;

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "Lclient!hk;")
	public Interface3 anInterface3_6;

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "B")
	public final byte aByte64;

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "B")
	public byte aByte65;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lclient!hd;Lclient!hk;III)V")
	public Class181(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aShort76 = (short) arg2;
		this.anInterface3_6 = arg1;
		this.aByte64 = (byte) arg3;
		this.aByte65 = (byte) arg4;
	}
}

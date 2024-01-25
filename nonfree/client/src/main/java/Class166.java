import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public final class Class166 {

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "B")
	public final byte aByte55;

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "B")
	public byte aByte54;

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "Lclient!pn;")
	public Interface14 anInterface14_4;

	@OriginalMember(owner = "client!kca", name = "g", descriptor = "S")
	public final short aShort72;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lclient!pn;III)V")
	public Class166(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte55 = (byte) arg2;
		this.aByte54 = (byte) arg3;
		this.anInterface14_4 = arg0;
		this.aShort72 = (short) arg1;
	}
}

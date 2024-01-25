import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public final class Class380 {

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "B")
	public final byte aByte142;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "S")
	public final short aShort115;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "B")
	public byte aByte143;

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "Lclient!ku;")
	public Interface12 anInterface12_7;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!ku;III)V")
	public Class380(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte142 = (byte) arg2;
		this.aShort115 = (short) arg1;
		this.aByte143 = (byte) arg3;
		this.anInterface12_7 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public final class Class243 {

	@OriginalMember(owner = "client!nba", name = "e", descriptor = "S")
	public final short aShort78;

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "B")
	public byte aByte93;

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "Lclient!wfa;")
	public Interface26 anInterface26_5;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "B")
	public final byte aByte92;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lclient!wfa;III)V")
	public Class243(@OriginalArg(0) Interface26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aShort78 = (short) arg1;
		this.aByte93 = (byte) arg3;
		this.anInterface26_5 = arg0;
		this.aByte92 = (byte) arg2;
	}
}

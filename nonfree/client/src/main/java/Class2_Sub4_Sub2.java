import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class2_Sub4_Sub2 extends Class2_Sub4 {

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
	public final int anInt6564 = (int) (Static93.method2172() / 1000L);

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString60;

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "S")
	public final short aShort98;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub4_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString60 = arg0;
		this.aShort98 = (short) arg1;
	}
}

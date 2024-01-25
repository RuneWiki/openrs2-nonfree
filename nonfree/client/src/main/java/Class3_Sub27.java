import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public final class Class3_Sub27 extends Class3 {

	@OriginalMember(owner = "client!gga", name = "p", descriptor = "I")
	public int anInt3845;

	@OriginalMember(owner = "client!gga", name = "n", descriptor = "I")
	public final int anInt3843;

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(II)V")
	public Class3_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3845 = arg1;
		this.anInt3843 = arg0;
	}
}

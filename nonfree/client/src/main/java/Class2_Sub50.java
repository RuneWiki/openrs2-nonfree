import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public final class Class2_Sub50 extends Class2 {

	@OriginalMember(owner = "client!sda", name = "n", descriptor = "I")
	public final int anInt9054;

	@OriginalMember(owner = "client!sda", name = "r", descriptor = "I")
	public final int anInt9058;

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(II)V")
	public Class2_Sub50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9054 = arg0;
		this.anInt9058 = arg1;
	}
}

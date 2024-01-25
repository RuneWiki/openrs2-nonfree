import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public final class Class12_Sub46 extends Class12 {

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
	public final int anInt8179;

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
	public int anInt8181;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(II)V")
	public Class12_Sub46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8179 = arg0;
		this.anInt8181 = arg1;
	}
}

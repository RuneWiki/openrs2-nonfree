import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public final class Class8_Sub11 extends Class8 {

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
	public final int anInt2018;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
	public int anInt2019;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(II)V")
	public Class8_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2018 = arg0;
		this.anInt2019 = arg1;
	}
}

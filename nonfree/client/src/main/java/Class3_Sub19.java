import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public final class Class3_Sub19 extends Class3 {

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
	public final int anInt3263;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
	public final int anInt3264;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(II)V")
	public Class3_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3263 = arg1;
		this.anInt3264 = arg0;
	}
}

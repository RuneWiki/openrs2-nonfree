import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public final class Class8_Sub49 extends Class8 {

	@OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
	public final int anInt10157;

	@OriginalMember(owner = "client!vda", name = "j", descriptor = "I")
	public final int anInt10156;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(II)V")
	public Class8_Sub49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10157 = arg0;
		this.anInt10156 = arg1;
	}
}

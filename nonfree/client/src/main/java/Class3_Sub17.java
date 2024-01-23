import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class3_Sub17 extends Class3 {

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
	public int anInt2756;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "[Lclient!vg;")
	public Class185[] aClass185Array2;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(I[Lclient!vg;)V")
	public Class3_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) Class185[] arg1) {
		this.anInt2756 = arg0;
		this.aClass185Array2 = arg1;
	}
}

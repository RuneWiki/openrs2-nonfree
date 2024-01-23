import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
	public int anInt3290;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "[Lclient!ha;")
	public Class62[] aClass62Array2;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(I[Lclient!ha;)V")
	public Class1_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) Class62[] arg1) {
		this.anInt3290 = arg0;
		this.aClass62Array2 = arg1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
	public int anInt1273;

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "[Lclient!mo;")
	public Class113[] aClass113Array1;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(I[Lclient!mo;)V")
	public Class1_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) Class113[] arg1) {
		this.anInt1273 = arg0;
		this.aClass113Array1 = arg1;
	}
}

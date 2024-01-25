import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public final class Class247 {

	@OriginalMember(owner = "client!of", name = "e", descriptor = "Lclient!pu;")
	private final Class270 aClass270_74;

	@OriginalMember(owner = "client!of", name = "d", descriptor = "I")
	public final int anInt6283;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;)V")
	public Class247(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2) {
		new Class222(64);
		this.aClass270_74 = arg2;
		this.anInt6283 = this.aClass270_74.method5685(15);
	}
}

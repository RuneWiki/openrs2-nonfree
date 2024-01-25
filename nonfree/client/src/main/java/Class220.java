import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public final class Class220 {

	@OriginalMember(owner = "client!la", name = "a", descriptor = "Lclient!lb;")
	private final Class221 aClass221_100;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "I")
	public final int anInt5943;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;)V")
	public Class220(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2) {
		new Class338(64);
		this.aClass221_100 = arg2;
		this.anInt5943 = this.aClass221_100.method5065(15);
	}
}

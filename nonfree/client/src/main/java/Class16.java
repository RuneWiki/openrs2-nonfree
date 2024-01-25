import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public final class Class16 {

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "Lclient!wia;")
	private final Class386 aClass386_5;

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
	public final int anInt162;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;)V")
	public Class16(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2) {
		new Class264(64);
		this.aClass386_5 = arg2;
		this.anInt162 = this.aClass386_5.method9210(15);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public final class Class131 {

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "Lclient!uu;")
	private final Class343 aClass343_95;

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
	public final int anInt3552;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;)V")
	public Class131(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2) {
		new Class136(64);
		this.aClass343_95 = arg2;
		this.anInt3552 = this.aClass343_95.method8157(15);
	}
}

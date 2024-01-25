import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public final class Class41 {

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "Lclient!ph;")
	private final Class187 aClass187_17;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
	public final int anInt1108;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!kp;ILclient!ph;)V")
	public Class41(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2) {
		new Class267(64);
		this.aClass187_17 = arg2;
		this.anInt1108 = this.aClass187_17.method4306(15);
	}
}

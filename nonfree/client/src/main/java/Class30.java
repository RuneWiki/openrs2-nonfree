import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public final class Class30 {

	@OriginalMember(owner = "client!bea", name = "e", descriptor = "Lclient!gda;")
	private final Class126 aClass126_21;

	@OriginalMember(owner = "client!bea", name = "f", descriptor = "I")
	public final int anInt526;

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;)V")
	public Class30(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2) {
		new Class168(64);
		this.aClass126_21 = arg2;
		this.anInt526 = this.aClass126_21.method3062(15);
	}
}

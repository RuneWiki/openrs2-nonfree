import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public final class Class23 {

	@OriginalMember(owner = "client!be", name = "c", descriptor = "Lclient!ui;")
	private final Class230 aClass230_4;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "I")
	public final int anInt382;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!gp;ILclient!ui;)V")
	public Class23(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2) {
		new Class227(64);
		this.aClass230_4 = arg2;
		this.anInt382 = this.aClass230_4.method4956(15);
	}
}

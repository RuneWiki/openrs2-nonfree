import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public final class Class188 {

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "Lclient!in;")
	private final Class157 aClass157_156;

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "I")
	public final int anInt6438;

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;)V")
	public Class188(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2) {
		new Class169(64);
		this.aClass157_156 = arg2;
		this.anInt6438 = this.aClass157_156.method4561(15);
	}
}

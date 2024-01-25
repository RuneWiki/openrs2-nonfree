import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public final class Class131 {

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "Lclient!sea;")
	private final Class308 aClass308_79;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
	public final int anInt3741;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;)V")
	public Class131(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2) {
		new Class207(64);
		this.aClass308_79 = arg2;
		this.anInt3741 = this.aClass308_79.method6568(15);
	}
}

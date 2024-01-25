import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public final class Class120 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "Lclient!jo;")
	private final Class168 aClass168_46;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
	public final int anInt3957;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;)V")
	public Class120(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2) {
		new Class245(64);
		this.aClass168_46 = arg2;
		this.anInt3957 = this.aClass168_46.method4443(15);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public final class Class336 {

	@OriginalMember(owner = "client!sha", name = "j", descriptor = "Lclient!nca;")
	private final Class254 aClass254_145;

	@OriginalMember(owner = "client!sha", name = "e", descriptor = "I")
	public final int anInt9168;

	@OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;)V")
	public Class336(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		new Class85(64);
		this.aClass254_145 = arg2;
		this.anInt9168 = this.aClass254_145.method6101(15);
	}
}

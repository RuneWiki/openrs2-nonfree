import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class Class175 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!cb;")
	private final Class50 aClass50_68;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
	public final int anInt4214;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;)V")
	public Class175(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2) {
		new Class265(64);
		this.aClass50_68 = arg2;
		this.anInt4214 = this.aClass50_68.method913(15);
	}
}

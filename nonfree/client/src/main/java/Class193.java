import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class193 {

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "Z")
	public static final boolean aBoolean391 = false;

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
	public static int anInt5483 = -1;

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "Lclient!r;")
	private final Class197 aClass197_72;

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
	public final int anInt5482;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V", line = 93)
	public Class193(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		new Class98(64);
		this.aClass197_72 = arg2;
		this.anInt5482 = this.aClass197_72.method5082(15);
	}
}

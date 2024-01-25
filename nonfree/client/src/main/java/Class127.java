import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public final class Class127 {

	@OriginalMember(owner = "client!hda", name = "g", descriptor = "Lclient!vd;")
	private final Class353 aClass353_39;

	@OriginalMember(owner = "client!hda", name = "f", descriptor = "I")
	public final int anInt4061;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;)V")
	public Class127(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2) {
		new Class166(64);
		this.aClass353_39 = arg2;
		this.anInt4061 = this.aClass353_39.method8422(15);
	}
}

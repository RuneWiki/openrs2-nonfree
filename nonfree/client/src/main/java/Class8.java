import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class Class8 {

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
	public int anInt290;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
	public int anInt291;

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
	public int anInt292;

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
	public int anInt295;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class8() {
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!bd;)V")
	public Class8(@OriginalArg(0) Class8 arg0) {
		this.anInt295 = arg0.anInt295;
		this.anInt291 = arg0.anInt291;
		this.anInt292 = arg0.anInt292;
		this.anInt290 = arg0.anInt290;
	}
}

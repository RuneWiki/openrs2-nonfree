import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class48 {

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
	public int anInt1300;

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
	public int anInt1301;

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
	public int anInt1302;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
	public int anInt1303;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	public Class48() {
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!dl;)V")
	public Class48(@OriginalArg(0) Class48 arg0) {
		this.anInt1302 = arg0.anInt1302;
		this.anInt1300 = arg0.anInt1300;
		this.anInt1303 = arg0.anInt1303;
		this.anInt1301 = arg0.anInt1301;
	}
}

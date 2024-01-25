import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public final class Class251 {

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
	public int anInt7191;

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
	public int anInt7192;

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
	public int anInt7193;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
	public Class251() {
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!ut;)V")
	public Class251(@OriginalArg(0) Class251 arg0) {
		this.anInt7193 = arg0.anInt7193;
		this.anInt7191 = arg0.anInt7191;
		this.anInt7192 = arg0.anInt7192;
	}
}

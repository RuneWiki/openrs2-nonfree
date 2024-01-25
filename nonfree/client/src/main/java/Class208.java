import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public final class Class208 {

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
	public int anInt6191;

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
	public int anInt6192;

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
	public int anInt6193;

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
	public int anInt6194;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
	public Class208() {
	}

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!mq;)V")
	public Class208(@OriginalArg(0) Class208 arg0) {
		this.anInt6192 = arg0.anInt6192;
		this.anInt6194 = arg0.anInt6194;
		this.anInt6191 = arg0.anInt6191;
		this.anInt6193 = arg0.anInt6193;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
	public int anInt4;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
	public int anInt5;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
	public int anInt6;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
	public int anInt7;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	public Class3() {
	}

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!ab;)V")
	public Class3(@OriginalArg(0) Class3 arg0) {
		this.anInt7 = arg0.anInt7;
		this.anInt6 = arg0.anInt6;
		this.anInt4 = arg0.anInt4;
		this.anInt5 = arg0.anInt5;
	}
}

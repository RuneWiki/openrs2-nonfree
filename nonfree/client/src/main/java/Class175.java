import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public final class Class175 {

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
	public int anInt4969;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
	public int anInt4970;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
	public int anInt4971;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class175() {
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!ra;)V")
	public Class175(@OriginalArg(0) Class175 arg0) {
		this.anInt4969 = arg0.anInt4969;
		this.anInt4971 = arg0.anInt4971;
		this.anInt4970 = arg0.anInt4970;
	}
}

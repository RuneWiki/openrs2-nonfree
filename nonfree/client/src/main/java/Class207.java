import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public final class Class207 {

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
	public int anInt6188;

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
	public int anInt6189;

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
	public int anInt6190;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V")
	public Class207() {
	}

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!mp;)V")
	public Class207(@OriginalArg(0) Class207 arg0) {
		this.anInt6190 = arg0.anInt6190;
		this.anInt6188 = arg0.anInt6188;
		this.anInt6189 = arg0.anInt6189;
	}
}

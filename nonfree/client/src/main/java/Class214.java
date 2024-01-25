import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class214 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
	public int anInt5173;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	public int anInt5174;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
	public int anInt5175;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	public Class214() {
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!sb;)V")
	public Class214(@OriginalArg(0) Class214 arg0) {
		this.anInt5173 = arg0.anInt5173;
		this.anInt5175 = arg0.anInt5175;
		this.anInt5174 = arg0.anInt5174;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class215 {

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
	public int anInt6222;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
	public int anInt6223;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
	public int anInt6224;

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
	public int anInt6225;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	public Class215() {
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!sj;)V")
	public Class215(@OriginalArg(0) Class215 arg0) {
		this.anInt6225 = arg0.anInt6225;
		this.anInt6224 = arg0.anInt6224;
		this.anInt6222 = arg0.anInt6222;
		this.anInt6223 = arg0.anInt6223;
	}
}

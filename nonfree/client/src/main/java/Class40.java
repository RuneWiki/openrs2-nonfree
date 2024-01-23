import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class40 {

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
	public int anInt1389;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
	private int anInt1388;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(II)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1389 = arg0;
		this.anInt1388 = Static237.anInt5216;
	}

	@OriginalMember(owner = "client!dl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static237.method4090(this.anInt1389, this.anInt1388);
		super.finalize();
	}
}

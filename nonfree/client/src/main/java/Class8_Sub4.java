import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public abstract class Class8_Sub4 extends Class8 {

	@OriginalMember(owner = "client!kn", name = "p", descriptor = "Z")
	public boolean aBoolean486 = false;

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "Z")
	public boolean aBoolean485 = false;

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
	protected final int anInt6831;

	@OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
	protected int anInt6834;

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
	protected int anInt6829;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class8_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6831 = arg1;
		this.aBoolean485 = arg4;
		this.aBoolean486 = arg3;
		this.anInt6834 = arg0;
		this.anInt6829 = arg2;
	}
}

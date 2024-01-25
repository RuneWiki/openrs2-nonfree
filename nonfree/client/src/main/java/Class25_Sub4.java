import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public abstract class Class25_Sub4 extends Class25 {

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "Z")
	public boolean aBoolean487 = false;

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "Z")
	public boolean aBoolean486 = false;

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
	protected int anInt5127;

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
	protected final int anInt5130;

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
	protected int anInt5129;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class25_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean487 = arg3;
		this.anInt5127 = arg2;
		this.aBoolean486 = arg4;
		this.anInt5130 = arg1;
		this.anInt5129 = arg0;
	}
}

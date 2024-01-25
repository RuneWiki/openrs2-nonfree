import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public abstract class Class8_Sub5 extends Class8 {

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "Z")
	public boolean aBoolean461 = false;

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "Z")
	public boolean aBoolean462 = false;

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
	protected int anInt6321;

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
	protected final int anInt6324;

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
	protected int anInt6322;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class8_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6321 = arg2;
		this.anInt6324 = arg1;
		this.aBoolean462 = arg3;
		this.anInt6322 = arg0;
		this.aBoolean461 = arg4;
	}
}

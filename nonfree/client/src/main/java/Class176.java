import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public final class Class176 {

	@OriginalMember(owner = "client!of", name = "b", descriptor = "I")
	public int anInt4327;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "Lclient!of;")
	public Class176 aClass176_2;

	@OriginalMember(owner = "client!of", name = "d", descriptor = "I")
	public int anInt4328;

	@OriginalMember(owner = "client!of", name = "i", descriptor = "I")
	public int anInt4332;

	@OriginalMember(owner = "client!of", name = "j", descriptor = "I")
	public int anInt4333;

	@OriginalMember(owner = "client!of", name = "k", descriptor = "I")
	public int anInt4334;

	@OriginalMember(owner = "client!of", name = "o", descriptor = "I")
	public int anInt4337;

	@OriginalMember(owner = "client!of", name = "s", descriptor = "I")
	public int anInt4339;

	@OriginalMember(owner = "client!of", name = "t", descriptor = "I")
	public int anInt4340;

	@OriginalMember(owner = "client!of", name = "v", descriptor = "I")
	public int anInt4341;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "I")
	public final int anInt4329;

	@OriginalMember(owner = "client!of", name = "p", descriptor = "B")
	public final byte aByte47;

	@OriginalMember(owner = "client!of", name = "l", descriptor = "I")
	public final int anInt4335;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "I")
	public final int anInt4336;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "I")
	public final int anInt4330;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(IIIIB)V")
	public Class176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt4329 = arg0;
		this.aByte47 = arg4;
		this.anInt4335 = arg2;
		this.anInt4336 = arg1;
		this.anInt4330 = arg3;
	}

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!of;I)V")
	public Class176(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1) {
		this.aClass176_2 = arg0;
		this.aByte47 = this.aClass176_2.aByte47;
		this.anInt4330 = arg1 + this.aClass176_2.anInt4330;
		this.anInt4336 = arg1 + this.aClass176_2.anInt4336;
		this.anInt4329 = this.aClass176_2.anInt4329;
		this.anInt4335 = arg1 + this.aClass176_2.anInt4335;
	}
}

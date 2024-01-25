import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class191 {

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "[B")
	public static final byte[] aByteArray83 = new byte[32896];

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
	public int anInt5269;

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
	public int anInt5274;

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
	public int anInt5276;

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "Lclient!qm;")
	public Class191 aClass191_2;

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
	public int anInt5277;

	@OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
	public int anInt5279;

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
	public int anInt5280;

	@OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
	public int anInt5282;

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
	public int anInt5283;

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
	public int anInt5284;

	@OriginalMember(owner = "client!qm", name = "u", descriptor = "B")
	public final byte aByte54;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
	public final int anInt5268;

	@OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
	public final int anInt5278;

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
	public final int anInt5273;

	@OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
	public final int anInt5275;

	static {
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			for (@Pc(13) int local13 = 0; local13 <= local10; local13++) {
				aByteArray83[local8++] = (byte) (255.0D / Math.sqrt((double) ((float) (local13 * local13 + local10 * local10 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(IIIIB)V")
	public Class191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte54 = arg4;
		this.anInt5268 = arg0;
		this.anInt5278 = arg3;
		this.anInt5273 = arg1;
		this.anInt5275 = arg2;
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!qm;I)V")
	public Class191(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1) {
		this.aClass191_2 = arg0;
		this.anInt5273 = arg1 + this.aClass191_2.anInt5273;
		this.aByte54 = this.aClass191_2.aByte54;
		this.anInt5278 = arg1 + this.aClass191_2.anInt5278;
		this.anInt5268 = this.aClass191_2.anInt5268;
		this.anInt5275 = arg1 + this.aClass191_2.anInt5275;
	}
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public final class Class2_Sub24_Sub1 extends Class2_Sub24 {

	@OriginalMember(owner = "client!rp", name = "G", descriptor = "[I")
	public static final int[] anIntArray387 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!rp", name = "z", descriptor = "Lclient!hu;")
	public static final Class98 aClass98_49 = new Class98(4);

	@OriginalMember(owner = "client!rp", name = "D", descriptor = "J")
	public long aLong175;

	@OriginalMember(owner = "client!rp", name = "E", descriptor = "I")
	public int anInt5752;

	@OriginalMember(owner = "client!rp", name = "H", descriptor = "I")
	public int anInt5754;

	@OriginalMember(owner = "client!rp", name = "M", descriptor = "I")
	public int anInt5758;

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(Z)I", line = 4)
	@Override
	public int method5248() {
		return this.anInt5752;
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(B)I", line = 66)
	@Override
	public int method5243() {
		return this.anInt5754;
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)I", line = 117)
	@Override
	public int method5244() {
		return this.anInt5758;
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(B)J", line = 170)
	@Override
	public long method5249() {
		return this.aLong175;
	}
}

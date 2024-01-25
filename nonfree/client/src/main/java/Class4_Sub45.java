import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class4_Sub45 extends Class4 {

	@OriginalMember(owner = "client!uw", name = "y", descriptor = "[F")
	public static final float[] aFloatArray39 = new float[16384];

	@OriginalMember(owner = "client!uw", name = "D", descriptor = "[F")
	public static final float[] aFloatArray40 = new float[16384];

	@OriginalMember(owner = "client!uw", name = "r", descriptor = "I")
	public final int anInt7348;

	@OriginalMember(owner = "client!uw", name = "B", descriptor = "I")
	public final int anInt7357;

	static {
		@Pc(30) double local30 = 3.834951969714103E-4D;
		for (@Pc(32) int local32 = 0; local32 < 16384; local32++) {
			aFloatArray39[local32] = (float) Math.sin(local30 * (double) local32);
			aFloatArray40[local32] = (float) Math.cos((double) local32 * local30);
		}
		new Class21(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(II)V")
	public Class4_Sub45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7348 = arg1;
		this.anInt7357 = arg0;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(II)Z")
	public boolean method5904(@OriginalArg(0) int arg0) {
		return (this.anInt7357 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)I")
	public int method5906() {
		return Static98.method1863(this.anInt7357);
	}

	@OriginalMember(owner = "client!uw", name = "d", descriptor = "(B)Z")
	public boolean method5907() {
		return (this.anInt7357 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)Z")
	public boolean method5908() {
		return (this.anInt7357 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "(B)I")
	public int method5909() {
		return this.anInt7357 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "(I)Z")
	public boolean method5911() {
		return (this.anInt7357 >> 22 & 0x1) != 0;
	}
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public final class Class5_Sub25_Sub1 extends Class5_Sub25 {

	@OriginalMember(owner = "client!gaa", name = "m", descriptor = "J")
	public long aLong110;

	@OriginalMember(owner = "client!gaa", name = "o", descriptor = "I")
	public int anInt2904;

	@OriginalMember(owner = "client!gaa", name = "p", descriptor = "I")
	public int anInt2905;

	@OriginalMember(owner = "client!gaa", name = "q", descriptor = "I")
	public int anInt2906;

	@OriginalMember(owner = "client!gaa", name = "u", descriptor = "I")
	public int anInt2909;

	@OriginalMember(owner = "client!gaa", name = "e", descriptor = "(B)I")
	@Override
	public int method3318() {
		return this.anInt2906;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)I")
	@Override
	public int method3313() {
		return this.anInt2909;
	}

	@OriginalMember(owner = "client!gaa", name = "d", descriptor = "(B)I")
	@Override
	public int method3315() {
		return this.anInt2905;
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(B)J")
	@Override
	public long method3314() {
		return this.aLong110;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)I")
	@Override
	public int method3316() {
		return this.anInt2904;
	}
}

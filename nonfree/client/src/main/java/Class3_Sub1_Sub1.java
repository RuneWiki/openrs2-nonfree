import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!qn", name = "u", descriptor = "J")
	public long aLong179;

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
	public int anInt5992;

	@OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
	public int anInt5993;

	@OriginalMember(owner = "client!qn", name = "F", descriptor = "I")
	public int anInt5995;

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)J")
	@Override
	public long method4773() {
		return this.aLong179;
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(B)I")
	@Override
	public int method4775() {
		return this.anInt5995;
	}

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)I")
	@Override
	public int method4777() {
		return this.anInt5992;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)I")
	@Override
	public int method4772() {
		return this.anInt5993;
	}
}

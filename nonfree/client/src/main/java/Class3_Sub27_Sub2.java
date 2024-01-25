import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public final class Class3_Sub27_Sub2 extends Class3_Sub27 {

	@OriginalMember(owner = "client!oea", name = "x", descriptor = "J")
	public long aLong185;

	@OriginalMember(owner = "client!oea", name = "y", descriptor = "I")
	public int anInt6630;

	@OriginalMember(owner = "client!oea", name = "z", descriptor = "I")
	public int anInt6631;

	@OriginalMember(owner = "client!oea", name = "A", descriptor = "I")
	public int anInt6632;

	@OriginalMember(owner = "client!oea", name = "B", descriptor = "I")
	public int anInt6633;

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)I")
	@Override
	public int method5338() {
		return this.anInt6632;
	}

	@OriginalMember(owner = "client!oea", name = "d", descriptor = "(B)I")
	@Override
	public int method5341() {
		return this.anInt6633;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Z)I")
	@Override
	public int method5337() {
		return this.anInt6630;
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)J")
	@Override
	public long method5339() {
		return this.aLong185;
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(Z)I")
	@Override
	public int method5340() {
		return this.anInt6631;
	}
}

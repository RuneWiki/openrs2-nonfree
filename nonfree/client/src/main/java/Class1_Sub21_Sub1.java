import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public final class Class1_Sub21_Sub1 extends Class1_Sub21 {

	@OriginalMember(owner = "client!is", name = "z", descriptor = "I")
	public int anInt2910;

	@OriginalMember(owner = "client!is", name = "B", descriptor = "I")
	public int anInt2912;

	@OriginalMember(owner = "client!is", name = "F", descriptor = "I")
	public int anInt2915;

	@OriginalMember(owner = "client!is", name = "G", descriptor = "J")
	public long aLong98;

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(Z)I")
	@Override
	public int method2703() {
		return this.anInt2915;
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(B)J")
	@Override
	public long method2700() {
		return this.aLong98;
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(I)I")
	@Override
	public int method2704() {
		return this.anInt2912;
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(Z)I")
	@Override
	public int method2701() {
		return this.anInt2910;
	}
}

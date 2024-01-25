import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!am", name = "k", descriptor = "J")
	public long aLong6;

	@OriginalMember(owner = "client!am", name = "l", descriptor = "Lclient!am;")
	public Class13_Sub1 aClass13_Sub1_1;

	@OriginalMember(owner = "client!am", name = "n", descriptor = "Z")
	public boolean aBoolean24;

	@OriginalMember(owner = "client!am", name = "o", descriptor = "I")
	public int anInt221;

	@OriginalMember(owner = "client!am", name = "r", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!am", name = "t", descriptor = "I")
	public int anInt224;

	static {
		new Class136("", 76);
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(I)C")
	@Override
	public char method120() {
		return this.aChar1;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method118() {
		return this.aBoolean24;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)I")
	@Override
	public int method122() {
		return this.anInt221;
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "(I)J")
	@Override
	public long method121() {
		return this.aLong6;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)I")
	@Override
	public int method119() {
		return this.anInt224;
	}
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
	public int anInt781;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
	public int anInt782;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "J")
	public long aLong29;

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "Z")
	public boolean aBoolean44;

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "Lclient!bg;")
	public Class19_Sub1 aClass19_Sub1_4;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)C")
	@Override
	public char method732() {
		return this.aChar1;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)I")
	@Override
	public int method730() {
		return this.anInt781;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method734() {
		return this.aBoolean44;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)I")
	@Override
	public int method735() {
		return this.anInt782;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)J")
	@Override
	public long method733() {
		return this.aLong29;
	}
}

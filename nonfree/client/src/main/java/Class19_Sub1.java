import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
	public int anInt459;

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "Lclient!bg;")
	public Class19_Sub1 aClass19_Sub1_1;

	@OriginalMember(owner = "client!bg", name = "o", descriptor = "Z")
	public boolean aBoolean34;

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "J")
	public long aLong21;

	@OriginalMember(owner = "client!bg", name = "u", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
	public int anInt468;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)I")
	@Override
	public int method429() {
		return this.anInt459;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)I")
	@Override
	public int method422() {
		return this.anInt468;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)J")
	@Override
	public long method424() {
		return this.aLong21;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method426() {
		return this.aBoolean34;
	}

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)C")
	@Override
	public char method427() {
		return this.aChar1;
	}
}

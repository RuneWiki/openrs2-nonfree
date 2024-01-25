import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class21_Sub1 extends Class21 {

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
	public int anInt3840;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "Z")
	public boolean aBoolean265;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "J")
	public long aLong118;

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
	public int anInt3844;

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "Lclient!kg;")
	public Class21_Sub1 aClass21_Sub1_1;

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)I")
	@Override
	public int method3178() {
		return this.anInt3840;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method3177() {
		return this.aBoolean265;
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)J")
	@Override
	public long method3184() {
		return this.aLong118;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)I")
	@Override
	public int method3182() {
		return this.anInt3844;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)C")
	@Override
	public char method3180() {
		return this.aChar3;
	}
}

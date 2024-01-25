import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	public int anInt3915;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "Lclient!mb;")
	public Class15_Sub1 aClass15_Sub1_1;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "Z")
	public boolean aBoolean292;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "J")
	public long aLong131;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
	public int anInt3921;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)I")
	@Override
	public int method3588() {
		return this.anInt3915;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method3590() {
		return this.aBoolean292;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)C")
	@Override
	public char method3593() {
		return this.aChar5;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)I")
	@Override
	public int method3594() {
		return this.anInt3921;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)J")
	@Override
	public long method3595() {
		return this.aLong131;
	}
}

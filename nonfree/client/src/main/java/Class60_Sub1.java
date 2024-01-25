import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public final class Class60_Sub1 extends Class60 {

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
	public int anInt3958;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "Z")
	public boolean aBoolean339;

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "Lclient!ke;")
	public Class60_Sub1 aClass60_Sub1_4;

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
	public int anInt3960;

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "J")
	public long aLong127;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)J")
	@Override
	public long method3178() {
		return this.aLong127;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)C")
	@Override
	public char method3179() {
		return this.aChar2;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)I")
	@Override
	public int method3173() {
		return this.anInt3958;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method3172() {
		return this.aBoolean339;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)I")
	@Override
	public int method3174() {
		return this.anInt3960;
	}
}

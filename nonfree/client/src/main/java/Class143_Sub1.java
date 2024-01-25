import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public final class Class143_Sub1 extends Class143 {

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "Lclient!kr;")
	public Class143_Sub1 aClass143_Sub1_1;

	@OriginalMember(owner = "client!kr", name = "k", descriptor = "Z")
	public boolean aBoolean277;

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
	public int anInt3471;

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
	public int anInt3475;

	@OriginalMember(owner = "client!kr", name = "r", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!kr", name = "t", descriptor = "J")
	public long aLong105;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method2865() {
		return this.aBoolean277;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)I")
	@Override
	public int method2870() {
		return this.anInt3471;
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)C")
	@Override
	public char method2873() {
		return this.aChar4;
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)J")
	@Override
	public long method2875() {
		return this.aLong105;
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)I")
	@Override
	public int method2871() {
		return this.anInt3475;
	}
}

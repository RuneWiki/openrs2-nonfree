import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class150_Sub1 extends Class150 {

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "Z")
	public boolean aBoolean317;

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
	public int anInt4256;

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "Lclient!lo;")
	public Class150_Sub1 aClass150_Sub1_4;

	@OriginalMember(owner = "client!lo", name = "n", descriptor = "I")
	public int anInt4259;

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!lo", name = "s", descriptor = "J")
	public long aLong115;

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method3232() {
		return this.aBoolean317;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)C")
	@Override
	public char method3230() {
		return this.aChar2;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)I")
	@Override
	public int method3231() {
		return this.anInt4256;
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(B)I")
	@Override
	public int method3235() {
		return this.anInt4259;
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)J")
	@Override
	public long method3233() {
		return this.aLong115;
	}
}

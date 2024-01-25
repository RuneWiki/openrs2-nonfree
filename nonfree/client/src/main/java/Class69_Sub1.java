import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class69_Sub1 extends Class69 {

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
	public int anInt6382;

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "Lclient!ud;")
	public Class69_Sub1 aClass69_Sub1_1;

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
	public int anInt6387;

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "J")
	public long aLong195;

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "Z")
	public boolean aBoolean564;

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)I")
	@Override
	public int method5553() {
		return this.anInt6387;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)C")
	@Override
	public char method5546() {
		return this.aChar4;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)J")
	@Override
	public long method5550() {
		return this.aLong195;
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5552() {
		return this.aBoolean564;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)I")
	@Override
	public int method5547() {
		return this.anInt6382;
	}
}

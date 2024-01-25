import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public final class Class128_Sub1 extends Class128 {

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
	public int anInt6058;

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "J")
	public long aLong184;

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "Z")
	public boolean aBoolean684;

	@OriginalMember(owner = "client!rs", name = "o", descriptor = "I")
	public int anInt6064;

	@OriginalMember(owner = "client!rs", name = "p", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!rs", name = "q", descriptor = "Lclient!rs;")
	public Class128_Sub1 aClass128_Sub1_4;

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(Z)C")
	@Override
	public char method4780() {
		return this.aChar5;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)I")
	@Override
	public int method4779() {
		return this.anInt6064;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)I")
	@Override
	public int method4778() {
		return this.anInt6058;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4781() {
		return this.aBoolean684;
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)J")
	@Override
	public long method4782() {
		return this.aLong184;
	}
}

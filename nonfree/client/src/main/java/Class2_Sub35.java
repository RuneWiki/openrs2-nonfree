import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public final class Class2_Sub35 extends Class2 implements Interface22 {

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "I")
	public int anInt6109;

	@OriginalMember(owner = "client!nv", name = "p", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!nv", name = "r", descriptor = "I")
	public int anInt6111;

	@OriginalMember(owner = "client!nv", name = "u", descriptor = "I")
	public int anInt6113;

	@OriginalMember(owner = "client!nv", name = "x", descriptor = "J")
	public long aLong177;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)J")
	@Override
	public long method5224() {
		return this.aLong177;
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)I")
	@Override
	public int method5227() {
		return this.anInt6111;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)I")
	@Override
	public int method5225() {
		return this.anInt6113;
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)C")
	@Override
	public char method5226() {
		return this.aChar4;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)I")
	@Override
	public int method5223() {
		return this.anInt6109;
	}
}

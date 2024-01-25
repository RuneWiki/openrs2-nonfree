import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public final class Class1_Sub32_Sub2 extends Class1_Sub32 {

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
	public int anInt6360;

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "J")
	public long aLong173;

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
	public int anInt6361;

	@OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
	public int anInt6362;

	@OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
	public int anInt6363;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)I")
	@Override
	public int method5774() {
		return this.anInt6362;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)I")
	@Override
	public int method5776() {
		return this.anInt6363;
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)I")
	@Override
	public int method5775() {
		return this.anInt6361;
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)J")
	@Override
	public long method5778() {
		return this.aLong173;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)I")
	@Override
	public int method5772() {
		return this.anInt6360;
	}
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public final class Class3_Sub43_Sub1 extends Class3_Sub43 {

	@OriginalMember(owner = "client!oda", name = "r", descriptor = "I")
	public int anInt6771;

	@OriginalMember(owner = "client!oda", name = "s", descriptor = "I")
	public int anInt6772;

	@OriginalMember(owner = "client!oda", name = "t", descriptor = "I")
	public int anInt6773;

	@OriginalMember(owner = "client!oda", name = "u", descriptor = "I")
	public int anInt6774;

	@OriginalMember(owner = "client!oda", name = "v", descriptor = "J")
	public long aLong216;

	@OriginalMember(owner = "client!oda", name = "e", descriptor = "(I)I")
	@Override
	public int method7776() {
		return this.anInt6773;
	}

	@OriginalMember(owner = "client!oda", name = "f", descriptor = "(I)I")
	@Override
	public int method7777() {
		return this.anInt6774;
	}

	@OriginalMember(owner = "client!oda", name = "g", descriptor = "(I)I")
	@Override
	public int method7778() {
		return this.anInt6772;
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)I")
	@Override
	public int method7774() {
		return this.anInt6771;
	}

	@OriginalMember(owner = "client!oda", name = "h", descriptor = "(I)J")
	@Override
	public long method7779() {
		return this.aLong216;
	}
}

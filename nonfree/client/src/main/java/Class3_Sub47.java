import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class3_Sub47 extends Class3 implements Interface22 {

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
	public int anInt8003;

	@OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
	public int anInt8005;

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
	public int anInt8010;

	@OriginalMember(owner = "client!qe", name = "y", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "J")
	public long aLong240;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)J")
	@Override
	public long method7007() {
		return this.aLong240;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)I")
	@Override
	public int method7004() {
		return this.anInt8003;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)I")
	@Override
	public int method7003() {
		return this.anInt8005;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)C")
	@Override
	public char method7006() {
		return this.aChar3;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)I")
	@Override
	public int method7005() {
		return this.anInt8010;
	}
}

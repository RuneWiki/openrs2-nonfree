import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public final class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!hv", name = "h", descriptor = "J")
	public long aLong91;

	@OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
	public int anInt3245;

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!hv", name = "o", descriptor = "Z")
	public boolean aBoolean216;

	@OriginalMember(owner = "client!hv", name = "q", descriptor = "I")
	public int anInt3251;

	@OriginalMember(owner = "client!hv", name = "r", descriptor = "Lclient!hv;")
	public Class40_Sub1 aClass40_Sub1_1;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method2678() {
		return this.aBoolean216;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)J")
	@Override
	public long method2680() {
		return this.aLong91;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)I")
	@Override
	public int method2683() {
		return this.anInt3251;
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)I")
	@Override
	public int method2681() {
		return this.anInt3245;
	}

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "(I)C")
	@Override
	public char method2682() {
		return this.aChar3;
	}
}

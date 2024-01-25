import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public final class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!au", name = "q", descriptor = "I")
	public int anInt359;

	@OriginalMember(owner = "client!au", name = "t", descriptor = "I")
	public int anInt362;

	@OriginalMember(owner = "client!au", name = "u", descriptor = "I")
	public int anInt363;

	@OriginalMember(owner = "client!au", name = "v", descriptor = "I")
	public int anInt364;

	@OriginalMember(owner = "client!au", name = "w", descriptor = "I")
	public int anInt365;

	@OriginalMember(owner = "client!au", name = "z", descriptor = "I")
	public int anInt366 = -1;

	@OriginalMember(owner = "client!au", name = "A", descriptor = "Z")
	public boolean aBoolean19 = false;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(I)V")
	public Class4_Sub4(@OriginalArg(0) int arg0) {
		this.anInt366 = arg0;
	}
}

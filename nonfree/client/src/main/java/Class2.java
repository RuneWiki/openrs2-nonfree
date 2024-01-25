import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
	public int anInt5;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
	public int anInt6;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
	public int anInt7;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "Z")
	public boolean aBoolean1;
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public final class Class3_Sub2_Sub1_Sub7 extends Class3_Sub2_Sub1 {

	@OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
	public int anInt3718;

	@OriginalMember(owner = "client!uh", name = "U", descriptor = "I")
	public int anInt3721;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)Lclient!fd;")
	@Override
	protected Class3_Sub2_Sub1_Sub2 method2683() {
		return Static146.method2432(this.anInt3721).method2427(null, this.anInt3718, 0);
	}
}

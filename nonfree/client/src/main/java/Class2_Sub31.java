import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class2_Sub31 extends Class2 {

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "Lclient!hg;")
	public Class145 aClass145_100;

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
	public int anInt5736;

	@OriginalMember(owner = "client!lk", name = "o", descriptor = "Lclient!ei;")
	public Class2_Sub17_Sub1 aClass2_Sub17_Sub1_2;

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
	public int anInt5738;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)V")
	public void method4992() {
		if (Static599.anInt9925 < Static494.aClass2_Sub31Array1.length) {
			Static494.aClass2_Sub31Array1[Static599.anInt9925++] = this;
		}
	}
}

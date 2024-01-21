import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SIBDNEIR")
public final class Class3_Sub1_Sub2_Sub5 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!SIBDNEIR", name = "o", descriptor = "I")
	public int anInt486;

	@OriginalMember(owner = "client!SIBDNEIR", name = "p", descriptor = "I")
	public int anInt487;

	@OriginalMember(owner = "client!SIBDNEIR", name = "n", descriptor = "I")
	private int anInt485 = -23175;

	@OriginalMember(owner = "client!SIBDNEIR", name = "q", descriptor = "Z")
	private boolean aBoolean155 = true;

	@OriginalMember(owner = "client!SIBDNEIR", name = "a", descriptor = "(Z)Lclient!YABPKWWG;")
	@Override
	protected Class3_Sub1_Sub2_Sub6 method505() {
		try {
			@Pc(8) Class34 local8 = Class34.method361(this.anInt487);
			return local8.method364(this.anInt486);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("81804, " + true + ", " + local14.toString());
			throw new RuntimeException();
		}
	}
}

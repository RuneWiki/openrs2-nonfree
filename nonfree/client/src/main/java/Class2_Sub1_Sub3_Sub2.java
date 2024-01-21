import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KBARUPZK")
public final class Class2_Sub1_Sub3_Sub2 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!KBARUPZK", name = "n", descriptor = "I")
	public int anInt275;

	@OriginalMember(owner = "client!KBARUPZK", name = "p", descriptor = "I")
	public int anInt276;

	@OriginalMember(owner = "client!KBARUPZK", name = "o", descriptor = "Z")
	private boolean aBoolean101 = false;

	@OriginalMember(owner = "client!KBARUPZK", name = "a", descriptor = "(B)Lclient!RMLAXPMV;")
	@Override
	protected Class2_Sub1_Sub3_Sub4 method489(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 3) {
				this.aBoolean101 = !this.aBoolean101;
			}
			@Pc(14) Class32 local14 = Class32.method412(this.anInt276);
			return local14.method413(this.anInt275);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("31917, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}
}

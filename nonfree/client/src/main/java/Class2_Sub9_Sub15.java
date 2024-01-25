import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class2_Sub9_Sub15 extends Class2_Sub9 {

	@OriginalMember(owner = "client!mm", name = "N", descriptor = "Ljava/lang/String;")
	public String aString43;

	@OriginalMember(owner = "client!mm", name = "P", descriptor = "C")
	private char aChar4;

	@OriginalMember(owner = "client!mm", name = "R", descriptor = "I")
	public int anInt4464;

	@OriginalMember(owner = "client!mm", name = "S", descriptor = "Z")
	public boolean aBoolean383 = true;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!ef;II)V")
	private void method3874(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static294.method4922(arg0.method3122());
		} else if (arg1 == 2) {
			this.anInt4464 = arg0.method3135();
		} else if (arg1 == 4) {
			this.aBoolean383 = false;
		} else if (arg1 == 5) {
			this.aString43 = arg0.method3113();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZLclient!ef;)V")
	public void method3876(@OriginalArg(1) Class2_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3124();
			if (local5 == 0) {
				return;
			}
			this.method3874(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "(B)Z")
	public boolean method3878() {
		return this.aChar4 == 's';
	}
}

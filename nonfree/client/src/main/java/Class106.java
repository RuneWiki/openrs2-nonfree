import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class106 {

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "Ljava/lang/String;")
	public String aString27;

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
	public int anInt3103;

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "C")
	private char aChar4;

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "Z")
	public boolean aBoolean275 = true;

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)Z")
	public boolean method2801() {
		return this.aChar4 == 's';
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IBLclient!un;)V")
	private void method2804(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static103.method2211(arg1.method4925());
		} else if (arg0 == 2) {
			this.anInt3103 = arg1.method4931();
		} else if (arg0 == 4) {
			this.aBoolean275 = false;
		} else if (arg0 == 5) {
			this.aString27 = arg1.method4920();
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BLclient!un;)V")
	public void method2806(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method4905();
			if (local16 == 0) {
				return;
			}
			this.method2804(local16, arg0);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class41 {

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "Ljava/lang/String;")
	public String aString27;

	@OriginalMember(owner = "client!bs", name = "h", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
	public int anInt1311;

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "Z")
	public boolean aBoolean108 = true;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IILclient!ie;)V")
	private void method1205(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static135.method2636(arg1.method6825());
		} else if (arg0 == 2) {
			this.anInt1311 = arg1.method6816();
		} else if (arg0 == 4) {
			this.aBoolean108 = false;
		} else if (arg0 == 5) {
			this.aString27 = arg1.method6786();
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!ie;I)V")
	public void method1206(@OriginalArg(0) Class3_Sub26 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method6814();
			if (local7 == 0) {
				return;
			}
			this.method1205(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)Z")
	public boolean method1208() {
		return this.aChar1 == 's';
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class71 {

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
	public int anInt1963;

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "Ljava/lang/String;")
	public String aString18;

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "C")
	private char aChar2;

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "Z")
	public boolean aBoolean124 = true;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BLclient!ge;)V")
	public void method1653(@OriginalArg(1) Class1_Sub6 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method3922();
			if (local10 == 0) {
				return;
			}
			this.method1655(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)Z")
	public boolean method1654() {
		return this.aChar2 == 's';
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!ge;BI)V")
	private void method1655(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static147.method2361(arg0.method3928());
		} else if (arg1 == 2) {
			this.anInt1963 = arg0.method3925();
		} else if (arg1 == 4) {
			this.aBoolean124 = false;
		} else if (arg1 == 5) {
			this.aString18 = arg0.method3954();
		}
	}
}

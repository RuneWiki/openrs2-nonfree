import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class10 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "I")
	public int anInt193;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "C")
	private char aChar2;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "Z")
	public boolean aBoolean6 = true;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!np;I)V")
	public void method148(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5175();
			if (local5 == 0) {
				return;
			}
			this.method153(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Z")
	public boolean method151() {
		return this.aChar2 == 's';
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IBLclient!np;)V")
	private void method153(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static231.method3591(arg1.method5212());
		} else if (arg0 == 2) {
			this.anInt193 = arg1.method5186();
		} else if (arg0 == 4) {
			this.aBoolean6 = false;
		} else if (arg0 == 5) {
			this.aString1 = arg1.method5181();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public final class Class275 {

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "I")
	public int anInt8186;

	@OriginalMember(owner = "client!qfa", name = "h", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!qfa", name = "j", descriptor = "Ljava/lang/String;")
	public String aString170;

	@OriginalMember(owner = "client!qfa", name = "e", descriptor = "Z")
	public boolean aBoolean585 = true;

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILclient!ek;Z)V")
	private void method6373(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub13 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static320.method5004(arg1.method7011());
		} else if (arg0 == 2) {
			this.anInt8186 = arg1.method6990();
		} else if (arg0 == 4) {
			this.aBoolean585 = false;
		} else if (arg0 == 5) {
			this.aString170 = arg1.method7016();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)Z")
	public boolean method6374() {
		return this.aChar5 == 's';
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BLclient!ek;)V")
	public void method6376(@OriginalArg(1) Class4_Sub13 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method7004();
			if (local17 == 0) {
				return;
			}
			this.method6373(local17, arg0);
		}
	}
}

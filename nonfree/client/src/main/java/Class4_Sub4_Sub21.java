import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class4_Sub4_Sub21 extends Class4_Sub4 {

	@OriginalMember(owner = "client!vi", name = "D", descriptor = "Ljava/lang/String;")
	public String aString64;

	@OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
	public int anInt6440;

	@OriginalMember(owner = "client!vi", name = "I", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!vi", name = "F", descriptor = "Z")
	public boolean aBoolean472 = true;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IILclient!lf;)V")
	private void method5431(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static36.method745(arg1.method3426());
		} else if (arg0 == 2) {
			this.anInt6440 = arg1.method3418();
		} else if (arg0 == 4) {
			this.aBoolean472 = false;
		} else if (arg0 == 5) {
			this.aString64 = arg1.method3446();
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)Z")
	public boolean method5432() {
		return this.aChar5 == 's';
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!lf;I)V")
	public void method5436(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3440();
			if (local5 == 0) {
				return;
			}
			this.method5431(local5, arg0);
		}
	}
}

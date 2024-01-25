import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class240 {

	@OriginalMember(owner = "client!of", name = "e", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "Ljava/lang/String;")
	public String aString83;

	@OriginalMember(owner = "client!of", name = "k", descriptor = "I")
	public int anInt7291;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "Z")
	public boolean aBoolean618 = true;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!fd;BI)V")
	private void method6071(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static142.method2866(arg0.method6529());
		} else if (arg1 == 2) {
			this.anInt7291 = arg0.method6497();
		} else if (arg1 == 4) {
			this.aBoolean618 = false;
		} else if (arg1 == 5) {
			this.aString83 = arg0.method6536();
			return;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!fd;B)V")
	public void method6072(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method6538();
			if (local7 == 0) {
				return;
			}
			this.method6071(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)Z")
	public boolean method6075() {
		return this.aChar5 == 's';
	}
}

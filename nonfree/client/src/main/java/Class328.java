import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tea")
public final class Class328 {

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "Ljava/lang/String;")
	public String aString87;

	@OriginalMember(owner = "client!tea", name = "j", descriptor = "I")
	public int anInt8782;

	@OriginalMember(owner = "client!tea", name = "k", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "Z")
	public boolean aBoolean623 = true;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IILclient!sl;)V")
	private void method7525(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static95.method1918(arg1.method2860());
		} else if (arg0 == 2) {
			this.anInt8782 = arg1.method2881();
		} else if (arg0 == 4) {
			this.aBoolean623 = false;
		} else if (arg0 == 5) {
			this.aString87 = arg1.method2833();
			return;
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!sl;B)V")
	public void method7526(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2859();
			if (local3 == 0) {
				return;
			}
			this.method7525(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(I)Z")
	public boolean method7527() {
		return this.aChar5 == 's';
	}
}

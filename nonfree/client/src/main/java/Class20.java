import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class20 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	public int anInt905;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	public int anInt906;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	public int anInt911;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!ql;)V")
	public void method582(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1772();
			if (local5 == 0) {
				return;
			}
			this.method584(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ql;II)V")
	private void method584(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt911 = arg0.method1764();
			this.anInt906 = arg0.method1772();
			this.anInt905 = arg0.method1772();
		}
	}
}

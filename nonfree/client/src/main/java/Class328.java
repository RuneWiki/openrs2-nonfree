import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class328 {

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "[Lclient!em;")
	public static final Class105[] aClass105Array1 = new Class105[5];

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "Ljava/lang/String;")
	public String aString108;

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
	public int anInt8911;

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "Z")
	public boolean aBoolean663 = true;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass105Array1.length; local4++) {
			aClass105Array1[local4] = new Class105();
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLclient!fca;)V")
	public void method7562(@OriginalArg(1) Class3_Sub17 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method4888();
			if (local10 == 0) {
				return;
			}
			this.method7565(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!fca;II)V")
	private void method7565(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static669.method8682(arg0.method4861());
		} else if (arg1 == 2) {
			this.anInt8911 = arg0.method4868();
		} else if (arg1 == 4) {
			this.aBoolean663 = false;
		} else if (arg1 == 5) {
			this.aString108 = arg0.method4847();
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)Z")
	public boolean method7566() {
		return this.aChar5 == 's';
	}
}

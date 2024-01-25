import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fia")
public final class Class108 {

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "C")
	private char aChar2;

	@OriginalMember(owner = "client!fia", name = "c", descriptor = "I")
	public int anInt3158;

	@OriginalMember(owner = "client!fia", name = "f", descriptor = "Z")
	public boolean aBoolean237 = true;

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(B)Z")
	public boolean method2736() {
		return this.aChar2 == 's';
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(ILclient!dc;)V")
	public void method2737(@OriginalArg(1) Class3_Sub9 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5633();
			if (local14 == 0) {
				return;
			}
			this.method2739(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(Lclient!dc;ZI)V")
	private void method2739(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static408.method6346(arg0.method5619());
		} else if (arg1 == 2) {
			this.anInt3158 = arg0.method5585();
		} else if (arg1 == 4) {
			this.aBoolean237 = false;
			return;
		} else if (arg1 == 5) {
			this.aString23 = arg0.method5607();
			return;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class132 {

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
	public int anInt3608;

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "Ljava/lang/String;")
	public String aString40;

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "Z")
	public boolean aBoolean265 = true;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!si;B)V")
	private void method2958(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub23 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static283.method1319(arg1.method5484());
		} else if (arg0 == 2) {
			this.anInt3608 = arg1.method5508();
		} else if (arg0 == 4) {
			this.aBoolean265 = false;
		} else if (arg0 == 5) {
			this.aString40 = arg1.method5494();
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)Z")
	public boolean method2959() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!si;I)V")
	public void method2961(@OriginalArg(0) Class2_Sub23 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5495();
			if (local5 == 0) {
				return;
			}
			this.method2958(local5, arg0);
		}
	}
}

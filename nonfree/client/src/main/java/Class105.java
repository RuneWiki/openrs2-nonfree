import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class105 {

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
	public int anInt2858;

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "Ljava/lang/String;")
	public String aString29;

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "Z")
	public boolean aBoolean201 = true;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILclient!io;)V")
	public void method2398(@OriginalArg(1) Class1_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4393();
			if (local5 == 0) {
				return;
			}
			this.method2401(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)Z")
	public boolean method2400() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!io;ZI)V")
	private void method2401(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static344.method5095(arg0.method4432());
		} else if (arg1 == 2) {
			this.anInt2858 = arg0.method4371();
		} else if (arg1 == 4) {
			this.aBoolean201 = false;
		} else if (arg1 == 5) {
			this.aString29 = arg0.method4388();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class104 {

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
	public int anInt2631;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "C")
	private char aChar2;

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "Ljava/lang/String;")
	public String aString25;

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "Z")
	public boolean aBoolean201 = true;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)Z")
	public boolean method2213() {
		return this.aChar2 == 's';
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!rp;II)V")
	private void method2214(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static240.method4859(arg0.method2753());
		} else if (arg1 == 2) {
			this.anInt2631 = arg0.method2726();
		} else if (arg1 == 4) {
			this.aBoolean201 = false;
		} else if (arg1 == 5) {
			this.aString25 = arg0.method2788();
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILclient!rp;)V")
	public void method2219(@OriginalArg(1) Class3_Sub5 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2739();
			if (local5 == 0) {
				return;
			}
			this.method2214(arg0, local5);
		}
	}
}

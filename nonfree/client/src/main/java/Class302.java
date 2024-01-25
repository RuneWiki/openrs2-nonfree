import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ria")
public final class Class302 {

	@OriginalMember(owner = "client!ria", name = "c", descriptor = "Z")
	public boolean aBoolean610 = false;

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "Z")
	public boolean aBoolean609 = false;

	@OriginalMember(owner = "client!ria", name = "j", descriptor = "I")
	public int anInt8086 = 64;

	@OriginalMember(owner = "client!ria", name = "i", descriptor = "I")
	public int anInt8085 = 1;

	@OriginalMember(owner = "client!ria", name = "e", descriptor = "I")
	public int anInt8082 = -1;

	@OriginalMember(owner = "client!ria", name = "h", descriptor = "I")
	public int anInt8084 = 2;

	@OriginalMember(owner = "client!ria", name = "p", descriptor = "I")
	public int anInt8091 = 64;

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lclient!vj;BI)V")
	public void method6852(@OriginalArg(0) Class2_Sub22 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method8547();
			if (local5 == 0) {
				return;
			}
			this.method6853(arg1, local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IILclient!vj;B)V")
	private void method6853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub22 arg2) {
		if (arg1 == 1) {
			this.anInt8082 = arg2.method8546();
			if (this.anInt8082 == 65535) {
				this.anInt8082 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt8086 = arg2.method8546() + 1;
			this.anInt8091 = arg2.method8546() + 1;
		} else if (arg1 == 3) {
			arg2.method8548();
		} else if (arg1 == 4) {
			this.anInt8084 = arg2.method8547();
		} else if (arg1 == 5) {
			this.anInt8085 = arg2.method8547();
		} else if (arg1 == 6) {
			this.aBoolean609 = true;
		} else if (arg1 == 7) {
			this.aBoolean610 = true;
		}
	}
}

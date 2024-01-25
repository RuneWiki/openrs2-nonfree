import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class176 {

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "C")
	private char aChar4;

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
	public int anInt5158;

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "Ljava/lang/String;")
	public String aString44;

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "Z")
	public boolean aBoolean353 = true;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!wn;)V")
	public void method4370(@OriginalArg(1) Class4_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4614();
			if (local5 == 0) {
				return;
			}
			this.method4371(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILclient!wn;)V")
	private void method4371(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub20 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static154.method2864(arg1.method4576());
		} else if (arg0 == 2) {
			this.anInt5158 = arg1.method4595();
		} else if (arg0 == 4) {
			this.aBoolean353 = false;
		} else if (arg0 == 5) {
			this.aString44 = arg1.method4624();
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Z")
	public boolean method4372() {
		return this.aChar4 == 's';
	}
}

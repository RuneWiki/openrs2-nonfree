import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class22 {

	@OriginalMember(owner = "client!av", name = "g", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!av", name = "h", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!av", name = "e", descriptor = "I")
	public int anInt336;

	@OriginalMember(owner = "client!av", name = "d", descriptor = "Z")
	public boolean aBoolean18 = true;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)Z")
	public boolean method385() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!wq;I)V")
	public void method387(@OriginalArg(0) Class5_Sub36 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7291();
			if (local9 == 0) {
				return;
			}
			this.method388(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!wq;II)V")
	private void method388(@OriginalArg(0) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static92.method8227(arg0.method7318());
		} else if (arg1 == 2) {
			this.anInt336 = arg0.method7268();
		} else if (arg1 == 4) {
			this.aBoolean18 = false;
		} else if (arg1 == 5) {
			this.aString4 = arg0.method7281();
			return;
		}
	}
}

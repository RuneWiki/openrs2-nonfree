import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mia")
public final class Class230 {

	@OriginalMember(owner = "client!mia", name = "b", descriptor = "Ljava/lang/String;")
	public String aString95;

	@OriginalMember(owner = "client!mia", name = "g", descriptor = "I")
	public int anInt6315;

	@OriginalMember(owner = "client!mia", name = "h", descriptor = "C")
	private char aChar3;

	@OriginalMember(owner = "client!mia", name = "i", descriptor = "Z")
	public boolean aBoolean529 = true;

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)Z")
	public boolean method5600() {
		return this.aChar3 == 's';
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(Lclient!ee;Z)V")
	public void method5602(@OriginalArg(0) Class5_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8645();
			if (local5 == 0) {
				return;
			}
			this.method5605(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(IILclient!ee;)V")
	private void method5605(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static382.method8494(arg1.method8635());
		} else if (arg0 == 2) {
			this.anInt6315 = arg1.method8623();
		} else if (arg0 == 4) {
			this.aBoolean529 = false;
		} else if (arg0 == 5) {
			this.aString95 = arg1.method8617();
		}
	}
}

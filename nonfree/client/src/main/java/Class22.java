import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class22 {

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
	public int anInt376;

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "Z")
	public boolean aBoolean49 = true;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!et;B)V")
	public void method370(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method8581(-17416);
			if (local14 == 0) {
				return;
			}
			this.method374(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)Z")
	public boolean method372() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BLclient!et;I)V")
	private void method374(@OriginalArg(1) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static639.method8672(arg0.method8536());
		} else if (arg1 == 2) {
			this.anInt376 = arg0.method8555(-9372);
		} else if (arg1 == 4) {
			this.aBoolean49 = false;
		} else if (arg1 == 5) {
			this.aString1 = arg0.method8553();
			return;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class15 {

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
	public int anInt159 = 2;

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
	public int anInt160 = 1;

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "Z")
	public boolean aBoolean3 = false;

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
	public int anInt161 = 64;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "Z")
	public boolean aBoolean2 = false;

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
	public int anInt163 = 64;

	@OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
	public int anInt166 = -1;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!gk;IB)V")
	public void method116(@OriginalArg(0) Class7_Sub14 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method3981();
			if (local5 == 0) {
				return;
			}
			this.method117(local5, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIILclient!gk;)V")
	private void method117(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class7_Sub14 arg2) {
		if (arg0 == 1) {
			this.anInt166 = arg2.method3943();
			if (this.anInt166 == 65535) {
				this.anInt166 = -1;
				return;
			}
		} else if (arg0 == 2) {
			this.anInt161 = arg2.method3943() + 1;
			this.anInt163 = arg2.method3943() + 1;
		} else if (arg0 == 3) {
			arg2.method3930();
			return;
		} else if (arg0 == 4) {
			this.anInt159 = arg2.method3981();
			return;
		} else if (arg0 == 5) {
			this.anInt160 = arg2.method3981();
			return;
		} else {
			if (arg0 == 6) {
				this.aBoolean3 = true;
			} else if (arg0 == 7) {
				this.aBoolean2 = true;
				return;
			}
			return;
		}
	}
}

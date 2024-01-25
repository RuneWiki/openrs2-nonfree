import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class34 {

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
	public int anInt1154 = 1;

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "Z")
	public boolean aBoolean99 = false;

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
	public int anInt1150 = 64;

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
	public int anInt1151 = 64;

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
	public int anInt1157 = 2;

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
	public int anInt1153 = -1;

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "Z")
	public boolean aBoolean100 = false;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!os;III)V")
	private void method1218(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt1153 = arg0.method4494();
			if (this.anInt1153 == 65535) {
				this.anInt1153 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt1150 = arg0.method4494() + 1;
			this.anInt1151 = arg0.method4494() + 1;
		} else if (arg1 == 3) {
			arg0.method4482();
		} else if (arg1 == 4) {
			this.anInt1157 = arg0.method4487();
		} else if (arg1 == 5) {
			this.anInt1154 = arg0.method4487();
		} else if (arg1 == 6) {
			this.aBoolean99 = true;
		} else if (arg1 == 7) {
			this.aBoolean100 = true;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BILclient!os;)V")
	public void method1220(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		while (true) {
			@Pc(16) int local16 = arg1.method4487();
			if (local16 == 0) {
				return;
			}
			this.method1218(arg1, local16, arg0);
		}
	}
}

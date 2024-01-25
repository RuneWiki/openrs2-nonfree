import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class299 {

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
	public int anInt7984 = -1;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "Z")
	public boolean aBoolean607 = false;

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
	public int anInt7990 = 64;

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "Z")
	public boolean aBoolean608 = false;

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
	public int anInt7989 = 2;

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
	public int anInt7988 = 1;

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
	public int anInt7991 = 64;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!ac;BI)V")
	public void method6412(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(17) int local17 = arg0.method7974();
			if (local17 == 0) {
				return;
			}
			this.method6414(arg0, arg1, local17);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!ac;III)V")
	private void method6414(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt7984 = arg0.method7945();
			if (this.anInt7984 == 65535) {
				this.anInt7984 = -1;
			}
		} else if (arg2 == 2) {
			this.anInt7990 = arg0.method7945() + 1;
			this.anInt7991 = arg0.method7945() + 1;
		} else if (arg2 == 3) {
			arg0.method7963();
		} else if (arg2 == 4) {
			this.anInt7989 = arg0.method7974();
		} else if (arg2 == 5) {
			this.anInt7988 = arg0.method7974();
		} else if (arg2 == 6) {
			this.aBoolean607 = true;
		} else if (arg2 == 7) {
			this.aBoolean608 = true;
		}
	}
}

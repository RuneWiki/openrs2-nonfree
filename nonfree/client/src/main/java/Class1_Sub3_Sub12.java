import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class1_Sub3_Sub12 extends Class1_Sub3 {

	@OriginalMember(owner = "client!jh", name = "bb", descriptor = "I")
	public int anInt2005 = -1;

	@OriginalMember(owner = "client!jh", name = "V", descriptor = "I")
	public int anInt2002 = -1;

	@OriginalMember(owner = "client!jh", name = "db", descriptor = "I")
	public int anInt2006 = 0;

	@OriginalMember(owner = "client!jh", name = "cb", descriptor = "Z")
	public boolean aBoolean117 = true;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!ka;III)V")
	private void method1381(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt2006 = Static24.method460(arg0.method3049());
		} else if (arg1 == 2) {
			this.anInt2005 = arg0.method3010();
		} else if (arg1 == 3) {
			this.anInt2005 = arg0.method3023();
			if (this.anInt2005 == 65535) {
				this.anInt2005 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean117 = false;
		} else if (arg1 == 7) {
			this.anInt2002 = Static24.method460(arg0.method3049());
		} else if (arg1 == 8) {
			Static49.anInt1253 = arg2;
		} else if (arg1 == 9) {
			arg0.method3023();
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!ka;I)V")
	public void method1384(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(14) int local14 = arg0.method3010();
			if (local14 == 0) {
				return;
			}
			this.method1381(arg0, local14, arg1);
		}
	}
}

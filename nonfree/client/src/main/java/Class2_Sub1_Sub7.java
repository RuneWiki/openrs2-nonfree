import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class2_Sub1_Sub7 extends Class2_Sub1 {

	@OriginalMember(owner = "client!df", name = "C", descriptor = "I")
	public int anInt859 = 0;

	@OriginalMember(owner = "client!df", name = "A", descriptor = "Z")
	public boolean aBoolean35 = true;

	@OriginalMember(owner = "client!df", name = "F", descriptor = "I")
	public int anInt861 = -1;

	@OriginalMember(owner = "client!df", name = "O", descriptor = "I")
	public int anInt865 = -1;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILclient!kd;I)V")
	private void method619(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt859 = Static68.method948(arg1.method1536());
		} else if (arg2 == 2) {
			this.anInt861 = arg1.method1534();
		} else if (arg2 == 3) {
			this.anInt861 = arg1.method1557();
			if (this.anInt861 == 65535) {
				this.anInt861 = -1;
			}
		} else if (arg2 == 5) {
			this.aBoolean35 = false;
		} else if (arg2 == 7) {
			this.anInt865 = Static68.method948(arg1.method1536());
		} else if (arg2 == 8) {
			Static40.anInt964 = arg0;
		} else if (arg2 == 9) {
			arg1.method1557();
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BILclient!kd;)V")
	public void method620(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		while (true) {
			@Pc(17) int local17 = arg1.method1534();
			if (local17 == 0) {
				return;
			}
			this.method619(arg0, arg1, local17);
		}
	}
}

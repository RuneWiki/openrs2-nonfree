import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
	public int anInt1146;

	@OriginalMember(owner = "client!ff", name = "bb", descriptor = "[I")
	public int[] anIntArray164;

	@OriginalMember(owner = "client!ff", name = "cb", descriptor = "I")
	public int anInt1150;

	@OriginalMember(owner = "client!ff", name = "db", descriptor = "[Lclient!kd;")
	public Class39[] aClass39Array10;

	@OriginalMember(owner = "client!ff", name = "gb", descriptor = "I")
	public int anInt1153;

	@OriginalMember(owner = "client!ff", name = "ib", descriptor = "[I")
	public int[] anIntArray165;

	@OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
	public int anInt1147 = 0;

	@OriginalMember(owner = "client!ff", name = "ab", descriptor = "Lclient!kd;")
	public Class39 aClass39_533 = Static127.aClass39_1539;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!qc;)V")
	public void method686(@OriginalArg(1) Class1_Sub18 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method2169();
			if (local10 == 0) {
				return;
			}
			this.method690(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!qc;BI)V")
	private void method690(@OriginalArg(0) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1153 = arg0.method2169();
		} else if (arg1 == 2) {
			this.anInt1146 = arg0.method2169();
		} else if (arg1 == 3) {
			this.aClass39_533 = arg0.method2139();
		} else if (arg1 == 4) {
			this.anInt1150 = arg0.method2185();
		} else {
			@Pc(54) int local54;
			if (arg1 == 5) {
				this.anInt1147 = arg0.method2156();
				this.anIntArray165 = new int[this.anInt1147];
				this.aClass39Array10 = new Class39[this.anInt1147];
				for (local54 = 0; local54 < this.anInt1147; local54++) {
					this.anIntArray165[local54] = arg0.method2185();
					this.aClass39Array10[local54] = arg0.method2139();
				}
			} else if (arg1 == 6) {
				this.anInt1147 = arg0.method2156();
				this.anIntArray165 = new int[this.anInt1147];
				this.anIntArray164 = new int[this.anInt1147];
				for (local54 = 0; local54 < this.anInt1147; local54++) {
					this.anIntArray165[local54] = arg0.method2185();
					this.anIntArray164[local54] = arg0.method2185();
				}
			}
		}
	}
}

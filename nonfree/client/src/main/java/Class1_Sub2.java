import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "[I")
	public static int[] anIntArray243 = new int[99];

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
	private int anInt1565;

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!ic", name = "C", descriptor = "Z")
	private boolean aBoolean82;

	@OriginalMember(owner = "client!ic", name = "G", descriptor = "Z")
	private boolean aBoolean83;

	@OriginalMember(owner = "client!ic", name = "O", descriptor = "Lclient!ua;")
	private Class59 aClass59_2;

	@OriginalMember(owner = "client!ic", name = "L", descriptor = "Lclient!qd;")
	private final Class51 aClass51_1;

	static {
		@Pc(310) int local310 = 0;
		for (@Pc(312) int local312 = 0; local312 < 99; local312++) {
			@Pc(317) int local317 = local312 + 1;
			@Pc(330) int local330 = (int) (Math.pow(2.0D, (double) local317 / 7.0D) * 300.0D + (double) local317);
			local310 += local330;
			anIntArray243[local312] = local310 / 4;
		}
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!qd;)V")
	public Class1_Sub2(@OriginalArg(0) Class51 arg0) {
		this.aClass51_1 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZBI[B)V")
	@Override
	public void method1048(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		this.aClass59_2 = this.aClass51_1.method1469();
		if (this.aClass59_2 == null) {
			return;
		}
		if (arg1 == 0) {
			arg1 = 1;
		}
		this.anInt1565 = Static100.method1710(arg1);
		this.aByteArray13 = arg2;
		this.aBoolean83 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
	@Override
	public void method1050() {
		if (this.aBoolean82) {
			try {
				Static113.method1075(this.aClass51_1.anApplet2, "midibox.src=\"c:\\silence.mid\";");
			} catch (@Pc(11) Throwable local11) {
			}
			this.aBoolean82 = false;
		}
		this.aClass59_2 = null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	@Override
	public void method1041() {
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BII)V")
	@Override
	public void method1046(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			arg0 = 1;
		}
		@Pc(13) int local13 = Static100.method1710(arg0) - arg1;
		if (this.aClass59_2 != null) {
			this.anInt1565 = local13;
		} else if (this.aBoolean82) {
			try {
				Static113.method1075(this.aClass51_1.anApplet2, "midibox.volume=" + local13 + ";");
				return;
			} catch (@Pc(42) Throwable local42) {
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
	@Override
	public void method1051() {
		if (this.aClass59_2 == null || this.aClass59_2.anInt2608 == 0) {
			return;
		}
		if (this.aClass59_2.anInt2608 == 1) {
			@Pc(28) Class49 local28 = (Class49) this.aClass59_2.anObject5;
			try {
				local28.method1453(this.aByteArray13, this.aByteArray13.length, 0);
				local28.method1451();
				try {
					Static113.method1075(this.aClass51_1.anApplet2, "midibox.loop=" + (this.aBoolean83 ? "\"infinite\"" : "0") + "; midibox.src=\"" + local28.method1449().getPath() + "\"; midibox.volume=" + this.anInt1565 + ";");
					this.aBoolean82 = true;
				} catch (@Pc(77) Throwable local77) {
				}
			} catch (@Pc(79) Exception local79) {
				try {
					local28.method1451();
				} catch (@Pc(84) Exception local84) {
				}
			}
		}
		this.aClass59_2 = null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	@Override
	public void method1047() {
	}
}

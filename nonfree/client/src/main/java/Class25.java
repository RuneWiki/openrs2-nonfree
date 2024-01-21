import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mc")
public final class Class25 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	private static int anInt777;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "[Lclient!mc;")
	public static Class25[] aClass25Array1;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
	public int anInt778;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "[I")
	public int[] anIntArray215;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "[I")
	public int[] anIntArray216;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "[I")
	public int[] anIntArray218;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
	public int anInt779 = -1;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Z")
	public boolean aBoolean163 = false;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
	public int anInt780 = 5;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
	public int anInt781 = -1;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
	public int anInt782 = -1;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
	public int anInt783 = 99;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!yb;B)V")
	public static void method483(@OriginalArg(0) Class45 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(699, arg0.method639("seq.dat", null));
			anInt777 = local10.method469();
			if (aClass25Array1 == null) {
				aClass25Array1 = new Class25[anInt777];
			}
			for (@Pc(30) int local30 = 0; local30 < anInt777; local30++) {
				if (aClass25Array1[local30] == null) {
					aClass25Array1[local30] = new Class25();
				}
				aClass25Array1[local30].method485(local10);
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("9146, " + arg0 + ", " + 7 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	private Class25() {
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)I")
	public int method484(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = this.anIntArray217[arg0];
			if (local4 == 0) {
				@Pc(23) Class14 local23 = Class14.method330(this.anIntArray215[arg0]);
				if (local23 != null) {
					local4 = this.anIntArray217[arg0] = local23.anInt614;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("57221, " + 7 + ", " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLclient!mb;)V")
	private void method485(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method467();
				if (local10 == 0) {
					if (this.anInt778 == 0) {
						this.anInt778 = 1;
						this.anIntArray215 = new int[1];
						this.anIntArray215[0] = -1;
						this.anIntArray216 = new int[1];
						this.anIntArray216[0] = -1;
						this.anIntArray217 = new int[1];
						this.anIntArray217[0] = -1;
						return;
					}
					return;
				}
				@Pc(37) int local37;
				if (local10 == 1) {
					this.anInt778 = arg0.method467();
					this.anIntArray215 = new int[this.anInt778];
					this.anIntArray216 = new int[this.anInt778];
					this.anIntArray217 = new int[this.anInt778];
					for (local37 = 0; local37 < this.anInt778; local37++) {
						this.anIntArray215[local37] = arg0.method469();
						this.anIntArray216[local37] = arg0.method469();
						if (this.anIntArray216[local37] == 65535) {
							this.anIntArray216[local37] = -1;
						}
						this.anIntArray217[local37] = arg0.method469();
					}
				} else if (local10 == 2) {
					this.anInt779 = arg0.method469();
				} else if (local10 == 3) {
					local37 = arg0.method467();
					this.anIntArray218 = new int[local37 + 1];
					for (@Pc(98) int local98 = 0; local98 < local37; local98++) {
						this.anIntArray218[local98] = arg0.method467();
					}
					this.anIntArray218[local37] = 9999999;
				} else if (local10 == 4) {
					this.aBoolean163 = true;
				} else if (local10 == 5) {
					this.anInt780 = arg0.method467();
				} else if (local10 == 6) {
					this.anInt781 = arg0.method469();
				} else if (local10 == 7) {
					this.anInt782 = arg0.method469();
				} else if (local10 == 8) {
					this.anInt783 = arg0.method467();
				} else {
					System.out.println("Error unrecognised seq config code: " + local10);
				}
			}
		} catch (@Pc(207) RuntimeException local207) {
			signlink.reporterror("76635, " + false + ", " + arg0 + ", " + local207.toString());
			throw new RuntimeException();
		}
	}
}

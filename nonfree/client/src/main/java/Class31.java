import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class31 {

	@OriginalMember(owner = "client!db", name = "c", descriptor = "[I")
	public static int[] anIntArray83 = new int[99];

	@OriginalMember(owner = "client!db", name = "Q", descriptor = "[[I")
	public int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!db", name = "g", descriptor = "I")
	public int anInt885 = -1;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "I")
	public int anInt890 = -1;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "I")
	public int anInt889 = 0;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "I")
	public int anInt880 = -1;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "I")
	public int anInt884 = -1;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	public int anInt891 = 0;

	@OriginalMember(owner = "client!db", name = "v", descriptor = "I")
	public int anInt900 = -1;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "I")
	public int anInt895 = -1;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	public int anInt897 = -1;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "I")
	public int anInt888 = -1;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "I")
	public int anInt896 = -1;

	@OriginalMember(owner = "client!db", name = "C", descriptor = "I")
	public int anInt907 = 0;

	@OriginalMember(owner = "client!db", name = "F", descriptor = "I")
	public int anInt910 = -1;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "I")
	public int anInt886 = 0;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "I")
	public int anInt887 = -1;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "I")
	public int anInt903 = 0;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "I")
	public int anInt893 = -1;

	@OriginalMember(owner = "client!db", name = "K", descriptor = "I")
	public int anInt914 = 0;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "I")
	public int anInt913 = 0;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "I")
	public int anInt881 = -1;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	public int anInt901 = 0;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "I")
	public int anInt908 = -1;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "I")
	public int anInt899 = -1;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "I")
	public int anInt911 = 0;

	@OriginalMember(owner = "client!db", name = "M", descriptor = "I")
	public int anInt916 = -1;

	@OriginalMember(owner = "client!db", name = "I", descriptor = "I")
	public int anInt912 = -1;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "I")
	public int anInt902 = -1;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	public int anInt898 = 0;

	@OriginalMember(owner = "client!db", name = "N", descriptor = "I")
	public int anInt917 = -1;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "I")
	public int anInt906 = -1;

	@OriginalMember(owner = "client!db", name = "O", descriptor = "I")
	public int anInt918 = -1;

	@OriginalMember(owner = "client!db", name = "T", descriptor = "I")
	public int anInt919 = -1;

	@OriginalMember(owner = "client!db", name = "L", descriptor = "I")
	public int anInt915 = -1;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(15) int local15 = local6 + 1;
			@Pc(28) int local28 = (int) ((double) local15 + Math.pow(2.0D, (double) local15 / 7.0D) * 300.0D);
			local4 += local28;
			anIntArray83[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!ug;I)V")
	private void method757(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt912 = arg0.method3948();
			this.anInt896 = arg0.method3948();
			if (this.anInt896 == 65535) {
				this.anInt896 = -1;
			}
			if (this.anInt912 == 65535) {
				this.anInt912 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt915 = arg0.method3948();
		} else if (arg1 == 3) {
			this.anInt884 = arg0.method3948();
		} else if (arg1 == 4) {
			this.anInt899 = arg0.method3948();
		} else if (arg1 == 5) {
			this.anInt906 = arg0.method3948();
		} else if (arg1 == 6) {
			this.anInt919 = arg0.method3948();
		} else if (arg1 == 7) {
			this.anInt910 = arg0.method3948();
		} else if (arg1 == 8) {
			this.anInt902 = arg0.method3948();
		} else if (arg1 == 9) {
			this.anInt885 = arg0.method3948();
		} else if (arg1 == 26) {
			this.anInt911 = (short) (arg0.method3915() * 4);
			this.anInt903 = (short) (arg0.method3915() * 4);
		} else if (arg1 == 27) {
			if (this.anIntArrayArray10 == null) {
				this.anIntArrayArray10 = new int[12][];
			}
			@Pc(120) int local120 = arg0.method3915();
			this.anIntArrayArray10[local120] = new int[6];
			for (@Pc(128) int local128 = 0; local128 < 6; local128++) {
				this.anIntArrayArray10[local120][local128] = arg0.method3930();
			}
		} else if (arg1 == 29) {
			this.anInt889 = arg0.method3915();
		} else if (arg1 == 30) {
			this.anInt898 = arg0.method3948();
		} else if (arg1 == 31) {
			this.anInt914 = arg0.method3915();
		} else if (arg1 == 32) {
			this.anInt913 = arg0.method3948();
		} else if (arg1 == 33) {
			this.anInt891 = arg0.method3930();
		} else if (arg1 == 34) {
			this.anInt901 = arg0.method3915();
		} else if (arg1 == 35) {
			this.anInt907 = arg0.method3948();
		} else if (arg1 == 36) {
			this.anInt886 = arg0.method3930();
		} else if (arg1 == 37) {
			this.anInt890 = arg0.method3915();
		} else if (arg1 == 38) {
			this.anInt900 = arg0.method3948();
		} else if (arg1 == 39) {
			this.anInt881 = arg0.method3948();
		} else if (arg1 == 40) {
			this.anInt908 = arg0.method3948();
		} else if (arg1 == 41) {
			this.anInt887 = arg0.method3948();
		} else if (arg1 == 42) {
			this.anInt916 = arg0.method3948();
		} else if (arg1 == 43) {
			arg0.method3948();
		} else if (arg1 == 44) {
			arg0.method3948();
		} else if (arg1 == 45) {
			this.anInt893 = arg0.method3948();
		} else if (arg1 == 46) {
			this.anInt897 = arg0.method3948();
		} else if (arg1 == 47) {
			this.anInt918 = arg0.method3948();
		} else if (arg1 == 48) {
			this.anInt880 = arg0.method3948();
		} else if (arg1 == 49) {
			this.anInt895 = arg0.method3948();
		} else if (arg1 == 50) {
			this.anInt888 = arg0.method3948();
		} else if (arg1 == 51) {
			this.anInt917 = arg0.method3948();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!ug;)V")
	public void method758(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3915();
			if (local5 == 0) {
				return;
			}
			this.method757(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
	public void method760() {
	}
}

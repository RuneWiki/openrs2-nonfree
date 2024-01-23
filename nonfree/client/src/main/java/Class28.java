import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class28 {

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
	public int anInt852 = -1;

	@OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
	public int anInt861 = -1;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
	public int anInt847 = -1;

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
	public int anInt854 = 0;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
	public int anInt856 = 0;

	@OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
	public int anInt868 = -1;

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
	public int anInt855 = -1;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
	public int anInt849 = -1;

	@OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
	public int anInt860 = -1;

	@OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
	public int anInt867 = -1;

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
	public int anInt857 = 0;

	@OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
	public int anInt869 = -1;

	@OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
	public int anInt876 = 0;

	@OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
	public int anInt870 = 0;

	@OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
	public int anInt873 = 0;

	@OriginalMember(owner = "client!cl", name = "L", descriptor = "I")
	public int anInt880 = -1;

	@OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
	public int anInt871 = -1;

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
	public int anInt853 = -1;

	@OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
	public int anInt862 = -1;

	@OriginalMember(owner = "client!cl", name = "M", descriptor = "I")
	public int anInt881 = -1;

	@OriginalMember(owner = "client!cl", name = "N", descriptor = "I")
	public int anInt882 = -1;

	@OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
	public int anInt864 = -1;

	@OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
	public int anInt865 = 0;

	@OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
	public int anInt863 = -1;

	@OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
	public int anInt872 = -1;

	@OriginalMember(owner = "client!cl", name = "K", descriptor = "I")
	public int anInt879 = -1;

	@OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
	public int anInt878 = -1;

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
	public int anInt858 = -1;

	@OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
	public int anInt866 = 0;

	@OriginalMember(owner = "client!cl", name = "Q", descriptor = "I")
	public int anInt885 = 0;

	@OriginalMember(owner = "client!cl", name = "F", descriptor = "I")
	public int anInt874 = 0;

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
	public int anInt859 = -1;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	public void method725() {
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!fh;)V")
	public void method726(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1853();
			if (local5 == 0) {
				return;
			}
			this.method729(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BILclient!fh;)V")
	private void method729(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt869 = arg1.method1879();
			this.anInt872 = arg1.method1879();
			if (this.anInt869 == 65535) {
				this.anInt869 = -1;
			}
			if (this.anInt872 == 65535) {
				this.anInt872 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt871 = arg1.method1879();
		} else if (arg0 == 3) {
			this.anInt881 = arg1.method1879();
		} else if (arg0 == 4) {
			this.anInt882 = arg1.method1879();
		} else if (arg0 == 5) {
			this.anInt858 = arg1.method1879();
		} else if (arg0 == 6) {
			this.anInt868 = arg1.method1879();
		} else if (arg0 == 7) {
			this.anInt879 = arg1.method1879();
		} else if (arg0 == 8) {
			this.anInt849 = arg1.method1879();
		} else if (arg0 == 9) {
			this.anInt847 = arg1.method1879();
		} else if (arg0 == 26) {
			this.anInt865 = (short) (arg1.method1853() * 4);
			this.anInt873 = (short) (arg1.method1853() * 4);
		} else if (arg0 == 27) {
			if (this.anIntArrayArray7 == null) {
				this.anIntArrayArray7 = new int[12][];
			}
			@Pc(115) int local115 = arg1.method1853();
			this.anIntArrayArray7[local115] = new int[6];
			for (@Pc(123) int local123 = 0; local123 < 6; local123++) {
				this.anIntArrayArray7[local115][local123] = arg1.method1843();
			}
		} else if (arg0 == 29) {
			this.anInt856 = arg1.method1853();
		} else if (arg0 == 30) {
			this.anInt874 = arg1.method1879();
		} else if (arg0 == 31) {
			this.anInt876 = arg1.method1853();
		} else if (arg0 == 32) {
			this.anInt885 = arg1.method1879();
		} else if (arg0 == 33) {
			this.anInt866 = arg1.method1843();
		} else if (arg0 == 34) {
			this.anInt857 = arg1.method1853();
		} else if (arg0 == 35) {
			this.anInt870 = arg1.method1879();
		} else if (arg0 == 36) {
			this.anInt854 = arg1.method1843();
		} else if (arg0 == 37) {
			this.anInt861 = arg1.method1853();
		} else if (arg0 == 38) {
			this.anInt880 = arg1.method1879();
		} else if (arg0 == 39) {
			this.anInt867 = arg1.method1879();
		} else if (arg0 == 40) {
			this.anInt852 = arg1.method1879();
		} else if (arg0 == 41) {
			this.anInt853 = arg1.method1879();
		} else if (arg0 == 42) {
			this.anInt878 = arg1.method1879();
		} else if (arg0 == 43) {
			arg1.method1879();
		} else if (arg0 == 44) {
			arg1.method1879();
		} else if (arg0 == 45) {
			arg1.method1879();
		} else if (arg0 == 46) {
			this.anInt859 = arg1.method1879();
		} else if (arg0 == 47) {
			this.anInt864 = arg1.method1879();
		} else if (arg0 == 48) {
			this.anInt860 = arg1.method1879();
		} else if (arg0 == 49) {
			this.anInt863 = arg1.method1879();
		} else if (arg0 == 50) {
			this.anInt855 = arg1.method1879();
		} else if (arg0 == 51) {
			this.anInt862 = arg1.method1879();
		}
	}
}

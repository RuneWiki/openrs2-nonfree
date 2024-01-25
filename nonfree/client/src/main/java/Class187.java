import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class187 {

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "[I")
	public static final int[] anIntArray592 = new int[4096];

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Lclient!fa;")
	public Class77 aClass77_31;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "Lclient!fa;")
	private Class77 aClass77_32;

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
	private int anInt4893;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "Ljava/lang/String;")
	private String aString56 = "null";

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray592[local4] = Static328.method4759(local4);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method4298(@OriginalArg(0) int arg0) {
		if (this.aClass77_31 == null) {
			return this.aString56;
		} else {
			@Pc(17) Class1_Sub8 local17 = (Class1_Sub8) this.aClass77_31.method1368((long) arg0);
			return local17 == null ? this.aString56 : local17.aString9;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!re;II)V")
	private void method4299(@OriginalArg(0) Class1_Sub33 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static243.method3660(arg0.method5188());
		} else if (arg1 == 2) {
			this.aChar4 = Static243.method3660(arg0.method5188());
		} else if (arg1 == 3) {
			this.aString56 = arg0.method5128();
		} else if (arg1 == 4) {
			this.anInt4893 = arg0.method5150();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(57) int local57 = arg0.method5177();
			this.aClass77_31 = new Class77(Static183.method1325(local57));
			for (@Pc(67) int local67 = 0; local67 < local57; local67++) {
				@Pc(73) int local73 = arg0.method5150();
				@Pc(83) Class1 local83;
				if (arg1 == 5) {
					local83 = new Class1_Sub8(arg0.method5128());
				} else {
					local83 = new Class1_Sub30(arg0.method5150());
				}
				this.aClass77_31.method1370((long) local73, local83);
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)Z")
	public boolean method4300(@OriginalArg(1) int arg0) {
		if (this.aClass77_31 == null) {
			return false;
		}
		if (this.aClass77_32 == null) {
			this.method4304();
		}
		@Pc(27) Class1_Sub30 local27 = (Class1_Sub30) this.aClass77_32.method1368((long) arg0);
		return local27 != null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!re;B)V")
	public void method4301(@OriginalArg(0) Class1_Sub33 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5174();
			if (local5 == 0) {
				return;
			}
			this.method4299(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method4302(@OriginalArg(1) String arg0) {
		if (this.aClass77_31 == null) {
			return false;
		}
		if (this.aClass77_32 == null) {
			this.method4303();
		}
		for (@Pc(23) Class1_Sub42 local23 = (Class1_Sub42) this.aClass77_32.method1368(Static35.method542(arg0)); local23 != null; local23 = (Class1_Sub42) this.aClass77_32.method1369()) {
			if (local23.aString66.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	private void method4303() {
		this.aClass77_32 = new Class77(this.aClass77_31.method1363());
		for (@Pc(20) Class1_Sub8 local20 = (Class1_Sub8) this.aClass77_31.method1359(); local20 != null; local20 = (Class1_Sub8) this.aClass77_31.method1360()) {
			@Pc(31) Class1_Sub42 local31 = new Class1_Sub42(local20.aString9, (int) local20.aLong207);
			this.aClass77_32.method1370(Static35.method542(local20.aString9), local31);
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	private void method4304() {
		this.aClass77_32 = new Class77(this.aClass77_31.method1363());
		for (@Pc(24) Class1_Sub30 local24 = (Class1_Sub30) this.aClass77_31.method1359(); local24 != null; local24 = (Class1_Sub30) this.aClass77_31.method1360()) {
			@Pc(33) Class1_Sub30 local33 = new Class1_Sub30((int) local24.aLong207);
			this.aClass77_32.method1370((long) local24.anInt3799, local33);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)I")
	public int method4306(@OriginalArg(1) int arg0) {
		if (this.aClass77_31 == null) {
			return this.anInt4893;
		} else {
			@Pc(17) Class1_Sub30 local17 = (Class1_Sub30) this.aClass77_31.method1368((long) arg0);
			return local17 == null ? this.anInt4893 : local17.anInt3799;
		}
	}
}

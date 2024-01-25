import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class12 {

	@OriginalMember(owner = "client!am", name = "b", descriptor = "Lclient!mn;")
	private Class167 aClass167_2;

	@OriginalMember(owner = "client!am", name = "e", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!am", name = "j", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!am", name = "k", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!am", name = "q", descriptor = "Lclient!mn;")
	public Class167 aClass167_3;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "Ljava/lang/String;")
	private String aString2 = "null";

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
	private void method166() {
		this.aClass167_2 = new Class167(this.aClass167_3.method3704());
		for (@Pc(25) Class10_Sub12 local25 = (Class10_Sub12) this.aClass167_3.method3702(); local25 != null; local25 = (Class10_Sub12) this.aClass167_3.method3708()) {
			@Pc(34) Class10_Sub12 local34 = new Class10_Sub12((int) local25.aLong264);
			this.aClass167_2.method3705(local34, (long) local25.anInt1159);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BLclient!nn;)V")
	public void method167(@OriginalArg(1) Class10_Sub8 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2502();
			if (local17 == 0) {
				return;
			}
			this.method175(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)I")
	public int method168(@OriginalArg(1) int arg0) {
		if (this.aClass167_3 == null) {
			return this.anInt223;
		} else {
			@Pc(25) Class10_Sub12 local25 = (Class10_Sub12) this.aClass167_3.method3709((long) arg0);
			return local25 == null ? this.anInt223 : local25.anInt1159;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method170(@OriginalArg(1) String arg0) {
		if (this.aClass167_3 == null) {
			return false;
		}
		if (this.aClass167_2 == null) {
			this.method174();
		}
		for (@Pc(30) Class10_Sub6 local30 = (Class10_Sub6) this.aClass167_2.method3709(Static149.method2571(arg0)); local30 != null; local30 = (Class10_Sub6) this.aClass167_2.method3707()) {
			if (local30.aString7.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(BI)Ljava/lang/String;")
	public String method171(@OriginalArg(1) int arg0) {
		if (this.aClass167_3 == null) {
			return this.aString2;
		} else {
			@Pc(22) Class10_Sub18 local22 = (Class10_Sub18) this.aClass167_3.method3709((long) arg0);
			return local22 == null ? this.aString2 : local22.aString15;
		}
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(BI)Z")
	public boolean method173(@OriginalArg(1) int arg0) {
		if (this.aClass167_3 == null) {
			return false;
		}
		if (this.aClass167_2 == null) {
			this.method166();
		}
		@Pc(22) Class10_Sub12 local22 = (Class10_Sub12) this.aClass167_2.method3709((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
	private void method174() {
		this.aClass167_2 = new Class167(this.aClass167_3.method3704());
		for (@Pc(28) Class10_Sub18 local28 = (Class10_Sub18) this.aClass167_3.method3702(); local28 != null; local28 = (Class10_Sub18) this.aClass167_3.method3708()) {
			@Pc(39) Class10_Sub6 local39 = new Class10_Sub6(local28.aString15, (int) local28.aLong264);
			this.aClass167_2.method3705(local39, Static149.method2571(local28.aString15));
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!nn;II)V")
	private void method175(@OriginalArg(0) Class10_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static276.method2522(arg0.method2460());
		} else if (arg1 == 2) {
			this.aChar1 = Static276.method2522(arg0.method2460());
		} else if (arg1 == 3) {
			this.aString2 = arg0.method2478();
		} else if (arg1 == 4) {
			this.anInt223 = arg0.method2459();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(35) int local35 = arg0.method2485();
			this.aClass167_3 = new Class167(Static186.method3002(local35));
			for (@Pc(45) int local45 = 0; local45 < local35; local45++) {
				@Pc(51) int local51 = arg0.method2459();
				@Pc(61) Class10 local61;
				if (arg1 == 5) {
					local61 = new Class10_Sub18(arg0.method2478());
				} else {
					local61 = new Class10_Sub12(arg0.method2459());
				}
				this.aClass167_3.method3705(local61, (long) local51);
			}
		}
	}
}

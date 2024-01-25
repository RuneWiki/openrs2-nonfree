import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class289 {

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "Lclient!kea;")
	public Class187 aClass187_31;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "Lclient!kea;")
	private Class187 aClass187_32;

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
	private int anInt7782;

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "Ljava/lang/String;")
	private String aString74 = "null";

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLclient!mo;)V")
	public void method6234(@OriginalArg(1) Class1_Sub35 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5750();
			if (local13 == 0) {
				return;
			}
			this.method6240(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I")
	public int method6235(@OriginalArg(0) int arg0) {
		if (this.aClass187_31 == null) {
			return this.anInt7782;
		} else {
			@Pc(23) Class1_Sub13 local23 = (Class1_Sub13) this.aClass187_31.method3797((long) arg0);
			return local23 == null ? this.anInt7782 : local23.anInt1812;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
	private void method6236() {
		this.aClass187_32 = new Class187(this.aClass187_31.method3800());
		for (@Pc(28) Class1_Sub3 local28 = (Class1_Sub3) this.aClass187_31.method3799(); local28 != null; local28 = (Class1_Sub3) this.aClass187_31.method3805()) {
			@Pc(39) Class1_Sub41 local39 = new Class1_Sub41(local28.aString3, (int) local28.aLong301);
			this.aClass187_32.method3795(local39, Static517.method7878(local28.aString3));
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method6237(@OriginalArg(0) int arg0) {
		if (this.aClass187_31 == null) {
			return this.aString74;
		} else {
			@Pc(25) Class1_Sub3 local25 = (Class1_Sub3) this.aClass187_31.method3797((long) arg0);
			return local25 == null ? this.aString74 : local25.aString3;
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)Z")
	public boolean method6238(@OriginalArg(0) int arg0) {
		if (this.aClass187_31 == null) {
			return false;
		}
		if (this.aClass187_32 == null) {
			this.method6239();
		}
		@Pc(30) Class1_Sub13 local30 = (Class1_Sub13) this.aClass187_32.method3797((long) arg0);
		return local30 != null;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V")
	private void method6239() {
		this.aClass187_32 = new Class187(this.aClass187_31.method3800());
		for (@Pc(28) Class1_Sub13 local28 = (Class1_Sub13) this.aClass187_31.method3799(); local28 != null; local28 = (Class1_Sub13) this.aClass187_31.method3805()) {
			@Pc(37) Class1_Sub13 local37 = new Class1_Sub13((int) local28.aLong301);
			this.aClass187_32.method3795(local37, (long) local28.anInt1812);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILclient!mo;)V")
	private void method6240(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub35 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static546.method7462(arg1.method5751());
		} else if (arg0 == 2) {
			this.aChar5 = Static546.method7462(arg1.method5751());
		} else if (arg0 == 3) {
			this.aString74 = arg1.method5760();
		} else if (arg0 == 4) {
			this.anInt7782 = arg1.method5804();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(52) int local52 = arg1.method5771();
			this.aClass187_31 = new Class187(Static457.method6299(local52));
			for (@Pc(62) int local62 = 0; local62 < local52; local62++) {
				@Pc(68) int local68 = arg1.method5804();
				@Pc(78) Class1 local78;
				if (arg0 == 5) {
					local78 = new Class1_Sub3(arg1.method5760());
				} else {
					local78 = new Class1_Sub13(arg1.method5804());
				}
				this.aClass187_31.method3795(local78, (long) local68);
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method6241(@OriginalArg(1) String arg0) {
		if (this.aClass187_31 == null) {
			return false;
		}
		if (this.aClass187_32 == null) {
			this.method6236();
		}
		for (@Pc(31) Class1_Sub41 local31 = (Class1_Sub41) this.aClass187_32.method3797(Static517.method7878(arg0)); local31 != null; local31 = (Class1_Sub41) this.aClass187_32.method3803()) {
			if (local31.aString72.equals(arg0)) {
				return true;
			}
		}
		return false;
	}
}

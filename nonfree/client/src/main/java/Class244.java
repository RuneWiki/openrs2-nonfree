import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class244 {

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "Lclient!ew;")
	private Class72 aClass72_41;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
	private int anInt6653;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "Lclient!ew;")
	public Class72 aClass72_42;

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "Ljava/lang/String;")
	private String aString184 = "null";

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method5158(@OriginalArg(0) int arg0) {
		if (this.aClass72_42 == null) {
			return this.aString184;
		} else {
			@Pc(17) Class2_Sub3 local17 = (Class2_Sub3) this.aClass72_42.method1659((long) arg0);
			return local17 == null ? this.aString184 : local17.aString10;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLclient!sv;)V")
	public void method5159(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method3580();
			if (local12 == 0) {
				return;
			}
			this.method5160(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!sv;I)V")
	private void method5160(@OriginalArg(1) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static336.method4491(arg0.method3605());
		} else if (arg1 == 2) {
			this.aChar4 = Static336.method4491(arg0.method3605());
		} else if (arg1 == 3) {
			this.aString184 = arg0.method3582();
		} else if (arg1 == 4) {
			this.anInt6653 = arg0.method3574();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(60) int local60 = arg0.method3555();
			this.aClass72_42 = new Class72(Static29.method453(local60));
			for (@Pc(70) int local70 = 0; local70 < local60; local70++) {
				@Pc(78) int local78 = arg0.method3574();
				@Pc(88) Class2 local88;
				if (arg1 == 5) {
					local88 = new Class2_Sub3(arg0.method3582());
				} else {
					local88 = new Class2_Sub20(arg0.method3574());
				}
				this.aClass72_42.method1653(local88, (long) local78);
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	private void method5161() {
		this.aClass72_41 = new Class72(this.aClass72_42.method1654());
		for (@Pc(25) Class2_Sub20 local25 = (Class2_Sub20) this.aClass72_42.method1655(); local25 != null; local25 = (Class2_Sub20) this.aClass72_42.method1649()) {
			@Pc(34) Class2_Sub20 local34 = new Class2_Sub20((int) local25.aLong225);
			this.aClass72_41.method1653(local34, (long) local25.anInt2212);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method5163(@OriginalArg(0) String arg0) {
		if (this.aClass72_42 == null) {
			return false;
		}
		if (this.aClass72_41 == null) {
			this.method5166();
		}
		for (@Pc(31) Class2_Sub27 local31 = (Class2_Sub27) this.aClass72_41.method1659(Static434.method5456(arg0)); local31 != null; local31 = (Class2_Sub27) this.aClass72_41.method1657()) {
			if (local31.aString101.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)I")
	public int method5164(@OriginalArg(1) int arg0) {
		if (this.aClass72_42 == null) {
			return this.anInt6653;
		} else {
			@Pc(17) Class2_Sub20 local17 = (Class2_Sub20) this.aClass72_42.method1659((long) arg0);
			return local17 == null ? this.anInt6653 : local17.anInt2212;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
	private void method5166() {
		this.aClass72_41 = new Class72(this.aClass72_42.method1654());
		for (@Pc(28) Class2_Sub3 local28 = (Class2_Sub3) this.aClass72_42.method1655(); local28 != null; local28 = (Class2_Sub3) this.aClass72_42.method1649()) {
			@Pc(39) Class2_Sub27 local39 = new Class2_Sub27(local28.aString10, (int) local28.aLong225);
			this.aClass72_41.method1653(local39, Static434.method5456(local28.aString10));
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)Z")
	public boolean method5167(@OriginalArg(1) int arg0) {
		if (this.aClass72_42 == null) {
			return false;
		}
		if (this.aClass72_41 == null) {
			this.method5161();
		}
		@Pc(22) Class2_Sub20 local22 = (Class2_Sub20) this.aClass72_41.method1659((long) arg0);
		return local22 != null;
	}
}

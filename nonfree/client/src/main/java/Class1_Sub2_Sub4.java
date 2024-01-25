import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ga", name = "z", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
	private int anInt1831;

	@OriginalMember(owner = "client!ga", name = "H", descriptor = "Lclient!vk;")
	public Class207 aClass207_9;

	@OriginalMember(owner = "client!ga", name = "K", descriptor = "Lclient!vk;")
	private Class207 aClass207_10;

	@OriginalMember(owner = "client!ga", name = "Q", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!ga", name = "C", descriptor = "Ljava/lang/String;")
	private String aString73 = "null";

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!nj;I)V")
	private void method1527(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub21 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static287.method5025(arg1.method5721());
		} else if (arg0 == 2) {
			this.aChar2 = Static287.method5025(arg1.method5721());
		} else if (arg0 == 3) {
			this.aString73 = arg1.method5701();
		} else if (arg0 == 4) {
			this.anInt1831 = arg1.method5716();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(55) int local55 = arg1.method5715();
			this.aClass207_9 = new Class207(Static304.method5275(local55));
			for (@Pc(65) int local65 = 0; local65 < local55; local65++) {
				@Pc(71) int local71 = arg1.method5716();
				@Pc(83) Class1 local83;
				if (arg0 == 5) {
					local83 = new Class1_Sub39(arg1.method5701());
				} else {
					local83 = new Class1_Sub14(arg1.method5716());
				}
				this.aClass207_9.method5552(local83, (long) local71);
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)I")
	public int method1529(@OriginalArg(0) int arg0) {
		if (this.aClass207_9 == null) {
			return this.anInt1831;
		} else {
			@Pc(22) Class1_Sub14 local22 = (Class1_Sub14) this.aClass207_9.method5555((long) arg0);
			return local22 == null ? this.anInt1831 : local22.anInt1474;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method1530(@OriginalArg(1) String arg0) {
		if (this.aClass207_9 == null) {
			return false;
		}
		if (this.aClass207_10 == null) {
			this.method1536();
		}
		for (@Pc(31) Class1_Sub3 local31 = (Class1_Sub3) this.aClass207_10.method5555(Static319.method2794(arg0)); local31 != null; local31 = (Class1_Sub3) this.aClass207_10.method5563()) {
			if (local31.aString8.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)Ljava/lang/String;")
	public String method1535(@OriginalArg(1) int arg0) {
		if (this.aClass207_9 == null) {
			return this.aString73;
		} else {
			@Pc(17) Class1_Sub39 local17 = (Class1_Sub39) this.aClass207_9.method5555((long) arg0);
			return local17 == null ? this.aString73 : local17.aString215;
		}
	}

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V")
	private void method1536() {
		this.aClass207_10 = new Class207(this.aClass207_9.method5561());
		for (@Pc(28) Class1_Sub39 local28 = (Class1_Sub39) this.aClass207_9.method5560(); local28 != null; local28 = (Class1_Sub39) this.aClass207_9.method5559()) {
			@Pc(39) Class1_Sub3 local39 = new Class1_Sub3(local28.aString215, (int) local28.aLong214);
			this.aClass207_10.method5552(local39, Static319.method2794(local28.aString215));
		}
	}

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)V")
	private void method1537() {
		this.aClass207_10 = new Class207(this.aClass207_9.method5561());
		for (@Pc(20) Class1_Sub14 local20 = (Class1_Sub14) this.aClass207_9.method5560(); local20 != null; local20 = (Class1_Sub14) this.aClass207_9.method5559()) {
			@Pc(34) Class1_Sub14 local34 = new Class1_Sub14((int) local20.aLong214);
			this.aClass207_10.method5552(local34, (long) local20.anInt1474);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!nj;)V")
	public void method1538(@OriginalArg(1) Class1_Sub21 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5720();
			if (local14 == 0) {
				return;
			}
			this.method1527(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(II)Z")
	public boolean method1539(@OriginalArg(1) int arg0) {
		if (this.aClass207_9 == null) {
			return false;
		}
		if (this.aClass207_10 == null) {
			this.method1537();
		}
		@Pc(27) Class1_Sub14 local27 = (Class1_Sub14) this.aClass207_10.method5555((long) arg0);
		return local27 != null;
	}
}

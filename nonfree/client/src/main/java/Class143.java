import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class143 {

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
	private int anInt3661;

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!kp", name = "m", descriptor = "Lclient!ke;")
	public Class137 aClass137_21;

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "Lclient!ke;")
	private Class137 aClass137_22;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "Ljava/lang/String;")
	private String aString34 = "null";

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IB)I")
	public int method3272(@OriginalArg(0) int arg0) {
		if (this.aClass137_21 == null) {
			return this.anInt3661;
		} else {
			@Pc(22) Class6_Sub44 local22 = (Class6_Sub44) this.aClass137_21.method3175((long) arg0);
			return local22 == null ? this.anInt3661 : local22.anInt7027;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILclient!ha;)V")
	public void method3275(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3111();
			if (local5 == 0) {
				return;
			}
			this.method3278(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)Z")
	public boolean method3276(@OriginalArg(1) int arg0) {
		if (this.aClass137_21 == null) {
			return false;
		}
		if (this.aClass137_22 == null) {
			this.method3279();
		}
		@Pc(29) Class6_Sub44 local29 = (Class6_Sub44) this.aClass137_22.method3175((long) arg0);
		return local29 != null;
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method3277(@OriginalArg(0) int arg0) {
		if (this.aClass137_21 == null) {
			return this.aString34;
		} else {
			@Pc(22) Class6_Sub11 local22 = (Class6_Sub11) this.aClass137_21.method3175((long) arg0);
			return local22 == null ? this.aString34 : local22.aString14;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!ha;II)V")
	private void method3278(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static151.method2480(arg0.method3116());
		} else if (arg1 == 2) {
			this.aChar4 = Static151.method2480(arg0.method3116());
		} else if (arg1 == 3) {
			this.aString34 = arg0.method3093();
		} else if (arg1 == 4) {
			this.anInt3661 = arg0.method3109();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(63) int local63 = arg0.method3108();
			this.aClass137_21 = new Class137(Static420.method5696(local63));
			for (@Pc(75) int local75 = 0; local75 < local63; local75++) {
				@Pc(81) int local81 = arg0.method3109();
				@Pc(91) Class6 local91;
				if (arg1 == 5) {
					local91 = new Class6_Sub11(arg0.method3093());
				} else {
					local91 = new Class6_Sub44(arg0.method3109());
				}
				this.aClass137_21.method3179((long) local81, local91);
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
	private void method3279() {
		this.aClass137_22 = new Class137(this.aClass137_21.method3173());
		for (@Pc(24) Class6_Sub44 local24 = (Class6_Sub44) this.aClass137_21.method3181(); local24 != null; local24 = (Class6_Sub44) this.aClass137_21.method3182()) {
			@Pc(33) Class6_Sub44 local33 = new Class6_Sub44((int) local24.aLong217);
			this.aClass137_22.method3179((long) local24.anInt7027, local33);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method3280(@OriginalArg(0) String arg0) {
		if (this.aClass137_21 == null) {
			return false;
		}
		if (this.aClass137_22 == null) {
			this.method3282();
		}
		for (@Pc(25) Class6_Sub23 local25 = (Class6_Sub23) this.aClass137_22.method3175(Static350.method4968(arg0)); local25 != null; local25 = (Class6_Sub23) this.aClass137_22.method3176()) {
			if (local25.aString39.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V")
	private void method3282() {
		this.aClass137_22 = new Class137(this.aClass137_21.method3173());
		for (@Pc(20) Class6_Sub11 local20 = (Class6_Sub11) this.aClass137_21.method3181(); local20 != null; local20 = (Class6_Sub11) this.aClass137_21.method3182()) {
			@Pc(31) Class6_Sub23 local31 = new Class6_Sub23(local20.aString14, (int) local20.aLong217);
			this.aClass137_22.method3179(Static350.method4968(local20.aString14), local31);
		}
	}
}

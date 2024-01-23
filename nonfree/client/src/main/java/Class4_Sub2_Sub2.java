import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class4_Sub2_Sub2 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!ba", name = "H", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!ba", name = "N", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!ba", name = "Q", descriptor = "Lclient!tm;")
	private Class163 aClass163_2;

	@OriginalMember(owner = "client!ba", name = "T", descriptor = "Lclient!tm;")
	public Class163 aClass163_3;

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "Ljava/lang/String;")
	private String aString18 = "null";

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)I")
	public int method303(@OriginalArg(1) int arg0) {
		if (this.aClass163_3 == null) {
			return this.anInt385;
		} else {
			@Pc(22) Class4_Sub25 local22 = (Class4_Sub25) this.aClass163_3.method4188((long) arg0);
			return local22 == null ? this.anInt385 : local22.anInt3892;
		}
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(Z)V")
	private void method304() {
		this.aClass163_2 = new Class163(this.aClass163_3.method4189());
		for (@Pc(24) Class4_Sub17 local24 = (Class4_Sub17) this.aClass163_3.method4192(); local24 != null; local24 = (Class4_Sub17) this.aClass163_3.method4183()) {
			@Pc(35) Class4_Sub11 local35 = new Class4_Sub11(local24.aString77, (int) local24.aLong211);
			this.aClass163_2.method4181(Static298.method4216(local24.aString77), local35);
		}
	}

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(Z)V")
	private void method305() {
		this.aClass163_2 = new Class163(this.aClass163_3.method4189());
		for (@Pc(16) Class4_Sub25 local16 = (Class4_Sub25) this.aClass163_3.method4192(); local16 != null; local16 = (Class4_Sub25) this.aClass163_3.method4183()) {
			@Pc(25) Class4_Sub25 local25 = new Class4_Sub25((int) local16.aLong211);
			this.aClass163_2.method4181((long) local16.anInt3892, local25);
		}
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)Ljava/lang/String;")
	public String method307(@OriginalArg(1) int arg0) {
		if (this.aClass163_3 == null) {
			return this.aString18;
		} else {
			@Pc(26) Class4_Sub17 local26 = (Class4_Sub17) this.aClass163_3.method4188((long) arg0);
			return local26 == null ? this.aString18 : local26.aString77;
		}
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(II)Z")
	public boolean method309(@OriginalArg(0) int arg0) {
		if (this.aClass163_3 == null) {
			return false;
		}
		if (this.aClass163_2 == null) {
			this.method305();
		}
		@Pc(23) Class4_Sub25 local23 = (Class4_Sub25) this.aClass163_2.method4188((long) arg0);
		return local23 != null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method310(@OriginalArg(0) String arg0) {
		if (this.aClass163_3 == null) {
			return false;
		}
		if (this.aClass163_2 == null) {
			this.method304();
		}
		for (@Pc(34) Class4_Sub11 local34 = (Class4_Sub11) this.aClass163_2.method4188(Static298.method4216(arg0)); local34 != null; local34 = (Class4_Sub11) this.aClass163_2.method4182()) {
			if (local34.aString45.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!pi;)V")
	public void method312(@OriginalArg(1) Class4_Sub24 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3110();
			if (local5 == 0) {
				return;
			}
			this.method313(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!pi;B)V")
	private void method313(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub24 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static131.method1213(arg1.method3069());
		} else if (arg0 == 2) {
			this.aChar1 = Static131.method1213(arg1.method3069());
		} else if (arg0 == 3) {
			this.aString18 = arg1.method3111();
		} else if (arg0 == 4) {
			this.anInt385 = arg1.method3084();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(54) int local54 = arg1.method3085();
			this.aClass163_3 = new Class163(Static308.method4715(local54));
			for (@Pc(64) int local64 = 0; local64 < local54; local64++) {
				@Pc(71) int local71 = arg1.method3084();
				@Pc(83) Class4 local83;
				if (arg0 == 5) {
					local83 = new Class4_Sub17(arg1.method3111());
				} else {
					local83 = new Class4_Sub25(arg1.method3084());
				}
				this.aClass163_3.method4181((long) local71, local83);
			}
		}
	}
}
